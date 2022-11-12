package com.codingDojo.ProjectManager.controller;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingDojo.ProjectManager.models.LoginUser;
import com.codingDojo.ProjectManager.models.Project;
import com.codingDojo.ProjectManager.models.User;
import com.codingDojo.ProjectManager.services.UserProjServices;

@Controller
public class ProjectController {
	 @Autowired
	    private UserProjServices userServ;
	    
	    @GetMapping("/")
	    public String index(Model model) {
	        model.addAttribute("newUser", new User());
	        model.addAttribute("newLogin", new LoginUser());
	        return "index.jsp";
	    }
	    
	    @PostMapping("/register")
	    public String register(@Valid @ModelAttribute("newUser") User newUser, 
	            BindingResult result, Model model, HttpSession session) {
	        userServ.register(newUser, result);
	        if(result.hasErrors()) {
//	        	to add NewLogin for the second form in our jsp file , so there is no errors show . 
	            model.addAttribute("newLogin", new LoginUser()); 
	            return "index.jsp";
	        }
	        session.setAttribute("user_id", newUser.getId());
	        return "redirect:/home";
	    }
	    
	    @PostMapping("/login")
	    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
	            BindingResult result, Model model, HttpSession session) {
	        User user = userServ.login(newLogin, result);
	        if(result.hasErrors()) {
	            model.addAttribute("newUser", new User());
	            return "index.jsp";
	        }
	        session.setAttribute("user_id", user.getId());
	        return "redirect:/home";
	    }
	    @GetMapping("/logout")
	    public String logout(HttpSession session) { 
	            session.invalidate();
	            return "redirect:/";

	    }
	    @GetMapping("/home")
	    public String home(Model model, HttpSession session) {
	        if (session.getAttribute("user_id") != null) {
	        Long user_id = (Long) session.getAttribute("user_id");
	        User thisUser = userServ.findUserById(user_id);
	        model.addAttribute("thisUser", thisUser);
	        model.addAttribute("AllProjectsNotJoin" ,userServ.notAllProjects(thisUser));
	        model.addAttribute("AllProjectsThatAreJoin" , userServ.getJoinsProject(thisUser));
	        return "home.jsp";
	    }
	        else {
	            return "redirect:/";
	        }
	    }
	    @GetMapping("new/project")
	    public String newProject( @ModelAttribute("project") Project project  , BindingResult result ,Model model) {
	    	return "newP.jsp";
	    }
	    @PostMapping("/createProject")
		 public String create (@Valid @ModelAttribute("project") Project project  , BindingResult result ,Model model ,  HttpSession session) {
		 	  if (result.hasErrors()) {
		           return "newP.jsp";
		       } else {
		    	   userServ.createProject(project);
		    	   Long user_id = (Long) session.getAttribute("user_id");
		           User thisUser = userServ.findUserById(user_id);
		           project.setUserLead(thisUser);
		           (thisUser.getProjects()).add(project);
		           userServ.updateProject(project);		        
		           userServ.updateUser(thisUser);		  		           		    
		           return "redirect:/home";
		       }
	}

	    @RequestMapping("/projects/{id}")
	    public String showProject(Model model , @PathVariable("id") Long id , HttpSession session) {
	    	Project thisProject = userServ.findProject(id);
	    	model.addAttribute("thisProject" ,thisProject );
	    	Long user_id = (Long) session.getAttribute("user_id");
	        User thisUser = userServ.findUserById(user_id);
	        model.addAttribute("thisUser" , thisUser);
	    	return "Show.jsp";
	    	
	    }
	    @GetMapping("/editPage/{id}")
	    public String EditPage(@ModelAttribute("project") Project project  , BindingResult result ,Model model , @PathVariable("id") Long id , HttpSession session) {
	    	Project thisProject = userServ.findProject(id);
	    	model.addAttribute("thisProject" ,thisProject );
	    	return "edit.jsp" ;
	    }
	    @PostMapping("/updateProject/{id}")
	    public String UpdateProject(@Valid @ModelAttribute("project") Project project,BindingResult result,Model model ,@PathVariable("id") Long id , HttpSession session) {
	    	  if (result.hasErrors()) {
	    		  Project thisProject = userServ.findProject(id);
	  	    		model.addAttribute("thisProject" ,thisProject );
		           return "edit.jsp";
		       } else {
	 	   Long user_id = (Long) session.getAttribute("user_id");
           User thisUser = userServ.findUserById(user_id);
           project.setUserLead(thisUser);
           (thisUser.getProjects()).add(project);
           userServ.updateProject(project);		        
           userServ.updateUser(thisUser);	
	    	return "redirect:/home";
	    }
	    	  
	    }
	    
	    @GetMapping("/JoinTeam/{id}")
	    public String joinTeam(Model model ,@PathVariable("id") Long id , HttpSession session) {
	    	Long user_id = (Long) session.getAttribute("user_id");
	       User thisUser = userServ.findUserById(user_id);
	    	Project thisProject = userServ.findProject(id);
	    	List <User> usersInThisProject = thisProject.getUsers();   
	    	usersInThisProject.add(thisUser);
	    	userServ.updateProject(thisProject);
	    	userServ.updateUser(thisUser);	 
	    	return "redirect:/home";
	    	
	    }
	    @GetMapping("/LeaveTeam/{id}")
	    public String leaveTeam(Model model ,@PathVariable("id") Long id , HttpSession session) {
	    	Long user_id = (Long) session.getAttribute("user_id");
	       User thisUser = userServ.findUserById(user_id);
	    	Project thisProject = userServ.findProject(id);
	    	List <User> usersInThisProject = thisProject.getUsers();   
	    	usersInThisProject.remove(thisUser);
	    	userServ.updateProject(thisProject);
	    	userServ.updateUser(thisUser);	 
	    	return "redirect:/home";	    
}
}

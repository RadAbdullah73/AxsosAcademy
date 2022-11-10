package com.codingdojo.LogAndReg.controller;
import java.util.List;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.LogAndReg.models.Book;
import com.codingdojo.LogAndReg.models.LoginUser;
import com.codingdojo.LogAndReg.models.User;
import com.codingdojo.LogAndReg.repositores.UserRepository;
import com.codingdojo.LogAndReg.services.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

    
@Controller
public class LogController {
    
    @Autowired
    private UserService userServ;
    
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
//        	to add NewLogin for the second form in our jsp file , so there is no errors show . 
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
        model.addAttribute("AllBooks" ,userServ.allBooks());
        return "home.jsp";
    }
        else {
            return "redirect:/";
        }
    }
    @GetMapping("/books/new")
    public String BookCreation (@Valid @ModelAttribute("book") Book book  , BindingResult result ,Model model) {
    	return "newBook.jsp" ;
    }
    @PostMapping("/createBook")
	 public String create (@Valid @ModelAttribute("book") Book book  , BindingResult result ,Model model ,  HttpSession session) {
	 	  if (result.hasErrors()) {
	           return "newBook.jsp";
	       } else {
	    	   userServ.createBook(book);
	    	   Long user_id = (Long) session.getAttribute("user_id");
	           User thisUser = userServ.findUserById(user_id);
	           List<Book> Books = thisUser.getBooks();
	           book.setUser(thisUser);
	           userServ.updateBook(book);
	           return "redirect:/home";
	       }
	 	  

}
    @GetMapping("/books/{id}")
	public String ShowBook(Model model , @PathVariable("id") Long id , HttpSession session) {
    	Book thisBook = userServ.findBook(id);
    	model.addAttribute("thisBook" ,thisBook );
    	Long user_id = (Long) session.getAttribute("user_id");
        User thisUser = userServ.findUserById(user_id);
        model.addAttribute("thisUser" , thisUser);
        System.out.println(thisUser.getUserName());
        System.out.println((thisBook.getUser()).getUserName());
    	return "Show.jsp";
		
	}
    @GetMapping("/delete/{id}")
    public String DeleteBook (Model model ,@PathVariable("id") Long id , HttpSession session ) {
    	userServ.deleteBook(id);
    	return "redirect:/home";
    }
    @GetMapping("/editPage/{id}")
    public String UpdateBook (@Valid @ModelAttribute("book") Book book,BindingResult result, Model model ,@PathVariable("id") Long id , HttpSession session ) {
    	model.addAttribute("thisBook" ,userServ.findBook(id));
    	return "edit.jsp" ;
    
    }
    @PostMapping("/updateBook/{id}")
    public String updateBook(@Valid @ModelAttribute("book") Book book,BindingResult result,Model model ,@PathVariable("id") Long id , HttpSession session) {
    	Book thisBook = userServ.findBook(id);
    	Long user_id = (Long) session.getAttribute("user_id");
        User thisUser = userServ.findUserById(user_id);
        List<Book> Books = thisUser.getBooks();
        book.setUser(thisUser);
    	userServ.updateBook(book);
    	return "redirect:/home";
    }
    @GetMapping("/BookMarket")
    public String BookMarket(Model model , HttpSession session) {
            Long user_id = (Long) session.getAttribute("user_id");
            User thisUser = userServ.findUserById(user_id);
            model.addAttribute("thisUser", thisUser);
            model.addAttribute("AllBooks" ,userServ.allBooks());
            return "Market.jsp";
    }
    @GetMapping("boroow/{id}")
    public String BorrowBook(Model model , HttpSession session , @PathVariable("id") Long id) {
    	Long user_id = (Long) session.getAttribute("user_id");
        User thisUser = userServ.findUserById(user_id);
    	Book thisBook = userServ.findBook(id);
    	List <Book> userBook = thisUser.getBorrowedbooks();
    	userBook.add(thisBook);
    	thisBook.setUserborrowed(thisUser);
    	thisBook.setBorrow(true);
    	userServ.updateBook(thisBook);
    	userServ.updateUser(thisUser);
    	 model.addAttribute("thisUser", thisUser);
         model.addAttribute("AllBooks" ,userServ.allBooks());
    	return "redirect:/BookMarket";
    }
    @GetMapping("return/{id}")
    public String ReturnBook(Model model , HttpSession session , @PathVariable("id") Long id) {
    	Book thisBook = userServ.findBook(id);
    	Long user_id = (Long) session.getAttribute("user_id");
        User thisUser = userServ.findUserById(user_id);
    	thisBook.setBorrow(false);
    	List <Book> userBook = thisUser.getBorrowedbooks();
    	userBook.remove(thisBook);
    	thisBook.setUserborrowed(null);
    	userServ.updateBook(thisBook);
    	userServ.updateUser(thisUser);
    	 model.addAttribute("thisUser", thisUser);
         model.addAttribute("AllBooks" ,userServ.allBooks());
    	return "redirect:/BookMarket";
    }
}
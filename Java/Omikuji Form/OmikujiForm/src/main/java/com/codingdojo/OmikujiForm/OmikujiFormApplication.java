package com.codingdojo.OmikujiForm;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class OmikujiFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmikujiFormApplication.class, args);
	}
	@GetMapping("/")
	public String main() {
		return "index.jsp" ;
	}
	@PostMapping("/login")
	public String form(@RequestParam(value="number") String number,@RequestParam(value="city") String city 
			, @RequestParam(value="name") String name , @RequestParam(value="hobby") String hobby ,
			 @RequestParam(value="living") String living ,@RequestParam(value="nice") String nice , HttpSession session )
	{
		session.setAttribute("number" , number);
		session.setAttribute("city" , city);
		session.setAttribute("name" , name);
		session.setAttribute("hobby" , hobby);
		session.setAttribute("living" , living);
		session.setAttribute("nice" , nice);
		
		
		return "redirect:/show";
		
	}
	@RequestMapping("/show")
	public String show() {
		return "index2.jsp";
	}
	
	

}

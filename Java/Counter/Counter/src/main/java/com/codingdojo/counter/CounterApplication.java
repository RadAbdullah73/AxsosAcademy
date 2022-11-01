package com.codingdojo.counter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;

@SpringBootApplication
@Controller
public class CounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounterApplication.class, args);
	}
	@RequestMapping("/")
	public String index(HttpSession session) {
		session.setAttribute("count", 0);
		return "index.jsp" ;
		
	}
	@RequestMapping("/counter")
	public String index1(HttpSession session , Model model) {
		if (session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
		}
		else {
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount ++ ;
			session.setAttribute("count", currentCount);
			
		}
		model.addAttribute("Counter",session.getAttribute("count"));
		
		return "index2.jsp";
	}
	


	

}

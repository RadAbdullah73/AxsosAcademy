package com.codingdojo.NinjaGold;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Date ;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

@SpringBootApplication
@Controller
public class NinjaGoldApplication {

	public static void main(String[] args) {
		SpringApplication.run(NinjaGoldApplication.class, args);
	}
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("gold")==null) {
			session.setAttribute("gold", 0);
			session.setAttribute("arr" , new ArrayList<String>());
		}
		return "index.jsp" ;
	}
	@PostMapping("/increasegolds")
	public String Increasing(HttpSession session , @RequestParam(value="which_form")String type ) {
		DateFormat dateFormat = new SimpleDateFormat("'(' 'at' dd 'of' MMMM yyyy hh:mm:ss a ')' ");
		Date date = new Date();
    	String time = dateFormat.format(date);
    	session.setAttribute("date", time);
		ArrayList <String> Act =  (ArrayList<String>)session.getAttribute("arr");
		if(type.equals("Quest")) {
			String[] op = {"+" , "-"};
			int rndOperation = new Random().nextInt(op.length);
			String Operation = op[rndOperation];
			Random rand = new Random();
			int upperbound = 51;
			int int_random = rand.nextInt(upperbound);
			Integer Gold = (Integer) session.getAttribute("gold");
			if (Operation=="+") {
				Act.add(0,"You Entered a Quest and Earned " + int_random + "  " +  session.getAttribute("date"));
				Gold += int_random ;
				session.setAttribute("gold", Gold);
				session.setAttribute("Act", Act);
				return "redirect:/";
			}
			else {
				Act.add(0,"You Entered a Quest and lose " + int_random + "  " +  session.getAttribute("date"));
				Gold -= int_random ;
				session.setAttribute("gold", Gold);
				session.setAttribute("Act", Act);
				return "redirect:/";
			}	
		}
		else {
			Random rand = new Random();
			int upperbound = 11;
			int int_random = rand.nextInt(upperbound)+10;
			Integer Gold = (Integer) session.getAttribute("gold");
			Gold += int_random ;
			session.setAttribute("gold", Gold);
			if(type.equals("Farm")) {
				Act.add(0,"You Entered a Farm and Earned " + int_random + "  " +  session.getAttribute("date"));
			}
			if(type.equals("Cave")) {
				Act.add(0,"You Entered a Cave and Earned " + int_random + "  " +  session.getAttribute("date"));
			}
			if(type.equals("House")) {
				Act.add(0,"You Entered a House and Earned " + int_random + "  " + session.getAttribute("date") );
			}
			session.setAttribute("Act", Act);
			
	
		return "redirect:/" ;
		}
		
	}

}

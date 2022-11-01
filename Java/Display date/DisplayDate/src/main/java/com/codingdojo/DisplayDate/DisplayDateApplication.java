package com.codingdojo.DisplayDate;

import org.springframework.boot.SpringApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date ;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class DisplayDateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayDateApplication.class, args);
	}
    @RequestMapping("/")
    public String index(Model model) {

        return "index.jsp";
    }
    @RequestMapping("date/")
    public String index2(Model model) {
    	DateFormat dateFormat = new SimpleDateFormat("EEEE, 'The ' dd 'of' MMMM yyyy ");
    	Date date = new Date();
    	model.addAttribute("date" , dateFormat.format(date));
        return "index2.jsp";
    }
  
    @RequestMapping("time/")
    public String index3(Model model) {
    	DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
    	Date date = new Date();
    	model.addAttribute("date" , dateFormat.format(date));
        return "index3.jsp";
    }
  
  
    

}

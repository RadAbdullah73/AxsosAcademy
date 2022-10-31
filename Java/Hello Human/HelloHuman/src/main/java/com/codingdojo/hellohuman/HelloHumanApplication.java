package com.codingdojo.hellohuman;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class HelloHumanApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
//	@RequestMapping("/")
//	public String index1() {
//		return "Please enter you first & last name" ;
//	}
	
	@RequestMapping("/")
	public String index(@RequestParam(value="name" , required=false) String searchQuery , @RequestParam(value="last_name" , required=false) String searchQuery1,@RequestParam(value="times" , required=false) Integer searchQuery2){
		if (searchQuery == null & searchQuery1==null) {
			return "Please Enter your first name & last name" ;
		}
		else if (searchQuery1 ==null ) {
			return "Please Enter your last name " ;
		}
		else if ((searchQuery !=null & searchQuery1!=null) & searchQuery == null) {
			return "Hello " + searchQuery + " " + searchQuery1 ;
		}
		else {
		String x = "" ; 
		for (int i = 0 ; i<=searchQuery2 ; i++) {
			x+="Hello " + searchQuery +" " + searchQuery1 + " __ ";
		}
        return x ;}
		
		
		
		
    }

}

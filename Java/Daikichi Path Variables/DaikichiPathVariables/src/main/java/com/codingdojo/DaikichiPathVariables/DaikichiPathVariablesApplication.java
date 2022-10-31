package com.codingdojo.DaikichiPathVariables;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
@RequestMapping("/Daikichi")
public class DaikichiPathVariablesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiPathVariablesApplication.class, args);
			
		}@RequestMapping("/travel/{city}")
		public String clasDaikichiPathVariables(@PathVariable("city") String city) {
			return "Congratulations! You will soon travel to " + city ;}
		@RequestMapping("/lotto/{times}")
		public String clasDaikichiPathVariables1(@PathVariable("times") Integer times ) {
			if (times %2 ==0 ) {
				return "You will take a grand journey in the near future , but be wary of tempting offers" ;}
			else {
					return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends" ;
				}

			}

		
}
				
	



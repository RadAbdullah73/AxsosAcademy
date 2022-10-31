package com.codingdojo.daikichidoutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DaikichiRoutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiRoutesApplication.class, args);
	}
	@RequestMapping("/daikichi")
	public String index() {
		return "Welcome" ;
	}
	@RequestMapping("/daikichi/today")
	public String index1() {
		return "Today you will find luck in our endeavors!" ;
	}
	@RequestMapping("/daikichi/tomorrow")
	public String index2() {
		return "Tomorrow , an opportunity will arise , so be sure to be open to new ideas" ;
	}

}

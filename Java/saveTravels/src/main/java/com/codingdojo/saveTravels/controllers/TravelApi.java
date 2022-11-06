package com.codingdojo.saveTravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.saveTravels.models.Travels;
import com.codingdojo.saveTravels.services.TravelService;
@Controller
public class TravelApi {
	 private final TravelService travelService;
	 public TravelApi(TravelService travelService){
	     this.travelService = travelService;
	 }
	 
	 
@GetMapping("/")
public String index ( @ModelAttribute("travel") Travels travel ,Model model) {
	List<Travels> travels = travelService.allTravels();
	model.addAttribute("all" , travels);
	return "index.jsp" ;
}
@PostMapping("/travels")
public String create (@Valid @ModelAttribute("travel") Travels travel  , BindingResult result ,Model model) {
	  if (result.hasErrors()) {
		  List<Travels> travels = travelService.allTravels();
		  model.addAttribute("all" , travels);
          return "index.jsp";
      } else {
    	  travelService.createTravel(travel);
          return "redirect:/";
      }
}


}

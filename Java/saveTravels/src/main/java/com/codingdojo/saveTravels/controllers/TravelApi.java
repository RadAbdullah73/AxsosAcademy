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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
@RequestMapping("/edit/{id}")
public String show(@PathVariable("id") Long id , Model model , @ModelAttribute("travel1") Travels travel1) {
	Travels tr = travelService.findTravel(id);
	model.addAttribute("thisTravel" , tr);
	return "edit.jsp";
}
@PutMapping("/update/{id}")
public String update(@Valid @ModelAttribute("travel1") Travels travel1 , BindingResult result, @PathVariable("id") Long id ,Model model) {
	  if (result.hasErrors()) {
		  Travels tr = travelService.findTravel(id);
    	  model.addAttribute("thisTravel" , tr);
		 
          return "edit.jsp";
      } else {
    	 
          travelService.updateTr(travel1);
          return "redirect:/";
      }
	
	
}





}

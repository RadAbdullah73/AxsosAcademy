package com.codingdojo.languages.controller;
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
import com.codingdojo.languages.models.Languages;
import com.codingdojo.languages.services.LanguageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class LanguagesController {
	private final LanguageService languageService;
	 public LanguagesController(LanguageService languageService){
	     this.languageService = languageService;
	 }
	 @GetMapping("/languages")
	 public String index (@ModelAttribute("language") Languages language ,Model model) {
	 	List<Languages> language1 = languageService.allLanguages();
	 	model.addAttribute("all" , language1);
	 	return "index.jsp" ;
	 }
	 @PostMapping("/createLang")
	 public String create (@Valid @ModelAttribute("language") Languages language  , BindingResult result ,Model model) {
	 	  if (result.hasErrors()) {
	 		  List<Languages> language1 = languageService.allLanguages();
	 		  model.addAttribute("all" , language1);
	           return "index.jsp";
	       } else {
	    	   languageService.createLanguage(language);
	           return "redirect:/languages";
	       }
	 }
	 @RequestMapping("show/{id}")
	 public String ShowTravel(@PathVariable("id") Long id ,Model model) {
		 Languages tr = languageService.findLanguage(id);
	 	model.addAttribute("ShowThis" , tr);
	 	return "show.jsp" ; 
	 	
	 }
	 @RequestMapping("delete/{id}")
	 public String del (@PathVariable("id") Long id) {
		 languageService.deleteLanguage(id) ;
	 	return "redirect:/languages";
	 	
	 }
	 @RequestMapping("/edit/{id}")
	 public String show(@Valid @PathVariable("id") Long id ,@ModelAttribute("language") Languages travel1 , BindingResult result ,  Model model ) {
		 Languages lang = languageService.findLanguage(id);
	 	model.addAttribute("thisLan" , lang);
	 	return "edit.jsp";
	 }
	 @PutMapping("/updateLang/{id}")
	 public String update(@Valid @ModelAttribute("language") Languages lan, BindingResult result , @PathVariable("id") Long id ,Model model) {
	 	  if (result.hasErrors()) {
	 		 Languages lang = languageService.findLanguage(id);
	 			model.addAttribute("thisLan" , lang);
	           return "edit.jsp";
	       } else {
	     	 
	    	   languageService.updateLanguage(lan);
	           return "redirect:/languages";
	       }

	 }}

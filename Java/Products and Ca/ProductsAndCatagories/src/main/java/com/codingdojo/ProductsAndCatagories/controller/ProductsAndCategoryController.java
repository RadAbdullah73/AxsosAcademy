package com.codingdojo.ProductsAndCatagories.controller;
import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.ProductsAndCatagories.models.Category;
import com.codingdojo.ProductsAndCatagories.models.Product;
import com.codingdojo.ProductsAndCatagories.services.CpService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class ProductsAndCategoryController {
	private final CpService dnService;
	
	public ProductsAndCategoryController(CpService dnService){
	     this.dnService = dnService;
	 }
	
	@GetMapping("/")
	 public String index (Model model) {
		model.addAttribute("AllProducts" , dnService.allProducts());
		model.addAttribute("AllCatog" , dnService.allCatogories());
	 	return "index.jsp" ;
	}
	@RequestMapping("/products/new")
	public String Prd(@Valid @ModelAttribute("prod") Product prod  , BindingResult result ,Model model) {
		return "NewPrd.jsp" ;
	}
	 @PostMapping("/createProducte")
	 public String Prdcreate (@Valid @ModelAttribute("prod") Product prod  , BindingResult result ,Model model) {
	 	  if (result.hasErrors()) {
	           return "NewPrd.jsp";
	       } else {
	    	   dnService.createProduct(prod);
	           return "redirect:/";
	       }
	 }
	 @RequestMapping("/catogeries/new")
		public String Cat(@Valid @ModelAttribute("cat") Product cat  , BindingResult result ,Model model) {
			return "NewCat.jsp" ;
		}
		 @PostMapping("/createCategory")
		 public String Catcreate (@Valid @ModelAttribute("cat") Category cat  , BindingResult result ,Model model) {
		 	  if (result.hasErrors()) {
		           return "NewCat.jsp";
		       } else {
		    	   dnService.createCategory(cat);
		           return "redirect:/";
		       }
		 }
		 @RequestMapping("/products/{id}")
		 public String ShowPrd(Model model , @PathVariable("id") Long id ) {
			 model.addAttribute("thisPrd",dnService.findProduct(id));
			 model.addAttribute("allCat" , dnService.notAllCats(dnService.findProduct(id)));
			 return "ShowPrd.jsp" ;
			 
		 }
		 @PostMapping("/AddCat/{id}")
		 public String AddCat(Model model , @PathVariable("id") Long id , @RequestParam("catagory")  Long id1) {
			 Product thisprd = dnService.findProduct(id) ;
			 Category thisCat = dnService.findCategory(id1);
			 List<Category> cat = thisprd.getCategories();
			 cat.add(thisCat);
			 dnService.updateProduct(thisprd);
			  return "redirect:/products/{id}";
			 
		 }
		 @RequestMapping("/catogeries/{id}")
		 public String ShowCat(Model model , @PathVariable("id") Long id ) {
			 model.addAttribute("thisCat",dnService.findCategory(id));
			 model.addAttribute("allProd" , dnService.notAllProducts(dnService.findCategory(id)));
			 return "ShowCat.jsp" ;
			 
		 }
		 @PostMapping("/AddPrd/{id}")
		 public String AddPrd(Model model ,  @PathVariable("id") Long id , @RequestParam("product")  Long id1 ) {
			 Category thisCat = dnService.findCategory(id) ;
			 Product thisprd = dnService.findProduct(id1) ;
			 List<Product> prd = thisCat.getProducts();
			 prd.add(thisprd);
			 dnService.updateCategory(thisCat);
			  return "redirect:/catogeries/{id}";
			 
		 }
		
		 
		
		 
		 
		 
		 
	 
}


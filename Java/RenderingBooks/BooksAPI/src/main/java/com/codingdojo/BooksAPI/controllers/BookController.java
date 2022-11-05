package com.codingdojo.BooksAPI.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.codingdojo.BooksAPI.models.Book;
import com.codingdojo.BooksAPI.services.BookService;

@Controller
public class BookController {
	 private final BookService bookService;
	 public BookController(BookService bookService){
	     this.bookService = bookService;
	 }
	 
	@RequestMapping("books/{id}")
	public String indexs(@PathVariable("id") Long id ,Model model) {
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		return "show.jsp" ;
		
	}
	  @RequestMapping("/books")
	    public String index(Model model) {
	        List<Book> books = bookService.allBooks();
	        model.addAttribute("books", books);
	        return "index.jsp";
	    }
	
	


}

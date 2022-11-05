package com.codingdojo.BooksAPI.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//...
import org.springframework.stereotype.Service;

import com.codingdojo.BooksAPI.models.Book;
import com.codingdojo.BooksAPI.repositories.BookRepository;

@Service
public class BookService {
 // adding the book repository as a dependency
	private final BookRepository bookRepository;
 
 public BookService(BookRepository bookRepository) {
     this.bookRepository = bookRepository;
 }
 // returns all the books
 public List<Book> allBooks() {
     return bookRepository.findAll();
 }
 // creates a book
 public Book createBook(Book b) {
     return bookRepository.save(b);
 }
 public void deleteBook (Long id) {
	bookRepository.deleteById(id);
 }
 public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
	 Optional<Book> Book1 = bookRepository.findById(id);
	 if(Book1.isPresent()) {
	 Book1.get().setTitle(title);
	 Book1.get().setDescription(desc);
	 Book1.get().setLanguage(lang);
	 Book1.get().setNumberOfPages(numOfPages);
	 bookRepository.save(Book1.get());
	 return Book1.get() ;
	 }
	 else {
		 return null ;
	 }
	 
 }
 // retrieves a book
 public Book findBook(Long id) {
     Optional<Book> optionalBook = bookRepository.findById(id);
     if(optionalBook.isPresent()) {
         return optionalBook.get();
     } else {
         return null;
     }
 }
 
}


package com.codingdojo.LogAndReg.services;

import java.util.List;
import java.util.Optional;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.LogAndReg.models.Book;
import com.codingdojo.LogAndReg.models.LoginUser;
import com.codingdojo.LogAndReg.models.User;
import com.codingdojo.LogAndReg.repositores.BookRepository;
import com.codingdojo.LogAndReg.repositores.UserRepository;

    
@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;
    private BookRepository bookRepository;
    
    public UserService(UserRepository userRepo , BookRepository bookRepository ) {
	     this.userRepo = userRepo;
	     this.bookRepository = bookRepository;
	 }
    
    public User register(User newUser, BindingResult result) {
        if(userRepo.findByEmail(newUser.getEmail()).isPresent()) {
            result.rejectValue("email", "Unique", "This email is already in use!");
        }
        if(!newUser.getPassword().equals(newUser.getConfirm())) {
            result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
        }
        if(result.hasErrors()) {
            return null;
        } else {
            String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
            newUser.setPassword(hashed);
            return userRepo.save(newUser);
        }
    }
    
    public User login(LoginUser newLogin, BindingResult result) {
        if(result.hasErrors()) {
            return null;
        }
        Optional<User> potentialUser = userRepo.findByEmail(newLogin.getEmail());
        if(!potentialUser.isPresent()) {
            result.rejectValue("email", "Unique", "Invalid Password or Email !");
            return null;
        }
        User user = potentialUser.get();
        if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
            result.rejectValue("password", "Matches", "Invalid Password or Email !");
        }
        if(result.hasErrors()) {
            return null;
        } else {
            return user;
        }
    }
    public User findUserById(Long id) {
        Optional<User> u = userRepo.findById(id);

        if(u.isPresent()) {
            return u.get();
            } else {
            return null;
        }
    }
	 public List<Book> allBooks() {
	     return bookRepository.findAll();
	 }
	 public Book createBook(Book b) {
	     return bookRepository.save(b);
	 }
	 public User updateUser(User b) {
	     return userRepo.save(b) ;
	 }
	 public Book updateBook(Book b) {
	     return bookRepository.save(b) ;
	 }
	 public Book findBook(Long id) {
	     Optional<Book> optionaBook = bookRepository.findById(id);
	     if(optionaBook.isPresent()) {
	         return optionaBook.get();
	     } else {
	         return null;
	     }
	 }
	 public void deleteBook (Long id) {
		 bookRepository.deleteById(id);
	 }
    
}
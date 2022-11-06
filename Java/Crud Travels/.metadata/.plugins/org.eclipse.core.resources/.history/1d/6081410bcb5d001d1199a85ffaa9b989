package com.codingdojo.saveTravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.codingdojo.saveTravels.models.Travels;



public interface  TravelRepository extends CrudRepository<Travels, Long> {
	// this method retrieves all the books from the database
    List<Travels> findAll();
    // this method finds books with descriptions containing the search string
    // this method counts how many titles contain a certain string
    // this method deletes a book that starts with a specific title
    void deleteById(Long id);
	

}

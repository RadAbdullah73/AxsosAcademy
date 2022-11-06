package com.codingdojo.languages.repositories;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.codingdojo.languages.models.Languages;


public interface LanguagesRepository extends CrudRepository<Languages, Long> {
	// this method retrieves all the books from the database
    List<Languages> findAll();
    // this method finds books with descriptions containing the search string
    // this method counts how many titles contain a certain string
    // this method deletes a book that starts with a specific title
    void deleteById(Long id);

}

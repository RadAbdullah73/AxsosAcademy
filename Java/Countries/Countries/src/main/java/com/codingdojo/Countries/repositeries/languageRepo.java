package com.codingdojo.Countries.repositeries;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.Countries.models.Cities;
import com.codingdojo.Countries.models.Countries;
import com.codingdojo.Countries.models.Language;

@Repository
public interface languageRepo extends CrudRepository<Language, Long> {
	List <Language> findAll();

}

package com.codingdojo.languages.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.languages.models.Languages;
import com.codingdojo.languages.repositories.LanguagesRepository;
@Service
public class LanguageService {
	private final LanguagesRepository languageRepository;
		 public LanguageService(LanguagesRepository languageRepository) {
		     this.languageRepository = languageRepository;
		 }
		 public List<Languages> allLanguages() {
		     return languageRepository.findAll();
		 }
		 public Languages createLanguage(Languages b) {
		     return languageRepository.save(b);
		 }
		 public void deleteLanguage (Long id) {
			 languageRepository.deleteById(id);
		 }
		 public Languages updateLanguage(Languages b) {
		     return languageRepository.save(b) ;
		 }
		 public Languages findLanguage(Long id) {
		     Optional<Languages> optionalLanguage = languageRepository.findById(id);
		     if(optionalLanguage.isPresent()) {
		         return optionalLanguage.get();
		     } else {
		         return null;
		     }
		 }

}

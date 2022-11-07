package com.codingdojo.DojoNinjas.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.DojoNinjas.models.Dojo;
import com.codingdojo.DojoNinjas.models.Ninja;
import com.codingdojo.DojoNinjas.repositories.DojoRepository;
import com.codingdojo.DojoNinjas.repositories.NinjaRepository;

@Service
public class DnService {
	private final DojoRepository dojoRepository;
	private final NinjaRepository ninjaRepository;
	public DnService(DojoRepository dojoRepository , NinjaRepository ninjaRepository ) {
	     this.dojoRepository = dojoRepository;
	     this.ninjaRepository = ninjaRepository;
	 }
	 public List<Dojo> allDojo() {
	     return dojoRepository.findAll();
	 }
	 public Dojo createDojo(Dojo b) {
	     return dojoRepository.save(b);
	 }
	 public void deleteDojo (Long id) {
		 dojoRepository.deleteById(id);
	 }
	 public Dojo updateDojo(Dojo b) {
	     return dojoRepository.save(b) ;
	 }
	 public Dojo findDojo(Long id) {
	     Optional<Dojo> optionalLanguage = dojoRepository.findById(id);
	     if(optionalLanguage.isPresent()) {
	         return optionalLanguage.get();
	     } else {
	         return null;
	     }
	 }
//	 -----------------------------
	 public List<Ninja> allNinja() {
	     return ninjaRepository.findAll();
	 }
	 public Ninja createNinja(Ninja b) {
	     return ninjaRepository.save(b);
	 }
	 public void deleteNinja (Long id) {
		 ninjaRepository.deleteById(id);
	 }
	 public Ninja updateNinja(Ninja b) {
	     return ninjaRepository.save(b) ;
	 }
	 public Ninja findNinja(Long id) {
	     Optional<Ninja> optionalLanguage = ninjaRepository.findById(id);
	     if(optionalLanguage.isPresent()) {
	         return optionalLanguage.get();
	     } else {
	         return null;
	     }
	 }
	
}

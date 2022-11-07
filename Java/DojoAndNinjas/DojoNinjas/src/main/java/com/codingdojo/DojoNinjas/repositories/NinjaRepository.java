package com.codingdojo.DojoNinjas.repositories;

import org.springframework.data.repository.CrudRepository;
import com.codingdojo.DojoNinjas.models.Ninja;
import java.util.List;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	List <Ninja> findAll();
	
	

}

package com.codingdojo.DojoNinjas.repositories;
import org.springframework.data.repository.CrudRepository;
import com.codingdojo.DojoNinjas.models.Dojo;
import com.codingdojo.DojoNinjas.models.Ninja;

import java.util.List;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
	List <Dojo> findAll();
}

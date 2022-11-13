package com.codingdojo.Countries.repositeries;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.Countries.models.Cities;

@Repository
public interface CitiesRepo extends CrudRepository<Cities, Long> {
	List <Cities> findAll();
	
}

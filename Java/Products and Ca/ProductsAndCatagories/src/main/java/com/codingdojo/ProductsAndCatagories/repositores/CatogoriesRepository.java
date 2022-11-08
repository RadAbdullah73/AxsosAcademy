package com.codingdojo.ProductsAndCatagories.repositores;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.codingdojo.ProductsAndCatagories.models.Category;
import com.codingdojo.ProductsAndCatagories.models.Product;

public interface CatogoriesRepository extends CrudRepository<Category, Long> {
	List <Category> findAll();
	public List<Category> findByProductsNotContains(Product product);

}

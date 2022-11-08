package com.codingdojo.ProductsAndCatagories.repositores;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.codingdojo.ProductsAndCatagories.models.Category;
import com.codingdojo.ProductsAndCatagories.models.Product;

public interface ProductsRepository extends CrudRepository<Product, Long> {
	List <Product> findAll();
	public List <Product> findByCategoriesNotContains(Category category);

}

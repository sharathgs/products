package com.hcl.product.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.product.model.CategoryCount;

@Repository
public interface CategoryCountRepository extends JpaRepository<CategoryCount, Integer> {

	public Optional<CategoryCount> findByUsernameAndCategory(String username, String category);
	
	public List findAllByUsername(String username);
	
	@Query(value ="select sum(category_count_by_user_name) from products.categorycount", nativeQuery =  true)
	public int findByCountCategory();
	
}

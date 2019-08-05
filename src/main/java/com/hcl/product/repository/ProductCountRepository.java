package com.hcl.product.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.product.model.ProductCount;

@Repository
public interface ProductCountRepository extends JpaRepository<ProductCount, Integer> {
	
	public Optional<ProductCount> findByuserNameAndProductName(String userName, String productName);
	
	public List findAllByUserName(String username);
	
	@Query(value = "Select sum(product_count_by_user) from products.productcount",nativeQuery = true)
	public int findByCountProducts();
	
}

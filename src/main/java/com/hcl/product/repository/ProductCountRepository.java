package com.hcl.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.product.model.ProductCount;

@Repository
public interface ProductCountRepository extends JpaRepository<ProductCount, Integer> {

}

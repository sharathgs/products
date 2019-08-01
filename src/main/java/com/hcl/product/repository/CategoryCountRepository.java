package com.hcl.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.product.model.CategoryCount;

@Repository
public interface CategoryCountRepository extends JpaRepository<CategoryCount, Integer> {

}

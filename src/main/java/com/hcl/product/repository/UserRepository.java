package com.hcl.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.product.model.Registration;

@Repository
public interface UserRepository extends JpaRepository<Registration, Integer> {

	public Registration findByUsernameAndUserpassword(String username,String userpassword);
	
}

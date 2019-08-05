package com.hcl.product.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.product.model.Registration;

@Repository
public interface UserRepository extends JpaRepository<Registration, Integer> {

	Optional<Registration> findByUsernameAndUserpassword(String username,String userpassword);
	
	Optional<Registration> findByUsername(String username);
	
}

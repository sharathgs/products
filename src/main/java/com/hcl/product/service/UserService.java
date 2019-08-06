package com.hcl.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.product.dto.RegistrationDto;
import com.hcl.product.dto.ResponseDto;
import com.hcl.product.exception.UserException;
import com.hcl.product.model.Category;
import com.hcl.product.model.Registration;
import com.hcl.product.repository.CategoryRepository;
import com.hcl.product.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	CategoryRepository categoryRepository;

	public ResponseDto addNewUser(RegistrationDto registrationDto) {
		Registration registration = new Registration();
		BeanUtils.copyProperties(registrationDto, registration);
		userRepository.save(registration);
		return new ResponseDto("User added successfully");
	}

	public List<Category> login(String userName, String userPassword) throws UserException {
		Optional<Registration> resultData = userRepository.findByUsernameAndUserpassword(userName, userPassword);
		if (!resultData.isPresent())
			throw new UserException("Invalid credentials");
		return categoryRepository.findAll();
	}

}

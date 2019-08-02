package com.hcl.product.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.product.dto.RegistrationDto;
import com.hcl.product.dto.ResponseDto;
import com.hcl.product.model.Registration;
import com.hcl.product.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	
	
	public ResponseDto addNewUser(RegistrationDto registrationDto)
	{
		Registration registration = new Registration();
		BeanUtils.copyProperties(registrationDto, registration);
		userRepository.save(registration);
		return new ResponseDto("User added successfully");
	}
	
	
	public Registration login(String userName, String userPassword)
	{
		Registration resultData = userRepository.findByUsernameAndUserpassword(userName, userPassword);
		if(resultData != null)
			return resultData;
		return null;
	}
	
}

package com.hcl.product.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.product.dto.RegistrationDto;
import com.hcl.product.dto.ResponseDto;
import com.hcl.product.exception.UserException;
import com.hcl.product.model.Category;
import com.hcl.product.model.Registration;
import com.hcl.product.service.CategoryService;
import com.hcl.product.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	CategoryService categoryService;
	
	@PostMapping("/register")
	public ResponseEntity<ResponseDto> addUser(@Valid @RequestBody RegistrationDto registrationDto)
	{
		ResponseDto responseDto = userService.addNewUser(registrationDto);
		return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.CREATED);
	}
	
	@PostMapping("/userLogin")
	public ResponseEntity<List<Category>> loginUser(@RequestParam String userName, @RequestParam String userPassword)
	{
		Registration registration = (Registration) userService.login(userName, userPassword);
		if(registration != null)
		{
			return new ResponseEntity<List<Category>>(categoryService.getCategory(), HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<List<Category>>(HttpStatus.NOT_FOUND);
		}
	}
	
}

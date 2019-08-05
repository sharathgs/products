package com.hcl.product.service;

import static org.mockito.Mockito.lenient;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.product.dto.RegistrationDto;
import com.hcl.product.dto.ResponseDto;
import com.hcl.product.model.Registration;
import com.hcl.product.repository.UserRepository;


@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
	
	@InjectMocks
	UserService userService;
	
	@Mock
	UserRepository userRepository;
	
	public RegistrationDto getRegistrationDto()
	{
		RegistrationDto registerDto = new RegistrationDto();
		registerDto.setAddress("Dasarahalli");
		registerDto.setCountry("India");
		registerDto.setEmailid("sharath@gmail.com");
		registerDto.setPhoneno(123456789L);
		registerDto.setUsername("Sharath");
		registerDto.setUserpassword("sharath");
		registerDto.setId(1);
		return registerDto;
	}
	
	public Registration getRegistration()
	{
		Registration register = new Registration();
		register.setAddress("Dasarahalli");
		register.setCountry("India");
		register.setEmailid("sharath@gmail.com");
		register.setPhoneno(123456789L);
		register.setUsername("Sharath");
		register.setUserpassword("sharath");
		register.setId(1);
		return register;
	}
	
	@Test
	public void addUserTest()
	{
		RegistrationDto registerDto = getRegistrationDto();
		Registration register = getRegistration();
		lenient().when(userRepository.save(register)).thenReturn(register);
		ResponseDto response = userService.addNewUser(registerDto);
		Assert.assertEquals("User added successfully", response.getMessage());
	}
	
	/*@Test
	public void loginUserAndPasswordTest()
	{
		
	}*/

}

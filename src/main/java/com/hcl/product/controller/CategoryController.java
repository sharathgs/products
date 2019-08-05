package com.hcl.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.product.model.CategoryCount;
import com.hcl.product.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/all")
	public List getCategory()
	{
		return categoryService.getCategory();
	}
	
	@GetMapping("/categoryId/allproduct")
	public List getCategoryByProduct(@RequestParam int productid,@RequestParam String username)
	{
		return categoryService.getProductByCategory(productid,username);
	}
	
	@GetMapping("/product/count")
	public ResponseEntity<List<CategoryCount>> getCategoryCountByName(@RequestParam String username)
	{
		return new ResponseEntity<List<CategoryCount>>(categoryService.getCategoryCountByName(username),HttpStatus.OK);
	}
	
}

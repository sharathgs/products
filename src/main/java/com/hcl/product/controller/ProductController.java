package com.hcl.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.product.model.Product;
import com.hcl.product.model.ProductCount;
import com.hcl.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/getProduct")
	public ResponseEntity<Optional<Product>> getProductById(@RequestParam int productId, @RequestParam String username)
	{
		return new ResponseEntity<Optional<Product>>(productService.getProduct(productId,username),HttpStatus.OK);
	}
	
	
	@GetMapping("/getProductCount")
	public ResponseEntity<List<ProductCount>> getProductCount(@RequestParam String username)
	{
		return new ResponseEntity<List<ProductCount>>(productService.getProductCountByName(username),HttpStatus.OK);
	}

}

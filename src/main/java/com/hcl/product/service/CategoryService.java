package com.hcl.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.product.model.Category;
import com.hcl.product.model.CategoryCount;
import com.hcl.product.repository.CategoryCountRepository;
import com.hcl.product.repository.CategoryRepository;
import com.hcl.product.repository.ProductRepository;

@Service
public class CategoryService {

	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	CategoryCountRepository categoryCountRepo;
	
	public List getCategory()
	{
		List categoryList = categoryRepository.findAll();
		return categoryList;
	}
	
	public List getProductByCategory(int categoryId, String username)
	{
		int count = 0;
		List productList = productRepository.findAllByCategoryproduct(categoryId);
		Optional<Category> categoryData = categoryRepository.findById(categoryId);
		System.out.println("vv "+categoryData.get().getCategoryname());
		Optional<CategoryCount> categoryCount = categoryCountRepo.findByUsernameAndCategory(username,categoryData.get().getCategoryname());
		
		if(categoryCount.isPresent())
		{
			count =	categoryCount.get().getCategoryCountByUserName()+1;
			categoryCount.get().setCategoryCountByUserName(count);
			categoryCountRepo.save(categoryCount.get());
		}else {
			count = 1;
			CategoryCount categoryForCount = new CategoryCount();
			categoryForCount.setCategory(categoryData.get().getCategoryname());
			categoryForCount.setCategoryCountByUserName(count);
			categoryForCount.setUsername(username);
			categoryCountRepo.save(categoryForCount);
		}
		
		return productList;
	}
	
	
	public List getCategoryCountByName(String username)
	{
		return categoryCountRepo.findAllByUsername(username);
	}
	
}
package com.hcl.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.product.model.Product;
import com.hcl.product.model.ProductCount;
import com.hcl.product.repository.ProductCountRepository;
import com.hcl.product.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired 
	ProductCountRepository productCountRepository;
	
	public Optional<Product> getProduct(int productId, String username)
	{
		int count = 0;
		Optional<Product> productDetails = productRepository.findById(productId);
		String productName = null;
		if(productDetails.isPresent())
		{
			productName = productDetails.get().getProductName();
		}
		Optional<ProductCount> productLikes = productCountRepository.findByuserNameAndProductName(username, productName);
		
		if(productLikes.isPresent())
		{
			count = productLikes.get().getProductCountByUser()+1;
			productLikes.get().setProductCountByUser(count);
			productCountRepository.save(productLikes.get());
			return productDetails;
		}else
		{
			count = 1;
			ProductCount productCount = new ProductCount();
			productCount.setProductName(productName);
			productCount.setProductCountByUser(count);
			productCount.setUserName(username);
			//System.out.println("count else "+count);
			productCountRepository.save(productCount);
			
			return productDetails;
			//return productRepository.findById(productId);
		}
		
	}
	
	public List<ProductCount> getProductCountByName(String username)
	{
		return productCountRepository.findAllByUserName(username);
	}

}

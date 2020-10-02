package com.lucas.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.course.entities.Product;
import com.lucas.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repossitory;
	
	public List<Product> findAll() {
		return repossitory.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repossitory.findById(id);
		return obj.get();
	}
}

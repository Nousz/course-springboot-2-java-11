package com.lucas.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.course.entities.Category;
import com.lucas.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repossitory;
	
	public List<Category> findAll() {
		return repossitory.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repossitory.findById(id);
		return obj.get();
	}
}

package com.lucas.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.course.entities.User;
import com.lucas.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repossitory;
	
	public List<User> findAll() {
		return repossitory.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repossitory.findById(id);
		return obj.get();
	}
}

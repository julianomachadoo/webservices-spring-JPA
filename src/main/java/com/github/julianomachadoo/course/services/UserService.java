package com.github.julianomachadoo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.julianomachadoo.course.entities.Users;
import com.github.julianomachadoo.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<Users> findAll() { 
		return repository.findAll();	
	}
	
	public Users findById(Long id) {
		Optional<Users> obj  = repository.findById(id);
		return obj.get();
	}
}

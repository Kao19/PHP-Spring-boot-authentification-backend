package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repos.UserRepository;

@Service
public class UserServiceImplementation implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User getUser(Long id) {
		return userRepository.getById(id);
	}

	@Override
	public Long getUserCount() {
	    return userRepository.count();
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public boolean existsUser(Long id) {
		// TODO Auto-generated method stub
		return userRepository.existsById(id);
	}

}

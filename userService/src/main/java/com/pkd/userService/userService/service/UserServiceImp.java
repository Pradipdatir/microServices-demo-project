package com.pkd.userService.userService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pkd.userService.userService.Repo.UserRepository;
import com.pkd.userService.userService.entity.User;
import com.pkd.userService.userService.exeptions.ResourceNotFoundException;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User SaveUser(User user) {
		// Save the user entity in the repository
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// Retrieve all users from the repository
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		// Use findById to retrieve the user by ID or throw an exception
		return userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User with ID " + userId + " not found"));
	}
}

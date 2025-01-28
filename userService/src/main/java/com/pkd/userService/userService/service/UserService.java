package com.pkd.userService.userService.service;

import java.util.List;

import com.pkd.userService.userService.Repo.UserRepository;
import com.pkd.userService.userService.entity.User;

public interface UserService {

	// user save
	User SaveUser(User user);

	// all user
	List<User> getAllUser();

	// user
	User getUser(String userId);

}

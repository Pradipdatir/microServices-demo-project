package com.pkd.userService.userService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pkd.userService.userService.entity.User;
import com.pkd.userService.userService.service.UserService;

@RestController
@RequestMapping("v1/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {

		User user1 = userService.SaveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);

	}

	@GetMapping
	public ResponseEntity<List<User>> getUsers() {
		List<User> user1 = userService.getAllUser();
		return ResponseEntity.ok(user1);

	}

	@GetMapping("/{userId}")
	public ResponseEntity<User> getUser(@PathVariable String userId) {
		User user1 = userService.getUser(userId);
		return ResponseEntity.ok(user1);

	}

}

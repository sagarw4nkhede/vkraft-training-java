package com.cache.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cache.demo.entity.User;
import com.cache.demo.services.UserService;

@RestController
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/users/{id}")
	public User getUser(@PathVariable Long id) {
		return userService.getUserById(id);
	}

	@PostMapping("/user")
	public User getUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@GetMapping("/cache/users")
	public Map<?, ?> getAllCacheData() {
		return userService.getAllCacheData();
	}
}
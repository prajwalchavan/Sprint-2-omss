package com.project.omss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.omss.entity.User;
import com.project.omss.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/UserAdd")
	private String saveUser(@RequestBody User User) {
	return User.getUserId() + " " + userService.saveOrUpdate(User);
	}
}

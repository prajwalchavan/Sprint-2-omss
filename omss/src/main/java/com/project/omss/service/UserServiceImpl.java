package com.project.omss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.omss.entity.User;
import com.project.omss.repository.UserJpaRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
 	UserJpaRepository userRepository;

	@Override
	public String saveOrUpdate(User user) {
		userRepository.save(user);
		return "Saved";
	}
}

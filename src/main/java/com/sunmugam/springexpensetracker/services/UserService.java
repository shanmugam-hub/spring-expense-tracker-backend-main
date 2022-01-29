package com.sunmugam.springexpensetracker.services;

import com.sunmugam.springexpensetracker.models.User;

public interface UserService {
	public User createUser(User user);
	public User getUserByUsername(String username);
	public User saveUser(User user);
}

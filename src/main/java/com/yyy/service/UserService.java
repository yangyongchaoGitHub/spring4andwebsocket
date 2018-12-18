package com.yyy.service;

import java.util.List;

import com.yyy.domain.User;


public interface UserService {

	void addUser(User user);

	User getById(long id);

	List<User> getAllUser();
}

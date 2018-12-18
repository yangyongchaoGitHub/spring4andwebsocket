package com.yyy.service.achieve;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yyy.dao.UserMapper;
import com.yyy.domain.User;
import com.yyy.service.UserService;

@Service("userService")
public class UserServiceAchieve implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	public void addUser(User user) {
		userMapper.insert(user);
		
	}

	public User getById(long id) {
		return userMapper.selectByPrimaryKey((int)id);
	}

	public List<User> getAllUser() {
		return userMapper.getAllUser();
	}

}

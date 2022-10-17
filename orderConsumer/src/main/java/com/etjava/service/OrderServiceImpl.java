package com.etjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etjava.bean.User;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private UserService userService;
	
	@Override
	public List<User> findUser(Integer userId) {
		return userService.list(userId);
	}

}

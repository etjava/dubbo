package com.etjava.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.etjava.bean.User;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public List<User> list(Integer userId) {
		List<User> list = new ArrayList<>(2);
		Collections.addAll(list, new User(1,"Tom",22),new User(2,"Jerry",23));
		return list;
	}

}

package com.etjava.service;

import java.util.List;

import com.etjava.bean.User;

public interface UserService {

	List<User> list(Integer userId);
}

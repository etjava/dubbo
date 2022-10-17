package com.etjava.service;

import java.util.List;

import com.etjava.bean.User;

public interface OrderService {

	List<User> findUser(Integer userId);
}

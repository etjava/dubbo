package com.etjava;

import java.io.IOException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etjava.bean.User;
import com.etjava.service.OrderService;

public class App {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");
		OrderService orderService = ioc.getBean(OrderService.class);
		List<User> users = orderService.findUser(1);
		
		System.out.println(users.get(0));
		
		System.in.read();
		
	}
}

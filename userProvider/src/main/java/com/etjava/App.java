package com.etjava;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider222.xml");
		ioc.start();
		
		System.out.println("provider started.");
		System.in.read();
	}
}

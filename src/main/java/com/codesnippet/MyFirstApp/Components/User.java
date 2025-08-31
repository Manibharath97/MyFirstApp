package com.codesnippet.MyFirstApp.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
	
	@Autowired
	Order order;

	public User(Order order) {
		this.order = order;
		System.out.println("Initializing User");
	}
}

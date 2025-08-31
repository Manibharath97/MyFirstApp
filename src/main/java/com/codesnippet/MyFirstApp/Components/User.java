package com.codesnippet.MyFirstApp.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
	
	Order order;

	public User() {				//object will be created by using this constructor
		System.out.println("Initializing User");
	}
	
	@Autowired
	public void setOrder(Order order) {
		this.order = order;
	}
}

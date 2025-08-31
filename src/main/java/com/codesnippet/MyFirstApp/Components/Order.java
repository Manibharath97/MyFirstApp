package com.codesnippet.MyFirstApp.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
	
	User user;

	@Autowired
	public Order(User user) {		//object will be created by using this constructor and stores this object in spring IOC container
		this.user = user;
		System.out.println("Initializing Order");
	}
}

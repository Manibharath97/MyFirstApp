package com.codesnippet.MyFirstApp.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
	
	User user;

	public Order() {		//object will be created by using this constructor and stores this object in spring IOC container
		System.out.println("Initializing Order");
	}

	public void setOrder(User user) {
		this.user = user;
	}
}

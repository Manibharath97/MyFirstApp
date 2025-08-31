package com.codesnippet.MyFirstApp.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
	
	final Order order;		//create immutable object using constructor injection

	/*public User() {				//object will be created by using this constructor
		System.out.println("Initializing User");
	}*/
	
	OnlineOrder onlineOrder;

	@Autowired			//Incase of constructor injection, when 1 constructor is present - @Autowired is not mandatory
	public User(Order order, OnlineOrder onlineOrder) {				//object will be created by using this constructor
		this.order = order;
		this.onlineOrder = onlineOrder;
		System.out.println("Initializing User");
	}
}

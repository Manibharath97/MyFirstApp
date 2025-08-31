package com.codesnippet.MyFirstApp.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class User {
	
	Order order;		//create immutable object using constructor injection

	/*public User() {				//object will be created by using this constructor
		System.out.println("Initializing User");
	}*/
	
	//OnlineOrder onlineOrder;

	@Autowired			//Incase of constructor injection, when 1 constructor is present - @Autowired is not mandatory
	@Lazy				// for lazy initialization (avoid from circular dependency)
	public User(Order order) {				//object will be created by using this constructor
		this.order = order;
		System.out.println("Initializing User");
	}
}

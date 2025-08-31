package com.codesnippet.MyFirstApp.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class User {
	
	Order order;
	
	@Autowired			//Incase of constructor injection, when 1 constructor is present - @Autowired is not mandatory
	//@Lazy				// for lazy initialization (avoid from circular dependency)
	public User(Order order) {				//object will be created by using this constructor
		this.order = order;
		System.out.println("Initializing User");
	}
}

package com.codesnippet.MyFirstApp.Components;

import org.springframework.stereotype.Component;

@Component
public class Order {

	public Order() {		//object will be created by using this constructor and stores this object in spring IOC container
		System.out.println("Initializing Order");
	}
}

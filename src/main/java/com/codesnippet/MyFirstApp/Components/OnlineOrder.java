package com.codesnippet.MyFirstApp.Components;

import org.springframework.stereotype.Component;

@Component
public class OnlineOrder implements Order{

	public OnlineOrder() {
		System.out.println("Init OnlineOrder");
	}
}

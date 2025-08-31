package com.codesnippet.MyFirstApp.Components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class OnlineOrder implements Order{

	public OnlineOrder() {
		System.out.println("Init OnlineOrder");
	}
}

package com.codesnippet.MyFirstApp.Components;

import org.springframework.stereotype.Component;

@Component
public class OfflineOrder implements Order{
	
	public OfflineOrder() {
		System.out.println("Init OfflineOrder");
	}

}

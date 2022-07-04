package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	public Engine() {
		System.out.println("<<<<<<<ENGINE OBJECT CREATED>>>>>>>>>>");
	}
public void start() {
	System.out.println("car started............");
}
}

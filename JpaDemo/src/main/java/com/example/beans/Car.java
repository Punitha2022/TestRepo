package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	private Engine engine;
public Car() {
	System.out.println("<<<<<<<<<<<<Car object created>>>>>>>>>>>");
}
public void start() {
	engine.start();
}
}

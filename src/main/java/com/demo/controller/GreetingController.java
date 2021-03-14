package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.demo.services.HelloWorldService;

@Controller
public class GreetingController {
	private HelloWorldService helloWorldService; 
	private HelloWorldService helloWorldServiceHindi;
	
	@Autowired
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	@Autowired
	@Qualifier("hin")
	public void setHelloWorldServiceHindi(HelloWorldService helloWorldServiceHindi) {
		this.helloWorldServiceHindi = helloWorldServiceHindi;
	}
	
	public String sayHello() {
		String greeting = helloWorldService.getGreeting()+"\n"+helloWorldServiceHindi.getGreeting();
		return greeting;
	}
}

package com.demo.controller;
import com.demo.services.HelloWorldService;

//@Controller <-- uncomment for Java Configuration
public class GreetingController {
	private HelloWorldService helloWorldService; 
	private HelloWorldService helloWorldServiceHindi;
	
	//@Autowired <-- uncomment for Java Configuration
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	//@Autowired 
	//@Qualifier("hindi") <-- uncomment for Java Configuration
	public void setHelloWorldServiceHindi(HelloWorldService helloWorldServiceHindi) {
		this.helloWorldServiceHindi = helloWorldServiceHindi;
	}
	
	public String sayHello() {
		String greeting = helloWorldService.getGreeting()+"\n"+helloWorldServiceHindi.getGreeting();
		return greeting;
	}
}

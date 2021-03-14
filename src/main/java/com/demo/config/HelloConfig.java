package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import com.demo.services.HelloWorldFactory;
import com.demo.services.HelloWorldService;

@Configuration
public class HelloConfig {
	@Bean
	public HelloWorldFactory helloWorldFactory() {
		return new HelloWorldFactory();
	}
	
	@Bean
	@Profile("english")
	@Primary
	public HelloWorldService helloWorldServiceEng(HelloWorldFactory factory) {
		return factory.createHelloWorldService("en");
	}
	
	@Bean(name = "hin")
	//@Profile("hindi")
	public HelloWorldService helloWorldServiceHindi(HelloWorldFactory factory) {
		return factory.createHelloWorldService("hi");
	}
}

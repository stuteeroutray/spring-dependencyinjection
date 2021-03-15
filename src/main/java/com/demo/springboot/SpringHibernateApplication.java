package com.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.demo.controller.GreetingController;

@SpringBootApplication
@ComponentScan("com.demo")
public class SpringHibernateApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringHibernateApplication.class, args);
		
		GreetingController controller = (GreetingController) ctx.getBean("greetingController");
		System.out.println(controller.sayHello());
	}

}

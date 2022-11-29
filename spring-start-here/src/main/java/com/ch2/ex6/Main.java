package com.ch2.ex6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;

public class Main {
	
	public static void main(String[] args) {
		
		// create the Spring context
		var context = new AnnotationConfigApplicationContext(com.ch2.ex6.ProjectConfig.class);
		
		// Retrieve the bean from Spring Context
		Parrot p = context.getBean(Parrot.class);
		
		// call methods on the bean
		System.out.println(p);
		System.out.println("The name of the Parrot is: " + p.getName());
	}
	
}

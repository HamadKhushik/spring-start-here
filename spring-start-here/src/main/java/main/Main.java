package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;

public class Main {
	
	public static void main(String[] args) {
		
		// create the Spring context
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		// Retrieve the bean from Spring Context
		Parrot p = context.getBean(Parrot.class);
		
		String str = context.getBean(String.class);
		
		Integer number = context.getBean(Integer.class);
		
		// call methods on the bean
		System.out.println("The name of the Parrot is: " + p.getName());
		System.out.println("The String is: " + str);
		System.out.println("The Integer is: " + number);
	}
	
}

package wiringTheBeans;

import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;

public class Main {
	
	public static void main(String[] args) {
		
		// create the Spring context
		var context = new AnnotationConfigApplicationContext(wiringTheBeans.ProjectConfig.class);
		
		// retrieve the bean from Spring Context
		Person person = context.getBean(Person.class);
		
		// call methods on the bean
		System.out.println("Person's name is: " + person.getName());
		System.out.println("Parrot's name is: "+ person.getParrot().getName());
	}
	
}

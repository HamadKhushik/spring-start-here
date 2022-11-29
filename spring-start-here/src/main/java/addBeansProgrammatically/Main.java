package addBeansProgrammatically;

import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;

public class Main {
	
	public static void main(String[] args) {
		
		// create the Spring context
		var context = new AnnotationConfigApplicationContext(addBeansProgrammatically.ProjectConfig.class);
		
		// create an object
		Parrot x = new Parrot();
		x.setName("Miki");
		
		// create a supplier instance
		Supplier<Parrot> parrotSupplier = () -> x;
		
		// register bean in the context
		
		context.registerBean("Parrot1", addBeansProgrammatically.Parrot.class, parrotSupplier, bc -> bc.setPrimary(true));
		
		// Retrieve the bean from Spring Context
		Parrot p = context.getBean(Parrot.class);
		
		// call methods on the bean
		System.out.println(p);
		System.out.println("The name of the Parrot is: " + p.getName());
	}
	
}

package beanLifeCyclePrototype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beanLifeCyclePrototype.sevice.CommentService;
import beanLifeCyclePrototype.sevice.UserService;

public class Main {
	
	public static void main(String[] args) {
		
		// create context
		var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		
		// retrieve bean
		var cs1 = context.getBean(CommentService.class);
		var cs2 = context.getBean(UserService.class);
		
		// compare the beans
		System.out.println("Both CommentService objects are same: " + (cs1.getCommentRepository() == cs2.getCommentRepository()));
		System.out.println(cs1);
		System.out.println(cs2);
		
		// close the context
		context.close();
	}
}

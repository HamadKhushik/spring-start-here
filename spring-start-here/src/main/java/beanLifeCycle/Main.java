package beanLifeCycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beanLifeCycle.services.CommentService;
import beanLifeCycle.services.UserService;

public class Main {

	public static void main(String[] args) {
		
		// create context
		var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		
		// retrieve the beans
		System.out.println("Before Creating the CommentService Bean");
		CommentService commentService = context.getBean(CommentService.class);
		System.out.println("After Creatint the CommentService Bean");
		UserService userService = context.getBean(UserService.class);
		
		// check if the beans are same
//		System.out.println("Beans are the same: " + (commentService.getCommentRepository() == userService.getCommentRepository()));
//		System.out.println("commentService1: " + commentService.getCommentRepository());
//		System.out.println("commentService2: " + userService.getCommentRepository());
		
		// close the context
		context.close();
	}

}

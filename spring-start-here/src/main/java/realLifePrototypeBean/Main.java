package realLifePrototypeBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// Create the Context
		var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		
		// Retrieve the Bean
		CommentService cs = context.getBean(CommentService.class);
		
		
		// Create a Comment Object
		realLifePrototypeBean.Comment c = new realLifePrototypeBean.Comment();
		
		// call methods on the bean
		cs.sendComment(c);
		cs.sendComment(c);
		cs.sendComment(c);
		
		// close the context
		context.close();
	}
}

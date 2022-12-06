package usingAbstractions;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import usingAbstractions.model.Comment;
import usingAbstractions.proxies.EmailCommentNotificationProxy;
import usingAbstractions.repositories.DBCommentRepository;
import usingAbstractions.services.CommentService;

public class Main {

	public static void main(String[] args) {
		
		// create the Spring Context
		var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		
		// Retrieve the Bean
		CommentService commentService = context.getBean(CommentService.class);
		
		// create the Comment
		Comment comment = new Comment();
		comment.setAuthor("Hammad");
		comment.setText("Demo Text for Using Abstractions");
		
		// call methods on the bean
		commentService.publishComment(comment);
		
		// close the context
		context.close();
		
		
		/* Without using Spring
		 * 
		var commentRepository = new DBCommentRepository();
		var notificationProxy = new EmailCommentNotificationProxy();
		
		var commentService = new CommentService(commentRepository, notificationProxy);
		
		Comment comment = new Comment();
		comment.setAuthor("Hammad");
		comment.setText("Demo Comment");
		
		commentService.publishComment(comment);
		 */
	}

}

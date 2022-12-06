package usingAbstractions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import usingAbstractions.proxies.EmailCommentNotificationProxy;
import usingAbstractions.proxies.NotificationProxy;
import usingAbstractions.repositories.CommentRepository;
import usingAbstractions.repositories.DBCommentRepository;
import usingAbstractions.services.CommentService;

@Configuration
@ComponentScan(basePackages = "usingAbstractions")
public class ProjectConfiguration {
	
/*	when not using Stereotype Annotations
	@Bean
	public CommentRepository commentRepository() {
		return new DBCommentRepository();
	}
	
	@Bean
	public NotificationProxy notificationProxy() {
		return new EmailCommentNotificationProxy();
	}
	
	@Bean
	public CommentService commentService(CommentRepository commentRepository, NotificationProxy notificationProxy) {
		return new CommentService(commentRepository, notificationProxy);
	}
	*/
}

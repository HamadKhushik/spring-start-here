package usingAbstractions.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import usingAbstractions.model.Comment;
import usingAbstractions.proxies.NotificationProxy;
import usingAbstractions.repositories.CommentRepository;
import usingAbstractions.repositories.DBCommentRepository;

@Component
public class CommentService {
	
	private final CommentRepository commentRepository;
	private final NotificationProxy notificationProxy;
	
	@Autowired
	public CommentService(DBCommentRepository commentRepository, NotificationProxy notificationProxy) {
		this.commentRepository = commentRepository;
		this.notificationProxy = notificationProxy;
	}
	
	public void publishComment(Comment comment) {
		commentRepository.storeComment(comment);
		notificationProxy.sendComment(comment);
	}
	
}

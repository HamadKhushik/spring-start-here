package usingAbstractions.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import usingAbstractions.model.Comment;
import usingAbstractions.proxies.NotificationProxy;
import usingAbstractions.repositories.CommentRepository;
import usingAbstractions.repositories.DBCommentRepository;

@Service
public class CommentService {
	
	private final CommentRepository commentRepository;
	private final NotificationProxy notificationProxy;
	
	@Autowired
	public CommentService(CommentRepository commentRepository, @Qualifier("PUSH")NotificationProxy notificationProxy) {
		this.commentRepository = commentRepository;
		this.notificationProxy = notificationProxy;
	}
	
	public void publishComment(Comment comment) {
		commentRepository.storeComment(comment);
		notificationProxy.sendComment(comment);
	}
	
}

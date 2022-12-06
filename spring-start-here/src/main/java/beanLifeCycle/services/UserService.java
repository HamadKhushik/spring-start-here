package beanLifeCycle.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import beanLifeCycle.repository.CommentRepository;

@Service
public class UserService {
	
	
	private final CommentRepository commentRepository;
	
	@Autowired
	public UserService(CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
		System.out.println("UserService instance created");
	}

	public CommentRepository getCommentRepository() {
		return commentRepository;
	}
	
	
}

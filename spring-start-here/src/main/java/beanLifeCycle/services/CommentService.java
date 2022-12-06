package beanLifeCycle.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import beanLifeCycle.repository.CommentRepository;

@Service
@Lazy
public class CommentService {
	
	
	private final CommentRepository commentRepository;
	
	@Autowired
	public CommentService(CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
		System.out.println("Comment Service instance created!");
	}
	public CommentRepository getCommentRepository() {
		return commentRepository;
	}
	
	
}

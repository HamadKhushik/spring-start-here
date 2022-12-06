package beanLifeCyclePrototype.sevice;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import beanLifeCyclePrototype.commentRepository.CommentRepository;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class UserService {
	
	private CommentRepository commentRepository;
	
	public UserService(CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
	}

	public CommentRepository getCommentRepository() {
		return commentRepository;
	}
	
}

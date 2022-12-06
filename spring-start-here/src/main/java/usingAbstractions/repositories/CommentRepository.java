package usingAbstractions.repositories;

import org.springframework.stereotype.Repository;

import usingAbstractions.model.Comment;

public interface CommentRepository {
	
	public void storeComment(Comment comment);
}

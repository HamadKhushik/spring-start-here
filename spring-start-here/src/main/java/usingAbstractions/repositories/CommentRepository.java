package usingAbstractions.repositories;

import usingAbstractions.model.Comment;

public interface CommentRepository {
	
	public void storeComment(Comment comment);
}

package usingAbstractions.repositories;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import usingAbstractions.model.Comment;

@Repository
public class DBCommentRepository implements CommentRepository {
	
	@Override
	public void storeComment(Comment comment) {
		System.out.println("Storing comment: " + comment.getText());
	}
}

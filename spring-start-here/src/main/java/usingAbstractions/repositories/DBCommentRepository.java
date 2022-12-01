package usingAbstractions.repositories;

import org.springframework.stereotype.Component;

import usingAbstractions.model.Comment;

@Component
public class DBCommentRepository implements CommentRepository {
	
	@Override
	public void storeComment(Comment comment) {
		System.out.println("Storing comment: " + comment.getText());
	}
}

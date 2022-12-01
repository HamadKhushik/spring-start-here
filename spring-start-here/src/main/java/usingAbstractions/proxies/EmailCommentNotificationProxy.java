package usingAbstractions.proxies;

import org.springframework.stereotype.Component;

import usingAbstractions.model.Comment;

@Component
public class EmailCommentNotificationProxy implements NotificationProxy {

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Sending Notification for Comment: " + comment.getText());
	}

}

package usingAbstractions.proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import usingAbstractions.model.Comment;

@Component
@Qualifier("EMAIL")
public class EmailCommentNotificationProxy implements NotificationProxy {

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Sending Email Notification for Comment: " + comment.getText());
	}

}

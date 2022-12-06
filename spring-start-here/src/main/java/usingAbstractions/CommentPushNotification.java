package usingAbstractions;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import usingAbstractions.model.Comment;
import usingAbstractions.proxies.NotificationProxy;

@Component
@Qualifier("PUSH")
public class CommentPushNotification implements NotificationProxy {

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Sending push notification for comment: " + comment.getText());
	}

}

package usingAbstractions.proxies;

import org.springframework.stereotype.Component;

import usingAbstractions.model.Comment;

public interface NotificationProxy {
	
	public void sendComment(Comment comment);
}

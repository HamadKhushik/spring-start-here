package realLifePrototypeBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class CommentService {

	@Autowired
	private ApplicationContext context;
//	@Autowired  - this will make CommentProcessor Bean singleton
//	private realLifePrototypeBean.CommentProcessor p;
	
	public void sendComment(Comment c) {
		
		CommentProcessor p = context.getBean(realLifePrototypeBean.CommentProcessor.class);
		System.out.println("CommentProcessor Bean is: " + p);
		
		p.setComment(c);
		p.processComment(c);
		p.validateComment(c);
	}
}

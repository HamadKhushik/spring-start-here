package realLifePrototypeBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {
	
	@Autowired
	private CommentRepository commentRepository;  // the reason to make CommentProcessor a 'bean'
	private Comment comment;
	
	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}
	
	public void processComment(Comment comment) {
		System.out.println("Processing Comment");
	}
	
	public void validateComment(Comment comment) {
		System.out.println("Validating Comment");
	}
}

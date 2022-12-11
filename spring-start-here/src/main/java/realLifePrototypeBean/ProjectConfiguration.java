package realLifePrototypeBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "realLifePrototypeBean")
public class ProjectConfiguration {

	
	
	@Bean
	public CommentRepository commentRepository() {
		return new CommentRepository();
	}
}

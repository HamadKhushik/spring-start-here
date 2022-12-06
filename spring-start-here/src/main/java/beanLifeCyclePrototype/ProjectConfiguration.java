package beanLifeCyclePrototype;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
@ComponentScan(basePackages = "beanLifeCyclePrototype")
public class ProjectConfiguration {
	

/*	when using @Bean Annotations
//	@Bean
//	@Scope(BeanDefinition.SCOPE_PROTOTYPE)
//	public CommentService commentService() {
//		return new CommentService();
//	}
	*/
	
}

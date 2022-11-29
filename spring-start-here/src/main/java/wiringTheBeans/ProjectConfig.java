package wiringTheBeans;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "wiringTheBeans")
public class ProjectConfig {
	
	
	@Bean 
	public Parrot parrot1() {
		Parrot parrot = new Parrot();
		parrot.setName("Koko");
		return parrot;
	}
	
	@Bean
	public Parrot parrot2() {
		Parrot parrot = new Parrot();
		parrot.setName("Miki");
		return parrot;
	}

//	@Bean
//	public Person person(@Qualifier("parrot1") Parrot parrot) {
//		Person person = new Person();
//		person.setName("Ella");
//		person.setParrot(parrot);
//		return person;
//	}
}

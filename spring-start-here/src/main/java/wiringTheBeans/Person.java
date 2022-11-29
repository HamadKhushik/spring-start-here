package wiringTheBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private String name = "Ella";
	private Parrot parrot;
	
	// recommended method for DI
	@Autowired
	public Person(@Qualifier("parrot1")Parrot parrot) {
		this.parrot = parrot;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Parrot getParrot() {
		return parrot;
	}

	// @Autowired setter method not good practice
//	public void setParrot(Parrot parrot) {
//		this.parrot = parrot;
//	}
}

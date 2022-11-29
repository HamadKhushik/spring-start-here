
package wiringTheBeans;

import org.springframework.stereotype.Component;

//@Component
public class Parrot {
	
	private String name = "Koko";
	
	// no arg constructor for debugging
	public Parrot() {
		System.out.println("Parrot no-arg constructor: Parrot Created");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

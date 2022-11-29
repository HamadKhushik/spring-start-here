package com.ch2.ex6;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	void init() {
		this.name = "Kiki";
	}
	
	
}

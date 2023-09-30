package com.demos.javase2.Demo08;

public abstract class Person {
	private String name;

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void read();
	
}

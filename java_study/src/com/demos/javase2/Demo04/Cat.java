package com.demos.javase2.Demo04;

public class Cat extends Animal {
	private double weight;

	public Cat() {
	}

	public Cat(String name, int month, double weight) {
		super(name, month);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void run() {
		System.out.println("Cat在奔跑");
	}

	@Override
	public void eat() {
		System.out.println("Cat在吃鱼");
	}	
	
}
 
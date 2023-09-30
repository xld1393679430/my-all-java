package com.demos.javase2.Demo02;

public class Test {
	public static void main(String[] args) {
		Animal a1 = new Animal("aa", 1);
		Animal a2 = new Animal("aa", 1);

		System.out.println(a1.equals(a2));

		a1.eat();
	}
}

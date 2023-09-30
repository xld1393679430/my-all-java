package com.demos.javase2.Demo06;

import com.demos.javase2.Demo06.Person.Heart;

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		
		Heart h1 = new Person().new Heart();
		h1.beat();

		System.out.println("--------");

		Heart h2 = p1.new Heart();
		h2.beat();

		System.out.println("--------");

		Heart h3 = p1.getHeart();
		h3.beat();
	}
}

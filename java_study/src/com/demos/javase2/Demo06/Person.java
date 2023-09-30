package com.demos.javase2.Demo06;

public class Person {

	public Heart getHeart() {
		return new Heart();
	}

	class Heart {
		public void beat() {
			System.out.println("beat");
		}
	}
}

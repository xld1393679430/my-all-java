package com.demos.javase2.Demo01;

public class Cat extends Animal{
	public static int num3 = 33;

	static {
		System.out.println("我是子类的静态代码块");
	}

	{
		System.out.println("我是子类的构造代码块");
	}

	public Cat() {
		System.out.println("我是子类的无参构造代码块");
	}

	
}

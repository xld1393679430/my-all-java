package com.demos.javase2.Demo01;

public class Animal {
	private static int num1 = 11;
	public static int num2 = 22;
	
	{
		System.out.println("我是父类的构造代码块");
	}
	
	static {
		System.out.println("我是父类的静态代码块");
	}

	// 父类的构造不允许被继承，不允许被重写
	public Animal() {
		System.out.println("我是父类的无参构造代码块");
	}
}
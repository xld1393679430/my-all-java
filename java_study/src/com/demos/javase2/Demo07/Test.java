package com.demos.javase2.Demo07;

public class Test {
	public static void main(String[] args) {
		/**
		 * 获取静态内部对象实例
		 */

		 Person.Heart2 h1 = new Person.Heart2();
		 System.out.println(h1.beat());

		 Person.Heart2.say();
	}
}

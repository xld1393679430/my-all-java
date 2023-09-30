package com.demos.javase2.Demo03;

import com.demos.javase.day06.demo02.Singer;

/**
 * 单例模式
 */
public class Test {
	public static void main(String[] args) {
		SingleOne s1 = SingleOne.getInstance();
		SingleOne s2 = SingleOne.getInstance();

		System.out.println(s1.equals(s2));

		System.out.println("------------");

		SingleTwo s3 = SingleTwo.getInstace();
		SingleTwo s4 = SingleTwo.getInstace();
		System.out.println(s3.equals(s4));
	}
}

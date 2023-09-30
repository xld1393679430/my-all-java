package com.demos.javase2.Demo03;

/**
 * 懒汉式单利：
 */
public class SingleTwo {
	// 1，创建私有构造方法
	private SingleTwo() {
	}

	// 2，创建静态的类实例对象
	private static SingleTwo instace = null;

	// 3,创建开放的静态方法提供实例对象
	public static SingleTwo getInstace() {
		if (instace == null) {
			instace = new SingleTwo();
		}
		return instace;
	}
}

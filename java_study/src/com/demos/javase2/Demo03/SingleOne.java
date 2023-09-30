package com.demos.javase2.Demo03;

/**
 * 饿汉式单利模式：创建对象实例的时候直接初始化. 空间换时间
 */
public class SingleOne {
	// 1, 创建类中的私有构造方法
	private SingleOne() {}

	// 2,创建类的私有静态实例
	private static SingleOne instance = new SingleOne();

	// 3,创建公有静态方法返回静态实例对象
	public static SingleOne getInstance() {
		return instance;
	}
}

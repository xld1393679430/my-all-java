package com.demos.javase2.Demo05;

/**
 * IFather
 */
public interface IFather {
	void eat();

	default void connection() {
		System.out.println("IFather的connection");
	}
	
}
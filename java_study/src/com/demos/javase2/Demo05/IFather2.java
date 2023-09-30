package com.demos.javase2.Demo05;

public interface IFather2 {
	void fly();

	default void connection() {
		System.out.println("IFather2的connection");
	}
}

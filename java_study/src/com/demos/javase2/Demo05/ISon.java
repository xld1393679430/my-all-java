package com.demos.javase2.Demo05;

public interface ISon extends IFather, IFather2 {
	void run();

	default void connection() {
		System.out.println("ISon的connection");

	}
}

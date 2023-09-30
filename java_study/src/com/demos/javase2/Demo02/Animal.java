package com.demos.javase2.Demo02;

public class Animal {
	public String name;
	public int month;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public Animal(String name, int month) {
		this.name = name;
		this.month = month;
		System.out.println(name + ":" + month);
	}

	public void eat() {
		// final: 使用前初始化即可
		final int hh;
		hh = 11;
		System.out.println(hh);


	}

	/**
	 * 重写Object.equals
	 * @param obj
	 * @return
	 */
	public boolean equals(Animal obj) {
		if (obj == null) {
			return false;
		}
		if (this.getName() == obj.name && this.getMonth() == obj.month) {
			return true;
		}
		return false;
	}
	
	
	
}

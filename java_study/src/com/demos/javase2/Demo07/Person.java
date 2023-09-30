package com.demos.javase2.Demo07;

public class Person {
	public int age;

	public void eat() {
		System.out.println("Person eat");
	}

	public static void eat2() {
		System.out.println("Person eat2");
	}

	public Heart getHeart() {
		return new Heart();
	}

    public class Heart {
		int age = 10;
		public String beat() {
			eat();
			return  Person.this.age +  " - beat";
		}
	}

	/**
	 * 静态内部类中，只能直接访问外部类的静态成员，如果需要调用非静态成员，可以通过对象实例
	 */
	static class Heart2 {
		public static int age = 13;

		public static void say() {
			System.out.println("Hello say");
		}

		public String beat() {
			new Person().eat();
			eat2();
			return  new Person().age +  " - beat";
		}
	}
}

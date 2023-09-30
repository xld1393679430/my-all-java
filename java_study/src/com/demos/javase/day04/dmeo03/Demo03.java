package com.demos.javase.day04.dmeo03;

/**
 * static
 * 它可以用来修饰的成员变量和成员方法，被修饰的成员是属于类的
 * 而不是单单是属于某个对象的。被static修饰的成员由该类的所有实例（对象）共享；
 */
public class Demo03 {
    public static void main(String[] args) {
        Student s1 = new Student("a");
        Student s2 = new Student("b");
        Student s3 = new Student("c");

        s1.show();
        s2.show();
        s3.show();

        Student s4 = new Student("c");
        s4.show();

        Student.fn1();
    }
}

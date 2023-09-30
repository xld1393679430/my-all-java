package com.demos.javase.day05.demo03;

/**
 * 权限修饰符和方法的重写
 * 方法的重写必须保证子类方法的权限修饰符>=父类方法的权限修饰符
 * 换句话说，如果子类方法的权限修饰符小于父类方法的权限修饰符那么方法将不能被重写（语法报错）；
 */
public class Demo03 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.fn1();

        stu.fn2();

        stu.fn3();

        stu.fn4();
    }
}

//默认没有修饰符是default 权限小于protected和public 所以不能重写Person的fn3和fn4
class Student extends Person {

    void fn1() {
        System.out.println("Student fn1");
    }

    void fn2() {
        System.out.println("Student fn2");
    }

//    void fn3() {
//        System.out.println("Student fn3");
//    }

//    void fn4() {
//        System.out.println("Student fn4");
//    }
}

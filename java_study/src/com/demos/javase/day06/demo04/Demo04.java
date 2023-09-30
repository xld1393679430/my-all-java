package com.demos.javase.day06.demo04;

/**
 * 接口中成员变量默认加上public static final修饰，接口中被static修饰的方法不能被继承，但被static修饰的变量（常量）是可以被继承的；
 */
public class Demo04 {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        System.out.println(a.age);
    }
}

// 当一个类，既继承一个父类，又实现若干个接口并且该接口（默认方法）存在和类同名方法时，子类就近选择执行父类的成员方法；
class A extends B implements C{

}

class B {
    public void show() {
        System.out.println("B中的show方法");
    }
}

interface C {
    int age = 20;

    // public static final int age = 21; // 等价上面的简写

    public abstract void show();
}

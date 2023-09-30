package com.demos.javase.day05.demo02;

/**
 * 抽象类：包含抽象方法的类。
 * 抽象方法：没有方法体的方法。
 *
 * 1, 如果一个类包含抽象方法，那么该类必须是抽象类。
 * 2, 继承抽象类的子类必须重写父类所有的抽象方法。否则，该子类也必须声明为抽象类。
 *
 * 注意：
 * 抽象类是不可以进行实例化的，抽象类本就是包含有无法实例化的抽象方法，
 * 或者说这个方法是没有任何意义的，他存在的意义就是让子类去实现它；
 * 因此抽象类是不可以实例化的，也就是不能创建对象；
 *
 */
public class Demo02 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.run();

        // Person p = new Person();  // 这里是错误的 抽象类是不可以进行实例化的
    }
}

class Student extends Person {

    @Override
    void run() {
        System.out.println("Person.run是抽象方法，子类必须实现");
    }
}

package com.demos.javase.day17.demo02;


public class Demo02 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获得Cate的class对象
        Class c1 = Cate.class;

        System.out.println(c1);

        // 创建学生对象
        Cate cate = new Cate();
        Class c2 = cate.getClass();
        System.out.println(c2);

        Class c3 = Class.forName("com.demos.javase.day17.Cate");
        System.out.println(c3);

        System.out.println(c1 == c2);
        System.out.println(c2 == c3);
    }
}

package com.demos.javase.day09.demo02;

/**
 * 匿名内部类
 * 匿名内部类的本质
 * 1,定义一个没有名字的内部类
 * 2,这个类实现了Chili接口
 * 3,创建了这个没有名字的类的对象
 */
public class Demo02 {
    public static void main(String[] args) {
        class Abc implements Chili {

            @Override
            public void chili() {
                System.out.println("湖南线椒");
            }
        }

        Chili abc = new Abc();
        abc.chili();

        Chili abc2 = new Chili() {
            @Override
            public void chili() {
                System.out.println("哈哈哈");
            }
        };
        abc2.chili();
    }
}

package com.demos.javase.day06.demo02;

/**
 * 需求：学生会游泳，歌手会跳舞；
 * <p>
 * 小灰是一名学生，除了学习之外他还会游泳；小蓝是一名歌手，除了唱歌之外他还会跳舞；
 * <p>
 * 1）小灰是一个学生，小蓝是一个歌手，两者都是人，都具备人的一些基本属性和行为，如姓名、年龄、吃饭、睡觉等；
 * <p>
 * 2）学生会游泳，歌手会跳舞，这些都是独立的扩展功能；
 */
public class Demo02 {
    public static void main(String[] args) {
        Student stu = new Student("小灰", 10);
        stu.study();
        stu.swim();
        stu.eat();
        stu.sleep();

        Singer singer = new Singer("小蓝", 20);
        singer.sing();
        singer.dance();
        singer.eat();
        singer.sing();
    }
}

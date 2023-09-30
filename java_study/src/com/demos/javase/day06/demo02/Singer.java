package com.demos.javase.day06.demo02;

/**
 * 歌手类, 是一个人, 并且会跳舞
 */
public class Singer extends Person implements Danceable {
    public Singer(String name, int age) {
        super(name, age);
    }


    @Override
    public void dance() {
        System.out.println(this.getName() + "Singer dance");
    }

    public void sing() {
        System.out.println(this.getName() + "Singer sing");
    }
}


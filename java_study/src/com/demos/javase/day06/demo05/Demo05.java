package com.demos.javase.day06.demo05;

/**
 * 需求：
 * 1，现在有一个宠物店，宠物店有寄存宠物的功能，但是运营之初，我们只能寄存狗，我们针对狗这个类，设计了吃饭、睡觉等功能；
 * 2，宠物店需要增加新宠物呢。定义一个顶层父类Animal
 */
public class Demo05 {
    public static void main(String[] args) {
        PetStore petStore = new PetStore();

        // 存入一只狗
        Dog dog = new Dog("小黑");
        petStore.storeAnimal(dog);

        // 存入一只猫
        Cat cat = new Cat("小蓝");
        petStore.storeAnimal(cat);
    }
}

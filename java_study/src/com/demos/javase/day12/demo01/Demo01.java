package com.demos.javase.day12.demo01;

/**
 * 线程初体验
 * 继承Thread类都将变为线程类，调用Thread类中的start()方法即开启线程；
 * 当线程开启后，将会执行Thread类中的run方法，因此我们要做的就是重写Thread中的run方法，将线程要执行的任务由我们自己定义；
 */
public class Demo01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("线程1");

        // 开启新的线程
        myThread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main线程正执行： " + i);
        }
    }
}

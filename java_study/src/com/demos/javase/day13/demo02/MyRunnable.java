package com.demos.javase.day13.demo02;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "执行了");
    }
}

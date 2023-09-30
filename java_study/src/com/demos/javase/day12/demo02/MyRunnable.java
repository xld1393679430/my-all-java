package com.demos.javase.day12.demo02;

public class MyRunnable implements  Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            Thread thread = Thread.currentThread();

            System.out.println(thread.getName() + "执行： " + i);
        }
    }
}

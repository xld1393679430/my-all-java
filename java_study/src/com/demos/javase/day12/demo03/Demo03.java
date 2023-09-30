package com.demos.javase.day12.demo03;

/**
 * 匿名内部类创建线程
 */
public class Demo03 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++) {
                    System.out.println("线程1执行: " + i);
                }
            }
        };

        // 创建一个线程类,并传递Runnable的子类
        Thread thread = new Thread(runnable);

        // 开启线程
        thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main线程: " + i);
        }
    }
}

package com.demos.javase.day12.demo04;

/**
 * 线程的休眠
 * public static void sleep(long millis)：让当前线程睡眠指定的毫秒数
 */
public class Demo04 {
    public static void main(String[] args) {
        // 使用匿名内部类开启1个线程
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    //当i等于50的时候让当前线程睡眠1秒钟(1000毫秒)
                    if (i == 50) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        }.start();

        // 使用匿名内部类开启第2个线程
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        }.start();
    }
}

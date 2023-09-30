package com.demos.javase.day12.demo11;

/**
 * 案例：要么输出"犯我中华者"，要么输出"虽远必诛"
 */
public class Demo11 {
    public static void main(String[] args) {
        // 锁对象
        Object obj = new Object();

        new Thread() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++) {
                    // 加上同步代码块锁住
                    synchronized (obj) {
                        System.out.print("犯");
                        System.out.print("我");
                        System.out.print("中");
                        System.out.print("华");
                        System.out.print("者");
                        System.out.println();
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    //加上同步代码块锁住
                    synchronized (obj) {
                        System.out.print("虽");
                        System.out.print("远");
                        System.out.print("必");
                        System.out.print("诛");
                        System.out.println();
                    }
                }
            }
        };
    }
}

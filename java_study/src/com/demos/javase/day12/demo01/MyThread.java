package com.demos.javase.day12.demo01;

public class MyThread extends Thread{
    public MyThread() {
    }

    /**
     * 重写父类的构造方法,传递线程名称给父类
     *
     * @param name
     */
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println(getName() + "线程正在执行: " + i);
        }
    }
}

package com.demos.javase.day12.demo09;

public class Ticket implements Runnable {

    private Integer ticket = 100;

    @Override
    public void run() {
        while(true) {
            if (ticket <= 0) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第：" + (101 - ticket) + "张票");
            ticket--;
        }
    }
}

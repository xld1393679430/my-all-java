package com.demos.javase.day09.demo01;

/**
 * 内部类
 */
public class Demo01 {
    public static void main(String[] args) {
        Computer computer = new Computer();

        Computer.CPU cpu = computer.new CPU();
        cpu.run();
    }
}

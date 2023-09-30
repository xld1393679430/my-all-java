package com.demos.javase.day08.demo05;

import java.util.Properties;

/**
 * System类
 */
public class Demo05 {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        Properties property  = System.getProperties();
        System.out.println("property = " + property);
    }
}

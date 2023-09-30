package com.demos.javase.day16.demo01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Java实现UDP应用程序
 * 常用方法如下：
 * public static InetAddress getByName(String host)：根据主机名获取InetAddress对象
 * public String getHostName()：获取该对象对应的主机名
 * public String getHostAddress()获取该对象对应的IP地址
 */
public class Demo01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress t1 = InetAddress.getByName("localhost");
        System.out.println(t1.getHostName());
        System.out.println(t1.getHostAddress());

        System.out.println("-----------");
        InetAddress t2 = InetAddress.getByName("www.baidu.com");
        System.out.println(t2.getHostName());
        System.out.println(t2.getHostAddress());
    }
}

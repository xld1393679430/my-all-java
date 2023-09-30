package com.demos.javase.day16.demo02;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * DatagramPacket类
 * java.net.DatagramPacket类用于封装一个UDP数据报文
 *
 * public DatagramPacket(byte[] buf, int length, InetAddress address, int port)：创建一个数据包对象
 * buf：要发送的内容
 * length：要发送的内容⻓度，单位字节
 * address：接收端的ip地址
 * port：接收端⼝号
 * public DatagramPacket(byte buf[], int length)：创建一个数据包对象
 *
 * 常用方法
 * public synchronized int getLength()：获取此UDP数据包载荷的数据长度（单位字节）
 * public synchronized int getPort()：获取此UDP数据包的目的端口号
 * public synchronized byte[] getData() ：获取此UDP数据包的载荷部分（数据）
 */
public class Demo02 {
    public static void main(String[] args) throws UnknownHostException {
        byte[] date1 = "hello~".getBytes();
        DatagramPacket packet1 = new DatagramPacket(date1, date1.length);

        byte[] data2 = "你好".getBytes();
        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket packet2 = new DatagramPacket(data2, data2.length, address, 6868);
        System.out.println("packet2.getLength() => " + packet2.getLength());
        System.out.println("packet2.getPort() => " + packet2.getPort());
        System.out.println("packet2.getData() => " + packet2.getData());
    }
}

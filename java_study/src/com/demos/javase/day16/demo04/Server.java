package com.demos.javase.day16.demo04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 */
public class Server {
    public static void main(String[] args) throws IOException {
        // 创建一个服务器，并指定该TCP程序端口（IP地址就是本机）
        ServerSocket serverSocket = new ServerSocket(6969);

        System.out.println("等待客户端：");

        // 接收客户端（若没有客户端进来连接服务器，则程序阻塞在此）
        Socket client = serverSocket.accept();

        // 获取与客户端的输入流（用于读取客户端的数据）
        InputStream is = client.getInputStream();

        // 获取与客户端的输入流（用于读取客户端发送的数据）
        OutputStream os = client.getOutputStream();

        byte[] bytes = new byte[1024];

        // 读取客户端的数据
        int len = is.read(bytes);

        System.out.println(new String(bytes, 0, len));

        // 向客户端写出数据
        os.write("糖没了，不卖！".getBytes());

        client.close();
        serverSocket.close();

    }
}

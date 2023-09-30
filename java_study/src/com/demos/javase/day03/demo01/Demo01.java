package com.demos.javase.day03.demo01;

/**
 * 1, case 合并
 * 2, case 穿透
 */
public class Demo01 {
    public static void main(String[] args) {
        // Demo_A(1);

        // Demo_A(3);
    }


    public static void Demo_A(int num) {
        switch (num) {
            case 1:
            case 2:
                System.out.println("参数为 1 | 2 ");
                break;
            case 3:
            case 4:
                System.out.println("参数为 3 | 4 ");
                // 没有break 后面的case依旧会执行
            case 5:
                System.out.println("参数为 5");
            default:
                System.out.println("没有参数");
        }
    }
}

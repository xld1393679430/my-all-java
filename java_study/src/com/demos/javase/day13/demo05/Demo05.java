package com.demos.javase.day13.demo05;

/**
 * 递归案例
 * //计算1~num的和，使用递归完成
 */
public class Demo05 {
    public static void main(String[] args) {
        int num = 5;
        int sum = getSum(num);
        System.out.println(sum);
    }

    private static int getSum(int i) {
        if( i == 1 ) {
            return 1;
        }
        return i + getSum(i - 1);
    }
}

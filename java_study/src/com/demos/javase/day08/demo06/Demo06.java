package com.demos.javase.day08.demo06;

import java.math.BigInteger;

/**
 * BigInteger
 * 1, 基于一个Long数值来创建一个BigInteger对象
 * 2, 基于一个字符串来创建一个BigInteger对象
 * public BigInteger add(BigInteger val)：返回值为 (this + val)
 * public BigInteger subtract(BigInteger val)：返回值为 (this - val)
 * public BigInteger multiply(BigInteger val)：返回值为 (this * val)
 * public BigInteger divide(BigInteger val)：返回值为 (this / val)
 * public BigInteger mod(BigInteger m)：返回值为(this % m)
 * public int compareTo(BigInteger val)：如果this的数值比val的大，返回1，否则返回-1，如果相等则返回0
 * <p>
 * 注意
 * 1，BigInteger只能构建整数，不能构建小数，否则会出现程序异常现象；
 * 2，如果两个BigInteger计算的值出现小数时则会出现丢失精度现象；
 * <p>
 * BigDecimal
 * BigInteger是针对大整数的运算，BigDecimal则是针对大型浮点数的运算
 * 值得注意的是，BigDecimal也可以针对大型整数进行运算，也就是包含了BigInteger的绝大部分功能
 * 在大部分场景下我们使用BigDecimal会比较多，他与BigInteger其他特性几乎一样
 */
public class Demo06 {
    public static void main(String[] args) {
        BigInteger bigInteger1 = BigInteger.valueOf(12345678L);

        BigInteger bigInteger2 = new BigInteger("100");
        BigInteger bigInteger3 = new BigInteger("10");
        System.out.println("bigInteger2.add(bigInteger3) => " + bigInteger2.add(bigInteger3));
        System.out.println("bigInteger2.subtract(bigInteger3) => " + bigInteger2.subtract(bigInteger3));
        System.out.println("bigInteger2.multiply(bigInteger3) => " + bigInteger2.multiply(bigInteger3));
        System.out.println("bigInteger2.divide(bigInteger3) => " + bigInteger2.divide(bigInteger3));
        System.out.println("bigInteger2.mod(bigInteger3) => " + bigInteger2.mod(bigInteger3));
        System.out.println("bigInteger2.compareTo(bigInteger3) => " + bigInteger2.compareTo(bigInteger3));

        System.out.println("----------------");

        // BigInteger转换为对应的基本数据类型
        byte b = bigInteger2.byteValue();
        short s = bigInteger2.shortValue();
        int i = bigInteger2.intValue();
        long l = bigInteger2.longValue();
        float f = bigInteger2.floatValue();
        double d = bigInteger2.doubleValue();

        System.out.println("b => " + b);
        System.out.println("s => " + s);
        System.out.println("i => " + i);
        System.out.println("l => " + l);
        System.out.println("f => " + f);
        System.out.println("d => " + d);
    }
}

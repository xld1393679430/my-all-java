package com.demos.javase.day02.demo1;

/**
 * 一 -类型转换
 * 1，自动转换
 * 1.1 将取值范围小的类型 自动提升为取值范围大的类型 。
 * 2，转换规则
 * 2.1 范围小的类型向范围大的类型提升，byte、short、char 运算时直接提升为 int ；
 * 3，强制转换
 * 3.1 将 取值范围大的类型 强制转换成 取值范围小的类型；比较而言，自动转换是Java自动执行的，而强制转换需要我们自己手动执行。
 * 3.2 强制转换格式：数据类型 变量名 = (数据类型)被转数据值;
 * 4，基本运算
 * 4.1 %取余注意事项：取余结果符号与左边符号相同
 * 5, 常量和变量的运算
 */
public class Demo1 {
    public static void main(String[] args) {
        // Demo_A();

        // Demo_B();

        // Demo_C();

        // Demo_D();

        // Demo_E();
    }

    // 1，byte类型和int相加最后得到int类型
    public static void Demo_A() {
        int a = 1;
        byte b = 2;

        int c = a + b;
        System.out.println(c);

    }

    // 2，int类型和double相加最后得到double类型
    public static void Demo_B() {
        int a = 1;
        double b = 2.2;

        double c = a + b;
        System.out.println(c);
    }

    // 3，强制转换
    public static void Demo_C() {
        int a = 1;
        double b = 2.2;

        // c应该是int类型 被强转成了double类型 打印结果：3.2
        double c = (double) (a + b);
        System.out.println(c);

        // i被强转成int类型 打印结果：1
        int i = (int) 1.5;
        System.out.println(i);

    }

    // 4，取余注意事项：取余结果符号与左边符号相同
    public static void Demo_D() {
        System.out.println(5 % 3); // 2
        System.out.println(-5 % 3); // -2
        System.out.println(5 % -3); // 2
        System.out.println(-5 % -3); // -2

    }

    // 5，常量和变量的运算
    /**
     * b3 = 1 + 2 ， 1 和 2 是常量，为固定不变的数据，在编译的时候（编译器javac），
     * 已经确定了 1+2 的结果并没有超过byte类型的取值范围，可以赋值给变量 b3 ，因此b3=1 + 2是正确的。
     * 反之， b4 = b2 + b3 ， b2 和 b3 是变量，变量的值是可能变化的，在编译的时候，
     * 编译器javac不确定b2+b3的void结果是什么，因此会将结果以int类型进行处理，所以int类型不能赋值给byte类型，因此编译失败。
     */
    public static void Demo_E() {
        byte b1 = 1;
        byte b2 = 2;
        byte b3 = 1 + 2;
        // byte b4 = b1 + b2; // b4应该是int类型 会报错 -> java: 不兼容的类型: 从int转换到byte可能会有损失
    }
}


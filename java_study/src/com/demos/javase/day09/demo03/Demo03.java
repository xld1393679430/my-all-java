package com.demos.javase.day09.demo03;

/**
 * Lambda表达式
 * 1,函数式接口
 * 简单来说就是只包含一个抽象方法的特殊接口就是函数式接口，函数式接口通过@FunctionalInterface注解标注
 */
public class Demo03 {
    public static void main(String[] args) {
        method(() -> System.out.println("无参无返回值"));

        // 上面代码等价于
        method(new TestLambda() {
            @Override
            public void run() {
                System.out.println("使用匿名内部类....");
            }
        });
    }

    public static void method(TestLambda testLambda) {
        testLambda.run();
    }
}

interface TestLambda{
    void run();
}

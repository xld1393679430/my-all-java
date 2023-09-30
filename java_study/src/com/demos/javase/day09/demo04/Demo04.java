package com.demos.javase.day09.demo04;

public class Demo04 {
    public static void main(String[] args) {

        method((str) -> System.out.println("使用Lambda表达式：" + str));

        method(new TestLambda() {
            @Override
            public void run(String str) {
                System.out.println("使用匿名内部类：" + str);
            }
        });
    }

    public static void method(TestLambda testLambda) {
        testLambda.run("hello");
    }
}

interface TestLambda {
    void run(String str);
}

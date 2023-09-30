package com.demos.javase.day08.demo02;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateFormat类
 * SimpleDateFormat(String pattern)：用给定的模式和默认语言环境的日期格式符号构造SimpleDateFormat
 * format(Date date)：将Date对象格式化为字符串。
 * parse(String source)：将字符串解析为Date对象。
 *
 *
 */
public class Demo02 {
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd");
        System.out.println("dateFormat = " + dateFormat);

        String dateFormatStr = dateFormat.format(new Date());
        System.out.println("dateFormatStr = " + dateFormatStr);

        String dateStr = "2021年11月12日";
        // 使用格式化对象将字符串变为日期对象
        Date date = dateFormat.parse(dateStr);
        System.out.println("date = " + date);
    }
}

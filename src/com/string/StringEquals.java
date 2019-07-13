package com.string;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/7/10 10:02
 * ==与equals的区别
 * ==是地址比价,equals是值比较,但是object的equals是值比较
 */
public class StringEquals {

    public static void main(String[] args) {
        String a = "hello";
        String c = new String("hello");
        String b="hello"+"hello";
        System.out.println(a==c);
        System.out.println(a==b);
        System.out.println(a==a.intern());

    }
}

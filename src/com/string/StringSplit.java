package com.string;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/7/8 16:32
 */
public class StringSplit {
    /**
     *
     * @param args
     * 第一个空字符是存在的,所以""分割后长度为1
     * ,a,b,,,,除了第一个存在,其他空字符不存在,注意
     */
    public static void main(String[] args) {
        String string = ",a,b,,,,";
        String string2="";
        System.out.println(string.split(",").length);
        System.out.println(string2.split(",").length);
        int i=0;
        i=i++ + i;
        System.out.println(i);
    }
}

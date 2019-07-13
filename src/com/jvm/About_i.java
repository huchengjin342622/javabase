package com.jvm;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.SortedMap;

/**
 * @author 胡承进
 * @version 1.0
 * @date 2019/7/9 12:27
 */
public class About_i {
    public static void main(String[] args) {
        int i=0;
        i=i=i+1;
        System.out.println(i);
        About_i about_i = new About_i();
        about_i.b();
        about_i.c();
    }

    public void a(){
        int i=0;
        i=i++;
        System.out.println(i);
    }

    public void b(){
        int a=1;
        float b=2.0f;
        b=a+b;
        b+=a;
        System.out.println(a);
    }
    public void c(){
        int a=1;
        float b=2.0f;
        a+=b;
        System.out.println(a);
    }
}

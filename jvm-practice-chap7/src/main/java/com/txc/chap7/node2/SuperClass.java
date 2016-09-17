package com.txc.chap7.node2;

/**
 * Created by tanxiaocan on 2016/9/17.
 */
public class SuperClass {
    public SuperClass(){
        System.out.println("SuperClass constructor");
    }
    static {
        System.out.println("SuperClass clinit");
    }
    {
        System.out.println("SuperClass init");
    }
    public static int value = 123;
}

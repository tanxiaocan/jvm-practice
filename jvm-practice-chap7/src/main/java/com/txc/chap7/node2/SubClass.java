package com.txc.chap7.node2;

/**
 * Created by tanxiaocan on 2016/9/17.
 */
public class SubClass extends SuperClass {
    static {
        System.out.println("SubClass clinit");
    }
    public SubClass(){
        System.out.println("SubClass constructor");
    }
    {
        System.out.println(" outer SubClass init");
    }
    static int subValue = 234;
}

package com.txc.chap7.node4;

/**
 * Created by tanxiaocan on 2016/9/17.
 */
public class TestClass {
    public static void main(String[] args){
        ClassLoader classLoader = new CustomerClassLoader();
        try {
            Object user = classLoader.loadClass("com.txc.chap7.node4.User").newInstance();
            System.out.println(user instanceof User);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

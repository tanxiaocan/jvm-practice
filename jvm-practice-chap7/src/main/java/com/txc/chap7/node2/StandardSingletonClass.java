package com.txc.chap7.node2;

/**
 * Created by tanxiaocan on 2016/9/17.
 */
public class StandardSingletonClass {
    private StandardSingletonClass(){}
    private static class SingletonHolder{
        private final static StandardSingletonClass standardSingletonClass = new StandardSingletonClass();
    }
    public final static StandardSingletonClass getSingleton(){
        return SingletonHolder.standardSingletonClass;
    }
}

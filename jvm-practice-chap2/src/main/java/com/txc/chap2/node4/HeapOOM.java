package com.txc.chap2.node4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanxiaocan on 2016/9/16.
 */
public class HeapOOM {
    /*-Xms10m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError*/
    public static void main(String args[]){
        List<Object> list = new ArrayList();
        while (true){
            list.add(new Object());
        }
    }
}

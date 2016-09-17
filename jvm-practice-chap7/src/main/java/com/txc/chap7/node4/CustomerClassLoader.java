package com.txc.chap7.node4;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by tanxiaocan on 2016/9/17.
 */
public class CustomerClassLoader extends ClassLoader {
    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        try{
            String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
            InputStream is = getClass().getResourceAsStream(fileName);
            if(is == null){
                return super.loadClass(name);
            }
            byte[] b = new byte[is.available()];
            is.read(b);
            return defineClass(name,b,0,b.length);
        }catch (IOException e){
            throw new ClassNotFoundException(name);
        }
    }
}

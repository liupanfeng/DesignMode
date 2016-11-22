package com.mycheering.designmode.classloader;

/**
 * Created by lpf on 2016/11/22.
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        ClassLoader loader=ClassLoaderTest.class.getClassLoader();
        while(loader!=null){
            System.out.println(loader.getClass().getName());
            loader=loader.getParent();
        }
        System.out.println(loader);
    }
}

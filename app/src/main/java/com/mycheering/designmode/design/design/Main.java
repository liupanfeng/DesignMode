package com.mycheering.designmode.design.design;

import com.mycheering.designmode.design.design.demo1.ConcreteFactoryA;
import com.mycheering.designmode.design.design.demo1.Factory;

/**
 * Created by lpf on 2016/11/22.
 */
public class Main {

    public static void main(String[] args){
        Factory factoryA=new ConcreteFactoryA();
        factoryA.createProduct().method();
    }
}

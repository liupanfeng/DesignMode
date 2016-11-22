package com.mycheering.designmode.design.design;

import com.mycheering.designmode.design.design.factory.demo1.ConcreteFactoryA;
import com.mycheering.designmode.design.design.factory.demo1.ConcreteProductA;
import com.mycheering.designmode.design.design.factory.demo1.ConcreteProductB;
import com.mycheering.designmode.design.design.factory.demo1.Factory;

/**
 * Created by lpf on 2016/11/22.
 */
public class Main {

    public static void main(String[] args){
        Factory factoryA=new ConcreteFactoryA();
//        factoryA.createProduct().method();
        //通过传入产品类型，来生产产品，这样的方法简洁生动
        factoryA.createProduct(ConcreteProductA.class).method();
        factoryA.createProduct(ConcreteProductB.class).method();
    }
}

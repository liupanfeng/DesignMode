package com.mycheering.designmode.design.design.demo1;

/**
 * Created by lpf on 2016/11/22.
 */
public class ConcreteFactoryB extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
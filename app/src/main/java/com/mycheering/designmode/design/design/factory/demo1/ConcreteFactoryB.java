package com.mycheering.designmode.design.design.factory.demo1;

/**
 * Created by lpf on 2016/11/22.
 */
public class ConcreteFactoryB extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }

    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        return null;
    }
}

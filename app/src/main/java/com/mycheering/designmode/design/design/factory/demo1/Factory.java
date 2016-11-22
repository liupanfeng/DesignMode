package com.mycheering.designmode.design.design.factory.demo1;

/**
 * Created by lpf on 2016/11/22.
 * 有的时候，需要用到反射来生产产品，此时我们需要传入一个class来决定生产那个产品
 */
public abstract class Factory {

    /**
     * 抽象工厂
     * 生成产品的抽象方法
     * @return
     */
    public abstract Product createProduct();

    /**
     * 抽象工厂方法
     * 具体生产什么由子类去实现
     * @param clz 产品类型
     * @param <T> 具体产品对象
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> clz);

}

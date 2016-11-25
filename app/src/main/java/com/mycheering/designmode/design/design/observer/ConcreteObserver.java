package com.mycheering.designmode.design.design.observer;

/**
 * Created by lpf on 2016/11/25.
 */
public class ConcreteObserver implements Observer {

    private String observerState;

    @Override
    public void update(String state) {
        observerState=state;
        System.out.println("状态为："+observerState);
    }
}

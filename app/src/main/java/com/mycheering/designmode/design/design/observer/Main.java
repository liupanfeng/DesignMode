package com.mycheering.designmode.design.design.observer;

/**
 * Created by lpf on 2016/11/25.
 */
public class Main {

    public static void main(String[] args) {

        //创建主题对象   所有的observer关注一个主题，主题变化后，通知所有的observer
        ConcreteSubject concreteSubject=new ConcreteSubject();
        Observer observer=new ConcreteObserver();
        concreteSubject.attach(observer);
        concreteSubject.change("new state");

    }
}

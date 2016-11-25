package com.mycheering.designmode.design.design.observer;

/**
 * Created by lpf on 2016/11/25.
 */
public class ConcreteSubject extends Subject {


    private String state;
    public String getState() {
        return state;
    }

    public void change(String newState){
        state=newState;
        System.out.println("主题状态为："+state);
        this.notifyObservers(newState);
    }

}

package com.mycheering.designmode.design.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lpf on 2016/11/25.
 */
public abstract class Subject {
    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> list=new ArrayList();

    public void attach (Observer observer){
        list.add(observer);
        System.out.println("Attached an observer!!!");
    }


    public void detach(Observer observer){
        if(list.contains(observer)){
            list.remove(observer);
        }
    }

    public void notifyObservers(String newState){
        for(Observer observer:list){
            observer.update(newState);
        }
    }

}

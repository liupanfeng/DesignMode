package com.mycheering.designmode.design.design.iterator;

/**
 * Created by lpf on 2016/11/23.
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler2")){
            System.out.println("ConcreteHandler2 handled");
            return;
        }else {
            System.out.println("ConcreteHandler2不处理向下传递");
            if (successor==null)return;
            successor.handleRequest(condition);
        }
    }
}

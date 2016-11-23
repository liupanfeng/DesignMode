package com.mycheering.designmode.design.design.iterator.demo1;

/**
 * Created by lpf on 2016/11/23.
 */
public class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler3")){
            System.out.println("ConcreteHandler3 handled");
            return;
        }else{
            System.out.println("ConcreteHandler3不处理向下传递");
            if (successor==null)return;
            successor.handleRequest(condition);
        }
    }
}

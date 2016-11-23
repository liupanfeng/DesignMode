package com.mycheering.designmode.design.design.iterator.demo1;

/**
 * Created by lpf on 2016/11/23.
 * 具体的处理角色，对请求进行处理，如果不能处理，则转发请求到下一个节点上的处理对象
 */
public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler1")){ //是自己自己处理，不是自己，继续传递，或者直接不处理直接传递
            System.out.println("ConcreteHandler1 handled");
            return;
        }else{
            System.out.println("ConcreteHandler1不处理向下传递");
            if (successor==null)return;
            successor.handleRequest(condition);
        }
    }
}

package com.mycheering.designmode.design.design.iterator;

/**
 * Created by lpf on 2016/11/23.
 */
public class Main {

    public static void main(String[] args){
        Handler handler1=new ConcreteHandler1();
        Handler handler2=new ConcreteHandler2();
        Handler handler3=new ConcreteHandler3();

        ///////////////////////////////////////////////////////设置下个节点方式
        //设置handler1的下一个节点
        handler1.successor=handler2;
        //设置handler2的下个节点
        handler2.successor=handler3;

        handler1.handleRequest("ConcreteHandler");
    }
}

package com.mycheering.designmode.design.design.iterator.demo1;

/**
 * Created by lpf on 2016/11/23.
 * 抽象角色，声明一个请求处理的方法，并在其中保持一个对下一个节点处理的对象，这是一个简化版的责任链模式
 */
public abstract class Handler {
    protected Handler successor;                                //下个节点处理者，这个关键是抽象类本身
    /**
     * 请求处理
     * @param condition 请求条件
     */
    public abstract void handleRequest(String condition);

}

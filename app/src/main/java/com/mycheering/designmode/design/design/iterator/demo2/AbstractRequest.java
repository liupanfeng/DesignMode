package com.mycheering.designmode.design.design.iterator.demo2;

/**
 * Created by lpf on 2016/11/23.
 */
public abstract class AbstractRequest {

    private Object obj;         //处理对象

    public AbstractRequest(Object obj) {
        this.obj = obj;
    }

    /**
     * 获取处理的内容对象
     * @return 内容对象
     */
    public Object getContent() {
        return obj;
    }

    /**
     * 获取请求级别
     * @return 请求级别
     */
    public abstract int getRequestLevel();

}

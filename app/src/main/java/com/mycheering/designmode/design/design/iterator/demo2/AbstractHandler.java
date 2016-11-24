package com.mycheering.designmode.design.design.iterator.demo2;

/**
 * Created by lpf on 2016/11/23.
 * 这种情况下，我们将责任转发逻辑由抽象处理类控制，而对于抽象请求者，其内部也声明一个获取请求级别的方法，
 * 其与抽象处理者中返回的处理级别保持对应，什么级别的处理逻辑就对象什么级别的请求级别
 */
public abstract class AbstractHandler {

    protected AbstractHandler nextHandler;                  //下一个节点

    public final void handleRequest(AbstractRequest request){

        //判断当前的处理级别和请求者的处理级别是否一致
        if (getHandleLevel()==request.getRequestLevel()){
            //一致则由该处理对象处理
            handle(request);

        }else {
            //否则将请求发送到下一个节点上的请求对象
            if (nextHandler!=null){
                nextHandler.handle(request);
            }else {
                //当所有的处理对象均不能处理该级别请求的时候输出
                System.out.println("All of handler can not handle the request!");
            }
        }
    }

    /**
     * 获取处理者对象的处理级别
     * @return 处理级别
     */
    protected abstract int getHandleLevel();

    protected abstract void handle(AbstractRequest request);
}

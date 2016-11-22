package com.mycheering.designmode.design.design.strategy;

/**
 * Created by lpf on 2016/11/22.
 */
public class Main {
    public static void main(String[] args){
        MemberStrategy memberStrategy=new AdvancedMemberStrategy();
        double price=memberStrategy.calcPrice(35);
        System.out.println("35元的图书高级会员打折后的价钱是："+price+"元");
    }
}

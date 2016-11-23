package com.mycheering.designmode.design.design.strategy;

/**
 * Created by lpf on 2016/11/22.
 */
public class MiddleMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double bookPrice) {
        System.out.println("对于中级会员的折扣为10%");
        return bookPrice*0.9;
    }
}

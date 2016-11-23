package com.mycheering.designmode.design.design.strategy;

/**
 * Created by lpf on 2016/11/22.
 */
public class AdvancedMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double bookPrice) {
        System.out.println("对于高级会员的折扣为20%");
        return bookPrice*0.8;
    }
}

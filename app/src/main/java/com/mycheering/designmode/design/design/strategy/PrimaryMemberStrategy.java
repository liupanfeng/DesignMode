package com.mycheering.designmode.design.design.strategy;

/**
 * Created by lpf on 2016/11/22.
 */
public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double bookPrice) {
        System.out.println("对于初级会员没有折扣");
        return bookPrice;
    }
}

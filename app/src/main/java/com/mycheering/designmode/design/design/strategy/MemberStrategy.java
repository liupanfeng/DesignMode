package com.mycheering.designmode.design.design.strategy;

/**
 * Created by lpf on 2016/11/22.
 * 会员策略
 */
public interface MemberStrategy {
    /**
     * 计算图书的价格
     * 会员策略
     * @param bookPrice
     * @return
     */
    double calcPrice(double bookPrice);
}

package com.mycheering.designmode.design.design.state;

/**
 * Created by lpf on 2016/11/22.
 */
public class PowerOnState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("下个频道");

    }

    @Override
    public void preChannel() {
        System.out.println("上个频道");
    }

    @Override
    public void turnUp() {
        System.out.println("调大音量");
    }

    @Override
    public void turnDown() {
        System.out.println("调小音量");
    }
}

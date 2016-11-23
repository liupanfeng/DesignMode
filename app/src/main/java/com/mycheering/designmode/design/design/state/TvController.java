package com.mycheering.designmode.design.design.state;

/**
 * Created by lpf on 2016/11/22.
 */
public class TvController implements PowerController{

    private TvState tvState;

    public void setTvState(TvState tvState) {
        this.tvState = tvState;
    }

    @Override
    public void powerOn() {
        System.out.println("电视开机了");
        setTvState(new PowerOnState());
    }

    @Override
    public void powerOff() {
        System.out.println("电视关机了");
        setTvState(new PowerOffState());
    }

    public void nextChannel(){
        tvState.nextChannel();
    }

    public void preChannel(){
        tvState.preChannel();
    }

    public void turnUp(){
        tvState.turnUp();
    }

    public void turnDown(){
        tvState.turnDown();
    }
}

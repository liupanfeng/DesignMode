package com.mycheering.designmode.design.design.state;

/**
 * Created by lpf on 2016/11/22.
 */
public class Main {
    public static void main(String[] args){
        TvController tvController=new TvController();
        tvController.powerOn();
        tvController.turnUp();
        tvController.turnDown();
        tvController.nextChannel();
        tvController.preChannel();
        tvController.powerOff();
        tvController.turnDown();
    }
}

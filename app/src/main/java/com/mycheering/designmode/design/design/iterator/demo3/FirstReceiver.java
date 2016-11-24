package com.mycheering.designmode.design.design.iterator.demo3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by lpf on 2016/11/24.
 * priority 值越大优先级越大
 * 全局责任链机制，通过有序广播的这个机制
 */
public class FirstReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        int limit=intent.getIntExtra("limit",-1001);
        //如果限制值等于1000则进行处理
        if (limit==1000){
            //获取intent中附加的字符串并弹出
            String message=intent.getStringExtra("msg");
            Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
            //终止广播
            abortBroadcast();
        }else{
            //添加信息发给下一个receiver
            Bundle b=new Bundle();
            b.putString("new","message form firstReceiver");
            setResultExtras(b);
        }
    }
}

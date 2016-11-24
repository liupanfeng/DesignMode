package com.mycheering.designmode.design.design.iterator.demo3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by lpf on 2016/11/24.
 */
public class SecondReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //获取intent中附件的限制值
        int limit=intent.getIntExtra("limit",-1001);
        //如果限制值==100则处理否则转给下一个receiver
        if (limit==100){
            String message=intent.getStringExtra("msg");
            //获取上一个的附件信息
            Bundle b=getResultExtras(true);
            String str=b.getString("new");
            Toast.makeText(context,message+"---"+str,Toast.LENGTH_SHORT).show();
            abortBroadcast();
        }else {
            //添加信息发送给下一个recevier
            Bundle b=new Bundle();
            b.putString("new","message form SecondReceiver!");
            setResultExtras(b);
        }
    }
}

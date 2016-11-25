package com.mycheering.designmode;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import org.apache.http.client.methods.HttpGet;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSend;
    private ImageView ivPic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //使用raw路径下的文件 示例
        ivPic=(ImageView)findViewById(R.id.iv_pic);
        InputStream is=getResources().openRawResource(R.raw.tian);
        Bitmap bitmap= BitmapFactory.decodeStream(is);
        ivPic.setImageBitmap(bitmap);

//        //使用assets路径中文件  示例
//        AssetManager am = getAssets();
//        InputStream isAssets=null;
//        try {
//             isAssets = am.open("tian");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Bitmap bitmapAssets= BitmapFactory.decodeStream(isAssets);
//        ivPic.setImageBitmap(bitmapAssets);



        btnSend=(Button)findViewById(R.id.btn_send);
        btnSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent();
        intent.setAction("com.lpf.action.ORDER_BROADCAST");
        intent.putExtra("limit",100);
        intent.putExtra("msg","message from MainActivity!");
        sendOrderedBroadcast(intent,null);
    }
}

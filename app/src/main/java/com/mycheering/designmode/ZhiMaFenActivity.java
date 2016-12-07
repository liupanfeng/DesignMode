package com.mycheering.designmode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mycheering.designmode.view.RoundIndicatorView;

public class ZhiMaFenActivity extends AppCompatActivity {


    private RoundIndicatorView roundIndicatorView;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhi_ma_fen);
        roundIndicatorView = (RoundIndicatorView) findViewById(R.id.my_view);

        editText = (EditText) findViewById(R.id.edit);
        button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a =Integer.valueOf(editText.getText().toString());
                roundIndicatorView.setCurrentNumAnim(a);
            }
        });
    }
}

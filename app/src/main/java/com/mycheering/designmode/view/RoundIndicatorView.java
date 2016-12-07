package com.mycheering.designmode.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.mycheering.designmode.R;

/**
 * Created by liupf on 2016/12/7.
 */

public class RoundIndicatorView extends View {

    private Paint paint;
    private Paint paint_2;
    private Paint paint_3;
    private Paint paint_4;
    private Context context;
    private int maxNum;
    private int startAngle;
    private int sweepAngle;
    private int radius;
    private int mWidth;
    private int mHeight;
    private int sweepInWidth;//内圆的宽度
    private int sweepOutWidth;//外圆的宽度
    private int currentNum=0;//需设置setter、getter 供属性动画使用
    private String[] text ={"较差","中等","良好","优秀","极好"};
    private int[] indicatorColor = {0xffffffff,0x00ffffff,0x99ffffff,0xffffffff};

    public RoundIndicatorView(Context context) {
        this(context,null);
    }

    public RoundIndicatorView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public RoundIndicatorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context=context;
        //设置背景颜色  可以直接使用16进制的颜色表示
        setBackgroundColor(0xFFFF6347);
        //初始化属性
        initAttr(attrs);
        //初始化画笔
        initPaint();
    }

    private void initPaint() {
    }

    /**
     * 初始化属性值
     * @param attrs
     */
    private void initAttr(AttributeSet attrs) {
        //获取typedArray
        TypedArray array=context.obtainStyledAttributes(attrs, R.styleable.RoundIndicatorView);
        maxNum=array.getInt(R.styleable.RoundIndicatorView_maxNum,500);

    }
}

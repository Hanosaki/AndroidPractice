package com.example.sigure.flickeventprctice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Sigure on 2016/11/07.
 * Canvas機能を使うためのViewクラス
 */

public class CustomView extends View {

    float yubiX=0,yubiY=0;

    public CustomView(Context context){
        super(context);
        //インスタンス、Viewを描画する場所のみ取得
    }

    public CustomView(Context context , AttributeSet attributeSet){
        super(context,attributeSet);
        //インスタンス、レイアウト情報も取得
    }

    ///画面に描画する処理
    @Override
    protected void onDraw(Canvas canvas){
        canvas.drawColor(Color.BLACK);
        Paint paint = new Paint();
        paint.setColor(Color.GREEN);
        for(int i = 0;i<5;++i){
            paint.setStrokeWidth(i+1);
            canvas.drawLine(yubiX, yubiY, 20*i+210, 20*i+10, paint);
        }

        float[] pts = {50,0,50,30};
        canvas.drawLines(pts,paint);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec , int heightMesureSpec){
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMesureSpec);
        setMeasuredDimension(widthSize,heightSize);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        yubiX = event.getX();
        yubiY = event.getY();
        invalidate();
        return true;
    }

}

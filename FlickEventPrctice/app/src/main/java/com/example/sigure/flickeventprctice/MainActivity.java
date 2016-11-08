package com.example.sigure.flickeventprctice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.TextView);
    }

    ///タッチされている座標を取得し、表示する
    @Override
    public boolean onTouchEvent(MotionEvent event){
        textView.setText("X:"+event.getX() + "Y:" + event.getY());
        return true;
    }

}

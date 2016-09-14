package com.george.summer.myshudu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Administrator on 2016/9/13.
 */
public class Shudu extends View {

    public Shudu(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint backgroundPaint = new Paint();
        backgroundPaint.setColor(getResources().getColor(R.color.background));

        canvas.drawRect(0,0,getWidth(),getHeight(),backgroundPaint);
    }
}

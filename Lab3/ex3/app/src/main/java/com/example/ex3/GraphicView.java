package com.example.ex3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class GraphicView extends View {
    Bitmap[] frames=new Bitmap[5];
    int i=0;
    public GraphicView(Context context) {
        super(context);
        frames[0]=BitmapFactory.decodeResource(getResources(),R.drawable.img_1);
        frames[1]=BitmapFactory.decodeResource(getResources(),R.drawable.img_2);
        frames[2]=BitmapFactory.decodeResource(getResources(),R.drawable.img_3);
        frames[3]=BitmapFactory.decodeResource(getResources(),R.drawable.img_4);
        frames[4]=BitmapFactory.decodeResource(getResources(),R.drawable.img_5);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(i<5){
            canvas.drawBitmap(frames[i],40,40,new Paint());
        }
        else {
            i=0;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        i++;
        invalidate();
        return super.onTouchEvent(event);
    }
}

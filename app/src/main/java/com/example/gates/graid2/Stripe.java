package com.example.gates.graid2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.Paint;

/**
 * Created by ray on 3/17/16.
 */
public class Stripe extends Drawable {

    private int stripeColor;

    public Stripe(int stripeColor) {
        this.stripeColor = stripeColor;
    }

    @Override
    public void draw(Canvas canvas) {

        //Create the stripes
        Rect bounds = getBounds();

        int width = bounds.right - bounds.left;
        int height = bounds.bottom - bounds.top;

        //Customize the stripe
        Paint backgroundPaint = new Paint();
        canvas.drawRect(width,width,height,height,backgroundPaint);
    }

    @Override
    public void setAlpha(int alpha) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return 0;
    }
}

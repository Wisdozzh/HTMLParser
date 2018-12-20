//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.zzhoujay.html.style;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.style.ReplacementSpan;

public class ZCodeSpan  extends ReplacementSpan {
    private static final int DEFAULT_BACKGROUND_COLOR = Color.parseColor("#F4F4F5");
    private static final int DEFAULT_TEXT_COLOR = Color.parseColor("#24292E");
    private static final float RADIUS = 10.0F;
    private static final float PADDING_HORIZONTAL = 16.0F;
    private static final float PADDING_VERTICAL = 2.0F;
    private static final float MARGIN = 8.0F;
    private static final float TEXT_SIZE_SCALE = 0.92F;
    private Drawable mBackground;
    private int mWidth;
    private int mHeight;
    private int mTextColor;

    public ZCodeSpan() {
        this(DEFAULT_BACKGROUND_COLOR, DEFAULT_TEXT_COLOR);
    }

    public ZCodeSpan(int backgroundColor, int textColor) {
        GradientDrawable d = new GradientDrawable();
        d.setColor(backgroundColor);
        d.setCornerRadius(10.0F);
        this.mBackground = d;
        this.mTextColor = textColor;
    }

    public int getSize(Paint paint, CharSequence text, int start, int end, FontMetricsInt fm) {
        this.mHeight = paint.getFontMetricsInt().descent - paint.getFontMetricsInt().ascent;
        float size = paint.getTextSize();
        paint.setTextSize(size * 0.92F);
        paint.setTypeface(Typeface.MONOSPACE);
        this.mWidth = (int)(paint.measureText(text, start, end) + 32.0F + 16.0F);
        if (fm != null) {
            fm.top = (int)((float)fm.top - 2.0F);
            fm.bottom = (int)((float)fm.bottom + 2.0F);
        }

        paint.setTextSize(size);
        return this.mWidth;
    }

    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        float size = paint.getTextSize();
        paint.setTextSize(size * 0.92F);
        paint.setTypeface(Typeface.MONOSPACE);
        this.mBackground.setBounds((int)(x + 8.0F), (int)((float)top - 2.0F), (int)(x + (float)this.mWidth - 8.0F), (int)((float)(top + this.mHeight) + 2.0F));
        this.mBackground.draw(canvas);
        int color = paint.getColor();
        paint.setColor(this.mTextColor);
        canvas.drawText(text, start, end, x + 8.0F + 16.0F, (float)y - (float)this.mHeight * 0.07999998F * 0.5F, paint);
        paint.setColor(color);
        paint.setTextSize(size);
    }
}

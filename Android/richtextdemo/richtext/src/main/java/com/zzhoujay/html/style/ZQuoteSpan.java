//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.zzhoujay.html.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.text.Layout;
import android.text.style.QuoteSpan;

public class ZQuoteSpan extends QuoteSpan {
    private static final int STRIPE_WIDTH = 15;
    private static final int GAP_WIDTH = 40;

    public ZQuoteSpan() {
        this(-3355444);
    }

    public ZQuoteSpan(int color) {
        super(color);
    }

    public void drawLeadingMargin(Canvas c, Paint p, int x, int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout layout) {
        Style style = p.getStyle();
        int color = p.getColor();
        p.setStyle(Style.FILL);
        p.setColor(this.getColor());
        c.drawRect((float)x, (float)top, (float)(x + dir * 15), (float)bottom, p);
        p.setStyle(style);
        p.setColor(color);
    }

    public int getLeadingMargin(boolean first) {
        return 55;
    }
}

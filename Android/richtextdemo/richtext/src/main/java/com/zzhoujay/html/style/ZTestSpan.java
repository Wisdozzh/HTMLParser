//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.zzhoujay.html.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

public class ZTestSpan implements LeadingMarginSpan {
    public ZTestSpan() {
    }

    public int getLeadingMargin(boolean first) {
        return 0;
    }

    public void drawLeadingMargin(Canvas c, Paint p, int x, int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout layout) {
        c.drawRect((float)x, (float)top, (float)layout.getWidth(), (float)bottom, new Paint(-16777216));
    }
}

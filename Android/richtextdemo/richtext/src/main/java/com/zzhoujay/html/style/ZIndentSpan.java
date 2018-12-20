//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.zzhoujay.html.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

public class ZIndentSpan implements LeadingMarginSpan {
    private final int mIndent;

    public ZIndentSpan(int mIndent) {
        this.mIndent = mIndent;
    }

    public int getLeadingMargin(boolean first) {
        return first ? this.mIndent : 0;
    }

    public void drawLeadingMargin(Canvas c, Paint p, int x, int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout layout) {
    }
}

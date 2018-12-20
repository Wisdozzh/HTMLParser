//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.zzhoujay.html.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Paint.Style;
import android.graphics.Path.Direction;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.BulletSpan;

public class ZBulletSpan  extends BulletSpan {
    public static final int STANDARD_GAP_WIDTH = 15;
    private static final int BULLET_RADIUS = 5;
    private static Path sBulletPath = null;
    private final int mGapWidth;
    private final boolean mWantColor;
    private final int mColor;

    public ZBulletSpan() {
        this.mGapWidth = 15;
        this.mWantColor = false;
        this.mColor = 0;
    }

    public ZBulletSpan(int gapWidth) {
        super(gapWidth);
        this.mGapWidth = gapWidth;
        this.mWantColor = false;
        this.mColor = 0;
    }

    public ZBulletSpan(int gapWidth, int color) {
        super(gapWidth, color);
        this.mGapWidth = gapWidth;
        this.mWantColor = true;
        this.mColor = color;
    }

    public int getLeadingMargin(boolean first) {
        return 10 + this.mGapWidth;
    }

    public void drawLeadingMargin(Canvas c, Paint p, int x, int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout l) {
        if (((Spanned)text).getSpanStart(this) == start) {
            Style style = p.getStyle();
            int oldcolor = 0;
            if (this.mWantColor) {
                oldcolor = p.getColor();
                p.setColor(this.mColor);
            }

            p.setStyle(Style.FILL);
            if (c.isHardwareAccelerated()) {
                if (sBulletPath == null) {
                    sBulletPath = new Path();
                    sBulletPath.addCircle(0.0F, 0.0F, 6.0F, Direction.CW);
                }

                c.save();
                c.translate((float)(x + dir * 5), (float)(top + bottom) / 2.0F);
                c.drawPath(sBulletPath, p);
                c.restore();
            } else {
                c.drawCircle((float)(x + dir * 5), (float)(top + bottom) / 2.0F, 5.0F, p);
            }

            if (this.mWantColor) {
                p.setColor(oldcolor);
            }

            p.setStyle(style);
        }

    }
}

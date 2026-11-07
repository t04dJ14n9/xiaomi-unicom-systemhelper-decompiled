package android.support.v4.widget;

import android.graphics.Paint;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.view.ActionMode;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static int a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    private static int c(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    public static e0.a.C0024a d(TextView textView) {
        return new e0.a.C0024a(textView.getTextMetricsParams());
    }

    public static void e(TextView textView, int i2) {
        f0.j.a(i2);
        textView.setFirstBaselineToTopHeight(i2);
    }

    public static void f(TextView textView, int i2) {
        f0.j.a(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void g(TextView textView, int i2) {
        f0.j.a(i2);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i2 != fontMetricsInt) {
            textView.setLineSpacing(i2 - fontMetricsInt, 1.0f);
        }
    }

    public static void h(TextView textView, e0.a aVar) {
        textView.setText(aVar.a());
    }

    public static void i(TextView textView, e0.a.C0024a c0024a) {
        textView.setTextDirection(c(c0024a.c()));
        textView.getPaint().set(c0024a.d());
        textView.setBreakStrategy(c0024a.a());
        textView.setHyphenationFrequency(c0024a.b());
    }

    public static ActionMode.Callback j(TextView textView, ActionMode.Callback callback) {
        return callback;
    }
}

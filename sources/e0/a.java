package e0;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import f0.i;

/* JADX INFO: loaded from: classes.dex */
public class a implements Spannable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f2433d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Spannable f2434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PrecomputedText f2435c;

    /* JADX INFO: renamed from: e0.a$a, reason: collision with other inner class name */
    public static final class C0024a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextPaint f2436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f2437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f2438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f2439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f2440e;

        public C0024a(PrecomputedText.Params params) {
            this.f2436a = params.getTextPaint();
            this.f2437b = params.getTextDirection();
            this.f2438c = params.getBreakStrategy();
            this.f2439d = params.getHyphenationFrequency();
            this.f2440e = params;
        }

        public int a() {
            return this.f2438c;
        }

        public int b() {
            return this.f2439d;
        }

        public TextDirectionHeuristic c() {
            return this.f2437b;
        }

        public TextPaint d() {
            return this.f2436a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || !(obj instanceof C0024a)) {
                return false;
            }
            C0024a c0024a = (C0024a) obj;
            PrecomputedText.Params params = this.f2440e;
            if (params != null) {
                return params.equals(c0024a.f2440e);
            }
            if (this.f2438c != c0024a.a() || this.f2439d != c0024a.b() || this.f2437b != c0024a.c() || this.f2436a.getTextSize() != c0024a.d().getTextSize() || this.f2436a.getTextScaleX() != c0024a.d().getTextScaleX() || this.f2436a.getTextSkewX() != c0024a.d().getTextSkewX() || this.f2436a.getLetterSpacing() != c0024a.d().getLetterSpacing() || !TextUtils.equals(this.f2436a.getFontFeatureSettings(), c0024a.d().getFontFeatureSettings()) || this.f2436a.getFlags() != c0024a.d().getFlags() || !this.f2436a.getTextLocales().equals(c0024a.d().getTextLocales())) {
                return false;
            }
            if (this.f2436a.getTypeface() == null) {
                if (c0024a.d().getTypeface() != null) {
                    return false;
                }
            } else if (!this.f2436a.getTypeface().equals(c0024a.d().getTypeface())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return i.a(Float.valueOf(this.f2436a.getTextSize()), Float.valueOf(this.f2436a.getTextScaleX()), Float.valueOf(this.f2436a.getTextSkewX()), Float.valueOf(this.f2436a.getLetterSpacing()), Integer.valueOf(this.f2436a.getFlags()), this.f2436a.getTextLocales(), this.f2436a.getTypeface(), Boolean.valueOf(this.f2436a.isElegantTextHeight()), this.f2437b, Integer.valueOf(this.f2438c), Integer.valueOf(this.f2439d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f2436a.getTextSize());
            sb.append(", textScaleX=" + this.f2436a.getTextScaleX());
            sb.append(", textSkewX=" + this.f2436a.getTextSkewX());
            sb.append(", letterSpacing=" + this.f2436a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f2436a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f2436a.getTextLocales());
            sb.append(", typeface=" + this.f2436a.getTypeface());
            sb.append(", variationSettings=" + this.f2436a.getFontVariationSettings());
            sb.append(", textDir=" + this.f2437b);
            sb.append(", breakStrategy=" + this.f2438c);
            sb.append(", hyphenationFrequency=" + this.f2439d);
            sb.append("}");
            return sb.toString();
        }
    }

    public PrecomputedText a() {
        Spannable spannable = this.f2434b;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i2) {
        return this.f2434b.charAt(i2);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f2434b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f2434b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f2434b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        return (T[]) this.f2435c.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f2434b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f2434b.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        this.f2435c.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        this.f2435c.setSpan(obj, i2, i3, i4);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        return this.f2434b.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f2434b.toString();
    }
}

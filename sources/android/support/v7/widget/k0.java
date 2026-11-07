package android.support.v7.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
class k0 extends Resources {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f1438a;

    public k0(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1438a = resources;
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i2) {
        return this.f1438a.getAnimation(i2);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i2) {
        return this.f1438a.getBoolean(i2);
    }

    @Override // android.content.res.Resources
    public int getColor(int i2) {
        return this.f1438a.getColor(i2);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i2) {
        return this.f1438a.getColorStateList(i2);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f1438a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i2) {
        return this.f1438a.getDimension(i2);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i2) {
        return this.f1438a.getDimensionPixelOffset(i2);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i2) {
        return this.f1438a.getDimensionPixelSize(i2);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f1438a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i2) {
        return this.f1438a.getDrawable(i2);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i2, Resources.Theme theme) {
        return this.f1438a.getDrawable(i2, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i2, int i3) {
        return this.f1438a.getDrawableForDensity(i2, i3);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i2, int i3, Resources.Theme theme) {
        return this.f1438a.getDrawableForDensity(i2, i3, theme);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i2, int i3, int i4) {
        return this.f1438a.getFraction(i2, i3, i4);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f1438a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i2) {
        return this.f1438a.getIntArray(i2);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i2) {
        return this.f1438a.getInteger(i2);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i2) {
        return this.f1438a.getLayout(i2);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i2) {
        return this.f1438a.getMovie(i2);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i2, int i3) {
        return this.f1438a.getQuantityString(i2, i3);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i2, int i3, Object... objArr) {
        return this.f1438a.getQuantityString(i2, i3, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i2, int i3) {
        return this.f1438a.getQuantityText(i2, i3);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i2) {
        return this.f1438a.getResourceEntryName(i2);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i2) {
        return this.f1438a.getResourceName(i2);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i2) {
        return this.f1438a.getResourcePackageName(i2);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i2) {
        return this.f1438a.getResourceTypeName(i2);
    }

    @Override // android.content.res.Resources
    public String getString(int i2) {
        return this.f1438a.getString(i2);
    }

    @Override // android.content.res.Resources
    public String getString(int i2, Object... objArr) {
        return this.f1438a.getString(i2, objArr);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i2) {
        return this.f1438a.getStringArray(i2);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i2) {
        return this.f1438a.getText(i2);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i2, CharSequence charSequence) {
        return this.f1438a.getText(i2, charSequence);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i2) {
        return this.f1438a.getTextArray(i2);
    }

    @Override // android.content.res.Resources
    public void getValue(int i2, TypedValue typedValue, boolean z2) {
        this.f1438a.getValue(i2, typedValue, z2);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z2) {
        this.f1438a.getValue(str, typedValue, z2);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i2, int i3, TypedValue typedValue, boolean z2) {
        this.f1438a.getValueForDensity(i2, i3, typedValue, z2);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i2) {
        return this.f1438a.getXml(i2);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f1438a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i2) {
        return this.f1438a.obtainTypedArray(i2);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i2) {
        return this.f1438a.openRawResource(i2);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i2, TypedValue typedValue) {
        return this.f1438a.openRawResource(i2, typedValue);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i2) {
        return this.f1438a.openRawResourceFd(i2);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f1438a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f1438a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f1438a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }
}

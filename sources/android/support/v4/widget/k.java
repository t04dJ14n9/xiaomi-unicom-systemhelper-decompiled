package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f729j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f730k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private LayoutInflater f731l;

    @Deprecated
    public k(Context context, int i2, Cursor cursor, boolean z2) {
        super(context, cursor, z2);
        this.f730k = i2;
        this.f729j = i2;
        this.f731l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // android.support.v4.widget.d
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f731l.inflate(this.f730k, viewGroup, false);
    }

    @Override // android.support.v4.widget.d
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f731l.inflate(this.f729j, viewGroup, false);
    }
}

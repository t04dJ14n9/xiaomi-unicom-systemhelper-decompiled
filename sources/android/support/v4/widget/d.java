package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends BaseAdapter implements Filterable, e.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Cursor f719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Context f720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected a f722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected DataSetObserver f723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected e f724i;

    private class a extends ContentObserver {
        a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            d.this.h();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            d dVar = d.this;
            dVar.f717b = true;
            dVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            d dVar = d.this;
            dVar.f717b = false;
            dVar.notifyDataSetInvalidated();
        }
    }

    public d(Context context, Cursor cursor, boolean z2) {
        e(context, cursor, z2 ? 1 : 2);
    }

    @Override // android.support.v4.widget.e.a
    public void a(Cursor cursor) {
        Cursor cursorI = i(cursor);
        if (cursorI != null) {
            cursorI.close();
        }
    }

    @Override // android.support.v4.widget.e.a
    public Cursor b() {
        return this.f719d;
    }

    @Override // android.support.v4.widget.e.a
    public abstract CharSequence convertToString(Cursor cursor);

    public abstract void d(View view, Context context, Cursor cursor);

    void e(Context context, Cursor cursor, int i2) {
        b bVar;
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.f718c = true;
        } else {
            this.f718c = false;
        }
        boolean z2 = cursor != null;
        this.f719d = cursor;
        this.f717b = z2;
        this.f720e = context;
        this.f721f = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i2 & 2) == 2) {
            this.f722g = new a();
            bVar = new b();
        } else {
            bVar = null;
            this.f722g = null;
        }
        this.f723h = bVar;
        if (z2) {
            a aVar = this.f722g;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f723h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f717b || (cursor = this.f719d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f717b) {
            return null;
        }
        this.f719d.moveToPosition(i2);
        if (view == null) {
            view = f(this.f720e, this.f719d, viewGroup);
        }
        d(view, this.f720e, this.f719d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f724i == null) {
            this.f724i = new e(this);
        }
        return this.f724i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f717b || (cursor = this.f719d) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f719d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        Cursor cursor;
        if (this.f717b && (cursor = this.f719d) != null && cursor.moveToPosition(i2)) {
            return this.f719d.getLong(this.f721f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f717b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f719d.moveToPosition(i2)) {
            if (view == null) {
                view = g(this.f720e, this.f719d, viewGroup);
            }
            d(view, this.f720e, this.f719d);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i2);
    }

    protected void h() {
        Cursor cursor;
        if (!this.f718c || (cursor = this.f719d) == null || cursor.isClosed()) {
            return;
        }
        this.f717b = this.f719d.requery();
    }

    public Cursor i(Cursor cursor) {
        Cursor cursor2 = this.f719d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.f722g;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f723h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f719d = cursor;
        if (cursor != null) {
            a aVar2 = this.f722g;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f723h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f721f = cursor.getColumnIndexOrThrow("_id");
            this.f717b = true;
            notifyDataSetChanged();
        } else {
            this.f721f = -1;
            this.f717b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}

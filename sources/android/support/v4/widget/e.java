package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: loaded from: classes.dex */
class e extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    a f727a;

    interface a {
        void a(Cursor cursor);

        Cursor b();

        Cursor c(CharSequence charSequence);

        CharSequence convertToString(Cursor cursor);
    }

    e(a aVar) {
        this.f727a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f727a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorC = this.f727a.c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorC != null) {
            filterResults.count = cursorC.getCount();
        } else {
            filterResults.count = 0;
            cursorC = null;
        }
        filterResults.values = cursorC;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorB = this.f727a.b();
        Object obj = filterResults.values;
        if (obj == null || obj == cursorB) {
            return;
        }
        this.f727a.a((Cursor) obj);
    }
}

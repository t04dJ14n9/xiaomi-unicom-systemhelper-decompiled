package android.support.v7.widget;

import android.R;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class n0 extends android.support.v4.widget.k implements View.OnClickListener {
    private int A;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SearchManager f1473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SearchView f1474n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final SearchableInfo f1475o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Context f1476p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f1477q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f1478r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f1479s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1480t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ColorStateList f1481u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f1482v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f1483w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f1484x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f1485y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f1486z;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f1487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f1488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f1489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f1490d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f1491e;

        public a(View view) {
            this.f1487a = (TextView) view.findViewById(R.id.text1);
            this.f1488b = (TextView) view.findViewById(R.id.text2);
            this.f1489c = (ImageView) view.findViewById(R.id.icon1);
            this.f1490d = (ImageView) view.findViewById(R.id.icon2);
            this.f1491e = (ImageView) view.findViewById(j0.f.f3108q);
        }
    }

    public n0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1479s = false;
        this.f1480t = 1;
        this.f1482v = -1;
        this.f1483w = -1;
        this.f1484x = -1;
        this.f1485y = -1;
        this.f1486z = -1;
        this.A = -1;
        this.f1473m = (SearchManager) this.f720e.getSystemService("search");
        this.f1474n = searchView;
        this.f1475o = searchableInfo;
        this.f1478r = searchView.getSuggestionCommitIconResId();
        this.f1476p = context;
        this.f1477q = weakHashMap;
    }

    private void A(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable j(String str) {
        Drawable.ConstantState constantState = this.f1477q.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence k(CharSequence charSequence) {
        if (this.f1481u == null) {
            TypedValue typedValue = new TypedValue();
            this.f720e.getTheme().resolveAttribute(j0.a.J, typedValue, true);
            this.f1481u = this.f720e.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1481u, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable l(ComponentName componentName) {
        String string;
        PackageManager packageManager = this.f720e.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            string = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
            Log.w("SuggestionsAdapter", string);
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            string = e2.toString();
        }
    }

    private Drawable m(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f1477q.containsKey(strFlattenToShortString)) {
            Drawable drawableL = l(componentName);
            this.f1477q.put(strFlattenToShortString, drawableL != null ? drawableL.getConstantState() : null);
            return drawableL;
        }
        Drawable.ConstantState constantState = this.f1477q.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f1476p.getResources());
    }

    public static String n(Cursor cursor, String str) {
        return v(cursor, cursor.getColumnIndex(str));
    }

    private Drawable o(Cursor cursor) {
        Drawable drawableM = m(this.f1475o.getSearchActivity());
        return drawableM != null ? drawableM : this.f720e.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable p(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return q(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f1476p.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e2) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
                }
                return drawableCreateFromStream;
            } catch (Throwable th) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e3) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e3);
                }
                throw th;
            }
        } catch (FileNotFoundException e4) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e4.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e4.getMessage());
        return null;
    }

    private Drawable r(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i2 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1476p.getPackageName() + "/" + i2;
            Drawable drawableJ = j(str2);
            if (drawableJ != null) {
                return drawableJ;
            }
            Drawable drawableB = y.a.b(this.f1476p, i2);
            z(str2, drawableB);
            return drawableB;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableJ2 = j(str);
            if (drawableJ2 != null) {
                return drawableJ2;
            }
            Drawable drawableP = p(Uri.parse(str));
            z(str, drawableP);
            return drawableP;
        }
    }

    private Drawable s(Cursor cursor) {
        int i2 = this.f1485y;
        if (i2 == -1) {
            return null;
        }
        Drawable drawableR = r(cursor.getString(i2));
        return drawableR != null ? drawableR : o(cursor);
    }

    private Drawable t(Cursor cursor) {
        int i2 = this.f1486z;
        if (i2 == -1) {
            return null;
        }
        return r(cursor.getString(i2));
    }

    private static String v(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    private void x(ImageView imageView, Drawable drawable, int i2) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i2);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    private void z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1477q.put(str, drawable.getConstantState());
        }
    }

    @Override // android.support.v4.widget.d, android.support.v4.widget.e.a
    public void a(Cursor cursor) {
        if (this.f1479s) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f1482v = cursor.getColumnIndex("suggest_text_1");
                this.f1483w = cursor.getColumnIndex("suggest_text_2");
                this.f1484x = cursor.getColumnIndex("suggest_text_2_url");
                this.f1485y = cursor.getColumnIndex("suggest_icon_1");
                this.f1486z = cursor.getColumnIndex("suggest_icon_2");
                this.A = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // android.support.v4.widget.e.a
    public Cursor c(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f1474n.getVisibility() == 0 && this.f1474n.getWindowVisibility() == 0) {
            try {
                Cursor cursorU = u(this.f1475o, string, 50);
                if (cursorU != null) {
                    cursorU.getCount();
                    return cursorU;
                }
            } catch (RuntimeException e2) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e2);
            }
        }
        return null;
    }

    @Override // android.support.v4.widget.d, android.support.v4.widget.e.a
    public CharSequence convertToString(Cursor cursor) {
        String strN;
        String strN2;
        if (cursor == null) {
            return null;
        }
        String strN3 = n(cursor, "suggest_intent_query");
        if (strN3 != null) {
            return strN3;
        }
        if (this.f1475o.shouldRewriteQueryFromData() && (strN2 = n(cursor, "suggest_intent_data")) != null) {
            return strN2;
        }
        if (!this.f1475o.shouldRewriteQueryFromText() || (strN = n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strN;
    }

    @Override // android.support.v4.widget.d
    public void d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i2 = this.A;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        if (aVar.f1487a != null) {
            y(aVar.f1487a, v(cursor, this.f1482v));
        }
        if (aVar.f1488b != null) {
            String strV = v(cursor, this.f1484x);
            CharSequence charSequenceK = strV != null ? k(strV) : v(cursor, this.f1483w);
            if (TextUtils.isEmpty(charSequenceK)) {
                TextView textView = aVar.f1487a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1487a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1487a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1487a.setMaxLines(1);
                }
            }
            y(aVar.f1488b, charSequenceK);
        }
        ImageView imageView = aVar.f1489c;
        if (imageView != null) {
            x(imageView, s(cursor), 4);
        }
        ImageView imageView2 = aVar.f1490d;
        if (imageView2 != null) {
            x(imageView2, t(cursor), 8);
        }
        int i4 = this.f1480t;
        if (i4 != 2 && (i4 != 1 || (i3 & 1) == 0)) {
            aVar.f1491e.setVisibility(8);
            return;
        }
        aVar.f1491e.setVisibility(0);
        aVar.f1491e.setTag(aVar.f1487a.getText());
        aVar.f1491e.setOnClickListener(this);
    }

    @Override // android.support.v4.widget.k, android.support.v4.widget.d
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewG = super.g(context, cursor, viewGroup);
        viewG.setTag(new a(viewG));
        ((ImageView) viewG.findViewById(j0.f.f3108q)).setImageResource(this.f1478r);
        return viewG;
    }

    @Override // android.support.v4.widget.d, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewF = f(this.f720e, this.f719d, viewGroup);
            if (viewF != null) {
                ((a) viewF.getTag()).f1487a.setText(e2.toString());
            }
            return viewF;
        }
    }

    @Override // android.support.v4.widget.d, android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewG = g(this.f720e, this.f719d, viewGroup);
            if (viewG != null) {
                ((a) viewG.getTag()).f1487a.setText(e2.toString());
            }
            return viewG;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        A(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        A(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1474n.Q((CharSequence) tag);
        }
    }

    Drawable q(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f720e.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor u(SearchableInfo searchableInfo, String str, int i2) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i2 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i2));
        }
        return this.f720e.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void w(int i2) {
        this.f1480t = i2;
    }
}

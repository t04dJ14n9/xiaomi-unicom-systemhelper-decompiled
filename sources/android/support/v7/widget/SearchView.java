package android.support.v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends g0 implements m0.c {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    static final k f1194o0 = new k();
    private Rect A;
    private Rect B;
    private int[] C;
    private int[] D;
    private final ImageView E;
    private final Drawable F;
    private final int G;
    private final int H;
    private final Intent I;
    private final Intent J;
    private final CharSequence K;
    View.OnFocusChangeListener L;
    private View.OnClickListener M;
    private boolean N;
    private boolean O;
    android.support.v4.widget.d P;
    private boolean Q;
    private CharSequence R;
    private boolean S;
    private boolean T;
    private int U;
    private boolean V;
    private CharSequence W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private CharSequence f1195a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f1196b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f1197c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    SearchableInfo f1198d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private Bundle f1199e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final Runnable f1200f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private Runnable f1201g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f1202h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final View.OnClickListener f1203i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    View.OnKeyListener f1204j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final TextView.OnEditorActionListener f1205k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f1206l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f1207m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private TextWatcher f1208n0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final SearchAutoComplete f1209q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final View f1210r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final View f1211s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final View f1212t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final ImageView f1213u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final ImageView f1214v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final ImageView f1215w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final ImageView f1216x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final View f1217y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private p f1218z;

    public static class SearchAutoComplete extends android.support.v7.widget.d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f1219e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private SearchView f1220f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f1221g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final Runnable f1222h;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.b();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, j0.a.f3039p);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.f1222h = new a();
            this.f1219e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        boolean a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void b() {
            if (this.f1221g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1221g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1219e <= 0 || super.enoughToFilter();
        }

        @Override // android.support.v7.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1221g) {
                removeCallbacks(this.f1222h);
                post(this.f1222h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z2, int i2, Rect rect) {
            super.onFocusChanged(z2, i2, rect);
            this.f1220f.V();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1220f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z2) {
            super.onWindowFocusChanged(z2);
            if (z2 && this.f1220f.hasFocus() && getVisibility() == 0) {
                this.f1221g = true;
                if (SearchView.I(getContext())) {
                    SearchView.f1194o0.c(this, true);
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z2) {
                this.f1221g = false;
                removeCallbacks(this.f1222h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1221g = true;
                    return;
                }
                this.f1221g = false;
                removeCallbacks(this.f1222h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f1220f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f1219e = i2;
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            SearchView.this.U(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.b0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            android.support.v4.widget.d dVar = SearchView.this.P;
            if (dVar == null || !(dVar instanceof n0)) {
                return;
            }
            dVar.a(null);
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z2) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.L;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z2);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            SearchView.this.x();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1213u) {
                searchView.R();
                return;
            }
            if (view == searchView.f1215w) {
                searchView.N();
                return;
            }
            if (view == searchView.f1214v) {
                searchView.S();
            } else if (view == searchView.f1216x) {
                searchView.W();
            } else if (view == searchView.f1209q) {
                searchView.D();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1198d0 == null) {
                return false;
            }
            if (searchView.f1209q.isPopupShowing() && SearchView.this.f1209q.getListSelection() != -1) {
                return SearchView.this.T(view, i2, keyEvent);
            }
            if (SearchView.this.f1209q.a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.L(0, null, searchView2.f1209q.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            SearchView.this.S();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.O(i2, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.P(i2);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Method f1234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f1235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f1236c;

        k() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1234a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1235b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1236c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1235b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f1234a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView, boolean z2) {
            Method method = this.f1236c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.valueOf(z2));
                } catch (Exception unused) {
                }
            }
        }
    }

    public interface l {
    }

    public interface m {
    }

    public interface n {
    }

    static class o extends g0.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f1237d;

        static class a implements Parcelable.ClassLoaderCreator<o> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public o[] newArray(int i2) {
                return new o[i2];
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1237d = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1237d + "}";
        }

        @Override // g0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeValue(Boolean.valueOf(this.f1237d));
        }
    }

    private static class p extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f1238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f1239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Rect f1240c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f1241d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f1242e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f1243f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1242e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1239b = new Rect();
            this.f1241d = new Rect();
            this.f1240c = new Rect();
            a(rect, rect2);
            this.f1238a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1239b.set(rect);
            this.f1241d.set(rect);
            Rect rect3 = this.f1241d;
            int i2 = this.f1242e;
            rect3.inset(-i2, -i2);
            this.f1240c.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003f  */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z2;
            float width;
            int height;
            boolean z3;
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z4 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z3 = this.f1243f;
                    if (z3 && !this.f1241d.contains(x2, y2)) {
                        z4 = z3;
                        z2 = false;
                    }
                } else if (action != 3) {
                    z2 = true;
                    z4 = false;
                } else {
                    z3 = this.f1243f;
                    this.f1243f = false;
                }
                z4 = z3;
                z2 = true;
            } else if (this.f1239b.contains(x2, y2)) {
                this.f1243f = true;
                z2 = true;
            } else {
                z2 = true;
                z4 = false;
            }
            if (!z4) {
                return false;
            }
            if (!z2 || this.f1240c.contains(x2, y2)) {
                Rect rect = this.f1240c;
                width = x2 - rect.left;
                height = y2 - rect.top;
            } else {
                width = this.f1238a.getWidth() / 2;
                height = this.f1238a.getHeight() / 2;
            }
            motionEvent.setLocation(width, height);
            return this.f1238a.dispatchTouchEvent(motionEvent);
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j0.a.G);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A = new Rect();
        this.B = new Rect();
        this.C = new int[2];
        this.D = new int[2];
        this.f1200f0 = new b();
        this.f1201g0 = new c();
        this.f1202h0 = new WeakHashMap<>();
        f fVar = new f();
        this.f1203i0 = fVar;
        this.f1204j0 = new g();
        h hVar = new h();
        this.f1205k0 = hVar;
        i iVar = new i();
        this.f1206l0 = iVar;
        j jVar = new j();
        this.f1207m0 = jVar;
        this.f1208n0 = new a();
        t0 t0VarT = t0.t(context, attributeSet, j0.j.b2, i2, 0);
        LayoutInflater.from(context).inflate(t0VarT.m(j0.j.l2, j0.g.f3135r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(j0.f.C);
        this.f1209q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1210r = findViewById(j0.f.f3116y);
        View viewFindViewById = findViewById(j0.f.B);
        this.f1211s = viewFindViewById;
        View viewFindViewById2 = findViewById(j0.f.I);
        this.f1212t = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(j0.f.f3114w);
        this.f1213u = imageView;
        ImageView imageView2 = (ImageView) findViewById(j0.f.f3117z);
        this.f1214v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(j0.f.f3115x);
        this.f1215w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(j0.f.D);
        this.f1216x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(j0.f.A);
        this.E = imageView5;
        g0.m.s(viewFindViewById, t0VarT.f(j0.j.m2));
        g0.m.s(viewFindViewById2, t0VarT.f(j0.j.q2));
        int i3 = j0.j.p2;
        imageView.setImageDrawable(t0VarT.f(i3));
        imageView2.setImageDrawable(t0VarT.f(j0.j.j2));
        imageView3.setImageDrawable(t0VarT.f(j0.j.g2));
        imageView4.setImageDrawable(t0VarT.f(j0.j.s2));
        imageView5.setImageDrawable(t0VarT.f(i3));
        this.F = t0VarT.f(j0.j.o2);
        v0.a(imageView, getResources().getString(j0.h.f3148l));
        this.G = t0VarT.m(j0.j.r2, j0.g.f3134q);
        this.H = t0VarT.m(j0.j.h2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1208n0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1204j0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(t0VarT.a(j0.j.k2, true));
        int iE = t0VarT.e(j0.j.d2, -1);
        if (iE != -1) {
            setMaxWidth(iE);
        }
        this.K = t0VarT.o(j0.j.i2);
        this.R = t0VarT.o(j0.j.n2);
        int iJ = t0VarT.j(j0.j.f2, -1);
        if (iJ != -1) {
            setImeOptions(iJ);
        }
        int iJ2 = t0VarT.j(j0.j.e2, -1);
        if (iJ2 != -1) {
            setInputType(iJ2);
        }
        setFocusable(t0VarT.a(j0.j.c2, true));
        t0VarT.u();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.J = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1217y = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        g0(this.N);
        c0();
    }

    private Intent A(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1199e0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent B(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void C() {
        this.f1209q.dismissDropDown();
    }

    private void E(View view, Rect rect) {
        view.getLocationInWindow(this.C);
        getLocationInWindow(this.D);
        int[] iArr = this.C;
        int i2 = iArr[1];
        int[] iArr2 = this.D;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    private CharSequence F(CharSequence charSequence) {
        if (!this.N || this.F == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f1209q.getTextSize()) * 1.25d);
        this.F.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.F), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean G() {
        Intent intent;
        SearchableInfo searchableInfo = this.f1198d0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        if (this.f1198d0.getVoiceSearchLaunchWebSearch()) {
            intent = this.I;
        } else {
            intent = this.f1198d0.getVoiceSearchLaunchRecognizer() ? this.J : null;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean I(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean J() {
        return (this.Q || this.V) && !H();
    }

    private void K(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e2) {
            Log.e("SearchView", "Failed launch activity: " + intent, e2);
        }
    }

    private boolean M(int i2, int i3, String str) {
        Cursor cursorB = this.P.b();
        if (cursorB == null || !cursorB.moveToPosition(i2)) {
            return false;
        }
        K(z(cursorB, i3, str));
        return true;
    }

    private void X() {
        post(this.f1200f0);
    }

    private void Y(int i2) {
        CharSequence charSequenceConvertToString;
        Editable text = this.f1209q.getText();
        Cursor cursorB = this.P.b();
        if (cursorB == null) {
            return;
        }
        if (!cursorB.moveToPosition(i2) || (charSequenceConvertToString = this.P.convertToString(cursorB)) == null) {
            setQuery(text);
        } else {
            setQuery(charSequenceConvertToString);
        }
    }

    private void a0() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f1209q.getText());
        if (!z3 && (!this.N || this.f1196b0)) {
            z2 = false;
        }
        this.f1215w.setVisibility(z2 ? 0 : 8);
        Drawable drawable = this.f1215w.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void c0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1209q;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(F(queryHint));
    }

    private void d0() {
        this.f1209q.setThreshold(this.f1198d0.getSuggestThreshold());
        this.f1209q.setImeOptions(this.f1198d0.getImeOptions());
        int inputType = this.f1198d0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1198d0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1209q.setInputType(inputType);
        android.support.v4.widget.d dVar = this.P;
        if (dVar != null) {
            dVar.a(null);
        }
        if (this.f1198d0.getSuggestAuthority() != null) {
            n0 n0Var = new n0(getContext(), this, this.f1198d0, this.f1202h0);
            this.P = n0Var;
            this.f1209q.setAdapter(n0Var);
            ((n0) this.P).w(this.S ? 2 : 1);
        }
    }

    private void e0() {
        this.f1212t.setVisibility((J() && (this.f1214v.getVisibility() == 0 || this.f1216x.getVisibility() == 0)) ? 0 : 8);
    }

    private void f0(boolean z2) {
        this.f1214v.setVisibility((this.Q && J() && hasFocus() && (z2 || !this.V)) ? 0 : 8);
    }

    private void g0(boolean z2) {
        this.O = z2;
        int i2 = z2 ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.f1209q.getText());
        this.f1213u.setVisibility(i2);
        f0(z3);
        this.f1210r.setVisibility(z2 ? 8 : 0);
        this.E.setVisibility((this.E.getDrawable() == null || this.N) ? 8 : 0);
        a0();
        h0(!z3);
        e0();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(j0.d.f3064g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(j0.d.f3065h);
    }

    private void h0(boolean z2) {
        int i2 = 8;
        if (this.V && !H() && z2) {
            this.f1214v.setVisibility(8);
            i2 = 0;
        }
        this.f1216x.setVisibility(i2);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1209q.setText(charSequence);
        this.f1209q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private Intent y(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1195a0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1199e0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1198d0.getSearchActivity());
        return intent;
    }

    private Intent z(Cursor cursor, int i2, String str) {
        int position;
        String strN;
        try {
            String strN2 = n0.n(cursor, "suggest_intent_action");
            if (strN2 == null) {
                strN2 = this.f1198d0.getSuggestIntentAction();
            }
            if (strN2 == null) {
                strN2 = "android.intent.action.SEARCH";
            }
            String str2 = strN2;
            String strN3 = n0.n(cursor, "suggest_intent_data");
            if (strN3 == null) {
                strN3 = this.f1198d0.getSuggestIntentData();
            }
            if (strN3 != null && (strN = n0.n(cursor, "suggest_intent_data_id")) != null) {
                strN3 = strN3 + "/" + Uri.encode(strN);
            }
            return y(str2, strN3 == null ? null : Uri.parse(strN3), n0.n(cursor, "suggest_intent_extra_data"), n0.n(cursor, "suggest_intent_query"), i2, str);
        } catch (RuntimeException e2) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e2);
            return null;
        }
    }

    void D() {
        k kVar = f1194o0;
        kVar.b(this.f1209q);
        kVar.a(this.f1209q);
    }

    public boolean H() {
        return this.O;
    }

    void L(int i2, String str, String str2) {
        getContext().startActivity(y("android.intent.action.SEARCH", null, null, str2, i2, str));
    }

    void N() {
        if (!TextUtils.isEmpty(this.f1209q.getText())) {
            this.f1209q.setText("");
            this.f1209q.requestFocus();
            this.f1209q.setImeVisibility(true);
        } else if (this.N) {
            clearFocus();
            g0(true);
        }
    }

    boolean O(int i2, int i3, String str) {
        M(i2, 0, null);
        this.f1209q.setImeVisibility(false);
        C();
        return true;
    }

    boolean P(int i2) {
        Y(i2);
        return true;
    }

    void Q(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void R() {
        g0(false);
        this.f1209q.requestFocus();
        this.f1209q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.M;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void S() {
        Editable text = this.f1209q.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f1198d0 != null) {
            L(0, null, text.toString());
        }
        this.f1209q.setImeVisibility(false);
        C();
    }

    boolean T(View view, int i2, KeyEvent keyEvent) {
        if (this.f1198d0 != null && this.P != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return O(this.f1209q.getListSelection(), 0, null);
            }
            if (i2 == 21 || i2 == 22) {
                this.f1209q.setSelection(i2 == 21 ? 0 : this.f1209q.length());
                this.f1209q.setListSelection(0);
                this.f1209q.clearListSelection();
                f1194o0.c(this.f1209q, true);
                return true;
            }
            if (i2 == 19) {
                this.f1209q.getListSelection();
                return false;
            }
        }
        return false;
    }

    void U(CharSequence charSequence) {
        Editable text = this.f1209q.getText();
        this.f1195a0 = text;
        boolean z2 = !TextUtils.isEmpty(text);
        f0(z2);
        h0(!z2);
        a0();
        e0();
        this.W = charSequence.toString();
    }

    void V() {
        g0(H());
        X();
        if (this.f1209q.hasFocus()) {
            D();
        }
    }

    void W() {
        Intent intentA;
        SearchableInfo searchableInfo = this.f1198d0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                intentA = B(this.I, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                intentA = A(this.J, searchableInfo);
            }
            getContext().startActivity(intentA);
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public void Z(CharSequence charSequence, boolean z2) {
        this.f1209q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1209q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1195a0 = charSequence;
        }
        if (!z2 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        S();
    }

    void b0() {
        int[] iArr = this.f1209q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1211s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1212t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.T = true;
        super.clearFocus();
        this.f1209q.clearFocus();
        this.f1209q.setImeVisibility(false);
        this.T = false;
    }

    public int getImeOptions() {
        return this.f1209q.getImeOptions();
    }

    public int getInputType() {
        return this.f1209q.getInputType();
    }

    public int getMaxWidth() {
        return this.U;
    }

    public CharSequence getQuery() {
        return this.f1209q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.R;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1198d0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.K : getContext().getText(this.f1198d0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.H;
    }

    int getSuggestionRowLayout() {
        return this.G;
    }

    public android.support.v4.widget.d getSuggestionsAdapter() {
        return this.P;
    }

    @Override // m0.c
    public void onActionViewCollapsed() {
        Z("", false);
        clearFocus();
        g0(true);
        this.f1209q.setImeOptions(this.f1197c0);
        this.f1196b0 = false;
    }

    @Override // m0.c
    public void onActionViewExpanded() {
        if (this.f1196b0) {
            return;
        }
        this.f1196b0 = true;
        int imeOptions = this.f1209q.getImeOptions();
        this.f1197c0 = imeOptions;
        this.f1209q.setImeOptions(imeOptions | 33554432);
        this.f1209q.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f1200f0);
        post(this.f1201g0);
        super.onDetachedFromWindow();
    }

    @Override // android.support.v7.widget.g0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            E(this.f1209q, this.A);
            Rect rect = this.B;
            Rect rect2 = this.A;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            p pVar = this.f1218z;
            if (pVar != null) {
                pVar.a(this.B, this.A);
                return;
            }
            p pVar2 = new p(this.B, this.A, this.f1209q);
            this.f1218z = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    @Override // android.support.v7.widget.g0, android.view.View
    protected void onMeasure(int i2, int i3) {
        int preferredWidth;
        int mode;
        int size;
        if (H()) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = this.U;
                if (size2 <= 0) {
                    size2 = getPreferredWidth();
                }
            } else if (mode2 == 1073741824 && (preferredWidth = this.U) > 0) {
            }
            mode = View.MeasureSpec.getMode(i3);
            size = View.MeasureSpec.getSize(i3);
            if (mode != Integer.MIN_VALUE) {
                size = Math.min(getPreferredHeight(), size);
            } else if (mode == 0) {
                size = getPreferredHeight();
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        }
        preferredWidth = this.U;
        if (preferredWidth <= 0) {
            preferredWidth = getPreferredWidth();
        }
        size2 = Math.min(preferredWidth, size2);
        mode = View.MeasureSpec.getMode(i3);
        size = View.MeasureSpec.getSize(i3);
        if (mode != Integer.MIN_VALUE) {
            size = Math.min(getPreferredHeight(), size);
        } else if (mode == 0) {
            size = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        g0(oVar.f1237d);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f1237d = H();
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        X();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (this.T || !isFocusable()) {
            return false;
        }
        if (H()) {
            return super.requestFocus(i2, rect);
        }
        boolean zRequestFocus = this.f1209q.requestFocus(i2, rect);
        if (zRequestFocus) {
            g0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1199e0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            N();
        } else {
            R();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.N == z2) {
            return;
        }
        this.N = z2;
        g0(z2);
        c0();
    }

    public void setImeOptions(int i2) {
        this.f1209q.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f1209q.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.U = i2;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.L = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.M = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.R = charSequence;
        c0();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.S = z2;
        android.support.v4.widget.d dVar = this.P;
        if (dVar instanceof n0) {
            ((n0) dVar).w(z2 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1198d0 = searchableInfo;
        if (searchableInfo != null) {
            d0();
            c0();
        }
        boolean zG = G();
        this.V = zG;
        if (zG) {
            this.f1209q.setPrivateImeOptions("nm");
        }
        g0(H());
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.Q = z2;
        g0(H());
    }

    public void setSuggestionsAdapter(android.support.v4.widget.d dVar) {
        this.P = dVar;
        this.f1209q.setAdapter(dVar);
    }

    void x() {
        if (this.f1217y.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1211s.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = x0.b(this);
            int dimensionPixelSize = this.N ? resources.getDimensionPixelSize(j0.d.f3062e) + resources.getDimensionPixelSize(j0.d.f3063f) : 0;
            this.f1209q.getDropDownBackground().getPadding(rect);
            int i2 = rect.left;
            this.f1209q.setDropDownHorizontalOffset(zB ? -i2 : paddingLeft - (i2 + dimensionPixelSize));
            this.f1209q.setDropDownWidth((((this.f1217y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}

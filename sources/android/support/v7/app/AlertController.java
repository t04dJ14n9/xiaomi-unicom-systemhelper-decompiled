package android.support.v7.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.g0;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import g0.m;
import j0.j;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final i0.c f733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Window f734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ListView f738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f744m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Button f746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Message f748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f749r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Button f750s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f751t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Message f752u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f753v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Button f754w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f755x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Message f756y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f757z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f745n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f759c;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.Y1);
            this.f759c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.Z1, -1);
            this.f758b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.a2, -1);
        }

        public void a(boolean z2, boolean z3) {
            if (z3 && z2) {
                return;
            }
            setPadding(getPaddingLeft(), z2 ? getPaddingTop() : this.f758b, getPaddingRight(), z3 ? getPaddingBottom() : this.f759c);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            if ((view != alertController.f746o || (message2 = alertController.f748q) == null) && (view != alertController.f750s || (message2 = alertController.f752u) == null)) {
                messageObtain = (view != alertController.f754w || (message = alertController.f756y) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f733b).sendToTarget();
        }
    }

    public static class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f762b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f764d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f766f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f767g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f768h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f769i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f770j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f771k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f772l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f773m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f774n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f775o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f776p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f777q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f779s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f780t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f781u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f782v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f783w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f784x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f785y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f786z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f763c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f765e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean O = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f778r = true;

        class a extends ArrayAdapter<CharSequence> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ RecycleListView f787b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i2, int i3, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i2, i3, charSequenceArr);
                this.f787b = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i2, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i2, view, viewGroup);
                boolean[] zArr = b.this.F;
                if (zArr != null && zArr[i2]) {
                    this.f787b.setItemChecked(i2, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: android.support.v7.app.AlertController$b$b, reason: collision with other inner class name */
        class C0006b extends CursorAdapter {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f789b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f790c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ RecycleListView f791d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ AlertController f792e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0006b(Context context, Cursor cursor, boolean z2, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z2);
                this.f791d = recycleListView;
                this.f792e = alertController;
                Cursor cursor2 = getCursor();
                this.f789b = cursor2.getColumnIndexOrThrow(b.this.L);
                this.f790c = cursor2.getColumnIndexOrThrow(b.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f789b));
                this.f791d.setItemChecked(cursor.getPosition(), cursor.getInt(this.f790c) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f762b.inflate(this.f792e.M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f794b;

            c(AlertController alertController) {
                this.f794b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                b.this.f784x.onClick(this.f794b.f733b, i2);
                if (b.this.H) {
                    return;
                }
                this.f794b.f733b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ RecycleListView f796b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ AlertController f797c;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f796b = recycleListView;
                this.f797c = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                boolean[] zArr = b.this.F;
                if (zArr != null) {
                    zArr[i2] = this.f796b.isItemChecked(i2);
                }
                b.this.J.onClick(this.f797c.f733b, i2, this.f796b.isItemChecked(i2));
            }
        }

        public b(Context context) {
            this.f761a = context;
            this.f762b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Code duplicated, block: B:28:0x008c  */
        /* JADX WARN: Code duplicated, block: B:31:0x0093  */
        /* JADX WARN: Code duplicated, block: B:32:0x0097  */
        /* JADX WARN: Code duplicated, block: B:34:0x009b  */
        private void b(AlertController alertController) {
            ListAdapter dVar;
            AdapterView.OnItemClickListener dVar2;
            AdapterView.OnItemSelectedListener onItemSelectedListener;
            RecycleListView recycleListView = (RecycleListView) this.f762b.inflate(alertController.L, (ViewGroup) null);
            if (this.G) {
                dVar = this.K == null ? new a(this.f761a, alertController.M, R.id.text1, this.f782v, recycleListView) : new C0006b(this.f761a, this.K, false, recycleListView, alertController);
            } else {
                int i2 = this.H ? alertController.N : alertController.O;
                if (this.K != null) {
                    dVar = new SimpleCursorAdapter(this.f761a, i2, this.K, new String[]{this.L}, new int[]{R.id.text1});
                } else {
                    dVar = this.f783w;
                    if (dVar == null) {
                        dVar = new d(this.f761a, i2, R.id.text1, this.f782v);
                    }
                }
            }
            alertController.H = dVar;
            alertController.I = this.I;
            if (this.f784x == null) {
                if (this.J != null) {
                    dVar2 = new d(recycleListView, alertController);
                }
                onItemSelectedListener = this.N;
                if (onItemSelectedListener != null) {
                    recycleListView.setOnItemSelectedListener(onItemSelectedListener);
                }
                if (this.H) {
                    recycleListView.setChoiceMode(1);
                } else if (this.G) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.f738g = recycleListView;
            }
            dVar2 = new c(alertController);
            recycleListView.setOnItemClickListener(dVar2);
            onItemSelectedListener = this.N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.H) {
                recycleListView.setChoiceMode(1);
            } else if (this.G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f738g = recycleListView;
        }

        public void a(AlertController alertController) {
            View view = this.f767g;
            if (view != null) {
                alertController.j(view);
            } else {
                CharSequence charSequence = this.f766f;
                if (charSequence != null) {
                    alertController.o(charSequence);
                }
                Drawable drawable = this.f764d;
                if (drawable != null) {
                    alertController.l(drawable);
                }
                int i2 = this.f763c;
                if (i2 != 0) {
                    alertController.k(i2);
                }
                int i3 = this.f765e;
                if (i3 != 0) {
                    alertController.k(alertController.c(i3));
                }
            }
            CharSequence charSequence2 = this.f768h;
            if (charSequence2 != null) {
                alertController.m(charSequence2);
            }
            CharSequence charSequence3 = this.f769i;
            if (charSequence3 != null || this.f770j != null) {
                alertController.i(-1, charSequence3, this.f771k, null, this.f770j);
            }
            CharSequence charSequence4 = this.f772l;
            if (charSequence4 != null || this.f773m != null) {
                alertController.i(-2, charSequence4, this.f774n, null, this.f773m);
            }
            CharSequence charSequence5 = this.f775o;
            if (charSequence5 != null || this.f776p != null) {
                alertController.i(-3, charSequence5, this.f777q, null, this.f776p);
            }
            if (this.f782v != null || this.K != null || this.f783w != null) {
                b(alertController);
            }
            View view2 = this.f786z;
            if (view2 != null) {
                if (this.E) {
                    alertController.r(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.q(view2);
                    return;
                }
            }
            int i4 = this.f785y;
            if (i4 != 0) {
                alertController.p(i4);
            }
        }
    }

    private static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<DialogInterface> f799a;

        public c(DialogInterface dialogInterface) {
            this.f799a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == -3 || i2 == -2 || i2 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f799a.get(), message.what);
            } else {
                if (i2 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i2, int i3, CharSequence[] charSequenceArr) {
            super(context, i2, i3, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, i0.c cVar, Window window) {
        this.f732a = context;
        this.f733b = cVar;
        this.f734c = window;
        this.R = new c(cVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, j.F, j0.a.f3037n, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(j.G, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(j.I, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(j.K, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(j.L, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(j.N, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(j.J, 0);
        this.P = typedArrayObtainStyledAttributes.getBoolean(j.M, true);
        this.f735d = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.H, 0);
        typedArrayObtainStyledAttributes.recycle();
        cVar.f(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup g(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int h() {
        int i2 = this.K;
        return (i2 != 0 && this.Q == 1) ? i2 : this.J;
    }

    private void n(ViewGroup viewGroup, View view, int i2, int i3) {
        View viewFindViewById = this.f734c.findViewById(j0.f.f3112u);
        View viewFindViewById2 = this.f734c.findViewById(j0.f.f3111t);
        m.x(view, i2, i3);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void s(ViewGroup viewGroup) {
        int i2;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(R.id.button1);
        this.f746o = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f747p) && this.f749r == null) {
            this.f746o.setVisibility(8);
            i2 = 0;
        } else {
            this.f746o.setText(this.f747p);
            Drawable drawable = this.f749r;
            if (drawable != null) {
                int i3 = this.f735d;
                drawable.setBounds(0, 0, i3, i3);
                this.f746o.setCompoundDrawables(this.f749r, null, null, null);
            }
            this.f746o.setVisibility(0);
            i2 = 1;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button2);
        this.f750s = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f751t) && this.f753v == null) {
            this.f750s.setVisibility(8);
        } else {
            this.f750s.setText(this.f751t);
            Drawable drawable2 = this.f753v;
            if (drawable2 != null) {
                int i4 = this.f735d;
                drawable2.setBounds(0, 0, i4, i4);
                this.f750s.setCompoundDrawables(this.f753v, null, null, null);
            }
            this.f750s.setVisibility(0);
            i2 |= 2;
        }
        Button button4 = (Button) viewGroup.findViewById(R.id.button3);
        this.f754w = button4;
        button4.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f755x) && this.f757z == null) {
            this.f754w.setVisibility(8);
        } else {
            this.f754w.setText(this.f755x);
            Drawable drawable3 = this.f749r;
            if (drawable3 != null) {
                int i5 = this.f735d;
                drawable3.setBounds(0, 0, i5, i5);
                this.f746o.setCompoundDrawables(this.f749r, null, null, null);
            }
            this.f754w.setVisibility(0);
            i2 |= 4;
        }
        if (x(this.f732a)) {
            if (i2 == 1) {
                button = this.f746o;
            } else if (i2 == 2) {
                button = this.f750s;
            } else if (i2 == 4) {
                button = this.f754w;
            }
            b(button);
        }
        if (i2 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void t(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f734c.findViewById(j0.f.f3113v);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f737f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f738g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f738g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void u(ViewGroup viewGroup) {
        View viewInflate = this.f739h;
        if (viewInflate == null) {
            viewInflate = this.f740i != 0 ? LayoutInflater.from(this.f732a).inflate(this.f740i, viewGroup, false) : null;
        }
        boolean z2 = viewInflate != null;
        if (!z2 || !a(viewInflate)) {
            this.f734c.setFlags(131072, 131072);
        }
        if (!z2) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f734c.findViewById(j0.f.f3105n);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f745n) {
            frameLayout.setPadding(this.f741j, this.f742k, this.f743l, this.f744m);
        }
        if (this.f738g != null) {
            ((g0.a) viewGroup.getLayoutParams()).f1375a = 0.0f;
        }
    }

    private void v(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f734c.findViewById(j0.f.N).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f734c.findViewById(R.id.icon);
        if (!(!TextUtils.isEmpty(this.f736e)) || !this.P) {
            this.f734c.findViewById(j0.f.N).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f734c.findViewById(j0.f.f3101j);
        this.E = textView;
        textView.setText(this.f736e);
        int i2 = this.B;
        if (i2 != 0) {
            this.D.setImageResource(i2);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
        } else {
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009f A[PHI: r1
      0x009f: PHI (r1v6 android.view.View) = (r1v5 android.view.View), (r1v13 android.view.View) binds: [B:36:0x009d, B:32:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    private void w() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f734c.findViewById(j0.f.f3110s);
        int i2 = j0.f.O;
        View viewFindViewById4 = viewFindViewById3.findViewById(i2);
        int i3 = j0.f.f3104m;
        View viewFindViewById5 = viewFindViewById3.findViewById(i3);
        int i4 = j0.f.f3102k;
        View viewFindViewById6 = viewFindViewById3.findViewById(i4);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(j0.f.f3106o);
        u(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i2);
        View viewFindViewById8 = viewGroup.findViewById(i3);
        View viewFindViewById9 = viewGroup.findViewById(i4);
        ViewGroup viewGroupG = g(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupG2 = g(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupG3 = g(viewFindViewById9, viewFindViewById6);
        t(viewGroupG2);
        s(viewGroupG3);
        v(viewGroupG);
        boolean z2 = viewGroup.getVisibility() != 8;
        boolean z3 = (viewGroupG == null || viewGroupG.getVisibility() == 8) ? 0 : 1;
        boolean z4 = (viewGroupG3 == null || viewGroupG3.getVisibility() == 8) ? false : true;
        if (!z4 && viewGroupG2 != null && (viewFindViewById2 = viewGroupG2.findViewById(j0.f.J)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z3 != 0) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            viewFindViewById = (this.f737f == null && this.f738g == null) ? null : viewGroupG.findViewById(j0.f.M);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
        } else if (viewGroupG2 != null && (viewFindViewById = viewGroupG2.findViewById(j0.f.K)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f738g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z3, z4);
        }
        if (!z2) {
            View view = this.f738g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                n(viewGroupG2, view, z3 | (z4 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f738g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i5 = this.I;
        if (i5 > -1) {
            listView2.setItemChecked(i5, true);
            listView2.setSelection(i5);
        }
    }

    private static boolean x(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(j0.a.f3036m, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i2) {
        TypedValue typedValue = new TypedValue();
        this.f732a.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId;
    }

    public void d() {
        this.f733b.setContentView(h());
        w();
    }

    public boolean e(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.o(keyEvent);
    }

    public boolean f(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.o(keyEvent);
    }

    public void i(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i2, onClickListener);
        }
        if (i2 == -3) {
            this.f755x = charSequence;
            this.f756y = message;
            this.f757z = drawable;
        } else if (i2 == -2) {
            this.f751t = charSequence;
            this.f752u = message;
            this.f753v = drawable;
        } else {
            if (i2 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f747p = charSequence;
            this.f748q = message;
            this.f749r = drawable;
        }
    }

    public void j(View view) {
        this.G = view;
    }

    public void k(int i2) {
        this.C = null;
        this.B = i2;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i2 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void l(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void m(CharSequence charSequence) {
        this.f737f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void o(CharSequence charSequence) {
        this.f736e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(int i2) {
        this.f739h = null;
        this.f740i = i2;
        this.f745n = false;
    }

    public void q(View view) {
        this.f739h = view;
        this.f740i = 0;
        this.f745n = false;
    }

    public void r(View view, int i2, int i3, int i4, int i5) {
        this.f739h = view;
        this.f740i = 0;
        this.f745n = true;
        this.f741j = i2;
        this.f742k = i3;
        this.f743l = i4;
        this.f744m = i5;
    }
}

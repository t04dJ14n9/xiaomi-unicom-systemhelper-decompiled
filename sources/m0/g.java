package m0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.support.v7.widget.c0;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import j0.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Class<?>[] f3296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Class<?>[] f3297f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object[] f3298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f3299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f3300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f3301d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class<?>[] f3302c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f3303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f3304b;

        public a(Object obj, String str) {
            this.f3303a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f3304b = cls.getMethod(str, f3302c);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f3304b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f3304b.invoke(this.f3303a, menuItem)).booleanValue();
                }
                this.f3304b.invoke(this.f3303a, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    private class b {
        g0.c A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Menu f3305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f3308d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f3309e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f3310f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f3311g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f3312h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f3313i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f3314j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private CharSequence f3315k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private CharSequence f3316l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f3317m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private char f3318n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f3319o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private char f3320p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f3321q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f3322r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f3323s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f3324t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f3325u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f3326v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f3327w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private String f3328x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private String f3329y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private String f3330z;

        public b(Menu menu) {
            this.f3305a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = g.this.f3300c.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.f3323s).setVisible(this.f3324t).setEnabled(this.f3325u).setCheckable(this.f3322r >= 1).setTitleCondensed(this.f3316l).setIcon(this.f3317m);
            int i2 = this.f3326v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.f3330z != null) {
                if (g.this.f3300c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f3330z));
            }
            boolean z3 = menuItem instanceof android.support.v7.view.menu.g;
            if (z3) {
            }
            if (this.f3322r >= 2) {
                if (z3) {
                    ((android.support.v7.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof n0.d) {
                    ((n0.d) menuItem).i(true);
                }
            }
            String str = this.f3328x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f3296e, g.this.f3298a));
                z2 = true;
            }
            int i3 = this.f3327w;
            if (i3 > 0) {
                if (z2) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i3);
                }
            }
            g0.c cVar = this.A;
            if (cVar != null) {
                g0.h.a(menuItem, cVar);
            }
            g0.h.c(menuItem, this.B);
            g0.h.g(menuItem, this.C);
            g0.h.b(menuItem, this.f3318n, this.f3319o);
            g0.h.f(menuItem, this.f3320p, this.f3321q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                g0.h.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                g0.h.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f3312h = true;
            i(this.f3305a.add(this.f3306b, this.f3313i, this.f3314j, this.f3315k));
        }

        public SubMenu b() {
            this.f3312h = true;
            SubMenu subMenuAddSubMenu = this.f3305a.addSubMenu(this.f3306b, this.f3313i, this.f3314j, this.f3315k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f3312h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f3300c.obtainStyledAttributes(attributeSet, j.k1);
            this.f3306b = typedArrayObtainStyledAttributes.getResourceId(j.m1, 0);
            this.f3307c = typedArrayObtainStyledAttributes.getInt(j.o1, 0);
            this.f3308d = typedArrayObtainStyledAttributes.getInt(j.p1, 0);
            this.f3309e = typedArrayObtainStyledAttributes.getInt(j.q1, 0);
            this.f3310f = typedArrayObtainStyledAttributes.getBoolean(j.n1, true);
            this.f3311g = typedArrayObtainStyledAttributes.getBoolean(j.l1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f3300c.obtainStyledAttributes(attributeSet, j.r1);
            this.f3313i = typedArrayObtainStyledAttributes.getResourceId(j.u1, 0);
            this.f3314j = (typedArrayObtainStyledAttributes.getInt(j.x1, this.f3307c) & (-65536)) | (typedArrayObtainStyledAttributes.getInt(j.y1, this.f3308d) & 65535);
            this.f3315k = typedArrayObtainStyledAttributes.getText(j.z1);
            this.f3316l = typedArrayObtainStyledAttributes.getText(j.A1);
            this.f3317m = typedArrayObtainStyledAttributes.getResourceId(j.s1, 0);
            this.f3318n = c(typedArrayObtainStyledAttributes.getString(j.B1));
            this.f3319o = typedArrayObtainStyledAttributes.getInt(j.I1, 4096);
            this.f3320p = c(typedArrayObtainStyledAttributes.getString(j.C1));
            this.f3321q = typedArrayObtainStyledAttributes.getInt(j.M1, 4096);
            int i2 = j.D1;
            this.f3322r = typedArrayObtainStyledAttributes.hasValue(i2) ? typedArrayObtainStyledAttributes.getBoolean(i2, false) : this.f3309e;
            this.f3323s = typedArrayObtainStyledAttributes.getBoolean(j.v1, false);
            this.f3324t = typedArrayObtainStyledAttributes.getBoolean(j.w1, this.f3310f);
            this.f3325u = typedArrayObtainStyledAttributes.getBoolean(j.t1, this.f3311g);
            this.f3326v = typedArrayObtainStyledAttributes.getInt(j.N1, -1);
            this.f3330z = typedArrayObtainStyledAttributes.getString(j.E1);
            this.f3327w = typedArrayObtainStyledAttributes.getResourceId(j.F1, 0);
            this.f3328x = typedArrayObtainStyledAttributes.getString(j.H1);
            String string = typedArrayObtainStyledAttributes.getString(j.G1);
            this.f3329y = string;
            boolean z2 = string != null;
            if (z2 && this.f3327w == 0 && this.f3328x == null) {
                this.A = (g0.c) e(string, g.f3297f, g.this.f3299b);
            } else {
                if (z2) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = typedArrayObtainStyledAttributes.getText(j.J1);
            this.C = typedArrayObtainStyledAttributes.getText(j.O1);
            int i3 = j.L1;
            if (typedArrayObtainStyledAttributes.hasValue(i3)) {
                this.E = c0.c(typedArrayObtainStyledAttributes.getInt(i3, -1), this.E);
            } else {
                this.E = null;
            }
            int i4 = j.K1;
            if (typedArrayObtainStyledAttributes.hasValue(i4)) {
                this.D = typedArrayObtainStyledAttributes.getColorStateList(i4);
            } else {
                this.D = null;
            }
            typedArrayObtainStyledAttributes.recycle();
            this.f3312h = false;
        }

        public void h() {
            this.f3306b = 0;
            this.f3307c = 0;
            this.f3308d = 0;
            this.f3309e = 0;
            this.f3310f = true;
            this.f3311g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f3296e = clsArr;
        f3297f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f3300c = context;
        Object[] objArr = {context};
        this.f3298a = objArr;
        this.f3299b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z3 && name2.equals(str)) {
                        z3 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            g0.c cVar = bVar.A;
                            if (cVar == null || !cVar.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z2 = true;
                    }
                }
            } else if (!z3) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z3 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f3301d == null) {
            this.f3301d = a(this.f3300c);
        }
        return this.f3301d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof c0.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f3300c.getResources().getLayout(i2);
                    c(layout, Xml.asAttributeSet(layout), menu);
                    if (layout != null) {
                        layout.close();
                    }
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}

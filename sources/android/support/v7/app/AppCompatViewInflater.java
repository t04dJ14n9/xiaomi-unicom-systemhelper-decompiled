package android.support.v7.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.support.v7.widget.h;
import android.support.v7.widget.k;
import android.support.v7.widget.o;
import android.support.v7.widget.p;
import android.support.v7.widget.q0;
import android.support.v7.widget.s;
import android.support.v7.widget.t;
import android.support.v7.widget.u;
import android.support.v7.widget.w;
import android.support.v7.widget.y;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import g0.m;
import j0.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatViewInflater {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f800b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f801c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f802d = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<String, Constructor<? extends View>> f803e = new f0.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f804a = new Object[2];

    private static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Method f807d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Context f808e;

        public a(View view, String str) {
            this.f805b = view;
            this.f806c = str;
        }

        private void a(Context context, String str) {
            String str2;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f806c, View.class)) != null) {
                        this.f807d = method;
                        this.f808e = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f805b.getId();
            if (id == -1) {
                str2 = "";
            } else {
                str2 = " with id '" + this.f805b.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f806c + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f805b.getClass() + str2);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f807d == null) {
                a(this.f805b.getContext(), this.f806c);
            }
            try {
                this.f807d.invoke(this.f808e, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    private void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && m.i(view)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f801c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private View q(Context context, String str, String str2) {
        String str3;
        Map<String, Constructor<? extends View>> map = f803e;
        Constructor<? extends View> constructor = map.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(f800b);
                map.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f804a);
    }

    private View r(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f804a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return q(context, str, null);
            }
            int i2 = 0;
            while (true) {
                String[] strArr = f802d;
                if (i2 >= strArr.length) {
                    return null;
                }
                View viewQ = q(context, str, strArr[i2]);
                if (viewQ != null) {
                    return viewQ;
                }
                i2++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f804a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context s(Context context, AttributeSet attributeSet, boolean z2, boolean z3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.m3, 0, 0);
        int resourceId = z2 ? typedArrayObtainStyledAttributes.getResourceId(j.n3, 0) : 0;
        if (z3 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(j.o3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return ((context instanceof m0.d) && ((m0.d) context).b() == resourceId) ? context : new m0.d(context, resourceId);
        }
        return context;
    }

    private void t(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected android.support.v7.widget.d b(Context context, AttributeSet attributeSet) {
        return new android.support.v7.widget.d(context, attributeSet);
    }

    protected android.support.v7.widget.f c(Context context, AttributeSet attributeSet) {
        return new android.support.v7.widget.f(context, attributeSet);
    }

    protected android.support.v7.widget.g d(Context context, AttributeSet attributeSet) {
        return new android.support.v7.widget.g(context, attributeSet);
    }

    protected h e(Context context, AttributeSet attributeSet) {
        return new h(context, attributeSet);
    }

    protected k f(Context context, AttributeSet attributeSet) {
        return new k(context, attributeSet);
    }

    protected android.support.v7.widget.m g(Context context, AttributeSet attributeSet) {
        return new android.support.v7.widget.m(context, attributeSet);
    }

    protected o h(Context context, AttributeSet attributeSet) {
        return new o(context, attributeSet);
    }

    protected p i(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    protected s j(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    protected t k(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    protected u l(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    protected w m(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    protected y n(Context context, AttributeSet attributeSet) {
        return new y(context, attributeSet);
    }

    protected View o(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    final View p(View view, String str, Context context, AttributeSet attributeSet, boolean z2, boolean z3, boolean z4, boolean z5) {
        View viewK;
        Context context2 = (!z2 || view == null) ? context : view.getContext();
        if (z3 || z4) {
            context2 = s(context2, attributeSet, z3, z4);
        }
        if (z5) {
            context2 = q0.b(context2);
        }
        str.hashCode();
        switch (str) {
            case "RatingBar":
                viewK = k(context2, attributeSet);
                t(viewK, str);
                break;
            case "CheckedTextView":
                viewK = e(context2, attributeSet);
                t(viewK, str);
                break;
            case "MultiAutoCompleteTextView":
                viewK = i(context2, attributeSet);
                t(viewK, str);
                break;
            case "TextView":
                viewK = n(context2, attributeSet);
                t(viewK, str);
                break;
            case "ImageButton":
                viewK = g(context2, attributeSet);
                t(viewK, str);
                break;
            case "SeekBar":
                viewK = l(context2, attributeSet);
                t(viewK, str);
                break;
            case "Spinner":
                viewK = m(context2, attributeSet);
                t(viewK, str);
                break;
            case "RadioButton":
                viewK = j(context2, attributeSet);
                t(viewK, str);
                break;
            case "ImageView":
                viewK = h(context2, attributeSet);
                t(viewK, str);
                break;
            case "AutoCompleteTextView":
                viewK = b(context2, attributeSet);
                t(viewK, str);
                break;
            case "CheckBox":
                viewK = d(context2, attributeSet);
                t(viewK, str);
                break;
            case "EditText":
                viewK = f(context2, attributeSet);
                t(viewK, str);
                break;
            case "Button":
                viewK = c(context2, attributeSet);
                t(viewK, str);
                break;
            default:
                viewK = o(context2, str, attributeSet);
                break;
        }
        if (viewK == null && context != context2) {
            viewK = r(context2, str, attributeSet);
        }
        if (viewK != null) {
            a(viewK, attributeSet);
        }
        return viewK;
    }
}

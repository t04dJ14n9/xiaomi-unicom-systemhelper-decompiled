package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EnumC0000b f201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f206g;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f207a;

        static {
            int[] iArr = new int[EnumC0000b.values().length];
            f207a = iArr;
            try {
                iArr[EnumC0000b.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f207a[EnumC0000b.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f207a[EnumC0000b.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f207a[EnumC0000b.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f207a[EnumC0000b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f207a[EnumC0000b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f207a[EnumC0000b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: android.support.constraint.b$b, reason: collision with other inner class name */
    public enum EnumC0000b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public b(b bVar, Object obj) {
        this.f200a = bVar.f200a;
        this.f201b = bVar.f201b;
        d(obj);
    }

    public b(String str, EnumC0000b enumC0000b, Object obj) {
        this.f200a = str;
        this.f201b = enumC0000b;
        d(obj);
    }

    public static HashMap<String, b> a(HashMap<String, b> map, View view) {
        HashMap<String, b> map2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            b bVar = map.get(str);
            try {
                map2.put(str, str.equals("BackgroundColor") ? new b(bVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())) : new b(bVar, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
        return map2;
    }

    public static void b(Context context, XmlPullParser xmlPullParser, HashMap<String, b> map) {
        EnumC0000b enumC0000b;
        Object string;
        int integer;
        float dimension;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.E2);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string2 = null;
        Object objValueOf = null;
        EnumC0000b enumC0000b2 = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == k.F2) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                if (string2 != null && string2.length() > 0) {
                    string2 = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                }
            } else if (index == k.G2) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC0000b2 = EnumC0000b.BOOLEAN_TYPE;
            } else {
                if (index == k.I2) {
                    enumC0000b = EnumC0000b.COLOR_TYPE;
                } else if (index == k.H2) {
                    enumC0000b = EnumC0000b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == k.M2) {
                        enumC0000b = EnumC0000b.DIMENSION_TYPE;
                        dimension = TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == k.J2) {
                        enumC0000b = EnumC0000b.DIMENSION_TYPE;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == k.K2) {
                        enumC0000b = EnumC0000b.FLOAT_TYPE;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, Float.NaN);
                    } else if (index == k.L2) {
                        enumC0000b = EnumC0000b.INT_TYPE;
                        integer = typedArrayObtainStyledAttributes.getInteger(index, -1);
                        string = Integer.valueOf(integer);
                        Object obj = string;
                        enumC0000b2 = enumC0000b;
                        objValueOf = obj;
                    } else if (index == k.N2) {
                        enumC0000b = EnumC0000b.STRING_TYPE;
                        string = typedArrayObtainStyledAttributes.getString(index);
                        Object obj2 = string;
                        enumC0000b2 = enumC0000b;
                        objValueOf = obj2;
                    }
                    string = Float.valueOf(dimension);
                    Object obj3 = string;
                    enumC0000b2 = enumC0000b;
                    objValueOf = obj3;
                }
                integer = typedArrayObtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(integer);
                Object obj4 = string;
                enumC0000b2 = enumC0000b;
                objValueOf = obj4;
            }
        }
        if (string2 != null && objValueOf != null) {
            map.put(string2, new b(string2, enumC0000b2, objValueOf));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void c(View view, HashMap<String, b> map) {
        StringBuilder sb;
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            b bVar = map.get(str);
            String str2 = "set" + str;
            try {
                switch (a.f207a[bVar.f201b.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.f206g));
                        break;
                    case 2:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.f206g);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.f202c));
                        break;
                    case 4:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(bVar.f203d));
                        break;
                    case 5:
                        cls.getMethod(str2, CharSequence.class).invoke(view, bVar.f204e);
                        break;
                    case 6:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(bVar.f205f));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(bVar.f203d));
                        break;
                }
            } catch (IllegalAccessException e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            } catch (NoSuchMethodException e3) {
                Log.e("TransitionLayout", e3.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str2);
                Log.e("TransitionLayout", sb2.toString());
            } catch (InvocationTargetException e4) {
                e = e4;
                sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            }
        }
    }

    public void d(Object obj) {
        switch (a.f207a[this.f201b.ordinal()]) {
            case 1:
            case 2:
                this.f206g = ((Integer) obj).intValue();
                break;
            case 3:
                this.f202c = ((Integer) obj).intValue();
                break;
            case 4:
            case 7:
                this.f203d = ((Float) obj).floatValue();
                break;
            case 5:
                this.f204e = (String) obj;
                break;
            case 6:
                this.f205f = ((Boolean) obj).booleanValue();
                break;
        }
    }
}

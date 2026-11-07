package z;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: z.a$a, reason: collision with other inner class name */
    public interface InterfaceC0048a {
    }

    public static final class b implements InterfaceC0048a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c[] f4056a;

        public b(c[] cVarArr) {
            this.f4056a = cVarArr;
        }

        public c[] a() {
            return this.f4056a;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f4057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f4058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f4059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f4060d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f4061e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f4062f;

        public c(String str, int i2, boolean z2, String str2, int i3, int i4) {
            this.f4057a = str;
            this.f4058b = i2;
            this.f4059c = z2;
            this.f4060d = str2;
            this.f4061e = i3;
            this.f4062f = i4;
        }

        public String a() {
            return this.f4057a;
        }

        public int b() {
            return this.f4062f;
        }

        public int c() {
            return this.f4061e;
        }

        public String d() {
            return this.f4060d;
        }

        public int e() {
            return this.f4058b;
        }

        public boolean f() {
            return this.f4059c;
        }
    }

    public static final class d implements InterfaceC0048a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d0.a f4063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f4064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f4065c;

        public d(d0.a aVar, int i2, int i3) {
            this.f4063a = aVar;
            this.f4065c = i2;
            this.f4064b = i3;
        }

        public int a() {
            return this.f4065c;
        }

        public d0.a b() {
            return this.f4063a;
        }

        public int c() {
            return this.f4064b;
        }
    }

    private static int a(TypedArray typedArray, int i2) {
        return typedArray.getType(i2);
    }

    public static InterfaceC0048a b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i2)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static InterfaceC0048a d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static InterfaceC0048a e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r.a.f3568b);
        String string = typedArrayObtainAttributes.getString(r.a.f3569c);
        String string2 = typedArrayObtainAttributes.getString(r.a.f3573g);
        String string3 = typedArrayObtainAttributes.getString(r.a.f3574h);
        int resourceId = typedArrayObtainAttributes.getResourceId(r.a.f3570d, 0);
        int integer = typedArrayObtainAttributes.getInteger(r.a.f3571e, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(r.a.f3572f, 500);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new d(new d0.a(string, string2, string3, c(resources, resourceId)), integer, integer2);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
    }

    private static c f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), r.a.f3575i);
        int i2 = r.a.f3584r;
        if (!typedArrayObtainAttributes.hasValue(i2)) {
            i2 = r.a.f3577k;
        }
        int i3 = typedArrayObtainAttributes.getInt(i2, 400);
        int i4 = r.a.f3582p;
        if (!typedArrayObtainAttributes.hasValue(i4)) {
            i4 = r.a.f3578l;
        }
        boolean z2 = 1 == typedArrayObtainAttributes.getInt(i4, 0);
        int i5 = r.a.f3585s;
        if (!typedArrayObtainAttributes.hasValue(i5)) {
            i5 = r.a.f3579m;
        }
        int i6 = r.a.f3583q;
        if (!typedArrayObtainAttributes.hasValue(i6)) {
            i6 = r.a.f3580n;
        }
        String string = typedArrayObtainAttributes.getString(i6);
        int i7 = typedArrayObtainAttributes.getInt(i5, 0);
        int i8 = r.a.f3581o;
        if (!typedArrayObtainAttributes.hasValue(i8)) {
            i8 = r.a.f3576j;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i8, 0);
        String string2 = typedArrayObtainAttributes.getString(i8);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new c(string2, i3, z2, string, i7, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}

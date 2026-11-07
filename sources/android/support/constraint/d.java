package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f226b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f227c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SparseArray<a> f228d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SparseArray<e> f229e = new SparseArray<>();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList<b> f231b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f232c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        e f233d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f232c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.H4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == k.I4) {
                    this.f230a = typedArrayObtainStyledAttributes.getResourceId(index, this.f230a);
                } else if (index == k.J4) {
                    this.f232c = typedArrayObtainStyledAttributes.getResourceId(index, this.f232c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f232c);
                    context.getResources().getResourceName(this.f232c);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f233d = eVar;
                        eVar.d(context, this.f232c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f231b.add(bVar);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f237d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        e f239f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f234a = Float.NaN;
            this.f235b = Float.NaN;
            this.f236c = Float.NaN;
            this.f237d = Float.NaN;
            this.f238e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.d5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == k.e5) {
                    this.f238e = typedArrayObtainStyledAttributes.getResourceId(index, this.f238e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f238e);
                    context.getResources().getResourceName(this.f238e);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f239f = eVar;
                        eVar.d(context, this.f238e);
                    }
                } else if (index == k.f5) {
                    this.f237d = typedArrayObtainStyledAttributes.getDimension(index, this.f237d);
                } else if (index == k.g5) {
                    this.f235b = typedArrayObtainStyledAttributes.getDimension(index, this.f235b);
                } else if (index == k.h5) {
                    this.f236c = typedArrayObtainStyledAttributes.getDimension(index, this.f236c);
                } else if (index == k.i5) {
                    this.f234a = typedArrayObtainStyledAttributes.getDimension(index, this.f234a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    d(Context context, ConstraintLayout constraintLayout, int i2) {
        this.f225a = constraintLayout;
        a(context, i2);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void a(Context context, int i2) {
        byte b2;
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                b2 = 4;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                b2 = 2;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                b2 = 1;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                b2 = 0;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b2 = 3;
                            } else {
                                b2 = -1;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 != 0 && b2 != 1) {
                        if (b2 == 2) {
                            aVar = new a(context, xml);
                            this.f228d.put(aVar.f230a, aVar);
                        } else if (b2 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.a(bVar);
                            }
                        } else if (b2 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            b(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        e eVar = new e();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if ("id".equals(xmlPullParser.getAttributeName(i2))) {
                String attributeValue = xmlPullParser.getAttributeValue(i2);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                eVar.j(context, xmlPullParser);
                this.f229e.put(identifier, eVar);
                return;
            }
        }
    }

    public void c(g gVar) {
    }
}

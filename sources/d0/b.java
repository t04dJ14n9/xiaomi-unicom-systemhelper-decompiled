package d0;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import f0.j;
import f0.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final f0.g<String, Typeface> f2379a = new f0.g<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d0.c f2380b = new d0.c("fonts", 10, 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f2381c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final k<String, ArrayList<d0.c.d<g>>> f2382d = new k<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Comparator<byte[]> f2383e = new d();

    static class a implements Callable<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f2384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0.a f2385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2386c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f2387d;

        a(Context context, d0.a aVar, int i2, String str) {
            this.f2384a = context;
            this.f2385b = aVar;
            this.f2386c = i2;
            this.f2387d = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g call() {
            g gVarF = b.f(this.f2384a, this.f2385b, this.f2386c);
            Typeface typeface = gVarF.f2398a;
            if (typeface != null) {
                b.f2379a.d(this.f2387d, typeface);
            }
            return gVarF;
        }
    }

    /* JADX INFO: renamed from: d0.b$b, reason: collision with other inner class name */
    static class C0022b implements d0.c.d<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z.b.a f2388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Handler f2389b;

        C0022b(z.b.a aVar, Handler handler) {
            this.f2388a = aVar;
            this.f2389b = handler;
        }

        @Override // d0.c.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(g gVar) {
            int i2;
            z.b.a aVar;
            if (gVar == null) {
                aVar = this.f2388a;
                i2 = 1;
            } else {
                i2 = gVar.f2399b;
                if (i2 == 0) {
                    this.f2388a.b(gVar.f2398a, this.f2389b);
                    return;
                }
                aVar = this.f2388a;
            }
            aVar.a(i2, this.f2389b);
        }
    }

    static class c implements d0.c.d<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2390a;

        c(String str) {
            this.f2390a = str;
        }

        @Override // d0.c.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(g gVar) {
            synchronized (b.f2381c) {
                k<String, ArrayList<d0.c.d<g>>> kVar = b.f2382d;
                ArrayList<d0.c.d<g>> arrayList = kVar.get(this.f2390a);
                if (arrayList == null) {
                    return;
                }
                kVar.remove(this.f2390a);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    arrayList.get(i2).a(gVar);
                }
            }
        }
    }

    static class d implements Comparator<byte[]> {
        d() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i2 = 0; i2 < bArr.length; i2++) {
                byte b2 = bArr[i2];
                byte b3 = bArr2[i2];
                if (b2 != b3) {
                    return b2 - b3;
                }
            }
            return 0;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f2391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f[] f2392b;

        public e(int i2, f[] fVarArr) {
            this.f2391a = i2;
            this.f2392b = fVarArr;
        }

        public f[] a() {
            return this.f2392b;
        }

        public int b() {
            return this.f2391a;
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f2393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f2394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f2395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f2396d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f2397e;

        public f(Uri uri, int i2, int i3, boolean z2, int i4) {
            this.f2393a = (Uri) j.b(uri);
            this.f2394b = i2;
            this.f2395c = i3;
            this.f2396d = z2;
            this.f2397e = i4;
        }

        public int a() {
            return this.f2397e;
        }

        public int b() {
            return this.f2394b;
        }

        public Uri c() {
            return this.f2393a;
        }

        public int d() {
            return this.f2395c;
        }

        public boolean e() {
            return this.f2396d;
        }
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Typeface f2398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f2399b;

        g(Typeface typeface, int i2) {
            this.f2398a = typeface;
            this.f2399b = i2;
        }
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static e c(Context context, CancellationSignal cancellationSignal, d0.a aVar) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoH = h(context.getPackageManager(), aVar, context.getResources());
        return providerInfoH == null ? new e(1, null) : new e(0, e(context, aVar, providerInfoH.authority, cancellationSignal));
    }

    private static List<List<byte[]>> d(d0.a aVar, Resources resources) {
        return aVar.a() != null ? aVar.a() : z.a.c(resources, aVar.b());
    }

    static f[] e(Context context, d0.a aVar, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.f()}, null, cancellationSignal);
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursorQuery.getColumnIndex("_id");
                int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                while (cursorQuery.moveToNext()) {
                    int i2 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                    arrayList2.add(new f(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i2));
                }
                arrayList = arrayList2;
            }
            return (f[]) arrayList.toArray(new f[0]);
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    static g f(Context context, d0.a aVar, int i2) {
        try {
            e eVarC = c(context, null, aVar);
            if (eVarC.b() != 0) {
                return new g(null, eVarC.b() == 1 ? -2 : -3);
            }
            Typeface typefaceA = a0.b.a(context, null, eVarC.a(), i2);
            return new g(typefaceA, typefaceA != null ? 0 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(null, -1);
        }
    }

    public static Typeface g(Context context, d0.a aVar, z.b.a aVar2, Handler handler, boolean z2, int i2, int i3) {
        String str = aVar.c() + "-" + i3;
        Typeface typefaceC = f2379a.c(str);
        if (typefaceC != null) {
            if (aVar2 != null) {
                aVar2.d(typefaceC);
            }
            return typefaceC;
        }
        if (z2 && i2 == -1) {
            g gVarF = f(context, aVar, i3);
            if (aVar2 != null) {
                int i4 = gVarF.f2399b;
                if (i4 == 0) {
                    aVar2.b(gVarF.f2398a, handler);
                } else {
                    aVar2.a(i4, handler);
                }
            }
            return gVarF.f2398a;
        }
        a aVar3 = new a(context, aVar, i3, str);
        if (z2) {
            try {
                return ((g) f2380b.e(aVar3, i2)).f2398a;
            } catch (InterruptedException unused) {
                return null;
            }
        }
        C0022b c0022b = aVar2 == null ? null : new C0022b(aVar2, handler);
        synchronized (f2381c) {
            k<String, ArrayList<d0.c.d<g>>> kVar = f2382d;
            if (kVar.containsKey(str)) {
                if (c0022b != null) {
                    kVar.get(str).add(c0022b);
                }
                return null;
            }
            if (c0022b != null) {
                ArrayList<d0.c.d<g>> arrayList = new ArrayList<>();
                arrayList.add(c0022b);
                kVar.put(str, arrayList);
            }
            f2380b.d(aVar3, new c(str));
            return null;
        }
    }

    public static ProviderInfo h(PackageManager packageManager, d0.a aVar, Resources resources) throws PackageManager.NameNotFoundException {
        String strD = aVar.d();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strD, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strD);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(aVar.e())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strD + ", but package was not " + aVar.e());
        }
        List<byte[]> listA = a(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listA, f2383e);
        List<List<byte[]>> listD = d(aVar, resources);
        for (int i2 = 0; i2 < listD.size(); i2++) {
            ArrayList arrayList = new ArrayList(listD.get(i2));
            Collections.sort(arrayList, f2383e);
            if (b(listA, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    public static Map<Uri, ByteBuffer> i(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap map = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.a() == 0) {
                Uri uriC = fVar.c();
                if (!map.containsKey(uriC)) {
                    map.put(uriC, a0.g.e(context, cancellationSignal, uriC));
                }
            }
        }
        return Collections.unmodifiableMap(map);
    }
}

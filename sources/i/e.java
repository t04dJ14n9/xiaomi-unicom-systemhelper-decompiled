package i;

import android.database.Cursor;
import android.database.MatrixCursor;
import b1.i;
import j.k;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f2845a = {"CoorType", "Time", "LocType", "Longitude", "Latitude", "Radius", "NetworkLocationType", "Country", "CountryCode", "Province", "City", "CityCode", "District", "Street", "StreetNumber", "PoiList", "LocationDescription"};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f2847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f2848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f2849d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f2850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f2851f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b1.c f2852g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f2853h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final LinkedHashMap<String, Integer> f2854i;

        public a(String[] strArr) {
            b1.c cVar;
            boolean z2;
            b1.c cVar2;
            boolean z3;
            String str;
            b1.c cVar3;
            String str2;
            int iIntValue = 8;
            boolean z4 = false;
            if (strArr == null) {
                this.f2846a = null;
                this.f2847b = null;
                this.f2854i = null;
                this.f2848c = false;
                this.f2849d = false;
                this.f2850e = false;
                this.f2852g = null;
                this.f2853h = false;
                this.f2851f = 8;
                return;
            }
            LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
            b1.c cVar4 = null;
            String str3 = null;
            String strSubstring = null;
            int i2 = 0;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            while (i2 < strArr.length) {
                try {
                    if (strArr[i2].equals("-loc")) {
                        try {
                            str3 = strArr[i2 + 1];
                            try {
                                String[] strArrSplit = str3.split("&");
                                int i3 = 0;
                                while (i3 < strArrSplit.length) {
                                    try {
                                        cVar = cVar4;
                                        try {
                                            if (strArrSplit[i3].startsWith("cl=")) {
                                                strSubstring = strArrSplit[i3].substring(3);
                                            } else if (strArrSplit[i3].startsWith("wf=")) {
                                                String[] strArrSplit2 = strArrSplit[i3].substring(3).split("\\|");
                                                int i4 = 0;
                                                while (i4 < strArrSplit2.length) {
                                                    String[] strArrSplit3 = strArrSplit2[i4].split(";");
                                                    String[] strArr2 = strArrSplit2;
                                                    str2 = str3;
                                                    if (strArrSplit3.length >= 2) {
                                                        try {
                                                            linkedHashMap.put(strArrSplit3[0], Integer.valueOf(strArrSplit3[1]));
                                                        } catch (Exception unused) {
                                                            str3 = str2;
                                                            z2 = false;
                                                            cVar3 = cVar;
                                                            str = str3;
                                                            boolean z9 = z2;
                                                            cVar2 = cVar3;
                                                            z3 = z9;
                                                            this.f2846a = str;
                                                            this.f2847b = strSubstring;
                                                            this.f2854i = linkedHashMap;
                                                            this.f2848c = z3;
                                                            this.f2849d = z6;
                                                            this.f2850e = z7;
                                                            this.f2851f = iIntValue;
                                                            this.f2852g = cVar2;
                                                            this.f2853h = z8;
                                                        }
                                                    }
                                                    i4++;
                                                    strArrSplit2 = strArr2;
                                                    str3 = str2;
                                                }
                                            }
                                            i3++;
                                            cVar4 = cVar;
                                            strArrSplit = strArrSplit;
                                            str3 = str3;
                                        } catch (Exception unused2) {
                                            str2 = str3;
                                            str3 = str2;
                                            z2 = false;
                                            cVar3 = cVar;
                                            str = str3;
                                            boolean z10 = z2;
                                            cVar2 = cVar3;
                                            z3 = z10;
                                            this.f2846a = str;
                                            this.f2847b = strSubstring;
                                            this.f2854i = linkedHashMap;
                                            this.f2848c = z3;
                                            this.f2849d = z6;
                                            this.f2850e = z7;
                                            this.f2851f = iIntValue;
                                            this.f2852g = cVar2;
                                            this.f2853h = z8;
                                        }
                                    } catch (Exception unused3) {
                                        cVar = cVar4;
                                    }
                                }
                                cVar = cVar4;
                                z2 = false;
                                i2 += 2;
                                z4 = z2;
                                cVar4 = cVar;
                            } catch (Exception unused4) {
                                cVar = cVar4;
                            }
                        } catch (Exception unused5) {
                            cVar = cVar4;
                        }
                    } else {
                        cVar = cVar4;
                        try {
                            if (strArr[i2].equals("-com")) {
                                String[] strArrSplit4 = strArr[i2 + 1].split(";");
                                if (strArrSplit4.length > 0) {
                                    cVar3 = new b1.c();
                                    z2 = false;
                                    try {
                                        cVar3.n0(Double.valueOf(strArrSplit4[0]).doubleValue());
                                        cVar3.t0(Double.valueOf(strArrSplit4[1]).doubleValue());
                                        cVar3.o0(Integer.valueOf(strArrSplit4[2]).intValue());
                                        cVar3.w0(strArrSplit4[3]);
                                        cVar = cVar3;
                                    } catch (Exception unused6) {
                                    }
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z2 = false;
                                try {
                                    if (strArr[i2].equals("-log")) {
                                        if (strArr[i2 + 1].equals("true")) {
                                            z5 = true;
                                        }
                                    } else if (strArr[i2].equals("-rgc")) {
                                        if (strArr[i2 + 1].equals("true")) {
                                            z7 = true;
                                        }
                                    } else if (strArr[i2].equals("-poi")) {
                                        if (strArr[i2 + 1].equals("true")) {
                                            z6 = true;
                                        }
                                    } else if (strArr[i2].equals("-minap")) {
                                        try {
                                            iIntValue = Integer.valueOf(strArr[i2 + 1]).intValue();
                                        } catch (Exception unused7) {
                                        }
                                    } else if (strArr[i2].equals("-des") && strArr[i2 + 1].equals("true")) {
                                        z8 = true;
                                    }
                                } catch (Exception unused8) {
                                    cVar3 = cVar;
                                    str = str3;
                                    boolean z11 = z2;
                                    cVar2 = cVar3;
                                    z3 = z11;
                                    this.f2846a = str;
                                    this.f2847b = strSubstring;
                                    this.f2854i = linkedHashMap;
                                    this.f2848c = z3;
                                    this.f2849d = z6;
                                    this.f2850e = z7;
                                    this.f2851f = iIntValue;
                                    this.f2852g = cVar2;
                                    this.f2853h = z8;
                                }
                            }
                            i2 += 2;
                            z4 = z2;
                            cVar4 = cVar;
                        } catch (Exception unused9) {
                            z2 = false;
                            cVar3 = cVar;
                            str = str3;
                            boolean z12 = z2;
                            cVar2 = cVar3;
                            z3 = z12;
                            this.f2846a = str;
                            this.f2847b = strSubstring;
                            this.f2854i = linkedHashMap;
                            this.f2848c = z3;
                            this.f2849d = z6;
                            this.f2850e = z7;
                            this.f2851f = iIntValue;
                            this.f2852g = cVar2;
                            this.f2853h = z8;
                        }
                    }
                } catch (Exception unused10) {
                    cVar = cVar4;
                    z2 = z4;
                }
                str = str3;
                boolean z13 = z2;
                cVar2 = cVar3;
                z3 = z13;
                this.f2846a = str;
                this.f2847b = strSubstring;
                this.f2854i = linkedHashMap;
                this.f2848c = z3;
                this.f2849d = z6;
                this.f2850e = z7;
                this.f2851f = iIntValue;
                this.f2852g = cVar2;
                this.f2853h = z8;
            }
            b1.c cVar5 = cVar4;
            str = !z5 ? null : str3;
            z3 = true;
            cVar2 = cVar5;
            this.f2846a = str;
            this.f2847b = strSubstring;
            this.f2854i = linkedHashMap;
            this.f2848c = z3;
            this.f2849d = z6;
            this.f2850e = z7;
            this.f2851f = iIntValue;
            this.f2852g = cVar2;
            this.f2853h = z8;
        }
    }

    public static Cursor a(b1.c cVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date(System.currentTimeMillis()));
        String[] strArr = f2845a;
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        Object[] objArr = new Object[strArr.length];
        objArr[matrixCursor.getColumnIndex("CoorType")] = "gcj02";
        objArr[matrixCursor.getColumnIndex("Time")] = str9;
        objArr[matrixCursor.getColumnIndex("LocType")] = Integer.valueOf(cVar.v());
        objArr[matrixCursor.getColumnIndex("Longitude")] = Double.valueOf(cVar.x());
        objArr[matrixCursor.getColumnIndex("Latitude")] = Double.valueOf(cVar.u());
        objArr[matrixCursor.getColumnIndex("Radius")] = Float.valueOf(cVar.E());
        objArr[matrixCursor.getColumnIndex("NetworkLocationType")] = cVar.z();
        b1.a aVarD = cVar.d();
        if (aVarD != null) {
            str2 = aVarD.f1898a;
            str3 = aVarD.f1899b;
            str4 = aVarD.f1900c;
            str5 = aVarD.f1901d;
            str6 = aVarD.f1902e;
            str7 = aVarD.f1903f;
            str8 = aVarD.f1904g;
            str = aVarD.f1905h;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
        }
        objArr[matrixCursor.getColumnIndex("Country")] = str2;
        objArr[matrixCursor.getColumnIndex("CountryCode")] = str3;
        objArr[matrixCursor.getColumnIndex("Province")] = str4;
        objArr[matrixCursor.getColumnIndex("City")] = str5;
        objArr[matrixCursor.getColumnIndex("CityCode")] = str6;
        objArr[matrixCursor.getColumnIndex("District")] = str7;
        objArr[matrixCursor.getColumnIndex("Street")] = str8;
        objArr[matrixCursor.getColumnIndex("StreetNumber")] = str;
        List<i> listB = cVar.B();
        if (listB == null) {
            objArr[matrixCursor.getColumnIndex("PoiList")] = null;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i2 = 0; i2 < listB.size(); i2++) {
                i iVar = listB.get(i2);
                stringBuffer.append(iVar.b());
                stringBuffer.append(";");
                stringBuffer.append(iVar.c());
                stringBuffer.append(";");
                stringBuffer.append(iVar.d());
                stringBuffer.append(";|");
            }
            objArr[matrixCursor.getColumnIndex("PoiList")] = stringBuffer.toString();
        }
        objArr[matrixCursor.getColumnIndex("LocationDescription")] = cVar.w();
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x01b6  */
    public static b1.c b(Cursor cursor) {
        ArrayList arrayList;
        b1.c cVar = new b1.c();
        if (cursor == null || cursor.getCount() <= 0 || !cursor.moveToFirst()) {
            cVar.o0(67);
        } else {
            int i2 = cursor.getColumnIndex("LocType") != -1 ? cursor.getInt(cursor.getColumnIndex("LocType")) : 0;
            double d2 = cursor.getColumnIndex("Latitude") != -1 ? cursor.getDouble(cursor.getColumnIndex("Latitude")) : 0.0d;
            double d3 = cursor.getColumnIndex("Longitude") != -1 ? cursor.getDouble(cursor.getColumnIndex("Longitude")) : 0.0d;
            String string = cursor.getColumnIndex("CoorType") != -1 ? cursor.getString(cursor.getColumnIndex("CoorType")) : null;
            String string2 = cursor.getColumnIndex("NetworkLocationType") != -1 ? cursor.getString(cursor.getColumnIndex("NetworkLocationType")) : null;
            float f2 = cursor.getColumnIndex("Radius") != -1 ? cursor.getFloat(cursor.getColumnIndex("Radius")) : 0.0f;
            String string3 = cursor.getColumnIndex("Time") != -1 ? cursor.getString(cursor.getColumnIndex("Time")) : null;
            String string4 = cursor.getColumnIndex("Country") != -1 ? cursor.getString(cursor.getColumnIndex("Country")) : null;
            String string5 = cursor.getColumnIndex("CountryCode") != -1 ? cursor.getString(cursor.getColumnIndex("CountryCode")) : null;
            String string6 = cursor.getColumnIndex("Province") != -1 ? cursor.getString(cursor.getColumnIndex("Province")) : null;
            String str = string2;
            String string7 = cursor.getColumnIndex("City") != -1 ? cursor.getString(cursor.getColumnIndex("City")) : null;
            double d4 = d3;
            String string8 = cursor.getColumnIndex("CityCode") != -1 ? cursor.getString(cursor.getColumnIndex("CityCode")) : null;
            double d5 = d2;
            b1.a aVarM = new b1.a.C0016a().p(string4).q(string5).s(string6).n(string7).o(string8).r(cursor.getColumnIndex("District") != -1 ? cursor.getString(cursor.getColumnIndex("District")) : null).t(cursor.getColumnIndex("Street") != -1 ? cursor.getString(cursor.getColumnIndex("Street")) : null).u(cursor.getColumnIndex("StreetNumber") != -1 ? cursor.getString(cursor.getColumnIndex("StreetNumber")) : null).m();
            if (cursor.getColumnIndex("PoiList") != -1) {
                arrayList = new ArrayList();
                String string9 = cursor.getString(cursor.getColumnIndex("PoiList"));
                if (string9 != null) {
                    try {
                        for (String str2 : string9.split("\\|")) {
                            String[] strArrSplit = str2.split(";");
                            if (strArrSplit.length >= 3) {
                                arrayList.add(new i(strArrSplit[0], strArrSplit[1], Double.valueOf(strArrSplit[2]).doubleValue(), "", ""));
                            }
                        }
                        if (arrayList.size() == 0) {
                            arrayList = null;
                        }
                    } catch (Exception unused) {
                        if (arrayList.size() == 0) {
                            arrayList = null;
                        }
                    } catch (Throwable th) {
                        arrayList.size();
                        throw th;
                    }
                } else if (arrayList.size() == 0) {
                    arrayList = null;
                }
            } else {
                arrayList = null;
            }
            String string10 = cursor.getColumnIndex("LocationDescription") != -1 ? cursor.getString(cursor.getColumnIndex("LocationDescription")) : null;
            cVar.G0(string3);
            cVar.B0(f2);
            cVar.o0(i2);
            cVar.V(string);
            cVar.n0(d5);
            cVar.t0(d4);
            cVar.w0(str);
            cVar.Q(aVarM);
            cVar.z0(arrayList);
            cVar.q0(string10);
        }
        return cVar;
    }

    public static String c(b1.c cVar, int i2) {
        if (cVar == null || cVar.v() == 67) {
            return String.format(Locale.CHINA, "&ofl=%s|%d", "1", Integer.valueOf(i2));
        }
        String str = String.format(Locale.CHINA, "&ofl=%s|%d|%f|%f|%d", "1", Integer.valueOf(i2), Double.valueOf(cVar.x()), Double.valueOf(cVar.u()), Integer.valueOf((int) cVar.E()));
        if (cVar.d() != null) {
            str = str + "&ofaddr=" + cVar.d().f1906i;
        }
        if (cVar.B() != null && cVar.B().size() > 0) {
            i iVar = cVar.B().get(0);
            str = str + String.format(Locale.US, "&ofpoi=%s|%s", iVar.b(), iVar.c());
        }
        if (n.b.f3344f == null) {
            return str;
        }
        return str + String.format(Locale.US, "&pack=%s&sdk=%.3f", n.b.f3344f, Float.valueOf(9.521f));
    }

    public static String d(b1.c cVar, b1.c cVar2, a aVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cVar2 == null ? "&ofcl=0" : String.format(Locale.US, "&ofcl=1|%f|%f|%d", Double.valueOf(cVar2.x()), Double.valueOf(cVar2.u()), Integer.valueOf((int) cVar2.E())));
        stringBuffer.append(cVar == null ? "&ofwf=0" : String.format(Locale.US, "&ofwf=1|%f|%f|%d", Double.valueOf(cVar.x()), Double.valueOf(cVar.u()), Integer.valueOf((int) cVar.E())));
        stringBuffer.append((aVar == null || !aVar.f2850e) ? "&rgcn=0" : "&rgcn=1");
        stringBuffer.append((aVar == null || !aVar.f2849d) ? "&poin=0" : "&poin=1");
        stringBuffer.append((aVar == null || !aVar.f2853h) ? "&desc=0" : "&desc=1");
        if (aVar != null) {
            stringBuffer.append(String.format(Locale.US, "&aps=%d", Integer.valueOf(aVar.f2851f)));
        }
        return stringBuffer.toString();
    }

    public static String[] e(j.a aVar, k kVar, b1.c cVar, String str, boolean z2, int i2) {
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        if (aVar != null) {
            stringBuffer.append(j.f.M().l(aVar));
        }
        if (kVar != null) {
            stringBuffer.append(j.f.M().j(30, false, kVar, n.i.f3436q0));
        }
        if (stringBuffer.length() > 0) {
            if (str != null) {
                stringBuffer.append(str);
            }
            arrayList.add("-loc");
            arrayList.add(stringBuffer.toString());
        }
        if (cVar != null) {
            String str2 = String.format(Locale.US, "%f;%f;%d;%s", Double.valueOf(cVar.u()), Double.valueOf(cVar.x()), Integer.valueOf(cVar.v()), cVar.z());
            arrayList.add("-com");
            arrayList.add(str2);
        }
        if (z2) {
            arrayList.add("-log");
            arrayList.add("true");
        }
        if (n.i.f3409d.equals("all")) {
            arrayList.add("-rgc");
            arrayList.add("true");
        }
        if (n.i.f3417h) {
            arrayList.add("-poi");
            arrayList.add("true");
        }
        if (n.i.f3413f) {
            arrayList.add("-des");
            arrayList.add("true");
        }
        arrayList.add("-minap");
        arrayList.add(Integer.toString(i2));
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }
}

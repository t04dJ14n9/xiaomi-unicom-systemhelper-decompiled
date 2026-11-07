package q0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private w0.d f3546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f3547b;

    public c() {
        c();
    }

    private static String a(byte[] bArr) {
        StringBuilder sb;
        if (bArr == null) {
            throw new IllegalArgumentException("Argument b ( byte array ) is null! ");
        }
        String string = "";
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                sb = new StringBuilder();
                sb.append(string);
                string = "0";
            } else {
                sb = new StringBuilder();
            }
            sb.append(string);
            sb.append(hexString);
            string = sb.toString();
        }
        return string.toLowerCase();
    }

    private void c() {
        this.f3546a = new w0.e(e.a(), e.b());
    }

    private boolean e(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
        }
        HashSet hashSet2 = new HashSet();
        for (String str2 : strArr2) {
            hashSet2.add(str2);
        }
        return hashSet.equals(hashSet2);
    }

    private static byte[] f(byte[] bArr, w0.d dVar) throws NoSuchPaddingException, InvalidKeyException {
        w0.a aVarA = w0.a.a();
        aVarA.b(2, dVar);
        return aVarA.c(bArr);
    }

    private String[] g(Signature[] signatureArr) {
        int length = signatureArr.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = a(x0.c.a(signatureArr[i2].toByteArray()));
        }
        return strArr;
    }

    List b(Context context, Intent intent, boolean z2) {
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null) {
            for (ResolveInfo resolveInfo : listQueryBroadcastReceivers) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && activityInfo.applicationInfo != null) {
                    try {
                        ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                        Bundle bundle = packageManager.getReceiverInfo(new ComponentName(activityInfo2.packageName, activityInfo2.name), 128).metaData;
                        if (bundle != null) {
                            String string = bundle.getString("galaxy_data");
                            if (!TextUtils.isEmpty(string)) {
                                byte[] bArrA = x0.a.a(string.getBytes("utf-8"));
                                JSONObject jSONObject = new JSONObject(new String(bArrA));
                                b bVar = new b();
                                bVar.f3543b = jSONObject.getInt("priority");
                                bVar.f3542a = resolveInfo.activityInfo.applicationInfo;
                                if (context.getPackageName().equals(resolveInfo.activityInfo.applicationInfo.packageName)) {
                                    bVar.f3545d = true;
                                }
                                if (z2) {
                                    String string2 = bundle.getString("galaxy_sf");
                                    if (!TextUtils.isEmpty(string2)) {
                                        PackageInfo packageInfo = packageManager.getPackageInfo(resolveInfo.activityInfo.applicationInfo.packageName, 64);
                                        JSONArray jSONArray = jSONObject.getJSONArray("sigs");
                                        int length = jSONArray.length();
                                        String[] strArr = new String[length];
                                        for (int i2 = 0; i2 < length; i2++) {
                                            strArr[i2] = jSONArray.getString(i2);
                                        }
                                        if (e(strArr, g(packageInfo.signatures))) {
                                            byte[] bArrF = f(x0.a.a(string2.getBytes()), this.f3546a);
                                            if (bArrF != null && Arrays.equals(bArrF, x0.c.a(bArrA))) {
                                                bVar.f3544c = true;
                                            }
                                        }
                                    }
                                }
                                arrayList.add(bVar);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        Collections.sort(arrayList, new d(this));
        return arrayList;
    }

    public boolean d(Context context) {
        List listB = b(context, new Intent("com.baidu.intent.action.GALAXY").setPackage(context.getPackageName()), true);
        if (listB == null || listB.size() == 0) {
            for (int i2 = 0; i2 < 3; i2++) {
                Log.w("CuidBuddyInfoManager", "galaxy lib host missing meta-data,make sure you know the right way to integrate galaxy");
            }
            return false;
        }
        boolean z2 = ((b) listB.get(0)).f3544c;
        if (!z2) {
            for (int i3 = 0; i3 < 3; i3++) {
                Log.w("CuidBuddyInfoManager", "galaxy config err, In the release version of the signature should be matched");
            }
        }
        return z2;
    }

    List h(Context context) {
        List list = this.f3547b;
        if (list != null) {
            return list;
        }
        d(context);
        List listB = b(context, new Intent("com.baidu.intent.action.GALAXY"), true);
        this.f3547b = listB;
        return listB;
    }
}

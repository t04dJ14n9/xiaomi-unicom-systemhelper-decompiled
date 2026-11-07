package a1;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f47a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f48b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f49c = null;

    interface a {
        void a(Object obj);
    }

    protected i(Context context) {
        this.f47a = context;
    }

    private List b(HashMap map, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        if (strArr == null || strArr.length <= 0) {
            HashMap map2 = new HashMap();
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                String string = ((String) it.next()).toString();
                map2.put(string, map.get(string));
            }
            arrayList.add(map2);
        } else {
            for (String str : strArr) {
                HashMap map3 = new HashMap();
                Iterator it2 = map.keySet().iterator();
                while (it2.hasNext()) {
                    String string2 = ((String) it2.next()).toString();
                    map3.put(string2, map.get(string2));
                }
                map3.put("mcode", str);
                arrayList.add(map3);
            }
        }
        return arrayList;
    }

    private void d(String str) {
        JSONObject jSONObject;
        if (str == null) {
            str = "";
        }
        try {
            jSONObject = new JSONObject(str);
            if (!jSONObject.has("status")) {
                jSONObject.put("status", -1);
            }
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("status", -1);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        a aVar = this.f49c;
        if (aVar != null) {
            aVar.a(jSONObject.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(List list, String str, int i2, String str2, String str3) throws Throwable {
        int i3;
        d.b("syncConnect start Thread id = " + String.valueOf(Thread.currentThread().getId()));
        if (list == null || list.size() == 0) {
            d.d("syncConnect failed,params list is null or size is 0");
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 < list.size()) {
            d.b("syncConnect resuest " + i4 + "  start!!!");
            HashMap map = (HashMap) list.get(i4);
            k kVar = new k(this.f47a);
            if (kVar.f()) {
                String strD = kVar.d(map, str, i2, str2, str3);
                if (strD == null) {
                    strD = "";
                }
                d.b("syncConnect resuest " + i4 + "  result:" + strD);
                arrayList.add(strD);
                try {
                    JSONObject jSONObject = new JSONObject(strD);
                    if (jSONObject.has("status") && jSONObject.getInt("status") == 0) {
                        d.b("auth end and break");
                        d(strD);
                        return;
                    }
                } catch (JSONException unused) {
                    d.b("continue-------------------------------");
                }
            } else {
                d.b("Current network is not available.");
                arrayList.add(a1.a.b("Current network is not available."));
            }
            d.b("syncConnect end");
            i4++;
        }
        d.b("--iiiiii:" + i4 + "<><>paramList.size():" + list.size() + "<><>authResults.size():" + arrayList.size());
        if (list.size() <= 0 || i4 != list.size() || arrayList.size() <= 0 || i4 != arrayList.size() || (i3 = i4 - 1) <= 0) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject((String) arrayList.get(i3));
            if (!jSONObject2.has("status") || jSONObject2.getInt("status") == 0) {
                return;
            }
            d.b("i-1 result is not 0,return first result");
            d((String) arrayList.get(0));
        } catch (JSONException e2) {
            d(a1.a.b("JSONException:" + e2.getMessage()));
        }
    }

    protected void e(HashMap map, String[] strArr, String str, int i2, String str2, String str3, a aVar) {
        this.f48b = b(map, strArr);
        this.f49c = aVar;
        new Thread(new j(this, str, i2, str2, str3)).start();
    }
}

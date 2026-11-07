package a1;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f39a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap f40b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f41c = null;

    interface a {
        void a(Object obj);
    }

    protected g(Context context) {
        this.f39a = context;
    }

    private HashMap b(HashMap map) {
        HashMap map2 = new HashMap();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String string = ((String) it.next()).toString();
            map2.put(string, map.get(string));
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
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
        a aVar = this.f41c;
        if (aVar != null) {
            aVar.a(jSONObject.toString());
        }
    }

    protected void e(HashMap map, String str, int i2, String str2, String str3, a aVar) {
        this.f40b = b(map);
        this.f41c = aVar;
        new Thread(new h(this, str, i2, str2, str3)).start();
    }
}

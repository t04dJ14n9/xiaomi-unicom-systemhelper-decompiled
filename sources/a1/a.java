package a1;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class a {
    static String a(int i2, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i2);
            jSONObject.put("message", str);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    static String b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", -1);
            jSONObject.put("message", str);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}

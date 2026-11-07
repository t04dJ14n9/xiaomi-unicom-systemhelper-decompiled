package b;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: b.b$b, reason: collision with other inner class name */
    public static class C0014b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f1643a = new b();
    }

    public b() {
    }

    public static b a() {
        return C0014b.f1643a;
    }

    public void b(Context context) {
        Log.d("UrlConfigManger", "updateUrl");
        if (context == null) {
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getExternalFilesDir(Environment.DIRECTORY_MOVIES));
            String str = File.separator;
            sb.append(str);
            sb.append("baiduLocDev");
            sb.append(str);
            sb.append("loc_local_config");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            try {
                if (!new File(string).exists()) {
                    Log.d("baidu_location_dev", "loc_local_config not exit...");
                    return;
                }
                FileInputStream fileInputStream = new FileInputStream(string);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i2 = fileInputStream.read(bArr);
                    if (i2 <= 0) {
                        fileInputStream.close();
                        d(sb2.toString());
                        return;
                    }
                    sb2.append(new String(bArr, 0, i2));
                }
            } catch (FileNotFoundException | IOException e2) {
                e2.printStackTrace();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public final void c(String str, String str2, String str3) {
        Log.d("UrlConfigManger", "setConfig");
        Log.d("baidu_location_dev", "type:" + str + ", owner: " + str2 + " ,url: " + str3);
        if (str2.contains("default_owner") || "default_url".equals(str3) || !str3.contains("https")) {
            Log.d("baidu_location_dev", "url 不合法");
            return;
        }
        str.hashCode();
        switch (str) {
            case "indoor_roadnet":
                n.d.f3358d = str3;
                break;
            case "vdr_log_update":
                n.d.f3361g = str3;
                break;
            case "hdyawupdate":
                n.d.f3362h = str3;
                break;
            case "basement_inout":
                n.d.f3363i = str3;
                break;
            case "indoor_poi_data":
                n.d.f3360f = str3;
                break;
            case "loc":
                n.d.f3356b = str3;
                break;
            case "cfgs":
                n.d.f3357c = str3;
                break;
            case "indoor_rects":
                n.d.f3359e = str3;
                break;
        }
    }

    public final boolean d(String str) {
        JSONArray jSONArrayOptJSONArray;
        Log.d("UrlConfigManger", "parseConfig");
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("url_config") || (jSONArrayOptJSONArray = jSONObject.optJSONArray("url_config")) == null) {
                return true;
            }
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                c(jSONObjectOptJSONObject.optString("type"), jSONObjectOptJSONObject.optString("owner"), jSONObjectOptJSONObject.optString("url"));
            }
            return true;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return false;
        }
    }
}

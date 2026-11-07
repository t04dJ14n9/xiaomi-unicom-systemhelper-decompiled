package q0;

import android.content.Context;
import android.os.Environment;
import android.os.Process;
import android.provider.Settings;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f3553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f3554b;

    public g(Context context, c cVar) {
        this.f3553a = context;
        this.f3554b = cVar;
    }

    private f a() {
        File file = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig/.cuid2");
        if (file.exists()) {
            return f.e(z0.c.a(file));
        }
        return null;
    }

    private f b(Context context) {
        List<b> listH = this.f3554b.h(context);
        f fVarE = null;
        if (listH != null) {
            File filesDir = context.getFilesDir();
            String name = "files";
            if (!"files".equals(filesDir.getName())) {
                Log.e("CuidV266Manager", "fetal error:: app files dir name is unexpectedly :: " + filesDir.getAbsolutePath());
                name = filesDir.getName();
            }
            for (b bVar : listH) {
                if (!bVar.f3545d) {
                    File file = new File(new File(bVar.f3542a.dataDir, name), "libcuid.so");
                    if (file.exists() && (fVarE = f.e(z0.c.a(file))) != null) {
                        break;
                    }
                }
            }
        }
        return fVarE;
    }

    private f d() {
        return f.a(f("com.baidu.deviceid"), f("bd_setting_i"));
    }

    private boolean e(String str) {
        return this.f3553a.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    private String f(String str) {
        try {
            return Settings.System.getString(this.f3553a.getContentResolver(), str);
        } catch (Exception e2) {
            z0.c.c(e2);
            return null;
        }
    }

    private String g(String str) {
        return "0";
    }

    private f h(String str) {
        String str2;
        String str3 = "";
        File file = new File(Environment.getExternalStorageDirectory(), "baidu/.cuid");
        if (!file.exists()) {
            file = new File(Environment.getExternalStorageDirectory(), "backups/.SystemConfig/.cuid");
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append("\r\n");
            }
            bufferedReader.close();
            byte[] bArrA = t0.g.a();
            String[] strArrSplit = new String(t0.c.c(bArrA, bArrA, x0.a.a(sb.toString().getBytes()))).split("=");
            if (strArrSplit == null || strArrSplit.length != 2) {
                str2 = "";
            } else {
                str2 = strArrSplit[0];
                try {
                    str3 = strArrSplit[1];
                } catch (FileNotFoundException | IOException | Exception unused) {
                }
            }
        } catch (FileNotFoundException | IOException | Exception unused2) {
        }
        return f.a(str3, str2);
    }

    public f c(String str) {
        boolean z2;
        f fVarB = b(this.f3553a);
        if (fVarB == null) {
            fVarB = f.e(f("com.baidu.deviceid.v2"));
        }
        boolean zE = e("android.permission.READ_EXTERNAL_STORAGE");
        if (fVarB == null && zE) {
            fVarB = a();
        }
        if (fVarB == null) {
            fVarB = d();
        }
        if (fVarB == null && zE) {
            fVarB = h(g(""));
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            g("");
        }
        if (fVarB != null) {
            fVarB.h();
        }
        return fVarB;
    }
}

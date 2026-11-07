package o;

import java.io.File;
import n.i;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f3491b;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("indoor");
        String str = File.separator;
        sb.append(str);
        sb.append("poiData");
        String string = sb.toString();
        f3490a = string;
        f3491b = i.y() + str + "locModel" + str + string + str;
    }
}

package o;

import java.io.File;
import n.i;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f3494b;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("outdoor");
        String str = File.separator;
        sb.append(str);
        sb.append("poiData");
        String string = sb.toString();
        f3493a = string;
        f3494b = i.y() + str + "locModel" + str + string + str;
    }
}

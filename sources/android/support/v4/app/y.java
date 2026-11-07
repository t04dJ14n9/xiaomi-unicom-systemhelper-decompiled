package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Iterable<Intent> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<Intent> f648b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f649c;

    public interface a {
        Intent f();
    }

    private y(Context context) {
        this.f649c = context;
    }

    public static y d(Context context) {
        return new y(context);
    }

    public y a(Intent intent) {
        this.f648b.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y b(Activity activity) {
        Intent intentF = activity instanceof a ? ((a) activity).f() : null;
        if (intentF == null) {
            intentF = t.a(activity);
        }
        if (intentF != null) {
            ComponentName component = intentF.getComponent();
            if (component == null) {
                component = intentF.resolveActivity(this.f649c.getPackageManager());
            }
            c(component);
            a(intentF);
        }
        return this;
    }

    public y c(ComponentName componentName) {
        int size = this.f648b.size();
        try {
            Context context = this.f649c;
            while (true) {
                Intent intentB = t.b(context, componentName);
                if (intentB == null) {
                    return this;
                }
                this.f648b.add(size, intentB);
                context = this.f649c;
                componentName = intentB.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    public void e() {
        f(null);
    }

    public void f(Bundle bundle) {
        if (this.f648b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.f648b;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (y.a.c(this.f649c, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f649c.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f648b.iterator();
    }
}

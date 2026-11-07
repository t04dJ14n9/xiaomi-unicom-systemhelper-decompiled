package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.support.v4.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f651a = aVar.k(iconCompat.f651a, 1);
        iconCompat.f653c = aVar.g(iconCompat.f653c, 2);
        iconCompat.f654d = aVar.m(iconCompat.f654d, 3);
        iconCompat.f655e = aVar.k(iconCompat.f655e, 4);
        iconCompat.f656f = aVar.k(iconCompat.f656f, 5);
        iconCompat.f657g = (ColorStateList) aVar.m(iconCompat.f657g, 6);
        iconCompat.f659i = aVar.o(iconCompat.f659i, 7);
        iconCompat.e();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.r(true, true);
        iconCompat.f(aVar.e());
        aVar.v(iconCompat.f651a, 1);
        aVar.t(iconCompat.f653c, 2);
        aVar.x(iconCompat.f654d, 3);
        aVar.v(iconCompat.f655e, 4);
        aVar.v(iconCompat.f656f, 5);
        aVar.x(iconCompat.f657g, 6);
        aVar.z(iconCompat.f659i, 7);
    }
}

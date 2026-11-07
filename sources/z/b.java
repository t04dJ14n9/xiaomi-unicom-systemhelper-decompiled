package z;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    public static abstract class a {

        /* JADX INFO: renamed from: z.b$a$a, reason: collision with other inner class name */
        class RunnableC0049a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Typeface f4066b;

            RunnableC0049a(Typeface typeface) {
                this.f4066b = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.d(this.f4066b);
            }
        }

        /* JADX INFO: renamed from: z.b$a$b, reason: collision with other inner class name */
        class RunnableC0050b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f4068b;

            RunnableC0050b(int i2) {
                this.f4068b = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c(this.f4068b);
            }
        }

        public final void a(int i2, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableC0050b(i2));
        }

        public final void b(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableC0049a(typeface));
        }

        public abstract void c(int i2);

        public abstract void d(Typeface typeface);
    }

    public static Typeface a(Context context, int i2, TypedValue typedValue, int i3, a aVar) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i2, typedValue, i3, aVar, null, true);
    }

    private static Typeface b(Context context, int i2, TypedValue typedValue, int i3, a aVar, Handler handler, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        Typeface typefaceC = c(context, resources, typedValue, i2, i3, aVar, handler, z2);
        if (typefaceC != null || aVar != null) {
            return typefaceC;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i2) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    private static Typeface c(Context context, Resources resources, TypedValue typedValue, int i2, int i3, a aVar, Handler handler, boolean z2) {
        StringBuilder sb;
        String str;
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i2) + "\" (" + Integer.toHexString(i2) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (aVar != null) {
                aVar.a(-3, handler);
            }
            return null;
        }
        Typeface typefaceE = a0.b.e(resources, i2, i3);
        if (typefaceE != null) {
            if (aVar != null) {
                aVar.b(typefaceE, handler);
            }
            return typefaceE;
        }
        try {
            if (!string.toLowerCase().endsWith(".xml")) {
                Typeface typefaceC = a0.b.c(context, resources, i2, string, i3);
                if (aVar != null) {
                    if (typefaceC != null) {
                        aVar.b(typefaceC, handler);
                    } else {
                        aVar.a(-3, handler);
                    }
                }
                return typefaceC;
            }
            z.a.InterfaceC0048a interfaceC0048aB = z.a.b(resources.getXml(i2), resources);
            if (interfaceC0048aB != null) {
                return a0.b.b(context, interfaceC0048aB, resources, i2, i3, aVar, handler, z2);
            }
            Log.e("ResourcesCompat", "Failed to find font-family tag");
            if (aVar != null) {
                aVar.a(-3, handler);
            }
            return null;
        } catch (IOException e2) {
            e = e2;
            sb = new StringBuilder();
            str = "Failed to read xml resource ";
            sb.append(str);
            sb.append(string);
            Log.e("ResourcesCompat", sb.toString(), e);
            if (aVar != null) {
                aVar.a(-3, handler);
            }
            return null;
        } catch (XmlPullParserException e3) {
            e = e3;
            sb = new StringBuilder();
            str = "Failed to parse xml resource ";
            sb.append(str);
            sb.append(string);
            Log.e("ResourcesCompat", sb.toString(), e);
            if (aVar != null) {
                aVar.a(-3, handler);
            }
            return null;
        }
    }
}

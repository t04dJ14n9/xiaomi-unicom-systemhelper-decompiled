package b;

import android.util.Base64;
import com.baidu.location.Jni;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f1790b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static n f1791a = new n();
    }

    public n() {
        this.f1789a = false;
        this.f1790b = null;
        try {
            String strL = Jni.l();
            if (strL == null || !strL.contains("|")) {
                return;
            }
            String[] strArrSplit = strL.split("\\|");
            this.f1790b = strArrSplit;
            if (strArrSplit == null || strArrSplit.length != 2) {
                return;
            }
            this.f1789a = true;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static n a() {
        return b.f1791a;
    }

    public synchronized String b(String str) {
        if (!this.f1789a) {
            return null;
        }
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(this.f1790b[1].getBytes("UTF-8"));
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f1790b[0].getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(Base64.decode(str, 0)), "UTF-8");
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public synchronized String c(String str) {
        if (this.f1789a) {
            try {
                IvParameterSpec ivParameterSpec = new IvParameterSpec(this.f1790b[1].getBytes("UTF-8"));
                SecretKeySpec secretKeySpec = new SecretKeySpec(this.f1790b[0].getBytes("UTF-8"), "AES");
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                cipher.init(1, secretKeySpec, ivParameterSpec);
                return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean d() {
        return this.f1789a;
    }
}

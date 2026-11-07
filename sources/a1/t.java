package a1;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.SecureRandom;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static KeyPair f79a;

    public static String a(String str) {
        if (!TextUtils.isEmpty(str) && f79a != null) {
            try {
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                cipher.init(1, f79a.getPrivate());
                return e.a(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8.name());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static KeyPair b() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048, new SecureRandom());
            if (f79a == null) {
                f79a = keyPairGenerator.generateKeyPair();
            }
            return f79a;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c() {
        PublicKey publicKey;
        KeyPair keyPair = f79a;
        if (keyPair == null || (publicKey = keyPair.getPublic()) == null) {
            return null;
        }
        try {
            return e.a(publicKey.getEncoded(), StandardCharsets.UTF_8.name());
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] d(String str) {
        if (!TextUtils.isEmpty(str) && f79a != null) {
            try {
                byte[] bArrB = e.b(str.getBytes(StandardCharsets.UTF_8));
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                cipher.init(2, f79a.getPrivate());
                return cipher.doFinal(bArrB);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }
}

package g1;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public static String a(String str) {
        byte b2;
        if (str == null || str.equals("")) {
            return "";
        }
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        } catch (NoSuchAlgorithmException e3) {
            System.out.println("NoSuchAlgorithmException = " + e3.toString());
        }
        byte[] bArrDigest = messageDigest.digest();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < bArrDigest.length; i2++) {
            if (Integer.toHexString(bArrDigest[i2] & 255).length() == 1) {
                stringBuffer.append("0");
                b2 = bArrDigest[i2];
            } else {
                b2 = bArrDigest[i2];
            }
            stringBuffer.append(Integer.toHexString(b2 & 255));
        }
        return stringBuffer.toString().toLowerCase();
    }
}

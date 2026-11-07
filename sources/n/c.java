package n;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static int a(ArrayList<ArrayList<Float>> arrayList) {
        return Math.round(b(arrayList) / c(arrayList));
    }

    public static int b(ArrayList<ArrayList<Float>> arrayList) {
        float fFloatValue = 0.0f;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ArrayList<Float> arrayList2 = arrayList.get(i2);
            if (arrayList2 != null && arrayList2.size() > 2 && arrayList2.get(2).floatValue() > 0.0f) {
                fFloatValue += arrayList2.get(2).floatValue() * arrayList2.get(1).floatValue();
            }
        }
        return Math.round(fFloatValue);
    }

    public static int c(ArrayList<ArrayList<Float>> arrayList) {
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ArrayList<Float> arrayList2 = arrayList.get(i3);
            if (arrayList2 != null && arrayList2.size() > 2 && arrayList2.get(2).floatValue() > 0.0f) {
                i2++;
            }
        }
        return i2;
    }

    public static int d(ArrayList<ArrayList<Float>> arrayList) {
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ArrayList<Float> arrayList2 = arrayList.get(i3);
            if (arrayList2 != null && arrayList2.size() > 2 && arrayList2.get(2).floatValue() >= 15.0f) {
                i2++;
            }
        }
        return i2;
    }

    public static int e(ArrayList<ArrayList<Float>> arrayList) {
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ArrayList<Float> arrayList2 = arrayList.get(i3);
            if (arrayList2 != null && arrayList2.size() > 2 && arrayList2.get(2).floatValue() >= 20.0f) {
                i2++;
            }
        }
        return i2;
    }

    public static int f(ArrayList<ArrayList<Float>> arrayList) {
        return Math.round(g(arrayList) / c(arrayList));
    }

    public static int g(ArrayList<ArrayList<Float>> arrayList) {
        float fFloatValue = 0.0f;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ArrayList<Float> arrayList2 = arrayList.get(i2);
            if (arrayList2 != null && arrayList2.size() > 2 && arrayList2.get(2).floatValue() > 0.0f) {
                fFloatValue += arrayList2.get(2).floatValue();
            }
        }
        return Math.round(fFloatValue);
    }

    public static int h(ArrayList<ArrayList<Float>> arrayList) {
        int i2;
        int[] iArr = new int[37];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            try {
                if (i4 >= arrayList.size()) {
                    break;
                }
                ArrayList<Float> arrayList2 = arrayList.get(i4);
                if (arrayList2 != null && arrayList2.size() > 0 && arrayList2.get(0).floatValue() < 360.0d) {
                    int iCeil = (int) Math.ceil(arrayList2.get(0).floatValue() / 10.0f);
                    iArr[iCeil] = iArr[iCeil] + 1;
                }
                i4++;
            } catch (Exception unused) {
                return 0;
            }
        }
        for (i2 = 1; i2 <= 36; i2++) {
            if (iArr[i2] > 0) {
                i3++;
            }
        }
        return Math.round((i3 / 36.0f) * 1000.0f);
    }
}

package d;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f<T> extends ArrayList<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2230b;

    public f(int i2) {
        this.f2230b = i2;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t2) {
        synchronized (this) {
            if (size() == this.f2230b) {
                remove(0);
            }
            add(size(), t2);
        }
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        synchronized (this) {
            if (size() <= 3) {
                return;
            }
            int size = size() / 2;
            while (true) {
                int i2 = size - 1;
                if (size <= 0) {
                    return;
                }
                remove(0);
                size = i2;
            }
        }
    }
}

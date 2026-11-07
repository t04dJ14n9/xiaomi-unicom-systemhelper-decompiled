package s0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f3627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f3628b = new HashMap();

    public interface a {
        List a();
    }

    public c(a aVar) {
        this.f3627a = aVar;
        for (s0.a aVar2 : aVar.a()) {
            this.f3628b.put(aVar2.a(), aVar2);
        }
    }

    public List a() {
        return new ArrayList(this.f3628b.values());
    }
}

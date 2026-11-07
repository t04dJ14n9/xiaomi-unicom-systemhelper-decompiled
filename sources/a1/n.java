package a1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class n extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f65a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(b bVar, Looper looper) {
        super(looper);
        this.f65a = bVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        d.b("handleMessage !!");
        if (message.what == 0) {
            this.f65a.l((JSONObject) message.obj);
        }
        c cVar = (c) b.f24m.get(message.getData().getString("listenerKey"));
        d.b("handleMessage listener = " + cVar);
        if (cVar != null) {
            cVar.a(message.what, message.obj.toString());
        }
    }
}

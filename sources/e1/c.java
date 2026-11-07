package e1;

import android.content.Context;
import g1.h;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes.dex */
public class c extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f2476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f2477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f2478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f2479e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f2480f = "";

    public interface a {
        void a(Context context, b bVar, String str, String str2);
    }

    public c(Context context, b bVar, a aVar) {
        this.f2476b = context;
        this.f2477c = bVar;
        this.f2478d = aVar;
    }

    private String a() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    String hostAddress = inetAddressNextElement.getHostAddress();
                    if (!inetAddressNextElement.isLoopbackAddress() && !inetAddressNextElement.isLinkLocalAddress() && (inetAddressNextElement instanceof Inet6Address)) {
                        return hostAddress;
                    }
                }
            }
        } catch (SocketException e2) {
            e2.printStackTrace();
        }
        h.a("GetIPAddressThread", "getIPv6Address:");
        return "";
    }

    private String b() {
        return "";
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f2479e = b();
        this.f2480f = a();
        h.a("GetIPAddressThread", "IPv4:" + this.f2479e + ", IPv6:" + this.f2480f);
        this.f2478d.a(this.f2476b, this.f2477c, this.f2479e, this.f2480f);
    }
}

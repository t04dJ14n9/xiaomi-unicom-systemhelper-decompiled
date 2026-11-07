package e1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.CellIdentity;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.NetworkRegistrationInfo;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import g1.h;
import g1.k;
import g1.l;
import g1.n;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2481a = null;

    public static CellLocation b(Context context, int i2) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null || y.a.a(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            return null;
        }
        return telephonyManager.getCellLocation();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:26:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce A[RETURN] */
    public String a(int i2) {
        CellLocation cellLocationB;
        String strValueOf;
        int baseStationId;
        StringBuilder sb;
        String str;
        h.a("GetSignalStrengthInfo", "enter getCellId====>");
        HashMap<String, Object> map = new HashMap<>();
        map.put("slot", Integer.valueOf(i2));
        map.put("isCDMA", Boolean.TRUE);
        HashMap<String, Object> mapF = f(this.f2481a, "API_TAG_getCellLocation", map);
        if (mapF == null) {
            cellLocationB = b(this.f2481a, i2);
            if (cellLocationB != null) {
                return "-1";
            }
            if (cellLocationB instanceof GsmCellLocation) {
                baseStationId = ((GsmCellLocation) cellLocationB).getCid();
            } else {
                if (cellLocationB instanceof CdmaCellLocation) {
                    baseStationId = ((CdmaCellLocation) cellLocationB).getBaseStationId();
                } else {
                    strValueOf = "";
                }
                sb = new StringBuilder();
                str = "CELLID:";
            }
            strValueOf = String.valueOf(baseStationId);
            sb = new StringBuilder();
            str = "CELLID:";
        } else {
            Object obj = mapF.get("nrCellId");
            if (obj != null && (obj instanceof String)) {
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2)) {
                    h.a("GetSignalStrengthInfo", "nrCellid: " + str2);
                    return str2;
                }
            }
            Object obj2 = mapF.get("cdmaLteCellLocation");
            if (obj2 == null || !(obj2 instanceof Bundle)) {
                Object obj3 = mapF.get("cellLocation");
                if (obj3 == null || !(obj3 instanceof Bundle)) {
                    cellLocationB = b(this.f2481a, i2);
                    if (cellLocationB != null) {
                        return "-1";
                    }
                    if (cellLocationB instanceof GsmCellLocation) {
                        baseStationId = ((GsmCellLocation) cellLocationB).getCid();
                    } else {
                        if (cellLocationB instanceof CdmaCellLocation) {
                            baseStationId = ((CdmaCellLocation) cellLocationB).getBaseStationId();
                        } else {
                            strValueOf = "";
                        }
                        sb = new StringBuilder();
                        str = "CELLID:";
                    }
                    strValueOf = String.valueOf(baseStationId);
                    sb = new StringBuilder();
                    str = "CELLID:";
                } else {
                    strValueOf = String.valueOf(new GsmCellLocation((Bundle) obj3).getCid());
                    sb = new StringBuilder();
                    str = "cellid: ";
                }
            } else {
                strValueOf = String.valueOf(new GsmCellLocation((Bundle) obj2).getCid());
                sb = new StringBuilder();
                str = "cellId: ";
            }
        }
        sb.append(str);
        sb.append(strValueOf);
        h.a("GetSignalStrengthInfo", sb.toString());
        return strValueOf;
    }

    public List<CellInfo> c(int i2) {
        Object objG = g("getCellInfoList", new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(i2)});
        List<CellInfo> list = null;
        if (objG != null) {
            try {
                if (objG instanceof List) {
                    list = (List) objG;
                }
            } catch (Exception unused) {
            }
        }
        h.a("GetSignalStrengthInfo", "getCellinfoList==>" + list);
        return list;
    }

    void d(Context context, int i2, n nVar) {
        String str;
        ServiceState serviceState;
        TelephonyManager telephonyManager;
        String strValueOf;
        String strValueOf2;
        String str2;
        String str3;
        StringBuilder sb;
        try {
            nVar.f2691d = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
        new a(context, i2);
        nVar.f2713z = a.f2441d;
        nVar.A = a.f2442e;
        h.a("GetSignalStrengthInfo", "signalInfo.callDisconnectCause: " + nVar.f2713z + ", " + nVar.A);
        int i3 = f1.a.i(i2);
        h.a("GetSignalStrengthInfo", "getSignal====> slot: " + i2 + " subId: " + i3);
        TelephonyManager telephonyManagerCreateForSubscriptionId = ((TelephonyManager) context.getSystemService("phone")).createForSubscriptionId(i3);
        String strO = l.o("ro.product.manufacturer");
        if (strO != null && !strO.isEmpty() && strO.equalsIgnoreCase("vivo")) {
            g1.d.f2652e = l.a(this.f2481a);
        }
        if (g1.d.f2652e) {
            String simSerialNumber = telephonyManagerCreateForSubscriptionId.getSimSerialNumber();
            nVar.f2690c = simSerialNumber;
            if (simSerialNumber == null || simSerialNumber.isEmpty()) {
                nVar.f2690c = "ex01";
            }
            h.a("GetSignalStrengthInfo", "ICCID:" + nVar.f2690c);
            String subscriberId = telephonyManagerCreateForSubscriptionId.getSubscriberId();
            nVar.f2694g = subscriberId;
            if (subscriberId == null || subscriberId.isEmpty()) {
                nVar.f2694g = "ex01";
            }
            nVar.f2692e = telephonyManagerCreateForSubscriptionId.getSimOperator();
            nVar.f2693f = telephonyManagerCreateForSubscriptionId.getNetworkOperator();
            h.a("GetSignalStrengthInfo", "mncch :  " + nVar.f2693f);
            String str4 = nVar.f2692e;
            if (str4 == null || str4.isEmpty()) {
                nVar.f2692e = "ex01";
            }
            String str5 = nVar.f2693f;
            if (str5 == null || str5.isEmpty()) {
                h.a("GetSignalStrengthInfo", "mncch==> null " + nVar.f2693f);
                nVar.f2693f = "ex01";
            }
            String str6 = nVar.f2694g;
            if (str6 == null || nVar.f2690c == null || str6.equals("") || nVar.f2694g.length() < 5 || nVar.f2690c.length() < 6 || l.v(nVar.f2694g).booleanValue()) {
                str = "NW";
            } else {
                if (nVar.f2694g.length() < 11 || nVar.f2690c.length() < 11) {
                    str = "NW";
                    if (nVar.f2694g.length() >= 11) {
                        nVar.f2694g = nVar.f2694g.substring(0, 10) + "*****";
                    } else if (nVar.f2690c.length() >= 11) {
                        sb = new StringBuilder();
                        sb.append(nVar.f2690c.substring(0, 10));
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    str = "NW";
                    sb2.append(nVar.f2694g.substring(0, 10));
                    sb2.append("*****");
                    nVar.f2694g = sb2.toString();
                    sb = new StringBuilder();
                    sb.append(nVar.f2690c.substring(0, 10));
                }
                sb.append("**********");
                nVar.f2690c = sb.toString();
            }
            if (!g1.d.f2652e) {
                h.b("GetSignalStrengthInfo", "Insufficient permission!!");
                return;
            }
            if (strO != null && !strO.isEmpty()) {
                if (strO.equalsIgnoreCase("Xiaomi")) {
                    Class<?> clsA = k.a("miui.telephony.TelephonyManager");
                    try {
                        nVar.f2689b = (String) k.c(k.b(clsA, "getImeiForSlot", Integer.TYPE), k.c(k.b(clsA, "getDefault", new Class[0]), null, new Object[0]), Integer.valueOf(i2));
                        h.a("GetSignalStrengthInfo", "siginfo.IMEI: " + nVar.f2689b);
                    } catch (Exception unused) {
                        h.b("GetSignalStrengthInfo", "Exception:getImeiForSlot");
                    }
                } else {
                    nVar.f2689b = telephonyManagerCreateForSubscriptionId.getImei();
                }
                h.a("GetSignalStrengthInfo", "getImei====> imei: " + nVar.f2689b);
            }
            if (y.a.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0 && y.a.a(context, "android.permission.READ_PHONE_STATE") == 0 && (serviceState = telephonyManagerCreateForSubscriptionId.getServiceState()) != null) {
                Iterator<NetworkRegistrationInfo> it = serviceState.getNetworkRegistrationInfoList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        telephonyManager = telephonyManagerCreateForSubscriptionId;
                        break;
                    }
                    NetworkRegistrationInfo next = it.next();
                    if (next.getDomain() == 2 && next.getTransportType() == 1) {
                        String string = next.toString();
                        CellIdentity cellIdentity = next.getCellIdentity();
                        if (cellIdentity != null) {
                            telephonyManager = telephonyManagerCreateForSubscriptionId;
                            if (cellIdentity instanceof CellIdentityLte) {
                                CellIdentityLte cellIdentityLte = (CellIdentityLte) cellIdentity;
                                if (strO != null) {
                                    try {
                                        if (!strO.isEmpty()) {
                                            nVar.f2697j = strO.equalsIgnoreCase("vivo") ? a(i2) : String.valueOf(cellIdentityLte.getCi());
                                        }
                                    } catch (Exception e3) {
                                        h.a("GetSignalStrengthInfo", "exception:" + e3);
                                    }
                                }
                                nVar.f2696i = String.valueOf(cellIdentityLte.getTac());
                                nVar.f2698k = String.valueOf(cellIdentityLte.getPci());
                                nVar.f2701n = Arrays.toString(cellIdentityLte.getBands()).replace("[", "").replace("]", "");
                                nVar.f2702o = String.valueOf(cellIdentityLte.getBandwidth());
                                nVar.f2699l = "LTE";
                                if (!string.contains("isEnDcAvailable = true")) {
                                    break;
                                } else {
                                    str3 = "NSA";
                                }
                            } else if (cellIdentity instanceof CellIdentityNr) {
                                CellIdentityNr cellIdentityNr = (CellIdentityNr) cellIdentity;
                                if (strO != null) {
                                    try {
                                        if (!strO.isEmpty()) {
                                            nVar.f2697j = strO.equalsIgnoreCase("vivo") ? a(i2) : String.valueOf(cellIdentityNr.getNci());
                                        }
                                    } catch (Exception e4) {
                                        h.a("GetSignalStrengthInfo", "exception:" + e4);
                                    }
                                }
                                nVar.f2696i = String.valueOf(cellIdentityNr.getTac());
                                nVar.f2698k = String.valueOf(cellIdentityNr.getPci());
                                nVar.f2701n = Arrays.toString(cellIdentityNr.getBands()).replace("[", "").replace("]", "");
                                nVar.f2700m = String.valueOf(cellIdentityNr.getNrarfcn());
                                str3 = "SA";
                            }
                            nVar.f2699l = str3;
                            break;
                        }
                        return;
                    }
                    telephonyManager = telephonyManagerCreateForSubscriptionId;
                    it = it;
                    telephonyManagerCreateForSubscriptionId = telephonyManager;
                }
                if (y.a.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                    nVar.I = l.t(context).booleanValue() ? !l.w(context).booleanValue() ? "Mobile" : "WiFi" : "Disconnected";
                }
                try {
                    WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                    if (wifiManager != null) {
                        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                        if (connectionInfo == null || connectionInfo.getNetworkId() == -1) {
                            nVar.J = "NWC";
                            nVar.K = "NWC";
                            str2 = "没有连接wifi！";
                        } else {
                            nVar.J = connectionInfo.getBSSID();
                            nVar.K = connectionInfo.getSSID();
                            str2 = "wifiManager :路由器的mac地址： " + connectionInfo.getBSSID();
                        }
                        h.a("GetSignalStrengthInfo", str2);
                    } else {
                        h.a("GetSignalStrengthInfo", "设备不支持wifi");
                        String str7 = str;
                        nVar.J = str7;
                        nVar.K = str7;
                    }
                } catch (Exception e5) {
                    h.a("GetSignalStrengthInfo", "Exception " + e5);
                }
                if (strO == null || strO.isEmpty() || !strO.equalsIgnoreCase("vivo") || Build.VERSION.SDK_INT <= 34) {
                    SignalStrength signalStrength = telephonyManager.getSignalStrength();
                    h.a("GetSignalStrengthInfo", "验证===slot: " + i2 + "signalStrength" + signalStrength);
                    List<CellSignalStrength> cellSignalStrengths = signalStrength.getCellSignalStrengths();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("cellSignalStrengthList ===> ");
                    sb3.append(cellSignalStrengths);
                    h.a("GetSignalStrengthInfo", sb3.toString());
                    if (cellSignalStrengths != null) {
                        for (CellSignalStrength cellSignalStrength : cellSignalStrengths) {
                            if (cellSignalStrength instanceof CellSignalStrengthNr) {
                                CellSignalStrengthNr cellSignalStrengthNr = (CellSignalStrengthNr) cellSignalStrength;
                                nVar.f2705r = String.valueOf(cellSignalStrengthNr.getSsRsrp());
                                h.a("GetSignalStrengthInfo", "rsrp : " + nVar.f2705r);
                                nVar.f2707t = String.valueOf(cellSignalStrengthNr.getSsRsrq());
                                nVar.f2706s = String.valueOf(cellSignalStrengthNr.getSsSinr());
                                nVar.f2703p = String.valueOf(cellSignalStrengthNr.getCsiCqiTableIndex());
                                strValueOf = String.valueOf(cellSignalStrengthNr.getCsiCqiReport());
                            } else if (cellSignalStrength instanceof CellSignalStrengthLte) {
                                CellSignalStrengthLte cellSignalStrengthLte = (CellSignalStrengthLte) cellSignalStrength;
                                nVar.f2705r = String.valueOf(cellSignalStrengthLte.getRsrp());
                                nVar.f2707t = String.valueOf(cellSignalStrengthLte.getRsrq());
                                nVar.f2706s = String.valueOf(cellSignalStrengthLte.getRssnr());
                                nVar.f2703p = String.valueOf(cellSignalStrengthLte.getCqiTableIndex());
                                strValueOf = String.valueOf(cellSignalStrengthLte.getCqi());
                            }
                            nVar.f2704q = strValueOf;
                            return;
                        }
                        return;
                    }
                    return;
                }
                List<CellInfo> listC = c(i2);
                h.a("GetSignalStrengthInfo", "cellInfos===>" + listC);
                if (listC == null || listC.size() < 0) {
                    h.a("GetSignalStrengthInfo", "cellInfos == null || cellInfos.size() < 0");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (CellInfo cellInfo : listC) {
                    h.a("GetSignalStrengthInfo", "android.telephony.CellInfo cellInfo : cellInfos" + cellInfo);
                    if (cellInfo.isRegistered() && ((cellInfo instanceof CellInfoLte) || (cellInfo instanceof CellInfoNr))) {
                        arrayList.add(cellInfo);
                    }
                }
                h.a("GetSignalStrengthInfo", "newCellInfos.size(): " + arrayList.size());
                if (arrayList.size() <= 0) {
                    h.a("GetSignalStrengthInfo", "newCellInfos.size() <= 0    getCeXXXXfo is not Nr or LTE");
                    return;
                }
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    CellInfo cellInfo2 = (CellInfo) arrayList.get(i4);
                    h.a("GetSignalStrengthInfo", "CELLINFO: " + cellInfo2);
                    if (cellInfo2 instanceof CellInfoNr) {
                        CellSignalStrength cellSignalStrength2 = ((CellInfoNr) cellInfo2).getCellSignalStrength();
                        if (cellSignalStrength2 instanceof CellSignalStrengthNr) {
                            CellSignalStrengthNr cellSignalStrengthNr2 = (CellSignalStrengthNr) cellSignalStrength2;
                            nVar.f2705r = String.valueOf(cellSignalStrengthNr2.getSsRsrp());
                            nVar.f2707t = String.valueOf(cellSignalStrengthNr2.getSsRsrq());
                            nVar.f2706s = String.valueOf(cellSignalStrengthNr2.getSsSinr());
                            nVar.f2703p = String.valueOf(cellSignalStrengthNr2.getCsiCqiTableIndex());
                            strValueOf2 = String.valueOf(cellSignalStrengthNr2.getCsiCqiReport());
                            nVar.f2704q = strValueOf2;
                            return;
                        }
                    } else {
                        if (cellInfo2 instanceof CellInfoLte) {
                            CellInfoLte cellInfoLte = (CellInfoLte) cellInfo2;
                            CellIdentityLte cellIdentity2 = cellInfoLte.getCellIdentity();
                            CellSignalStrengthLte cellSignalStrength3 = cellInfoLte.getCellSignalStrength();
                            if (cellIdentity2 instanceof CellIdentityLte) {
                                cellIdentity2.getPci();
                            }
                            if (cellSignalStrength3 instanceof CellSignalStrengthLte) {
                                nVar.f2705r = String.valueOf(cellSignalStrength3.getRsrp());
                                nVar.f2707t = String.valueOf(cellSignalStrength3.getRsrq());
                                nVar.f2706s = String.valueOf(cellSignalStrength3.getRssi());
                                nVar.f2703p = String.valueOf(cellSignalStrength3.getCqiTableIndex());
                                strValueOf2 = String.valueOf(cellSignalStrength3.getCqi());
                                nVar.f2704q = strValueOf2;
                                return;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }

    public void e(Context context, int i2, n nVar) {
        this.f2481a = context;
        h.a("GetSignalStrengthInfo", "GetSignalStrengthInfo====>");
        if (f1.a.i(i2) > 0) {
            d(context, i2, nVar);
        }
    }

    public HashMap<String, Object> f(Context context, String str, HashMap<String, Object> map) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (str == null) {
            return null;
        }
        try {
            Method declaredMethod = telephonyManager.getClass().getDeclaredMethod("getITelephony", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(telephonyManager, null);
            if (objInvoke == null) {
                return null;
            }
            Class<?> cls = Class.forName("com.android.internal.telephony.VivoTelephonyApiParams");
            Object objNewInstance = cls.getConstructor(String.class).newInstance(str);
            if (map != null) {
                Method method = cls.getMethod("put", String.class, Object.class);
                for (String str2 : map.keySet()) {
                    if ((!"slot".equals(str2) && !"phoneId".equals(str2)) || ((Integer) map.get(str2)).intValue() >= 0) {
                        method.invoke(objNewInstance, str2, map.get(str2));
                    }
                }
            }
            Object objInvoke2 = objInvoke.getClass().getMethod("vivoTelephonyApi", cls).invoke(objInvoke, objNewInstance);
            if (objInvoke2 != null) {
                return (HashMap) objInvoke2.getClass().getMethod("getParamValues", new Class[0]).invoke(objInvoke2, new Object[0]);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public Object g(String str, Class[] clsArr, Object[] objArr) {
        try {
            Class<?> cls = Class.forName("android.telephony.VivoTelephonyManager");
            return cls.getMethod(str, clsArr).invoke(cls.getMethod("getInstance", Context.class).invoke(null, this.f2481a.getApplicationContext()), objArr);
        } catch (Exception e2) {
            h.b("GetSignalStrengthInfo", "invokeVivoTelephonyManagerApi exception : " + e2);
            return null;
        }
    }
}

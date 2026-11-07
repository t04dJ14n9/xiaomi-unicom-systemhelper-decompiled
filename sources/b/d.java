package b;

import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.baidu.location.Jni;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class d extends n.g {
    public boolean A;
    public boolean B;
    public boolean C;
    public double D;
    public double E;
    public int F;
    public int G;
    public String H;
    public int I;
    public String J;
    public String K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f1659k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Handler f1660l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f1661m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f1662n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f1663o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double f1664p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float[] f1665q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float[] f1666r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float[] f1667s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float[] f1668t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float[] f1669u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float[] f1670v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList<ArrayList<Float>> f1671w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList<ArrayList<Double>> f1672x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1673y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f1674z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExecutorService executorServiceC = w.b().c();
            d dVar = d.this;
            if (executorServiceC != null) {
                dVar.c(executorServiceC, n.d.f3357c);
            } else {
                dVar.b(n.d.f3357c);
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f1676a = new d(null);
    }

    public d() {
        this.f1658j = false;
        this.f1659k = 0L;
        this.f1660l = null;
        this.f1661m = null;
        this.f1662n = null;
        this.f1663o = 0.0d;
        this.f1664p = 0.0d;
        this.f1665q = new float[]{0.0f};
        this.f1666r = new float[]{0.0f};
        this.f1667s = new float[]{0.0f};
        this.f1668t = new float[]{0.0f};
        this.f1669u = new float[]{0.0f};
        this.f1670v = new float[]{0.0f};
        this.f1671w = null;
        this.f1672x = null;
        this.f1673y = false;
        this.f1674z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = 1.0d;
        this.E = 1.0d;
        this.F = 0;
        this.G = 0;
        this.H = "";
        this.I = 0;
        this.J = "1,1,300,4,30,10,5,10";
        this.K = "25,10,4";
        this.L = 1;
        this.M = 1;
        this.N = 30;
        this.O = 64;
        this.P = 1;
        this.Q = 0;
        this.f1659k = r.c().a("vdrtt", 0L);
        this.f1661m = r.c().d("mapcity", null);
    }

    public /* synthetic */ d(a aVar) {
        this();
    }

    public static d s() {
        return b.f1676a;
    }

    @Override // n.g
    public void a() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("&sdk=");
        stringBuffer.append(9.521f);
        stringBuffer.append("&stp=1");
        if (n.b.g().f3351c == null) {
            stringBuffer.append("&im=");
            str = n.b.g().f3349a;
        } else {
            stringBuffer.append("&cu=");
            str = n.b.g().f3351c;
        }
        stringBuffer.append(str);
        stringBuffer.append("&mb=");
        stringBuffer.append(Build.MODEL);
        stringBuffer.append("&abtest=1");
        stringBuffer.append("&fixa9=2");
        stringBuffer.append("&sv=");
        String strSubstring = Build.VERSION.RELEASE;
        if (strSubstring != null && strSubstring.length() > 10) {
            strSubstring = strSubstring.substring(0, 10);
        }
        stringBuffer.append(strSubstring);
        stringBuffer.append("&os=");
        stringBuffer.append(Build.VERSION.SDK_INT);
        stringBuffer.append("&pack=");
        stringBuffer.append(n.b.f3344f);
        stringBuffer.append("&city=");
        stringBuffer.append(this.f1661m);
        stringBuffer.append("&locmode=");
        stringBuffer.append(n.i.x(com.baidu.location.f.c()));
        stringBuffer.append("&locper=");
        stringBuffer.append(n.i.c(com.baidu.location.f.c(), "android.permission.ACCESS_FINE_LOCATION"));
        if (this.f1664p > 0.10000000149011612d && this.f1663o > 0.10000000149011612d) {
            stringBuffer.append("&x=");
            stringBuffer.append(this.f1664p);
            stringBuffer.append("&y=");
            stringBuffer.append(this.f1663o);
        }
        stringBuffer.append("&selftest=");
        stringBuffer.append(0);
        stringBuffer.append("&rpmmc=");
        stringBuffer.append("0");
        if (this.f3382d == null) {
            this.f3382d = new HashMap();
        }
        Map<String, Object> map = this.f3382d;
        if (map != null) {
            map.clear();
            this.f3382d.put("it", Jni.e(stringBuffer.toString()));
            this.f3382d.put("qt", "vdr");
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    @Override // n.g
    public void h(boolean z2) {
        String str;
        if (z2 && (str = this.f3381c) != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("data")) {
                    String string = jSONObject.getString("data");
                    r.c().g("vdrconfig", "");
                    r.c().g("vdrconfig_gz", string);
                    m(true);
                } else if (!this.f1658j) {
                    r();
                    this.f1658j = true;
                }
            } catch (Exception unused) {
                if (!this.f1658j) {
                    r();
                    this.f1658j = true;
                }
            }
        } else if (!this.f1658j) {
            r();
            this.f1658j = true;
        }
        Map<String, Object> map = this.f3382d;
        if (map != null) {
            map.clear();
        }
    }

    public void i(double d2, double d3) {
        this.f1663o = d2;
        this.f1664p = d3;
    }

    public final void j() {
        String[] strArrSplit = "1|0|300|80|2|300|80|2|100|40|30|3|8|4050|5|5|0.1|1|1|0|0.325|0.15|3|0.5|1|6|15|10|0.05|10|10|1|5|10|10|30|5|5.5|1|0|1|40|0.5|120|180|20|200|300|600|2|10|2|4|1.02|2|0|20|10|60|2|100|2|10|1|20|0|0.2|0|0|0.5|0|1|1000|10|1|40|5|10|5|0.8|1|5.0|50|6.0|2.0|4.0|1|1|0|0|1|0.5|1|0.0|1|200|100|1|8|5|25|20|1|70.0|110.0|300|1|15|1.0".split("\\|");
        this.f1665q = new float[strArrSplit.length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                this.f1665q[i2] = Float.parseFloat(strArrSplit[i2]);
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void k() {
        String[] strArrSplit = "1|0.05|60|45|2|300|80|2|100|40|30|3|8|4050|5|5|0.1|1|1|0|0.325|0|0|0.5|1|6|15|10|0.05|10|10|1|5|10|10|30|5|5.5|1|0|1|40|0.5|120|180|20|200|300|600|2|10|2|4|1.02|0|0|20|10|60|2|100|2|10|1|20|1|0.2|0|0|0.5|0|1|1000|10|1|40|5|10|5|0.8|1|5|50|6|2|4|1|1|0|0|1|0.5|1|0|1|200|100|1".split("\\|");
        this.f1666r = new float[strArrSplit.length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                this.f1666r[i2] = Float.parseFloat(strArrSplit[i2]);
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void l(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f1661m = str;
    }

    /* JADX WARN: Code duplicated, block: B:454:0x07e5 A[Catch: Exception -> 0x0f79, TryCatch #13 {Exception -> 0x0f79, blocks: (B:12:0x0051, B:14:0x005c, B:15:0x005f, B:19:0x006a, B:21:0x0075, B:23:0x0081, B:25:0x0087, B:27:0x008f, B:28:0x009b, B:30:0x00a1, B:31:0x00a6, B:33:0x00ae, B:34:0x00b4, B:36:0x00bc, B:37:0x00c2, B:39:0x00ca, B:40:0x00d0, B:42:0x00d8, B:43:0x00df, B:45:0x00e7, B:46:0x00ee, B:48:0x00f6, B:49:0x00fc, B:51:0x0104, B:52:0x010a, B:54:0x0112, B:55:0x0118, B:57:0x0120, B:58:0x0127, B:60:0x0130, B:61:0x0135, B:63:0x013d, B:64:0x0143, B:66:0x014b, B:168:0x033c, B:170:0x0344, B:171:0x0349, B:173:0x0351, B:174:0x0356, B:176:0x035e, B:177:0x0363, B:179:0x036b, B:180:0x0370, B:182:0x0378, B:183:0x037d, B:185:0x0385, B:186:0x038a, B:188:0x0392, B:189:0x0397, B:191:0x039f, B:192:0x03a4, B:194:0x03ac, B:195:0x03b1, B:197:0x03b9, B:198:0x03be, B:200:0x03c6, B:201:0x03cb, B:203:0x03d3, B:204:0x03d8, B:206:0x03e0, B:207:0x03e7, B:209:0x03ef, B:210:0x03f4, B:212:0x03fc, B:213:0x0401, B:215:0x0409, B:216:0x040e, B:218:0x0416, B:219:0x041b, B:221:0x0423, B:222:0x0428, B:224:0x0430, B:225:0x0435, B:227:0x043d, B:228:0x0442, B:230:0x044a, B:231:0x044f, B:233:0x0457, B:234:0x045c, B:236:0x0464, B:237:0x0469, B:239:0x0471, B:240:0x0476, B:242:0x047e, B:243:0x0483, B:245:0x048b, B:246:0x0490, B:248:0x0498, B:249:0x049d, B:251:0x04a5, B:252:0x04aa, B:254:0x04b2, B:255:0x04b7, B:257:0x04bf, B:258:0x04c4, B:260:0x04cc, B:261:0x04d1, B:263:0x04d9, B:264:0x04de, B:266:0x04e6, B:267:0x04eb, B:269:0x04f3, B:270:0x04f8, B:272:0x0500, B:273:0x0505, B:275:0x050d, B:276:0x0512, B:278:0x051a, B:279:0x051f, B:281:0x0527, B:282:0x052c, B:284:0x0534, B:285:0x0539, B:287:0x0541, B:288:0x0546, B:290:0x054e, B:291:0x0553, B:293:0x055b, B:294:0x0560, B:296:0x0568, B:297:0x056d, B:299:0x0575, B:300:0x057a, B:302:0x0580, B:303:0x0583, B:305:0x058b, B:306:0x0590, B:308:0x0598, B:309:0x059d, B:311:0x05a3, B:312:0x05a6, B:314:0x05ac, B:315:0x05af, B:317:0x05b7, B:318:0x05bc, B:320:0x05c2, B:321:0x05c5, B:323:0x05cd, B:324:0x05d2, B:326:0x05da, B:327:0x05df, B:329:0x05e7, B:330:0x05ec, B:332:0x05f2, B:333:0x05f5, B:335:0x05fb, B:336:0x05fe, B:338:0x0604, B:339:0x0607, B:341:0x060f, B:342:0x0612, B:344:0x061a, B:345:0x061d, B:347:0x0625, B:348:0x0628, B:350:0x0630, B:351:0x0635, B:353:0x063d, B:354:0x0642, B:356:0x064a, B:357:0x064f, B:359:0x0657, B:360:0x065c, B:362:0x0664, B:363:0x0669, B:365:0x0671, B:366:0x0676, B:368:0x067e, B:369:0x0683, B:371:0x068b, B:372:0x0690, B:374:0x0698, B:375:0x069d, B:377:0x06a5, B:378:0x06aa, B:380:0x06b2, B:381:0x06b7, B:383:0x06bf, B:384:0x06c4, B:386:0x06cc, B:387:0x06d1, B:389:0x06d9, B:390:0x06de, B:392:0x06e6, B:393:0x06eb, B:395:0x06f3, B:396:0x06f8, B:398:0x0700, B:399:0x0705, B:401:0x070d, B:402:0x0712, B:404:0x071a, B:405:0x071f, B:407:0x0727, B:408:0x072c, B:410:0x0734, B:411:0x0739, B:414:0x0746, B:421:0x0759, B:424:0x0767, B:427:0x0775, B:430:0x077f, B:432:0x078b, B:433:0x078d, B:436:0x079b, B:439:0x07a9, B:441:0x07b1, B:443:0x07bd, B:445:0x07c3, B:446:0x07cf, B:448:0x07d2, B:453:0x07e2, B:455:0x07ea, B:457:0x07f2, B:459:0x07fe, B:461:0x0804, B:462:0x080e, B:464:0x0811, B:469:0x0821, B:471:0x0827, B:473:0x082f, B:475:0x083b, B:477:0x0841, B:478:0x084b, B:480:0x084e, B:485:0x085e, B:487:0x0864, B:489:0x086c, B:491:0x0878, B:493:0x087e, B:494:0x0888, B:496:0x088b, B:501:0x089b, B:503:0x08a1, B:505:0x08a9, B:507:0x08b5, B:509:0x08bb, B:510:0x08c5, B:512:0x08c8, B:517:0x08d8, B:519:0x08de, B:521:0x08e6, B:523:0x08f2, B:525:0x08f8, B:526:0x0902, B:528:0x0905, B:533:0x0915, B:535:0x091b, B:538:0x0925, B:540:0x092d, B:542:0x0933, B:544:0x0942, B:548:0x0965, B:550:0x096d, B:552:0x0979, B:553:0x097c, B:555:0x0982, B:556:0x0985, B:558:0x098b, B:559:0x098e, B:561:0x0994, B:562:0x0997, B:564:0x099d, B:565:0x09a0, B:567:0x09a6, B:568:0x09a9, B:570:0x09af, B:571:0x09b2, B:573:0x09b8, B:574:0x09bb, B:576:0x09c3, B:577:0x09c6, B:579:0x09ce, B:580:0x09d1, B:582:0x09d9, B:584:0x09e7, B:585:0x09ec, B:587:0x09f4, B:588:0x09f9, B:590:0x0a01, B:591:0x0a06, B:593:0x0a0e, B:594:0x0a13, B:596:0x0a1b, B:597:0x0a20, B:599:0x0a28, B:600:0x0a2d, B:602:0x0a35, B:603:0x0a3a, B:605:0x0a42, B:606:0x0a47, B:608:0x0a4f, B:609:0x0a54, B:623:0x0aba, B:645:0x0b46, B:647:0x0b4e, B:648:0x0b53, B:650:0x0b5b, B:651:0x0b60, B:653:0x0b68, B:654:0x0b6d, B:656:0x0b75, B:657:0x0b7a, B:659:0x0b82, B:660:0x0b87, B:662:0x0b8f, B:663:0x0b94, B:665:0x0b9c, B:666:0x0ba1, B:668:0x0ba9, B:669:0x0bae, B:671:0x0bb6, B:672:0x0bbb, B:674:0x0bc3, B:675:0x0bc8, B:677:0x0bd0, B:678:0x0bd5, B:680:0x0bdd, B:681:0x0be2, B:683:0x0bea, B:684:0x0bef, B:686:0x0bf7, B:687:0x0bfc, B:689:0x0c04, B:690:0x0c09, B:692:0x0c11, B:693:0x0c16, B:695:0x0c1e, B:696:0x0c23, B:698:0x0c2b, B:699:0x0c30, B:701:0x0c38, B:702:0x0c3d, B:704:0x0c45, B:705:0x0c4a, B:707:0x0c52, B:708:0x0c57, B:710:0x0c5f, B:711:0x0c65, B:713:0x0c6d, B:714:0x0c74, B:716:0x0c7c, B:717:0x0c85, B:719:0x0c8d, B:720:0x0c94, B:722:0x0c9c, B:723:0x0ca3, B:725:0x0cab, B:726:0x0cb0, B:728:0x0cb8, B:729:0x0cbd, B:731:0x0cc5, B:732:0x0cca, B:734:0x0cd2, B:735:0x0cd7, B:737:0x0cdf, B:738:0x0ce5, B:740:0x0ced, B:741:0x0cf4, B:743:0x0cfc, B:744:0x0d02, B:746:0x0d0a, B:747:0x0d10, B:749:0x0d18, B:750:0x0d1e, B:752:0x0d26, B:758:0x0d56, B:760:0x0d5e, B:761:0x0d68, B:763:0x0d70, B:764:0x0d75, B:766:0x0d7d, B:767:0x0d83, B:769:0x0d8b, B:770:0x0d92, B:772:0x0d9a, B:773:0x0da0, B:775:0x0da8, B:776:0x0dad, B:778:0x0db5, B:779:0x0dbb, B:781:0x0dc3, B:782:0x0dc8, B:784:0x0dd0, B:785:0x0dd7, B:787:0x0ddf, B:788:0x0de5, B:790:0x0ded, B:791:0x0df3, B:793:0x0dfb, B:794:0x0e05, B:796:0x0e0d, B:797:0x0e17, B:799:0x0e1f, B:800:0x0e25, B:802:0x0e2d, B:803:0x0e32, B:805:0x0e3a, B:806:0x0e3f, B:808:0x0e47, B:809:0x0e4c, B:811:0x0e54, B:812:0x0e59, B:814:0x0e61, B:815:0x0e67, B:817:0x0e6f, B:818:0x0e78, B:820:0x0e80, B:821:0x0e8a, B:823:0x0e92, B:824:0x0e9c, B:826:0x0ea4, B:827:0x0eaa, B:829:0x0eb2, B:830:0x0eb8, B:832:0x0ec0, B:833:0x0ec8, B:835:0x0ed0, B:836:0x0ed8, B:838:0x0ee0, B:839:0x0ee8, B:841:0x0ef0, B:842:0x0ef5, B:844:0x0efd, B:845:0x0f02, B:847:0x0f0a, B:849:0x0f16, B:851:0x0f1e, B:852:0x0f2a, B:854:0x0f32, B:855:0x0f37, B:857:0x0f3f, B:858:0x0f44, B:860:0x0f4c, B:861:0x0f51, B:863:0x0f59, B:864:0x0f5e, B:866:0x0f66, B:867:0x0f6b, B:869:0x0f73, B:644:0x0b43, B:622:0x0ab7, B:532:0x0912, B:534:0x0918, B:516:0x08d5, B:518:0x08db, B:500:0x0898, B:502:0x089e, B:484:0x085b, B:486:0x0861, B:468:0x081e, B:470:0x0824, B:452:0x07df, B:454:0x07e5, B:167:0x0339, B:124:0x0262, B:126:0x026a, B:128:0x0278, B:129:0x027d, B:131:0x0285, B:132:0x028a, B:134:0x0292, B:135:0x02a2, B:137:0x02aa, B:138:0x02af, B:140:0x02b7, B:141:0x02bc, B:143:0x02c4, B:144:0x02d4, B:146:0x02dc, B:147:0x02e1, B:149:0x02e9, B:150:0x02ee, B:152:0x02f6, B:153:0x02fe, B:155:0x0306, B:156:0x030e, B:158:0x0316, B:159:0x031d, B:161:0x0323, B:163:0x032f, B:611:0x0a5c, B:613:0x0a69, B:615:0x0a75, B:617:0x0aa6, B:618:0x0aad, B:625:0x0ac2, B:627:0x0acf, B:629:0x0ad5, B:631:0x0add, B:633:0x0ae5, B:635:0x0aed, B:637:0x0af5, B:639:0x0b32, B:640:0x0b39), top: B:911:0x0051, inners: #1, #2, #4, #7, #8, #9, #11, #17, #20 }] */
    /* JADX WARN: Code duplicated, block: B:470:0x0824 A[Catch: Exception -> 0x0f79, TryCatch #13 {Exception -> 0x0f79, blocks: (B:12:0x0051, B:14:0x005c, B:15:0x005f, B:19:0x006a, B:21:0x0075, B:23:0x0081, B:25:0x0087, B:27:0x008f, B:28:0x009b, B:30:0x00a1, B:31:0x00a6, B:33:0x00ae, B:34:0x00b4, B:36:0x00bc, B:37:0x00c2, B:39:0x00ca, B:40:0x00d0, B:42:0x00d8, B:43:0x00df, B:45:0x00e7, B:46:0x00ee, B:48:0x00f6, B:49:0x00fc, B:51:0x0104, B:52:0x010a, B:54:0x0112, B:55:0x0118, B:57:0x0120, B:58:0x0127, B:60:0x0130, B:61:0x0135, B:63:0x013d, B:64:0x0143, B:66:0x014b, B:168:0x033c, B:170:0x0344, B:171:0x0349, B:173:0x0351, B:174:0x0356, B:176:0x035e, B:177:0x0363, B:179:0x036b, B:180:0x0370, B:182:0x0378, B:183:0x037d, B:185:0x0385, B:186:0x038a, B:188:0x0392, B:189:0x0397, B:191:0x039f, B:192:0x03a4, B:194:0x03ac, B:195:0x03b1, B:197:0x03b9, B:198:0x03be, B:200:0x03c6, B:201:0x03cb, B:203:0x03d3, B:204:0x03d8, B:206:0x03e0, B:207:0x03e7, B:209:0x03ef, B:210:0x03f4, B:212:0x03fc, B:213:0x0401, B:215:0x0409, B:216:0x040e, B:218:0x0416, B:219:0x041b, B:221:0x0423, B:222:0x0428, B:224:0x0430, B:225:0x0435, B:227:0x043d, B:228:0x0442, B:230:0x044a, B:231:0x044f, B:233:0x0457, B:234:0x045c, B:236:0x0464, B:237:0x0469, B:239:0x0471, B:240:0x0476, B:242:0x047e, B:243:0x0483, B:245:0x048b, B:246:0x0490, B:248:0x0498, B:249:0x049d, B:251:0x04a5, B:252:0x04aa, B:254:0x04b2, B:255:0x04b7, B:257:0x04bf, B:258:0x04c4, B:260:0x04cc, B:261:0x04d1, B:263:0x04d9, B:264:0x04de, B:266:0x04e6, B:267:0x04eb, B:269:0x04f3, B:270:0x04f8, B:272:0x0500, B:273:0x0505, B:275:0x050d, B:276:0x0512, B:278:0x051a, B:279:0x051f, B:281:0x0527, B:282:0x052c, B:284:0x0534, B:285:0x0539, B:287:0x0541, B:288:0x0546, B:290:0x054e, B:291:0x0553, B:293:0x055b, B:294:0x0560, B:296:0x0568, B:297:0x056d, B:299:0x0575, B:300:0x057a, B:302:0x0580, B:303:0x0583, B:305:0x058b, B:306:0x0590, B:308:0x0598, B:309:0x059d, B:311:0x05a3, B:312:0x05a6, B:314:0x05ac, B:315:0x05af, B:317:0x05b7, B:318:0x05bc, B:320:0x05c2, B:321:0x05c5, B:323:0x05cd, B:324:0x05d2, B:326:0x05da, B:327:0x05df, B:329:0x05e7, B:330:0x05ec, B:332:0x05f2, B:333:0x05f5, B:335:0x05fb, B:336:0x05fe, B:338:0x0604, B:339:0x0607, B:341:0x060f, B:342:0x0612, B:344:0x061a, B:345:0x061d, B:347:0x0625, B:348:0x0628, B:350:0x0630, B:351:0x0635, B:353:0x063d, B:354:0x0642, B:356:0x064a, B:357:0x064f, B:359:0x0657, B:360:0x065c, B:362:0x0664, B:363:0x0669, B:365:0x0671, B:366:0x0676, B:368:0x067e, B:369:0x0683, B:371:0x068b, B:372:0x0690, B:374:0x0698, B:375:0x069d, B:377:0x06a5, B:378:0x06aa, B:380:0x06b2, B:381:0x06b7, B:383:0x06bf, B:384:0x06c4, B:386:0x06cc, B:387:0x06d1, B:389:0x06d9, B:390:0x06de, B:392:0x06e6, B:393:0x06eb, B:395:0x06f3, B:396:0x06f8, B:398:0x0700, B:399:0x0705, B:401:0x070d, B:402:0x0712, B:404:0x071a, B:405:0x071f, B:407:0x0727, B:408:0x072c, B:410:0x0734, B:411:0x0739, B:414:0x0746, B:421:0x0759, B:424:0x0767, B:427:0x0775, B:430:0x077f, B:432:0x078b, B:433:0x078d, B:436:0x079b, B:439:0x07a9, B:441:0x07b1, B:443:0x07bd, B:445:0x07c3, B:446:0x07cf, B:448:0x07d2, B:453:0x07e2, B:455:0x07ea, B:457:0x07f2, B:459:0x07fe, B:461:0x0804, B:462:0x080e, B:464:0x0811, B:469:0x0821, B:471:0x0827, B:473:0x082f, B:475:0x083b, B:477:0x0841, B:478:0x084b, B:480:0x084e, B:485:0x085e, B:487:0x0864, B:489:0x086c, B:491:0x0878, B:493:0x087e, B:494:0x0888, B:496:0x088b, B:501:0x089b, B:503:0x08a1, B:505:0x08a9, B:507:0x08b5, B:509:0x08bb, B:510:0x08c5, B:512:0x08c8, B:517:0x08d8, B:519:0x08de, B:521:0x08e6, B:523:0x08f2, B:525:0x08f8, B:526:0x0902, B:528:0x0905, B:533:0x0915, B:535:0x091b, B:538:0x0925, B:540:0x092d, B:542:0x0933, B:544:0x0942, B:548:0x0965, B:550:0x096d, B:552:0x0979, B:553:0x097c, B:555:0x0982, B:556:0x0985, B:558:0x098b, B:559:0x098e, B:561:0x0994, B:562:0x0997, B:564:0x099d, B:565:0x09a0, B:567:0x09a6, B:568:0x09a9, B:570:0x09af, B:571:0x09b2, B:573:0x09b8, B:574:0x09bb, B:576:0x09c3, B:577:0x09c6, B:579:0x09ce, B:580:0x09d1, B:582:0x09d9, B:584:0x09e7, B:585:0x09ec, B:587:0x09f4, B:588:0x09f9, B:590:0x0a01, B:591:0x0a06, B:593:0x0a0e, B:594:0x0a13, B:596:0x0a1b, B:597:0x0a20, B:599:0x0a28, B:600:0x0a2d, B:602:0x0a35, B:603:0x0a3a, B:605:0x0a42, B:606:0x0a47, B:608:0x0a4f, B:609:0x0a54, B:623:0x0aba, B:645:0x0b46, B:647:0x0b4e, B:648:0x0b53, B:650:0x0b5b, B:651:0x0b60, B:653:0x0b68, B:654:0x0b6d, B:656:0x0b75, B:657:0x0b7a, B:659:0x0b82, B:660:0x0b87, B:662:0x0b8f, B:663:0x0b94, B:665:0x0b9c, B:666:0x0ba1, B:668:0x0ba9, B:669:0x0bae, B:671:0x0bb6, B:672:0x0bbb, B:674:0x0bc3, B:675:0x0bc8, B:677:0x0bd0, B:678:0x0bd5, B:680:0x0bdd, B:681:0x0be2, B:683:0x0bea, B:684:0x0bef, B:686:0x0bf7, B:687:0x0bfc, B:689:0x0c04, B:690:0x0c09, B:692:0x0c11, B:693:0x0c16, B:695:0x0c1e, B:696:0x0c23, B:698:0x0c2b, B:699:0x0c30, B:701:0x0c38, B:702:0x0c3d, B:704:0x0c45, B:705:0x0c4a, B:707:0x0c52, B:708:0x0c57, B:710:0x0c5f, B:711:0x0c65, B:713:0x0c6d, B:714:0x0c74, B:716:0x0c7c, B:717:0x0c85, B:719:0x0c8d, B:720:0x0c94, B:722:0x0c9c, B:723:0x0ca3, B:725:0x0cab, B:726:0x0cb0, B:728:0x0cb8, B:729:0x0cbd, B:731:0x0cc5, B:732:0x0cca, B:734:0x0cd2, B:735:0x0cd7, B:737:0x0cdf, B:738:0x0ce5, B:740:0x0ced, B:741:0x0cf4, B:743:0x0cfc, B:744:0x0d02, B:746:0x0d0a, B:747:0x0d10, B:749:0x0d18, B:750:0x0d1e, B:752:0x0d26, B:758:0x0d56, B:760:0x0d5e, B:761:0x0d68, B:763:0x0d70, B:764:0x0d75, B:766:0x0d7d, B:767:0x0d83, B:769:0x0d8b, B:770:0x0d92, B:772:0x0d9a, B:773:0x0da0, B:775:0x0da8, B:776:0x0dad, B:778:0x0db5, B:779:0x0dbb, B:781:0x0dc3, B:782:0x0dc8, B:784:0x0dd0, B:785:0x0dd7, B:787:0x0ddf, B:788:0x0de5, B:790:0x0ded, B:791:0x0df3, B:793:0x0dfb, B:794:0x0e05, B:796:0x0e0d, B:797:0x0e17, B:799:0x0e1f, B:800:0x0e25, B:802:0x0e2d, B:803:0x0e32, B:805:0x0e3a, B:806:0x0e3f, B:808:0x0e47, B:809:0x0e4c, B:811:0x0e54, B:812:0x0e59, B:814:0x0e61, B:815:0x0e67, B:817:0x0e6f, B:818:0x0e78, B:820:0x0e80, B:821:0x0e8a, B:823:0x0e92, B:824:0x0e9c, B:826:0x0ea4, B:827:0x0eaa, B:829:0x0eb2, B:830:0x0eb8, B:832:0x0ec0, B:833:0x0ec8, B:835:0x0ed0, B:836:0x0ed8, B:838:0x0ee0, B:839:0x0ee8, B:841:0x0ef0, B:842:0x0ef5, B:844:0x0efd, B:845:0x0f02, B:847:0x0f0a, B:849:0x0f16, B:851:0x0f1e, B:852:0x0f2a, B:854:0x0f32, B:855:0x0f37, B:857:0x0f3f, B:858:0x0f44, B:860:0x0f4c, B:861:0x0f51, B:863:0x0f59, B:864:0x0f5e, B:866:0x0f66, B:867:0x0f6b, B:869:0x0f73, B:644:0x0b43, B:622:0x0ab7, B:532:0x0912, B:534:0x0918, B:516:0x08d5, B:518:0x08db, B:500:0x0898, B:502:0x089e, B:484:0x085b, B:486:0x0861, B:468:0x081e, B:470:0x0824, B:452:0x07df, B:454:0x07e5, B:167:0x0339, B:124:0x0262, B:126:0x026a, B:128:0x0278, B:129:0x027d, B:131:0x0285, B:132:0x028a, B:134:0x0292, B:135:0x02a2, B:137:0x02aa, B:138:0x02af, B:140:0x02b7, B:141:0x02bc, B:143:0x02c4, B:144:0x02d4, B:146:0x02dc, B:147:0x02e1, B:149:0x02e9, B:150:0x02ee, B:152:0x02f6, B:153:0x02fe, B:155:0x0306, B:156:0x030e, B:158:0x0316, B:159:0x031d, B:161:0x0323, B:163:0x032f, B:611:0x0a5c, B:613:0x0a69, B:615:0x0a75, B:617:0x0aa6, B:618:0x0aad, B:625:0x0ac2, B:627:0x0acf, B:629:0x0ad5, B:631:0x0add, B:633:0x0ae5, B:635:0x0aed, B:637:0x0af5, B:639:0x0b32, B:640:0x0b39), top: B:911:0x0051, inners: #1, #2, #4, #7, #8, #9, #11, #17, #20 }] */
    /* JADX WARN: Code duplicated, block: B:486:0x0861 A[Catch: Exception -> 0x0f79, TryCatch #13 {Exception -> 0x0f79, blocks: (B:12:0x0051, B:14:0x005c, B:15:0x005f, B:19:0x006a, B:21:0x0075, B:23:0x0081, B:25:0x0087, B:27:0x008f, B:28:0x009b, B:30:0x00a1, B:31:0x00a6, B:33:0x00ae, B:34:0x00b4, B:36:0x00bc, B:37:0x00c2, B:39:0x00ca, B:40:0x00d0, B:42:0x00d8, B:43:0x00df, B:45:0x00e7, B:46:0x00ee, B:48:0x00f6, B:49:0x00fc, B:51:0x0104, B:52:0x010a, B:54:0x0112, B:55:0x0118, B:57:0x0120, B:58:0x0127, B:60:0x0130, B:61:0x0135, B:63:0x013d, B:64:0x0143, B:66:0x014b, B:168:0x033c, B:170:0x0344, B:171:0x0349, B:173:0x0351, B:174:0x0356, B:176:0x035e, B:177:0x0363, B:179:0x036b, B:180:0x0370, B:182:0x0378, B:183:0x037d, B:185:0x0385, B:186:0x038a, B:188:0x0392, B:189:0x0397, B:191:0x039f, B:192:0x03a4, B:194:0x03ac, B:195:0x03b1, B:197:0x03b9, B:198:0x03be, B:200:0x03c6, B:201:0x03cb, B:203:0x03d3, B:204:0x03d8, B:206:0x03e0, B:207:0x03e7, B:209:0x03ef, B:210:0x03f4, B:212:0x03fc, B:213:0x0401, B:215:0x0409, B:216:0x040e, B:218:0x0416, B:219:0x041b, B:221:0x0423, B:222:0x0428, B:224:0x0430, B:225:0x0435, B:227:0x043d, B:228:0x0442, B:230:0x044a, B:231:0x044f, B:233:0x0457, B:234:0x045c, B:236:0x0464, B:237:0x0469, B:239:0x0471, B:240:0x0476, B:242:0x047e, B:243:0x0483, B:245:0x048b, B:246:0x0490, B:248:0x0498, B:249:0x049d, B:251:0x04a5, B:252:0x04aa, B:254:0x04b2, B:255:0x04b7, B:257:0x04bf, B:258:0x04c4, B:260:0x04cc, B:261:0x04d1, B:263:0x04d9, B:264:0x04de, B:266:0x04e6, B:267:0x04eb, B:269:0x04f3, B:270:0x04f8, B:272:0x0500, B:273:0x0505, B:275:0x050d, B:276:0x0512, B:278:0x051a, B:279:0x051f, B:281:0x0527, B:282:0x052c, B:284:0x0534, B:285:0x0539, B:287:0x0541, B:288:0x0546, B:290:0x054e, B:291:0x0553, B:293:0x055b, B:294:0x0560, B:296:0x0568, B:297:0x056d, B:299:0x0575, B:300:0x057a, B:302:0x0580, B:303:0x0583, B:305:0x058b, B:306:0x0590, B:308:0x0598, B:309:0x059d, B:311:0x05a3, B:312:0x05a6, B:314:0x05ac, B:315:0x05af, B:317:0x05b7, B:318:0x05bc, B:320:0x05c2, B:321:0x05c5, B:323:0x05cd, B:324:0x05d2, B:326:0x05da, B:327:0x05df, B:329:0x05e7, B:330:0x05ec, B:332:0x05f2, B:333:0x05f5, B:335:0x05fb, B:336:0x05fe, B:338:0x0604, B:339:0x0607, B:341:0x060f, B:342:0x0612, B:344:0x061a, B:345:0x061d, B:347:0x0625, B:348:0x0628, B:350:0x0630, B:351:0x0635, B:353:0x063d, B:354:0x0642, B:356:0x064a, B:357:0x064f, B:359:0x0657, B:360:0x065c, B:362:0x0664, B:363:0x0669, B:365:0x0671, B:366:0x0676, B:368:0x067e, B:369:0x0683, B:371:0x068b, B:372:0x0690, B:374:0x0698, B:375:0x069d, B:377:0x06a5, B:378:0x06aa, B:380:0x06b2, B:381:0x06b7, B:383:0x06bf, B:384:0x06c4, B:386:0x06cc, B:387:0x06d1, B:389:0x06d9, B:390:0x06de, B:392:0x06e6, B:393:0x06eb, B:395:0x06f3, B:396:0x06f8, B:398:0x0700, B:399:0x0705, B:401:0x070d, B:402:0x0712, B:404:0x071a, B:405:0x071f, B:407:0x0727, B:408:0x072c, B:410:0x0734, B:411:0x0739, B:414:0x0746, B:421:0x0759, B:424:0x0767, B:427:0x0775, B:430:0x077f, B:432:0x078b, B:433:0x078d, B:436:0x079b, B:439:0x07a9, B:441:0x07b1, B:443:0x07bd, B:445:0x07c3, B:446:0x07cf, B:448:0x07d2, B:453:0x07e2, B:455:0x07ea, B:457:0x07f2, B:459:0x07fe, B:461:0x0804, B:462:0x080e, B:464:0x0811, B:469:0x0821, B:471:0x0827, B:473:0x082f, B:475:0x083b, B:477:0x0841, B:478:0x084b, B:480:0x084e, B:485:0x085e, B:487:0x0864, B:489:0x086c, B:491:0x0878, B:493:0x087e, B:494:0x0888, B:496:0x088b, B:501:0x089b, B:503:0x08a1, B:505:0x08a9, B:507:0x08b5, B:509:0x08bb, B:510:0x08c5, B:512:0x08c8, B:517:0x08d8, B:519:0x08de, B:521:0x08e6, B:523:0x08f2, B:525:0x08f8, B:526:0x0902, B:528:0x0905, B:533:0x0915, B:535:0x091b, B:538:0x0925, B:540:0x092d, B:542:0x0933, B:544:0x0942, B:548:0x0965, B:550:0x096d, B:552:0x0979, B:553:0x097c, B:555:0x0982, B:556:0x0985, B:558:0x098b, B:559:0x098e, B:561:0x0994, B:562:0x0997, B:564:0x099d, B:565:0x09a0, B:567:0x09a6, B:568:0x09a9, B:570:0x09af, B:571:0x09b2, B:573:0x09b8, B:574:0x09bb, B:576:0x09c3, B:577:0x09c6, B:579:0x09ce, B:580:0x09d1, B:582:0x09d9, B:584:0x09e7, B:585:0x09ec, B:587:0x09f4, B:588:0x09f9, B:590:0x0a01, B:591:0x0a06, B:593:0x0a0e, B:594:0x0a13, B:596:0x0a1b, B:597:0x0a20, B:599:0x0a28, B:600:0x0a2d, B:602:0x0a35, B:603:0x0a3a, B:605:0x0a42, B:606:0x0a47, B:608:0x0a4f, B:609:0x0a54, B:623:0x0aba, B:645:0x0b46, B:647:0x0b4e, B:648:0x0b53, B:650:0x0b5b, B:651:0x0b60, B:653:0x0b68, B:654:0x0b6d, B:656:0x0b75, B:657:0x0b7a, B:659:0x0b82, B:660:0x0b87, B:662:0x0b8f, B:663:0x0b94, B:665:0x0b9c, B:666:0x0ba1, B:668:0x0ba9, B:669:0x0bae, B:671:0x0bb6, B:672:0x0bbb, B:674:0x0bc3, B:675:0x0bc8, B:677:0x0bd0, B:678:0x0bd5, B:680:0x0bdd, B:681:0x0be2, B:683:0x0bea, B:684:0x0bef, B:686:0x0bf7, B:687:0x0bfc, B:689:0x0c04, B:690:0x0c09, B:692:0x0c11, B:693:0x0c16, B:695:0x0c1e, B:696:0x0c23, B:698:0x0c2b, B:699:0x0c30, B:701:0x0c38, B:702:0x0c3d, B:704:0x0c45, B:705:0x0c4a, B:707:0x0c52, B:708:0x0c57, B:710:0x0c5f, B:711:0x0c65, B:713:0x0c6d, B:714:0x0c74, B:716:0x0c7c, B:717:0x0c85, B:719:0x0c8d, B:720:0x0c94, B:722:0x0c9c, B:723:0x0ca3, B:725:0x0cab, B:726:0x0cb0, B:728:0x0cb8, B:729:0x0cbd, B:731:0x0cc5, B:732:0x0cca, B:734:0x0cd2, B:735:0x0cd7, B:737:0x0cdf, B:738:0x0ce5, B:740:0x0ced, B:741:0x0cf4, B:743:0x0cfc, B:744:0x0d02, B:746:0x0d0a, B:747:0x0d10, B:749:0x0d18, B:750:0x0d1e, B:752:0x0d26, B:758:0x0d56, B:760:0x0d5e, B:761:0x0d68, B:763:0x0d70, B:764:0x0d75, B:766:0x0d7d, B:767:0x0d83, B:769:0x0d8b, B:770:0x0d92, B:772:0x0d9a, B:773:0x0da0, B:775:0x0da8, B:776:0x0dad, B:778:0x0db5, B:779:0x0dbb, B:781:0x0dc3, B:782:0x0dc8, B:784:0x0dd0, B:785:0x0dd7, B:787:0x0ddf, B:788:0x0de5, B:790:0x0ded, B:791:0x0df3, B:793:0x0dfb, B:794:0x0e05, B:796:0x0e0d, B:797:0x0e17, B:799:0x0e1f, B:800:0x0e25, B:802:0x0e2d, B:803:0x0e32, B:805:0x0e3a, B:806:0x0e3f, B:808:0x0e47, B:809:0x0e4c, B:811:0x0e54, B:812:0x0e59, B:814:0x0e61, B:815:0x0e67, B:817:0x0e6f, B:818:0x0e78, B:820:0x0e80, B:821:0x0e8a, B:823:0x0e92, B:824:0x0e9c, B:826:0x0ea4, B:827:0x0eaa, B:829:0x0eb2, B:830:0x0eb8, B:832:0x0ec0, B:833:0x0ec8, B:835:0x0ed0, B:836:0x0ed8, B:838:0x0ee0, B:839:0x0ee8, B:841:0x0ef0, B:842:0x0ef5, B:844:0x0efd, B:845:0x0f02, B:847:0x0f0a, B:849:0x0f16, B:851:0x0f1e, B:852:0x0f2a, B:854:0x0f32, B:855:0x0f37, B:857:0x0f3f, B:858:0x0f44, B:860:0x0f4c, B:861:0x0f51, B:863:0x0f59, B:864:0x0f5e, B:866:0x0f66, B:867:0x0f6b, B:869:0x0f73, B:644:0x0b43, B:622:0x0ab7, B:532:0x0912, B:534:0x0918, B:516:0x08d5, B:518:0x08db, B:500:0x0898, B:502:0x089e, B:484:0x085b, B:486:0x0861, B:468:0x081e, B:470:0x0824, B:452:0x07df, B:454:0x07e5, B:167:0x0339, B:124:0x0262, B:126:0x026a, B:128:0x0278, B:129:0x027d, B:131:0x0285, B:132:0x028a, B:134:0x0292, B:135:0x02a2, B:137:0x02aa, B:138:0x02af, B:140:0x02b7, B:141:0x02bc, B:143:0x02c4, B:144:0x02d4, B:146:0x02dc, B:147:0x02e1, B:149:0x02e9, B:150:0x02ee, B:152:0x02f6, B:153:0x02fe, B:155:0x0306, B:156:0x030e, B:158:0x0316, B:159:0x031d, B:161:0x0323, B:163:0x032f, B:611:0x0a5c, B:613:0x0a69, B:615:0x0a75, B:617:0x0aa6, B:618:0x0aad, B:625:0x0ac2, B:627:0x0acf, B:629:0x0ad5, B:631:0x0add, B:633:0x0ae5, B:635:0x0aed, B:637:0x0af5, B:639:0x0b32, B:640:0x0b39), top: B:911:0x0051, inners: #1, #2, #4, #7, #8, #9, #11, #17, #20 }] */
    /* JADX WARN: Code duplicated, block: B:502:0x089e A[Catch: Exception -> 0x0f79, TryCatch #13 {Exception -> 0x0f79, blocks: (B:12:0x0051, B:14:0x005c, B:15:0x005f, B:19:0x006a, B:21:0x0075, B:23:0x0081, B:25:0x0087, B:27:0x008f, B:28:0x009b, B:30:0x00a1, B:31:0x00a6, B:33:0x00ae, B:34:0x00b4, B:36:0x00bc, B:37:0x00c2, B:39:0x00ca, B:40:0x00d0, B:42:0x00d8, B:43:0x00df, B:45:0x00e7, B:46:0x00ee, B:48:0x00f6, B:49:0x00fc, B:51:0x0104, B:52:0x010a, B:54:0x0112, B:55:0x0118, B:57:0x0120, B:58:0x0127, B:60:0x0130, B:61:0x0135, B:63:0x013d, B:64:0x0143, B:66:0x014b, B:168:0x033c, B:170:0x0344, B:171:0x0349, B:173:0x0351, B:174:0x0356, B:176:0x035e, B:177:0x0363, B:179:0x036b, B:180:0x0370, B:182:0x0378, B:183:0x037d, B:185:0x0385, B:186:0x038a, B:188:0x0392, B:189:0x0397, B:191:0x039f, B:192:0x03a4, B:194:0x03ac, B:195:0x03b1, B:197:0x03b9, B:198:0x03be, B:200:0x03c6, B:201:0x03cb, B:203:0x03d3, B:204:0x03d8, B:206:0x03e0, B:207:0x03e7, B:209:0x03ef, B:210:0x03f4, B:212:0x03fc, B:213:0x0401, B:215:0x0409, B:216:0x040e, B:218:0x0416, B:219:0x041b, B:221:0x0423, B:222:0x0428, B:224:0x0430, B:225:0x0435, B:227:0x043d, B:228:0x0442, B:230:0x044a, B:231:0x044f, B:233:0x0457, B:234:0x045c, B:236:0x0464, B:237:0x0469, B:239:0x0471, B:240:0x0476, B:242:0x047e, B:243:0x0483, B:245:0x048b, B:246:0x0490, B:248:0x0498, B:249:0x049d, B:251:0x04a5, B:252:0x04aa, B:254:0x04b2, B:255:0x04b7, B:257:0x04bf, B:258:0x04c4, B:260:0x04cc, B:261:0x04d1, B:263:0x04d9, B:264:0x04de, B:266:0x04e6, B:267:0x04eb, B:269:0x04f3, B:270:0x04f8, B:272:0x0500, B:273:0x0505, B:275:0x050d, B:276:0x0512, B:278:0x051a, B:279:0x051f, B:281:0x0527, B:282:0x052c, B:284:0x0534, B:285:0x0539, B:287:0x0541, B:288:0x0546, B:290:0x054e, B:291:0x0553, B:293:0x055b, B:294:0x0560, B:296:0x0568, B:297:0x056d, B:299:0x0575, B:300:0x057a, B:302:0x0580, B:303:0x0583, B:305:0x058b, B:306:0x0590, B:308:0x0598, B:309:0x059d, B:311:0x05a3, B:312:0x05a6, B:314:0x05ac, B:315:0x05af, B:317:0x05b7, B:318:0x05bc, B:320:0x05c2, B:321:0x05c5, B:323:0x05cd, B:324:0x05d2, B:326:0x05da, B:327:0x05df, B:329:0x05e7, B:330:0x05ec, B:332:0x05f2, B:333:0x05f5, B:335:0x05fb, B:336:0x05fe, B:338:0x0604, B:339:0x0607, B:341:0x060f, B:342:0x0612, B:344:0x061a, B:345:0x061d, B:347:0x0625, B:348:0x0628, B:350:0x0630, B:351:0x0635, B:353:0x063d, B:354:0x0642, B:356:0x064a, B:357:0x064f, B:359:0x0657, B:360:0x065c, B:362:0x0664, B:363:0x0669, B:365:0x0671, B:366:0x0676, B:368:0x067e, B:369:0x0683, B:371:0x068b, B:372:0x0690, B:374:0x0698, B:375:0x069d, B:377:0x06a5, B:378:0x06aa, B:380:0x06b2, B:381:0x06b7, B:383:0x06bf, B:384:0x06c4, B:386:0x06cc, B:387:0x06d1, B:389:0x06d9, B:390:0x06de, B:392:0x06e6, B:393:0x06eb, B:395:0x06f3, B:396:0x06f8, B:398:0x0700, B:399:0x0705, B:401:0x070d, B:402:0x0712, B:404:0x071a, B:405:0x071f, B:407:0x0727, B:408:0x072c, B:410:0x0734, B:411:0x0739, B:414:0x0746, B:421:0x0759, B:424:0x0767, B:427:0x0775, B:430:0x077f, B:432:0x078b, B:433:0x078d, B:436:0x079b, B:439:0x07a9, B:441:0x07b1, B:443:0x07bd, B:445:0x07c3, B:446:0x07cf, B:448:0x07d2, B:453:0x07e2, B:455:0x07ea, B:457:0x07f2, B:459:0x07fe, B:461:0x0804, B:462:0x080e, B:464:0x0811, B:469:0x0821, B:471:0x0827, B:473:0x082f, B:475:0x083b, B:477:0x0841, B:478:0x084b, B:480:0x084e, B:485:0x085e, B:487:0x0864, B:489:0x086c, B:491:0x0878, B:493:0x087e, B:494:0x0888, B:496:0x088b, B:501:0x089b, B:503:0x08a1, B:505:0x08a9, B:507:0x08b5, B:509:0x08bb, B:510:0x08c5, B:512:0x08c8, B:517:0x08d8, B:519:0x08de, B:521:0x08e6, B:523:0x08f2, B:525:0x08f8, B:526:0x0902, B:528:0x0905, B:533:0x0915, B:535:0x091b, B:538:0x0925, B:540:0x092d, B:542:0x0933, B:544:0x0942, B:548:0x0965, B:550:0x096d, B:552:0x0979, B:553:0x097c, B:555:0x0982, B:556:0x0985, B:558:0x098b, B:559:0x098e, B:561:0x0994, B:562:0x0997, B:564:0x099d, B:565:0x09a0, B:567:0x09a6, B:568:0x09a9, B:570:0x09af, B:571:0x09b2, B:573:0x09b8, B:574:0x09bb, B:576:0x09c3, B:577:0x09c6, B:579:0x09ce, B:580:0x09d1, B:582:0x09d9, B:584:0x09e7, B:585:0x09ec, B:587:0x09f4, B:588:0x09f9, B:590:0x0a01, B:591:0x0a06, B:593:0x0a0e, B:594:0x0a13, B:596:0x0a1b, B:597:0x0a20, B:599:0x0a28, B:600:0x0a2d, B:602:0x0a35, B:603:0x0a3a, B:605:0x0a42, B:606:0x0a47, B:608:0x0a4f, B:609:0x0a54, B:623:0x0aba, B:645:0x0b46, B:647:0x0b4e, B:648:0x0b53, B:650:0x0b5b, B:651:0x0b60, B:653:0x0b68, B:654:0x0b6d, B:656:0x0b75, B:657:0x0b7a, B:659:0x0b82, B:660:0x0b87, B:662:0x0b8f, B:663:0x0b94, B:665:0x0b9c, B:666:0x0ba1, B:668:0x0ba9, B:669:0x0bae, B:671:0x0bb6, B:672:0x0bbb, B:674:0x0bc3, B:675:0x0bc8, B:677:0x0bd0, B:678:0x0bd5, B:680:0x0bdd, B:681:0x0be2, B:683:0x0bea, B:684:0x0bef, B:686:0x0bf7, B:687:0x0bfc, B:689:0x0c04, B:690:0x0c09, B:692:0x0c11, B:693:0x0c16, B:695:0x0c1e, B:696:0x0c23, B:698:0x0c2b, B:699:0x0c30, B:701:0x0c38, B:702:0x0c3d, B:704:0x0c45, B:705:0x0c4a, B:707:0x0c52, B:708:0x0c57, B:710:0x0c5f, B:711:0x0c65, B:713:0x0c6d, B:714:0x0c74, B:716:0x0c7c, B:717:0x0c85, B:719:0x0c8d, B:720:0x0c94, B:722:0x0c9c, B:723:0x0ca3, B:725:0x0cab, B:726:0x0cb0, B:728:0x0cb8, B:729:0x0cbd, B:731:0x0cc5, B:732:0x0cca, B:734:0x0cd2, B:735:0x0cd7, B:737:0x0cdf, B:738:0x0ce5, B:740:0x0ced, B:741:0x0cf4, B:743:0x0cfc, B:744:0x0d02, B:746:0x0d0a, B:747:0x0d10, B:749:0x0d18, B:750:0x0d1e, B:752:0x0d26, B:758:0x0d56, B:760:0x0d5e, B:761:0x0d68, B:763:0x0d70, B:764:0x0d75, B:766:0x0d7d, B:767:0x0d83, B:769:0x0d8b, B:770:0x0d92, B:772:0x0d9a, B:773:0x0da0, B:775:0x0da8, B:776:0x0dad, B:778:0x0db5, B:779:0x0dbb, B:781:0x0dc3, B:782:0x0dc8, B:784:0x0dd0, B:785:0x0dd7, B:787:0x0ddf, B:788:0x0de5, B:790:0x0ded, B:791:0x0df3, B:793:0x0dfb, B:794:0x0e05, B:796:0x0e0d, B:797:0x0e17, B:799:0x0e1f, B:800:0x0e25, B:802:0x0e2d, B:803:0x0e32, B:805:0x0e3a, B:806:0x0e3f, B:808:0x0e47, B:809:0x0e4c, B:811:0x0e54, B:812:0x0e59, B:814:0x0e61, B:815:0x0e67, B:817:0x0e6f, B:818:0x0e78, B:820:0x0e80, B:821:0x0e8a, B:823:0x0e92, B:824:0x0e9c, B:826:0x0ea4, B:827:0x0eaa, B:829:0x0eb2, B:830:0x0eb8, B:832:0x0ec0, B:833:0x0ec8, B:835:0x0ed0, B:836:0x0ed8, B:838:0x0ee0, B:839:0x0ee8, B:841:0x0ef0, B:842:0x0ef5, B:844:0x0efd, B:845:0x0f02, B:847:0x0f0a, B:849:0x0f16, B:851:0x0f1e, B:852:0x0f2a, B:854:0x0f32, B:855:0x0f37, B:857:0x0f3f, B:858:0x0f44, B:860:0x0f4c, B:861:0x0f51, B:863:0x0f59, B:864:0x0f5e, B:866:0x0f66, B:867:0x0f6b, B:869:0x0f73, B:644:0x0b43, B:622:0x0ab7, B:532:0x0912, B:534:0x0918, B:516:0x08d5, B:518:0x08db, B:500:0x0898, B:502:0x089e, B:484:0x085b, B:486:0x0861, B:468:0x081e, B:470:0x0824, B:452:0x07df, B:454:0x07e5, B:167:0x0339, B:124:0x0262, B:126:0x026a, B:128:0x0278, B:129:0x027d, B:131:0x0285, B:132:0x028a, B:134:0x0292, B:135:0x02a2, B:137:0x02aa, B:138:0x02af, B:140:0x02b7, B:141:0x02bc, B:143:0x02c4, B:144:0x02d4, B:146:0x02dc, B:147:0x02e1, B:149:0x02e9, B:150:0x02ee, B:152:0x02f6, B:153:0x02fe, B:155:0x0306, B:156:0x030e, B:158:0x0316, B:159:0x031d, B:161:0x0323, B:163:0x032f, B:611:0x0a5c, B:613:0x0a69, B:615:0x0a75, B:617:0x0aa6, B:618:0x0aad, B:625:0x0ac2, B:627:0x0acf, B:629:0x0ad5, B:631:0x0add, B:633:0x0ae5, B:635:0x0aed, B:637:0x0af5, B:639:0x0b32, B:640:0x0b39), top: B:911:0x0051, inners: #1, #2, #4, #7, #8, #9, #11, #17, #20 }] */
    /* JADX WARN: Code duplicated, block: B:518:0x08db A[Catch: Exception -> 0x0f79, TryCatch #13 {Exception -> 0x0f79, blocks: (B:12:0x0051, B:14:0x005c, B:15:0x005f, B:19:0x006a, B:21:0x0075, B:23:0x0081, B:25:0x0087, B:27:0x008f, B:28:0x009b, B:30:0x00a1, B:31:0x00a6, B:33:0x00ae, B:34:0x00b4, B:36:0x00bc, B:37:0x00c2, B:39:0x00ca, B:40:0x00d0, B:42:0x00d8, B:43:0x00df, B:45:0x00e7, B:46:0x00ee, B:48:0x00f6, B:49:0x00fc, B:51:0x0104, B:52:0x010a, B:54:0x0112, B:55:0x0118, B:57:0x0120, B:58:0x0127, B:60:0x0130, B:61:0x0135, B:63:0x013d, B:64:0x0143, B:66:0x014b, B:168:0x033c, B:170:0x0344, B:171:0x0349, B:173:0x0351, B:174:0x0356, B:176:0x035e, B:177:0x0363, B:179:0x036b, B:180:0x0370, B:182:0x0378, B:183:0x037d, B:185:0x0385, B:186:0x038a, B:188:0x0392, B:189:0x0397, B:191:0x039f, B:192:0x03a4, B:194:0x03ac, B:195:0x03b1, B:197:0x03b9, B:198:0x03be, B:200:0x03c6, B:201:0x03cb, B:203:0x03d3, B:204:0x03d8, B:206:0x03e0, B:207:0x03e7, B:209:0x03ef, B:210:0x03f4, B:212:0x03fc, B:213:0x0401, B:215:0x0409, B:216:0x040e, B:218:0x0416, B:219:0x041b, B:221:0x0423, B:222:0x0428, B:224:0x0430, B:225:0x0435, B:227:0x043d, B:228:0x0442, B:230:0x044a, B:231:0x044f, B:233:0x0457, B:234:0x045c, B:236:0x0464, B:237:0x0469, B:239:0x0471, B:240:0x0476, B:242:0x047e, B:243:0x0483, B:245:0x048b, B:246:0x0490, B:248:0x0498, B:249:0x049d, B:251:0x04a5, B:252:0x04aa, B:254:0x04b2, B:255:0x04b7, B:257:0x04bf, B:258:0x04c4, B:260:0x04cc, B:261:0x04d1, B:263:0x04d9, B:264:0x04de, B:266:0x04e6, B:267:0x04eb, B:269:0x04f3, B:270:0x04f8, B:272:0x0500, B:273:0x0505, B:275:0x050d, B:276:0x0512, B:278:0x051a, B:279:0x051f, B:281:0x0527, B:282:0x052c, B:284:0x0534, B:285:0x0539, B:287:0x0541, B:288:0x0546, B:290:0x054e, B:291:0x0553, B:293:0x055b, B:294:0x0560, B:296:0x0568, B:297:0x056d, B:299:0x0575, B:300:0x057a, B:302:0x0580, B:303:0x0583, B:305:0x058b, B:306:0x0590, B:308:0x0598, B:309:0x059d, B:311:0x05a3, B:312:0x05a6, B:314:0x05ac, B:315:0x05af, B:317:0x05b7, B:318:0x05bc, B:320:0x05c2, B:321:0x05c5, B:323:0x05cd, B:324:0x05d2, B:326:0x05da, B:327:0x05df, B:329:0x05e7, B:330:0x05ec, B:332:0x05f2, B:333:0x05f5, B:335:0x05fb, B:336:0x05fe, B:338:0x0604, B:339:0x0607, B:341:0x060f, B:342:0x0612, B:344:0x061a, B:345:0x061d, B:347:0x0625, B:348:0x0628, B:350:0x0630, B:351:0x0635, B:353:0x063d, B:354:0x0642, B:356:0x064a, B:357:0x064f, B:359:0x0657, B:360:0x065c, B:362:0x0664, B:363:0x0669, B:365:0x0671, B:366:0x0676, B:368:0x067e, B:369:0x0683, B:371:0x068b, B:372:0x0690, B:374:0x0698, B:375:0x069d, B:377:0x06a5, B:378:0x06aa, B:380:0x06b2, B:381:0x06b7, B:383:0x06bf, B:384:0x06c4, B:386:0x06cc, B:387:0x06d1, B:389:0x06d9, B:390:0x06de, B:392:0x06e6, B:393:0x06eb, B:395:0x06f3, B:396:0x06f8, B:398:0x0700, B:399:0x0705, B:401:0x070d, B:402:0x0712, B:404:0x071a, B:405:0x071f, B:407:0x0727, B:408:0x072c, B:410:0x0734, B:411:0x0739, B:414:0x0746, B:421:0x0759, B:424:0x0767, B:427:0x0775, B:430:0x077f, B:432:0x078b, B:433:0x078d, B:436:0x079b, B:439:0x07a9, B:441:0x07b1, B:443:0x07bd, B:445:0x07c3, B:446:0x07cf, B:448:0x07d2, B:453:0x07e2, B:455:0x07ea, B:457:0x07f2, B:459:0x07fe, B:461:0x0804, B:462:0x080e, B:464:0x0811, B:469:0x0821, B:471:0x0827, B:473:0x082f, B:475:0x083b, B:477:0x0841, B:478:0x084b, B:480:0x084e, B:485:0x085e, B:487:0x0864, B:489:0x086c, B:491:0x0878, B:493:0x087e, B:494:0x0888, B:496:0x088b, B:501:0x089b, B:503:0x08a1, B:505:0x08a9, B:507:0x08b5, B:509:0x08bb, B:510:0x08c5, B:512:0x08c8, B:517:0x08d8, B:519:0x08de, B:521:0x08e6, B:523:0x08f2, B:525:0x08f8, B:526:0x0902, B:528:0x0905, B:533:0x0915, B:535:0x091b, B:538:0x0925, B:540:0x092d, B:542:0x0933, B:544:0x0942, B:548:0x0965, B:550:0x096d, B:552:0x0979, B:553:0x097c, B:555:0x0982, B:556:0x0985, B:558:0x098b, B:559:0x098e, B:561:0x0994, B:562:0x0997, B:564:0x099d, B:565:0x09a0, B:567:0x09a6, B:568:0x09a9, B:570:0x09af, B:571:0x09b2, B:573:0x09b8, B:574:0x09bb, B:576:0x09c3, B:577:0x09c6, B:579:0x09ce, B:580:0x09d1, B:582:0x09d9, B:584:0x09e7, B:585:0x09ec, B:587:0x09f4, B:588:0x09f9, B:590:0x0a01, B:591:0x0a06, B:593:0x0a0e, B:594:0x0a13, B:596:0x0a1b, B:597:0x0a20, B:599:0x0a28, B:600:0x0a2d, B:602:0x0a35, B:603:0x0a3a, B:605:0x0a42, B:606:0x0a47, B:608:0x0a4f, B:609:0x0a54, B:623:0x0aba, B:645:0x0b46, B:647:0x0b4e, B:648:0x0b53, B:650:0x0b5b, B:651:0x0b60, B:653:0x0b68, B:654:0x0b6d, B:656:0x0b75, B:657:0x0b7a, B:659:0x0b82, B:660:0x0b87, B:662:0x0b8f, B:663:0x0b94, B:665:0x0b9c, B:666:0x0ba1, B:668:0x0ba9, B:669:0x0bae, B:671:0x0bb6, B:672:0x0bbb, B:674:0x0bc3, B:675:0x0bc8, B:677:0x0bd0, B:678:0x0bd5, B:680:0x0bdd, B:681:0x0be2, B:683:0x0bea, B:684:0x0bef, B:686:0x0bf7, B:687:0x0bfc, B:689:0x0c04, B:690:0x0c09, B:692:0x0c11, B:693:0x0c16, B:695:0x0c1e, B:696:0x0c23, B:698:0x0c2b, B:699:0x0c30, B:701:0x0c38, B:702:0x0c3d, B:704:0x0c45, B:705:0x0c4a, B:707:0x0c52, B:708:0x0c57, B:710:0x0c5f, B:711:0x0c65, B:713:0x0c6d, B:714:0x0c74, B:716:0x0c7c, B:717:0x0c85, B:719:0x0c8d, B:720:0x0c94, B:722:0x0c9c, B:723:0x0ca3, B:725:0x0cab, B:726:0x0cb0, B:728:0x0cb8, B:729:0x0cbd, B:731:0x0cc5, B:732:0x0cca, B:734:0x0cd2, B:735:0x0cd7, B:737:0x0cdf, B:738:0x0ce5, B:740:0x0ced, B:741:0x0cf4, B:743:0x0cfc, B:744:0x0d02, B:746:0x0d0a, B:747:0x0d10, B:749:0x0d18, B:750:0x0d1e, B:752:0x0d26, B:758:0x0d56, B:760:0x0d5e, B:761:0x0d68, B:763:0x0d70, B:764:0x0d75, B:766:0x0d7d, B:767:0x0d83, B:769:0x0d8b, B:770:0x0d92, B:772:0x0d9a, B:773:0x0da0, B:775:0x0da8, B:776:0x0dad, B:778:0x0db5, B:779:0x0dbb, B:781:0x0dc3, B:782:0x0dc8, B:784:0x0dd0, B:785:0x0dd7, B:787:0x0ddf, B:788:0x0de5, B:790:0x0ded, B:791:0x0df3, B:793:0x0dfb, B:794:0x0e05, B:796:0x0e0d, B:797:0x0e17, B:799:0x0e1f, B:800:0x0e25, B:802:0x0e2d, B:803:0x0e32, B:805:0x0e3a, B:806:0x0e3f, B:808:0x0e47, B:809:0x0e4c, B:811:0x0e54, B:812:0x0e59, B:814:0x0e61, B:815:0x0e67, B:817:0x0e6f, B:818:0x0e78, B:820:0x0e80, B:821:0x0e8a, B:823:0x0e92, B:824:0x0e9c, B:826:0x0ea4, B:827:0x0eaa, B:829:0x0eb2, B:830:0x0eb8, B:832:0x0ec0, B:833:0x0ec8, B:835:0x0ed0, B:836:0x0ed8, B:838:0x0ee0, B:839:0x0ee8, B:841:0x0ef0, B:842:0x0ef5, B:844:0x0efd, B:845:0x0f02, B:847:0x0f0a, B:849:0x0f16, B:851:0x0f1e, B:852:0x0f2a, B:854:0x0f32, B:855:0x0f37, B:857:0x0f3f, B:858:0x0f44, B:860:0x0f4c, B:861:0x0f51, B:863:0x0f59, B:864:0x0f5e, B:866:0x0f66, B:867:0x0f6b, B:869:0x0f73, B:644:0x0b43, B:622:0x0ab7, B:532:0x0912, B:534:0x0918, B:516:0x08d5, B:518:0x08db, B:500:0x0898, B:502:0x089e, B:484:0x085b, B:486:0x0861, B:468:0x081e, B:470:0x0824, B:452:0x07df, B:454:0x07e5, B:167:0x0339, B:124:0x0262, B:126:0x026a, B:128:0x0278, B:129:0x027d, B:131:0x0285, B:132:0x028a, B:134:0x0292, B:135:0x02a2, B:137:0x02aa, B:138:0x02af, B:140:0x02b7, B:141:0x02bc, B:143:0x02c4, B:144:0x02d4, B:146:0x02dc, B:147:0x02e1, B:149:0x02e9, B:150:0x02ee, B:152:0x02f6, B:153:0x02fe, B:155:0x0306, B:156:0x030e, B:158:0x0316, B:159:0x031d, B:161:0x0323, B:163:0x032f, B:611:0x0a5c, B:613:0x0a69, B:615:0x0a75, B:617:0x0aa6, B:618:0x0aad, B:625:0x0ac2, B:627:0x0acf, B:629:0x0ad5, B:631:0x0add, B:633:0x0ae5, B:635:0x0aed, B:637:0x0af5, B:639:0x0b32, B:640:0x0b39), top: B:911:0x0051, inners: #1, #2, #4, #7, #8, #9, #11, #17, #20 }] */
    /* JADX WARN: Code duplicated, block: B:534:0x0918 A[Catch: Exception -> 0x0f79, TryCatch #13 {Exception -> 0x0f79, blocks: (B:12:0x0051, B:14:0x005c, B:15:0x005f, B:19:0x006a, B:21:0x0075, B:23:0x0081, B:25:0x0087, B:27:0x008f, B:28:0x009b, B:30:0x00a1, B:31:0x00a6, B:33:0x00ae, B:34:0x00b4, B:36:0x00bc, B:37:0x00c2, B:39:0x00ca, B:40:0x00d0, B:42:0x00d8, B:43:0x00df, B:45:0x00e7, B:46:0x00ee, B:48:0x00f6, B:49:0x00fc, B:51:0x0104, B:52:0x010a, B:54:0x0112, B:55:0x0118, B:57:0x0120, B:58:0x0127, B:60:0x0130, B:61:0x0135, B:63:0x013d, B:64:0x0143, B:66:0x014b, B:168:0x033c, B:170:0x0344, B:171:0x0349, B:173:0x0351, B:174:0x0356, B:176:0x035e, B:177:0x0363, B:179:0x036b, B:180:0x0370, B:182:0x0378, B:183:0x037d, B:185:0x0385, B:186:0x038a, B:188:0x0392, B:189:0x0397, B:191:0x039f, B:192:0x03a4, B:194:0x03ac, B:195:0x03b1, B:197:0x03b9, B:198:0x03be, B:200:0x03c6, B:201:0x03cb, B:203:0x03d3, B:204:0x03d8, B:206:0x03e0, B:207:0x03e7, B:209:0x03ef, B:210:0x03f4, B:212:0x03fc, B:213:0x0401, B:215:0x0409, B:216:0x040e, B:218:0x0416, B:219:0x041b, B:221:0x0423, B:222:0x0428, B:224:0x0430, B:225:0x0435, B:227:0x043d, B:228:0x0442, B:230:0x044a, B:231:0x044f, B:233:0x0457, B:234:0x045c, B:236:0x0464, B:237:0x0469, B:239:0x0471, B:240:0x0476, B:242:0x047e, B:243:0x0483, B:245:0x048b, B:246:0x0490, B:248:0x0498, B:249:0x049d, B:251:0x04a5, B:252:0x04aa, B:254:0x04b2, B:255:0x04b7, B:257:0x04bf, B:258:0x04c4, B:260:0x04cc, B:261:0x04d1, B:263:0x04d9, B:264:0x04de, B:266:0x04e6, B:267:0x04eb, B:269:0x04f3, B:270:0x04f8, B:272:0x0500, B:273:0x0505, B:275:0x050d, B:276:0x0512, B:278:0x051a, B:279:0x051f, B:281:0x0527, B:282:0x052c, B:284:0x0534, B:285:0x0539, B:287:0x0541, B:288:0x0546, B:290:0x054e, B:291:0x0553, B:293:0x055b, B:294:0x0560, B:296:0x0568, B:297:0x056d, B:299:0x0575, B:300:0x057a, B:302:0x0580, B:303:0x0583, B:305:0x058b, B:306:0x0590, B:308:0x0598, B:309:0x059d, B:311:0x05a3, B:312:0x05a6, B:314:0x05ac, B:315:0x05af, B:317:0x05b7, B:318:0x05bc, B:320:0x05c2, B:321:0x05c5, B:323:0x05cd, B:324:0x05d2, B:326:0x05da, B:327:0x05df, B:329:0x05e7, B:330:0x05ec, B:332:0x05f2, B:333:0x05f5, B:335:0x05fb, B:336:0x05fe, B:338:0x0604, B:339:0x0607, B:341:0x060f, B:342:0x0612, B:344:0x061a, B:345:0x061d, B:347:0x0625, B:348:0x0628, B:350:0x0630, B:351:0x0635, B:353:0x063d, B:354:0x0642, B:356:0x064a, B:357:0x064f, B:359:0x0657, B:360:0x065c, B:362:0x0664, B:363:0x0669, B:365:0x0671, B:366:0x0676, B:368:0x067e, B:369:0x0683, B:371:0x068b, B:372:0x0690, B:374:0x0698, B:375:0x069d, B:377:0x06a5, B:378:0x06aa, B:380:0x06b2, B:381:0x06b7, B:383:0x06bf, B:384:0x06c4, B:386:0x06cc, B:387:0x06d1, B:389:0x06d9, B:390:0x06de, B:392:0x06e6, B:393:0x06eb, B:395:0x06f3, B:396:0x06f8, B:398:0x0700, B:399:0x0705, B:401:0x070d, B:402:0x0712, B:404:0x071a, B:405:0x071f, B:407:0x0727, B:408:0x072c, B:410:0x0734, B:411:0x0739, B:414:0x0746, B:421:0x0759, B:424:0x0767, B:427:0x0775, B:430:0x077f, B:432:0x078b, B:433:0x078d, B:436:0x079b, B:439:0x07a9, B:441:0x07b1, B:443:0x07bd, B:445:0x07c3, B:446:0x07cf, B:448:0x07d2, B:453:0x07e2, B:455:0x07ea, B:457:0x07f2, B:459:0x07fe, B:461:0x0804, B:462:0x080e, B:464:0x0811, B:469:0x0821, B:471:0x0827, B:473:0x082f, B:475:0x083b, B:477:0x0841, B:478:0x084b, B:480:0x084e, B:485:0x085e, B:487:0x0864, B:489:0x086c, B:491:0x0878, B:493:0x087e, B:494:0x0888, B:496:0x088b, B:501:0x089b, B:503:0x08a1, B:505:0x08a9, B:507:0x08b5, B:509:0x08bb, B:510:0x08c5, B:512:0x08c8, B:517:0x08d8, B:519:0x08de, B:521:0x08e6, B:523:0x08f2, B:525:0x08f8, B:526:0x0902, B:528:0x0905, B:533:0x0915, B:535:0x091b, B:538:0x0925, B:540:0x092d, B:542:0x0933, B:544:0x0942, B:548:0x0965, B:550:0x096d, B:552:0x0979, B:553:0x097c, B:555:0x0982, B:556:0x0985, B:558:0x098b, B:559:0x098e, B:561:0x0994, B:562:0x0997, B:564:0x099d, B:565:0x09a0, B:567:0x09a6, B:568:0x09a9, B:570:0x09af, B:571:0x09b2, B:573:0x09b8, B:574:0x09bb, B:576:0x09c3, B:577:0x09c6, B:579:0x09ce, B:580:0x09d1, B:582:0x09d9, B:584:0x09e7, B:585:0x09ec, B:587:0x09f4, B:588:0x09f9, B:590:0x0a01, B:591:0x0a06, B:593:0x0a0e, B:594:0x0a13, B:596:0x0a1b, B:597:0x0a20, B:599:0x0a28, B:600:0x0a2d, B:602:0x0a35, B:603:0x0a3a, B:605:0x0a42, B:606:0x0a47, B:608:0x0a4f, B:609:0x0a54, B:623:0x0aba, B:645:0x0b46, B:647:0x0b4e, B:648:0x0b53, B:650:0x0b5b, B:651:0x0b60, B:653:0x0b68, B:654:0x0b6d, B:656:0x0b75, B:657:0x0b7a, B:659:0x0b82, B:660:0x0b87, B:662:0x0b8f, B:663:0x0b94, B:665:0x0b9c, B:666:0x0ba1, B:668:0x0ba9, B:669:0x0bae, B:671:0x0bb6, B:672:0x0bbb, B:674:0x0bc3, B:675:0x0bc8, B:677:0x0bd0, B:678:0x0bd5, B:680:0x0bdd, B:681:0x0be2, B:683:0x0bea, B:684:0x0bef, B:686:0x0bf7, B:687:0x0bfc, B:689:0x0c04, B:690:0x0c09, B:692:0x0c11, B:693:0x0c16, B:695:0x0c1e, B:696:0x0c23, B:698:0x0c2b, B:699:0x0c30, B:701:0x0c38, B:702:0x0c3d, B:704:0x0c45, B:705:0x0c4a, B:707:0x0c52, B:708:0x0c57, B:710:0x0c5f, B:711:0x0c65, B:713:0x0c6d, B:714:0x0c74, B:716:0x0c7c, B:717:0x0c85, B:719:0x0c8d, B:720:0x0c94, B:722:0x0c9c, B:723:0x0ca3, B:725:0x0cab, B:726:0x0cb0, B:728:0x0cb8, B:729:0x0cbd, B:731:0x0cc5, B:732:0x0cca, B:734:0x0cd2, B:735:0x0cd7, B:737:0x0cdf, B:738:0x0ce5, B:740:0x0ced, B:741:0x0cf4, B:743:0x0cfc, B:744:0x0d02, B:746:0x0d0a, B:747:0x0d10, B:749:0x0d18, B:750:0x0d1e, B:752:0x0d26, B:758:0x0d56, B:760:0x0d5e, B:761:0x0d68, B:763:0x0d70, B:764:0x0d75, B:766:0x0d7d, B:767:0x0d83, B:769:0x0d8b, B:770:0x0d92, B:772:0x0d9a, B:773:0x0da0, B:775:0x0da8, B:776:0x0dad, B:778:0x0db5, B:779:0x0dbb, B:781:0x0dc3, B:782:0x0dc8, B:784:0x0dd0, B:785:0x0dd7, B:787:0x0ddf, B:788:0x0de5, B:790:0x0ded, B:791:0x0df3, B:793:0x0dfb, B:794:0x0e05, B:796:0x0e0d, B:797:0x0e17, B:799:0x0e1f, B:800:0x0e25, B:802:0x0e2d, B:803:0x0e32, B:805:0x0e3a, B:806:0x0e3f, B:808:0x0e47, B:809:0x0e4c, B:811:0x0e54, B:812:0x0e59, B:814:0x0e61, B:815:0x0e67, B:817:0x0e6f, B:818:0x0e78, B:820:0x0e80, B:821:0x0e8a, B:823:0x0e92, B:824:0x0e9c, B:826:0x0ea4, B:827:0x0eaa, B:829:0x0eb2, B:830:0x0eb8, B:832:0x0ec0, B:833:0x0ec8, B:835:0x0ed0, B:836:0x0ed8, B:838:0x0ee0, B:839:0x0ee8, B:841:0x0ef0, B:842:0x0ef5, B:844:0x0efd, B:845:0x0f02, B:847:0x0f0a, B:849:0x0f16, B:851:0x0f1e, B:852:0x0f2a, B:854:0x0f32, B:855:0x0f37, B:857:0x0f3f, B:858:0x0f44, B:860:0x0f4c, B:861:0x0f51, B:863:0x0f59, B:864:0x0f5e, B:866:0x0f66, B:867:0x0f6b, B:869:0x0f73, B:644:0x0b43, B:622:0x0ab7, B:532:0x0912, B:534:0x0918, B:516:0x08d5, B:518:0x08db, B:500:0x0898, B:502:0x089e, B:484:0x085b, B:486:0x0861, B:468:0x081e, B:470:0x0824, B:452:0x07df, B:454:0x07e5, B:167:0x0339, B:124:0x0262, B:126:0x026a, B:128:0x0278, B:129:0x027d, B:131:0x0285, B:132:0x028a, B:134:0x0292, B:135:0x02a2, B:137:0x02aa, B:138:0x02af, B:140:0x02b7, B:141:0x02bc, B:143:0x02c4, B:144:0x02d4, B:146:0x02dc, B:147:0x02e1, B:149:0x02e9, B:150:0x02ee, B:152:0x02f6, B:153:0x02fe, B:155:0x0306, B:156:0x030e, B:158:0x0316, B:159:0x031d, B:161:0x0323, B:163:0x032f, B:611:0x0a5c, B:613:0x0a69, B:615:0x0a75, B:617:0x0aa6, B:618:0x0aad, B:625:0x0ac2, B:627:0x0acf, B:629:0x0ad5, B:631:0x0add, B:633:0x0ae5, B:635:0x0aed, B:637:0x0af5, B:639:0x0b32, B:640:0x0b39), top: B:911:0x0051, inners: #1, #2, #4, #7, #8, #9, #11, #17, #20 }] */
    public void m(boolean z2) {
        String str;
        String string;
        String string2;
        String strD = r.c().d("vdrconfig_gz", "");
        if (!TextUtils.isEmpty(strD)) {
            try {
                byte[] bArrW = n.i.w(Base64.decode(strD, 0));
                if (bArrW != null) {
                    strD = new String(bArrW, "UTF-8");
                }
            } catch (Exception unused) {
                strD = null;
            }
        }
        if (strD == null || strD.length() <= 1) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strD);
            if (jSONObject.has("ison")) {
                jSONObject.getInt("ison");
            }
            if (jSONObject.has("hysV2")) {
                jSONObject.optInt("hysV2", 1);
                if (jSONObject.has("hdyfms")) {
                    String strOptString = jSONObject.optString("hdyfms");
                    if (!"".equals(strOptString) && strOptString.contains("|")) {
                        String[] strArrSplit = strOptString.split("\\|");
                        if (strArrSplit.length >= 2) {
                            Integer.parseInt(strArrSplit[0]);
                            Integer.parseInt(strArrSplit[1]);
                        }
                    }
                }
            }
            if (jSONObject.has("hdynwot")) {
                jSONObject.optInt("hdynwot", 2000);
            }
            if (jSONObject.has("hyp")) {
                jSONObject.optString("hyp", null);
            }
            if (jSONObject.has("navilane")) {
                jSONObject.optInt("navilane", 0);
            }
            if (jSONObject.has("navilane_dr")) {
                jSONObject.optInt("navilane_dr", 0);
            }
            if (jSONObject.has("navilane_uat")) {
                jSONObject.optInt("navilane_uat", 15);
            }
            if (jSONObject.has("navilane_dr_para")) {
                jSONObject.optInt("navilane_dr_para", 500);
            }
            if (jSONObject.has("bmsrco")) {
                jSONObject.optInt("bmsrco", 1);
            }
            if (jSONObject.has("bhyco")) {
                jSONObject.optInt("bhyco", 1);
            }
            if (jSONObject.has("rcapso")) {
                jSONObject.optInt("rcapso", 1);
            }
            if (jSONObject.has("rcpgn")) {
                jSONObject.optInt("rcpgn", 15);
            }
            if (jSONObject.has("rcjlgt")) {
                jSONObject.optInt("rcjlgt", 3);
            }
            if (jSONObject.has("splprs")) {
                jSONObject.optInt("splprs", -1);
            }
            if (jSONObject.has("cbds")) {
                jSONObject.optInt("cbds");
            }
            try {
                if (jSONObject.has("hploc")) {
                    String string3 = jSONObject.getString("hploc");
                    if (!TextUtils.isEmpty(string3) && string3.contains("|")) {
                        String[] strArrSplit2 = string3.split("\\|");
                        if (strArrSplit2 != null && strArrSplit2.length >= 2) {
                            if (strArrSplit2[0].equals("RMS")) {
                                this.A = true;
                            } else if (strArrSplit2[0].equals("BMS")) {
                                this.B = true;
                            } else if (strArrSplit2[0].equals("HMS")) {
                                this.f1673y = true;
                            } else if (strArrSplit2[0].equals("HPMS")) {
                                this.C = true;
                            } else if (strArrSplit2[0].equals("HMS,BMS")) {
                                this.f1674z = true;
                            }
                            if (this.A || this.B || this.f1673y || this.C || this.f1674z) {
                                if (strArrSplit2[1].equals("ALL")) {
                                    this.F = 1;
                                } else if (strArrSplit2[1].equals("NAVI")) {
                                    this.F = 2;
                                }
                            }
                        }
                        Log.i("baidu_location_service", "CloudConfig hplocation config = hms " + this.f1673y + "; rms " + this.A + "; baidurtk " + this.B + " ; hdlocationuse = " + this.F);
                    }
                }
                if (jSONObject.has("hdlnp")) {
                    jSONObject.optInt("hdlnp", 1);
                }
                if (jSONObject.has("hdlnpt")) {
                    jSONObject.optInt("hdlnpt", 1500);
                }
                if (jSONObject.has("viaduct") && (string2 = jSONObject.getString("viaduct")) != null) {
                    "RY".equals(string2);
                }
            } catch (Exception unused2) {
            }
            try {
                if (jSONObject.has("cfms")) {
                    jSONObject.getJSONArray("cfms");
                }
            } catch (Exception unused3) {
            }
            try {
                if (jSONObject.has("traf_ctrl_value")) {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("traf_ctrl_value");
                    if (jSONObjectOptJSONObject.has("subway_switch")) {
                        jSONObjectOptJSONObject.optInt("subway_switch");
                    }
                    if (jSONObjectOptJSONObject.has("subway_paramter")) {
                        jSONObjectOptJSONObject.optString("subway_paramter");
                    }
                    if (jSONObjectOptJSONObject.has("sub_col_prob")) {
                        this.D = jSONObjectOptJSONObject.optDouble("sub_col_prob");
                        new Random().nextDouble();
                    }
                    if (jSONObjectOptJSONObject.has("sub_col_onland")) {
                        jSONObjectOptJSONObject.optInt("sub_col_onland");
                    }
                    if (jSONObjectOptJSONObject.has("press_col_switch")) {
                        jSONObjectOptJSONObject.optInt("press_col_switch");
                    }
                    if (jSONObjectOptJSONObject.has("press_col_prob")) {
                        this.E = jSONObjectOptJSONObject.optDouble("press_col_prob");
                        new Random().nextDouble();
                    }
                    if (jSONObjectOptJSONObject.has("traffic_switch")) {
                        jSONObjectOptJSONObject.optInt("traffic_switch");
                    }
                    if (jSONObjectOptJSONObject.has("traffic_paramter")) {
                        jSONObjectOptJSONObject.optString("traffic_paramter");
                    }
                    if (jSONObjectOptJSONObject.has("gps_checker_switch_android")) {
                        this.G = jSONObjectOptJSONObject.optInt("gps_checker_switch_android");
                    }
                    if (jSONObjectOptJSONObject.has("gps_checker_params_android")) {
                        this.H = jSONObjectOptJSONObject.optString("gps_checker_params_android");
                    }
                    if (jSONObjectOptJSONObject.has("model")) {
                        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("model");
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                            if (jSONObjectOptJSONObject2.has("name")) {
                                jSONObjectOptJSONObject2.optString("name");
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (jSONObject.has("rpmp_indoor_model")) {
                jSONObject.optString("rpmp_indoor_model");
            }
            if (jSONObject.has("rpmp_indoor_md5")) {
                jSONObject.optString("rpmp_indoor_md5");
            }
            if (jSONObject.has("rpmp_indoor_ver")) {
                jSONObject.optString("rpmp_indoor_ver");
            }
            if (jSONObject.has("rpmp_indoor_switch")) {
                jSONObject.optInt("rpmp_indoor_switch");
            }
            if (jSONObject.has("ipbos")) {
                jSONObject.optInt("ipbos");
            }
            if (jSONObject.has("cell_scan_ver")) {
                jSONObject.optInt("cell_scan_ver");
            }
            if (jSONObject.has("tvurnd")) {
                jSONObject.optInt("tvurnd");
            }
            if (jSONObject.has("vo_t")) {
                jSONObject.getInt("vo_t");
            }
            if (jSONObject.has("vo_ep")) {
                jSONObject.getInt("vo_ep");
            }
            if (jSONObject.has("vo_sl")) {
                jSONObject.getInt("vo_sl");
            }
            if (jSONObject.has("nvso")) {
                jSONObject.getInt("nvso");
            }
            if (jSONObject.has("vo_d")) {
                jSONObject.getInt("vo_d");
            }
            if (jSONObject.has("grrct")) {
                jSONObject.optInt("grrct", 72);
            }
            if (jSONObject.has("vnrlon")) {
                jSONObject.getInt("vnrlon");
            }
            if (jSONObject.has("vlogon")) {
                jSONObject.getInt("vlogon");
            }
            if (jSONObject.has("vrtlog")) {
                jSONObject.getInt("vrtlog");
            }
            if (jSONObject.has("tbs")) {
                jSONObject.getInt("tbs");
            }
            if (jSONObject.has("rls")) {
                jSONObject.getInt("rls");
            }
            if (jSONObject.has("sdth")) {
                jSONObject.getDouble("sdth");
            }
            if (jSONObject.has("couth")) {
                jSONObject.getInt("couth");
            }
            if (jSONObject.has("accth")) {
                jSONObject.getDouble("accth");
            }
            if (jSONObject.has("lenth")) {
                jSONObject.getDouble("lenth");
            }
            if (jSONObject.has("seth")) {
                jSONObject.getDouble("seth");
            }
            if (jSONObject.has("vcso")) {
                jSONObject.getInt("vcso");
            }
            if (jSONObject.has("laeso")) {
                jSONObject.getInt("laeso");
            }
            if (jSONObject.has("vdro")) {
                jSONObject.getInt("vdro");
            }
            if (jSONObject.has("snco")) {
                jSONObject.getInt("snco");
            }
            if (jSONObject.has("vnmlo")) {
                jSONObject.getInt("vnmlo");
            }
            if (jSONObject.has("vtcrf")) {
                jSONObject.getInt("vtcrf");
            }
            if (jSONObject.has("vnsl")) {
                jSONObject.getInt("vnsl");
            }
            if (jSONObject.has("vt_max_drift")) {
                jSONObject.getInt("vt_max_drift");
            }
            if (jSONObject.has("wnsgrs")) {
                jSONObject.getInt("wnsgrs");
            }
            if (jSONObject.has("snct")) {
                jSONObject.getInt("snct");
            }
            if (jSONObject.has("vd_cross")) {
                jSONObject.getInt("vd_cross");
            }
            if (jSONObject.has("vpan")) {
                jSONObject.getInt("vpan");
            }
            if (jSONObject.has("yw")) {
                jSONObject.getDouble("yw");
            }
            if (jSONObject.has("yd1")) {
                jSONObject.getDouble("yd1");
            }
            if (jSONObject.has("yd2")) {
                jSONObject.getDouble("yd2");
            }
            if (jSONObject.has("yd3")) {
                jSONObject.getDouble("yd3");
            }
            if (jSONObject.has("yd4")) {
                jSONObject.getDouble("yd4");
            }
            if (jSONObject.has("yd5")) {
                jSONObject.getDouble("yd5");
            }
            if (jSONObject.has("yd6")) {
                jSONObject.getDouble("yd6");
            }
            if (jSONObject.has("yd7")) {
                jSONObject.getDouble("yd7");
            }
            if (jSONObject.has("yd8")) {
                jSONObject.getDouble("yd8");
            }
            if (jSONObject.has("vt")) {
                jSONObject.getInt("vt");
            }
            if (jSONObject.has("vwnp")) {
                jSONObject.getDouble("vwnp");
            }
            if (jSONObject.has("vtpct")) {
                jSONObject.getDouble("vtpct");
            }
            if (jSONObject.has("vr")) {
                jSONObject.getInt("vr");
            }
            if (jSONObject.has("vl")) {
                jSONObject.getInt("vl");
            }
            if (jSONObject.has("vg")) {
                jSONObject.getInt("vg");
            }
            if (jSONObject.has("vds")) {
                jSONObject.getInt("vds");
            }
            if (jSONObject.has("vnt1")) {
                jSONObject.getInt("vnt1");
            }
            if (jSONObject.has("vnt2")) {
                jSONObject.getInt("vnt2");
            }
            if (jSONObject.has("vndis")) {
                jSONObject.getInt("vndis");
            }
            if (jSONObject.has("vir")) {
                jSONObject.getInt("vir");
            }
            if (jSONObject.has("vzo")) {
                jSONObject.getInt("vzo");
            }
            if (jSONObject.has("vte")) {
                jSONObject.getInt("vte");
            }
            if (jSONObject.has("vgs")) {
                jSONObject.getInt("vgs");
            }
            if (jSONObject.has("vdt")) {
                jSONObject.getInt("vdt");
            }
            if (jSONObject.has("voc")) {
                jSONObject.getInt("voc");
            }
            if (jSONObject.has("gdco")) {
                jSONObject.getInt("gdco");
            }
            if (jSONObject.has("sopt")) {
                jSONObject.getInt("sopt");
            }
            if (jSONObject.has("vsd")) {
                jSONObject.getInt("vsd");
            }
            if (jSONObject.has("vtast")) {
                jSONObject.getInt("vtast");
            }
            if (jSONObject.has("otd")) {
                jSONObject.getInt("otd");
            }
            if (jSONObject.has("atrf")) {
                jSONObject.getInt("atrf");
            }
            if (jSONObject.has("mdin")) {
                jSONObject.getInt("mdin");
            }
            if (jSONObject.has("dmd")) {
                jSONObject.getInt("dmd");
            }
            if (jSONObject.has("tunnel_vl")) {
                jSONObject.getDouble("tunnel_vl");
            }
            if (jSONObject.has("vtarm")) {
                jSONObject.getDouble("vtarm");
            }
            if (jSONObject.has("pms")) {
                jSONObject.getInt("pms");
            }
            if (jSONObject.has("ipblo")) {
                jSONObject.getInt("ipblo");
            }
            if (jSONObject.has("ipbwn")) {
                jSONObject.getInt("ipbwn");
            }
            if (jSONObject.has("ipbdalp")) {
                jSONObject.getInt("ipbdalp");
            }
            if (jSONObject.has("ipbalp")) {
                jSONObject.getDouble("ipbalp");
            }
            if (jSONObject.has("ipbmt")) {
                jSONObject.getDouble("ipbmt");
            }
            if (jSONObject.has("ipbmth")) {
                jSONObject.getDouble("ipbmth");
            }
            if (jSONObject.has("ews")) {
                jSONObject.getInt("ews");
            }
            if (jSONObject.has("mds")) {
                jSONObject.getInt("mds");
            }
            if (jSONObject.has("nps")) {
                jSONObject.getInt("nps");
            }
            if (jSONObject.has("raws")) {
                jSONObject.getInt("raws");
            }
            if (jSONObject.has("rawp")) {
                try {
                    jSONObject.optDouble("rawp");
                } catch (Exception unused4) {
                }
            }
            if (jSONObject.has("tspp")) {
                str = "voc";
                try {
                    jSONObject.optInt("tspp", 0);
                } catch (Exception unused5) {
                }
            } else {
                str = "voc";
            }
            if (jSONObject.has("ircbms")) {
                try {
                    jSONObject.optInt("ircbms", 0);
                } catch (Exception unused6) {
                }
            }
            if (jSONObject.has("dbds")) {
                try {
                    jSONObject.optInt("dbds", -1);
                } catch (Exception unused7) {
                }
            }
            if (jSONObject.has("spic")) {
                String strOptString2 = jSONObject.optString("spic", this.J);
                if (!TextUtils.isEmpty(strOptString2)) {
                    this.J = strOptString2;
                }
            }
            if (jSONObject.has("total_spic")) {
                try {
                    jSONObject.optInt("total_spic", 0);
                } catch (Exception unused8) {
                }
            }
            if (jSONObject.has("total_spic_2")) {
                try {
                    jSONObject.optInt("total_spic_2", 0);
                } catch (Exception unused9) {
                }
            }
            if (jSONObject.has("cfgs_params_mode0_new")) {
                String string4 = jSONObject.getString("cfgs_params_mode0_new");
                if (TextUtils.isEmpty(string4) || !string4.contains("|")) {
                    j();
                } else {
                    String[] strArrSplit3 = string4.split("\\|");
                    this.f1665q = new float[strArrSplit3.length];
                    for (int i3 = 0; i3 < strArrSplit3.length; i3++) {
                        try {
                            this.f1665q[i3] = Float.parseFloat(strArrSplit3[i3]);
                        } catch (NumberFormatException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
            } else {
                j();
            }
            if (jSONObject.has("cfgs_params_mode1")) {
                String string5 = jSONObject.getString("cfgs_params_mode1");
                if (TextUtils.isEmpty(string5) || !string5.contains("|")) {
                    k();
                } else {
                    String[] strArrSplit4 = string5.split("\\|");
                    this.f1666r = new float[strArrSplit4.length];
                    for (int i4 = 0; i4 < strArrSplit4.length; i4++) {
                        try {
                            this.f1666r[i4] = Float.parseFloat(strArrSplit4[i4]);
                        } catch (NumberFormatException e4) {
                            e4.printStackTrace();
                        }
                    }
                }
            } else {
                k();
            }
            if (jSONObject.has("cfgs_params_mode2")) {
                String string6 = jSONObject.getString("cfgs_params_mode2");
                if (TextUtils.isEmpty(string6) || !string6.contains("|")) {
                    n();
                } else {
                    String[] strArrSplit5 = string6.split("\\|");
                    this.f1667s = new float[strArrSplit5.length];
                    for (int i5 = 0; i5 < strArrSplit5.length; i5++) {
                        try {
                            this.f1667s[i5] = Float.parseFloat(strArrSplit5[i5]);
                        } catch (NumberFormatException e5) {
                            e5.printStackTrace();
                        }
                    }
                }
            } else {
                n();
            }
            if (jSONObject.has("cfgs_params_mode4")) {
                String string7 = jSONObject.getString("cfgs_params_mode4");
                if (TextUtils.isEmpty(string7) || !string7.contains("|")) {
                    q();
                } else {
                    String[] strArrSplit6 = string7.split("\\|");
                    this.f1668t = new float[strArrSplit6.length];
                    for (int i6 = 0; i6 < strArrSplit6.length; i6++) {
                        try {
                            this.f1668t[i6] = Float.parseFloat(strArrSplit6[i6]);
                        } catch (NumberFormatException e6) {
                            e6.printStackTrace();
                        }
                    }
                }
            } else {
                q();
            }
            if (jSONObject.has("cfgs_params_mode5")) {
                String string8 = jSONObject.getString("cfgs_params_mode5");
                if (TextUtils.isEmpty(string8) || !string8.contains("|")) {
                    o();
                } else {
                    String[] strArrSplit7 = string8.split("\\|");
                    this.f1669u = new float[strArrSplit7.length];
                    for (int i7 = 0; i7 < strArrSplit7.length; i7++) {
                        try {
                            this.f1669u[i7] = Float.parseFloat(strArrSplit7[i7]);
                        } catch (NumberFormatException e7) {
                            e7.printStackTrace();
                        }
                    }
                }
            } else {
                o();
            }
            if (jSONObject.has("cfgs_params_mode6")) {
                String string9 = jSONObject.getString("cfgs_params_mode6");
                if (TextUtils.isEmpty(string9) || !string9.contains("|")) {
                    p();
                } else {
                    String[] strArrSplit8 = string9.split("\\|");
                    this.f1670v = new float[strArrSplit8.length];
                    for (int i8 = 0; i8 < strArrSplit8.length; i8++) {
                        try {
                            this.f1670v[i8] = Float.parseFloat(strArrSplit8[i8]);
                        } catch (NumberFormatException e8) {
                            e8.printStackTrace();
                        }
                    }
                }
            } else {
                p();
            }
            if (jSONObject.has("vsc") && (string = jSONObject.getString("vsc")) != null && string.contains(",")) {
                String[] strArrSplit9 = string.split(",");
                this.f1662n = new int[strArrSplit9.length];
                int length = strArrSplit9.length;
                int i9 = 0;
                int i10 = 0;
                while (i9 < length) {
                    String str2 = strArrSplit9[i9];
                    String[] strArr = strArrSplit9;
                    this.f1662n[i10] = 0;
                    if (str2.length() > 0) {
                        try {
                            this.f1662n[i10] = Integer.valueOf(str2).intValue();
                        } catch (Throwable unused10) {
                        }
                    }
                    i10++;
                    i9++;
                    strArrSplit9 = strArr;
                }
            }
            if (jSONObject.has("d")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("d");
                if (jSONObject2.has("vt")) {
                    jSONObject2.getInt("vt");
                }
                if (jSONObject2.has("vr")) {
                    jSONObject2.getInt("vr");
                }
                if (jSONObject2.has("vl")) {
                    jSONObject2.getInt("vl");
                }
                if (jSONObject2.has("vds")) {
                    jSONObject2.getInt("vds");
                }
                if (jSONObject2.has("vir")) {
                    jSONObject2.getInt("vir");
                }
                if (jSONObject2.has("vzo")) {
                    jSONObject2.getInt("vzo");
                }
                if (jSONObject2.has("vte")) {
                    jSONObject2.getInt("vte");
                }
                if (jSONObject2.has("vgs")) {
                    jSONObject2.getInt("vgs");
                }
                if (jSONObject2.has("vdt")) {
                    jSONObject2.getInt("vdt");
                }
                String str3 = str;
                if (jSONObject2.has(str3)) {
                    jSONObject2.getInt(str3);
                }
            }
            if (jSONObject.has("ao")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("ao");
                if (jSONObject3.has("rn0")) {
                    jSONObject3.getDouble("rn0");
                }
                if (jSONObject3.has("rn1")) {
                    jSONObject3.getDouble("rn1");
                }
                if (jSONObject3.has("rn2")) {
                    jSONObject3.getDouble("rn2");
                }
                if (jSONObject3.has("rv0")) {
                    jSONObject3.getDouble("rv0");
                }
                if (jSONObject3.has("rv1")) {
                    jSONObject3.getDouble("rv1");
                }
                if (jSONObject3.has("rv2")) {
                    jSONObject3.getDouble("rv2");
                }
                if (jSONObject3.has("rvb")) {
                    jSONObject3.getDouble("rvb");
                }
                if (jSONObject3.has("swt")) {
                    jSONObject3.getInt("swt");
                }
            }
            if (jSONObject.has("vcr")) {
                jSONObject.getInt("vcr");
            }
            if (jSONObject.has("vgrids")) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("vgrids");
                    int length2 = jSONArray.length();
                    for (int i11 = 0; i11 < length2; i11++) {
                        String[] strArrSplit10 = jSONArray.getString(i11).split(",");
                        if (strArrSplit10.length == 4) {
                            ArrayList<Float> arrayList = new ArrayList<>();
                            arrayList.add(Float.valueOf(strArrSplit10[0]));
                            arrayList.add(Float.valueOf(strArrSplit10[1]));
                            arrayList.add(Float.valueOf(strArrSplit10[2]));
                            arrayList.add(Float.valueOf(strArrSplit10[3]));
                            if (this.f1671w == null) {
                                this.f1671w = new ArrayList<>();
                            }
                            this.f1671w.add(arrayList);
                        }
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
            if (jSONObject.has("net_vdr_polygon")) {
                try {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("net_vdr_polygon");
                    int length3 = jSONArray2.length();
                    for (int i12 = 0; i12 < length3; i12++) {
                        JSONObject jSONObject4 = jSONArray2.getJSONObject(i12);
                        if (jSONObject4 != null && jSONObject4.has("x1") && jSONObject4.has("x2") && jSONObject4.has("y1") && jSONObject4.has("y2")) {
                            ArrayList<Double> arrayList2 = new ArrayList<>();
                            arrayList2.add(Double.valueOf(jSONObject4.getDouble("x1")));
                            arrayList2.add(Double.valueOf(jSONObject4.getDouble("y1")));
                            arrayList2.add(Double.valueOf(jSONObject4.getDouble("x2")));
                            arrayList2.add(Double.valueOf(jSONObject4.getDouble("y2")));
                            if (this.f1672x == null) {
                                this.f1672x = new ArrayList<>();
                            }
                            this.f1672x.add(arrayList2);
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                if (jSONObject.has("pps")) {
                    jSONObject.getInt("pps");
                }
                if (jSONObject.has("ppsw")) {
                    jSONObject.getInt("ppsw");
                }
                if (jSONObject.has("ppsv")) {
                    jSONObject.getInt("ppsv");
                }
                if (jSONObject.has("ppsmt")) {
                    jSONObject.getInt("ppsmt");
                }
                if (jSONObject.has("ppst")) {
                    jSONObject.getInt("ppst");
                }
                if (jSONObject.has("spef")) {
                    jSONObject.getInt("spef");
                }
                if (jSONObject.has("ppsut")) {
                    jSONObject.getInt("ppsut");
                }
                if (jSONObject.has("csps")) {
                    jSONObject.getInt("csps");
                }
                if (jSONObject.has("cspd")) {
                    jSONObject.getInt("cspd");
                }
                if (jSONObject.has("cspr")) {
                    jSONObject.getDouble("cspr");
                }
                if (jSONObject.has("ntb")) {
                    jSONObject.getInt("ntb");
                }
                if (jSONObject.has("hcs")) {
                    jSONObject.getInt("hcs");
                }
                if (jSONObject.has("hss")) {
                    jSONObject.getInt("hss");
                }
                if (jSONObject.has("drs")) {
                    jSONObject.getInt("drs");
                }
                if (jSONObject.has("rfdd")) {
                    jSONObject.getInt("rfdd");
                }
                if (jSONObject.has("ncls")) {
                    jSONObject.getInt("ncls");
                }
                if (jSONObject.has("nclw")) {
                    jSONObject.getInt("nclw");
                }
                if (jSONObject.has("nvwst")) {
                    jSONObject.getInt("nvwst");
                }
                if (jSONObject.has("ctz")) {
                    jSONObject.getDouble("ctz");
                }
                if (jSONObject.has("cdt")) {
                    jSONObject.getInt("cdt");
                }
                if (jSONObject.has("ccfb")) {
                    jSONObject.getInt("ccfb");
                }
                if (jSONObject.has("epoch_switch")) {
                    jSONObject.optInt("epoch_switch", 0);
                }
                if (jSONObject.has("epoch_to")) {
                    jSONObject.optDouble("epoch_to", -1.0d);
                }
                if (jSONObject.has("cl_list_switch")) {
                    this.I = jSONObject.optInt("cl_list_switch", 0);
                }
                if (jSONObject.has("cell_number")) {
                    jSONObject.optInt("cell_number", 10);
                }
                if (jSONObject.has("loc_str_length")) {
                    jSONObject.optInt("loc_str_length", 4000);
                }
                if (jSONObject.has("hrck")) {
                    jSONObject.getString("hrck");
                }
                if (jSONObject.has("hmsk")) {
                    jSONObject.getString("hmsk");
                }
                if (jSONObject.has("rmsk")) {
                    jSONObject.getString("rmsk");
                }
                if (jSONObject.has("hpstdk")) {
                    jSONObject.getString("hpstdk");
                }
                if (jSONObject.has("doubt_loc_switch")) {
                    jSONObject.optInt("doubt_loc_switch", 0);
                }
                if (jSONObject.has("doubt_loc_time")) {
                    jSONObject.optInt("doubt_loc_time", 3600);
                }
                if (jSONObject.has("gps_pre_switch")) {
                    jSONObject.optInt("gps_pre_switch", 1);
                }
                if (jSONObject.has("net_pre_switch")) {
                    jSONObject.optInt("net_pre_switch", 1);
                }
                if (jSONObject.has("gps_pre_length")) {
                    jSONObject.optInt("gps_pre_length", 5);
                }
                if (jSONObject.has("net_pre_length")) {
                    jSONObject.optInt("net_pre_length", 5);
                }
            }
            try {
                if (jSONObject.has("iblqp")) {
                    String strOptString3 = jSONObject.optString("iblqp");
                    this.K = strOptString3;
                    String[] strArrSplit11 = strOptString3.split(",");
                    if (strArrSplit11.length >= 3) {
                        Integer.parseInt(strArrSplit11[0]);
                        Integer.parseInt(strArrSplit11[1]);
                        Integer.parseInt(strArrSplit11[2]);
                    }
                }
            } catch (Exception unused11) {
            }
            if (jSONObject.has("miytp")) {
                this.L = jSONObject.optInt("miytp") + 1;
            }
            if (jSONObject.has("itptn")) {
                jSONObject.optInt("itptn ");
            }
            if (jSONObject.has("new_cl_scan_switch")) {
                jSONObject.optInt("new_cl_scan_switch", 1);
            }
            if (jSONObject.has("new_cl_scan_time")) {
                jSONObject.optInt("new_cl_scan_time", 100);
            }
            if (jSONObject.has("click_nlp_switch")) {
                jSONObject.optInt("click_nlp_switch", 0);
            }
            if (jSONObject.has("irgs")) {
                jSONObject.optDouble("irgs");
            }
            if (jSONObject.has("pdr_indoor_switch")) {
                jSONObject.optInt("pdr_indoor_switch", 0);
            }
            if (jSONObject.has("ilprs")) {
                jSONObject.optInt("ilprs");
            }
            if (jSONObject.has("cell_scan_time")) {
                jSONObject.optLong("cell_scan_time", 30000L);
            }
            if (jSONObject.has("tunnel_mobile_switch")) {
                jSONObject.optInt("tunnel_mobile_switch", 0);
            }
            if (jSONObject.has("new_loc_cache_switch")) {
                jSONObject.optInt("new_loc_cache_switch", 1);
            }
            if (jSONObject.has("nc_same_rate")) {
                jSONObject.optDouble("nc_same_rate", 0.8d);
            }
            if (jSONObject.has("cl_str_change_rate")) {
                jSONObject.optDouble("cl_str_change_rate", 0.2d);
            }
            if (jSONObject.has("wf_high_freq_vdr_loss")) {
                jSONObject.optInt("wf_high_freq_vdr_loss", 0);
            }
            if (jSONObject.has("gnssods")) {
                jSONObject.optInt("gnssods");
            }
            if (jSONObject.has("rtdrns")) {
                jSONObject.optInt("rtdrns");
            }
            if (jSONObject.has("vcsrps")) {
                jSONObject.optInt("vcsrps");
            }
            if (jSONObject.has("nlp_loc_coarse")) {
                jSONObject.optInt("nlp_loc_coarse");
            }
            if (jSONObject.has("lspfnis")) {
                jSONObject.optInt("lspfnis", 1);
            }
            if (jSONObject.has("upload_ssid_switch")) {
                this.M = jSONObject.optInt("upload_ssid_switch", 1);
            }
            if (jSONObject.has("single_ssid_length_max")) {
                this.N = jSONObject.optInt("single_ssid_length_max", 30);
            }
            if (jSONObject.has("max_request_ssid_number")) {
                this.O = jSONObject.optInt("max_request_ssid_number", 64);
            }
            if (jSONObject.has("fix_telephony_crash")) {
                jSONObject.optInt("fix_telephony_crash", 1);
            }
            if (jSONObject.has("is_monitor_index")) {
                jSONObject.optInt("is_monitor_index", 0);
            }
            if (jSONObject.has("monitor_frequency")) {
                jSONObject.optInt("monitor_frequency", 60000);
            }
            if (jSONObject.has("iens")) {
                this.P = jSONObject.optInt("iens");
            }
            if (jSONObject.has("kahts")) {
                this.Q = jSONObject.optInt("kahts");
            }
            if (jSONObject.has("nvlyps")) {
                jSONObject.optInt("nvlyps");
            }
            if (jSONObject.has("nvlypsl")) {
                jSONObject.optInt("nvlypsl");
            }
            if (jSONObject.has("nvlypsp")) {
                String strOptString4 = jSONObject.optString("nvlypsp");
                if (strOptString4.contains("\\|")) {
                    String[] strArrSplit12 = strOptString4.split("\\|");
                    if (strArrSplit12.length >= 2) {
                        Integer.parseInt(strArrSplit12[0]);
                        Integer.parseInt(strArrSplit12[1]);
                    }
                }
            }
            if (jSONObject.has("nvlgfs")) {
                jSONObject.optInt("nvlgfs");
            }
            if (jSONObject.has("sppfs")) {
                jSONObject.optInt("sppfs");
            }
            if (jSONObject.has("ipsd")) {
                jSONObject.optString("ipsd");
            }
            if (jSONObject.has("nipvgdt")) {
                jSONObject.optInt("nipvgdt");
            }
            if (jSONObject.has("nipvpyt")) {
                jSONObject.optInt("nipvpyt");
            }
            if (jSONObject.has("nipvdcf")) {
                jSONObject.optInt("nipvdcf");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final void n() {
        String[] strArrSplit = "1|0.05|200|80|1|300|80|2|100|40|30|3|8|4050|5|30|0.1|1|1|0|0.325|0|0|0.5|1|5|15|10|0.05|10|10|1|5|10|10|30|5|5.5|1|0|1|40|0.5|120|180|20|200|300|600|2|10|2|4|1.02|0|0|20|10|60|2|100|2|10|1|20|0".split("\\|");
        this.f1667s = new float[strArrSplit.length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                this.f1667s[i2] = Float.parseFloat(strArrSplit[i2]);
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void o() {
        String[] strArrSplit = "1|10000|90|5|3|3|85|87|5|10|15|8|5|5".split("\\|");
        this.f1669u = new float[strArrSplit.length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                this.f1669u[i2] = Float.parseFloat(strArrSplit[i2]);
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void p() {
        String[] strArrSplit = "1|0.05|60|45|2|300|80|2|100|40|30|3|8|4050|5|5|0.1|1|1|0|0.325|0|0|0.5|1|6|15|10|0.05|10|10|1|5|10|10|30|5|5.5|1|0|1|40|0.5|120|180|20|200|300|600|2|10|2|4|1.02|0|0|20|10|60|2|100|2|10|1|20|1|0.2|0|0|0.5|0|1|1000|10|1|40|5|10|5|0.8|1|5|50|6|2|4|1|1|0|0|1|0.5|1|0|1|200|100|1".split("\\|");
        this.f1670v = new float[strArrSplit.length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                this.f1670v[i2] = Float.parseFloat(strArrSplit[i2]);
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void q() {
        String[] strArrSplit = "1|0.05|30|25|1|15|80|2|100|40|30|3|8|4050|10|7|0.1|1|1|0.1|0.325|0|0|0.5|1|6|15|10|0.05|10|10|1|5|10|10|30|5|5.5|1|0|1|40|0.5|120|180|20|200|300|600|2|10|2|4|1.02|0|0|20|10|60|2|100|2|10|1|20|0|1|1|0|1".split("\\|");
        this.f1668t = new float[strArrSplit.length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                this.f1668t[i2] = Float.parseFloat(strArrSplit[i2]);
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void r() {
        if (this.f1660l == null) {
            this.f1660l = new Handler();
        }
        boolean z2 = true;
        boolean z3 = System.currentTimeMillis() - this.f1659k > 86400000;
        String strD = r.c().d("vdrconfig_gz", "");
        if (strD != null && !"".equals(strD)) {
            z2 = z3;
        }
        if (z2) {
            this.f1659k = System.currentTimeMillis();
            r.c().f("vdrtt", this.f1659k);
            Handler handler = this.f1660l;
            if (handler != null) {
                handler.postDelayed(new a(), 5000L);
            }
        }
    }
}

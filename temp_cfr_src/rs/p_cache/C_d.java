/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream
 */
package rs.p_cache;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.zip.CRC32;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import rs.C_B_uc;
import rs.C_Client_mc;
import rs.C_h;
import rs.p_cache.C_b;
import rs.p_cache.C_c;
import rs.p_cache.C_e;
import rs.p_v.C_a;
import rs.p_x.C_f;

public final class C_d
extends C_e
implements Runnable {
    private static int o = 0;
    public static List<Integer> a = new ArrayList<Integer>();
    private final Object p = new Object();
    public final C_b b = new C_b();
    public final C_b c = new C_b();
    public final C_b d = new C_b();
    public final C_b e = new C_b();
    public static int f = 0;
    private final C_h q = new C_h();
    private final C_h r;
    private final C_h s;
    private final C_h t;
    private final C_h u;
    private int v;
    private int w;
    private C_c x;
    public rs.p_t.p_a.C_e g;
    private int y;
    private int z;
    public String h = "";
    private int A;
    private long B;
    public int[] i;
    private final CRC32 C = new CRC32();
    private final byte[] D = new byte[500];
    public int j;
    private final byte[][] E = new byte[4][];
    private C_Client_mc F;
    private int G;
    private int H;
    private int[] I;
    public int k;
    public int[] l;
    private int J;
    private boolean K = true;
    private OutputStream L;
    public int[] m;
    private boolean M = false;
    private final byte[] N;
    private int[] O;
    private final C_B_uc P;
    private InputStream Q;
    private Socket R;
    private final int[][] S;
    private final int[][] T;
    public int[] n;
    private byte[] U;
    private int V;

    public void a() {
        this.b.a("main_file_cache.dat", "main_file_cache.idx");
        this.c.a("main_file_osrs.dat", "main_file_osrs.idx");
        this.d.a("main_file_cache.dat", "main_file_cache.idx");
        this.e.a("main_file_osrs.dat", "main_file_osrs.idx");
        if (rs.p_f.C_a.d.booleanValue()) {
            rs.p_cache.p_osrs.C_b c_b = new rs.p_cache.p_osrs.C_b(this.c);
            c_b.a();
        }
    }

    private boolean a(int n, int n2, byte[] byArray) {
        if (byArray == null || byArray.length < 2) {
            return false;
        }
        int n3 = byArray.length - 2;
        int n4 = ((byArray[n3] & 0xFF) << 8) + (byArray[n3 + 1] & 0xFF);
        this.C.reset();
        this.C.update(byArray, 0, n3);
        return n4 == n && (int)this.C.getValue() == n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(int n, int n2, int n3, int n4, int n5) {
        if (n < 0 || n2 < 0) {
            return;
        }
        Object object = this.p;
        synchronized (object) {
            C_c c_c = (C_c)this.P.b();
            while (c_c != null) {
                if (c_c.j == n && c_c.m == n2) {
                    return;
                }
                c_c = (C_c)this.P.c();
            }
            c_c = new C_c();
            c_c.j = n;
            c_c.k = rs.p_cache.p_osrs.C_c.a() ? 1 : 0;
            c_c.m = n2;
            c_c.n = true;
            c_c.p = n3;
            c_c.q = n4;
            c_c.r = n5;
            C_h c_h = this.r;
            synchronized (c_h) {
                this.r.a(c_c);
            }
            this.P.a(c_c);
        }
    }

    @Override
    public void a(int n) {
        this.a(0, n);
    }

    public void a(int n, int n2) {
        this.a(n, n2, 0, 0, 0);
    }

    public int b(int n) {
        return Short.MAX_VALUE;
    }

    @Override
    public void run() {
        try {
            while (this.K) {
                int n;
                ++this.j;
                int n2 = 20;
                if (this.z == 0 && this.b.a()[0] != null) {
                    n2 = 50;
                }
                try {
                    Thread.sleep(n2);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                this.M = true;
                for (n = 0; n < 100 && this.M; ++n) {
                    this.M = false;
                    this.k();
                    this.l();
                    if (this.v == 0 && n >= 5) break;
                    this.m();
                    if (this.Q == null) continue;
                    this.n();
                }
                n = 0;
                C_c c_c = (C_c)this.q.b();
                while (c_c != null) {
                    if (c_c.n) {
                        n = 1;
                        ++c_c.o;
                        if (c_c.o > 50) {
                            c_c.o = 0;
                            this.a(c_c);
                        }
                    }
                    c_c = (C_c)this.q.d();
                }
                if (n == 0) {
                    c_c = (C_c)this.q.b();
                    while (c_c != null) {
                        n = 1;
                        ++c_c.o;
                        if (c_c.o > 50) {
                            c_c.o = 0;
                            this.a(c_c);
                        }
                        c_c = (C_c)this.q.d();
                    }
                }
                if (n != 0) {
                    ++this.V;
                    if (this.V <= 750) continue;
                    try {
                        this.R.close();
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    this.R = null;
                    this.Q = null;
                    this.L = null;
                    this.H = 0;
                    continue;
                }
                this.V = 0;
                this.h = "";
            }
        }
        catch (Exception exception) {
            C_a.e("od_ex " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(int n, int n2) {
        if (this.b.a()[0] == null) {
            return;
        }
        if (this.z == 0) {
            return;
        }
        C_c c_c = new C_c();
        c_c.j = n2;
        c_c.m = n;
        c_c.n = false;
        if (rs.p_cache.p_osrs.C_c.a()) {
            c_c.k = 1;
        }
        C_h c_h = this.s;
        synchronized (c_h) {
            this.s.a(c_c);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public C_c b() {
        C_c c_c;
        Object object = this.u;
        synchronized (object) {
            c_c = (C_c)this.u.a();
        }
        if (c_c == null) {
            return null;
        }
        object = this.p;
        synchronized (object) {
            c_c.a();
        }
        if (c_c.l == null) {
            return c_c;
        }
        boolean bl = false;
        if (c_c.i) {
            try (GzipCompressorInputStream gzipCompressorInputStream = new GzipCompressorInputStream((InputStream)new ByteArrayInputStream(c_c.l));){
                c_c.l = gzipCompressorInputStream.readAllBytes();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                System.out.println("[dataType=" + c_c.j + "] [fileID=" + c_c.m + "] [osrs=" + (c_c.k == 1) + "]");
            }
        }
        return c_c;
    }

    public byte[] a(int n, int n2, int n3) {
        byte[] byArray = (n3 == 1 ? this.e : this.d).a()[n + 1].a(n2);
        if (byArray != null) {
            try (GzipCompressorInputStream gzipCompressorInputStream = new GzipCompressorInputStream((InputStream)new ByteArrayInputStream(byArray));){
                byte[] byArray2 = gzipCompressorInputStream.readAllBytes();
                return byArray2;
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void k() {
        C_c c_c;
        Object object = this.r;
        synchronized (object) {
            c_c = (C_c)this.r.a();
        }
        while (c_c != null) {
            C_h c_h;
            C_h c_h2;
            Object object2;
            this.M = true;
            object = null;
            if (c_c.j == 0 && !rs.p_f.C_a.aj && C_Client_mc.bn.b(c_c.m) != null && c_c.k != 1) {
                object2 = new File(C_a.f() + "raw/" + c_c.m + ".dat");
                if (!((File)object2).exists()) {
                    object2 = new File(C_a.f() + "raw/" + c_c.m);
                }
                if (((File)object2).exists()) {
                    object = C_Client_mc.a(((File)object2).getAbsolutePath());
                    c_h2 = this.r;
                    synchronized (c_h2) {
                        c_c.l = (byte[])object;
                        c_c.i = false;
                        c_h = this.u;
                        synchronized (c_h) {
                            this.u.a(c_c);
                        }
                        c_c = (C_c)this.r.a();
                        continue;
                    }
                }
            }
            Object object3 = object2 = c_c.k == 1 ? this.c : this.b;
            if (((C_b)object2).a()[0] != null) {
                object = ((C_b)object2).a()[c_c.j + 1].a(c_c.m);
            }
            c_h2 = this.r;
            synchronized (c_h2) {
                if (object == null) {
                    this.t.a(c_c);
                } else {
                    c_c.l = (byte[])object;
                    c_h = this.u;
                    synchronized (c_h) {
                        this.u.a(c_c);
                    }
                }
                c_c = (C_c)this.r.a();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(byte by, int n, int n2) {
        if (this.b.a()[0] == null) {
            return;
        }
        Object object = this.p;
        synchronized (object) {
            byte[] byArray = this.b.a()[n + 1].a(n2);
            this.E[n][n2] = by;
            if (by > this.z) {
                this.z = by;
            }
            ++this.y;
        }
    }

    public boolean c(int n) {
        for (int i = 0; i < this.n.length; ++i) {
            if (this.i[i] != n) continue;
            return true;
        }
        return false;
    }

    private void l() {
        this.v = 0;
        this.w = 0;
        C_c c_c = (C_c)this.q.b();
        while (c_c != null) {
            if (c_c.n) {
                ++this.v;
                if (f < 100 || rs.p_f.C_a.d.booleanValue()) {
                    System.out.println("Error: model is incomplete or missing  [ type = " + c_c.j + "]  [id = " + c_c.m + "]  [rev = " + c_c.k + "]");
                    ++f;
                }
            } else {
                ++this.w;
            }
            c_c = (C_c)this.q.d();
        }
        while (this.v < C_d.c()) {
            c_c = (C_c)this.t.a();
            try {
                if (c_c == null) break;
                if (this.E[c_c.j][c_c.m] != 0) {
                    ++this.J;
                }
                this.E[c_c.j][c_c.m] = 0;
                this.q.a(c_c);
                ++this.v;
                this.a(c_c);
                this.M = true;
                if (f >= 100 && !rs.p_f.C_a.d.booleanValue()) continue;
                System.out.println("Error: file is missing  [ type = " + c_c.j + "]  [id = " + c_c.m + "]");
                ++f;
            }
            catch (Exception exception) {
                if (f >= 100 && !rs.p_f.C_a.d.booleanValue()) continue;
                System.out.println("missing: type: " + c_c.j + " ID" + c_c.m + " REV" + c_c.k);
                ++f;
            }
        }
    }

    public static int c() {
        return rs.p_f.C_a.d != false ? 100 : 10;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void d() {
        C_h c_h = this.s;
        synchronized (c_h) {
            this.s.f();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void m() {
        while (this.v == 0 && this.w < C_d.c() && this.z != 0) {
            C_c c_c;
            C_h c_h = this.s;
            synchronized (c_h) {
                c_c = (C_c)this.s.a();
            }
            while (c_c != null) {
                if (this.E[c_c.j][c_c.m] != 0) {
                    this.E[c_c.j][c_c.m] = 0;
                    this.q.a(c_c);
                    this.a(c_c);
                    this.M = true;
                    if (this.J < this.y) {
                        ++this.J;
                    }
                    this.h = "Loading extra files - " + this.J * 100 / this.y + "%";
                    ++this.w;
                    if (this.w == 10) {
                        return;
                    }
                }
                c_h = this.s;
                synchronized (c_h) {
                    c_c = (C_c)this.s.a();
                }
            }
            for (int i = 0; i < 4; ++i) {
                byte[] byArray = this.E[i];
                int n = byArray.length;
                for (int j = 0; j < n; ++j) {
                    if (byArray[j] != this.z) continue;
                    byArray[j] = 0;
                    C_c c_c2 = new C_c();
                    c_c2.j = i;
                    c_c2.m = j;
                    c_c2.n = false;
                    this.q.a(c_c2);
                    this.a(c_c2);
                    this.M = true;
                    if (this.J < this.y) {
                        ++this.J;
                    }
                    this.h = "Loading extra files - " + this.J * 100 / this.y + "%";
                    ++this.w;
                    if (this.w != 10) continue;
                    return;
                }
            }
            --this.z;
        }
    }

    public boolean d(int n) {
        return this.I[n] == 1;
    }

    public C_d() {
        this.s = new C_h();
        this.u = new C_h();
        this.N = new byte[465000];
        this.P = new C_B_uc();
        this.S = new int[4][];
        this.T = new int[4][];
        this.t = new C_h();
        this.r = new C_h();
    }

    public void e(int n) {
        System.out.println("[Regions] Attempting to dump region " + n + "..");
        for (int i = 0; i < this.n.length; ++i) {
            if (this.n[i] != n) continue;
            System.out.println("-> Region dump (ID " + n + "):");
            System.out.println("mapIndices1[" + i + "] = " + n + ";");
            System.out.println("mapIndices2[" + i + "] = " + this.l[i] + ";");
            System.out.println("mapIndices3[" + i + "] = " + this.i[i] + ";");
            System.out.println();
            return;
        }
        System.out.println("-> Failed to find region map data!");
    }

    public void e() {
        File file = new File("./dumps/maps");
        file.mkdir();
        for (int i = 0; i < this.l.length; ++i) {
            try {
                byte[] byArray = this.b.a()[4].a(this.l[i]);
                File file2 = new File("./dumps/maps/" + this.l[i] + ".gz");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(byArray);
                fileOutputStream.close();
                continue;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public void f() {
        byte[] byArray = C_Client_mc.a(C_a.f() + "map_index.dat");
        rs.p_x.C_e c_e = new rs.p_x.C_e(byArray);
        int n = byArray.length / 6;
        this.n = new int[n];
        this.l = new int[n];
        this.i = new int[n];
        for (int i = 0; i < n; ++i) {
            this.n[i] = c_e.A();
            this.l[i] = c_e.A();
            this.i[i] = c_e.A();
        }
    }

    public void a(C_f c_f, C_Client_mc c_Client_mc) {
        int n;
        int n2;
        String[] stringArray = new String[]{"model_version", "anim_version", "midi_version", "map_version"};
        for (int i = 0; i < 4; ++i) {
            byte[] byArray = c_f.a(stringArray[i]);
            int n3 = byArray.length / 2;
            rs.p_x.C_e c_e = new rs.p_x.C_e(byArray);
            this.S[i] = new int[n3];
            this.E[i] = new byte[n3];
            for (int j = 0; j < n3; ++j) {
                this.S[i][j] = c_e.A();
            }
        }
        String[] stringArray2 = new String[]{"model_crc", "anim_crc", "midi_crc", "map_crc"};
        for (int i = 0; i < 4; ++i) {
            byte[] byArray = c_f.a(stringArray2[i]);
            int n4 = byArray.length / 4;
            rs.p_x.C_e c_e = new rs.p_x.C_e(byArray);
            this.T[i] = new int[n4];
            for (n2 = 0; n2 < n4; ++n2) {
                this.T[i][n2] = c_e.D();
            }
        }
        byte[] byArray = c_f.a("model_index");
        int n5 = this.S[0].length;
        this.U = new byte[n5];
        for (int i = 0; i < n5; ++i) {
            this.U[i] = i < byArray.length ? byArray[i] : (byte)0;
        }
        byArray = C_Client_mc.a(C_a.f() + "map_index.dat");
        rs.p_x.C_e c_e = new rs.p_x.C_e(byArray);
        o = n = byArray.length / 6;
        n2 = n + 100;
        this.n = new int[n2 + 1000];
        this.l = new int[n2 + 1000];
        this.i = new int[n2 + 1000];
        this.m = new int[n2 + 1000];
        for (int i = 0; i < n; ++i) {
            this.n[i] = c_e.A();
            this.l[i] = c_e.A();
            this.i[i] = c_e.A();
        }
        this.g = new rs.p_t.p_a.C_e();
        this.g.a(this.n, this.l, this.i, this.m);
        this.n[107] = 8751;
        this.l[107] = 1946;
        this.i[107] = 1947;
        this.n[108] = 8752;
        this.l[108] = 938;
        this.i[108] = 939;
        this.n[129] = 9007;
        this.l[129] = 1938;
        this.i[129] = 1939;
        this.n[130] = 9008;
        this.l[130] = 946;
        this.i[130] = 947;
        this.n[149] = 9263;
        this.l[149] = 1210;
        this.i[149] = 1211;
        this.n[150] = 9264;
        this.l[150] = 956;
        this.i[150] = 957;
        this.n[1047] = 13361;
        this.l[1047] = 584;
        this.i[1047] = 585;
        this.n[1088] = 13617;
        this.l[1088] = 238;
        this.i[1088] = 239;
        this.n[1106] = -1;
        this.l[1106] = -1;
        this.i[1106] = -1;
        this.n[1105] = -1;
        this.l[1105] = -1;
        this.i[1105] = -1;
        this.n[1064] = 13386;
        this.l[1064] = 1912;
        this.i[1064] = 1913;
        this.n[C_d.o] = 13130;
        this.l[C_d.o] = 1900;
        this.i[C_d.o++] = 1901;
        this.n[1065] = 13387;
        this.l[1065] = 1880;
        this.i[1065] = 1881;
        this.n[C_d.o] = -1;
        this.l[C_d.o] = -1;
        this.i[C_d.o++] = -1;
        this.n[1108] = -1;
        this.l[1108] = -1;
        this.i[1108] = -1;
        this.n[C_d.o] = -1;
        this.l[C_d.o] = -1;
        this.i[C_d.o++] = -1;
        this.n[1109] = -1;
        this.l[1109] = -1;
        this.i[1109] = -1;
        this.n[1021] = 13135;
        this.l[1021] = 1892;
        this.i[1021] = 1893;
        this.n[C_d.o] = 13134;
        this.l[C_d.o] = 1884;
        this.i[C_d.o++] = 1885;
        this.n[1020] = -1;
        this.l[1020] = -1;
        this.i[1020] = -1;
        this.n[925] = -1;
        this.l[925] = -1;
        this.i[925] = -1;
        this.n[1135] = 13899;
        this.l[1135] = 1890;
        this.i[1135] = 1891;
        this.n[C_d.o] = 13900;
        this.l[C_d.o] = 1910;
        this.i[C_d.o++] = 1911;
        this.n[C_d.o] = 14155;
        this.l[C_d.o] = 1904;
        this.i[C_d.o++] = 1905;
        this.n[C_d.o] = 14156;
        this.l[C_d.o] = 1878;
        this.i[C_d.o++] = 1879;
        this.n[1019] = 13131;
        this.l[1019] = 1894;
        this.i[1019] = 1895;
        this.n[926] = -1;
        this.l[926] = -1;
        this.i[926] = -1;
        this.n[C_d.o] = 12703;
        this.l[C_d.o] = 3212;
        this.i[C_d.o++] = 3213;
        this.n[C_d.o] = 12702;
        this.l[C_d.o] = 3204;
        this.i[C_d.o++] = 3205;
        this.n[C_d.o] = 12701;
        this.l[C_d.o] = 3208;
        this.i[C_d.o++] = 3209;
        this.n[C_d.o] = 12959;
        this.l[C_d.o] = 3206;
        this.i[C_d.o++] = 3207;
        this.n[C_d.o] = 12958;
        this.l[C_d.o] = 3210;
        this.i[C_d.o++] = 3211;
        this.n[C_d.o] = 12957;
        this.l[C_d.o] = 3214;
        this.i[C_d.o++] = 3215;
        this.n[C_d.o] = 14927;
        this.l[C_d.o] = 1876;
        this.i[C_d.o++] = 1877;
        this.n[180] = 9023;
        this.l[180] = 1624;
        this.i[180] = 1625;
        this.n[251] = 6810;
        this.l[251] = 2700;
        this.i[251] = 2701;
        this.n[49] = 7513;
        this.l[49] = 2724;
        this.i[49] = 2725;
        this.n[239] = 9377;
        this.l[239] = 1440;
        this.i[239] = 1441;
        this.n[C_d.o] = 7514;
        this.l[C_d.o] = 2728;
        this.i[C_d.o++] = 2729;
        this.n[C_d.o] = 6481;
        this.l[C_d.o] = 1348;
        this.i[C_d.o++] = 1349;
        this.n[C_d.o] = 6480;
        this.l[C_d.o] = 1350;
        this.i[C_d.o++] = 1351;
        this.n[C_d.o] = 5771;
        this.l[C_d.o] = 1352;
        this.i[C_d.o++] = 1353;
        this.n[C_d.o] = 5772;
        this.l[C_d.o] = 1354;
        this.i[C_d.o++] = 1355;
        this.n[++C_d.o] = 13396;
        this.l[C_d.o] = 2814;
        this.i[C_d.o++] = 2815;
        ++o;
        ++o;
        ++o;
        ++o;
        ++o;
        this.n[493] = -1;
        this.l[493] = -1;
        this.i[493] = -1;
        this.n[918] = 0;
        this.l[918] = 0;
        this.i[918] = 0;
        this.n[1063] = -1;
        this.l[1063] = -1;
        this.i[1063] = -1;
        this.n[1424] = 0;
        this.l[1424] = 0;
        this.i[1424] = 0;
        this.n[1016] = 0;
        this.l[1016] = 0;
        this.i[1016] = 0;
        this.n[1423] = 0;
        this.l[1423] = 0;
        this.i[1423] = 0;
        this.n[1513] = 13660;
        this.l[1513] = 2708;
        this.i[1513] = 2709;
        this.n[1544] = 13916;
        this.l[1544] = 2716;
        this.i[1544] = 2717;
        this.n[1512] = 13659;
        this.l[1512] = 2712;
        this.i[1512] = 2713;
        this.n[1543] = 13915;
        this.l[1543] = 2718;
        this.i[1543] = 2719;
        this.n[1511] = 13658;
        this.l[1511] = 2710;
        this.i[1511] = 2711;
        this.n[1542] = 13914;
        this.l[1542] = 2702;
        this.i[1542] = 2703;
        this.n[1573] = 14170;
        this.l[1573] = 2704;
        this.i[1573] = 2705;
        this.n[1572] = 14169;
        this.l[1572] = 2706;
        this.i[1572] = 2707;
        this.n[1541] = 13913;
        this.l[1541] = 2714;
        this.i[1541] = 2715;
        this.n[1555] = 5956;
        this.l[1555] = 3528;
        this.i[1555] = 3529;
        this.n[1556] = 11877;
        this.l[1556] = 3526;
        this.i[1556] = 3527;
        this.n[878] = 11601;
        this.l[878] = 3474;
        this.i[878] = 3475;
        this.n[725] = 0;
        this.l[725] = 0;
        this.i[725] = 0;
        this.n[726] = 0;
        this.l[726] = 0;
        this.i[726] = 0;
        this.n[783] = 0;
        this.l[783] = 0;
        this.i[783] = 0;
        this.n[666] = 0;
        this.l[666] = 0;
        this.i[666] = 0;
        this.n[665] = 0;
        this.l[665] = 0;
        this.i[665] = 0;
        this.n[417] = 0;
        this.l[417] = 0;
        this.i[417] = 0;
        this.n[242] = 0;
        this.l[242] = 0;
        this.i[242] = 0;
        this.n[880] = -1;
        this.l[880] = -1;
        this.i[880] = -1;
        this.n[971] = -1;
        this.l[971] = -1;
        this.i[971] = -1;
        this.n[972] = -1;
        this.l[972] = -1;
        this.i[972] = -1;
        byArray = c_f.a("anim_index");
        c_e = new rs.p_x.C_e(byArray);
        n5 = byArray.length / 2;
        this.O = new int[n5];
        for (n = 0; n < n5; ++n) {
            this.O[n] = c_e.A();
        }
        byArray = c_f.a("midi_index");
        c_e = new rs.p_x.C_e(byArray);
        n5 = byArray.length;
        this.I = new int[n5];
        for (n = 0; n < n5; ++n) {
            this.I[n] = c_e.y();
        }
        this.F = c_Client_mc;
        this.K = true;
        this.F.a(this, 2);
        if (rs.p_f.C_a.c == 1) {
            int n6;
            int n7;
            n = 0;
            int[] nArray = new int[]{};
            int[] nArray2 = new int[]{};
            int[] nArray3 = new int[]{};
            for (int i = 0; i < this.n.length; ++i) {
                for (int n8 : nArray3) {
                    if (i != n8) continue;
                    System.out.println("[IDX] [FOUND MATCH FOR IDX " + i + "]");
                    System.out.println("mapIndices1[" + i + "] = " + this.n[i]);
                    System.out.println("mapIndices2[" + i + "] = " + this.l[i]);
                    System.out.println("mapIndices3[" + i + "] = " + this.i[i]);
                    System.out.println();
                }
                for (int n8 : nArray) {
                    if (this.l[i] != n8 && this.i[i] != n8) continue;
                    System.out.println("[FILE] [FOUND MATCH FOR FILE " + n8 + "]");
                    System.out.println("mapIndices1[" + i + "] = " + this.n[i]);
                    System.out.println("mapIndices2[" + i + "] = " + this.l[i]);
                    System.out.println("mapIndices3[" + i + "] = " + this.i[i]);
                    System.out.println();
                }
                int[] nArray4 = nArray2;
                n7 = nArray4.length;
                for (n6 = 0; n6 < n7; ++n6) {
                    int n8;
                    n8 = nArray4[n6];
                    if (this.n[i] != n8) continue;
                    System.out.println("[REGION] [FOUND MATCH FOR REGION " + n8 + "]");
                    System.out.println("mapIndices1[" + i + "] = " + this.n[i]);
                    System.out.println("mapIndices2[" + i + "] = " + this.l[i]);
                    System.out.println("mapIndices3[" + i + "] = " + this.i[i]);
                    System.out.println();
                }
            }
            if (n != 0) {
                HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();
                int n9 = 3530;
                block12: for (n7 = 0; n7 < n9; ++n7) {
                    for (n6 = 0; n6 < this.n.length; ++n6) {
                        if (this.l[n6] != n7 && this.i[n6] != n7) continue;
                        hashMap.put(n7, true);
                        continue block12;
                    }
                }
                for (n7 = 0; n7 < n9; ++n7) {
                    if (hashMap.get(n7) != null) continue;
                    System.out.println("[MAP TOOL] Found unused region .GZ FILE id: " + n7);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void n() {
        try {
            int n;
            int n2 = this.Q.available();
            if (this.H == 0 && n2 >= 6) {
                this.M = true;
                this.Q.read(this.D, 0, 6);
                int n3 = this.D[0] & 0xFF;
                n = ((this.D[1] & 0xFF) << 8) + (this.D[2] & 0xFF);
                int n4 = ((this.D[3] & 0xFF) << 8) + (this.D[4] & 0xFF);
                int n5 = this.D[5] & 0xFF;
                this.x = null;
                Object object = (C_c)this.q.b();
                while (object != null) {
                    if (((C_c)object).j == n3 && ((C_c)object).m == n) {
                        this.x = object;
                    }
                    if (this.x != null) {
                        ((C_c)object).o = 0;
                    }
                    object = (C_c)this.q.d();
                }
                if (this.x != null) {
                    this.V = 0;
                    if (n4 == 0) {
                        C_a.e("Rej: " + n3 + "," + n);
                        this.x.l = null;
                        if (this.x.n) {
                            object = this.u;
                            synchronized (object) {
                                this.u.a(this.x);
                            }
                        } else {
                            this.x.b();
                        }
                        this.x = null;
                    } else {
                        if (this.x.l == null && n5 == 0) {
                            this.x.l = new byte[n4];
                        }
                        if (this.x.l == null) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.G = n5 * 500;
                this.H = 500;
                if (this.H > n4 - n5 * 500) {
                    this.H = n4 - n5 * 500;
                }
            }
            if (this.H > 0 && n2 >= this.H) {
                this.M = true;
                byte[] byArray = this.D;
                n = 0;
                if (this.x != null) {
                    byArray = this.x.l;
                    n = this.G;
                }
                this.Q.read(byArray, n, this.H);
                if (this.H + this.G >= byArray.length && this.x != null) {
                    C_b c_b;
                    C_b c_b2 = c_b = this.x.k == 1 ? this.c : this.b;
                    if (c_b.a()[0] != null) {
                        c_b.a()[this.x.j + 1].a(byArray.length, byArray, this.x.m);
                    }
                    if (!this.x.n && this.x.j == 3) {
                        this.x.n = true;
                        this.x.j = 93;
                    }
                    if (this.x.n) {
                        C_h c_h = this.u;
                        synchronized (c_h) {
                            this.u.a(this.x);
                        }
                    } else {
                        this.x.b();
                    }
                }
                this.H = 0;
            }
        }
        catch (IOException iOException) {
            try {
                this.R.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.R = null;
            this.Q = null;
            this.L = null;
            this.H = 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int g() {
        C_B_uc c_B_uc = this.P;
        synchronized (c_B_uc) {
            return this.P.d();
        }
    }

    public void h() {
        this.K = false;
    }

    public void a(boolean bl) {
        int n = this.n.length;
        for (int i = 0; i < n; ++i) {
            if (!bl && this.m[i] == 0) continue;
            this.a((byte)2, 3, this.i[i]);
            this.a((byte)2, 3, this.l[i]);
        }
    }

    public int f(int n) {
        return this.S[n].length;
    }

    private void a(C_c c_c) {
        this.R = null;
        this.Q = null;
        this.L = null;
        this.H = 0;
        ++this.k;
    }

    public int i() {
        return 29192;
    }

    public int j() {
        return 72000;
    }

    public int b(int n, int n2, int n3) {
        int n4 = (n3 << 8) + n2;
        for (int i = 0; i < this.n.length; ++i) {
            int n5;
            if (this.n[i] != n4) continue;
            int n6 = n5 = n == 0 ? this.l[i] : this.i[i];
            if (n5 > 3535 && !this.g.f().a_(n5)) {
                if (rs.p_f.C_a.d.booleanValue()) {
                    System.out.println("[Map warning] Capped map file " + n5 + " (reached max)");
                }
                return -1;
            }
            return n5;
        }
        return -1;
    }
}


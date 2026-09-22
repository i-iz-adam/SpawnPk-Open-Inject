package rs;

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

/* JADX INFO: loaded from: client-final.jar:rs/class_95.class */
public final class class_95 extends class_96 implements Runnable {
    private int v;
    private int w;
    private class_84 x;
    public class_623 g;
    private int y;
    private int z;
    private int A;
    private long B;
    public int[] i;
    public int j;
    private Client F;
    private int G;
    private int H;
    private int[] I;
    public int k;
    public int[] l;
    private int J;
    private OutputStream L;
    public int[] m;
    private int[] O;
    private InputStream Q;
    private Socket R;
    public int[] n;
    private byte[] U;
    private int V;
    private static int o = 0;
    public static List<Integer> a = new ArrayList();
    public static int f = 0;
    private final Object p = new Object();
    public final class_79 b = new class_79();
    public final class_79 c = new class_79();
    public final class_79 d = new class_79();
    public final class_79 e = new class_79();
    private final class_157 q = new class_157();
    public String h = "";
    private final CRC32 C = new CRC32();
    private final byte[] D = new byte[500];
    private final byte[][] E = new byte[4][];
    private final class_157 s = new class_157();
    private boolean K = true;
    private boolean M = false;
    private final class_157 u = new class_157();
    private final byte[] N = new byte[465000];
    private final class_26 P = new class_26();
    private final int[][] S = new int[4][];
    private final int[][] T = new int[4][];
    private final class_157 t = new class_157();
    private final class_157 r = new class_157();

    public void a() {
        this.b.a("main_file_cache.dat", "main_file_cache.idx");
        this.c.a("main_file_osrs.dat", "main_file_osrs.idx");
        this.d.a("main_file_cache.dat", "main_file_cache.idx");
        this.e.a("main_file_osrs.dat", "main_file_osrs.idx");
        if (Configuration.d.booleanValue()) {
            new class_82(this.c).a();
        }
    }

    private boolean a(int i, int i2, byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return false;
        }
        int length = bArr.length - 2;
        int i3 = ((bArr[length] & 255) << 8) + (bArr[length + 1] & 255);
        this.C.reset();
        this.C.update(bArr, 0, length);
        return i3 == i && ((int) this.C.getValue()) == i2;
    }

    public void a(int i, int i2, int i3, int i4, int i5) {
        if (i < 0 || i2 < 0) {
            return;
        }
        synchronized (this.p) {
            class_84 class_84Var = (class_84) this.P.b();
            while (class_84Var != null) {
                if (class_84Var.j == i && class_84Var.m == i2) {
                    return;
                } else {
                    class_84Var = (class_84) this.P.c();
                }
            }
            class_84 class_84Var2 = new class_84();
            class_84Var2.j = i;
            class_84Var2.k = class_83.a() ? 1 : 0;
            class_84Var2.m = i2;
            class_84Var2.n = true;
            class_84Var2.p = i3;
            class_84Var2.q = i4;
            class_84Var2.r = i5;
            synchronized (this.r) {
                this.r.a(class_84Var2);
            }
            this.P.a(class_84Var2);
        }
    }

    @Override // rs.class_96
    public void a(int i) {
        a(0, i);
    }

    public void a(int i, int i2) {
        a(i, i2, 0, 0, 0);
    }

    public int b(int i) {
        return 32767;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.K) {
            try {
                this.j++;
                int i = 20;
                if (this.z == 0 && this.b.a()[0] != null) {
                    i = 50;
                }
                try {
                    Thread.sleep(i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.M = true;
                for (int i2 = 0; i2 < 100 && this.M; i2++) {
                    this.M = false;
                    k();
                    l();
                    if (this.v == 0 && i2 >= 5) {
                        break;
                    }
                    m();
                    if (this.Q != null) {
                        n();
                    }
                }
                boolean z = false;
                class_84 class_84Var = (class_84) this.q.b();
                while (class_84Var != null) {
                    if (class_84Var.n) {
                        z = true;
                        class_84Var.o++;
                        if (class_84Var.o > 50) {
                            class_84Var.o = 0;
                            a(class_84Var);
                        }
                    }
                    class_84Var = (class_84) this.q.d();
                }
                if (!z) {
                    class_84 class_84Var2 = (class_84) this.q.b();
                    while (class_84Var2 != null) {
                        z = true;
                        class_84Var2.o++;
                        if (class_84Var2.o > 50) {
                            class_84Var2.o = 0;
                            a(class_84Var2);
                        }
                        class_84Var2 = (class_84) this.q.d();
                    }
                }
                if (z) {
                    this.V++;
                    if (this.V > 750) {
                        try {
                            this.R.close();
                        } catch (Exception e2) {
                        }
                        this.R = null;
                        this.Q = null;
                        this.L = null;
                        this.H = 0;
                    }
                } else {
                    this.V = 0;
                    this.h = "";
                }
            } catch (Exception e3) {
                class_650.e("od_ex " + e3.getMessage());
                e3.printStackTrace();
                return;
            }
        }
    }

    public void b(int i, int i2) {
        if (this.b.a()[0] == null || this.z == 0) {
            return;
        }
        class_84 class_84Var = new class_84();
        class_84Var.j = i2;
        class_84Var.m = i;
        class_84Var.n = false;
        if (class_83.a()) {
            class_84Var.k = 1;
        }
        synchronized (this.s) {
            this.s.a(class_84Var);
        }
    }

    public class_84 b() {
        class_84 class_84Var;
        synchronized (this.u) {
            class_84Var = (class_84) this.u.a();
        }
        if (class_84Var == null) {
            return null;
        }
        synchronized (this.p) {
            class_84Var.a();
        }
        if (class_84Var.l == null) {
            return class_84Var;
        }
        if (class_84Var.i) {
            try {
                GzipCompressorInputStream gzipCompressorInputStream = new GzipCompressorInputStream(new ByteArrayInputStream(class_84Var.l));
                try {
                    class_84Var.l = gzipCompressorInputStream.readAllBytes();
                    gzipCompressorInputStream.close();
                } catch (Throwable th) {
                    try {
                        gzipCompressorInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("[dataType=" + class_84Var.j + "] [fileID=" + class_84Var.m + "] [osrs=" + (class_84Var.k == 1) + "]");
            }
        }
        return class_84Var;
    }

    public byte[] a(int i, int i2, int i3) throws IOException {
        byte[] bArrA = (i3 == 1 ? this.e : this.d).a()[i + 1].a(i2);
        if (bArrA == null) {
            return null;
        }
        GzipCompressorInputStream gzipCompressorInputStream = new GzipCompressorInputStream(new ByteArrayInputStream(bArrA));
        try {
            byte[] allBytes = gzipCompressorInputStream.readAllBytes();
            gzipCompressorInputStream.close();
            return allBytes;
        } catch (Throwable th) {
            try {
                gzipCompressorInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void k() {
        class_84 class_84Var;
        synchronized (this.r) {
            class_84Var = (class_84) this.r.a();
        }
        while (class_84Var != null) {
            this.M = true;
            byte[] bArrA = null;
            if (class_84Var.j == 0 && !Configuration.aj && Client.bn.b(class_84Var.m) != null && class_84Var.k != 1) {
                File file = new File(class_650.f() + "raw/" + class_84Var.m + ".dat");
                if (!file.exists()) {
                    file = new File(class_650.f() + "raw/" + class_84Var.m);
                }
                if (file.exists()) {
                    byte[] bArrA2 = Client.a(file.getAbsolutePath());
                    synchronized (this.r) {
                        class_84Var.l = bArrA2;
                        class_84Var.i = false;
                        synchronized (this.u) {
                            this.u.a(class_84Var);
                        }
                        class_84Var = (class_84) this.r.a();
                    }
                }
            }
            class_79 class_79Var = class_84Var.k == 1 ? this.c : this.b;
            if (class_79Var.a()[0] != null) {
                bArrA = class_79Var.a()[class_84Var.j + 1].a(class_84Var.m);
            }
            synchronized (this.r) {
                if (bArrA == null) {
                    this.t.a(class_84Var);
                    class_84Var = (class_84) this.r.a();
                } else {
                    class_84Var.l = bArrA;
                    synchronized (this.u) {
                        this.u.a(class_84Var);
                    }
                    class_84Var = (class_84) this.r.a();
                }
            }
        }
    }

    public void a(byte b, int i, int i2) {
        if (this.b.a()[0] == null) {
            return;
        }
        synchronized (this.p) {
            this.b.a()[i + 1].a(i2);
            this.E[i][i2] = b;
            if (b > this.z) {
                this.z = b;
            }
            this.y++;
        }
    }

    public boolean c(int i) {
        for (int i2 = 0; i2 < this.n.length; i2++) {
            if (this.i[i2] == i) {
                return true;
            }
        }
        return false;
    }

    private void l() {
        this.v = 0;
        this.w = 0;
        class_617 class_617VarB = this.q.b();
        while (true) {
            class_84 class_84Var = (class_84) class_617VarB;
            if (class_84Var == null) {
                break;
            }
            if (class_84Var.n) {
                this.v++;
                if (f < 100 || Configuration.d.booleanValue()) {
                    System.out.println("Error: model is incomplete or missing  [ type = " + class_84Var.j + "]  [id = " + class_84Var.m + "]  [rev = " + class_84Var.k + "]");
                    f++;
                }
            } else {
                this.w++;
            }
            class_617VarB = this.q.d();
        }
        while (this.v < c()) {
            class_84 class_84Var2 = (class_84) this.t.a();
            if (class_84Var2 == null) {
                return;
            }
            try {
                if (this.E[class_84Var2.j][class_84Var2.m] != 0) {
                    this.J++;
                }
                this.E[class_84Var2.j][class_84Var2.m] = 0;
                this.q.a(class_84Var2);
                this.v++;
                a(class_84Var2);
                this.M = true;
                if (f < 100 || Configuration.d.booleanValue()) {
                    System.out.println("Error: file is missing  [ type = " + class_84Var2.j + "]  [id = " + class_84Var2.m + "]");
                    f++;
                }
            } catch (Exception e) {
                if (f < 100 || Configuration.d.booleanValue()) {
                    System.out.println("missing: type: " + class_84Var2.j + " ID" + class_84Var2.m + " REV" + class_84Var2.k);
                    f++;
                }
            }
        }
    }

    public static int c() {
        return Configuration.d.booleanValue() ? 100 : 10;
    }

    public void d() {
        synchronized (this.s) {
            this.s.f();
        }
    }

    private void m() {
        class_84 class_84Var;
        while (this.v == 0 && this.w < c() && this.z != 0) {
            synchronized (this.s) {
                class_84Var = (class_84) this.s.a();
            }
            while (class_84Var != null) {
                if (this.E[class_84Var.j][class_84Var.m] != 0) {
                    this.E[class_84Var.j][class_84Var.m] = 0;
                    this.q.a(class_84Var);
                    a(class_84Var);
                    this.M = true;
                    if (this.J < this.y) {
                        this.J++;
                    }
                    this.h = "Loading extra files - " + ((this.J * 100) / this.y) + "%";
                    this.w++;
                    if (this.w == 10) {
                        return;
                    }
                }
                synchronized (this.s) {
                    class_84Var = (class_84) this.s.a();
                }
            }
            for (int i = 0; i < 4; i++) {
                byte[] bArr = this.E[i];
                int length = bArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (bArr[i2] == this.z) {
                        bArr[i2] = 0;
                        class_84 class_84Var2 = new class_84();
                        class_84Var2.j = i;
                        class_84Var2.m = i2;
                        class_84Var2.n = false;
                        this.q.a(class_84Var2);
                        a(class_84Var2);
                        this.M = true;
                        if (this.J < this.y) {
                            this.J++;
                        }
                        this.h = "Loading extra files - " + ((this.J * 100) / this.y) + "%";
                        this.w++;
                        if (this.w == 10) {
                            return;
                        }
                    }
                }
            }
            this.z--;
        }
    }

    public boolean d(int i) {
        return this.I[i] == 1;
    }

    public void e(int i) {
        System.out.println("[Regions] Attempting to dump region " + i + "..");
        for (int i2 = 0; i2 < this.n.length; i2++) {
            if (this.n[i2] == i) {
                System.out.println("-> Region dump (ID " + i + "):");
                System.out.println("mapIndices1[" + i2 + "] = " + i + ";");
                System.out.println("mapIndices2[" + i2 + "] = " + this.l[i2] + ";");
                System.out.println("mapIndices3[" + i2 + "] = " + this.i[i2] + ";");
                System.out.println();
                return;
            }
        }
        System.out.println("-> Failed to find region map data!");
    }

    public void e() {
        new File("./dumps/maps").mkdir();
        for (int i = 0; i < this.l.length; i++) {
            try {
                byte[] bArrA = this.b.a()[4].a(this.l[i]);
                FileOutputStream fileOutputStream = new FileOutputStream(new File("./dumps/maps/" + this.l[i] + ".gz"));
                fileOutputStream.write(bArrA);
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void f() {
        byte[] bArrA = Client.a(class_650.f() + "map_index.dat");
        Buffer buffer = new Buffer(bArrA);
        int length = bArrA.length / 6;
        this.n = new int[length];
        this.l = new int[length];
        this.i = new int[length];
        for (int i = 0; i < length; i++) {
            this.n[i] = buffer.A();
            this.l[i] = buffer.A();
            this.i[i] = buffer.A();
        }
    }

    public void a(class_663 class_663Var, Client client) {
        String[] strArr = {"model_version", "anim_version", "midi_version", "map_version"};
        for (int i = 0; i < 4; i++) {
            byte[] bArrA = class_663Var.a(strArr[i]);
            int length = bArrA.length / 2;
            Buffer buffer = new Buffer(bArrA);
            this.S[i] = new int[length];
            this.E[i] = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                this.S[i][i2] = buffer.A();
            }
        }
        String[] strArr2 = {"model_crc", "anim_crc", "midi_crc", "map_crc"};
        for (int i3 = 0; i3 < 4; i3++) {
            byte[] bArrA2 = class_663Var.a(strArr2[i3]);
            int length2 = bArrA2.length / 4;
            Buffer buffer2 = new Buffer(bArrA2);
            this.T[i3] = new int[length2];
            for (int i4 = 0; i4 < length2; i4++) {
                this.T[i3][i4] = buffer2.D();
            }
        }
        byte[] bArrA3 = class_663Var.a("model_index");
        int length3 = this.S[0].length;
        this.U = new byte[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            if (i5 < bArrA3.length) {
                this.U[i5] = bArrA3[i5];
            } else {
                this.U[i5] = 0;
            }
        }
        byte[] bArrA4 = Client.a(class_650.f() + "map_index.dat");
        Buffer buffer3 = new Buffer(bArrA4);
        int length4 = bArrA4.length / 6;
        o = length4;
        int i6 = length4 + 100;
        this.n = new int[i6 + 1000];
        this.l = new int[i6 + 1000];
        this.i = new int[i6 + 1000];
        this.m = new int[i6 + 1000];
        for (int i7 = 0; i7 < length4; i7++) {
            this.n[i7] = buffer3.A();
            this.l[i7] = buffer3.A();
            this.i[i7] = buffer3.A();
        }
        this.g = new class_623();
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
        this.n[o] = 13130;
        this.l[o] = 1900;
        int[] iArr = this.i;
        int i8 = o;
        o = i8 + 1;
        iArr[i8] = 1901;
        this.n[1065] = 13387;
        this.l[1065] = 1880;
        this.i[1065] = 1881;
        this.n[o] = -1;
        this.l[o] = -1;
        int[] iArr2 = this.i;
        int i9 = o;
        o = i9 + 1;
        iArr2[i9] = -1;
        this.n[1108] = -1;
        this.l[1108] = -1;
        this.i[1108] = -1;
        this.n[o] = -1;
        this.l[o] = -1;
        int[] iArr3 = this.i;
        int i10 = o;
        o = i10 + 1;
        iArr3[i10] = -1;
        this.n[1109] = -1;
        this.l[1109] = -1;
        this.i[1109] = -1;
        this.n[1021] = 13135;
        this.l[1021] = 1892;
        this.i[1021] = 1893;
        this.n[o] = 13134;
        this.l[o] = 1884;
        int[] iArr4 = this.i;
        int i11 = o;
        o = i11 + 1;
        iArr4[i11] = 1885;
        this.n[1020] = -1;
        this.l[1020] = -1;
        this.i[1020] = -1;
        this.n[925] = -1;
        this.l[925] = -1;
        this.i[925] = -1;
        this.n[1135] = 13899;
        this.l[1135] = 1890;
        this.i[1135] = 1891;
        this.n[o] = 13900;
        this.l[o] = 1910;
        int[] iArr5 = this.i;
        int i12 = o;
        o = i12 + 1;
        iArr5[i12] = 1911;
        this.n[o] = 14155;
        this.l[o] = 1904;
        int[] iArr6 = this.i;
        int i13 = o;
        o = i13 + 1;
        iArr6[i13] = 1905;
        this.n[o] = 14156;
        this.l[o] = 1878;
        int[] iArr7 = this.i;
        int i14 = o;
        o = i14 + 1;
        iArr7[i14] = 1879;
        this.n[1019] = 13131;
        this.l[1019] = 1894;
        this.i[1019] = 1895;
        this.n[926] = -1;
        this.l[926] = -1;
        this.i[926] = -1;
        this.n[o] = 12703;
        this.l[o] = 3212;
        int[] iArr8 = this.i;
        int i15 = o;
        o = i15 + 1;
        iArr8[i15] = 3213;
        this.n[o] = 12702;
        this.l[o] = 3204;
        int[] iArr9 = this.i;
        int i16 = o;
        o = i16 + 1;
        iArr9[i16] = 3205;
        this.n[o] = 12701;
        this.l[o] = 3208;
        int[] iArr10 = this.i;
        int i17 = o;
        o = i17 + 1;
        iArr10[i17] = 3209;
        this.n[o] = 12959;
        this.l[o] = 3206;
        int[] iArr11 = this.i;
        int i18 = o;
        o = i18 + 1;
        iArr11[i18] = 3207;
        this.n[o] = 12958;
        this.l[o] = 3210;
        int[] iArr12 = this.i;
        int i19 = o;
        o = i19 + 1;
        iArr12[i19] = 3211;
        this.n[o] = 12957;
        this.l[o] = 3214;
        int[] iArr13 = this.i;
        int i20 = o;
        o = i20 + 1;
        iArr13[i20] = 3215;
        this.n[o] = 14927;
        this.l[o] = 1876;
        int[] iArr14 = this.i;
        int i21 = o;
        o = i21 + 1;
        iArr14[i21] = 1877;
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
        this.n[o] = 7514;
        this.l[o] = 2728;
        int[] iArr15 = this.i;
        int i22 = o;
        o = i22 + 1;
        iArr15[i22] = 2729;
        this.n[o] = 6481;
        this.l[o] = 1348;
        int[] iArr16 = this.i;
        int i23 = o;
        o = i23 + 1;
        iArr16[i23] = 1349;
        this.n[o] = 6480;
        this.l[o] = 1350;
        int[] iArr17 = this.i;
        int i24 = o;
        o = i24 + 1;
        iArr17[i24] = 1351;
        this.n[o] = 5771;
        this.l[o] = 1352;
        int[] iArr18 = this.i;
        int i25 = o;
        o = i25 + 1;
        iArr18[i25] = 1353;
        this.n[o] = 5772;
        this.l[o] = 1354;
        int[] iArr19 = this.i;
        int i26 = o;
        o = i26 + 1;
        iArr19[i26] = 1355;
        o++;
        this.n[o] = 13396;
        this.l[o] = 2814;
        int[] iArr20 = this.i;
        int i27 = o;
        o = i27 + 1;
        iArr20[i27] = 2815;
        o++;
        o++;
        o++;
        o++;
        o++;
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
        byte[] bArrA5 = class_663Var.a("anim_index");
        Buffer buffer4 = new Buffer(bArrA5);
        int length5 = bArrA5.length / 2;
        this.O = new int[length5];
        for (int i28 = 0; i28 < length5; i28++) {
            this.O[i28] = buffer4.A();
        }
        byte[] bArrA6 = class_663Var.a("midi_index");
        Buffer buffer5 = new Buffer(bArrA6);
        int length6 = bArrA6.length;
        this.I = new int[length6];
        for (int i29 = 0; i29 < length6; i29++) {
            this.I[i29] = buffer5.y();
        }
        this.F = client;
        this.K = true;
        this.F.a(this, 2);
        if (Configuration.c.intValue() == 1) {
            int[] iArr21 = new int[0];
            int[] iArr22 = new int[0];
            int[] iArr23 = new int[0];
            for (int i30 = 0; i30 < this.n.length; i30++) {
                for (int i31 : iArr23) {
                    if (i30 == i31) {
                        System.out.println("[IDX] [FOUND MATCH FOR IDX " + i30 + "]");
                        System.out.println("mapIndices1[" + i30 + "] = " + this.n[i30]);
                        System.out.println("mapIndices2[" + i30 + "] = " + this.l[i30]);
                        System.out.println("mapIndices3[" + i30 + "] = " + this.i[i30]);
                        System.out.println();
                    }
                }
                for (int i32 : iArr21) {
                    if (this.l[i30] == i32 || this.i[i30] == i32) {
                        System.out.println("[FILE] [FOUND MATCH FOR FILE " + i32 + "]");
                        System.out.println("mapIndices1[" + i30 + "] = " + this.n[i30]);
                        System.out.println("mapIndices2[" + i30 + "] = " + this.l[i30]);
                        System.out.println("mapIndices3[" + i30 + "] = " + this.i[i30]);
                        System.out.println();
                    }
                }
                for (int i33 : iArr22) {
                    if (this.n[i30] == i33) {
                        System.out.println("[REGION] [FOUND MATCH FOR REGION " + i33 + "]");
                        System.out.println("mapIndices1[" + i30 + "] = " + this.n[i30]);
                        System.out.println("mapIndices2[" + i30 + "] = " + this.l[i30]);
                        System.out.println("mapIndices3[" + i30 + "] = " + this.i[i30]);
                        System.out.println();
                    }
                }
            }
            if (0 != 0) {
                HashMap map = new HashMap();
                for (int i34 = 0; i34 < 3530; i34++) {
                    for (int i35 = 0; i35 < this.n.length; i35++) {
                        if (this.l[i35] == i34 || this.i[i35] == i34) {
                            map.put(Integer.valueOf(i34), true);
                            break;
                        }
                    }
                }
                for (int i36 = 0; i36 < 3530; i36++) {
                    if (map.get(Integer.valueOf(i36)) == null) {
                        System.out.println("[MAP TOOL] Found unused region .GZ FILE id: " + i36);
                    }
                }
            }
        }
    }

    private void n() {
        try {
            int iAvailable = this.Q.available();
            if (this.H == 0 && iAvailable >= 6) {
                this.M = true;
                this.Q.read(this.D, 0, 6);
                int i = this.D[0] & 255;
                int i2 = ((this.D[1] & 255) << 8) + (this.D[2] & 255);
                int i3 = ((this.D[3] & 255) << 8) + (this.D[4] & 255);
                int i4 = this.D[5] & 255;
                this.x = null;
                class_84 class_84Var = (class_84) this.q.b();
                while (class_84Var != null) {
                    if (class_84Var.j == i && class_84Var.m == i2) {
                        this.x = class_84Var;
                    }
                    if (this.x != null) {
                        class_84Var.o = 0;
                    }
                    class_84Var = (class_84) this.q.d();
                }
                if (this.x != null) {
                    this.V = 0;
                    if (i3 == 0) {
                        class_650.e("Rej: " + i + "," + i2);
                        this.x.l = null;
                        if (this.x.n) {
                            synchronized (this.u) {
                                this.u.a(this.x);
                            }
                        } else {
                            this.x.b();
                        }
                        this.x = null;
                    } else {
                        if (this.x.l == null && i4 == 0) {
                            this.x.l = new byte[i3];
                        }
                        if (this.x.l == null) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.G = i4 * 500;
                this.H = 500;
                if (this.H > i3 - (i4 * 500)) {
                    this.H = i3 - (i4 * 500);
                }
            }
            if (this.H > 0 && iAvailable >= this.H) {
                this.M = true;
                byte[] bArr = this.D;
                int i5 = 0;
                if (this.x != null) {
                    bArr = this.x.l;
                    i5 = this.G;
                }
                this.Q.read(bArr, i5, this.H);
                if (this.H + this.G >= bArr.length && this.x != null) {
                    class_79 class_79Var = this.x.k == 1 ? this.c : this.b;
                    if (class_79Var.a()[0] != null) {
                        class_79Var.a()[this.x.j + 1].a(bArr.length, bArr, this.x.m);
                    }
                    if (!this.x.n && this.x.j == 3) {
                        this.x.n = true;
                        this.x.j = 93;
                    }
                    if (this.x.n) {
                        synchronized (this.u) {
                            this.u.a(this.x);
                        }
                    } else {
                        this.x.b();
                    }
                }
                this.H = 0;
            }
        } catch (IOException e) {
            try {
                this.R.close();
            } catch (Exception e2) {
            }
            this.R = null;
            this.Q = null;
            this.L = null;
            this.H = 0;
        }
    }

    public int g() {
        int iD;
        synchronized (this.P) {
            iD = this.P.d();
        }
        return iD;
    }

    public void h() {
        this.K = false;
    }

    public void a(boolean z) {
        int length = this.n.length;
        for (int i = 0; i < length; i++) {
            if (z || this.m[i] != 0) {
                a((byte) 2, 3, this.i[i]);
                a((byte) 2, 3, this.l[i]);
            }
        }
    }

    public int f(int i) {
        return this.S[i].length;
    }

    private void a(class_84 class_84Var) {
        this.R = null;
        this.Q = null;
        this.L = null;
        this.H = 0;
        this.k++;
    }

    public int i() {
        return 29192;
    }

    public int j() {
        return 72000;
    }

    public int b(int i, int i2, int i3) {
        int i4 = (i3 << 8) + i2;
        for (int i5 = 0; i5 < this.n.length; i5++) {
            if (this.n[i5] == i4) {
                int i6 = i == 0 ? this.l[i5] : this.i[i5];
                if (i6 <= 3535 || this.g.f().a_(i6)) {
                    return i6;
                }
                if (!Configuration.d.booleanValue()) {
                    return -1;
                }
                System.out.println("[Map warning] Capped map file " + i6 + " (reached max)");
                return -1;
            }
        }
        return -1;
    }
}

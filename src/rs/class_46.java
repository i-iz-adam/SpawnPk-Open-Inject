package rs;

import com.sun.jna.platform.win32.aU;
import org.lwjgl.system.windows.User32;
import rs.gui.Launcher;
import rs.lpkg.e;
import rs.runelite.a.g;

/* JADX INFO: loaded from: client-final.jar:rs/class_46.class */
public final class class_46 {
    public static final int a = 7;
    public static final int b = 128;
    private static final int v = 128;
    private static final int w = 383;
    public static boolean g;
    private final int[][][] B;
    private int C;
    private int D;
    private static int H;
    private static int I;
    private static int J;
    private static int K;
    private static int L;
    private static int M;
    private static int N;
    private static int O;
    private static int P;
    public static int j;
    public static int k;
    public static int l;
    public static int m;
    public static int n;
    public static int o;
    public static int p;
    private static boolean V;
    private static int W;
    private static int X;
    public static boolean q;
    private static int ab;
    private int ao;
    private static boolean[][] as;
    private static int at;
    private static int au;
    private static int av;
    private static int aw;
    private static int ax;
    private static int ay;
    public static int c = 50;
    public static int d = 25;
    public static int e = d;
    public static int f = 500;
    public static boolean h = true;
    private static l[] Q = new l[100];
    private static final int[] R = {53, -53, -53, 53};
    private static final int[] S = {-53, -53, 53, 53};
    private static final int[] T = {-45, 45, 45, -45};
    private static final int[] U = {45, 45, -45, -45};
    public static int r = -1;
    public static int s = -1;
    public static int t = -1;
    public static int u = -1;
    private static final class_31[] ac = new class_31[500];
    private static class_157 ad = new class_157();
    private static final int[] ae = {19, 55, 38, 155, 255, 110, 137, aU.ho_, 76};
    private static final int[] af = {160, 192, 80, 96, 0, 144, 80, 48, 160};
    private static final int[] ag = {76, 8, 137, 4, 0, 1, 38, 2, 19};
    private static final int[] ah = {0, 0, 2, 0, 0, 2, 1, 1, 0};
    private static final int[] ai = {2, 0, 0, 2, 0, 0, 0, 4, 4};
    private static final int[] aj = {0, 4, 4, 8, 0, 0, 8, 0, 0};
    private static final int[] ak = {1, 1, 0, 0, 0, 8, 0, 0, 8};
    private static final int[] al = {41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, aU.KX, 41, 28992, 41, 41, 41, 41, 41, aU.yn, 41, 41, 41, 7079, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41};
    private static boolean[][][][] ar = new boolean[8][32][51][51];
    private static final int Y = 4;
    private static int[] Z = new int[Y];
    private static class_31[][] aa = new class_31[Y][500];
    private final int[][] ap = {new int[16], new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, new int[]{0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, new int[]{0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
    private final int[][] aq = {new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new int[]{12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, new int[]{15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, new int[]{3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
    private boolean x = true;
    private final l[] E = new l[5000];
    private final l[] F = new l[5000];
    private final int[] am = new int[10000];
    private final int[] an = new int[10000];
    private final int y = 4;
    private final int z = 104;
    private final int A = 104;
    public final class_32[][][] i = new class_32[4][104][104];
    private final int[][][] G = new int[4][104 + 1][104 + 1];

    public static void a(boolean z) {
        if (z) {
            e = e.a() ? 50 : d;
            f = 350;
            ColorUtility.j = 30000;
            class_27.he = aU.vt;
            class_27.hf = aU.qx;
        } else {
            e = d;
            f = aU.uS;
            ColorUtility.j = 3500;
            class_27.he = aU.qx;
            class_27.hf = g.r;
        }
        int i = Configuration.ai == class_151.a ? class_27.he : class_27.hf;
        if (Client.al > i) {
            Client.al = i;
        }
    }

    public class_46(int[][][] iArr) {
        this.B = iArr;
        b();
    }

    public static void a() {
        Q = null;
        Z = null;
        aa = null;
        ad = null;
        ar = null;
        as = null;
    }

    public void b() {
        for (int i = 0; i < this.y; i++) {
            for (int i2 = 0; i2 < this.z; i2++) {
                for (int i3 = 0; i3 < this.A; i3++) {
                    this.i[i][i2][i3] = null;
                }
            }
        }
        for (int i4 = 0; i4 < Y; i4++) {
            for (int i5 = 0; i5 < Z[i4]; i5++) {
                aa[i4][i5] = null;
            }
            Z[i4] = 0;
        }
        for (int i6 = 0; i6 < this.D; i6++) {
            this.E[i6] = null;
            this.F[i6] = null;
        }
        this.D = 0;
        for (int i7 = 0; i7 < Q.length; i7++) {
            Q[i7] = null;
        }
    }

    public void a(int i) {
        this.C = i;
        for (int i2 = 0; i2 < this.z; i2++) {
            for (int i3 = 0; i3 < this.A; i3++) {
                if (this.i[i][i2][i3] == null) {
                    this.i[i][i2][i3] = new class_32(i, i2, i3);
                }
            }
        }
    }

    public void a(int i, int i2) {
        class_32 class_32Var = this.i[0][i2][i];
        for (int i3 = 0; i3 < 3; i3++) {
            class_32[] class_32VarArr = this.i[i3][i2];
            class_32 class_32Var2 = this.i[i3 + 1][i2][i];
            class_32VarArr[i] = class_32Var2;
            if (class_32Var2 != null) {
                class_32Var2.a--;
                for (int i4 = 0; i4 < class_32Var2.n; i4++) {
                    l lVar = class_32Var2.o[i4];
                    if (((lVar.m >> 29) & 3) == 2 && lVar.f == i2 && lVar.h == i) {
                        lVar.b--;
                    }
                }
            }
        }
        if (this.i[0][i2][i] == null) {
            this.i[0][i2][i] = new class_32(0, i2, i);
        }
        this.i[0][i2][i].A = class_32Var;
        this.i[3][i2][i] = null;
    }

    public class_32[][][] c() {
        return this.i;
    }

    public static void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        class_31 class_31Var = new class_31();
        class_31Var.a = i2 / 128;
        class_31Var.b = i4 / 128;
        class_31Var.c = i7 / 128;
        class_31Var.d = i5 / 128;
        class_31Var.e = i8;
        class_31Var.f = i2;
        class_31Var.g = i4;
        class_31Var.h = i7;
        class_31Var.i = i5;
        class_31Var.j = i6;
        class_31Var.k = i3;
        class_31[] class_31VarArr = aa[i];
        int[] iArr = Z;
        int i9 = iArr[i];
        iArr[i] = i9 + 1;
        class_31VarArr[i9] = class_31Var;
    }

    public void a(int i, int i2, int i3, int i4) {
        if (this.i[i][i2][i3] != null) {
            this.i[i][i2][i3].r = i4;
        }
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        if (i4 == 0) {
            class_34 class_34Var = new class_34(i11, i12, i13, i14, -1, i19, false);
            for (int i21 = i; i21 >= 0; i21--) {
                if (this.i[i21][i2][i3] == null) {
                    this.i[i21][i2][i3] = new class_32(i21, i2, i3);
                }
            }
            this.i[i][i2][i3].h = class_34Var;
            return;
        }
        if (i4 == 1) {
            class_34 class_34Var2 = new class_34(i15, i16, i17, i18, i6, i20, i7 == i8 && i7 == i9 && i7 == i10);
            for (int i22 = i; i22 >= 0; i22--) {
                if (this.i[i22][i2][i3] == null) {
                    this.i[i22][i2][i3] = new class_32(i22, i2, i3);
                }
            }
            this.i[i][i2][i3].h = class_34Var2;
            return;
        }
        class_33 class_33Var = new class_33(i3, i15, i14, i9, i6, i17, i5, i11, i19, i13, i10, i8, i7, i4, i18, i16, i12, i2, i20);
        for (int i23 = i; i23 >= 0; i23--) {
            if (this.i[i23][i2][i3] == null) {
                this.i[i23][i2][i3] = new class_32(i23, i2, i3);
            }
        }
        this.i[i][i2][i3].i = class_33Var;
    }

    public void a(int i, int i2, int i3, class_48 class_48Var, byte b2, int i4, int i5, int i6) {
        if (class_48Var == null) {
            return;
        }
        class_189 class_189Var = new class_189();
        class_189Var.c = class_48Var;
        class_189Var.n = (i5 * 128) + 64;
        class_189Var.o = (i3 * 128) + 64;
        class_189Var.b = i2;
        class_189Var.m = i4;
        class_189Var.d = b2;
        class_189Var.a = i6;
        if (this.i[i][i5][i3] == null) {
            this.i[i][i5][i3] = new class_32(i, i5, i3);
        }
        this.i[i][i5][i3].l = class_189Var;
    }

    public void a(int i, class_48 class_48Var, int i2, int i3, byte b2, int i4, class_48 class_48Var2, int i5, int i6, int i7, int i8) {
        if (class_48Var == null && class_48Var2 == null) {
            return;
        }
        class_45 class_45Var = new class_45();
        class_45Var.m = i2;
        class_45Var.h = b2;
        class_45Var.n = (i4 * 128) + 64;
        class_45Var.o = (i3 * 128) + 64;
        class_45Var.c = i5;
        class_45Var.f = class_48Var;
        class_45Var.g = class_48Var2;
        class_45Var.d = i;
        class_45Var.e = i6;
        class_45Var.b = i8;
        for (int i9 = i7; i9 >= 0; i9--) {
            if (this.i[i9][i4][i3] == null) {
                this.i[i9][i4][i3] = new class_32(i9, i4, i3);
            }
        }
        this.i[i7][i4][i3].j = class_45Var;
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6, class_48 class_48Var, int i7, byte b2, int i8, int i9, int i10) {
        if (class_48Var == null) {
            return;
        }
        class_44 class_44Var = new class_44();
        class_44Var.m = i;
        class_44Var.f = b2;
        class_44Var.n = (i7 * 128) + 64 + i5;
        class_44Var.o = (i2 * 128) + 64 + i8;
        class_44Var.b = i6;
        class_44Var.e = class_48Var;
        class_44Var.c = i9;
        class_44Var.d = i3;
        class_44Var.a = i10;
        for (int i11 = i4; i11 >= 0; i11--) {
            if (this.i[i11][i7][i2] == null) {
                this.i[i11][i7][i2] = new class_32(i11, i7, i2);
            }
        }
        this.i[i4][i7][i2].k = class_44Var;
    }

    public boolean a(int i, byte b2, int i2, int i3, class_48 class_48Var, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (class_48Var == null) {
            return true;
        }
        return a(i5, i8, i7, i4, i3, (i8 * 128) + (64 * i4), (i7 * 128) + (64 * i3), i2, class_48Var, i6, false, i, b2, i9);
    }

    public boolean a(int i, int i2, int i3, int i4, int i5, int i6, int i7, class_48 class_48Var, boolean z) {
        if (class_48Var == null) {
            return true;
        }
        int i8 = i7 - i6;
        int i9 = i5 - i6;
        int i10 = i7 + i6;
        int i11 = i5 + i6;
        if (z) {
            if (i2 > 640 && i2 < 1408) {
                i11 += 128;
            }
            if (i2 > 1152 && i2 < 1920) {
                i10 += 128;
            }
            if (i2 > 1664 || i2 < 384) {
                i9 -= 128;
            }
            if (i2 > 128 && i2 < 896) {
                i8 -= 128;
            }
        }
        int i12 = i8 / 128;
        int i13 = i9 / 128;
        return a(i, i12, i13, ((i10 / 128) - i12) + 1, ((i11 / 128) - i13) + 1, i7, i5, i3, class_48Var, i2, true, i4, (byte) 0, 0);
    }

    public boolean a(int i, int i2, class_48 class_48Var, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        return class_48Var == null || a(i, i7, i10, (i8 - i7) + 1, (i4 - i10) + 1, i5, i2, i6, class_48Var, i3, true, i9, (byte) 0, 0);
    }

    private boolean a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, class_48 class_48Var, int i9, boolean z, int i10, byte b2, int i11) {
        for (int i12 = i2; i12 < i2 + i4; i12++) {
            for (int i13 = i3; i13 < i3 + i5; i13++) {
                if (i12 < 0 || i13 < 0 || i12 >= this.z || i13 >= this.A) {
                    return false;
                }
                class_32 class_32Var = this.i[i][i12][i13];
                if (class_32Var != null && class_32Var.n >= 5) {
                    return false;
                }
            }
        }
        l lVar = null;
        if (z && this.F[this.D] != null) {
            lVar = this.F[this.D];
        }
        if (lVar == null) {
            lVar = new l();
        }
        lVar.m = i10;
        lVar.l = b2;
        lVar.b = i;
        lVar.n = i6;
        lVar.o = i7;
        lVar.c = i8;
        lVar.d = class_48Var;
        lVar.e = i9;
        lVar.f = i2;
        lVar.h = i3;
        lVar.g = (i2 + i4) - 1;
        lVar.i = (i3 + i5) - 1;
        lVar.a = i11;
        for (int i14 = i2; i14 < i2 + i4; i14++) {
            for (int i15 = i3; i15 < i3 + i5; i15++) {
                int i16 = i14 > i2 ? 0 + 1 : 0;
                if (i14 < (i2 + i4) - 1) {
                    i16 += 4;
                }
                if (i15 > i3) {
                    i16 += 8;
                }
                if (i15 < (i3 + i5) - 1) {
                    i16 += 2;
                }
                for (int i17 = i; i17 >= 0; i17--) {
                    if (this.i[i17][i14][i15] == null) {
                        this.i[i17][i14][i15] = new class_32(i17, i14, i15);
                    }
                }
                class_32 class_32Var2 = this.i[i][i14][i15];
                class_32Var2.o[class_32Var2.n] = lVar;
                class_32Var2.p[class_32Var2.n] = i16;
                class_32Var2.q |= i16;
                class_32Var2.n++;
            }
        }
        if (!z) {
            return true;
        }
        l[] lVarArr = this.E;
        int i18 = this.D;
        this.D = i18 + 1;
        lVarArr[i18] = lVar;
        return true;
    }

    public int a(int i, int i2, int i3) {
        class_32 class_32Var = this.i[i][i2][i3];
        if (class_32Var == null || class_32Var.j == null) {
            return 0;
        }
        return class_32Var.j.m;
    }

    public int b(int i, int i2, int i3) {
        class_32 class_32Var = this.i[i][i2][i3];
        if (class_32Var == null || class_32Var.j == null) {
            return 0;
        }
        return class_32Var.j.b;
    }

    public int c(int i, int i2, int i3) {
        class_32 class_32Var = this.i[i][i2][i3];
        if (class_32Var == null || class_32Var.k == null) {
            return 0;
        }
        return class_32Var.k.m;
    }

    public int d(int i, int i2, int i3) {
        class_32 class_32Var = this.i[i][i2][i3];
        if (class_32Var == null || class_32Var.k == null) {
            return 0;
        }
        return class_32Var.k.a;
    }

    public int e(int i, int i2, int i3) {
        class_32 class_32Var = this.i[i][i2][i3];
        if (class_32Var == null) {
            return 0;
        }
        for (int i4 = 0; i4 < class_32Var.n; i4++) {
            l lVar = class_32Var.o[i4];
            if (((lVar.m >> 29) & 3) == 2 && lVar.f == i2 && lVar.h == i3) {
                return lVar.m;
            }
        }
        return 0;
    }

    public int f(int i, int i2, int i3) {
        class_32 class_32Var = this.i[i][i2][i3];
        if (class_32Var == null) {
            return 0;
        }
        for (int i4 = 0; i4 < class_32Var.n; i4++) {
            l lVar = class_32Var.o[i4];
            if (((lVar.m >> 29) & 3) == 2 && lVar.f == i2 && lVar.h == i3) {
                return lVar.a;
            }
        }
        return 0;
    }

    public int g(int i, int i2, int i3) {
        class_32 class_32Var = this.i[i][i2][i3];
        if (class_32Var == null || class_32Var.l == null) {
            return 0;
        }
        return class_32Var.l.m;
    }

    public int h(int i, int i2, int i3) {
        class_32 class_32Var = this.i[i][i2][i3];
        if (class_32Var == null || class_32Var.l == null) {
            return 0;
        }
        return class_32Var.l.a;
    }

    public int b(int i, int i2, int i3, int i4) {
        class_32 class_32Var = this.i[i][i2][i3];
        if (class_32Var == null) {
            return -1;
        }
        if (class_32Var.j != null && class_32Var.j.m == i4) {
            return class_32Var.j.h & 255;
        }
        if (class_32Var.k != null && class_32Var.k.m == i4) {
            return class_32Var.k.f & 255;
        }
        if (class_32Var.l != null && class_32Var.l.m == i4) {
            return class_32Var.l.d & 255;
        }
        for (int i5 = 0; i5 < class_32Var.n; i5++) {
            if (class_32Var.o[i5].m == i4) {
                return class_32Var.o[i5].l & 255;
            }
        }
        return -1;
    }

    public void a(int i, int i2, int i3, class_48 class_48Var, byte b2, int i4, int i5) {
        if (class_48Var == null) {
            return;
        }
        class_189 class_189Var = new class_189();
        class_189Var.c = class_48Var;
        class_189Var.n = (i5 * 128) + 64;
        class_189Var.o = (i3 * 128) + 64;
        class_189Var.b = i2;
        class_189Var.m = i4;
        class_189Var.d = b2;
        if (this.i[i][i5][i3] == null) {
            this.i[i][i5][i3] = new class_32(i, i5, i3);
        }
        this.i[i][i5][i3].l = class_189Var;
    }

    public void a(int i, int i2, class_48 class_48Var, int i3, class_48 class_48Var2, class_48 class_48Var3, int i4, int i5) {
        int i6;
        class_340 class_340Var = new class_340();
        class_340Var.e = class_48Var3;
        class_340Var.c = (i * 128) + 64;
        class_340Var.d = (i5 * 128) + 64;
        class_340Var.b = i3;
        class_340Var.h = i2;
        class_340Var.f = class_48Var;
        class_340Var.g = class_48Var2;
        int i7 = 0;
        class_32 class_32Var = this.i[i4][i][i5];
        if (class_32Var != null) {
            for (int i8 = 0; i8 < class_32Var.n; i8++) {
                if ((class_32Var.o[i8].d instanceof ColorUtility) && (i6 = ((ColorUtility) class_32Var.o[i8].d).aH) > i7) {
                    i7 = i6;
                }
            }
        }
        class_340Var.i = i7;
        if (this.i[i4][i][i5] == null) {
            this.i[i4][i][i5] = new class_32(i4, i, i5);
        }
        this.i[i4][i][i5].m = class_340Var;
    }

    public void a(int i, class_48 class_48Var, int i2, int i3, byte b2, int i4, class_48 class_48Var2, int i5, int i6, int i7) {
        if (class_48Var == null && class_48Var2 == null) {
            return;
        }
        class_45 class_45Var = new class_45();
        class_45Var.m = i2;
        class_45Var.h = b2;
        class_45Var.n = (i4 * 128) + 64;
        class_45Var.o = (i3 * 128) + 64;
        class_45Var.c = i5;
        class_45Var.f = class_48Var;
        class_45Var.g = class_48Var2;
        class_45Var.d = i;
        class_45Var.e = i6;
        for (int i8 = i7; i8 >= 0; i8--) {
            if (this.i[i8][i4][i3] == null) {
                this.i[i8][i4][i3] = new class_32(i8, i4, i3);
            }
        }
        this.i[i7][i4][i3].j = class_45Var;
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6, class_48 class_48Var, int i7, byte b2, int i8, int i9) {
        if (class_48Var == null) {
            return;
        }
        class_44 class_44Var = new class_44();
        class_44Var.m = i;
        class_44Var.f = b2;
        class_44Var.n = (i7 * 128) + 64 + i5;
        class_44Var.o = (i2 * 128) + 64 + i8;
        class_44Var.b = i6;
        class_44Var.e = class_48Var;
        class_44Var.c = i9;
        class_44Var.d = i3;
        for (int i10 = i4; i10 >= 0; i10--) {
            if (this.i[i10][i7][i2] == null) {
                this.i[i10][i7][i2] = new class_32(i10, i7, i2);
            }
        }
        this.i[i4][i7][i2].k = class_44Var;
    }

    public boolean a(int i, byte b2, int i2, int i3, class_48 class_48Var, int i4, int i5, int i6, int i7, int i8) {
        if (class_48Var == null) {
            return true;
        }
        return a(i5, i8, i7, i4, i3, (i8 * 128) + (64 * i4), (i7 * 128) + (64 * i3), i2, class_48Var, i6, false, i, b2);
    }

    private boolean a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, class_48 class_48Var, int i9, boolean z, int i10, byte b2) {
        for (int i11 = i2; i11 < i2 + i4; i11++) {
            for (int i12 = i3; i12 < i3 + i5; i12++) {
                if (i11 < 0 || i12 < 0 || i11 >= this.z || i12 >= this.A) {
                    return false;
                }
                class_32 class_32Var = this.i[i][i11][i12];
                if (class_32Var != null && class_32Var.n >= 5) {
                    return false;
                }
            }
        }
        l lVar = new l();
        lVar.m = i10;
        lVar.l = b2;
        lVar.b = i;
        lVar.n = i6;
        lVar.o = i7;
        lVar.c = i8;
        lVar.d = class_48Var;
        lVar.e = i9;
        lVar.f = i2;
        lVar.h = i3;
        lVar.g = (i2 + i4) - 1;
        lVar.i = (i3 + i5) - 1;
        for (int i13 = i2; i13 < i2 + i4; i13++) {
            for (int i14 = i3; i14 < i3 + i5; i14++) {
                int i15 = i13 > i2 ? 0 + 1 : 0;
                if (i13 < (i2 + i4) - 1) {
                    i15 += 4;
                }
                if (i14 > i3) {
                    i15 += 8;
                }
                if (i14 < (i3 + i5) - 1) {
                    i15 += 2;
                }
                for (int i16 = i; i16 >= 0; i16--) {
                    if (this.i[i16][i13][i14] == null) {
                        this.i[i16][i13][i14] = new class_32(i16, i13, i14);
                    }
                }
                class_32 class_32Var2 = this.i[i][i13][i14];
                class_32Var2.o[class_32Var2.n] = lVar;
                class_32Var2.p[class_32Var2.n] = i15;
                class_32Var2.q |= i15;
                class_32Var2.n++;
            }
        }
        if (!z) {
            return true;
        }
        l[] lVarArr = this.E;
        int i17 = this.D;
        this.D = i17 + 1;
        lVarArr[i17] = lVar;
        return true;
    }

    public void d() {
        for (int i = 0; i < this.D; i++) {
            l lVar = this.E[i];
            a(lVar);
            if (lVar != null) {
                lVar.a = 0;
                lVar.m = 0;
                lVar.d = null;
                this.F[i] = lVar;
            }
            this.E[i] = null;
        }
        this.D = 0;
    }

    private void a(l lVar) {
        for (int i = lVar.f; i <= lVar.g; i++) {
            for (int i2 = lVar.h; i2 <= lVar.i; i2++) {
                class_32 class_32Var = this.i[lVar.b][i][i2];
                if (class_32Var != null) {
                    for (int i3 = 0; i3 < class_32Var.n; i3++) {
                        if (class_32Var.o[i3] == lVar) {
                            class_32Var.n--;
                            for (int i4 = i3; i4 < class_32Var.n; i4++) {
                                class_32Var.o[i4] = class_32Var.o[i4 + 1];
                                class_32Var.p[i4] = class_32Var.p[i4 + 1];
                            }
                            class_32Var.o[class_32Var.n] = null;
                            break;
                        }
                    }
                    class_32Var.q = 0;
                    for (int i5 = 0; i5 < class_32Var.n; i5++) {
                        class_32Var.q |= class_32Var.p[i5];
                    }
                }
            }
        }
    }

    public void c(int i, int i2, int i3, int i4) {
        class_44 class_44Var;
        class_32 class_32Var = this.i[i4][i3][i];
        if (class_32Var == null || (class_44Var = class_32Var.k) == null) {
            return;
        }
        int i5 = (i3 * 128) + 64;
        int i6 = (i * 128) + 64;
        class_44Var.n = i5 + (((class_44Var.n - i5) * i2) / 16);
        class_44Var.o = i6 + (((class_44Var.o - i6) * i2) / 16);
    }

    public void a(int i, int i2, int i3, byte b2) {
        class_32 class_32Var = this.i[i2][i][i3];
        if (b2 != -119) {
            this.x = !this.x;
        }
        if (class_32Var != null) {
            class_32Var.j = null;
        }
    }

    public void i(int i, int i2, int i3) {
        class_32 class_32Var = this.i[i2][i3][i];
        if (class_32Var != null) {
            class_32Var.k = null;
        }
    }

    public void j(int i, int i2, int i3) {
        class_32 class_32Var = this.i[i][i2][i3];
        if (class_32Var == null) {
            return;
        }
        for (int i4 = 0; i4 < class_32Var.n; i4++) {
            l lVar = class_32Var.o[i4];
            if (((lVar.m >> 29) & 3) == 2 && lVar.f == i2 && lVar.h == i3) {
                a(lVar);
                return;
            }
        }
    }

    public void k(int i, int i2, int i3) {
        class_32 class_32Var = this.i[i][i3][i2];
        if (class_32Var == null) {
            return;
        }
        class_32Var.l = null;
    }

    public void l(int i, int i2, int i3) {
        class_32 class_32Var = this.i[i][i2][i3];
        if (class_32Var != null) {
            class_32Var.m = null;
        }
    }

    public class_45 m(int i, int i2, int i3) {
        class_32 class_32Var = this.i[i][i2][i3];
        if (class_32Var == null) {
            return null;
        }
        return class_32Var.j;
    }

    public class_44 n(int i, int i2, int i3) {
        class_32 class_32Var = this.i[i3][i][i2];
        if (class_32Var == null) {
            return null;
        }
        return class_32Var.k;
    }

    public l o(int i, int i2, int i3) {
        class_32 class_32Var = this.i[i3][i][i2];
        if (class_32Var == null) {
            return null;
        }
        for (int i4 = 0; i4 < class_32Var.n; i4++) {
            l lVar = class_32Var.o[i4];
            if (((lVar.m >> 29) & 3) == 2 && lVar.f == i && lVar.h == i2) {
                return lVar;
            }
        }
        return null;
    }

    public class_189 p(int i, int i2, int i3) {
        class_32 class_32Var = this.i[i3][i2][i];
        if (class_32Var == null || class_32Var.l == null) {
            return null;
        }
        return class_32Var.l;
    }

    public void q(int i, int i2, int i3) {
        int iSqrt = (768 * ((int) Math.sqrt(((i2 * i2) + (i * i)) + (i3 * i3)))) >> 8;
        for (int i4 = 0; i4 < this.y; i4++) {
            for (int i5 = 0; i5 < this.z; i5++) {
                for (int i6 = 0; i6 < this.A; i6++) {
                    class_32 class_32Var = this.i[i4][i5][i6];
                    if (class_32Var != null) {
                        class_45 class_45Var = class_32Var.j;
                        if (class_45Var != null && class_45Var.f != null && class_45Var.f.f != null) {
                            a(i4, 1, 1, i5, i6, (ColorUtility) class_45Var.f);
                            if (class_45Var.g != null && class_45Var.g.f != null) {
                                a(i4, 1, 1, i5, i6, (ColorUtility) class_45Var.g);
                                a((ColorUtility) class_45Var.f, (ColorUtility) class_45Var.g, 0, 0, 0, false);
                                ((ColorUtility) class_45Var.g).z = true;
                                ((ColorUtility) class_45Var.g).a(65, iSqrt, i2, i, i3);
                            }
                            ((ColorUtility) class_45Var.f).z = true;
                            ((ColorUtility) class_45Var.f).a(65, iSqrt, i2, i, i3);
                        }
                        for (int i7 = 0; i7 < class_32Var.n; i7++) {
                            l lVar = class_32Var.o[i7];
                            if (lVar != null && lVar.d != null && lVar.d.f != null) {
                                a(i4, (lVar.g - lVar.f) + 1, (lVar.i - lVar.h) + 1, i5, i6, (ColorUtility) lVar.d);
                                ((ColorUtility) lVar.d).z = true;
                                ((ColorUtility) lVar.d).a(65, iSqrt, i2, i, i3);
                            }
                        }
                        class_189 class_189Var = class_32Var.l;
                        if (class_189Var != null && class_189Var.c.f != null) {
                            a(i5, i4, (ColorUtility) class_189Var.c, i6);
                            ((ColorUtility) class_189Var.c).z = true;
                            ((ColorUtility) class_189Var.c).a(65, iSqrt, i2, i, i3);
                        }
                    }
                }
            }
        }
    }

    private void a(int i, int i2, ColorUtility colorUtility, int i3) {
        class_32 class_32Var;
        class_32 class_32Var2;
        class_32 class_32Var3;
        class_32 class_32Var4;
        if (i < this.z && (class_32Var4 = this.i[i2][i + 1][i3]) != null && class_32Var4.l != null && class_32Var4.l.c.f != null) {
            a(colorUtility, (ColorUtility) class_32Var4.l.c, 128, 0, 0, true);
        }
        if (i3 < this.z && (class_32Var3 = this.i[i2][i][i3 + 1]) != null && class_32Var3.l != null && class_32Var3.l.c.f != null) {
            a(colorUtility, (ColorUtility) class_32Var3.l.c, 0, 0, 128, true);
        }
        if (i < this.z && i3 < this.A && (class_32Var2 = this.i[i2][i + 1][i3 + 1]) != null && class_32Var2.l != null && class_32Var2.l.c.f != null) {
            a(colorUtility, (ColorUtility) class_32Var2.l.c, 128, 0, 128, true);
        }
        if (i >= this.z || i3 <= 0 || (class_32Var = this.i[i2][i + 1][i3 - 1]) == null || class_32Var.l == null || class_32Var.l.c.f == null) {
            return;
        }
        a(colorUtility, (ColorUtility) class_32Var.l.c, 128, 0, -128, true);
    }

    private void a(int i, int i2, int i3, int i4, int i5, ColorUtility colorUtility) {
        class_32 class_32Var;
        boolean z = true;
        int i6 = i4;
        int i7 = i4 + i2;
        int i8 = i5 - 1;
        int i9 = i5 + i3;
        for (int i10 = i; i10 <= i + 1; i10++) {
            if (i10 != this.y) {
                for (int i11 = i6; i11 <= i7; i11++) {
                    if (i11 >= 0 && i11 < this.z) {
                        for (int i12 = i8; i12 <= i9; i12++) {
                            if (i12 >= 0 && i12 < this.A && ((!z || i11 >= i7 || i12 >= i9 || (i12 < i5 && i11 != i4)) && (class_32Var = this.i[i10][i11][i12]) != null)) {
                                int i13 = ((((this.B[i10][i11][i12] + this.B[i10][i11 + 1][i12]) + this.B[i10][i11][i12 + 1]) + this.B[i10][i11 + 1][i12 + 1]) / 4) - ((((this.B[i][i4][i5] + this.B[i][i4 + 1][i5]) + this.B[i][i4][i5 + 1]) + this.B[i][i4 + 1][i5 + 1]) / 4);
                                class_45 class_45Var = class_32Var.j;
                                if (class_45Var != null && class_45Var.f != null && class_45Var.f.f != null) {
                                    a(colorUtility, (ColorUtility) class_45Var.f, ((i11 - i4) * 128) + ((1 - i2) * 64), i13, ((i12 - i5) * 128) + ((1 - i3) * 64), z);
                                }
                                if (class_45Var != null && class_45Var.g != null && class_45Var.g.f != null) {
                                    a(colorUtility, (ColorUtility) class_45Var.g, ((i11 - i4) * 128) + ((1 - i2) * 64), i13, ((i12 - i5) * 128) + ((1 - i3) * 64), z);
                                }
                                for (int i14 = 0; i14 < class_32Var.n; i14++) {
                                    l lVar = class_32Var.o[i14];
                                    if (lVar != null && lVar.d != null && lVar.d.f != null) {
                                        a(colorUtility, (ColorUtility) lVar.d, ((lVar.f - i4) * 128) + ((((lVar.g - lVar.f) + 1) - i2) * 64), i13, ((lVar.h - i5) * 128) + ((((lVar.i - lVar.h) + 1) - i3) * 64), z);
                                    }
                                }
                            }
                        }
                    }
                }
                i6--;
                z = false;
            }
        }
    }

    private void a(ColorUtility colorUtility, ColorUtility colorUtility2, int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        int i6;
        this.ao++;
        int i7 = 0;
        int[] iArr = colorUtility2.ae;
        int i8 = colorUtility2.ad;
        class_43 class_43Var = colorUtility.f;
        class_43 class_43Var2 = colorUtility.aO;
        for (int i9 = 0; i9 < colorUtility.ad; i9++) {
            if (class_43Var2.d(i9) != 0 && (i4 = colorUtility.af[i9] - i2) <= colorUtility2.aE && (i5 = colorUtility.ae[i9] - i) >= colorUtility2.az && i5 <= colorUtility2.aA && (i6 = colorUtility.ag[i9] - i3) >= colorUtility2.aC && i6 <= colorUtility2.aB) {
                class_43 class_43Var3 = colorUtility2.f;
                class_43 class_43Var4 = colorUtility2.aO;
                for (int i10 = 0; i10 < i8; i10++) {
                    if (i5 == iArr[i10] && i6 == colorUtility2.ag[i10] && i4 == colorUtility2.af[i10] && class_43Var4.d(i10) != 0) {
                        class_43Var.e(i9, class_43Var4.a(i10));
                        class_43Var.f(i9, class_43Var4.b(i10));
                        class_43Var.g(i9, class_43Var4.c(i10));
                        class_43Var.h(i9, class_43Var4.d(i10));
                        class_43Var3.e(i10, class_43Var2.a(i9));
                        class_43Var3.f(i10, class_43Var2.b(i9));
                        class_43Var3.g(i10, class_43Var2.c(i9));
                        class_43Var3.h(i10, class_43Var2.d(i9));
                        i7++;
                        this.am[i9] = this.ao;
                        this.an[i10] = this.ao;
                    }
                }
            }
        }
        if (i7 < 3 || !z) {
            return;
        }
        for (int i11 = 0; i11 < colorUtility.ah; i11++) {
            if (this.am[colorUtility.ai[i11]] == this.ao && this.am[colorUtility.aj[i11]] == this.ao && this.am[colorUtility.ak[i11]] == this.ao) {
                colorUtility.ao[i11] = -1;
            }
        }
        for (int i12 = 0; i12 < colorUtility2.ah; i12++) {
            if (this.an[colorUtility2.ai[i12]] == this.ao && this.an[colorUtility2.aj[i12]] == this.ao && this.an[colorUtility2.ak[i12]] == this.ao) {
                colorUtility2.ao[i12] = -1;
            }
        }
    }

    public void a(int[] iArr, int i, int i2, int i3, int i4) {
        class_32 class_32Var = this.i[i2][i3][i4];
        if (class_32Var == null) {
            return;
        }
        class_34 class_34Var = class_32Var.h;
        if (class_34Var != null) {
            int i5 = class_34Var.g;
            if (i5 == 0) {
                return;
            }
            for (int i6 = 0; i6 < 4; i6++) {
                iArr[i] = i5;
                iArr[i + 1] = i5;
                iArr[i + 2] = i5;
                iArr[i + 3] = i5;
                i += 512;
            }
            return;
        }
        class_33 class_33Var = class_32Var.i;
        if (class_33Var == null) {
            return;
        }
        int i7 = class_33Var.o;
        int i8 = class_33Var.p;
        int i9 = class_33Var.q;
        int i10 = class_33Var.r;
        int[] iArr2 = this.ap[i7];
        int[] iArr3 = this.aq[i8];
        int i11 = 0;
        if (i9 != 0) {
            for (int i12 = 0; i12 < 4; i12++) {
                int i13 = i11;
                int i14 = i11 + 1;
                iArr[i] = iArr2[iArr3[i13]] != 0 ? i10 : i9;
                int i15 = i14 + 1;
                iArr[i + 1] = iArr2[iArr3[i14]] != 0 ? i10 : i9;
                int i16 = i15 + 1;
                iArr[i + 2] = iArr2[iArr3[i15]] != 0 ? i10 : i9;
                i11 = i16 + 1;
                iArr[i + 3] = iArr2[iArr3[i16]] != 0 ? i10 : i9;
                i += 512;
            }
            return;
        }
        for (int i17 = 0; i17 < 4; i17++) {
            int i18 = i11;
            int i19 = i11 + 1;
            if (iArr2[iArr3[i18]] != 0) {
                iArr[i] = i10;
            }
            int i20 = i19 + 1;
            if (iArr2[iArr3[i19]] != 0) {
                iArr[i + 1] = i10;
            }
            int i21 = i20 + 1;
            if (iArr2[iArr3[i20]] != 0) {
                iArr[i + 2] = i10;
            }
            i11 = i21 + 1;
            if (iArr2[iArr3[i21]] != 0) {
                iArr[i + 3] = i10;
            }
            i += 512;
        }
    }

    public static void d(int i, int i2, int i3, int i4) {
        int[] iArr = new int[9];
        for (int i5 = 0; i5 < 9; i5++) {
            int i6 = 128 + (i5 * 32) + 15;
            iArr[i5] = ((600 + (i6 * 3)) * class_332.v[i6]) >> 16;
        }
        av = 0;
        aw = 0;
        ax = i3;
        ay = i4;
        at = i3 / 2;
        au = i4 / 2;
        boolean[][][][] zArr = new boolean[9][32][(e * 2) + 3][(e * 2) + 3];
        for (int i7 = 128; i7 <= 384; i7 += 32) {
            for (int i8 = 0; i8 < 2048; i8 += 64) {
                m = ColorUtility.bA[i7];
                n = ColorUtility.bB[i7];
                o = ColorUtility.bA[i8];
                p = ColorUtility.bB[i8];
                int i9 = (i7 - 128) / 32;
                int i10 = i8 / 64;
                for (int i11 = -26; i11 <= 26; i11++) {
                    for (int i12 = -26; i12 <= 26; i12++) {
                        int i13 = i11 * 128;
                        int i14 = i12 * 128;
                        boolean z = false;
                        for (int i15 = -i; i15 <= i2; i15 += 128) {
                            if (r(iArr[i9] + i15, i14, i13)) {
                                z = true;
                                break;
                            }
                        }
                        zArr[i9][i10][i11 + e + 1][i12 + e + 1] = z;
                    }
                }
            }
        }
        for (int i16 = 0; i16 < 8; i16++) {
            for (int i17 = 0; i17 < 32; i17++) {
                for (int i18 = (-1) * e; i18 < e; i18++) {
                    for (int i19 = (-1) * e; i19 < e; i19++) {
                        boolean z2 = false;
                        for (int i20 = -1; i20 <= 1; i20++) {
                            for (int i21 = -1; i21 <= 1; i21++) {
                                if (zArr[i16][i17][i18 + i20 + e + 1][i19 + i21 + e + 1]) {
                                    z2 = true;
                                    break;
                                }
                                if (zArr[i16][(i17 + 1) % 31][i18 + i20 + e + 1][i19 + i21 + e + 1]) {
                                    z2 = true;
                                    break;
                                } else if (zArr[i16 + 1][i17][i18 + i20 + e + 1][i19 + i21 + e + 1]) {
                                    z2 = true;
                                    break;
                                } else {
                                    if (zArr[i16 + 1][(i17 + 1) % 31][i18 + i20 + e + 1][i19 + i21 + e + 1]) {
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (i18 + e < 51 && i19 + e < 51) {
                            ar[i16][i17][i18 + e][i19 + e] = z2;
                        }
                    }
                }
            }
        }
    }

    private static boolean r(int i, int i2, int i3) {
        int i4 = ((i2 * o) + (i3 * p)) >> 16;
        int i5 = ((i2 * p) - (i3 * o)) >> 16;
        int i6 = ((i * m) + (i5 * n)) >> 16;
        int i7 = ((i * n) - (i5 * m)) >> 16;
        if (i6 < 50 || i6 > 3500) {
            return false;
        }
        int i8 = at + ((i4 << 9) / i6);
        int i9 = au + ((i7 << 9) / i6);
        return i8 >= av && i8 <= ax && i9 >= aw && i9 <= ay;
    }

    public void b(int i, int i2) {
        q = false;
        V = true;
        W = i2;
        X = i;
        r = -1;
        s = -1;
    }

    public void a(int i, int i2, int i3, int i4, int i5, int i6) {
        class_32 class_32Var;
        class_32 class_32Var2;
        class_32 class_32Var3;
        class_32 class_32Var4;
        class_32 class_32Var5;
        class_32 class_32Var6;
        class_32 class_32Var7;
        class_32 class_32Var8;
        boolean z = Configuration.aO;
        int i7 = z ? 40 : d;
        if (e.a()) {
            Launcher.n().o().a.a(i, i2, i3, i4, i5, i6);
        }
        boolean z2 = Client.dj;
        int i8 = this.z;
        int i9 = this.y;
        int i10 = this.A;
        int i11 = this.C;
        class_32[][][] class_32VarArr = this.i;
        if (i < 0) {
            i = 0;
        } else if (i >= i8 * 128) {
            i = (i8 * 128) - 1;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= i10 * 128) {
            i2 = (i10 * 128) - 1;
        }
        if (i6 < 128) {
            i6 = 128;
        } else if (i6 > 383) {
            i6 = 383;
        }
        J++;
        m = ColorUtility.bA[i6];
        n = ColorUtility.bB[i6];
        o = ColorUtility.bA[i3];
        p = ColorUtility.bB[i3];
        as = ar[(i6 - 128) / 32][i3 / 64];
        j = i;
        k = i4;
        l = i2;
        O = i / 128;
        P = i2 / 128;
        I = i5;
        K = O - i7;
        if (K < 0) {
            K = 0;
        }
        M = P - i7;
        if (M < 0) {
            M = 0;
        }
        L = O + i7;
        if (L > i8) {
            L = i8;
        }
        N = P + i7;
        if (N > i10) {
            N = i10;
        }
        e();
        H = 0;
        for (int i12 = i11; i12 < i9; i12++) {
            class_32[][] class_32VarArr2 = this.i[i12];
            for (int i13 = K; i13 < L; i13++) {
                for (int i14 = M; i14 < N; i14++) {
                    class_32 class_32Var9 = class_32VarArr2[i13][i14];
                    if (class_32Var9 != null) {
                        if (class_32Var9.r > i5 || !(z || as[(i13 - O) + e][(i14 - P) + e] || this.B[i12][i13][i14] - i4 >= 2000)) {
                            class_32Var9.s = false;
                            class_32Var9.u = false;
                            class_32Var9.w = 0;
                        } else {
                            class_32Var9.s = true;
                            class_32Var9.u = true;
                            class_32Var9.v = class_32Var9.n > 0;
                            H++;
                        }
                    }
                }
            }
        }
        Client.ab.d.clear();
        Client.ab.c.clear();
        for (int i15 = i11; i15 < i9; i15++) {
            class_32[][] class_32VarArr3 = this.i[i15];
            for (int i16 = -i7; i16 <= 0; i16++) {
                int i17 = O + i16;
                int i18 = O - i16;
                if (i17 >= K || i18 < L) {
                    for (int i19 = -i7; i19 <= 0; i19++) {
                        int i20 = P + i19;
                        int i21 = P - i19;
                        if (i17 >= K) {
                            if (i20 >= M && (class_32Var8 = class_32VarArr3[i17][i20]) != null && class_32Var8.s) {
                                b(class_32Var8, true);
                            }
                            if (i21 < N && (class_32Var7 = class_32VarArr3[i17][i21]) != null && class_32Var7.s) {
                                b(class_32Var7, true);
                            }
                        }
                        if (i18 < L) {
                            if (i20 >= M && (class_32Var6 = class_32VarArr3[i18][i20]) != null && class_32Var6.s) {
                                b(class_32Var6, true);
                            }
                            if (i21 < N && (class_32Var5 = class_32VarArr3[i18][i21]) != null && class_32Var5.s) {
                                b(class_32Var5, true);
                            }
                        }
                        if (H == 0) {
                            if (e.a()) {
                                Launcher.n().o().a.f();
                            }
                            V = false;
                            return;
                        }
                    }
                }
            }
        }
        if (!z2) {
            u = -1;
            t = -1;
        }
        for (int i22 = i11; i22 < i9; i22++) {
            class_32[][] class_32VarArr4 = this.i[i22];
            for (int i23 = -i7; i23 <= 0; i23++) {
                int i24 = O + i23;
                int i25 = O - i23;
                if (i24 >= K || i25 < L) {
                    for (int i26 = -i7; i26 <= 0; i26++) {
                        int i27 = P + i26;
                        int i28 = P - i26;
                        if (i24 >= K) {
                            if (i27 >= M && (class_32Var4 = class_32VarArr4[i24][i27]) != null && class_32Var4.s) {
                                a(class_32Var4, false);
                            }
                            if (i28 < N && (class_32Var3 = class_32VarArr4[i24][i28]) != null && class_32Var3.s) {
                                a(class_32Var3, false);
                            }
                        }
                        if (i25 < L) {
                            if (i27 >= M && (class_32Var2 = class_32VarArr4[i25][i27]) != null && class_32Var2.s) {
                                a(class_32Var2, false);
                            }
                            if (i28 < N && (class_32Var = class_32VarArr4[i25][i28]) != null && class_32Var.s) {
                                a(class_32Var, false);
                            }
                        }
                        if (H == 0) {
                            V = false;
                            if (e.a()) {
                                Launcher.n().o().a.f();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        V = false;
        if (e.a()) {
            Launcher.n().o().a.f();
        }
    }

    private void a(class_32 class_32Var, boolean z) {
        b(class_32Var, z);
    }

    private void b(class_32 class_32Var, boolean z) {
        class_32 class_32Var2;
        class_32 class_32Var3;
        class_32 class_32Var4;
        class_32 class_32Var5;
        class_32 class_32Var6;
        class_32 class_32Var7;
        class_32 class_32Var8;
        class_32 class_32Var9;
        class_32 class_32Var10;
        class_32 class_32Var11;
        class_32 class_32Var12;
        class_32 class_32Var13;
        class_32 class_32Var14;
        class_32 class_32Var15;
        class_32 class_32Var16;
        class_32 class_32Var17;
        class_32 class_32Var18;
        class_32 class_32Var19;
        ad.a(class_32Var);
        while (true) {
            class_32 class_32Var20 = (class_32) ad.a();
            if (class_32Var20 == null) {
                return;
            }
            if (class_32Var20.u) {
                int i = class_32Var20.b;
                int i2 = class_32Var20.f;
                int i3 = class_32Var20.a;
                int i4 = class_32Var20.g;
                class_32[][] class_32VarArr = this.i[i3];
                if (class_32Var20.s) {
                    if (!z) {
                        z = true;
                    } else if (i3 <= 0 || (class_32Var19 = this.i[i3 - 1][i][i2]) == null || !class_32Var19.u) {
                        if (i > O || i <= K || (class_32Var18 = class_32VarArr[i - 1][i2]) == null || !class_32Var18.u || (!class_32Var18.s && (class_32Var20.q & 1) != 0)) {
                            if (i < O || i >= L - 1 || (class_32Var17 = class_32VarArr[i + 1][i2]) == null || !class_32Var17.u || (!class_32Var17.s && (class_32Var20.q & 4) != 0)) {
                                if (i2 > P || i2 <= M || (class_32Var16 = class_32VarArr[i][i2 - 1]) == null || !class_32Var16.u || (!class_32Var16.s && (class_32Var20.q & 8) != 0)) {
                                    if (i2 < P || i2 >= N - 1 || (class_32Var15 = class_32VarArr[i][i2 + 1]) == null || !class_32Var15.u || (!class_32Var15.s && (class_32Var20.q & 2) != 0)) {
                                    }
                                }
                            }
                        }
                    }
                    class_32Var20.s = false;
                    if (class_32Var20.A != null) {
                        class_32 class_32Var21 = class_32Var20.A;
                        if (class_32Var21.h != null) {
                            if (!s(0, i, i2)) {
                                a(class_32Var21.h, 0, m, n, o, p, i, i2);
                            }
                        } else if (class_32Var21.i != null && !s(0, i, i2)) {
                            a(i, m, o, class_32Var21.i, n, i2, p);
                        }
                        class_45 class_45Var = class_32Var21.j;
                        if (class_45Var != null) {
                            class_45Var.f.a(0, m, n, o, p, class_45Var.n - j, class_45Var.c - k, class_45Var.o - l, class_45Var.m, class_45Var.b);
                        }
                        for (int i5 = 0; i5 < class_32Var21.n; i5++) {
                            l lVar = class_32Var21.o[i5];
                            if (lVar != null) {
                                lVar.d.a(lVar.e, m, n, o, p, lVar.n - j, lVar.c - k, lVar.o - l, lVar.m, lVar.a);
                            }
                        }
                    }
                    boolean z2 = false;
                    if (class_32Var20.h != null) {
                        if (!s(i4, i, i2)) {
                            z2 = true;
                            a(class_32Var20.h, i4, m, n, o, p, i, i2);
                        }
                    } else if (class_32Var20.i != null && !s(i4, i, i2)) {
                        z2 = true;
                        a(i, m, o, class_32Var20.i, n, i2, p);
                    }
                    int i6 = 0;
                    int i7 = 0;
                    class_45 class_45Var2 = class_32Var20.j;
                    class_44 class_44Var = class_32Var20.k;
                    if (class_45Var2 != null || class_44Var != null) {
                        if (O == i) {
                            i6 = 0 + 1;
                        } else if (O < i) {
                            i6 = 0 + 2;
                        }
                        if (P == i2) {
                            i6 += 3;
                        } else if (P > i2) {
                            i6 += 6;
                        }
                        i7 = ae[i6];
                        class_32Var20.z = ag[i6];
                    }
                    if (class_45Var2 != null) {
                        if ((class_45Var2.d & af[i6]) == 0) {
                            class_32Var20.w = 0;
                        } else if (class_45Var2.d == 16) {
                            class_32Var20.w = 3;
                            class_32Var20.x = ah[i6];
                            class_32Var20.y = 3 - class_32Var20.x;
                        } else if (class_45Var2.d == 32) {
                            class_32Var20.w = 6;
                            class_32Var20.x = ai[i6];
                            class_32Var20.y = 6 - class_32Var20.x;
                        } else if (class_45Var2.d == 64) {
                            class_32Var20.w = 12;
                            class_32Var20.x = aj[i6];
                            class_32Var20.y = 12 - class_32Var20.x;
                        } else {
                            class_32Var20.w = 9;
                            class_32Var20.x = ak[i6];
                            class_32Var20.y = 9 - class_32Var20.x;
                        }
                        if ((class_45Var2.d & i7) != 0 && !e(i4, i, i2, class_45Var2.d)) {
                            class_45Var2.f.a(0, m, n, o, p, class_45Var2.n - j, class_45Var2.c - k, class_45Var2.o - l, class_45Var2.m, class_45Var2.b);
                        }
                        if ((class_45Var2.e & i7) != 0 && !e(i4, i, i2, class_45Var2.e)) {
                            class_45Var2.g.a(0, m, n, o, p, class_45Var2.n - j, class_45Var2.c - k, class_45Var2.o - l, class_45Var2.m, class_45Var2.b);
                        }
                    }
                    if (class_44Var != null && !f(i4, i, i2, class_44Var.e.g)) {
                        if ((class_44Var.c & i7) != 0) {
                            class_44Var.e.a(class_44Var.d, m, n, o, p, class_44Var.n - j, class_44Var.b - k, class_44Var.o - l, class_44Var.m, class_44Var.a);
                        } else if ((class_44Var.c & 768) != 0) {
                            int i8 = class_44Var.n - j;
                            int i9 = class_44Var.b - k;
                            int i10 = class_44Var.o - l;
                            int i11 = class_44Var.d;
                            int i12 = (i11 == 1 || i11 == 2) ? -i8 : i8;
                            int i13 = (i11 == 2 || i11 == 3) ? -i10 : i10;
                            if ((class_44Var.c & 256) != 0 && i13 < i12) {
                                class_44Var.e.a((i11 * 512) + 256, m, n, o, p, i8 + R[i11], i9, i10 + S[i11], class_44Var.m, class_44Var.a);
                            }
                            if ((class_44Var.c & 512) != 0 && i13 > i12) {
                                class_44Var.e.a(((i11 * 512) + 1280) & Client.dn, m, n, o, p, i8 + T[i11], i9, i10 + U[i11], class_44Var.m, class_44Var.a);
                            }
                        }
                    }
                    if (z2) {
                        class_189 class_189Var = class_32Var20.l;
                        if (class_189Var != null) {
                            class_189Var.c.a(0, m, n, o, p, class_189Var.n - j, class_189Var.b - k, class_189Var.o - l, class_189Var.m, class_189Var.a);
                        }
                        class_340 class_340Var = class_32Var20.m;
                        if (class_340Var != null && class_340Var.i == 0) {
                            if (class_340Var.f != null) {
                                class_340Var.f.a(0, m, n, o, p, class_340Var.c - j, class_340Var.b - k, class_340Var.d - l, class_340Var.h, class_340Var.a);
                            }
                            if (class_340Var.g != null) {
                                class_340Var.g.a(0, m, n, o, p, class_340Var.c - j, class_340Var.b - k, class_340Var.d - l, class_340Var.h, class_340Var.a);
                            }
                            if (class_340Var.e != null) {
                                class_340Var.e.a(0, m, n, o, p, class_340Var.c - j, class_340Var.b - k, class_340Var.d - l, class_340Var.h, class_340Var.a);
                            }
                        }
                    }
                    int i14 = class_32Var20.q;
                    if (i14 != 0) {
                        if (i < O && (i14 & 4) != 0 && (class_32Var14 = class_32VarArr[i + 1][i2]) != null && class_32Var14.u) {
                            ad.a(class_32Var14);
                        }
                        if (i2 < P && (i14 & 2) != 0 && (class_32Var13 = class_32VarArr[i][i2 + 1]) != null && class_32Var13.u) {
                            ad.a(class_32Var13);
                        }
                        if (i > O && (i14 & 1) != 0 && (class_32Var12 = class_32VarArr[i - 1][i2]) != null && class_32Var12.u) {
                            ad.a(class_32Var12);
                        }
                        if (i2 > P && (i14 & 8) != 0 && (class_32Var11 = class_32VarArr[i][i2 - 1]) != null && class_32Var11.u) {
                            ad.a(class_32Var11);
                        }
                    }
                }
                if (class_32Var20.w != 0) {
                    boolean z3 = true;
                    for (int i15 = 0; i15 < class_32Var20.n; i15++) {
                        if (class_32Var20.o[i15].k != J && (class_32Var20.p[i15] & class_32Var20.w) == class_32Var20.x) {
                            z3 = false;
                            break;
                        }
                    }
                    if (z3) {
                        class_45 class_45Var3 = class_32Var20.j;
                        if (!e(i4, i, i2, class_45Var3.d)) {
                            class_45Var3.f.a(0, m, n, o, p, class_45Var3.n - j, class_45Var3.c - k, class_45Var3.o - l, class_45Var3.m, class_45Var3.b);
                        }
                        class_32Var20.w = 0;
                    }
                }
                if (class_32Var20.v) {
                    try {
                        int i16 = class_32Var20.n;
                        class_32Var20.v = false;
                        int i17 = 0;
                        for (int i18 = 0; i18 < i16; i18++) {
                            l lVar2 = class_32Var20.o[i18];
                            if (lVar2.k != J) {
                                int i19 = lVar2.f;
                                while (true) {
                                    if (i19 > lVar2.g) {
                                        int i20 = i17;
                                        i17++;
                                        Q[i20] = lVar2;
                                        int i21 = O - lVar2.f;
                                        int i22 = lVar2.g - O;
                                        if (i22 > i21) {
                                            i21 = i22;
                                        }
                                        int i23 = P - lVar2.h;
                                        int i24 = lVar2.i - P;
                                        if (i24 > i23) {
                                            lVar2.j = i21 + i24;
                                            break;
                                        } else {
                                            lVar2.j = i21 + i23;
                                            break;
                                        }
                                    }
                                    for (int i25 = lVar2.h; i25 <= lVar2.i; i25++) {
                                        class_32 class_32Var22 = class_32VarArr[i19][i25];
                                        if (class_32Var22.s) {
                                            class_32Var20.v = true;
                                            break;
                                        }
                                        if (class_32Var22.w != 0) {
                                            int i26 = i19 > lVar2.f ? 0 + 1 : 0;
                                            if (i19 < lVar2.g) {
                                                i26 += 4;
                                            }
                                            if (i25 > lVar2.h) {
                                                i26 += 8;
                                            }
                                            if (i25 < lVar2.i) {
                                                i26 += 2;
                                            }
                                            if ((i26 & class_32Var22.w) == class_32Var20.y) {
                                                class_32Var20.v = true;
                                                break;
                                            }
                                        }
                                    }
                                    i19++;
                                }
                            }
                        }
                        while (true) {
                            int i27 = -50;
                            int i28 = -1;
                            for (int i29 = 0; i29 < i17; i29++) {
                                l lVar3 = Q[i29];
                                if (lVar3.k != J) {
                                    if (lVar3.j > i27) {
                                        i27 = lVar3.j;
                                        i28 = i29;
                                    } else if (lVar3.j == i27) {
                                        int i30 = lVar3.n - j;
                                        int i31 = lVar3.o - l;
                                        int i32 = Q[i28].n - j;
                                        int i33 = Q[i28].o - l;
                                        if ((i30 * i30) + (i31 * i31) > (i32 * i32) + (i33 * i33)) {
                                            i28 = i29;
                                        }
                                    }
                                }
                            }
                            if (i28 == -1) {
                                break;
                            }
                            l lVar4 = Q[i28];
                            lVar4.k = J;
                            if (!b(i4, lVar4.f, lVar4.g, lVar4.h, lVar4.i, lVar4.d.g) && !class_32Var20.t) {
                                lVar4.d.a(lVar4.e, m, n, o, p, lVar4.n - j, lVar4.c - k, lVar4.o - l, lVar4.m, lVar4.a);
                            }
                            for (int i34 = lVar4.f; i34 <= lVar4.g; i34++) {
                                for (int i35 = lVar4.h; i35 <= lVar4.i; i35++) {
                                    class_32 class_32Var23 = class_32VarArr[i34][i35];
                                    if (class_32Var23.w != 0) {
                                        ad.a(class_32Var23);
                                    } else if ((i34 != i || i35 != i2) && class_32Var23.u) {
                                        ad.a(class_32Var23);
                                    }
                                }
                            }
                        }
                        if (class_32Var20.v) {
                        }
                    } catch (Exception e2) {
                        class_32Var20.v = false;
                    }
                }
                if (class_32Var20.u && class_32Var20.w == 0 && (i > O || i <= K || (class_32Var10 = class_32VarArr[i - 1][i2]) == null || !class_32Var10.u)) {
                    if (i < O || i >= L - 1 || (class_32Var9 = class_32VarArr[i + 1][i2]) == null || !class_32Var9.u) {
                        if (i2 > P || i2 <= M || (class_32Var8 = class_32VarArr[i][i2 - 1]) == null || !class_32Var8.u) {
                            if (i2 < P || i2 >= N - 1 || (class_32Var7 = class_32VarArr[i][i2 + 1]) == null || !class_32Var7.u) {
                                class_32Var20.u = false;
                                H--;
                                class_340 class_340Var2 = class_32Var20.m;
                                if (class_340Var2 != null && class_340Var2.i != 0) {
                                    if (class_340Var2.f != null) {
                                        class_340Var2.f.a(0, m, n, o, p, class_340Var2.c - j, (class_340Var2.b - k) - class_340Var2.i, class_340Var2.d - l, class_340Var2.h, class_340Var2.a);
                                    }
                                    if (class_340Var2.g != null) {
                                        class_340Var2.g.a(0, m, n, o, p, class_340Var2.c - j, (class_340Var2.b - k) - class_340Var2.i, class_340Var2.d - l, class_340Var2.h, class_340Var2.a);
                                    }
                                    if (class_340Var2.e != null) {
                                        class_340Var2.e.a(0, m, n, o, p, class_340Var2.c - j, (class_340Var2.b - k) - class_340Var2.i, class_340Var2.d - l, class_340Var2.h, class_340Var2.a);
                                    }
                                }
                                if (class_32Var20.z != 0) {
                                    class_44 class_44Var2 = class_32Var20.k;
                                    if (class_44Var2 != null && !f(i4, i, i2, class_44Var2.e.g)) {
                                        if ((class_44Var2.c & class_32Var20.z) != 0) {
                                            class_44Var2.e.a(class_44Var2.d, m, n, o, p, class_44Var2.n - j, class_44Var2.b - k, class_44Var2.o - l, class_44Var2.m, class_44Var2.a);
                                        } else if ((class_44Var2.c & 768) != 0) {
                                            int i36 = class_44Var2.n - j;
                                            int i37 = class_44Var2.b - k;
                                            int i38 = class_44Var2.o - l;
                                            int i39 = class_44Var2.d;
                                            int i40 = (i39 == 1 || i39 == 2) ? -i36 : i36;
                                            int i41 = (i39 == 2 || i39 == 3) ? -i38 : i38;
                                            if ((class_44Var2.c & 256) != 0 && i41 >= i40) {
                                                class_44Var2.e.a((i39 * 512) + 256, m, n, o, p, i36 + R[i39], i37, i38 + S[i39], class_44Var2.m, class_44Var2.a);
                                            }
                                            if ((class_44Var2.c & 512) != 0 && i41 <= i40) {
                                                class_44Var2.e.a(((i39 * 512) + 1280) & Client.dn, m, n, o, p, i36 + T[i39], i37, i38 + U[i39], class_44Var2.m, class_44Var2.a);
                                            }
                                        }
                                    }
                                    class_45 class_45Var4 = class_32Var20.j;
                                    if (class_45Var4 != null) {
                                        if ((class_45Var4.e & class_32Var20.z) != 0 && !e(i4, i, i2, class_45Var4.e)) {
                                            class_45Var4.g.a(0, m, n, o, p, class_45Var4.n - j, class_45Var4.c - k, class_45Var4.o - l, class_45Var4.m, class_45Var4.b);
                                        }
                                        if ((class_45Var4.d & class_32Var20.z) != 0 && !e(i4, i, i2, class_45Var4.d)) {
                                            class_45Var4.f.a(0, m, n, o, p, class_45Var4.n - j, class_45Var4.c - k, class_45Var4.o - l, class_45Var4.m, class_45Var4.b);
                                        }
                                    }
                                }
                                if (i3 < this.y - 1 && (class_32Var6 = this.i[i3 + 1][i][i2]) != null && class_32Var6.u) {
                                    ad.a(class_32Var6);
                                }
                                if (i < O && (class_32Var5 = class_32VarArr[i + 1][i2]) != null && class_32Var5.u) {
                                    ad.a(class_32Var5);
                                }
                                if (i2 < P && (class_32Var4 = class_32VarArr[i][i2 + 1]) != null && class_32Var4.u) {
                                    ad.a(class_32Var4);
                                }
                                if (i > O && (class_32Var3 = class_32VarArr[i - 1][i2]) != null && class_32Var3.u) {
                                    ad.a(class_32Var3);
                                }
                                if (i2 > P && (class_32Var2 = class_32VarArr[i][i2 - 1]) != null && class_32Var2.u) {
                                    ad.a(class_32Var2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void a(class_34 class_34Var, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i;
        if ((Launcher.n().o().gc[1][i6][i7] & 2) != 0) {
            i8 = i - 1;
        }
        if (e.a()) {
            Launcher.n().o().a.a(0, i2, i3, i4, i5, -j, -k, -l, class_34Var, i, i6, i7, Launcher.n().o().aK(), at, au);
        }
        int i9 = (i6 << 7) - j;
        int i10 = (i7 << 7) - l;
        int i11 = i9 + 128;
        int i12 = i10 + 128;
        int i13 = this.B[i][i6][i7] - k;
        int i14 = this.B[i][i6 + 1][i7] - k;
        int i15 = this.B[i][i6 + 1][i7 + 1] - k;
        int i16 = this.B[i][i6][i7 + 1] - k;
        int i17 = ((i10 * i4) + (i9 * i5)) >> 16;
        int i18 = ((i10 * i5) - (i9 * i4)) >> 16;
        int i19 = ((i13 * i3) - (i18 * i2)) >> 16;
        int i20 = ((i13 * i2) + (i18 * i3)) >> 16;
        if (i20 < 50) {
            return;
        }
        int i21 = ((i10 * i4) + (i11 * i5)) >> 16;
        int i22 = ((i10 * i5) - (i11 * i4)) >> 16;
        int i23 = ((i14 * i3) - (i22 * i2)) >> 16;
        int i24 = ((i14 * i2) + (i22 * i3)) >> 16;
        if (i24 < 50) {
            return;
        }
        int i25 = ((i12 * i4) + (i11 * i5)) >> 16;
        int i26 = ((i12 * i5) - (i11 * i4)) >> 16;
        int i27 = ((i15 * i3) - (i26 * i2)) >> 16;
        int i28 = ((i15 * i2) + (i26 * i3)) >> 16;
        if (i28 < 50) {
            return;
        }
        int i29 = ((i12 * i4) + (i9 * i5)) >> 16;
        int i30 = ((i12 * i5) - (i9 * i4)) >> 16;
        int i31 = ((i16 * i3) - (i30 * i2)) >> 16;
        int i32 = ((i16 * i2) + (i30 * i3)) >> 16;
        if (i32 < 50) {
            return;
        }
        int i33 = class_332.s + ((i17 << 9) / i20);
        int i34 = class_332.t + ((i19 << 9) / i20);
        int i35 = class_332.s + ((i21 << 9) / i24);
        int i36 = class_332.t + ((i23 << 9) / i24);
        int i37 = class_332.s + ((i25 << 9) / i28);
        int i38 = class_332.t + ((i27 << 9) / i28);
        int i39 = class_332.s + ((i29 << 9) / i32);
        int i40 = class_332.t + ((i31 << 9) / i32);
        class_332.r = 0;
        boolean z = class_107.a != class_108.c || Client.dw == i8;
        if (((i37 - i39) * (i36 - i40)) - ((i38 - i40) * (i35 - i39)) > 0) {
            class_332.o = i37 < 0 || i39 < 0 || i35 < 0 || i37 > class_210.n || i39 > class_210.n || i35 > class_210.n;
            if (z && V && b(W, X, i38, i40, i36, i37, i39, i35)) {
                r = i6;
                s = i7;
            }
            if (b(Client.hP + (Client.ag() ? 0 : -4), Client.hQ + (Client.ag() ? 0 : -4), i38, i40, i36, i37, i39, i35) && i8 == Client.dw) {
                t = i6;
                u = i7;
            }
            if (class_34Var.e == -1) {
                if (class_34Var.c != 12345678) {
                    if (Configuration.av) {
                        class_332.a(i38, i40, i36, i37, i39, i35, class_34Var.c, class_34Var.d, class_34Var.b, i28, i32, i24);
                    } else {
                        class_332.a(i38, i40, i36, i37, i39, i35, class_34Var.c, class_34Var.d, class_34Var.b);
                    }
                }
            } else if (h) {
                int i41 = al[class_34Var.e];
                if (Configuration.av) {
                    class_332.a(i38, i40, i36, i37, i39, i35, c(i41, class_34Var.c), c(i41, class_34Var.d), c(i41, class_34Var.b), i28, i32, i24);
                } else {
                    class_332.a(i38, i40, i36, i37, i39, i35, c(i41, class_34Var.c), c(i41, class_34Var.d), c(i41, class_34Var.b));
                }
            } else if (class_34Var.f) {
                if (Configuration.av) {
                    class_332.a(i38, i40, i36, i37, i39, i35, class_34Var.c, class_34Var.d, class_34Var.b, i17, i21, i29, i19, i23, i31, i20, i24, i32, class_34Var.e, i28, i32, i24);
                } else {
                    class_332.a(i38, i40, i36, i37, i39, i35, class_34Var.c, class_34Var.d, class_34Var.b, i17, i21, i29, i19, i23, i31, i20, i24, i32, class_34Var.e);
                }
            } else if (Configuration.av) {
                class_332.a(i38, i40, i36, i37, i39, i35, class_34Var.c, class_34Var.d, class_34Var.b, i25, i29, i21, i27, i31, i23, i28, i32, i24, class_34Var.e, i28, i32, i24);
            } else {
                class_332.a(i38, i40, i36, i37, i39, i35, class_34Var.c, class_34Var.d, class_34Var.b, i25, i29, i21, i27, i31, i23, i28, i32, i24, class_34Var.e);
            }
        }
        if (((i33 - i35) * (i40 - i36)) - ((i34 - i36) * (i39 - i35)) > 0) {
            class_332.o = i33 < 0 || i35 < 0 || i39 < 0 || i33 > class_210.n || i35 > class_210.n || i39 > class_210.n;
            if (z && V && b(W, X, i34, i36, i40, i33, i35, i39)) {
                r = i6;
                s = i7;
            }
            if (b(Client.hP + (Client.ag() ? 0 : -4), Client.hQ + (Client.ag() ? 0 : -4), i34, i36, i40, i33, i35, i39) && i8 == Client.dw) {
                t = i6;
                u = i7;
            }
            if (class_34Var.e == -1) {
                if (class_34Var.a != 12345678) {
                    if (Configuration.av) {
                        class_332.a(i34, i36, i40, i33, i35, i39, class_34Var.a, class_34Var.b, class_34Var.d, i20, i24, i32);
                        return;
                    } else {
                        class_332.a(i34, i36, i40, i33, i35, i39, class_34Var.a, class_34Var.b, class_34Var.d);
                        return;
                    }
                }
                return;
            }
            if (!h) {
                if (Configuration.av) {
                    class_332.a(i34, i36, i40, i33, i35, i39, class_34Var.a, class_34Var.b, class_34Var.d, i17, i21, i29, i19, i23, i31, i20, i24, i32, class_34Var.e, i20, i24, i32);
                    return;
                } else {
                    class_332.a(i34, i36, i40, i33, i35, i39, class_34Var.a, class_34Var.b, class_34Var.d, i17, i21, i29, i19, i23, i31, i20, i24, i32, class_34Var.e);
                    return;
                }
            }
            int i42 = al[class_34Var.e];
            if (Configuration.av) {
                class_332.a(i34, i36, i40, i33, i35, i39, c(i42, class_34Var.a), c(i42, class_34Var.b), c(i42, class_34Var.d), i20, i24, i32);
            } else {
                class_332.a(i34, i36, i40, i33, i35, i39, c(i42, class_34Var.a), c(i42, class_34Var.b), c(i42, class_34Var.d));
            }
        }
    }

    private void a(int i, int i2, int i3, class_33 class_33Var, int i4, int i5, int i6) {
        if (e.a()) {
            int i7 = j;
            int i8 = k;
            int i9 = l;
            int iAK = Launcher.n().o().aK();
            int iAj = Launcher.n().o().aj();
            int iAk = Launcher.n().o().ak();
            Launcher.n().o();
            Launcher.n().o().a.a(0, i2, i4, i3, i6, -i7, -i8, -i9, class_33Var, Client.dw, i, i5, iAK, iAj, iAk);
        }
        int length = class_33Var.d.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = class_33Var.d[i10] - j;
            int i12 = class_33Var.e[i10] - k;
            int i13 = class_33Var.f[i10] - l;
            int i14 = ((i13 * i3) + (i11 * i6)) >> 16;
            int i15 = ((i13 * i6) - (i11 * i3)) >> 16;
            int i16 = ((i12 * i4) - (i15 * i2)) >> 16;
            int i17 = ((i12 * i2) + (i15 * i4)) >> 16;
            if (i17 < 50) {
                return;
            }
            if (class_33Var.m != null) {
                class_33.u[i10] = i14;
                class_33.v[i10] = i16;
                class_33.w[i10] = i17;
            }
            class_33.s[i10] = class_332.s + ((i14 << 9) / i17);
            class_33.t[i10] = class_332.t + ((i16 << 9) / i17);
            class_33.x[i10] = i17;
        }
        class_332.r = 0;
        int length2 = class_33Var.j.length;
        for (int i18 = 0; i18 < length2; i18++) {
            int i19 = class_33Var.j[i18];
            int i20 = class_33Var.k[i18];
            int i21 = class_33Var.l[i18];
            int i22 = class_33.s[i19];
            int i23 = class_33.s[i20];
            int i24 = class_33.s[i21];
            int i25 = class_33.t[i19];
            int i26 = class_33.t[i20];
            int i27 = class_33.t[i21];
            if (((i22 - i23) * (i27 - i26)) - ((i25 - i26) * (i24 - i23)) > 0) {
                class_332.o = i22 < 0 || i23 < 0 || i24 < 0 || i22 > class_210.n || i23 > class_210.n || i24 > class_210.n;
                if (V && b(W, X, i25, i26, i27, i22, i23, i24)) {
                    r = i;
                    s = i5;
                }
                if (b(Client.hP + (Client.ag() ? 0 : -4), Client.hQ + (Client.ag() ? 0 : -4), i25, i26, i27, i22, i23, i24)) {
                    t = i;
                    u = i5;
                }
                if (Configuration.av) {
                    class_332.a(i22, i23, i24, i25, i26, i27, class_33.x[i19], class_33.x[i20], class_33.x[i21]);
                }
                if (class_33Var.m == null || class_33Var.m[i18] == -1) {
                    if (class_33Var.g[i18] != 12345678) {
                        if (Configuration.av) {
                            class_332.a(i25, i26, i27, i22, i23, i24, class_33Var.g[i18], class_33Var.h[i18], class_33Var.i[i18], class_33.x[i19], class_33.x[i20], class_33.x[i21]);
                        } else {
                            class_332.a(i25, i26, i27, i22, i23, i24, class_33Var.g[i18], class_33Var.h[i18], class_33Var.i[i18]);
                        }
                    }
                } else if (h) {
                    int i28 = al[class_33Var.m[i18]];
                    if (Configuration.av) {
                        class_332.a(i25, i26, i27, i22, i23, i24, c(i28, class_33Var.g[i18]), c(i28, class_33Var.h[i18]), c(i28, class_33Var.i[i18]), class_33.x[i19], class_33.x[i20], class_33.x[i21]);
                    } else {
                        class_332.a(i25, i26, i27, i22, i23, i24, c(i28, class_33Var.g[i18]), c(i28, class_33Var.h[i18]), c(i28, class_33Var.i[i18]));
                    }
                } else if (class_33Var.n) {
                    if (Configuration.av) {
                        class_332.a(i25, i26, i27, i22, i23, i24, class_33Var.g[i18], class_33Var.h[i18], class_33Var.i[i18], class_33.u[0], class_33.u[1], class_33.u[3], class_33.v[0], class_33.v[1], class_33.v[3], class_33.w[0], class_33.w[1], class_33.w[3], class_33Var.m[i18], class_33.x[i19], class_33.x[i20], class_33.x[i21]);
                    } else {
                        class_332.a(i25, i26, i27, i22, i23, i24, class_33Var.g[i18], class_33Var.h[i18], class_33Var.i[i18], class_33.u[0], class_33.u[1], class_33.u[3], class_33.v[0], class_33.v[1], class_33.v[3], class_33.w[0], class_33.w[1], class_33.w[3], class_33Var.m[i18]);
                    }
                } else if (Configuration.av) {
                    class_332.a(i25, i26, i27, i22, i23, i24, class_33Var.g[i18], class_33Var.h[i18], class_33Var.i[i18], class_33.u[i19], class_33.u[i20], class_33.u[i21], class_33.v[i19], class_33.v[i20], class_33.v[i21], class_33.w[i19], class_33.w[i20], class_33.w[i21], class_33Var.m[i18], class_33.x[i19], class_33.x[i20], class_33.x[i21]);
                } else {
                    class_332.a(i25, i26, i27, i22, i23, i24, class_33Var.g[i18], class_33Var.h[i18], class_33Var.i[i18], class_33.u[i19], class_33.u[i20], class_33.u[i21], class_33.v[i19], class_33.v[i20], class_33.v[i21], class_33.w[i19], class_33.w[i20], class_33.w[i21], class_33Var.m[i18]);
                }
            }
        }
    }

    private int c(int i, int i2) {
        int i3 = ((127 - i2) * (i & 127)) / 160;
        if (i3 < 2) {
            i3 = 2;
        } else if (i3 > 126) {
            i3 = 126;
        }
        return (i & 65408) + i3;
    }

    private boolean b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 < i3 && i2 < i4 && i2 < i5) {
            return false;
        }
        if (i2 > i3 && i2 > i4 && i2 > i5) {
            return false;
        }
        if (i < i6 && i < i7 && i < i8) {
            return false;
        }
        if (i > i6 && i > i7 && i > i8) {
            return false;
        }
        int i9 = ((i2 - i4) * (i8 - i7)) - ((i - i7) * (i5 - i4));
        return (((i2 - i3) * (i7 - i6)) - ((i - i6) * (i4 - i3))) * i9 > 0 && i9 * (((i2 - i5) * (i6 - i8)) - ((i - i8) * (i3 - i5))) > 0;
    }

    private void e() {
        int i;
        int i2 = Z[I];
        class_31[] class_31VarArr = aa[I];
        ab = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            class_31 class_31Var = class_31VarArr[i3];
            if (class_31Var.e == 1) {
                int i4 = (class_31Var.a - O) + d;
                if (i4 >= 0 && i4 <= 50) {
                    int i5 = (class_31Var.c - P) + d;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    int i6 = (class_31Var.d - P) + d;
                    if (i6 > 50) {
                        i6 = 50;
                    }
                    boolean z = false;
                    while (i5 <= i6) {
                        int i7 = i5;
                        i5++;
                        if (as[i4][i7]) {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        int i8 = j - class_31Var.f;
                        if (i8 > 32) {
                            class_31Var.l = 1;
                        } else if (i8 < -32) {
                            class_31Var.l = 2;
                            i8 = -i8;
                        }
                        class_31Var.o = ((class_31Var.h - l) << 8) / i8;
                        class_31Var.p = ((class_31Var.i - l) << 8) / i8;
                        class_31Var.q = ((class_31Var.j - k) << 8) / i8;
                        class_31Var.r = ((class_31Var.k - k) << 8) / i8;
                        class_31[] class_31VarArr2 = ac;
                        int i9 = ab;
                        ab = i9 + 1;
                        class_31VarArr2[i9] = class_31Var;
                    }
                }
            } else if (class_31Var.e == 2) {
                int i10 = (class_31Var.c - P) + d;
                if (i10 >= 0 && i10 <= 50) {
                    int i11 = (class_31Var.a - O) + d;
                    if (i11 < 0) {
                        i11 = 0;
                    }
                    int i12 = (class_31Var.b - O) + d;
                    if (i12 > 50) {
                        i12 = 50;
                    }
                    boolean z2 = false;
                    while (i11 <= i12) {
                        int i13 = i11;
                        i11++;
                        if (as[i13][i10]) {
                            z2 = true;
                            break;
                        }
                    }
                    if (z2) {
                        int i14 = l - class_31Var.h;
                        if (i14 > 32) {
                            class_31Var.l = 3;
                        } else if (i14 < -32) {
                            class_31Var.l = 4;
                            i14 = -i14;
                        }
                        class_31Var.m = ((class_31Var.f - j) << 8) / i14;
                        class_31Var.n = ((class_31Var.g - j) << 8) / i14;
                        class_31Var.q = ((class_31Var.j - k) << 8) / i14;
                        class_31Var.r = ((class_31Var.k - k) << 8) / i14;
                        class_31[] class_31VarArr3 = ac;
                        int i15 = ab;
                        ab = i15 + 1;
                        class_31VarArr3[i15] = class_31Var;
                    }
                }
            } else if (class_31Var.e == 4 && (i = class_31Var.j - k) > 128) {
                int i16 = (class_31Var.c - P) + e;
                if (i16 < 0) {
                    i16 = 0;
                }
                int i17 = (class_31Var.d - P) + e;
                if (i17 > 50) {
                    i17 = 50;
                }
                if (i16 <= i17) {
                    int i18 = (class_31Var.a - O) + e;
                    if (i18 < 0) {
                        i18 = 0;
                    }
                    int i19 = (class_31Var.b - O) + e;
                    if (i19 > 50) {
                        i19 = 50;
                    }
                    boolean z3 = false;
                    for (int i20 = i18; i20 <= i19; i20++) {
                        for (int i21 = i16; i21 <= i17; i21++) {
                            if (as[i20][i21]) {
                                z3 = true;
                                break;
                            }
                        }
                    }
                    if (z3) {
                        class_31Var.l = 5;
                        class_31Var.m = ((class_31Var.f - j) << 8) / i;
                        class_31Var.n = ((class_31Var.g - j) << 8) / i;
                        class_31Var.o = ((class_31Var.h - l) << 8) / i;
                        class_31Var.p = ((class_31Var.i - l) << 8) / i;
                        class_31[] class_31VarArr4 = ac;
                        int i22 = ab;
                        ab = i22 + 1;
                        class_31VarArr4[i22] = class_31Var;
                    }
                }
            }
        }
    }

    private boolean s(int i, int i2, int i3) {
        int i4 = this.G[i][i2][i3];
        if (i4 == (-J)) {
            return false;
        }
        if (i4 == J) {
            return true;
        }
        int i5 = i2 << 7;
        int i6 = i3 << 7;
        if (t(i5 + 1, this.B[i][i2][i3], i6 + 1) && t((i5 + 128) - 1, this.B[i][i2 + 1][i3], i6 + 1) && t((i5 + 128) - 1, this.B[i][i2 + 1][i3 + 1], (i6 + 128) - 1) && t(i5 + 1, this.B[i][i2][i3 + 1], (i6 + 128) - 1)) {
            this.G[i][i2][i3] = J;
            return true;
        }
        this.G[i][i2][i3] = -J;
        return false;
    }

    private boolean e(int i, int i2, int i3, int i4) {
        if (!s(i, i2, i3)) {
            return false;
        }
        int i5 = i2 << 7;
        int i6 = i3 << 7;
        int i7 = this.B[i][i2][i3] - 1;
        int i8 = i7 - 120;
        int i9 = i7 - 230;
        int i10 = i7 - User32.VK_OEM_WSCTRL;
        if (i4 < 16) {
            if (i4 == 1) {
                if (i5 <= j || (t(i5, i7, i6) && t(i5, i7, i6 + 128))) {
                    return (i <= 0 || (t(i5, i8, i6) && t(i5, i8, i6 + 128))) && t(i5, i9, i6) && t(i5, i9, i6 + 128);
                }
                return false;
            }
            if (i4 == 2) {
                if (i6 >= l || (t(i5, i7, i6 + 128) && t(i5 + 128, i7, i6 + 128))) {
                    return (i <= 0 || (t(i5, i8, i6 + 128) && t(i5 + 128, i8, i6 + 128))) && t(i5, i9, i6 + 128) && t(i5 + 128, i9, i6 + 128);
                }
                return false;
            }
            if (i4 == 4) {
                if (i5 >= j || (t(i5 + 128, i7, i6) && t(i5 + 128, i7, i6 + 128))) {
                    return (i <= 0 || (t(i5 + 128, i8, i6) && t(i5 + 128, i8, i6 + 128))) && t(i5 + 128, i9, i6) && t(i5 + 128, i9, i6 + 128);
                }
                return false;
            }
            if (i4 == 8) {
                if (i6 <= l || (t(i5, i7, i6) && t(i5 + 128, i7, i6))) {
                    return (i <= 0 || (t(i5, i8, i6) && t(i5 + 128, i8, i6))) && t(i5, i9, i6) && t(i5 + 128, i9, i6);
                }
                return false;
            }
        }
        if (!t(i5 + 64, i10, i6 + 64)) {
            return false;
        }
        if (i4 == 16) {
            return t(i5, i9, i6 + 128);
        }
        if (i4 == 32) {
            return t(i5 + 128, i9, i6 + 128);
        }
        if (i4 == 64) {
            return t(i5 + 128, i9, i6);
        }
        if (i4 == 128) {
            return t(i5, i9, i6);
        }
        System.out.println("Warning unsupported wall type");
        return true;
    }

    private boolean f(int i, int i2, int i3, int i4) {
        if (!s(i, i2, i3)) {
            return false;
        }
        int i5 = i2 << 7;
        int i6 = i3 << 7;
        return t(i5 + 1, this.B[i][i2][i3] - i4, i6 + 1) && t((i5 + 128) - 1, this.B[i][i2 + 1][i3] - i4, i6 + 1) && t((i5 + 128) - 1, this.B[i][i2 + 1][i3 + 1] - i4, (i6 + 128) - 1) && t(i5 + 1, this.B[i][i2][i3 + 1] - i4, (i6 + 128) - 1);
    }

    private boolean b(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i2 == i3 && i4 == i5) {
            if (!s(i, i2, i4)) {
                return false;
            }
            int i7 = i2 << 7;
            int i8 = i4 << 7;
            return t(i7 + 1, this.B[i][i2][i4] - i6, i8 + 1) && t((i7 + 128) - 1, this.B[i][i2 + 1][i4] - i6, i8 + 1) && t((i7 + 128) - 1, this.B[i][i2 + 1][i4 + 1] - i6, (i8 + 128) - 1) && t(i7 + 1, this.B[i][i2][i4 + 1] - i6, (i8 + 128) - 1);
        }
        for (int i9 = i2; i9 <= i3; i9++) {
            for (int i10 = i4; i10 <= i5; i10++) {
                if (this.G[i][i9][i10] == (-J)) {
                    return false;
                }
            }
        }
        int i11 = (i2 << 7) + 1;
        int i12 = (i4 << 7) + 2;
        int i13 = this.B[i][i2][i4] - i6;
        if (!t(i11, i13, i12)) {
            return false;
        }
        int i14 = (i3 << 7) - 1;
        if (!t(i14, i13, i12)) {
            return false;
        }
        int i15 = (i5 << 7) - 1;
        return t(i11, i13, i15) && t(i14, i13, i15);
    }

    private boolean t(int i, int i2, int i3) {
        int i4;
        for (int i5 = 0; i5 < ab; i5++) {
            class_31 class_31Var = ac[i5];
            if (class_31Var.l == 1) {
                int i6 = class_31Var.f - i;
                if (i6 > 0) {
                    int i7 = class_31Var.h + ((class_31Var.o * i6) >> 8);
                    int i8 = class_31Var.i + ((class_31Var.p * i6) >> 8);
                    int i9 = class_31Var.j + ((class_31Var.q * i6) >> 8);
                    int i10 = class_31Var.k + ((class_31Var.r * i6) >> 8);
                    if (i3 >= i7 && i3 <= i8 && i2 >= i9 && i2 <= i10) {
                        return true;
                    }
                } else {
                    continue;
                }
            } else if (class_31Var.l == 2) {
                int i11 = i - class_31Var.f;
                if (i11 > 0) {
                    int i12 = class_31Var.h + ((class_31Var.o * i11) >> 8);
                    int i13 = class_31Var.i + ((class_31Var.p * i11) >> 8);
                    int i14 = class_31Var.j + ((class_31Var.q * i11) >> 8);
                    int i15 = class_31Var.k + ((class_31Var.r * i11) >> 8);
                    if (i3 >= i12 && i3 <= i13 && i2 >= i14 && i2 <= i15) {
                        return true;
                    }
                } else {
                    continue;
                }
            } else if (class_31Var.l == 3) {
                int i16 = class_31Var.h - i3;
                if (i16 > 0) {
                    int i17 = class_31Var.f + ((class_31Var.m * i16) >> 8);
                    int i18 = class_31Var.g + ((class_31Var.n * i16) >> 8);
                    int i19 = class_31Var.j + ((class_31Var.q * i16) >> 8);
                    int i20 = class_31Var.k + ((class_31Var.r * i16) >> 8);
                    if (i >= i17 && i <= i18 && i2 >= i19 && i2 <= i20) {
                        return true;
                    }
                } else {
                    continue;
                }
            } else if (class_31Var.l == 4) {
                int i21 = i3 - class_31Var.h;
                if (i21 > 0) {
                    int i22 = class_31Var.f + ((class_31Var.m * i21) >> 8);
                    int i23 = class_31Var.g + ((class_31Var.n * i21) >> 8);
                    int i24 = class_31Var.j + ((class_31Var.q * i21) >> 8);
                    int i25 = class_31Var.k + ((class_31Var.r * i21) >> 8);
                    if (i >= i22 && i <= i23 && i2 >= i24 && i2 <= i25) {
                        return true;
                    }
                } else {
                    continue;
                }
            } else if (class_31Var.l == 5 && (i4 = i2 - class_31Var.j) > 0) {
                int i26 = class_31Var.f + ((class_31Var.m * i4) >> 8);
                int i27 = class_31Var.g + ((class_31Var.n * i4) >> 8);
                int i28 = class_31Var.h + ((class_31Var.o * i4) >> 8);
                int i29 = class_31Var.i + ((class_31Var.p * i4) >> 8);
                if (i >= i26 && i <= i27 && i3 >= i28 && i3 <= i29) {
                    return true;
                }
            }
        }
        return false;
    }
}

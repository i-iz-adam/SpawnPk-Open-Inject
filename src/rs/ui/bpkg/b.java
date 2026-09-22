package rs.ui.bpkg;

import com.google.inject.Singleton;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import rs.Client;
import rs.ColorUtility;
import rs.Entity;
import rs.Npc;
import rs.Player;
import rs.class_102;
import rs.class_189;
import rs.class_41;
import rs.class_44;
import rs.class_45;
import rs.class_48;
import rs.gui.Launcher;
import rs.l;
import rs.runelite.a.f;
import rs.runelite.a.h;

/* JADX INFO: loaded from: client-final.jar:rs/ui/b/b.class */
@Singleton
public class b {
    private static final int a = 50;
    private static final int b = 4;
    private static final int c = 10;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int[] t;
    private int u;
    private static final b x = new b();
    private final int[] d = new int[6500];
    private final int[] e = new int[6500];
    private int[] p = new int[0];
    private final rs.ui.bpkg.a q = new rs.ui.bpkg.a();
    private int[][] r = new int[0][];
    private int[] s = new int[0];
    private bInner[][][] v = new bInner[0][][];
    private a[][][] w = new a[0][][];

    /* JADX INFO: loaded from: client-final.jar:rs/ui/b/b$a.class */
    private static class a {
        private final int a;
        private final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* JADX INFO: loaded from: client-final.jar:rs/ui/b/b$b.class */
    private static class bInner {
        private final double a;
        private final int b;
        private final double c;

        public bInner(double d, int i, double d2) {
            this.a = d;
            this.b = i;
            this.c = d2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public double a() {
            return this.a;
        }
    }

    public static b a() {
        return x;
    }

    private static int a(int i) {
        int i2 = i - 1;
        int i3 = i2 | (i2 >> 1);
        int i4 = i3 | (i3 >> 2);
        int i5 = i4 | (i4 >> 4);
        int i6 = i5 | (i5 >> 8);
        return (i6 | (i6 >> 16)) + 1;
    }

    private static boolean a(int i, int i2, int i3, int i4, int i5, int i6) {
        return ((i4 - i2) * (i5 - i3)) - ((i3 - i) * (i6 - i4)) <= 0;
    }

    private bInner[] a(int i, int i2) {
        if (this.v.length <= i) {
            this.v = (bInner[][][]) Arrays.copyOf(this.v, i + 1);
        }
        if (this.v[i] == null) {
            this.v[i] = new bInner[i2 + 1][];
            } else if (this.v[i].length <= i2) {
                this.v[i] = (bInner[][]) Arrays.copyOf(this.v[i], i2 + 1);
        }
        if (this.v[i][i2] == null) {
            double d = (((double) i2) / 4.0d) * (((double) i) - 0.5d);
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 <= i; i3++) {
                for (int i4 = 0; i4 <= i; i4++) {
                    if (i3 != 0 || i4 != 0) {
                        double dHypot = Math.hypot(i3, i4);
                        if (dHypot <= i) {
                            double d2 = (((double) i) - dHypot) + 0.5d;
                            arrayList.add(new bInner(dHypot, i3 + (i4 * this.u), d2 < d ? d2 / d : 1.0d));
                        }
                    }
                }
            }
            arrayList.sort(Comparator.comparingDouble(obj -> {
                return ((bInner) obj).a();
            }));
            this.v[i][i2] = (bInner[]) arrayList.toArray(new bInner[0]);
        }
        return this.v[i][i2];
    }

    private void b(int i) {
        if (this.w.length <= i) {
            this.w = (a[][][]) Arrays.copyOf(this.w, i + 1);
        }
        if (this.w[i] == null) {
            this.w[i] = new a[4][];
        }
        if (this.w[i][0] != null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = -i; i2 <= i; i2++) {
            for (int i3 = 1; i3 <= i; i3++) {
                if (Math.abs(i2) <= i3 && Math.hypot(i3, i2) <= i) {
                    arrayList.add(new a(i3, i2));
                }
            }
        }
        for (int i4 = 0; i4 < 4; i4++) {
            this.w[i][i4] = (a[]) arrayList.toArray(new a[0]);
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                a aVar = (a) arrayList.get(i5);
                arrayList.set(i5, new a(aVar.b, -aVar.a));
            }
        }
    }

    private void a(int i, int i2, int i3) {
        if (this.t[i] == 1024) {
            int i4 = this.s[i] + 1;
            if (i4 > this.r[i].length) {
                this.r[i] = Arrays.copyOf(this.r[i], a(i4));
            }
            this.r[i][this.s[i]] = this.q.b();
            int[] iArr = this.s;
            iArr[i] = iArr[i] + 1;
            this.t[i] = 0;
        }
        int[] iArrA = this.q.a();
        int i5 = this.r[i][this.s[i] - 1];
        int[] iArr2 = this.t;
        int i6 = iArr2[i];
        iArr2[i] = i6 + 1;
        iArrA[(i5 << 10) + i6] = (i3 << 16) | i2;
    }

    private void c(int i) {
        int i2 = i >>> 5;
        if (this.p.length < i2) {
            this.p = new int[a(i2)];
        }
        Arrays.fill(this.p, 0, i2, 0);
    }

    private void b() {
        int i = this.u * this.u;
        if (this.s.length < i) {
            this.r = new int[i][];
            this.s = new int[i];
            this.t = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.r[i2] = new int[0];
            }
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.t[i3] = 1024;
        }
    }

    private void c() {
        for (int i = 0; i < this.u * this.u; i++) {
            while (this.s[i] > 0) {
                int[] iArr = this.s;
                int i2 = i;
                iArr[i2] = iArr[i2] - 1;
                this.q.a(this.r[i][this.s[i]]);
            }
            this.t[i] = 1024;
        }
    }

    private void b(int i, int i2, int i3) {
        if (i3 > this.h) {
            i3 = this.h;
        }
        if (i2 < this.f) {
            i2 = this.f;
        }
        if (i2 >= i3) {
            return;
        }
        int i4 = ((i - this.k) * this.n) + (i2 - this.j);
        int i5 = (i4 + i3) - i2;
        int i6 = i4 >> 5;
        int i7 = i5 >> 5;
        if (i6 == i7) {
            int[] iArr = this.p;
            iArr[i6] = iArr[i6] | (((1 << (i5 & 31)) - 1) ^ ((1 << (i4 & 31)) - 1));
            return;
        }
        int[] iArr2 = this.p;
        iArr2[i6] = iArr2[i6] | (-(1 << (i4 & 31)));
        int[] iArr3 = this.p;
        iArr3[i7] = iArr3[i7] | ((1 << (i5 & 31)) - 1);
        for (int i8 = i6 + 1; i8 < i7; i8++) {
            this.p[i8] = -1;
        }
    }

    private void b(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i2 > i4) {
            i2 = i4;
            i4 = i2;
            i = i3;
            i3 = i;
        }
        if (i4 > i6) {
            int i7 = i4;
            int i8 = i3;
            i4 = i6;
            i6 = i7;
            i3 = i5;
            i5 = i8;
        }
        if (i2 > i4) {
            int i9 = i2;
            int i10 = i;
            i2 = i4;
            i4 = i9;
            i = i3;
            i3 = i10;
        }
        if (i2 > this.i) {
            return;
        }
        int i11 = 0;
        if (i2 != i4) {
            i11 = ((i3 - i) << 14) / (i4 - i2);
        }
        int i12 = 0;
        if (i6 != i4) {
            i12 = ((i5 - i3) << 14) / (i6 - i4);
        }
        int i13 = 0;
        if (i2 != i6) {
            i13 = ((i - i5) << 14) / (i2 - i6);
        }
        if (i4 > this.i) {
            i4 = this.i;
        }
        if (i6 > this.i) {
            i6 = this.i;
        }
        if (i2 == i6 || i6 < this.g) {
            return;
        }
        int i14 = i << 14;
        int i15 = i3 << 14;
        int i16 = i14;
        if (i2 < this.g) {
            i16 -= (i2 - this.g) * i13;
            i14 -= (i2 - this.g) * i11;
            i2 = this.g;
        }
        if (i4 < this.g) {
            i15 -= (i4 - this.g) * i12;
            i4 = this.g;
        }
        int i17 = i2;
        int i18 = i4 - i2;
        int i19 = i6 - i4;
        if ((i2 == i4 || i13 >= i11) && (i2 != i4 || i13 <= i12)) {
            while (true) {
                int i20 = i18;
                i18--;
                if (i20 <= 0) {
                    break;
                }
                b(i17, i14 >> 14, i16 >> 14);
                i14 += i11;
                i16 += i13;
                i17++;
            }
            while (true) {
                int i21 = i19;
                i19--;
                if (i21 <= 0) {
                    return;
                }
                b(i17, i15 >> 14, i16 >> 14);
                i16 += i13;
                i15 += i12;
                i17++;
            }
        } else {
            while (true) {
                int i22 = i18;
                i18--;
                if (i22 <= 0) {
                    break;
                }
                b(i17, i16 >> 14, i14 >> 14);
                i16 += i13;
                i14 += i11;
                i17++;
            }
            while (true) {
                int i23 = i19;
                i19--;
                if (i23 <= 0) {
                    return;
                }
                b(i17, i16 >> 14, i15 >> 14);
                i16 += i13;
                i15 += i12;
                i17++;
            }
        }
    }

    private boolean a(ColorUtility colorUtility, int i, int i2, int i3, int i4) {
        int iZ = colorUtility.z();
        h.a(iZ, i, i2, i3, i4, colorUtility.A(), colorUtility.C(), colorUtility.B(), this.d, this.e);
        boolean z = false;
        for (int i5 = 0; i5 < iZ; i5++) {
            int i6 = this.d[i5];
            int i7 = this.e[i5];
            if (i7 != Integer.MIN_VALUE) {
                z |= (i6 >= this.f && i6 < this.h) && (i7 >= this.g && i7 < this.i);
                this.j = Math.min(this.j, i6);
                this.l = Math.max(this.l, i6 + 1);
                this.k = Math.min(this.k, i7);
                this.m = Math.max(this.m, i7 + 1);
            } else {
                this.e[i5] = Integer.MIN_VALUE;
            }
        }
        return z;
    }

    private void a(ColorUtility colorUtility) {
        int iG = colorUtility.G();
        int[] iArrD = colorUtility.D();
        int[] iArrE = colorUtility.E();
        int[] iArrF = colorUtility.F();
        int[] iArrH = colorUtility.H();
        for (int i = 0; i < iG; i++) {
            if (this.e[iArrD[i]] != Integer.MIN_VALUE && this.e[iArrE[i]] != Integer.MIN_VALUE && this.e[iArrF[i]] != Integer.MIN_VALUE && (iArrH == null || (iArrH[i] & 255) < 254)) {
                int i2 = iArrD[i];
                int i3 = iArrE[i];
                int i4 = iArrF[i];
                int i5 = this.d[i2];
                int i6 = this.e[i2];
                int i7 = this.d[i3];
                int i8 = this.e[i3];
                int i9 = this.d[i4];
                int i10 = this.e[i4];
                if (!a(i5, i6, i7, i8, i9, i10)) {
                    b(i5, i6, i7, i8, i9, i10);
                }
            }
        }
    }

    private void a(int[] iArr, int i, int i2, int i3, a[] aVarArr, int i4) {
        for (a aVar : aVarArr) {
            int i5 = i2 + aVar.a;
            int i6 = i3 + aVar.b;
            int i7 = ((i6 - this.k) * this.n) + (i5 - this.j);
            if (i5 >= this.f && i5 < this.h && i6 >= this.g && i6 < this.i && (this.p[i7 >> 5] & (1 << (i7 & 31))) == 0) {
                iArr[(i6 * i) + i5] = i4;
            }
        }
    }

    private void a(boolean z, Color color, int i) {
        BufferedImage bufferedImage = Launcher.n().o().gZ.e;
        int width = bufferedImage.getWidth();
        int[] data = bufferedImage.getRaster().getDataBuffer().getData();
        int rgb = color.getRGB();
        for (int i2 = 0; i2 < this.n; i2 += 32) {
            int i3 = this.p[i2 >> 5];
            for (int i4 = 1; i4 < this.o; i4++) {
                int i5 = this.p[((i4 * this.n) + i2) >> 5];
                if (i3 != i5) {
                    if (!z) {
                        for (int i6 = 0; i6 < 32; i6++) {
                            int i7 = (i5 >>> i6) & 1;
                            if (((i3 >>> i6) & 1) != i7) {
                                a(this.u, this.j + i2 + i6, (this.k + i4) - i7);
                            }
                        }
                    } else if (i == 1) {
                        for (int i8 = 0; i8 < 32; i8++) {
                            int i9 = (i5 >>> i8) & 1;
                            if (((i3 >>> i8) & 1) != i9) {
                                data[(((this.k + i4) - i9) * width) + this.j + i2 + i8] = rgb;
                            }
                        }
                    } else {
                        a[] aVarArr = this.w[i][3];
                        a[] aVarArr2 = this.w[i][1];
                        for (int i10 = 0; i10 < 32; i10++) {
                            int i11 = (i3 >>> i10) & 1;
                            int i12 = (i5 >>> i10) & 1;
                            if (i11 == 1 && i12 == 0) {
                                a(data, width, this.j + i2 + i10, (this.k + i4) - 1, aVarArr, rgb);
                            } else if (i11 == 0 && i12 == 1) {
                                a(data, width, this.j + i2 + i10, this.k + i4, aVarArr2, rgb);
                            }
                        }
                    }
                }
                i3 = i5;
            }
        }
        for (int i13 = 0; i13 < this.o; i13++) {
            int i14 = i13 * this.n;
            int i15 = 0;
            for (int i16 = 0; i16 < this.n; i16 += 32) {
                int i17 = this.p[(i14 + i16) >> 5];
                if (i17 != 0 && i17 != -1) {
                    int iMin = Math.min(32, (this.h - this.j) - i16);
                    int i18 = i17 & 1;
                    if (!z) {
                        for (int i19 = 1; i19 < iMin; i19++) {
                            int i20 = (i17 >>> i19) & 1;
                            if (i20 != i18) {
                                a(1, ((this.j + i16) + i19) - i20, this.k + i13);
                            }
                            i18 = i20;
                        }
                    } else if (i == 1) {
                        for (int i21 = 1; i21 < iMin; i21++) {
                            int i22 = (i17 >>> i21) & 1;
                            if (i22 != i18) {
                                data[((this.k + i13) * width) + (((this.j + i16) + i21) - i22)] = rgb;
                            }
                            i18 = i22;
                        }
                    } else {
                        a[] aVarArr3 = this.w[i][0];
                        a[] aVarArr4 = this.w[i][2];
                        for (int i23 = 1; i23 < iMin; i23++) {
                            int i24 = (i17 >>> i23) & 1;
                            if (i24 == 1 && i18 == 0) {
                                a(data, width, this.j + i16 + i23, this.k + i13, aVarArr4, rgb);
                            } else if (i24 == 0 && i18 == 1) {
                                a(data, width, ((this.j + i16) + i23) - 1, this.k + i13, aVarArr3, rgb);
                            }
                            i18 = i24;
                        }
                    }
                }
                if ((i15 >>> 31) != (i17 & 1) && i16 > 0) {
                    if (!z) {
                        a(1, (this.j + i16) - (i17 & 1), this.k + i13);
                    } else if (i == 1) {
                        data[((this.k + i13) * width) + ((this.j + i16) - (i17 & 1))] = rgb;
                    } else if ((i17 & 1) == 1) {
                        a(data, width, this.j + i16, this.k + i13, this.w[i][2], rgb);
                    } else {
                        a(data, width, (this.j + i16) - 1, this.k + i13, this.w[i][0], rgb);
                    }
                }
                i15 = i17;
            }
        }
    }

    private void a(int i, Color color, int i2) {
        BufferedImage bufferedImage = Launcher.n().o().gZ.e;
        int width = bufferedImage.getWidth();
        int[] data = bufferedImage.getRaster().getDataBuffer().getData();
        for (bInner bVar : a(i, i2)) {
            int[] iArrA = this.q.a();
            int iRound = (int) Math.round(((double) color.getAlpha()) * bVar.c);
            int i3 = 256 - iRound;
            int red = (iRound << 24) | (((color.getRed() * iRound) / 255) << 16) | (((color.getGreen() * iRound) / 255) << 8) | ((color.getBlue() * iRound) / 255);
            int i4 = bVar.b;
            int i5 = i4 + this.u;
            int i6 = i4 + 1;
            while (this.s[i4] > 0) {
                int i7 = this.r[i4][this.s[i4] - 1];
                int i8 = i7 << 10;
                int i9 = i8 + this.t[i4];
                for (int i10 = i8; i10 < i9; i10++) {
                    int i11 = iArrA[i10] & 65535;
                    int i12 = iArrA[i10] >>> 16;
                    int i13 = ((i12 - this.k) * this.n) + (i11 - this.j);
                    if ((this.p[i13 >> 5] & (1 << (i13 & 31))) == 0) {
                        int[] iArr = this.p;
                        int i14 = i13 >> 5;
                        iArr[i14] = iArr[i14] | (1 << (i13 & 31));
                        int i15 = (i12 * width) + i11;
                        int i16 = data[i15];
                        data[i15] = (((red & (-16711936)) + (((i16 & (-16711936)) * i3) >>> 8)) & (-16711936)) | (((red & 16711935) + (((i16 & 16711935) * i3) >>> 8)) & 16711935);
                        if (i11 - 1 >= this.f) {
                            a(i6, i11 - 1, i12);
                        }
                        if (i11 + 1 < this.h) {
                            a(i6, i11 + 1, i12);
                        }
                        if (i12 - 1 >= this.g) {
                            a(i5, i11, i12 - 1);
                        }
                        if (i12 + 1 < this.i) {
                            a(i5, i11, i12 + 1);
                        }
                    }
                }
                this.q.a(i7);
                int[] iArr2 = this.s;
                iArr2[i4] = iArr2[i4] - 1;
                this.t[i4] = 1024;
            }
        }
    }

    private void a(ColorUtility colorUtility, int i, int i2, int i3, int i4, int i5, Color color, int i6) {
        if (i5 <= 0 || color.getAlpha() == 0 || colorUtility == null) {
            return;
        }
        if (i5 > 50) {
            i5 = 50;
        }
        if (i6 < 0) {
            i6 = 0;
        } else if (i6 > 4) {
            i6 = 4;
        }
        this.j = Integer.MAX_VALUE;
        this.l = Integer.MIN_VALUE;
        this.k = Integer.MAX_VALUE;
        this.m = Integer.MIN_VALUE;
        this.f = Launcher.n().o().ae();
        this.g = Launcher.n().o().af();
        this.h = Launcher.n().o().ar() + this.f;
        this.i = Launcher.n().o().aq() + this.g;
        if (a(colorUtility, i, i2, i3, i4)) {
            this.j = Math.max(this.j - i5, this.f);
            this.l = Math.min(this.l + i5, this.h);
            this.l += (((this.l - this.j) - 1) ^ (-1)) & 31;
            this.k = Math.max(this.k - i5, this.g);
            this.m = Math.min(this.m + i5, this.i);
            this.n = this.l - this.j;
            this.o = this.m - this.k;
            c(this.n * this.o);
            a(colorUtility);
            boolean z = color.getAlpha() == 255 && i5 <= 10 && (i6 == 0 || i5 == 1);
            if (z) {
                b(i5);
            } else {
                this.u = i5 + 2;
                b();
            }
            try {
                a(z, color, i5);
                if (!z) {
                    a(i5, color, i6);
                }
            } finally {
                c();
            }
        }
    }

    public void a(Npc npc, int i, Color color, int i2) {
        class_102 class_102Var = npc.aG;
        if (class_102Var != null) {
            byte b2 = class_102Var.r;
        }
        f fVar = new f(npc.ac, npc.ad);
        if (fVar != null) {
            a(npc.c(), fVar.b(), fVar.c(), h.d(fVar, Client.dw), npc.ae, i, color, i2);
        }
    }

    public void a(Player player, int i, Color color, int i2) {
        f fVar = new f(player.ac, player.ad);
        if (fVar != null) {
            a(player.c(), fVar.b(), fVar.c(), h.d(fVar, Client.dw), player.ae, i, color, i2);
        }
    }

    public void a(Entity entity, int i, Color color, int i2) {
        if (entity instanceof Npc) {
            a((Npc) entity, i, color, i2);
        } else if (entity instanceof Player) {
            a((Player) entity, i, color, i2);
        }
    }

    private void a(l lVar, int i, Color color, int i2) {
        class_48 class_48VarA = lVar.a();
        if (class_48VarA != null) {
            ColorUtility colorUtilityC = class_48VarA instanceof ColorUtility ? (ColorUtility) class_48VarA : class_48VarA.c();
            if (colorUtilityC != null) {
                a(colorUtilityC, lVar.n, lVar.o, lVar.c, lVar.e, i, color, i2);
            }
        }
    }

    private void a(class_189 class_189Var, int i, Color color, int i2) {
        class_48 class_48VarA = class_189Var.a();
        if (class_48VarA != null) {
            ColorUtility colorUtilityC = class_48VarA instanceof ColorUtility ? (ColorUtility) class_48VarA : class_48VarA.c();
            if (colorUtilityC != null) {
                a(colorUtilityC, class_189Var.n, class_189Var.o, class_189Var.b, 0, i, color, i2);
            }
        }
    }

    private void a(class_45 class_45Var, int i, Color color, int i2) {
        class_48 class_48VarA = class_45Var.a();
        if (class_48VarA != null) {
            ColorUtility colorUtilityC = class_48VarA instanceof ColorUtility ? (ColorUtility) class_48VarA : class_48VarA.c();
            if (colorUtilityC != null) {
                a(colorUtilityC, class_45Var.n, class_45Var.o, class_45Var.c, 0, i, color, i2);
            }
        }
        class_48 class_48VarB = class_45Var.b();
        if (class_48VarB != null) {
            ColorUtility colorUtilityC2 = class_48VarB instanceof ColorUtility ? (ColorUtility) class_48VarB : class_48VarB.c();
            if (colorUtilityC2 != null) {
                a(colorUtilityC2, class_45Var.n, class_45Var.o, class_45Var.c, 0, i, color, i2);
            }
        }
    }

    private void a(class_44 class_44Var, int i, Color color, int i2) {
        class_48 class_48VarA = class_44Var.a();
        if (class_48VarA != null) {
            ColorUtility colorUtilityC = class_48VarA instanceof ColorUtility ? (ColorUtility) class_48VarA : class_48VarA.c();
            if (colorUtilityC != null) {
                a(colorUtilityC, class_44Var.n, class_44Var.o, class_44Var.b, class_44Var.d, i, color, i2);
            }
        }
    }

    public void a(class_41 class_41Var, int i, Color color, int i2) {
        if (class_41Var instanceof l) {
            a((l) class_41Var, i, color, i2);
            return;
        }
        if (class_41Var instanceof class_189) {
            a((class_189) class_41Var, i, color, i2);
        } else if (class_41Var instanceof class_44) {
            a((class_44) class_41Var, i, color, i2);
        } else if (class_41Var instanceof class_45) {
            a((class_45) class_41Var, i, color, i2);
        }
    }
}

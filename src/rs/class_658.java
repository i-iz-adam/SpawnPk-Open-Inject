package rs;

import com.sun.jna.platform.win32.G;
import com.sun.jna.platform.win32.aU;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.KHRTextureCompressionASTCLDR;
import rs.lpkg.e;

/* JADX INFO: loaded from: client-final.jar:rs/class_658.class */
public final class class_658 {
    private final int[] j;
    private final int[] k;
    private final int[] l;
    private final int[] m;
    private final int[] n;
    private final int[][][] o;
    private static int[][][] p;
    public static int f;
    private final byte[][][] r;
    private final int[][][] s;
    private final byte[][][] t;
    private static final int v = 323;
    private final int[][] w;
    private final int[][][] y;
    private final int A;
    private final int B;
    private final byte[][][] C;
    private final byte[][][] D;
    public static final int[][] a = {new int[]{3283, 3935}, new int[]{3088, GL11.GL_MAP2_TEXTURE_COORD_3}, new int[]{3095, 3523}, new int[]{3095, 3524}, new int[]{3096, 3523}, new int[]{3096, 3524}, new int[]{3099, 3525}, new int[]{3099, 3526}, new int[]{3100, 3525}, new int[]{3100, 3526}, new int[]{3098, 3523}, new int[]{3098, 3522}, new int[]{3099, 3523}, new int[]{3099, 3522}, new int[]{3101, 3523}, new int[]{3097, 3525}, new int[]{3090, 3503}, new int[]{3086, 3526}};
    public static final int[] b = {13728, 13729, 13730, 13731, 13732, 13733, 15256, 15257, 15258, 15259, 15260, 15261, 15262, 15263, 15264, 15265, 15266, 15267, 15268, 15269, 15270, 15271, 15272, 15273, 15274, 15275, 15276, 15277, 15278, 15279, 15280, 15281, 15282, 15283, 15284, 15285, 15286, 15287, 15288, 15289, 15290, 15291, 15292, 15293, 15294, 15295, 15296, 15297, 15298, aU.Vk, 15300, 15301, 15302, 15303, 15304, 15305, 15306, 15307, 15308, 15309, 15310, 15311, 15312, 15313, 15314, 15315, 15316, 15317, 15318, 15319, 15320, 15321, 15322, 15323, 15324, 15325, 15326, 15327, 15328, 15329, 15330, 15331, 15332, 15333, 15334, 15335, 15336, 15337, 15338, 15339, 15340, 15341, 15342, 15343, 15344, 15345, 15346, 15347, 15348, 15349, 15350, 15351, 15352, 15353, 15354, 15355, 15356, 15357, 15358, 15359, 15360, 15361, 15362, 15363, 15364, 15365, 15366, 15367, 15368, 15369, 15370, 15371, 15372, 15373, 15374, 15375, 15376, 15377, 15378, 15379, 15380, 15381, 15382, 15383, 15384, 15385, 15386, 15387, 15388, 15389, 15390, 15391, 15392, 15393, 15394, 15395, 15396, 15397, 15398, 15399, 15400, 15401, 15402, 15403, 15404, 15405, 15406, 15407, 15408, 15409, 15410, 15411, 15412, 15413, 15414, 15415, 15416, 15417, 15418, 15419, 15420, 15421, 15422, 15423, 15424, 15425, 15426, 15427, 15428, 15429, 15430, 15431, 15432, 15433, 15434, 15435, 15436, 15437, 15438, 15439, 15440, 15441, 15442, 15443, 15444, 15445, 15446, 15447, 15448, 15449, 15450, 18810, 18811, 18812, 18813, 18814, 18815, 22457, 29131, 29132, 29133, 29113, 29136, 29137, 29138, 29139, 29120, 29130, 29122, 29121, 29123, 29124, 29125, 29126, CpioConstants.MAGIC_OLD_BINARY, 29128, 29129};
    public static final int[][] c = {new int[]{1, 3088, GL11.GL_MAP2_TEXTURE_COORD_3}, new int[]{1, 3283, 3935}};
    public static Map<String, Integer> d = new HashMap();
    public static boolean e = false;
    private static int i = ((int) (Math.random() * 17.0d)) - 8;
    private static int q = ((int) (Math.random() * 33.0d)) - 16;
    private static final int[] u = {1, 0, -1, 0};
    private static final int[] x = {16, 32, 64, 128};
    private static final int[] z = {0, -1, 0, 1};
    public static int g = 99;
    public static boolean h = true;
    private static final int[] E = {1, 2, 4, 8};

    public class_658(byte[][][] bArr, int[][][] iArr) {
        g = 99;
        this.A = 104;
        this.B = 104;
        this.o = iArr;
        this.D = bArr;
        this.y = new int[4][this.A][this.B];
        p = new int[4][this.A][this.B];
        this.t = new byte[4][this.A][this.B];
        this.C = new byte[4][this.A][this.B];
        this.s = new int[4][this.A + 1][this.B + 1];
        this.r = new byte[4][this.A + 1][this.B + 1];
        this.w = new int[this.A + 1][this.B + 1];
        this.j = new int[this.B];
        this.k = new int[this.B];
        this.l = new int[this.B];
        this.m = new int[this.B];
        this.n = new int[this.B];
    }

    private static int c(int i2, int i3) {
        if (class_107.a == class_108.c) {
            int i4 = i2 + (i3 * 57);
            int i5 = i4 ^ (i4 << 13);
            return ((((i5 * (((i5 * i5) * 15731) + 789221)) + 1376312589) & Integer.MAX_VALUE) >> 19) & 255;
        }
        int i6 = i2 + (i3 * 57);
        int i7 = (i6 << 13) ^ i6;
        return ((((i7 * (((i7 * i7) * 15731) + 789221)) + 1376312589) & Integer.MAX_VALUE) >> 19) & a();
    }

    private static int a() {
        return class_107.a == class_108.c ? 32767 : 255;
    }

    public final void a(class_130[] class_130VarArr, class_46 class_46Var) {
        int iD;
        int iB;
        for (int i2 = 0; i2 < 4; i2++) {
            for (int i3 = 0; i3 < 104; i3++) {
                for (int i4 = 0; i4 < 104; i4++) {
                    if ((this.D[i2][i3][i4] & 1) == 1) {
                        int i5 = i2;
                        if ((this.D[1][i3][i4] & 2) == 2) {
                            i5--;
                        }
                        if (i5 >= 0) {
                            class_130VarArr[i5].a(i4, i3);
                        }
                    }
                }
            }
        }
        i += ((int) (Math.random() * 5.0d)) - 2;
        if (i < -8) {
            i = -8;
        }
        if (i > 8) {
            i = 8;
        }
        q += ((int) (Math.random() * 5.0d)) - 2;
        if (q < -16) {
            q = -16;
        }
        if (q > 16) {
            q = 16;
        }
        for (int i6 = 0; i6 < 4; i6++) {
            byte[][] bArr = this.r[i6];
            int iSqrt = (768 * ((int) Math.sqrt((((-50) * (-50)) + ((-10) * (-10))) + ((-50) * (-50))))) >> 8;
            for (int i7 = 1; i7 < this.B - 1; i7++) {
                for (int i8 = 1; i8 < this.A - 1; i8++) {
                    int i9 = this.o[i6][i8 + 1][i7] - this.o[i6][i8 - 1][i7];
                    int i10 = this.o[i6][i8][i7 + 1] - this.o[i6][i8][i7 - 1];
                    int iSqrt2 = (int) Math.sqrt((i9 * i9) + 65536 + (i10 * i10));
                    this.w[i8][i7] = (96 + (((((-50) * ((i9 << 8) / iSqrt2)) + ((-10) * (65536 / iSqrt2))) + ((-50) * ((i10 << 8) / iSqrt2))) / iSqrt)) - (((((bArr[i8 - 1][i7] >> 2) + (bArr[i8 + 1][i7] >> 3)) + (bArr[i8][i7 - 1] >> 2)) + (bArr[i8][i7 + 1] >> 3)) + (bArr[i8][i7] >> 1));
                }
            }
            for (int i11 = 0; i11 < this.B; i11++) {
                this.j[i11] = 0;
                this.k[i11] = 0;
                this.l[i11] = 0;
                this.m[i11] = 0;
                this.n[i11] = 0;
            }
            for (int i12 = -5; i12 < this.A + 5; i12++) {
                for (int i13 = 0; i13 < this.B; i13++) {
                    int i14 = i12 + 5;
                    if (i14 >= 0 && i14 < this.A) {
                        int iA = this.y[i6][i14][i13] & a();
                        if (iA > 0) {
                            if (iA - 1 >= class_107.b.length) {
                                iA = class_107.b.length;
                            }
                            class_107 class_107Var = class_107.b[iA - 1];
                            int[] iArr = this.j;
                            int i15 = i13;
                            iArr[i15] = iArr[i15] + class_107Var.i;
                            int[] iArr2 = this.k;
                            int i16 = i13;
                            iArr2[i16] = iArr2[i16] + class_107Var.g;
                            int[] iArr3 = this.l;
                            int i17 = i13;
                            iArr3[i17] = iArr3[i17] + class_107Var.h;
                            int[] iArr4 = this.m;
                            int i18 = i13;
                            iArr4[i18] = iArr4[i18] + class_107Var.j;
                            int[] iArr5 = this.n;
                            int i19 = i13;
                            iArr5[i19] = iArr5[i19] + 1;
                        }
                    }
                    int i20 = i12 - 5;
                    if (i20 >= 0 && i20 < this.A) {
                        int iA2 = this.y[i6][i20][i13] & a();
                        if (iA2 > 0) {
                            if (iA2 - 1 >= class_107.b.length) {
                                iA2 = class_107.b.length;
                            }
                            class_107 class_107Var2 = class_107.b[iA2 - 1];
                            int[] iArr6 = this.j;
                            int i21 = i13;
                            iArr6[i21] = iArr6[i21] - class_107Var2.i;
                            int[] iArr7 = this.k;
                            int i22 = i13;
                            iArr7[i22] = iArr7[i22] - class_107Var2.g;
                            int[] iArr8 = this.l;
                            int i23 = i13;
                            iArr8[i23] = iArr8[i23] - class_107Var2.h;
                            int[] iArr9 = this.m;
                            int i24 = i13;
                            iArr9[i24] = iArr9[i24] - class_107Var2.j;
                            int[] iArr10 = this.n;
                            int i25 = i13;
                            iArr10[i25] = iArr10[i25] - 1;
                        }
                    }
                }
                if (i12 >= 1 && i12 < this.A - 1) {
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 0;
                    int i31 = -5;
                    while (i31 < this.B + 5) {
                        int i32 = i31 + 5;
                        if (i32 >= 0 && i32 < this.B) {
                            i26 += this.j[i32];
                            i27 += this.k[i32];
                            i28 += this.l[i32];
                            i29 += this.m[i32];
                            i30 += this.n[i32];
                        }
                        int i33 = i31 - 5;
                        if (i33 >= 0 && i33 < this.B) {
                            i26 -= this.j[i33];
                            i27 -= this.k[i33];
                            i28 -= this.l[i33];
                            i29 -= this.m[i33];
                            i30 -= this.n[i33];
                        }
                        int i34 = i12 + Client.eh;
                        int i35 = i31 + Client.ei;
                        int i36 = ((i34 >> 6) * 256) + (i35 >> 6);
                        if (i34 < 2867 || i34 > 2871 || i35 < 2981 || i35 <= 2984) {
                        }
                        boolean z2 = false;
                        if (i36 != 12693 && i36 != 12949) {
                            z2 = i31 >= 1 && i31 < this.B - 1 && b(i12, i31, i6);
                        }
                        boolean z3 = i31 >= 1 && i31 < this.B - 1 && !(h && (this.D[0][i12][i31] & 2) == 0 && ((this.D[i6][i12][i31] & 16) != 0 || e(i31, i6, i12) != f));
                        if (class_107.a == class_108.c) {
                            z3 = i31 >= 1 && i31 < 103 && !(h && (this.D[0][i12][i31] & 2) == 0 && (this.D[i6][i12][i31] & 16) != 0);
                        }
                        if (z3) {
                            if (i6 < g) {
                                g = i6;
                            }
                            int iA3 = this.y[i6][i12][i31] & a();
                            int iA4 = p[i6][i12][i31] & a();
                            if (iA4 >= class_122.b.length) {
                                iA4 = 134;
                            }
                            if (iA3 > 0 || iA4 > 0) {
                                int i37 = this.o[i6][i12][i31];
                                int i38 = this.o[i6][i12 + 1][i31];
                                int i39 = this.o[i6][i12 + 1][i31 + 1];
                                int i40 = this.o[i6][i12][i31 + 1];
                                int i41 = this.w[i12][i31];
                                int i42 = this.w[i12 + 1][i31];
                                int i43 = this.w[i12 + 1][i31 + 1];
                                int i44 = this.w[i12][i31 + 1];
                                int iD2 = -1;
                                int iD3 = -1;
                                if (iA3 > 0) {
                                    int i45 = i29 > 0 ? (i26 * 256) / i29 : 0;
                                    int i46 = i27 / i30;
                                    int i47 = i28 / i30;
                                    iD2 = d(i45, i46, i47);
                                    int iA5 = (i45 + i) & a();
                                    int i48 = i47 + q;
                                    if (i48 < 0) {
                                        i48 = 0;
                                    } else if (i48 > 255) {
                                        i48 = 255;
                                    }
                                    iD3 = d(iA5, i46, i48);
                                }
                                if (i6 > 0) {
                                    boolean z4 = true;
                                    if (iA3 == 0 && this.t[i6][i12][i31] != 0) {
                                        z4 = false;
                                    }
                                    if (iA4 > 0 && !class_122.b[iA4 - 1].e) {
                                        z4 = false;
                                    }
                                    if (z4 && i37 == i38 && i37 == i39 && i37 == i40) {
                                        int[] iArr11 = this.s[i6][i12];
                                        int i49 = i31;
                                        iArr11[i49] = iArr11[i49] | G.ce;
                                    }
                                }
                                int i50 = iD2 != -1 ? class_332.B[g(iD3, 96)] : 0;
                                if (iA4 == 0) {
                                    if (i34 >= 3076 && i34 <= 3082 && i35 >= 3487 && i35 <= 3497) {
                                        iD2 = d(0, 0, 65);
                                    }
                                    if (0 != 0) {
                                        iD2 = d(0, 0, 0);
                                    }
                                    class_46Var.a(i6, i12, i31, 0, 0, -1, i37, i38, i39, i40, g(iD2, i41), g(iD2, i42), g(iD2, i43), g(iD2, i44), 0, 0, 0, 0, i50, 0);
                                } else {
                                    int i51 = this.t[i6][i12][i31] + 1;
                                    byte b2 = this.C[i6][i12][i31];
                                    if (iA4 - 1 > class_122.b.length) {
                                        iA4 = class_122.b.length;
                                    }
                                    class_122 class_122Var = class_122.b[iA4 - 1];
                                    int i52 = class_122Var.c;
                                    if (i52 > 50) {
                                        i52 = -1;
                                    }
                                    if (i52 == 1 && e.a()) {
                                        i52 = 24;
                                    }
                                    if (i52 >= 0) {
                                        iB = class_332.b(i52 == 1 ? 24 : i52);
                                        iD = -1;
                                    } else if (class_122Var.d == 16711935 || (class_107.a != class_108.c && class_122Var.d == 0)) {
                                        iD = -2;
                                        i52 = -1;
                                        iB = 0;
                                    } else {
                                        if (i34 >= 3076 && i34 <= 3082 && i35 >= 3487 && i35 <= 3498) {
                                            iD = d(0, 0, 70);
                                        } else if (i34 < 3091 || i34 > 3100 || i35 < 3507 || i35 > 3513) {
                                            iD = (i34 < 3076 || i34 > 3084 || i35 < 3507 || i35 > 3513) ? d(class_122Var.o, class_122Var.p, class_122Var.q) : d(0, 0, 70);
                                        } else {
                                            iD = d(0, 0, 70);
                                        }
                                        iB = class_332.B[e(class_122Var.w, 96)];
                                        if (Configuration.r == class_150.d && i34 >= 2729 && i34 <= 2746 && i35 >= 3460 && i35 <= 3476) {
                                            if (iA4 == 38) {
                                                iD = d(10, 175, 150);
                                                iB = 16749077;
                                            } else if (iA4 == 1) {
                                            }
                                        }
                                        if (Configuration.r == class_150.c && i34 >= 2729 && i34 <= 2746 && i35 >= 3460 && i35 <= 3476) {
                                            if (iA4 == 38) {
                                                iD = class_267.a(11430143);
                                                iB = 11430143;
                                            } else if (iA4 == 1) {
                                            }
                                        }
                                    }
                                    if (class_122Var.f != -1 && iB == 0) {
                                        int i53 = class_122Var.r;
                                        int i54 = class_122Var.t;
                                        if (i54 < 0) {
                                            i54 = 0;
                                        } else if (i54 > 255) {
                                            i54 = 255;
                                        }
                                        iB = class_332.B[b(d(i53, class_122Var.s, i54), 96)];
                                    }
                                    if (class_107.a != class_108.c) {
                                        if (iA4 - 1 == 111) {
                                            iB = class_332.b(1);
                                            iD = -1;
                                            i52 = 1;
                                        } else if (iD == 6363) {
                                            iB = 4733729;
                                            iD = d(25, 146, 24);
                                        } else if (iA4 - 1 == 151) {
                                            iB = 16753198;
                                            iD = -2;
                                            i52 = -1;
                                        }
                                        if (iA4 - 1 == 54) {
                                            class_122Var.d = 9145219;
                                            iB = 9145219;
                                            iD = -2;
                                            i52 = -1;
                                        }
                                    }
                                    class_46Var.a(i6, i12, i31, i51, b2, i52, i37, i38, i39, i40, g(iD2, i41), g(iD2, i42), g(iD2, i43), g(iD2, i44), e(iD, i41), e(iD, i42), e(iD, i43), e(iD, i44), i50, iB);
                                }
                            }
                        }
                        if (z2) {
                            h = true;
                        }
                        i31++;
                    }
                }
            }
            for (int i55 = 1; i55 < this.B - 1; i55++) {
                for (int i56 = 1; i56 < this.A - 1; i56++) {
                    class_46Var.a(i6, i56, i55, e(i55, i6, i56));
                }
            }
        }
        class_46Var.q(-10, -50, -50);
        for (int i57 = 0; i57 < this.A; i57++) {
            for (int i58 = 0; i58 < this.B; i58++) {
                if ((this.D[1][i57][i58] & 2) == 2) {
                    class_46Var.a(i58, i57);
                }
            }
        }
        int i59 = 1;
        int i60 = 2;
        int i61 = 4;
        for (int i62 = 0; i62 < 4; i62++) {
            if (i62 > 0) {
                i59 <<= 3;
                i60 <<= 3;
                i61 <<= 3;
            }
            for (int i63 = 0; i63 <= i62; i63++) {
                for (int i64 = 0; i64 <= this.B; i64++) {
                    for (int i65 = 0; i65 <= this.A; i65++) {
                        if ((this.s[i63][i65][i64] & i59) != 0) {
                            int i66 = i64;
                            int i67 = i64;
                            int i68 = i63;
                            int i69 = i63;
                            while (i66 > 0 && (this.s[i63][i65][i66 - 1] & i59) != 0) {
                                i66--;
                            }
                            while (i67 < this.B && (this.s[i63][i65][i67 + 1] & i59) != 0) {
                                i67++;
                            }
                            while (i68 > 0) {
                                for (int i70 = i66; i70 <= i67; i70++) {
                                    if ((this.s[i68 - 1][i65][i70] & i59) == 0) {
                                        break;
                                    }
                                }
                                i68--;
                            }
                            while (i69 < i62) {
                                for (int i71 = i66; i71 <= i67; i71++) {
                                    if ((this.s[i69 + 1][i65][i71] & i59) == 0) {
                                        break;
                                    }
                                }
                                i69++;
                            }
                            if (((i69 + 1) - i68) * ((i67 - i66) + 1) >= 8) {
                                class_46.a(i62, i65 * 128, this.o[i68][i65][i66], i65 * 128, (i67 * 128) + 128, this.o[i69][i65][i66] - 240, i66 * 128, 1);
                                for (int i72 = i68; i72 <= i69; i72++) {
                                    for (int i73 = i66; i73 <= i67; i73++) {
                                        int[] iArr12 = this.s[i72][i65];
                                        int i74 = i73;
                                        iArr12[i74] = iArr12[i74] & (i59 ^ (-1));
                                    }
                                }
                            }
                        }
                        if ((this.s[i63][i65][i64] & i60) != 0) {
                            int i75 = i65;
                            int i76 = i65;
                            int i77 = i63;
                            int i78 = i63;
                            while (i75 > 0 && (this.s[i63][i75 - 1][i64] & i60) != 0) {
                                i75--;
                            }
                            while (i76 < this.A && (this.s[i63][i76 + 1][i64] & i60) != 0) {
                                i76++;
                            }
                            while (i77 > 0) {
                                for (int i79 = i75; i79 <= i76; i79++) {
                                    if ((this.s[i77 - 1][i79][i64] & i60) == 0) {
                                        break;
                                    }
                                }
                                i77--;
                            }
                            while (i78 < i62) {
                                for (int i80 = i75; i80 <= i76; i80++) {
                                    if ((this.s[i78 + 1][i80][i64] & i60) == 0) {
                                        break;
                                    }
                                }
                                i78++;
                            }
                            if (((i78 + 1) - i77) * ((i76 - i75) + 1) >= 8) {
                                class_46.a(i62, i75 * 128, this.o[i77][i75][i64], (i76 * 128) + 128, i64 * 128, this.o[i78][i75][i64] - 240, i64 * 128, 2);
                                for (int i81 = i77; i81 <= i78; i81++) {
                                    for (int i82 = i75; i82 <= i76; i82++) {
                                        int[] iArr13 = this.s[i81][i82];
                                        int i83 = i64;
                                        iArr13[i83] = iArr13[i83] & (i60 ^ (-1));
                                    }
                                }
                            }
                        }
                        if ((this.s[i63][i65][i64] & i61) != 0) {
                            int i84 = i65;
                            int i85 = i65;
                            int i86 = i64;
                            int i87 = i64;
                            while (i86 > 0 && (this.s[i63][i65][i86 - 1] & i61) != 0) {
                                i86--;
                            }
                            while (i87 < this.B && (this.s[i63][i65][i87 + 1] & i61) != 0) {
                                i87++;
                            }
                            while (i84 > 0) {
                                for (int i88 = i86; i88 <= i87; i88++) {
                                    if ((this.s[i63][i84 - 1][i88] & i61) == 0) {
                                        break;
                                    }
                                }
                                i84--;
                            }
                            while (i85 < this.A) {
                                for (int i89 = i86; i89 <= i87; i89++) {
                                    if ((this.s[i63][i85 + 1][i89] & i61) == 0) {
                                        break;
                                    }
                                }
                                i85++;
                            }
                            if (((i85 - i84) + 1) * ((i87 - i86) + 1) >= 4) {
                                int i90 = this.o[i63][i84][i86];
                                class_46.a(i62, i84 * 128, i90, (i85 * 128) + 128, (i87 * 128) + 128, i90, i86 * 128, 4);
                                for (int i91 = i84; i91 <= i85; i91++) {
                                    for (int i92 = i86; i92 <= i87; i92++) {
                                        int[] iArr14 = this.s[i63][i91];
                                        int i93 = i92;
                                        iArr14[i93] = iArr14[i93] & (i61 ^ (-1));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static int d(int i2, int i3) {
        int iC = ((int) (((double) ((c(i2 + 45365, i3 + 91923, 4) - 128) + ((c(i2 + 10294, i3 + KHRTextureCompressionASTCLDR.GL_COMPRESSED_RGBA_ASTC_12x12_KHR, 2) - 128) >> 1) + ((c(i2, i3, 1) - 128) >> 2))) * 0.3d)) + 35;
        if (iC < 10) {
            iC = 10;
        } else if (iC > 60) {
            iC = 60;
        }
        return iC;
    }

    public static void a(Buffer buffer, class_95 class_95Var) {
        int i2 = -1;
        while (true) {
            int iF = buffer.f();
            if (iF == 0) {
                return;
            }
            i2 += iF;
            ObjectComposition.c(i2).a(class_95Var);
            while (buffer.f() != 0) {
                buffer.y();
            }
        }
    }

    public final void a(int i2, int i3, int i4, int i5) {
        for (int i6 = i2; i6 <= i2 + i3; i6++) {
            for (int i7 = i5; i7 <= i5 + i4; i7++) {
                if (i7 >= 0 && i7 < this.A && i6 >= 0 && i6 < this.B) {
                    this.r[0][i7][i6] = 127;
                    if (i7 == i5 && i7 > 0) {
                        this.o[0][i7][i6] = this.o[0][i7 - 1][i6];
                    }
                    if (i7 == i5 + i4 && i7 < this.A - 1) {
                        this.o[0][i7][i6] = this.o[0][i7 + 1][i6];
                    }
                    if (i6 == i2 && i6 > 0) {
                        this.o[0][i7][i6] = this.o[0][i7][i6 - 1];
                    }
                    if (i6 == i2 + i3 && i6 < this.B - 1) {
                        this.o[0][i7][i6] = this.o[0][i7][i6 + 1];
                    }
                }
            }
        }
    }

    private static boolean a(int i2) {
        if (i2 == 42950) {
            return true;
        }
        return i2 > 32176 && i2 <= 34561;
    }

    public void a(int i2, class_46 class_46Var, class_130 class_130Var, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        class_48 class_69Var;
        class_48 class_69Var2;
        boolean zA = a(i6);
        if (i4 >= 0 && i4 < 4 && !zA) {
            boolean z2 = (class_107.a == class_108.c && (this.D[i4][i5][i2] & 16) == 0) ? false : true;
            if (h && (this.D[0][i5][i2] & 2) == 0 && z2 && ((this.D[i4][i5][i2] & 16) != 0 || e(i2, i4, i5) != f)) {
                return;
            }
        }
        if (i4 < g) {
            g = i4;
        }
        int i12 = this.o[i4][i5][i2];
        int i13 = this.o[i4][i5 + 1][i2];
        int i14 = this.o[i4][i5 + 1][i2 + 1];
        int i15 = this.o[i4][i5][i2 + 1];
        ObjectComposition objectCompositionC = ObjectComposition.c(i6);
        if (i7 == 1 || i7 == 3) {
            i8 = objectCompositionC.af;
            i9 = objectCompositionC.U;
        } else {
            i8 = objectCompositionC.U;
            i9 = objectCompositionC.af;
        }
        int i16 = (((i12 + i13) + i14) + i15) >> 2;
        int i17 = (i5 << 7) + (i8 << 6);
        int i18 = (i2 << 7) + (i9 << 6);
        int i19 = Client.eh + ((i17 - 6) >> 7);
        int i20 = Client.ei + ((i18 - 6) >> 7);
        int i21 = i5 + (i2 << 7) + ((i6 > 32767 ? i6 & 32767 : i6) << 14) + 1073741824;
        if (!objectCompositionC.ar) {
            i21 -= Integer.MIN_VALUE;
        }
        byte b2 = (byte) ((i7 << 6) + i3);
        if (i3 == 22) {
            if (!zA && h && !objectCompositionC.ar && !objectCompositionC.P) {
                if (!objectCompositionC.aj) {
                    return;
                }
                class_108 class_108Var = class_107.a;
                class_108 class_108Var2 = class_107.a;
                if (class_108Var != class_108.c) {
                    return;
                }
            }
            class_46Var.a(i4, i16, i2, (objectCompositionC.au == -1 && objectCompositionC.ad == null) ? objectCompositionC.a(22, i7, this.o[i4], i17, i16, i18, true, 0) : new class_69(i6, i7, 22, i13, i14, i12, i15, objectCompositionC.au, objectCompositionC.at), b2, i21, i5, i6);
            if (objectCompositionC.aj && objectCompositionC.ar && class_130Var != null) {
                class_130Var.a(i2, i5);
                return;
            }
            return;
        }
        if (i3 == 10 || i3 == 11) {
            class_48 class_48VarA = (objectCompositionC.au == -1 && objectCompositionC.ad == null) ? objectCompositionC.a(10, i7, this.o[i4], i17, i16, i18, true, 0) : new class_69(i6, i7, 10, i13, i14, i12, i15, objectCompositionC.au, objectCompositionC.at);
            if (class_48VarA != null) {
                int i22 = i3 == 11 ? 0 + 256 : 0;
                if (i7 == 1 || i7 == 3) {
                    i10 = objectCompositionC.af;
                    i11 = objectCompositionC.U;
                } else {
                    i10 = objectCompositionC.U;
                    i11 = objectCompositionC.af;
                }
                if (class_46Var.a(i21, b2, i16, i11, class_48VarA, i10, i4, i22, i2, i5, i6) && objectCompositionC.as) {
                    ColorUtility colorUtilityA = class_48VarA instanceof ColorUtility ? (ColorUtility) class_48VarA : objectCompositionC.a(10, i7, i12, i13, i14, i15, -1, -1);
                    if (colorUtilityA != null) {
                        for (int i23 = 0; i23 <= i10; i23++) {
                            for (int i24 = 0; i24 <= i11; i24++) {
                                int i25 = colorUtilityA.aD / 4;
                                if (i25 > 30) {
                                    i25 = 30;
                                }
                                if (i25 > this.r[i4][i5 + i23][i2 + i24]) {
                                    this.r[i4][i5 + i23][i2 + i24] = (byte) i25;
                                }
                            }
                        }
                    }
                }
            }
            if (!objectCompositionC.aj || class_130Var == null) {
                return;
            }
            class_130Var.a(objectCompositionC.ab, objectCompositionC.U, objectCompositionC.af, i5, i2, i7);
            return;
        }
        if (i3 >= 12) {
            class_46Var.a(i21, b2, i16, 1, (objectCompositionC.au == -1 && objectCompositionC.ad == null) ? objectCompositionC.a(i3, i7, this.o[i4], i17, i16, i18, true, 0) : new class_69(i6, i7, i3, i13, i14, i12, i15, objectCompositionC.au, objectCompositionC.at), 1, i4, 0, i2, i5, i6);
            if (i3 >= 12 && i3 <= 17 && i3 != 13 && i4 > 0) {
                int[] iArr = this.s[i4][i5];
                iArr[i2] = iArr[i2] | G.ce;
            }
            if (!objectCompositionC.aj || class_130Var == null) {
                return;
            }
            class_130Var.a(objectCompositionC.ab, objectCompositionC.U, objectCompositionC.af, i5, i2, i7);
            return;
        }
        if (i3 == 0) {
            class_46Var.a(E[i7], (objectCompositionC.au == -1 && objectCompositionC.ad == null) ? objectCompositionC.a(0, i7, this.o[i4], i17, i16, i18, true, 0) : new class_69(i6, i7, 0, i13, i14, i12, i15, objectCompositionC.au, objectCompositionC.at), i21, i2, b2, i5, (class_48) null, i16, 0, i4, i6);
            if (i7 == 0) {
                if (objectCompositionC.as) {
                    this.r[i4][i5][i2] = 50;
                    this.r[i4][i5][i2 + 1] = 50;
                }
                if (objectCompositionC.ah) {
                    int[] iArr2 = this.s[i4][i5];
                    iArr2[i2] = iArr2[i2] | aU.jq_;
                }
            } else if (i7 == 1) {
                if (objectCompositionC.as) {
                    this.r[i4][i5][i2 + 1] = 50;
                    this.r[i4][i5 + 1][i2 + 1] = 50;
                }
                if (objectCompositionC.ah) {
                    int[] iArr3 = this.s[i4][i5];
                    int i26 = i2 + 1;
                    iArr3[i26] = iArr3[i26] | aU.li;
                }
            } else if (i7 == 2) {
                if (objectCompositionC.as) {
                    this.r[i4][i5 + 1][i2] = 50;
                    this.r[i4][i5 + 1][i2 + 1] = 50;
                }
                if (objectCompositionC.ah) {
                    int[] iArr4 = this.s[i4][i5 + 1];
                    iArr4[i2] = iArr4[i2] | aU.jq_;
                }
            } else if (i7 == 3) {
                if (objectCompositionC.as) {
                    this.r[i4][i5][i2] = 50;
                    this.r[i4][i5 + 1][i2] = 50;
                }
                if (objectCompositionC.ah) {
                    int[] iArr5 = this.s[i4][i5];
                    iArr5[i2] = iArr5[i2] | aU.li;
                }
            }
            if (objectCompositionC.aj && class_130Var != null) {
                if (i6 == 1415) {
                }
                class_130Var.a(i2, i7, i5, i3, objectCompositionC.ab);
            }
            if (objectCompositionC.ap != 16) {
                class_46Var.c(i2, objectCompositionC.ap, i5, i4);
                return;
            }
            return;
        }
        if (i3 == 1) {
            class_46Var.a(x[i7], (objectCompositionC.au == -1 && objectCompositionC.ad == null) ? objectCompositionC.a(1, i7, this.o[i4], i17, i16, i18, true, 0) : new class_69(i6, i7, 1, i13, i14, i12, i15, objectCompositionC.au, objectCompositionC.at), i21, i2, b2, i5, (class_48) null, i16, 0, i4, i6);
            if (objectCompositionC.as) {
                if (i7 == 0) {
                    this.r[i4][i5][i2 + 1] = 50;
                } else if (i7 == 1) {
                    this.r[i4][i5 + 1][i2 + 1] = 50;
                } else if (i7 == 2) {
                    this.r[i4][i5 + 1][i2] = 50;
                } else if (i7 == 3) {
                    this.r[i4][i5][i2] = 50;
                }
            }
            if (!objectCompositionC.aj || class_130Var == null) {
                return;
            }
            class_130Var.a(i2, i7, i5, i3, objectCompositionC.ab);
            return;
        }
        if (i3 == 2) {
            int i27 = (i7 + 1) & 3;
            if (objectCompositionC.au == -1 && objectCompositionC.ad == null) {
                class_69Var = objectCompositionC.a(2, 4 + i7, this.o[i4], i17, i16, i18, true, 0);
                class_69Var2 = objectCompositionC.a(2, i27, this.o[i4], i17, i16, i18, true, 0);
            } else {
                class_69Var = new class_69(i6, 4 + i7, 2, i13, i14, i12, i15, objectCompositionC.au, objectCompositionC.at);
                class_69Var2 = new class_69(i6, i27, 2, i13, i14, i12, i15, objectCompositionC.au, objectCompositionC.at);
            }
            class_46Var.a(E[i7], class_69Var, i21, i2, b2, i5, class_69Var2, i16, E[i27], i4, i6);
            if (objectCompositionC.ah) {
                if (i7 == 0) {
                    int[] iArr6 = this.s[i4][i5];
                    iArr6[i2] = iArr6[i2] | aU.jq_;
                    int[] iArr7 = this.s[i4][i5];
                    int i28 = i2 + 1;
                    iArr7[i28] = iArr7[i28] | aU.li;
                } else if (i7 == 1) {
                    int[] iArr8 = this.s[i4][i5];
                    int i29 = i2 + 1;
                    iArr8[i29] = iArr8[i29] | aU.li;
                    int[] iArr9 = this.s[i4][i5 + 1];
                    iArr9[i2] = iArr9[i2] | aU.jq_;
                } else if (i7 == 2) {
                    int[] iArr10 = this.s[i4][i5 + 1];
                    iArr10[i2] = iArr10[i2] | aU.jq_;
                    int[] iArr11 = this.s[i4][i5];
                    iArr11[i2] = iArr11[i2] | aU.li;
                } else if (i7 == 3) {
                    int[] iArr12 = this.s[i4][i5];
                    iArr12[i2] = iArr12[i2] | aU.li;
                    int[] iArr13 = this.s[i4][i5];
                    iArr13[i2] = iArr13[i2] | aU.jq_;
                }
            }
            if (objectCompositionC.aj && class_130Var != null) {
                class_130Var.a(i2, i7, i5, i3, objectCompositionC.ab);
            }
            if (objectCompositionC.ap != 16) {
                class_46Var.c(i2, objectCompositionC.ap, i5, i4);
                return;
            }
            return;
        }
        if (i3 == 3) {
            class_46Var.a(x[i7], (objectCompositionC.au == -1 && objectCompositionC.ad == null) ? objectCompositionC.a(3, i7, this.o[i4], i17, i16, i18, true, 0) : new class_69(i6, i7, 3, i13, i14, i12, i15, objectCompositionC.au, objectCompositionC.at), i21, i2, b2, i5, (class_48) null, i16, 0, i4, i6);
            if (objectCompositionC.as) {
                if (i7 == 0) {
                    this.r[i4][i5][i2 + 1] = 50;
                } else if (i7 == 1) {
                    this.r[i4][i5 + 1][i2 + 1] = 50;
                } else if (i7 == 2) {
                    this.r[i4][i5 + 1][i2] = 50;
                } else if (i7 == 3) {
                    this.r[i4][i5][i2] = 50;
                }
            }
            if (!objectCompositionC.aj || class_130Var == null) {
                return;
            }
            class_130Var.a(i2, i7, i5, i3, objectCompositionC.ab);
            return;
        }
        if (i3 == 9) {
            class_46Var.a(i21, b2, i16, 1, (objectCompositionC.au == -1 && objectCompositionC.ad == null) ? objectCompositionC.a(i3, i7, this.o[i4], i17, i16, i18, true, 0) : new class_69(i6, i7, i3, i13, i14, i12, i15, objectCompositionC.au, objectCompositionC.at), 1, i4, 0, i2, i5, i6);
            if (!objectCompositionC.aj || class_130Var == null) {
                return;
            }
            class_130Var.a(objectCompositionC.ab, objectCompositionC.U, objectCompositionC.af, i5, i2, i7);
            return;
        }
        if (objectCompositionC.ag) {
            if (i7 == 1) {
                i15 = i14;
                i14 = i13;
                i13 = i12;
                i12 = i15;
            } else if (i7 == 2) {
                i15 = i13;
                i13 = i15;
                i14 = i12;
                i12 = i14;
            } else if (i7 == 3) {
                i15 = i12;
                i12 = i13;
                i13 = i14;
                i14 = i15;
            }
        }
        if (i3 == 4) {
            class_46Var.a(i21, i2, i7 * 512, i4, 0, i16, (objectCompositionC.au == -1 && objectCompositionC.ad == null) ? objectCompositionC.a(4, 0, this.o[i4], i17, i16, i18, true, 0) : new class_69(i6, 0, 4, i13, i14, i12, i15, objectCompositionC.au, objectCompositionC.at), i5, b2, 0, E[i7], i6);
            return;
        }
        if (i3 == 5) {
            int i30 = class_46Var.a(i4, i5, i2) > 0 ? ObjectComposition.c(class_46Var.b(i4, i5, i2)).ap : 16;
            class_46Var.a(i21, i2, i7 * 512, i4, u[i7] * i30, i16, (objectCompositionC.au == -1 && objectCompositionC.ad == null) ? objectCompositionC.a(4, 0, this.o[i4], i17, i16, i18, true, 0) : new class_69(i6, 0, 4, i13, i14, i12, i15, objectCompositionC.au, objectCompositionC.at), i5, b2, z[i7] * i30, E[i7], i6);
            return;
        }
        if (i3 == 6) {
            class_46Var.a(i21, i2, i7, i4, 0, i16, (objectCompositionC.au == -1 && objectCompositionC.ad == null) ? objectCompositionC.a(4, 0, this.o[i4], i17, i16, i18, true, 0) : new class_69(i6, 0, 4, i13, i14, i12, i15, objectCompositionC.au, objectCompositionC.at), i5, b2, 0, 256, i6);
        } else if (i3 == 7) {
            class_46Var.a(i21, i2, i7, i4, 0, i16, (objectCompositionC.au == -1 && objectCompositionC.ad == null) ? objectCompositionC.a(4, 0, this.o[i4], i17, i16, i18, true, 0) : new class_69(i6, 0, 4, i13, i14, i12, i15, objectCompositionC.au, objectCompositionC.at), i5, b2, 0, 512, i6);
        } else if (i3 == 8) {
            class_46Var.a(i21, i2, i7, i4, 0, i16, (objectCompositionC.au == -1 && objectCompositionC.ad == null) ? objectCompositionC.a(4, 0, this.o[i4], i17, i16, i18, true, 0) : new class_69(i6, 0, 4, i13, i14, i12, i15, objectCompositionC.au, objectCompositionC.at), i5, b2, 0, 768, i6);
        }
    }

    private static int c(int i2, int i3, int i4) {
        int i5 = i2 / i4;
        int i6 = i2 & (i4 - 1);
        int i7 = i3 / i4;
        return b(b(f(i5, i7), f(i5 + 1, i7), i6, i4), b(f(i5, i7 + 1), f(i5 + 1, i7 + 1), i6, i4), i3 & (i4 - 1), i4);
    }

    private int d(int i2, int i3, int i4) {
        if (i4 > 179) {
            i3 /= 2;
        }
        if (i4 > 192) {
            i3 /= 2;
        }
        if (i4 > 217) {
            i3 /= 2;
        }
        if (i4 > 243) {
            i3 /= 2;
        }
        return ((i2 / 4) << 10) + ((i3 / 32) << 7) + (i4 / 2);
    }

    public static boolean a(int i2, int i3) {
        ObjectComposition objectCompositionC = ObjectComposition.c(i2);
        if (i3 == 11) {
            i3 = 10;
        }
        if (i3 >= 5 && i3 <= 8) {
            i3 = 4;
        }
        return objectCompositionC.d(i3);
    }

    public final void a(int i2, int i3, class_130[] class_130VarArr, int i4, int i5, byte[] bArr, int i6, int i7, int i8) {
        for (int i9 = 0; i9 < 8; i9++) {
            for (int i10 = 0; i10 < 8; i10++) {
                if (i4 + i9 > 0 && i4 + i9 < 103 && i8 + i10 > 0 && i8 + i10 < 103) {
                    int[] iArr = class_130VarArr[i7].a[i4 + i9];
                    int i11 = i8 + i10;
                    iArr[i11] = iArr[i11] & (-16777217);
                }
            }
        }
        Buffer buffer = new Buffer(bArr);
        for (int i12 = 0; i12 < 4; i12++) {
            for (int i13 = 0; i13 < 64; i13++) {
                for (int i14 = 0; i14 < 64; i14++) {
                    if (i12 != i2 || i13 < i5 || i13 >= i5 + 8 || i14 < i6 || i14 >= i6 + 8) {
                        a(buffer, 0, 0, -1, -1, 0, 0);
                    } else {
                        a(buffer, 0, 0, i4 + class_72.a(i3, i14 & 7, i13 & 7), i8 + class_72.b(i14 & 7, i3, i13 & 7), i7, i3);
                    }
                }
            }
        }
    }

    public void a(byte[] bArr, int i2, int i3, int i4, int i5, class_130[] class_130VarArr) {
        for (int i6 = 0; i6 < 4; i6++) {
            for (int i7 = 0; i7 < 64; i7++) {
                for (int i8 = 0; i8 < 64; i8++) {
                    if (i2 + i7 > 0 && i2 + i7 < 103 && i3 + i8 > 0 && i3 + i8 < 103) {
                        int[] iArr = class_130VarArr[i6].a[i2 + i7];
                        int i9 = i3 + i8;
                        iArr[i9] = iArr[i9] & (-16777217);
                    }
                }
            }
        }
        Buffer buffer = new Buffer(bArr);
        for (int i10 = 0; i10 < 4; i10++) {
            for (int i11 = 0; i11 < 64; i11++) {
                for (int i12 = 0; i12 < 64; i12++) {
                    try {
                        a(buffer, i4, i5, i11 + i2, i12 + i3, i10, 0);
                    } catch (Exception e2) {
                        if (Configuration.d.booleanValue()) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    private void a(Buffer buffer, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i6 < 0 || i6 >= 4 || i4 < 0 || i4 >= 104 || i5 < 0 || i5 >= 104) {
            while (true) {
                int iA = class_107.a == class_108.c ? buffer.A() : buffer.y();
                if (iA == 0) {
                    return;
                }
                if (iA == 1) {
                    buffer.y();
                    return;
                } else if (iA <= 49) {
                    int iB = class_107.a == class_108.c ? buffer.B() : buffer.y();
                }
            }
        } else {
            this.D[i6][i4][i5] = 0;
            while (true) {
                int iA2 = class_107.a == class_108.c ? buffer.A() : buffer.y();
                if (iA2 == 0) {
                    if (i6 != 0) {
                        this.o[i6][i4][i5] = this.o[i6 - 1][i4][i5] - 240;
                        return;
                    }
                    int i8 = i2 + i4;
                    int i9 = i3 + i5;
                    int i10 = ((i8 >> 6) * 256) + (i9 >> 6);
                    int i11 = i8 & 63;
                    int i12 = i9 & 63;
                    if (Client.ew.g.h().r_(i10)) {
                        int iC = Client.ew.g.h().c(i10);
                        i8 = ((iC >> 8) << 6) + i11;
                        i9 = ((iC & 255) << 6) + i12;
                    }
                    this.o[0][i4][i5] = (-p.a(i8 + 932731, i9 + 556238)) * 8;
                    return;
                }
                if (iA2 == 1) {
                    int iY = buffer.y();
                    if (iY == 1) {
                        iY = 0;
                    }
                    if (i6 == 0) {
                        this.o[0][i4][i5] = (-iY) * 8;
                        return;
                    } else {
                        this.o[i6][i4][i5] = this.o[i6 - 1][i4][i5] - (iY * 8);
                        return;
                    }
                }
                if (iA2 <= 49) {
                    p[i6][i4][i5] = (short) (class_107.a == class_108.c ? buffer.B() : buffer.y());
                    if (Client.b(i4 + i2, i5 + i3, i6)) {
                        p[i6][i4][i5] = 0;
                    } else {
                        this.t[i6][i4][i5] = (byte) ((iA2 - 2) / 4);
                        this.C[i6][i4][i5] = (byte) (((iA2 - 2) + i7) & 3);
                    }
                } else if (iA2 <= 81) {
                    if (!Client.b(i4 + i2, i5 + i3, i6)) {
                        this.D[i6][i4][i5] = (byte) (iA2 - 49);
                    }
                } else if (!Client.b(i4 + i2, i5 + i3, i6)) {
                    this.y[i6][i4][i5] = iA2 - 81;
                }
            }
        }
    }

    private int e(int i2, int i3, int i4) {
        if ((this.D[i3][i4][i2] & 8) != 0) {
            int i5 = (((i4 + Client.eh) >> 6) * 256) + ((i2 + Client.ei) >> 6);
            if (Configuration.ax || i5 != 11601) {
                return 0;
            }
        }
        return (i3 <= 0 || (this.D[1][i4][i2] & 2) == 0) ? i3 : i3 - 1;
    }

    public final void a(class_130[] class_130VarArr, class_46 class_46Var, int i2, int i3, int i4, int i5, byte[] bArr, int i6, int i7, int i8) {
        Buffer buffer = new Buffer(bArr);
        int i9 = -1;
        while (true) {
            int iF = buffer.f();
            if (iF == 0) {
                return;
            }
            i9 += iF;
            int i10 = 0;
            while (true) {
                int iF2 = buffer.f();
                if (iF2 == 0) {
                    break;
                }
                i10 += iF2 - 1;
                int i11 = i10 & 63;
                int i12 = (i10 >> 6) & 63;
                int i13 = i10 >> 12;
                int iY = buffer.y();
                int i14 = iY >> 2;
                int i15 = iY & 3;
                if (i13 == i2 && i12 >= i6 && i12 < i6 + 8 && i11 >= i4 && i11 < i4 + 8) {
                    ObjectComposition objectCompositionC = ObjectComposition.c(i9);
                    int iA = i3 + class_72.a(i7, (i15 == 0 || i15 == 2) ? objectCompositionC.af : objectCompositionC.U, i12 & 7, i11 & 7, (i15 == 0 || i15 == 2) ? objectCompositionC.U : objectCompositionC.af);
                    int iB = i8 + class_72.b(i11 & 7, (i15 == 0 || i15 == 2) ? objectCompositionC.af : objectCompositionC.U, i7, (i15 == 0 || i15 == 2) ? objectCompositionC.U : objectCompositionC.af, i12 & 7);
                    if (iA > 0 && iB > 0 && iA < 103 && iB < 103) {
                        if ((this.D[1][iA][iB] & 2) == 2) {
                            int i16 = i13 - 1;
                        }
                        class_130 class_130Var = i5 >= 0 ? class_130VarArr[i5] : null;
                        if (!Configuration.ae) {
                            boolean z2 = false;
                            for (int i17 : b) {
                                if (i17 == i9) {
                                    z2 = true;
                                    break;
                                }
                            }
                            if (z2) {
                                if (i14 == 0 && (i9 < 15305 || i9 > 15317)) {
                                    if (i9 != 15402 && i9 != 15403 && i9 < 15000) {
                                        i9 = 13830;
                                    }
                                }
                            }
                        }
                        int i18 = iA + Client.eh;
                        int i19 = iB + Client.ei;
                        a(iB, class_46Var, class_130Var, i14, i5, iA, i9, (i15 + i7) & 3);
                    }
                }
            }
        }
    }

    private static int b(int i2, int i3, int i4, int i5) {
        if (class_107.a == class_108.c) {
            int i6 = (65536 - class_332.w[(i4 * 1024) / i5]) >> 1;
            return (((65536 - i6) * i2) >> 16) + ((i6 * i3) >> 16);
        }
        int i7 = (65536 - class_332.w[(i4 * 1024) / i5]) >> 1;
        return ((i2 * (65536 - i7)) >> 16) + ((i3 * i7) >> 16);
    }

    static final int a(int i2, int i3, int i4) {
        if (i4 > 179) {
            i3 /= 2;
        }
        if (i4 > 192) {
            i3 /= 2;
        }
        if (i4 > 217) {
            i3 /= 2;
        }
        if (i4 > 243) {
            i3 /= 2;
        }
        return (i4 / 2) + ((i2 / 4) << 10) + ((i3 / 32) << 7);
    }

    static final int b(int i2, int i3) {
        if (i2 == -2) {
            return 12345678;
        }
        if (i2 == -1) {
            if (i3 < 2) {
                i3 = 2;
            } else if (i3 > 126) {
                i3 = 126;
            }
            return i3;
        }
        int i4 = (i3 * (i2 & 127)) / 128;
        if (i4 < 2) {
            i4 = 2;
        } else if (i4 > 126) {
            i4 = 126;
        }
        return i4 + (i2 & 65408);
    }

    private int e(int i2, int i3) {
        if (i2 == -2) {
            return 12345678;
        }
        if (i2 == -1) {
            if (i3 < 0) {
                i3 = 0;
            } else if (i3 > 127) {
                i3 = 127;
            }
            return 127 - i3;
        }
        int i4 = (i3 * (i2 & 127)) / 128;
        if (i4 < 2) {
            i4 = 2;
        } else if (i4 > 126) {
            i4 = 126;
        }
        return (i2 & 65408) + i4;
    }

    private static int f(int i2, int i3) {
        return ((((c(i2 - 1, i3 - 1) + c(i2 + 1, i3 - 1)) + c(i2 - 1, i3 + 1)) + c(i2 + 1, i3 + 1)) / 16) + ((((c(i2 - 1, i3) + c(i2 + 1, i3)) + c(i2, i3 - 1)) + c(i2, i3 + 1)) / 8) + (c(i2, i3) / 4);
    }

    private static int g(int i2, int i3) {
        if (i2 == -1) {
            return 12345678;
        }
        int i4 = (i3 * (i2 & 127)) / 128;
        if (i4 < 2) {
            i4 = 2;
        } else if (i4 > 126) {
            i4 = 126;
        }
        return (i2 & 65408) + i4;
    }

    public static void a(class_46 class_46Var, int i2, int i3, int i4, int i5, class_130 class_130Var, int[][][] iArr, int i6, int i7, int i8) {
        int i9;
        int i10;
        class_48 class_69Var;
        class_48 class_69Var2;
        int i11 = iArr[i5][i6][i3];
        int i12 = iArr[i5][i6 + 1][i3];
        int i13 = iArr[i5][i6 + 1][i3 + 1];
        int i14 = iArr[i5][i6][i3 + 1];
        int i15 = (((i11 + i12) + i13) + i14) >> 2;
        ObjectComposition objectCompositionC = ObjectComposition.c(i7);
        int i16 = i6 + (i3 << 7) + ((i7 > 32767 ? i7 & 32767 : i7) << 14) + 1073741824;
        if (!objectCompositionC.ar) {
            i16 -= Integer.MIN_VALUE;
        }
        byte b2 = (byte) ((i2 << 6) + i4);
        if (!objectCompositionC.ar) {
            i16 -= Integer.MIN_VALUE;
        }
        if (i4 == 22) {
            class_46Var.a(i8, i15, i3, (objectCompositionC.au == -1 && objectCompositionC.ad == null && !class_313.d().l().a(i7)) ? objectCompositionC.a(22, i2, i11, i12, i13, i14, -1, -1) : new class_69(i7, i2, 22, i12, i13, i11, i14, objectCompositionC.au, objectCompositionC.at), b2, i16, i6, i7);
            if (objectCompositionC.aj && objectCompositionC.ar) {
                class_130Var.a(i3, i6);
                return;
            }
            return;
        }
        if (i4 == 10 || i4 == 11) {
            class_48 class_48VarA = (objectCompositionC.au == -1 && objectCompositionC.ad == null && !class_313.d().l().a(i7)) ? objectCompositionC.a(10, i2, i11, i12, i13, i14, -1, -1) : new class_69(i7, i2, 10, i12, i13, i11, i14, objectCompositionC.au, objectCompositionC.at);
            if (class_48VarA != null) {
                int i17 = 0;
                if (i4 == 11) {
                    i17 = 0 + 256;
                }
                if (i2 == 1 || i2 == 3) {
                    i9 = objectCompositionC.af;
                    i10 = objectCompositionC.U;
                } else {
                    i9 = objectCompositionC.U;
                    i10 = objectCompositionC.af;
                }
                class_46Var.a(i16, b2, i15, i10, class_48VarA, i9, i8, i17, i3, i6, i7);
            }
            if (objectCompositionC.aj) {
                class_130Var.a(objectCompositionC.ab, objectCompositionC.U, objectCompositionC.af, i6, i3, i2);
                return;
            }
            return;
        }
        if (i4 >= 12) {
            class_46Var.a(i16, b2, i15, 1, (objectCompositionC.au == -1 && objectCompositionC.ad == null && !class_313.d().l().a(i7)) ? objectCompositionC.a(i4, i2, i11, i12, i13, i14, -1, -1) : new class_69(i7, i2, i4, i12, i13, i11, i14, objectCompositionC.au, objectCompositionC.at), 1, i8, 0, i3, i6, i7);
            if (objectCompositionC.aj) {
                class_130Var.a(objectCompositionC.ab, objectCompositionC.U, objectCompositionC.af, i6, i3, i2);
                return;
            }
            return;
        }
        if (i4 == 0) {
            class_46Var.a(E[i2], (objectCompositionC.au == -1 && objectCompositionC.ad == null && !class_313.d().l().a(i7)) ? objectCompositionC.a(0, i2, i11, i12, i13, i14, -1, -1) : new class_69(i7, i2, 0, i12, i13, i11, i14, objectCompositionC.au, objectCompositionC.at), i16, i3, b2, i6, (class_48) null, i15, 0, i8, i7);
            if (objectCompositionC.aj) {
                class_130Var.a(i3, i2, i6, i4, objectCompositionC.ab);
                return;
            }
            return;
        }
        if (i4 == 1) {
            class_46Var.a(x[i2], (objectCompositionC.au == -1 && objectCompositionC.ad == null && !class_313.d().l().a(i7)) ? objectCompositionC.a(1, i2, i11, i12, i13, i14, -1, -1) : new class_69(i7, i2, 1, i12, i13, i11, i14, objectCompositionC.au, objectCompositionC.at), i16, i3, b2, i6, (class_48) null, i15, 0, i8, i7);
            if (objectCompositionC.aj) {
                class_130Var.a(i3, i2, i6, i4, objectCompositionC.ab);
                return;
            }
            return;
        }
        if (i4 == 2) {
            int i18 = (i2 + 1) & 3;
            if (objectCompositionC.au == -1 && objectCompositionC.ad == null && !class_313.d().l().a(i7)) {
                class_69Var = objectCompositionC.a(2, 4 + i2, i11, i12, i13, i14, -1, -1);
                class_69Var2 = objectCompositionC.a(2, i18, i11, i12, i13, i14, -1, -1);
            } else {
                class_69Var = new class_69(i7, 4 + i2, 2, i12, i13, i11, i14, objectCompositionC.au, objectCompositionC.at);
                class_69Var2 = new class_69(i7, i18, 2, i12, i13, i11, i14, objectCompositionC.au, objectCompositionC.at);
            }
            class_46Var.a(E[i2], class_69Var, i16, i3, b2, i6, class_69Var2, i15, E[i18], i8, i7);
            if (objectCompositionC.aj) {
                class_130Var.a(i3, i2, i6, i4, objectCompositionC.ab);
                return;
            }
            return;
        }
        if (i4 == 3) {
            class_46Var.a(x[i2], (objectCompositionC.au == -1 && objectCompositionC.ad == null && !class_313.d().l().a(i7)) ? objectCompositionC.a(3, i2, i11, i12, i13, i14, -1, -1) : new class_69(i7, i2, 3, i12, i13, i11, i14, objectCompositionC.au, objectCompositionC.at), i16, i3, b2, i6, (class_48) null, i15, 0, i8, i7);
            if (objectCompositionC.aj) {
                class_130Var.a(i3, i2, i6, i4, objectCompositionC.ab);
                return;
            }
            return;
        }
        if (i4 == 9) {
            class_46Var.a(i16, b2, i15, 1, (objectCompositionC.au == -1 && objectCompositionC.ad == null && !class_313.d().l().a(i7)) ? objectCompositionC.a(i4, i2, i11, i12, i13, i14, -1, -1) : new class_69(i7, i2, i4, i12, i13, i11, i14, objectCompositionC.au, objectCompositionC.at), 1, i8, 0, i3, i6, i7);
            if (objectCompositionC.aj) {
                class_130Var.a(objectCompositionC.ab, objectCompositionC.U, objectCompositionC.af, i6, i3, i2);
                return;
            }
            return;
        }
        if (objectCompositionC.ag) {
            if (i2 == 1) {
                i14 = i13;
                i13 = i12;
                i12 = i11;
                i11 = i14;
            } else if (i2 == 2) {
                i14 = i12;
                i12 = i14;
                i13 = i11;
                i11 = i13;
            } else if (i2 == 3) {
                i14 = i11;
                i11 = i12;
                i12 = i13;
                i13 = i14;
            }
        }
        if (i4 == 4) {
            class_46Var.a(i16, i3, i2 * 512, i8, 0, i15, (objectCompositionC.au == -1 && objectCompositionC.ad == null && !class_313.d().l().a(i7)) ? objectCompositionC.a(4, 0, i11, i12, i13, i14, -1, -1) : new class_69(i7, 0, 4, i12, i13, i11, i14, objectCompositionC.au, objectCompositionC.at), i6, b2, 0, E[i2], i7);
            return;
        }
        if (i4 == 5) {
            int i19 = 16;
            if (class_46Var.a(i8, i6, i3) > 0) {
                i19 = ObjectComposition.c(class_46Var.b(i8, i6, i3)).ap;
            }
            class_46Var.a(i16, i3, i2 * 512, i8, u[i2] * i19, i15, (objectCompositionC.au == -1 && objectCompositionC.ad == null && !class_313.d().l().a(i7)) ? objectCompositionC.a(4, 0, i11, i12, i13, i14, -1, -1) : new class_69(i7, 0, 4, i12, i13, i11, i14, objectCompositionC.au, objectCompositionC.at), i6, b2, z[i2] * i19, E[i2], i7);
            return;
        }
        if (i4 == 6) {
            class_46Var.a(i16, i3, i2, i8, 0, i15, (objectCompositionC.au == -1 && objectCompositionC.ad == null && !class_313.d().l().a(i7)) ? objectCompositionC.a(4, 0, i11, i12, i13, i14, -1, -1) : new class_69(i7, 0, 4, i12, i13, i11, i14, objectCompositionC.au, objectCompositionC.at), i6, b2, 0, 256, i7);
        } else if (i4 == 7) {
            class_46Var.a(i16, i3, i2, i8, 0, i15, (objectCompositionC.au == -1 && objectCompositionC.ad == null && !class_313.d().l().a(i7)) ? objectCompositionC.a(4, 0, i11, i12, i13, i14, -1, -1) : new class_69(i7, 0, 4, i12, i13, i11, i14, objectCompositionC.au, objectCompositionC.at), i6, b2, 0, 512, i7);
        } else if (i4 == 8) {
            class_46Var.a(i16, i3, i2, i8, 0, i15, (objectCompositionC.au == -1 && objectCompositionC.ad == null && !class_313.d().l().a(i7)) ? objectCompositionC.a(4, 0, i11, i12, i13, i14, -1, -1) : new class_69(i7, 0, 4, i12, i13, i11, i14, objectCompositionC.au, objectCompositionC.at), i6, b2, 0, 768, i7);
        }
    }

    public static boolean a(int i2, byte[] bArr, int i3) {
        boolean zC = true;
        Buffer buffer = new Buffer(bArr);
        int i4 = -1;
        while (true) {
            int iF = buffer.f();
            if (iF == 0) {
                return zC;
            }
            i4 += iF;
            int i5 = 0;
            boolean z2 = false;
            while (true) {
                if (!z2) {
                    int iF2 = buffer.f();
                    if (iF2 == 0) {
                        break;
                    }
                    i5 += iF2 - 1;
                    int iY = buffer.y() >> 2;
                    int i6 = ((i5 >> 6) & 63) + i2;
                    int i7 = (i5 & 63) + i3;
                    if (i6 > 0 && i7 > 0 && i6 < 103 && i7 < 103) {
                        ObjectComposition objectCompositionC = ObjectComposition.c(i4);
                        boolean z3 = h;
                        if (iY != 22 || 0 == 0 || objectCompositionC.ar || objectCompositionC.P || a(i4)) {
                            zC &= objectCompositionC.c();
                            z2 = true;
                        }
                    }
                } else {
                    if (buffer.f() == 0) {
                        break;
                    }
                    buffer.y();
                }
            }
        }
    }

    public final void a(int i2, class_130[] class_130VarArr, int i3, class_46 class_46Var, byte[] bArr) {
        Buffer buffer = new Buffer(bArr);
        int i4 = -1;
        while (true) {
            int iD = buffer.d();
            if (iD == 0) {
                return;
            }
            i4 += iD;
            int i5 = 0;
            while (true) {
                int iE = buffer.e();
                if (iE == 0) {
                    break;
                }
                i5 += iE - 1;
                int i6 = (i5 >> 12) & 3;
                int iY = buffer.y();
                int i7 = iY >> 2;
                int i8 = iY & 3;
                int i9 = ((i5 >> 6) & 63) + i2;
                int i10 = (i5 & 63) + i3;
                if (i9 > 0 && i10 > 0 && i9 < 103 && i10 < 103 && i6 >= 0 && i6 < 4) {
                    int i11 = i6;
                    if ((this.D[1][i9][i10] & 2) == 2) {
                        i11--;
                    }
                    class_130 class_130Var = null;
                    if (i11 >= 0) {
                        if (i11 < class_130VarArr.length) {
                            class_130Var = class_130VarArr[i11];
                        } else {
                            continue;
                        }
                    }
                    int i12 = i9 + Client.eh;
                    int i13 = i10 + Client.ei;
                    if (!Client.b(i12, i13, i11) && (Configuration.r != class_150.d || i12 < 2729 || i12 > 2746 || i13 < 3460 || i13 > 3476 || i4 != 1092 || i7 != 10)) {
                        if (i12 != 2958 || i13 != 3820 || i4 != 1516) {
                            if (i12 != 2958 || i13 != 3821 || i4 != 1519) {
                                if (i4 != 1032 && i4 != 1596 && i4 != 1597 && i4 != 2038 && i4 != 11699 && i4 != 28928 && (i12 != 3336 || i13 != 3896)) {
                                    if (i12 != 3337 || i13 != 3896) {
                                        if (i4 != 15516 && i4 != 15514 && i4 != 24381 && (i12 != 3084 || i13 != 3512 || i4 != 24123)) {
                                            if (i12 != 3084 || i13 != 3510 || i4 != 26962) {
                                                if (i12 != 3084 || i13 != 3509 || i4 != 26962) {
                                                    if (i12 != 3078 || i13 != 3510 || i4 != 26957) {
                                                        if (i12 != 3081 || i13 != 3510 || i4 != 26957) {
                                                            if (i12 != 3080 || i13 != 3510 || i4 != 26961) {
                                                                if (i4 != 26945 && (((i12 != 3091 || i13 != 3495) && ((i12 != 3092 || i13 != 3496) && ((i12 != 3090 || i13 != 3496) && (i12 != 3090 || i13 != 3494)))) || (i4 != 26956 && i4 != 26959))) {
                                                                    if (((i12 != 3095 || i13 != 3499) && (i12 != 3095 || i13 != 3498)) || (i4 != 26970 && i4 != 26956)) {
                                                                        if (i12 != 3100 || i13 != 3513 || i7 != 10) {
                                                                            if (i12 != 3096 || i13 != 3501 || i4 != 1276) {
                                                                                if (i12 != 3085 || i13 != 3506 || i4 != 14507) {
                                                                                    if (i4 != 10802 && i4 != 10801 && i4 != 10800 && i4 != 10799) {
                                                                                        if (i4 == 5582) {
                                                                                            i4 = 12110;
                                                                                        }
                                                                                        if (i12 != 3169 || i13 != 9572) {
                                                                                            if (i4 != 26690 && i4 != 26825 && i4 != 7127 && i4 != 14209 && i4 != 26827 && i4 != 26828 && i4 != 26829 && i4 != 26353 && i4 != 26357 && i4 != 26349 && i4 != 26356 && i4 != 26352 && i4 != 26323 && i4 != 26327) {
                                                                                                if (i4 == 733) {
                                                                                                    i7 = 0;
                                                                                                }
                                                                                                boolean z2 = true;
                                                                                                for (int[] iArr : a) {
                                                                                                    if (i12 == iArr[0] && i13 == iArr[1]) {
                                                                                                        z2 = false;
                                                                                                    }
                                                                                                }
                                                                                                if (i12 != 3079 || i13 != 3258 || i7 != 10) {
                                                                                                    if (i4 != 30018 && i4 != 29845 && i4 != 10653 && (i12 < 2588 || i12 > 2596 || i13 < 3159 || i13 > 3165)) {
                                                                                                        if (i12 < 2584 || i12 > 2587 || i13 < 3156 || i13 > 3159) {
                                                                                                            if (i12 < 2962 || i12 > 2990 || i13 < 3744 || i13 > 3759) {
                                                                                                                if (i12 != 2283 || i13 != 3321) {
                                                                                                                    if (i12 != 2282 || i13 != 3315) {
                                                                                                                        if (i12 != 3727 || i13 != 5104) {
                                                                                                                            if (i12 != 3729 || i13 != 5071) {
                                                                                                                                if (i12 != 3734 || i13 != 5086) {
                                                                                                                                    if (i12 != 3754 || i13 != 5079) {
                                                                                                                                        if (i12 != 3754 || i13 != 5104) {
                                                                                                                                            if (i12 != 2900 || i13 != 2725) {
                                                                                                                                                if (i12 != 3248 || i13 != 9364) {
                                                                                                                                                    if (Configuration.r == class_150.d) {
                                                                                                                                                        if (i4 < 26893 || i4 > 26895) {
                                                                                                                                                            if (i4 < 4736 || i4 > 4741) {
                                                                                                                                                                if (i4 == 1189) {
                                                                                                                                                                    continue;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (i12 < 3076 || i12 > 3082 || i13 < 3487 || i13 > 3497 || (i12 == 3076 && i13 == 3487 && i7 != 22)) {
                                                                                                                                                        if (i12 != 3083 || (i13 != 3492 && i13 != 3491)) {
                                                                                                                                                            if (i7 != 10 || i12 < 2816 || i12 > 2824 || i13 < 2932 || i13 > 2941 || i12 == 2821 || i13 == 2934) {
                                                                                                                                                                if (i12 < 2867 || i12 > 2871 || i13 < 2980 || i13 > 2984 || i11 == 0 || i7 == 22) {
                                                                                                                                                                    if (i6 == 0 && i12 >= 3091 && i12 <= 3100) {
                                                                                                                                                                        if (i13 < 3507 || i13 > 3513 || (i4 != 26948 && i4 != 26885 && i4 != 26923 && i4 != 26946 && i4 != 26947 && i4 != 26955 && i4 != 26957 && i4 != 26958 && i4 != 26960 && i4 != 26961 && i4 != 26963 && i4 != 26982 && i4 != 26983)) {
                                                                                                                                                                            if (i12 < 3091 || i12 > 3092 || i13 != 3513) {
                                                                                                                                                                                if (i12 < 3094 || i12 > 3095 || i13 != 3510) {
                                                                                                                                                                                    if (i12 != 3092 || i13 != 3511) {
                                                                                                                                                                                        if (i12 != 3097 || i13 != 3513) {
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    if (i12 < 3103 || i12 > 3113 || i13 < 3686 || i13 > 3694) {
                                                                                                                                                                        if (i12 < 3040 || i12 > 3041 || i13 < 10307 || i13 > 10308) {
                                                                                                                                                                            if (i12 < 3022 || i12 > 3023 || i13 < 10311 || i13 > 10312) {
                                                                                                                                                                                if (i12 < 3044 || i12 > 3045 || i13 < 10341 || i13 > 10342) {
                                                                                                                                                                                    if (z2) {
                                                                                                                                                                                        int i14 = ((i12 >> 6) * 256) + (i13 >> 6);
                                                                                                                                                                                        boolean z3 = (i14 == 12693 || i14 == 12949 || !b(i9, i10, i6)) ? false : true;
                                                                                                                                                                                        try {
                                                                                                                                                                                            a(i10, class_46Var, class_130Var, i7, i6, i9, i4, i8);
                                                                                                                                                                                            if (z3) {
                                                                                                                                                                                                h = true;
                                                                                                                                                                                            }
                                                                                                                                                                                        } catch (Throwable th) {
                                                                                                                                                                                            if (z3) {
                                                                                                                                                                                                h = true;
                                                                                                                                                                                            }
                                                                                                                                                                                            throw th;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        continue;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean b(int i2, int i3, int i4) {
        int iA;
        if (class_107.a != class_108.c || !h || (iA = p[i4][i2][i3] & a()) <= 0 || iA - 1 >= class_122.b.length) {
            return false;
        }
        class_122 class_122Var = class_122.b[iA - 1];
        if (class_122Var.d != 16711935 && class_122Var.d != 0) {
            return false;
        }
        h = false;
        return true;
    }
}

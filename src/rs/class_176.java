package rs;

import com.sun.jna.platform.win32.aU;
import gnu.trove.f.b.bU;
import gnu.trove.f.b.cc;
import java.io.File;
import java.io.IOException;
import org.lwjgl.opengl.GL11;

/* JADX INFO: loaded from: client-final.jar:rs/class_176.class */
public final class class_176 {
    public static class_176[][] d;
    public static class_176[][] e;
    public int f;
    public class_35 g;
    public int h;
    public int[] k;
    public int[] l;
    public int[] m;
    public int[] n;
    public static boolean[] o;
    public static final cc<Boolean> a = new cc<>();
    public static final bU b = new bU();
    private static final int[] p = {3502, GL11.GL_GREEN_BIAS, 382, 55780, 13, 57784, 182};
    public static final int[] c = {4674, 4675, 7351, 8081, 8080};
    public static byte[][] i = null;
    public static byte[][] j = null;

    public static byte[] a(int i2, int i3) {
        return i2 == 0 ? i[i3] : j[i3];
    }

    public static void a(int i2) {
        d = new class_176[aU.vP][0];
        e = new class_176[aU.vP][0];
        class_83.a(new class_176[15000][0]);
    }

    public static void a(int i2, byte[] bArr, boolean z) {
        try {
            Buffer buffer = new Buffer(bArr);
            class_35 class_35Var = new class_35(buffer, z);
            if (z) {
                buffer.A();
            }
            int iA = buffer.A();
            a(z)[i2] = new class_176[iA * 3];
            int[] iArr = new int[500];
            int[] iArr2 = new int[500];
            int[] iArr3 = new int[500];
            int[] iArr4 = new int[500];
            for (int i3 = 0; i3 < iA; i3++) {
                int iO = z ? buffer.o() : buffer.A();
                class_176[] class_176VarArr = a(z)[i2];
                class_176 class_176Var = new class_176();
                class_176VarArr[iO] = class_176Var;
                class_176Var.g = class_35Var;
                int iY = buffer.y();
                int i4 = -1;
                int i5 = 0;
                for (int i6 = 0; i6 < iY; i6++) {
                    int iY2 = buffer.y();
                    if (iY2 > 0) {
                        if (class_35Var.d[i6] != 0) {
                            for (int i7 = i6 - 1; i7 > i4; i7--) {
                                if (class_35Var.d[i7] == 0) {
                                    iArr[i5] = i7;
                                    iArr2[i5] = 0;
                                    iArr3[i5] = 0;
                                    iArr4[i5] = 0;
                                    i5++;
                                    break;
                                }
                            }
                        }
                        iArr[i5] = i6;
                        int i8 = class_35Var.d[i6] == 3 ? 128 : 0;
                        if ((iY2 & 1) != 0) {
                            iArr2[i5] = buffer.x();
                        } else {
                            iArr2[i5] = i8;
                        }
                        if ((iY2 & 2) != 0) {
                            iArr3[i5] = buffer.x();
                        } else {
                            iArr3[i5] = i8;
                        }
                        if ((iY2 & 4) != 0) {
                            iArr4[i5] = buffer.x();
                        } else {
                            iArr4[i5] = i8;
                        }
                        i4 = i6;
                        i5++;
                    }
                }
                class_176Var.h = i5;
                class_176Var.k = new int[i5];
                class_176Var.l = new int[i5];
                class_176Var.m = new int[i5];
                class_176Var.n = new int[i5];
                for (int i9 = 0; i9 < i5; i9++) {
                    class_176Var.k[i9] = iArr[i9];
                    class_176Var.l[i9] = iArr2[i9];
                    class_176Var.m[i9] = iArr3[i9];
                    class_176Var.n[i9] = iArr4[i9];
                }
            }
        } catch (Exception e2) {
            System.out.println("Anim error for file: " + i2 + " [osrs=" + z + "]");
            e2.printStackTrace();
        }
    }

    public static void b(int i2) {
        try {
            Buffer buffer = new Buffer(class_165.a(class_650.f() + "/old_osrs_anims/" + i2 + ".dat"));
            class_35 class_35Var = new class_35(buffer);
            int iA = buffer.A();
            e[i2] = new class_176[(int) (((double) iA) * 1.5d)];
            int[] iArr = new int[500];
            int[] iArr2 = new int[500];
            int[] iArr3 = new int[500];
            int[] iArr4 = new int[500];
            for (int i3 = 0; i3 < iA; i3++) {
                int iA2 = buffer.A();
                class_176[] class_176VarArr = e[i2];
                class_176 class_176Var = new class_176();
                class_176VarArr[iA2] = class_176Var;
                class_176Var.g = class_35Var;
                int iY = buffer.y();
                int i4 = 0;
                int i5 = -1;
                for (int i6 = 0; i6 < iY; i6++) {
                    int iY2 = buffer.y();
                    if (iY2 > 0) {
                        if (class_35Var.d[i6] != 0) {
                            for (int i7 = i6 - 1; i7 > i5; i7--) {
                                if (class_35Var.d[i7] == 0) {
                                    iArr[i4] = i7;
                                    iArr2[i4] = 0;
                                    iArr3[i4] = 0;
                                    iArr4[i4] = 0;
                                    i4++;
                                    break;
                                }
                            }
                        }
                        iArr[i4] = i6;
                        int i8 = class_35Var.d[i6] == 3 ? 128 : 0;
                        if ((iY2 & 1) != 0) {
                            iArr2[i4] = (short) buffer.x();
                        } else {
                            iArr2[i4] = i8;
                        }
                        if ((iY2 & 2) != 0) {
                            iArr3[i4] = buffer.x();
                        } else {
                            iArr3[i4] = i8;
                        }
                        if ((iY2 & 4) != 0) {
                            iArr4[i4] = buffer.x();
                        } else {
                            iArr4[i4] = i8;
                        }
                        i5 = i6;
                        i4++;
                    }
                }
                class_176Var.h = i4;
                class_176Var.k = new int[i4];
                class_176Var.l = new int[i4];
                class_176Var.m = new int[i4];
                class_176Var.n = new int[i4];
                for (int i9 = 0; i9 < i4; i9++) {
                    class_176Var.k[i9] = iArr[i9];
                    class_176Var.l[i9] = iArr2[i9];
                    class_176Var.m[i9] = iArr3[i9];
                    class_176Var.n[i9] = iArr4[i9];
                }
            }
        } catch (Exception e2) {
        }
    }

    public static void c(int i2) {
        try {
            Buffer buffer = new Buffer(class_165.a(class_650.f() + "/misc/" + i2 + ".dat"));
            class_35 class_35Var = new class_35(buffer);
            int iA = buffer.A();
            a()[i2] = new class_176[(int) (((double) iA) * 3.0d)];
            int[] iArr = new int[500];
            int[] iArr2 = new int[500];
            int[] iArr3 = new int[500];
            int[] iArr4 = new int[500];
            for (int i3 = 0; i3 < iA; i3++) {
                int iA2 = buffer.A();
                class_176[] class_176VarArr = a()[i2];
                class_176 class_176Var = new class_176();
                class_176VarArr[iA2] = class_176Var;
                class_176Var.g = class_35Var;
                int iY = buffer.y();
                int i4 = 0;
                int i5 = -1;
                for (int i6 = 0; i6 < iY; i6++) {
                    int iY2 = buffer.y();
                    if (iY2 > 0) {
                        if (class_35Var.d[i6] != 0) {
                            for (int i7 = i6 - 1; i7 > i5; i7--) {
                                if (class_35Var.d[i7] == 0) {
                                    iArr[i4] = i7;
                                    iArr2[i4] = 0;
                                    iArr3[i4] = 0;
                                    iArr4[i4] = 0;
                                    i4++;
                                    break;
                                }
                            }
                        }
                        iArr[i4] = i6;
                        int i8 = class_35Var.d[i6] == 3 ? 128 : 0;
                        if ((iY2 & 1) != 0) {
                            iArr2[i4] = (short) buffer.q();
                        } else {
                            iArr2[i4] = i8;
                        }
                        if ((iY2 & 2) != 0) {
                            iArr3[i4] = buffer.q();
                        } else {
                            iArr3[i4] = i8;
                        }
                        if ((iY2 & 4) != 0) {
                            iArr4[i4] = buffer.q();
                        } else {
                            iArr4[i4] = i8;
                        }
                        i5 = i6;
                        i4++;
                    }
                }
                class_176Var.h = i4;
                class_176Var.k = new int[i4];
                class_176Var.l = new int[i4];
                class_176Var.m = new int[i4];
                class_176Var.n = new int[i4];
                for (int i9 = 0; i9 < i4; i9++) {
                    class_176Var.k[i9] = iArr[i9];
                    class_176Var.l[i9] = iArr2[i9];
                    class_176Var.m[i9] = iArr3[i9];
                    class_176Var.n[i9] = iArr4[i9];
                }
            }
        } catch (Exception e2) {
        }
    }

    public static class_176[][] a() {
        return a(class_83.a());
    }

    public static class_176[][] a(boolean z) {
        return z ? class_83.c() : d;
    }

    public static void b() {
        d = null;
        e = null;
        class_83.a((class_176[][]) null);
    }

    public static boolean b(int i2, int i3) {
        return false;
    }

    public static class_176 c(int i2, int i3) {
        boolean z = class_99.a[i3].w;
        int i4 = i2 >> 16;
        int i5 = i2 & 4095;
        if (i4 == 0) {
            System.out.println(i4 + " " + i3 + " " + z);
        }
        if (a.b(i3) != null && i4 < e.length && !class_83.a()) {
            if (e[i4].length == 0) {
                System.out.println("Loading OSRS: " + i4);
                if (new File(class_650.f() + "/old_osrs_anims/" + i4 + ".dat").exists()) {
                    b(i4);
                } else {
                    System.out.println("[Animations] Could not find OSRS animation file " + i4);
                }
            }
            if (e[i4].length != 0 && i5 < e[i4].length) {
                return e[i4][i5];
            }
        }
        if (i4 >= a().length) {
            return null;
        }
        if (a()[i4].length == 0) {
            boolean z2 = false;
            if (!class_83.a()) {
                for (int i6 : p) {
                    if (i4 == i6) {
                        c(i4);
                        z2 = true;
                        break;
                    }
                }
            }
            if (!z2) {
                class_83.a(z);
                try {
                    a(i4, z);
                    class_83.a(false);
                } catch (Throwable th) {
                    class_83.a(false);
                    throw th;
                }
            }
        }
        if (i4 >= a(z).length || i5 >= a(z)[i4].length) {
            return null;
        }
        return a(z)[i4][i5];
    }

    public static void a(int i2, boolean z) {
        try {
            byte[] bArrA = Client.ew.a(1, i2, z ? 1 : 0);
            if (bArrA == null) {
                return;
            }
            if ((bArrA[1] & 255) + ((bArrA[0] & 255) << 8) == 420) {
                class_640.a(i2, bArrA);
            } else {
                a(i2, bArrA, z);
            }
        } catch (IOException e2) {
        }
    }

    public static class_176[][] d(int i2) {
        return (a.b(i2) == null || class_83.a()) ? a() : e;
    }

    public static int e(int i2) {
        String hexString = Integer.toHexString(i2);
        return Integer.parseInt(hexString.substring(0, hexString.length() - 4), 16);
    }

    public boolean f(int i2) {
        return g(i2);
    }

    public static boolean g(int i2) {
        return i2 == -1;
    }
}

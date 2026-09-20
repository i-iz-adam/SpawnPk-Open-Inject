/*
 * Decompiled with CFR 0.152.
 */
package rs.p_d;

import java.awt.Color;
import java.io.File;
import rs.C_Client_mc;
import rs.p_f.C_a;
import rs.p_v.C_a;
import rs.p_x.C_e;
import rs.p_x.C_f;

public final class C_h {
    public static a a = rs.p_d.C_h$a.a;
    public static C_h[] b;
    public int c;
    public int d = -1;
    public boolean e = true;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    public static void a(a a2) {
        C_e c_e = null;
        a = a2;
        switch (a2) {
            case a: {
                c_e = new C_e(C_Client_mc.a(C_a.f() + "flo.dat"));
                break;
            }
            case b: {
                c_e = new C_e(C_Client_mc.a(C_a.f() + "osrs_flo.dat"));
                break;
            }
            case c: {
                c_e = new C_e(C_Client_mc.a(C_a.f() + "osrs_config" + File.separator + "flo.dat"));
            }
        }
        int n = c_e.A();
        if (b == null || b.length != n) {
            b = new C_h[n];
        }
        for (int i = 0; i < n; ++i) {
            if (b[i] == null) {
                C_h.b[i] = new C_h();
            }
            b[i].a(c_e);
        }
    }

    public static void a(C_f c_f) {
        C_e c_e = null;
        c_e = new C_e(C_Client_mc.a(C_a.f() + "flo.dat"));
        int n = c_e.A();
        if (b == null) {
            b = new C_h[n];
        }
        for (int i = 0; i < n; ++i) {
            if (b[i] == null) {
                C_h.b[i] = new C_h();
            }
            b[i].a(c_e);
        }
    }

    private boolean a(C_e c_e) {
        int n;
        while ((n = c_e.y()) != 0) {
            int n2;
            if (n == 1) {
                this.c = c_e.C();
                if (rs.p_f.C_a.r != C_a.b.a) {
                    Color color = Color.decode("" + this.c);
                    n2 = 10;
                    if (Math.abs(color.getGreen() - color.getRed()) > n2 || Math.abs(color.getRed() - color.getBlue()) > n2 || Math.abs(color.getGreen() - color.getBlue()) > n2) {
                        if (rs.p_f.C_a.r == C_a.b.c && color.getGreen() > 50) {
                            this.c = 0x222922;
                        }
                        if (color.getGreen() > 100) {
                            this.c = rs.p_f.C_a.r.f;
                        }
                    }
                }
                this.a(this.c);
                continue;
            }
            if (n == 2) {
                this.d = c_e.y();
                continue;
            }
            if (n == 3) {
                boolean bl = true;
                continue;
            }
            if (n == 5) {
                this.e = false;
                continue;
            }
            if (n == 6) {
                c_e.F();
                continue;
            }
            if (n == 7) {
                int n3 = this.f;
                n2 = this.g;
                int n4 = this.h;
                int n5 = this.i;
                int n6 = c_e.C();
                this.a(n6);
                this.f = n3;
                this.g = n2;
                this.h = n4;
                this.i = n5;
                this.j = n5;
                continue;
            }
            System.out.println("[FLO] Error unrecognised config code: " + n);
        }
        return true;
    }

    private void a(int n) {
        double d2;
        double d3 = (double)(n >> 16 & 0xFF) / 256.0;
        double d4 = (double)(n >> 8 & 0xFF) / 256.0;
        double d5 = (double)(n & 0xFF) / 256.0;
        double d6 = d3;
        if (d4 < d6) {
            d6 = d4;
        }
        if (d5 < d6) {
            d6 = d5;
        }
        if (d4 > (d2 = d3)) {
            d2 = d4;
        }
        if (d5 > d2) {
            d2 = d5;
        }
        double d7 = 0.0;
        double d8 = 0.0;
        double d9 = (d6 + d2) / 2.0;
        if (d6 != d2) {
            if (d9 < 0.5) {
                d8 = (d2 - d6) / (d2 + d6);
            }
            if (d9 >= 0.5) {
                d8 = (d2 - d6) / (2.0 - d2 - d6);
            }
            if (d3 == d2) {
                d7 = (d4 - d5) / (d2 - d6);
            } else if (d4 == d2) {
                d7 = 2.0 + (d5 - d3) / (d2 - d6);
            } else if (d5 == d2) {
                d7 = 4.0 + (d3 - d4) / (d2 - d6);
            }
        }
        this.f = (int)((d7 /= 6.0) * 256.0);
        this.g = (int)(d8 * 256.0);
        this.h = (int)(d9 * 256.0);
        if (this.g < 0) {
            this.g = 0;
        } else if (this.g > 255) {
            this.g = 255;
        }
        if (this.h < 0) {
            this.h = 0;
        } else if (this.h > 255) {
            this.h = 255;
        }
        this.j = d9 > 0.5 ? (int)((1.0 - d9) * d8 * 512.0) : (int)(d9 * d8 * 512.0);
        if (this.j < 1) {
            this.j = 1;
        }
        this.i = (int)(d7 * (double)this.j);
        int n2 = this.f + (int)(Math.random() * 16.0) - 8;
        if (n2 < 0) {
            n2 = 0;
        } else if (n2 > 255) {
            n2 = 255;
        }
        int n3 = this.g + (int)(Math.random() * 48.0) - 24;
        if (n3 < 0) {
            n3 = 0;
        } else if (n3 > 255) {
            n3 = 255;
        }
        int n4 = this.h + (int)(Math.random() * 48.0) - 24;
        if (n4 < 0) {
            n4 = 0;
        } else if (n4 > 255) {
            n4 = 255;
        }
        this.k = this.a(n2, n3, n4);
    }

    private int a(int n, int n2, int n3) {
        if (n3 > 179) {
            n2 /= 2;
        }
        if (n3 > 192) {
            n2 /= 2;
        }
        if (n3 > 217) {
            n2 /= 2;
        }
        if (n3 > 243) {
            n2 /= 2;
        }
        return (n / 4 << 10) + (n2 / 32 << 7) + n3 / 2;
    }

    private C_h() {
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = rs.p_d.C_h$a.a();
        }
    }
}


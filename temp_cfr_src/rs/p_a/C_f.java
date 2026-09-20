/*
 * Decompiled with CFR 0.152.
 */
package rs.p_a;

import rs.C_Client_mc;
import rs.p_a.C_c;
import rs.p_a.C_j;
import rs.p_f.C_a;
import rs.p_l.C_F_uc;
import rs.p_l.C_J_uc;

public class C_f {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public C_f(int n, int n2, int n3) {
        this.d = n;
        this.e = n2;
        this.c = n3;
    }

    public void a(C_Client_mc c_Client_mc, C_c c_c, int n, int n2, int n3) {
        if (n2 <= -1) {
            return;
        }
        if (n == 1) {
            n3 -= 20;
        }
        if (n == 2) {
            n2 -= 15;
            n3 -= 10;
        }
        if (n == 3) {
            n2 += 15;
            n3 -= 10;
        }
        if (this.e == 0) {
            c_Client_mc.dS[0].f(n2 - 12, n3 - 12);
        } else {
            switch (this.d) {
                case 1: {
                    if (c_c instanceof C_j && ((C_j)c_c).aG.x == 3329L) {
                        c_Client_mc.db.f(n2 - 12, n3 - 12);
                        break;
                    }
                    c_Client_mc.dS[this.d].f(n2 - 12, n3 - 12);
                    break;
                }
                case 2: {
                    c_Client_mc.dS[2].f(n2 - 11, n3 - 12);
                    break;
                }
                case 3: {
                    c_Client_mc.cZ.f(n2 - 11, n3 - 12);
                    break;
                }
                case 4: {
                    c_Client_mc.dS[4].f(n2 - 11, n3 - 12);
                    n3 += 2;
                    n2 += 2;
                    break;
                }
                case 5: {
                    c_Client_mc.dc.f(n2 - 11, n3 - 12);
                    break;
                }
                case 6: {
                    c_Client_mc.da.f(n2 - 12, n3 - 12);
                    break;
                }
                case 7: {
                    c_Client_mc.db.f(n2 - 12, n3 - 12);
                    break;
                }
                case 8: {
                    C_J_uc.g.f(n2 - 11, n3 - 12);
                    break;
                }
                default: {
                    c_Client_mc.dS[this.d].f(n2 - 12, n3 - 12);
                }
            }
        }
        if (C_a.aq && this.c != 255 && this.e > 0) {
            int n4 = 200;
            if (n == 0) {
                c_Client_mc.df[this.c].a(n2 - 3, n3 - 8, n4);
            } else if (n == 1) {
                c_Client_mc.df[this.c].a(n2 - 3, n3 - 8, n4);
            } else if (n == 2) {
                c_Client_mc.df[this.c].a(n2 - 26, n3 - 13, n4);
            } else {
                c_Client_mc.df[this.c].a(n2 - 3, n3 - 13, n4);
            }
        }
        C_Client_mc.gh.e(0, this.e, n3 + 4, n2);
        C_Client_mc.gh.e(0xFFFFFF, this.e, n3 + 3, n2 - 1);
    }

    public void b(C_Client_mc c_Client_mc, C_c c_c, int n, int n2, int n3) {
        int n4;
        n3 += 20 * n;
        if (!rs.p_l.p_b.C_a.a()) {
            if (C_Client_mc.ff % 5 == 0 && this.a > -15) {
                --this.a;
            }
            if (this.g - 40 < C_Client_mc.ff) {
                this.b -= 5;
            }
        }
        int n5 = 1;
        if (this.e >= 10 && this.e < 100) {
            n5 = 2;
        }
        if (this.e >= 100) {
            n5 = 3;
        }
        if ((n4 = this.b) < 0) {
            n4 = 0;
        }
        if (this.e <= 0) {
            c_Client_mc.dd.a(n2 - 12, n3 - 14 + this.a, n4);
            return;
        }
        C_F_uc c_F_uc = null;
        C_F_uc c_F_uc2 = null;
        C_F_uc c_F_uc3 = null;
        int n6 = 0;
        switch (n5) {
            case 1: {
                n6 = 8;
                break;
            }
            case 2: {
                n6 = 4;
                break;
            }
            case 3: {
                n6 = 1;
            }
        }
        switch (this.d) {
            case 0: 
            case 1: {
                c_F_uc = c_Client_mc.de[0];
                c_F_uc2 = c_Client_mc.de[1];
                c_F_uc3 = c_Client_mc.de[2];
                break;
            }
            case 2: {
                c_F_uc = c_Client_mc.de[6];
                c_F_uc2 = c_Client_mc.de[7];
                c_F_uc3 = c_Client_mc.de[8];
                break;
            }
            case 3: {
                c_F_uc = c_Client_mc.de[9];
                c_F_uc2 = c_Client_mc.de[10];
                c_F_uc3 = c_Client_mc.de[11];
                break;
            }
            case 4: {
                c_F_uc = c_Client_mc.de[18];
                c_F_uc2 = c_Client_mc.de[19];
                c_F_uc3 = c_Client_mc.de[20];
                break;
            }
            case 5: {
                c_F_uc = c_Client_mc.de[12];
                c_F_uc2 = c_Client_mc.de[13];
                c_F_uc3 = c_Client_mc.de[14];
                break;
            }
            case 6: {
                c_F_uc = c_Client_mc.de[3];
                c_F_uc2 = c_Client_mc.de[4];
                c_F_uc3 = c_Client_mc.de[5];
                break;
            }
            case 7: {
                c_F_uc = c_Client_mc.de[16];
                c_F_uc2 = c_Client_mc.de[15];
                c_F_uc3 = c_Client_mc.de[17];
                break;
            }
            case 8: {
                c_F_uc = c_Client_mc.de[18];
                c_F_uc2 = c_Client_mc.de[19];
                c_F_uc3 = c_Client_mc.de[20];
            }
        }
        if (this.c != 255) {
            c_Client_mc.df[this.c].a(n2 - 34 + n6, n3 - 14 + this.a, n4);
        }
        c_F_uc.a(n2 - 12 + n6, n3 - 12 + this.a, n4);
        n6 += 4;
        for (int i = 0; i < n5 * 2; ++i) {
            c_F_uc2.a(n2 - 12 + n6, n3 - 12 + this.a, n4);
            n6 += 4;
        }
        c_F_uc3.a(n2 - 12 + n6, n3 - 12 + this.a, n4);
        if (n4 > 100) {
            (this.d == 1 ? C_Client_mc.gh : C_Client_mc.gh).e(0xFFFFFF, this.e, n3 + (this.d != 0 ? 2 : 32) + this.a + 2, n2 + 4);
        }
    }

    public int a() {
        return this.a;
    }

    public void a(int n) {
        this.a = n;
    }

    public int b() {
        return this.b;
    }

    public void b(int n) {
        this.b = n;
    }

    public int c() {
        return this.c;
    }

    public void c(int n) {
        this.c = n;
    }

    public int d() {
        return this.d;
    }

    public void d(int n) {
        this.d = n;
    }

    public int e() {
        return this.e;
    }

    public void e(int n) {
        this.e = n;
    }

    public int f() {
        return this.f;
    }

    public void f(int n) {
        this.f = n;
    }

    public int g() {
        return this.g;
    }

    public void g(int n) {
        this.g = n;
    }
}


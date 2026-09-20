/*
 * Decompiled with CFR 0.152.
 */
package rs.p_a;

import java.awt.Color;
import java.awt.Polygon;
import rs.C_Client_mc;
import rs.C_S_uc;
import rs.p_a.C_h;
import rs.p_a.C_j;
import rs.p_a.C_k;
import rs.p_d.C_d;
import rs.p_l.C_f;
import rs.p_l.p_f.C_e;

public class C_a
extends rs.C_a {
    public C_S_uc f;
    public int g = 1000;

    public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        C_h c_h;
        Object object;
        int n11;
        int n12;
        int n13;
        int n14;
        C_e.d().a(rs.p_l.p_f.C_a.e, (Object)this, null);
        if (!rs.p_runelite.p_b.C_a.a().isEmpty()) {
            for (n14 = 0; n14 < rs.p_runelite.p_b.C_a.a().size(); ++n14) {
                if (rs.p_runelite.p_b.C_a.a().get(n14).draw(this, false)) continue;
                return;
            }
        }
        if (this instanceof C_k && C_Client_mc.cw == 10806) {
            n14 = C_Client_mc.eh + (((C_k)this).ac - 6 >> 7);
            n13 = C_Client_mc.ei + (((C_k)this).ad - 6 >> 7);
        }
        if (this instanceof C_k && !rs.p_f.C_a.J) {
            return;
        }
        if (this instanceof C_j) {
            int n15;
            int n16;
            if (!rs.p_f.C_a.K) {
                return;
            }
            if (rs.p_f.C_a.aT) {
                C_j c_j = (C_j)this;
                if (C_Client_mc.ed != 197 && c_j.aG != null && c_j.aG.h && c_j.m != -1 && c_j.m - 32768 != C_Client_mc.di) {
                    return;
                }
            }
            if (rs.p_f.C_a.aU && ((n16 = (n12 = (n15 = C_Client_mc.eh + (((C_j)this).ac - 6 >> 7)) >> 6) * 256 + (n11 = (n13 = C_Client_mc.ei + (((C_j)this).ad - 6 >> 7)) >> 6)) == 10317 || n16 == 10831 || n16 == 7248 || n16 == 9011 || n16 == 8755 || n16 == 9012 || n16 == 8756)) {
                object = (C_j)this;
                if (((C_j)object).m != -1 && ((C_j)object).m - 32768 != C_Client_mc.di) {
                    return;
                }
            }
        }
        if (this instanceof C_j && ((C_j)this).i) {
            C_d.a = false;
            C_d.b = this;
        }
        C_h c_h2 = this.c();
        C_d.a = true;
        C_d.b = null;
        if (this instanceof C_j && ((C_j)this).av) {
            ((C_j)this).i = false;
            ((C_j)this).av = false;
        }
        if (c_h2 != null) {
            if (this instanceof C_k) {
                C_e.d().a(rs.p_l.p_f.C_a.g, (Object)this, c_h2);
            } else if (this instanceof C_j) {
                ((C_j)this).as = n7;
                ((C_j)this).at = n9;
                ((C_j)this).au = n10;
            }
            if (this instanceof C_j) {
                C_j c_j = (C_j)this;
                if (c_j.aG.x == 5660L) {
                    Color color = new Color(152, 0, 255);
                    Color color2 = Color.MAGENTA;
                    Color color3 = new Color(93, 44, 255, 100);
                    object = c_h2.b(((C_j)this).ac, ((C_j)this).ad, n7 + C_Client_mc.cK, 0);
                    rs.p_l.p_e.C_j c_j2 = new rs.p_l.p_e.C_j(this, (Polygon)object, color, color2, n9);
                    c_j2.f = color3;
                    C_Client_mc.ab.c.a(n9, (Object)c_j2);
                }
            }
            this.g = c_h2.g;
            if (rs.p_f.C_a.az && !rs.p_f.C_a.ah && this instanceof C_j) {
                int n17 = ((C_j)this).aw;
                n12 = ((C_j)this).ax;
                n11 = ((C_j)this).ay;
                C_d c_d = ((C_j)this).aG;
                if (((C_j)this).aG.x == 1335L) {
                    if (n17 == 0) {
                        n17 = 6;
                    } else {
                        n12 = n12 == 0 ? 6 : 6;
                    }
                }
                if (((C_j)this).aG.x == 1334L || ((C_j)this).aG.x == 8210L) {
                    int n18 = 3;
                    if (n17 == 0) {
                        n17 = n18;
                    } else {
                        n12 = n12 == 0 ? n18 : n18;
                    }
                }
                if (((C_j)this).aG.x == 864L || ((C_j)this).aG.x == 6303L) {
                    if (n17 == 0) {
                        n17 = 50;
                    } else {
                        n12 = n12 == 0 ? 50 : 50;
                    }
                }
                if (((C_j)this).aG.x == 6304L || ((C_j)this).aG.x == 8192L) {
                    if (n17 == 0) {
                        n17 = 5;
                    } else {
                        n12 = n12 == 0 ? 5 : 5;
                    }
                }
                if (((C_j)this).aG.x == 2863L) {
                    if (n17 == 0) {
                        n17 = 9;
                    } else {
                        n12 = n12 == 0 ? 9 : 9;
                    }
                }
                boolean bl = false;
                if (((C_j)this).aG.x == 7005L && c_h2.L != null && c_h2.L.length > 0) {
                    int n19 = 3;
                    c_h2.a(239, n19 + 1, (byte)1);
                    c_h2.a(255, n19 + 1, (byte)1);
                    c_h2.a(115, n19 + 1, (byte)1);
                    c_h2.a(72, n19 + 1, (byte)1);
                    c_h2.a(76, n19 + 1, (byte)1);
                    c_h2.a(30, n19 + 1, (byte)1);
                    c_h2.a(32, n19 + 1, (byte)1);
                    c_h2.a(36, n19 + 1, (byte)1);
                    c_h2.a(37, n19 + 1, (byte)1);
                    bl = true;
                }
                if (!bl && n17 > 0 && c_h2.L.length >= 1) {
                    int n20 = 1;
                    if (n12 > 0) {
                        ++n20;
                    }
                    if (n11 > 0) {
                        ++n20;
                    }
                    int[] nArray = new int[n20];
                    nArray[0] = C_d.a(n17);
                    if (nArray.length >= 2) {
                        nArray[1] = C_d.a(n12);
                    }
                    if (nArray.length >= 3) {
                        nArray[2] = C_d.a(n11);
                    }
                    c_h2.a(0, nArray[0], (byte)1);
                    int n21 = 15;
                    if (n20 == 1) {
                        n21 = 20;
                    }
                    int n22 = 0;
                    int n23 = 0;
                    int n24 = c_h2.L.length;
                    if (c_d.x == 4003L) {
                        n21 = 11;
                    }
                    if (c_d.x == 2863L) {
                        n21 = 4;
                    }
                    if (c_d.x == 862L || c_d.x == 2862L) {
                        n21 = 11;
                    }
                    if (c_d.x == 6303L) {
                        n21 = 40;
                    }
                    if (c_d.x == 751L || c_d.x == 752L) {
                        n21 = 5;
                    }
                    if (c_d.x == 754L) {
                        n21 = 10;
                    }
                    if (c_d.x >= 2012L && c_d.x <= 2016L) {
                        n21 = 11;
                        n24 = 400;
                    }
                    if (c_d.x == 4437L) {
                        n21 = 5;
                        n23 = 35;
                    }
                    if (c_d.x == 1336L || c_d.x == 1337L) {
                        // empty if block
                    }
                    for (int i = n23; i < n24; i += n21) {
                        if (c_h2.L.length <= i) continue;
                        c_h2.a(i, nArray[n22], (byte)1);
                        if (++n22 < nArray.length) continue;
                        n22 = 0;
                    }
                }
            }
            if (this instanceof C_j && (((C_j)this).aG.x == 1336L || ((C_j)this).aG.x == 1335L || ((C_j)this).aG.x == 8210L || ((C_j)this).aG.x == 1334L)) {
                int n25 = 0;
                if (((C_j)this).aG.x == 1334L) {
                    n25 = -50;
                }
                for (n12 = 0; n12 < c_h2.ah; ++n12) {
                    if (((C_j)this).aG.x != 1335L && ((C_j)this).aG.x != 1334L && ((C_j)this).aG.x != 8210L) continue;
                    c_h2.aq[n12] = 100 - n25;
                }
                if (((C_j)this).aG.x == 1334L) {
                    c_h2.aI = 319770;
                }
                if (((C_j)this).aG.x == 8210L) {
                    n12 = (int)(Math.sin(C_Client_mc.fg) * 33.0) + 33;
                    C_h.H = C_f.a(255 + 131072 * n12);
                } else {
                    C_h.H = 1;
                }
                c_h2.a(n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
                C_h.H = -1;
                if (((C_j)this).aG.x == 1334L) {
                    c_h2.aI = 0;
                }
            } else {
                if (this instanceof C_j && ((C_j)this).q()) {
                    c_h2.K = (short)200;
                    c_h2.aI = 1;
                    C_h.H = 1;
                }
                if (this instanceof C_k && ((C_k)this).aR) {
                    c_h2.a(n, n2, n3, n4, n5, n6, n7, n8, 0, 0);
                    c_h2.K = (short)256;
                    C_h c_h3 = this.a(true);
                    c_h3.aD = 62;
                    c_h3.g = 283;
                    c_h3.b(n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
                } else {
                    c_h2.a(n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
                    c_h2.K = (short)256;
                }
                C_h.H = -1;
            }
        } else if (this instanceof C_k && (c_h = this.a(true)) != null) {
            c_h.b(n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
        }
        c_h2 = null;
    }

    public C_h a(boolean bl) {
        if (!(this instanceof C_k)) {
            return null;
        }
        C_k.av.z = bl ? ((C_k)this).z : -1;
        C_k.av.D = ((C_k)this).D;
        C_k.av.A = ((C_k)this).A;
        C_k.av.aU = ((C_k)this).aU;
        C_k.av.bj = ((C_k)this).bj;
        C_k.av.bk = ((C_k)this).bk;
        C_k.av.bl = ((C_k)this).bl;
        C_k.av.bn = ((C_k)this).bn;
        C_k.av.bo = ((C_k)this).bo;
        C_k.av.bp = ((C_k)this).bp;
        C_k.av.I = ((C_k)this).I;
        C_k.av.x = ((C_k)this).x;
        C_k.av.F = ((C_k)this).F;
        C_k.av.w = ((C_k)this).w;
        C_k.av.s = ((C_k)this).s;
        C_k.av.ac = ((C_k)this).ac;
        C_k.av.ad = ((C_k)this).ad;
        return C_k.av.b(true);
    }

    public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, boolean bl) {
        if (this instanceof C_k) {
            C_k.av.z = bl ? ((C_k)this).z : -1;
            C_k.av.D = ((C_k)this).D;
            C_k.av.A = ((C_k)this).A;
            C_k.av.aU = ((C_k)this).aU;
            C_k.av.bj = ((C_k)this).bj;
            C_k.av.bk = ((C_k)this).bk;
            C_k.av.bl = ((C_k)this).bl;
            C_k.av.bn = ((C_k)this).bn;
            C_k.av.bo = ((C_k)this).bo;
            C_k.av.bp = ((C_k)this).bp;
            C_k.av.I = ((C_k)this).I;
            C_k.av.x = ((C_k)this).x;
            C_k.av.F = ((C_k)this).F;
            C_k.av.w = ((C_k)this).w;
            C_k.av.s = ((C_k)this).s;
            C_k.av.ac = ((C_k)this).ac;
            C_k.av.ad = ((C_k)this).ad;
            C_h c_h = C_k.av.b(true);
            if (c_h != null) {
                c_h.b(128, 128, 160);
                c_h.a(n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
            }
        }
    }

    public C_h c() {
        return null;
    }

    C_a() {
    }
}


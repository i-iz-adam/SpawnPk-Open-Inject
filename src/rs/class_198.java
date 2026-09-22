package rs;

import java.awt.Color;
import java.awt.Polygon;
import java.util.Iterator;

/* JADX INFO: loaded from: client-final.jar:rs/class_198.class */
public class class_198 extends class_196 {
    private int t;
    private class_102 u;

    public class_198(int i) {
        this.t = i;
        this.u = class_102.c(i);
    }

    @Override // rs.class_196
    protected void b() {
        d(this.u.w);
    }

    @Override // rs.class_196
    protected void c() {
        String str;
        ColorUtility colorUtilityA = this.u.a(-1, class_99.a[this.h].e[this.i], null, this.h);
        if (this.n) {
        }
        if (colorUtilityA != null) {
            Polygon polygonB = colorUtilityA.b(this.b, this.c, (this.d - class_46.k) + Client.cK, 0);
            class_258 class_258Var = new class_258(this, polygonB, Color.GREEN, Color.BLACK, this.f);
            class_258Var.f = Color.GREEN;
            Client.ab.c.a(this.f, class_258Var);
            colorUtilityA.a(this.e, class_46.m, class_46.n, class_46.o, class_46.p, this.b - class_46.j, this.d - class_46.k, this.c - class_46.l, this.f, 0);
            colorUtilityA.K = (short) 256;
            ColorUtility.H = -1;
            if (class_258Var.g && class_205.b.j) {
                if (class_205.b.k == 1) {
                    class_205.b.c("Selected @gre@NPC entity #" + (this.m + 1));
                    this.n = true;
                    class_205.b.f();
                } else {
                    this.o = false;
                    class_205.b.c("Deleted @red@NPC entity #" + (this.m + 1));
                }
                class_205.b.j = false;
            }
            if (class_258Var.g) {
                class_27.a(class_205.b.l, polygonB, new Color(0, 255, 0, 150), new Color(0, 255, 0, 25));
            }
            c(colorUtilityA.g + 10);
            if (class_205.e) {
                Client.gl.a((this.n ? "@gre@" : "") + (this.m + 1), this.k, this.l);
            }
            if (this.n) {
                try {
                    int height = class_205.b.f.z().getHeight() - 65;
                    String str2 = "[ ";
                    int i = 0;
                    Iterator<Integer> it = this.q.keySet().iterator();
                    while (it.hasNext()) {
                        int iIntValue = it.next().intValue();
                        if (i == this.r) {
                            str2 = str2 + "<u=0>";
                        }
                        if (k().contains(Integer.valueOf(iIntValue))) {
                            str = str2 + "@gre@" + iIntValue;
                        } else {
                            str = this.p.containsKey(Integer.valueOf(iIntValue)) ? str2 + "@whi@" + iIntValue : str2 + "@red@" + iIntValue;
                        }
                        if (i == this.r) {
                            str = str + "</u>";
                        }
                        str2 = str + " ";
                        i++;
                    }
                    class_205.b.f.gm.a(str2 + "@whi@]", 10, height, class_492.c, 0, false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void g(int i) {
        this.t = i;
        this.u = class_102.c(i);
        d(this.u.w);
        a(false);
    }

    public class_102 n() {
        return this.u;
    }

    public int o() {
        return this.t;
    }

    public void p() {
        b();
    }

    public void q() {
        d(this.u.q);
    }

    public void r() {
        d(this.u.w);
    }
}

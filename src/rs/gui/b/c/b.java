/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  rs.Client
 *  rs.gui.Launcher
 *  rs.gui.w
 *  rs.gui.x
 */
package rs.gui.b.c;

import java.awt.Color;
import java.awt.Graphics;
import rs.Client;
import rs.gui.Launcher;
import rs.gui.b.c.a;
import rs.gui.b.c.c;
import rs.gui.b.f;
import rs.gui.w;
import rs.gui.x;

public class b {
    public static final int a = 0;
    private static final int b = -9;
    private static final int c = 10;
    private rs.gui.b.Loadout d;
    private boolean e = false;
    private boolean f = false;
    private x g;
    private x h;
    private x i;
    private x j;
    private x k;
    private x l;
    private x m;
    private x n;
    private x o;

    public void a(rs.gui.b.Loadout a2) {
        this.d = a2;
        this.a();
    }

    public void a() {
        this.k = null;
        this.l = null;
    }

    private boolean d() {
        if (this.d == null) {
            return false;
        }
        if (this.k == null) {
            this.k = new x(0);
            if (!this.k.a(this.d.g().a())) {
                this.k = null;
            }
        }
        if (this.g == null) {
            this.g = new x(0);
            if (!this.g.a("/assets/gui/loadout_bg.png")) {
                this.g = null;
            }
        }
        if (this.l == null) {
            String string = this.d.e() == 1 ? "/assets/gui/curses.png" : "/assets/gui/normal.png";
            this.l = new x(0);
            if (!this.l.a(string)) {
                this.l = null;
            }
        }
        if (this.i == null) {
            this.i = new x(0);
            if (!this.i.a("/assets/gui/booktag.png")) {
                this.i = null;
            }
        }
        if (this.h == null) {
            this.h = new x(0);
            if (!this.h.a("/assets/gui/skills.png")) {
                this.h = null;
            }
        }
        if (this.j == null) {
            this.j = new x(0);
            if (!this.j.a("/assets/gui/outline.png")) {
                this.j = null;
                return false;
            }
        }
        if (this.m == null) {
            this.m = new x(0);
            if (!this.m.a("/assets/gui/slot_pet.png")) {
                this.m = null;
                return false;
            }
        }
        if (this.n == null) {
            this.n = new x(0);
            if (!this.n.a("/assets/gui/slot_pet_mini.png")) {
                this.n = null;
                return false;
            }
        }
        if (this.o == null) {
            this.o = new x(0);
            if (!this.o.a("/assets/gui/slot_cosmetic.png")) {
                this.o = null;
                return false;
            }
        }
        return true;
    }

    public void a(Graphics graphics) {
        int n;
        int n2;
        if (this.d == null) {
            return;
        }
        Graphics graphics2 = graphics;
        if (!this.d()) {
            return;
        }
        graphics2.setFont(w.b());
        this.g.a(this.c(), this.b());
        this.g.a(graphics2);
        if (this.d != null) {
            this.f = true;
            for (c object2 : rs.gui.b.c.c.values()) {
                this.a(graphics2, object2);
            }
            if (this.j != null) {
                Object object;
                int n3 = 3;
                n2 = 0;
                int n4 = 161;
                n2 = 323;
                this.j.a(n4 + -9 + (n3 += this.c()), 11 + (n2 += this.b()));
                this.j.a(graphics2);
                if (this.m != null && this.d.b() == 0) {
                    this.m.a(n4 + -9 + n3, 10 + n2);
                    this.m.a(graphics2);
                } else {
                    f n5 = new f(this.d.b());
                    object = n5.c();
                    if (object != null) {
                        object.a(n4 + 3 + -9 + n3, 13 + n2);
                        object.a(graphics2);
                    }
                }
                this.j.a(n4 + 44 + -9 + n3, 11 + n2);
                this.j.a(graphics2);
                if (this.n != null && this.d.h() == 0) {
                    this.n.a(n4 + 44 + -9 + n3, 10 + n2);
                    this.n.a(graphics2);
                } else {
                    f f2 = new f(this.d.h());
                    object = f2.c();
                    if (object != null) {
                        object.a(n4 + 44 + 3 + -9 + n3, 13 + n2);
                        object.a(graphics2);
                    }
                }
                int n5 = 22;
                n2 = 2;
                this.j.a(n5 + -9 + n3, 11 + n2 + this.b());
                this.j.a(graphics2);
                if (this.d.i() > 0) {
                    object = new f(this.d.i());
                    x x2 = ((f)object).c();
                    if (x2 != null) {
                        x2.a(n5 + 3 + -9 + n3, 13 + n2 + this.b());
                        x2.a(graphics2);
                    }
                } else {
                    this.o.a(n5 + -9 + n3, 11 + n2 + this.b());
                    this.o.a(graphics2);
                }
            }
        }
        for (n = 0; n < 28; ++n) {
            this.a(graphics2, n);
        }
        n = 255;
        n2 = 335;
        n += this.c();
        n2 += this.b();
        if (this.i != null) {
            this.i.a(n, n2);
            this.i.a(graphics2);
        }
        if (this.k != null) {
            this.k.a(n + 10, n2 + 6);
            this.k.a(graphics2);
        }
        n += 45;
        if (this.i != null) {
            String string;
            this.i.a(n, n2);
            this.i.a(graphics2);
            String string2 = string = this.d.e() == 1 ? "/assets/gui/curses.png" : "/assets/gui/normal.png";
            if (this.l != null) {
                this.l.a(n + 4, n2 + 2);
                this.l.a(graphics2);
            }
        }
        if (this.h != null) {
            int n6 = 21;
            int n7 = 225;
            int n8 = 0;
            int n9 = n7 + this.b();
            n8 = this.b();
            this.h.a(n6 += this.c(), n9);
            this.h.a(graphics2);
            graphics2.setColor(Color.YELLOW);
            for (int i = 0; i < this.d.c().length; ++i) {
                graphics2.drawString("" + this.d.c()[i], rs.gui.b.c.a.a[i][0] - 1 + (n6 - 28), rs.gui.b.c.a.a[i][1] + 2 + n8);
                graphics2.drawString("" + this.d.c()[i], rs.gui.b.c.a.a[i][0] + 10 + (n6 - 28), rs.gui.b.c.a.a[i][1] + 13 + 2 + n8);
            }
        }
        if (!this.f || !this.e) {
            Launcher.n().b(500, false);
        }
    }

    private void a(Graphics graphics, int n) {
        int n2 = 0;
        for (int i = 0; i < 7; ++i) {
            for (int j = 0; j < 4; ++j) {
                if (n2 != n) {
                    ++n2;
                    continue;
                }
                int n3 = 0;
                int n4 = 181 + j * 39 + n3;
                int n5 = 19 + i * 40;
                n4 += this.c();
                n5 += this.b();
                if (this.j == null) continue;
                this.j.a(n4, n5);
                this.j.a(graphics);
                this.e = true;
                if (this.d != null && this.d.d()[n] != null) {
                    f f2 = this.d.d()[n];
                    x x2 = f2.c();
                    if (x2 != null) {
                        x2.a(n4 + 1, n5 + 1);
                        x2.a(graphics);
                        if (this.d.d()[n].a() > 0 && this.d.d()[n].b() > 1) {
                            int n6 = this.d.d()[n].b();
                            if (n6 >= 10000000) {
                                graphics.setColor(Color.GREEN);
                            } else if (n6 < 10000000 && n6 >= 100000) {
                                graphics.setColor(Color.WHITE);
                            } else {
                                graphics.setColor(Color.YELLOW);
                            }
                            graphics.drawString(Client.g((int)this.d.d()[n].b()), n4 + 1, n5 + 9);
                        }
                    } else {
                        this.e = false;
                    }
                }
                ++n2;
            }
        }
    }

    private void a(Graphics graphics, c c2) {
        if (this.j == null || c2 == null) {
            return;
        }
        int n = -90;
        int n2 = 10;
        this.j.a(c2.c() + -9 + (n += this.c()), c2.d() + 10 + (n2 += this.b()));
        this.j.a(graphics);
        if (this.d == null) {
            return;
        }
        if (this.d.a().get((Object)c2) == null) {
            if (c2.a() != null) {
                c2.a().a(c2.c() + -9 + n, c2.d() + 10 + n2);
                c2.a().a(graphics);
            }
            return;
        }
        f f2 = this.d.a().get((Object)c2);
        x x2 = f2.c();
        if (x2 != null) {
            x2.a(c2.c() + -9 + 2 + n, c2.d() + 10 + 2 + n2);
            x2.a(graphics);
            if (this.d.a().get((Object)c2).a() > 0 && this.d.a().get((Object)c2).b() > 1) {
                int n3 = this.d.a().get((Object)c2).b();
                if (n3 >= 10000000) {
                    graphics.setColor(Color.GREEN);
                } else if (n3 < 10000000 && n3 >= 100000) {
                    graphics.setColor(Color.WHITE);
                } else {
                    graphics.setColor(Color.YELLOW);
                }
                graphics.drawString(Client.g((int)this.d.a().get((Object)c2).b()), c2.c() + -9 + n + 2, c2.d() + 10 + n2 + 10);
            }
        } else if (this.d.a().get((Object)c2).a() <= 0 && c2.a() != null) {
            c2.a().a(c2.c() + -9 + n, c2.d() + 10 + n2);
            c2.a().a(graphics);
        }
    }

    public int b() {
        return 94;
    }

    public int c() {
        return 9;
    }
}

package rs.gui.bpkg.cpkg;

import java.awt.Color;
import java.awt.Graphics;
import rs.Client;
import rs.gui.Launcher;
import rs.gui.bpkg.f;
import rs.gui.w;
import rs.gui.x;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/c/b.class */
public class b {
    public static final int a = 0;
    private static final int b = -9;
    private static final int c = 10;
    private rs.gui.bpkg.a d;
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

    public void a(rs.gui.bpkg.a aVar) {
        this.d = aVar;
        a();
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
            String str = this.d.e() == 1 ? "/assets/gui/curses.png" : "/assets/gui/normal.png";
            this.l = new x(0);
            if (!this.l.a(str)) {
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
        if (this.o != null) {
            return true;
        }
        this.o = new x(0);
        if (this.o.a("/assets/gui/slot_cosmetic.png")) {
            return true;
        }
        this.o = null;
        return false;
    }

    public void a(Graphics graphics) {
        if (this.d != null && d()) {
            graphics.setFont(w.b());
            this.g.a(c(), b());
            this.g.a(graphics);
            if (this.d != null) {
                this.f = true;
                for (c cVar : c.values()) {
                    a(graphics, cVar);
                }
                if (this.j != null) {
                    int iC = 3 + c();
                    int iB = 323 + b();
                    this.j.a((161 - 9) + iC, 11 + iB);
                    this.j.a(graphics);
                    if (this.m == null || this.d.b() != 0) {
                        x xVarC = new f(this.d.b()).c();
                        if (xVarC != null) {
                            xVarC.a(((161 + 3) - 9) + iC, 13 + iB);
                            xVarC.a(graphics);
                        }
                    } else {
                        this.m.a((161 - 9) + iC, 10 + iB);
                        this.m.a(graphics);
                    }
                    this.j.a(((161 + 44) - 9) + iC, 11 + iB);
                    this.j.a(graphics);
                    if (this.n == null || this.d.h() != 0) {
                        x xVarC2 = new f(this.d.h()).c();
                        if (xVarC2 != null) {
                            xVarC2.a((((161 + 44) + 3) - 9) + iC, 13 + iB);
                            xVarC2.a(graphics);
                        }
                    } else {
                        this.n.a(((161 + 44) - 9) + iC, 10 + iB);
                        this.n.a(graphics);
                    }
                    this.j.a((22 - 9) + iC, 11 + 2 + b());
                    this.j.a(graphics);
                    if (this.d.i() > 0) {
                        x xVarC3 = new f(this.d.i()).c();
                        if (xVarC3 != null) {
                            xVarC3.a(((22 + 3) - 9) + iC, 13 + 2 + b());
                            xVarC3.a(graphics);
                        }
                    } else {
                        this.o.a((22 - 9) + iC, 11 + 2 + b());
                        this.o.a(graphics);
                    }
                }
            }
            for (int i = 0; i < 28; i++) {
                a(graphics, i);
            }
            int iC2 = 255 + c();
            int iB2 = 335 + b();
            if (this.i != null) {
                this.i.a(iC2, iB2);
                this.i.a(graphics);
            }
            if (this.k != null) {
                this.k.a(iC2 + 10, iB2 + 6);
                this.k.a(graphics);
            }
            int i2 = iC2 + 45;
            if (this.i != null) {
                this.i.a(i2, iB2);
                this.i.a(graphics);
                String str = this.d.e() == 1 ? "/assets/gui/curses.png" : "/assets/gui/normal.png";
                if (this.l != null) {
                    this.l.a(i2 + 4, iB2 + 2);
                    this.l.a(graphics);
                }
            }
            if (this.h != null) {
                int iC3 = 21 + c();
                int iB3 = 225 + b();
                int iB4 = b();
                this.h.a(iC3, iB3);
                this.h.a(graphics);
                graphics.setColor(Color.YELLOW);
                for (int i3 = 0; i3 < this.d.c().length; i3++) {
                    graphics.drawString(this.d.c()[i3], (a.a[i3][0] - 1) + (iC3 - 28), a.a[i3][1] + 2 + iB4);
                    graphics.drawString(this.d.c()[i3], a.a[i3][0] + 10 + (iC3 - 28), a.a[i3][1] + 13 + 2 + iB4);
                }
            }
            if (this.f && this.e) {
                return;
            }
            Launcher.n().b(500, false);
        }
    }

    private void a(Graphics graphics, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 4; i4++) {
                if (i2 != i) {
                    i2++;
                } else {
                    int iC = 181 + (i4 * 39) + 0 + c();
                    int iB = 19 + (i3 * 40) + b();
                    if (this.j != null) {
                        this.j.a(iC, iB);
                        this.j.a(graphics);
                        this.e = true;
                        if (this.d != null && this.d.d()[i] != null) {
                            x xVarC = this.d.d()[i].c();
                            if (xVarC != null) {
                                xVarC.a(iC + 1, iB + 1);
                                xVarC.a(graphics);
                                if (this.d.d()[i].a() > 0 && this.d.d()[i].b() > 1) {
                                    int iB2 = this.d.d()[i].b();
                                    if (iB2 >= 10000000) {
                                        graphics.setColor(Color.GREEN);
                                    } else if (iB2 >= 10000000 || iB2 < 100000) {
                                        graphics.setColor(Color.YELLOW);
                                    } else {
                                        graphics.setColor(Color.WHITE);
                                    }
                                    graphics.drawString(Client.g(this.d.d()[i].b()), iC + 1, iB + 9);
                                }
                            } else {
                                this.e = false;
                            }
                        }
                        i2++;
                    }
                }
            }
        }
    }

    private void a(Graphics graphics, c cVar) {
        if (this.j == null || cVar == null) {
            return;
        }
        int iC = (-90) + c();
        int iB = 10 + b();
        this.j.a((cVar.c() - 9) + iC, cVar.d() + 10 + iB);
        this.j.a(graphics);
        if (this.d == null) {
            return;
        }
        if (this.d.a().get(cVar) == null) {
            if (cVar.a() != null) {
                cVar.a().a((cVar.c() - 9) + iC, cVar.d() + 10 + iB);
                cVar.a().a(graphics);
                return;
            }
            return;
        }
        x xVarC = this.d.a().get(cVar).c();
        if (xVarC == null) {
            if (this.d.a().get(cVar).a() > 0 || cVar.a() == null) {
                return;
            }
            cVar.a().a((cVar.c() - 9) + iC, cVar.d() + 10 + iB);
            cVar.a().a(graphics);
            return;
        }
        xVarC.a((cVar.c() - 9) + 2 + iC, cVar.d() + 10 + 2 + iB);
        xVarC.a(graphics);
        if (this.d.a().get(cVar).a() <= 0 || this.d.a().get(cVar).b() <= 1) {
            return;
        }
        int iB2 = this.d.a().get(cVar).b();
        if (iB2 >= 10000000) {
            graphics.setColor(Color.GREEN);
        } else if (iB2 >= 10000000 || iB2 < 100000) {
            graphics.setColor(Color.YELLOW);
        } else {
            graphics.setColor(Color.WHITE);
        }
        graphics.drawString(Client.g(this.d.a().get(cVar).b()), (cVar.c() - 9) + iC + 2, cVar.d() + 10 + iB + 10);
    }

    public int b() {
        return 94;
    }

    public int c() {
        return 9;
    }
}

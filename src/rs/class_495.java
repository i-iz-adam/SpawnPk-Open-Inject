package rs;

import gnu.trove.f.b.cc;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import rs.plugins.cpkg.c;

/* JADX INFO: loaded from: client-final.jar:rs/class_495.class */
public class class_495 {
    private Widget a;
    private List<class_494> b = new ArrayList();
    private cc<class_494> c = new cc<>();
    private HashMap<Integer, Point> d = new HashMap<>();

    public class_495(Widget widget) {
        this.a = widget;
        if (Configuration.c()) {
            c.c.put(Integer.valueOf(widget.au), this);
        }
    }

    public class_494 a(int i) {
        return a(i, true);
    }

    public class_494 a(int i, boolean z) {
        class_494 class_494Var = new class_494(this, i);
        this.b.add(class_494Var);
        this.c.a(i, class_494Var);
        if (!(Widget.l(i) instanceof class_343)) {
            return class_494Var;
        }
        class_343 class_343Var = (class_343) Widget.l(i);
        class_343Var.o(this.b.size());
        a(class_345.c).b(i, 0, class_343Var.aP + 1);
        return class_494Var;
    }

    public class_494 a(Widget widget) {
        if (widget instanceof class_350) {
            ((class_350) widget).a();
        }
        if (!(widget instanceof class_342) || !((class_342) widget).b()) {
            return a(widget.au);
        }
        class_494 class_494VarA = a(widget.au);
        a(widget.au + 1).b(widget.au, 0, 0);
        return class_494VarA;
    }

    public void a() {
        this.a.k(this.b.size());
        for (int i = 0; i < this.b.size(); i++) {
            class_494 class_494Var = this.b.get(i);
            int iF = class_494Var.f();
            int iG = class_494Var.g();
            if (class_494Var.h() > 0) {
                class_494 class_494VarB = this.c.b(class_494Var.h());
                int iF2 = class_494VarB.f();
                int iG2 = class_494VarB.g();
                iF = iF2 + class_494Var.i();
                iG = iG2 + class_494Var.j();
            }
            if (class_494Var.k() > 0) {
                Point point = this.d.get(Integer.valueOf(class_494Var.k()));
                iF = point.x + class_494Var.l();
                iG = point.y + class_494Var.m();
            }
            if (class_494Var.e() != null) {
                class_494 class_494VarB2 = this.c.b(class_494Var.e().a());
                int iA = class_494VarB2.a();
                int iB = class_494VarB2.b();
                if (class_494Var.e().h() > 0 && iA > class_494Var.e().h()) {
                    iA = class_494Var.e().h();
                }
                if (class_494Var.e().i() > 0 && iB > class_494Var.e().i()) {
                    iB = class_494Var.e().i();
                }
                iF = class_494VarB2.f() + (class_494Var.e().d() ? (int) (iA * class_494Var.e().f()) : 0) + class_494Var.e().b();
                iG = class_494VarB2.g() + (class_494Var.e().e() ? (int) (iB * class_494Var.e().g()) : 0) + class_494Var.e().c();
                if (class_494VarB2.h() > 0) {
                    class_494 class_494VarB3 = this.c.b(class_494VarB2.h());
                    iF += class_494VarB3.f() + class_494VarB2.i();
                    iG += class_494VarB3.g() + class_494VarB2.j();
                }
            }
            this.a.b(i, class_494Var.c(), iF, iG);
            this.d.put(Integer.valueOf(class_494Var.c()), new Point(iF, iG));
        }
        Widget.H[this.a.au] = this.a;
    }

    public void b() {
        this.b.clear();
    }

    public class_494 b(int i) {
        return this.c.b(i);
    }

    public Widget c() {
        return this.a;
    }

    public List<class_494> d() {
        return this.b;
    }

    public cc<class_494> e() {
        return this.c;
    }

    public HashMap<Integer, Point> f() {
        return this.d;
    }
}

package rs.plugins.q;

import com.google.c.C;
import com.google.c.l;
import com.google.inject.Provides;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Inject;
import rs.class_12;
import rs.class_139;
import rs.plugins.e;

/* JADX INFO: loaded from: client-final.jar:rs/s/q/d.class */
@e(a = "PvP Tracker", b = "pvptracker")
public class d extends rs.plugins.a {
    public static String b = "pvptracker";
    public static l c;
    public static a d;
    public static d e;

    @Inject
    private rs.ui.e f;

    @Inject
    private class_139 g;

    @Inject
    private ScheduledExecutorService h;

    @Inject
    private a i;

    @Inject
    private l j;
    private rs.plugins.q.apkg.a k;
    private ArrayList<rs.plugins.q.apkg.a> l;
    private b m;
    private rs.ui.l n;

    @Provides
    a a(class_139 class_139Var) {
        return (a) class_139Var.a(a.class);
    }

    @Override // rs.s.a
    protected void a() {
        d = this.i;
        e = this;
        c = this.j.a().b().a((Type) Double.class, (Object) (d2, type, d3) -> {
            return d2.isNaN() ? new C((Number) 0) : new C((Number) BigDecimal.valueOf(d2.doubleValue()).setScale(3, RoundingMode.HALF_UP));
        }).j();
        this.l = new ArrayList<>();
        this.k = new rs.plugins.q.apkg.a();
        this.m = (b) this.a.getInstance(b.class);
        this.n = rs.ui.l.a().a("PvP Tracker").a(class_12.b(getClass(), "pvp_icon.png")).a(2).a(this.m).a();
        this.f.a(this.n);
    }

    @Override // rs.s.a
    protected void b() {
        this.f.b(this.n);
    }

    public void f() {
        if (this.k == null || this.k.c()) {
            return;
        }
        rs.plugins.q.apkg.a aVar = new rs.plugins.q.apkg.a();
        aVar.a(new rs.plugins.q.apkg.b(this.k.d().k()));
        aVar.d().e(this.k.d().g());
        aVar.d().a(this.k.d().i(), this.k.d().h());
        aVar.d().b(this.k.d().e(), this.k.d().f());
        aVar.d().c(this.k.d().j());
        aVar.b(new rs.plugins.q.apkg.b(this.k.e().k()));
        aVar.e().e(this.k.e().g());
        aVar.e().a(this.k.e().i(), this.k.e().h());
        aVar.e().b(this.k.e().e(), this.k.e().f());
        aVar.e().c(this.k.e().j());
        this.l.add(aVar);
        this.m.a(aVar);
        this.k = new rs.plugins.q.apkg.a();
        this.m.c().a(this.k);
        this.m.c().a();
    }

    public void a(String str) {
        this.g.b(b, "nameFilter", str.trim().toLowerCase());
    }

    public void g() {
    }

    public void b(String str) {
    }

    public void h() {
        this.l.clear();
        this.m.b();
    }

    public rs.plugins.q.apkg.a i() {
        return this.k;
    }

    public ArrayList<rs.plugins.q.apkg.a> j() {
        return this.l;
    }

    public b k() {
        return this.m;
    }
}

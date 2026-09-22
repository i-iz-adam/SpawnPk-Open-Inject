package rs.plugins.m;

import com.google.inject.Provides;
import javax.inject.Inject;
import rs.class_12;
import rs.class_139;
import rs.ui.l;

/* JADX INFO: loaded from: client-final.jar:rs/s/m/f.class */
@rs.plugins.e(a = "Notes", b = "notes", c = "Enable the Notes panel", d = {"panel"}, i = true, k = true)
public class f extends rs.plugins.a {

    @Inject
    private rs.ui.e b;

    @Inject
    private a c;
    private b d;
    private l e;

    @Provides
    a a(class_139 class_139Var) {
        return (a) class_139Var.a(a.class);
    }

    @Override // rs.s.a
    protected void a() {
        this.d = (b) this.a.getInstance(b.class);
        this.d.a(this.c);
        this.e = l.a().a("Notes").a(class_12.b(getClass(), "notes_icon.png")).a(5).a(this.d).a();
        this.b.a(this.e);
    }

    @Override // rs.s.a
    protected void b() {
        this.b.b(this.e);
    }
}

package rs.plugins.r;

import com.google.inject.Provides;
import javax.inject.Inject;
import rs.class_139;
import rs.class_313;
import rs.plugins.e;

/* JADX INFO: loaded from: client-final.jar:rs/s/r/c.class */
@e(a = "Tile Indicators", b = "tileindicators", c = "Highlight the tile you are currently moving to", d = {"highlight", "overlay"}, f = false)
public class c extends rs.plugins.a {

    @Inject
    private b b;

    @Provides
    a a(class_139 class_139Var) {
        return (a) class_139Var.a(a.class);
    }

    @Override // rs.s.a
    protected void a() {
        class_313.d().a(this.b);
    }

    @Override // rs.s.a
    protected void b() {
        class_313.d().b(this.b);
    }
}

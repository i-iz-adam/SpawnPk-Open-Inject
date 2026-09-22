package rs.plugins.gpkg;

import javax.inject.Inject;
import rs.class_12;
import rs.plugins.e;
import rs.ui.l;

/* JADX INFO: loaded from: client-final.jar:rs/s/g/b.class */
@e(a = "Item ID Search", b = "itemsearch", c = "Enable the Item ID Search Panel", d = {"panel"}, f = false)
public class b extends rs.plugins.a {

    @Inject
    private rs.ui.e b;
    private a c;
    private l d;

    @Override // rs.s.a
    protected void a() {
        this.c = (a) this.a.getInstance(a.class);
        this.c.b();
        this.d = l.a().a("Item ID Search").a(class_12.b(getClass(), "search.png")).a(6).a(this.c).a();
        this.b.a(this.d);
    }

    @Override // rs.s.a
    protected void b() {
        this.b.b(this.d);
    }
}

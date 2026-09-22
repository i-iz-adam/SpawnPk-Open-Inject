package rs.plugins.t;

import rs.ItemComposition;
import rs.class_553;

/* JADX INFO: loaded from: client-final.jar:rs/s/t/j.class */
class j extends class_553 {
    private static final int d = 1;
    private static final int e = 2;

    j() {
    }

    @Override // rs.class_553
    public void a() {
        switch (e()) {
            case 1:
                c cVar = new c();
                cVar.b(g());
                cVar.d(g());
                cVar.c(g());
                cVar.e(g());
                cVar.a(b.values()[e()]);
                cVar.c(ItemComposition.lookupItem(cVar.f()).itemName.replace("@gre@", ""));
                i.c.f().e().a(cVar);
                break;
            case 2:
                i.c.f().e().b(g());
                break;
        }
    }
}

package rs;

import gnu.trove.f.b.bU;
import gnu.trove.i.a.i;
import java.util.HashSet;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;
import rs.plugins.cpkg.c;
import rs.plugins.cpkg.d;

/* JADX INFO: loaded from: client-final.jar:rs/class_282.class */
public abstract class class_282 extends class_307 {
    protected boolean f;
    protected boolean g;
    protected HashSet<Integer> h = new HashSet<>();
    protected HashSet<Integer> e = new HashSet<>();
    protected i i = new i();
    protected i k = new i();
    protected i j = new i();

    public abstract int[] k();

    public abstract class_59 l();

    @Override // rs.class_306
    public void a() {
        if (this.l == null || this.l.ar == null) {
            return;
        }
        boolean z = this.h.size() == 0;
        if (z) {
            s();
        }
        for (int i = 0; i < this.l.ah; i++) {
            if (!this.g || !this.i.a_(this.l.ar[i])) {
                if (z) {
                    this.h.add(Integer.valueOf(this.l.ar[i]));
                }
                a(i, this.l.ar);
            }
        }
        if (z) {
            n();
        }
    }

    public void b(boolean z) {
        this.g = z;
        p();
    }

    public void a(Object obj, boolean z) {
    }

    protected void n() {
        SwingUtilities.invokeLater(() -> {
            for (Integer num : this.h) {
                if (this.j.a_(num.intValue())) {
                    q().addElement(num + " (texture)");
                } else if (this.k.a_(num.intValue())) {
                    q().addElement(num + " (texturized)");
                } else if (this.i.a_(num.intValue())) {
                    q().addElement(num + " (recolored)");
                } else {
                    q().addElement(num);
                }
            }
            c.b.g().ensureIndexIsVisible(this.h.size());
        });
    }

    protected void o() {
        p();
        this.i.clear();
        this.e.clear();
    }

    protected void p() {
        this.i.clear();
        this.h.clear();
        if (q().getSize() > 0) {
            SwingUtilities.invokeLater(() -> {
                q().removeAllElements();
            });
        }
    }

    protected DefaultListModel q() {
        return c.b.g().getModel();
    }

    protected d r() {
        return c.b;
    }

    private void a(int i, int[] iArr) {
        if (this.e.contains(Integer.valueOf(iArr[i]))) {
            iArr[i] = -1;
        } else if (this.f) {
            iArr[i] = 1;
        }
    }

    protected void s() {
        if (l() == null) {
            if (k() != null) {
                for (int i = 0; i < k().length; i++) {
                    this.i.b(k()[i]);
                }
                return;
            }
            return;
        }
        if (l().b()) {
            this.i.b(l().h().b());
        }
        if (l().c()) {
            this.i.b(l().g().b());
            this.k.b(l().g().b());
            for (bU bUVar : l().g().c()) {
                this.i.b(bUVar.e());
                this.j.b(bUVar.e());
            }
        }
        if (l().d()) {
            this.i.b(l().f().a());
        }
    }

    public HashSet<Integer> t() {
        return this.e;
    }

    public void c(boolean z) {
        this.f = z;
    }
}

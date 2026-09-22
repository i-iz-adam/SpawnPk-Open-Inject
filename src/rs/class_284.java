package rs;

import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_284.class */
public class class_284 extends class_282 {
    private int n;
    private ObjectComposition o;

    public class_284() {
        a(class_268.d);
    }

    @Override // rs.class_282
    public int[] k() {
        return this.o.ax;
    }

    @Override // rs.class_282
    public class_59 l() {
        return null;
    }

    @Override // rs.class_282, rs.class_306
    public void a() {
        if (this.n != -1 && this.m != null && (this.m instanceof ObjectComposition) && ((ObjectComposition) this.m).aa == this.n) {
            int size = this.h.size();
            s();
            for (int i = 0; i < this.l.ah; i++) {
                if (!this.g || !this.i.a_(this.l.ar[i])) {
                    this.h.add(Integer.valueOf(this.l.ar[i]));
                }
            }
            if (size != this.h.size()) {
                n();
            }
            super.a();
        }
    }

    @Override // rs.class_282
    public void a(Object obj, boolean z) {
        int iIntValue = ((Integer) obj).intValue();
        if (this.n == iIntValue) {
            if (!z) {
                m();
                return;
            }
            p();
        }
        if (this.n != -1 && this.n != iIntValue && !z) {
            m();
        }
        this.n = iIntValue;
        if (this.n == -1) {
            m();
        } else {
            this.o = ObjectComposition.c(iIntValue);
            Launcher.n().o().drawPlayer2d();
        }
    }

    public void m() {
        o();
        r().c();
        this.n = -1;
    }

    public boolean a(int i) {
        return this.n == i;
    }
}

package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_281.class */
public class class_281 extends class_282 {
    private int n;
    private ItemComposition o;

    public class_281() {
        a(class_268.a);
    }

    @Override // rs.class_282
    public int[] k() {
        return this.o.g;
    }

    @Override // rs.class_282
    public class_59 l() {
        return this.o.aw;
    }

    @Override // rs.class_282, rs.class_306
    public void a() {
        if (this.n != -1 && this.m != null && (this.m instanceof ItemComposition) && ((ItemComposition) this.m).itemId == this.n) {
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
            this.n = -1;
            m();
            return;
        }
        Client.eR.i = true;
        this.o = ItemComposition.lookupItem(iIntValue);
        Client.eR.i = true;
        Client.ba = true;
        Client.bb = iIntValue;
        Client.fb = true;
        Client.bd = this.o.Z;
        Client.be = this.o.G;
        Client.bc = this.o.M;
        Client.bf = this.o.v;
        Client.bg = this.o.W;
    }

    public void m() {
        o();
        r().c();
        this.n = -1;
        Client.eR.i = false;
        Client.ba = false;
    }
}

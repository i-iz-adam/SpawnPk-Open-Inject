package rs;

import javax.inject.Inject;
import rs.plugins.apkg.a;

/* JADX INFO: loaded from: client-final.jar:rs/class_278.class */
public class class_278 extends class_553 {

    @Inject
    private class_139 d;
    private class_277 e;

    @Override // rs.class_553
    public void a() {
        if (this.e == null || this.e.M()) {
            this.e = new class_277((a) this.d.a(a.class));
            class_313.d().a(this.e);
        }
        int iE = e();
        if (iE == 1) {
            this.e.L();
            this.e.k(e() == 1);
            return;
        }
        if (iE == 2) {
            this.e.s = g();
            this.e.t = g();
            return;
        }
        if (iE == 4) {
            int iG = g();
            int iG2 = g();
            if (iG == iG2) {
                this.e.r = 100;
            } else if (iG == 0) {
                this.e.r = 0;
            } else {
                this.e.r = (int) ((iG / iG2) * 100.0f);
            }
            this.e.u = iG + " / " + iG2 + " @yel@(" + this.e.r + "%)";
            this.e.v = iG + " @yel@(" + this.e.r + "%)";
            return;
        }
        if (iE == 5) {
            this.e.w = h();
            return;
        }
        if (iE == 6) {
            this.e.x = "<img=381>" + g();
            return;
        }
        if (iE == 7) {
            int iG3 = g();
            int iG4 = g();
            if (iG3 == iG4) {
                this.e.r = 100;
            } else if (iG3 == 0) {
                this.e.r = 0;
            } else {
                this.e.r = (int) ((iG3 / iG4) * 100.0f);
            }
            String strH = h();
            class_277 class_277Var = this.e;
            this.e.v = strH;
            class_277Var.u = strH;
        }
    }
}

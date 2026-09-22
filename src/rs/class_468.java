package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_468.class */
public class class_468 extends class_310 {
    private class_333 h;
    private int i = 0;
    private String j = "0/1";
    private int k = 0;
    private long l = 0;

    @Override // rs.class_306
    public void a() {
        if (this.h == null) {
            this.h = new class_333("raids/affbar2");
        }
        if (this.i == 0) {
            Client.gl.b(this.j, this.e - 42, (this.f + (this.h.o / 2)) - 20, class_492.c, 0);
            return;
        }
        if (this.i < 5) {
            this.k = 2;
        }
        this.h.r = (int) (((double) this.h.n) * (((double) this.i) / 5.0d));
        this.h.a(this.e, this.f, this.h.r, this.h.o);
        if (System.currentTimeMillis() - this.l > 25) {
            if (k()) {
                int i = this.k - 1;
                this.k = i;
                if (i >= 0) {
                    for (int i2 = 0; i2 <= 4; i2++) {
                        class_313.d().g().b(3, this.e + (i2 * 24), this.f + (this.h.o / 2), 16724735);
                    }
                }
            }
            l();
            this.l = System.currentTimeMillis();
        }
        Client.gl.b(this.j, this.e - 42, (this.f + (this.h.o / 2)) - 20, class_492.c, 0);
    }

    public boolean k() {
        return this.i >= 5;
    }

    public void a(int i) {
        this.i = i;
        switch (this.i) {
            case 0:
                this.j = "@whi@" + this.i + "/5";
                break;
            case 1:
                this.j = "@yel@" + this.i + "/5";
                break;
            case 2:
                this.j = "@or2@" + this.i + "/5";
                break;
            case 3:
                this.j = "@or3@" + this.i + "/5";
                break;
            case 4:
                this.j = "@red@" + this.i + "/5";
                break;
            case 5:
                this.j = "<col=FF00FF><shad=pu2>" + this.i + "/5";
                break;
        }
    }

    private void l() {
        if (this.i > 1 || Client.d(3) != 0) {
            int iMax = Math.max(Math.min(this.i - 1, 4), 1);
            for (int i = 0; i < iMax; i++) {
                int iC = Client.c(this.e, this.e + this.h.r);
                int iC2 = Client.c(this.f, this.f + this.h.o);
                int i2 = 16724509;
                int i3 = k() ? 3 : 7;
                if (this.i == 4) {
                    i3 = 5;
                }
                if (this.i >= 3 && Client.d(i3) == 0) {
                    i2 = 16724735;
                }
                class_288 class_288VarB = b(iC, iC2, i2);
                if (this.i < 3) {
                    class_288VarB.b(-0.075d);
                } else {
                    class_288VarB.b(i % 2 == 0 ? -0.075d : 0.075d);
                }
                class_313.d().g().a(class_288VarB);
            }
        }
    }

    private class_288 b(int i, int i2, int i3) {
        class_288 class_288Var = new class_288(i, i2, i3);
        class_288Var.a(class_289.a);
        class_288Var.a(1 + Client.d(25));
        class_288Var.b(3, 3);
        class_288Var.e(1);
        class_288Var.b(250 + (100 * ((long) Client.d(3))));
        return class_288Var;
    }
}

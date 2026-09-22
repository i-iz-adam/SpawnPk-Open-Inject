package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_442.class */
public class class_442 extends class_310 {
    public static final int h = 457;
    public static final int i = 15;
    private long m = 0;
    private boolean n = false;
    private int o = 0;
    private int p = 0;
    private int q = 0;
    private int r = 0;
    public static int j = 0;
    public static int k = 0;
    public static a[] l = {a.a, null, null};

    /* JADX INFO: loaded from: client-final.jar:rs/class_442$a.class */
    public enum a {
        a(311, 44, 1, 16774912, 16774912),
        b(311, 44, 2, 16711935, 9765119);

        final int c;
        final int d;
        final int e;
        final int f;
        final int g;

        a(int i, int i2, int i3, int i4, int i5) {
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
            this.g = i5;
        }
    }

    @Override // rs.class_306
    public void a() {
        if (System.currentTimeMillis() - this.m > 25) {
            this.n = true;
            this.m = System.currentTimeMillis();
        } else {
            this.n = false;
        }
        if (j > 0) {
            b(this.e, 16774912, j);
        }
        if (k - j > 0) {
            b(this.e + j, 9109758, k - j);
        }
        Widget widget = Widget.H[60249];
        if (Client.br != 60249) {
            this.o = 1;
        } else if (this.n) {
            b(widget.bz + 5, widget.bA + 5, widget.P - 5, widget.aP - 5, 1, 16774912, 16774912);
        }
        Widget widget2 = Widget.H[60251];
        if (this.n) {
            for (int i2 = 0; i2 < l.length; i2++) {
                a aVar = l[i2];
                if (aVar != null) {
                    int i3 = i2 == 1 ? 210 : 111;
                    if (i2 == 2) {
                        i3 = 300;
                    }
                    b(this.e + 335, i3 + (this.f - 375), aVar.c, aVar.d, aVar.e, aVar.f, aVar.g);
                }
            }
        }
    }

    private void b(int i2, int i3, int i4) {
        class_210.d(i2, this.f + 1, i4, 13, i3, 125);
        if (this.n) {
            b(i2, this.f, i4, 15, 3, i3, i3);
        }
    }

    private void b(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i6 > 1 || Client.d(3) != 0) {
            int iMax = Math.max(Math.min(i6 - 1, 4), 1);
            for (int i9 = 0; i9 < iMax; i9++) {
                int iC = Client.c(i2, i2 + i4);
                int iC2 = Client.c(i3, i3 + i5);
                int i10 = i7;
                if (Client.d(6) == 0) {
                    i10 = i8;
                }
                class_288 class_288VarC = c(iC, iC2, i10);
                if (i6 < 3) {
                    class_288VarC.b(-0.075d);
                } else {
                    class_288VarC.b(i9 % 2 == 0 ? -0.075d : 0.075d);
                }
                class_313.d().g().a(class_288VarC);
            }
        }
    }

    private class_288 c(int i2, int i3, int i4) {
        class_288 class_288Var = new class_288(i2, i3, i4);
        class_288Var.a(class_289.a);
        class_288Var.a(1 + Client.d(25));
        class_288Var.b(3, 3);
        class_288Var.e(1);
        class_288Var.b(250 + (100 * ((long) Client.d(3))));
        return class_288Var;
    }
}

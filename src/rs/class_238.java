package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_238.class */
public class class_238 extends class_253 {
    public static final int p = 54484;
    public static final int q = 9765;
    public static final int r = 13960709;
    public static final int s = 30976;
    public static final int t = 13960709;
    public static final int u = 30976;
    public int v = 500;
    public int w = 500;
    public int x = 18;
    public int y = 0;
    public int z = 13960709;
    public int A = 30976;
    public String B;
    public String C;
    public String D;
    public boolean E;
    public static class_553 F = new class_239();

    @Override // rs.class_253
    public void b() {
        this.z = 13960709;
        this.A = 30976;
        this.w = 0;
        this.y = 0;
        this.B = "100%";
        this.C = "";
    }

    @Override // rs.class_253
    public boolean a(Client client) {
        return this.E;
    }

    @Override // rs.class_253
    public void b(Client client, class_254 class_254Var) {
        if (Client.cH == -1 && class_254Var == class_254.b) {
            int i = 150;
            int i2 = 10;
            if (Configuration.ai == class_151.b) {
                i = (Client.aj / 2) - (220 / 2);
                i2 = 23;
            }
            int i3 = i2 - 4;
            if (!Client.ag()) {
                i += 4;
                i3 += 4;
            }
            double d = ((double) this.y) / 100.0d;
            class_210.b(40, i3, i, 5129018, 220, 255);
            class_210.d(i, 220, 40, class_228.t, i3);
            class_210.d(i - 1, 220 + (1 * 2), 40 + (1 * 2), class_228.u, i3 - 1);
            Client.gl.c(this.C, i + ((220 + 4) / 2), i3 + 14, class_492.e, 0);
            Client.gl.a(this.D, (i + 220) - 3, i3 + 14, 3135999, 0);
            int i4 = i3 + 18;
            int i5 = i + 2;
            int i6 = 220 - 6;
            int iCeil = (int) Math.ceil(((double) i6) * d);
            class_210.b(20, i4, i5, 0, i6 + 2, 255);
            class_210.b(20 - 2, i4 + 1, i5 + 1, this.A, i6, 255);
            class_210.b(20 - 2, i4 + 1, i5 + 1, this.z, iCeil, 255);
            Client.gl.c(this.B, i5 + ((i6 + 6) / 2), i4 + 15, class_492.c, 0);
        }
    }

    @Override // rs.class_253
    public void c() {
        this.E = false;
    }

    public void a(boolean z) {
        this.E = z;
    }
}

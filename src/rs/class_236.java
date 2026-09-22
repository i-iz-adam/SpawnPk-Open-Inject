package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_236.class */
public class class_236 extends class_253 {
    public static final class_553 p = new class_237();
    private int q = 0;
    private int r = 0;
    private long s = 0;

    @Override // rs.class_253
    public void b() {
    }

    @Override // rs.class_253
    public boolean a(Client client) {
        return this.r != 0;
    }

    @Override // rs.class_253
    public void b(Client client, class_254 class_254Var) {
        if (class_254Var == class_254.b && this.r != 0) {
            if (this.s == 0) {
                this.s = System.currentTimeMillis();
            }
            long j = ((this.s + (1000 * ((long) this.q))) - this.s) / 100;
            if (j > 0) {
                int i = Client.ag() ? 0 : 4;
                int i2 = Client.ag() ? 0 : 4;
                int iCurrentTimeMillis = (int) (((System.currentTimeMillis() - this.s) / j) * 1 * 2);
                if (this.r < 0) {
                    iCurrentTimeMillis = 255 - iCurrentTimeMillis;
                }
                if (iCurrentTimeMillis > 255) {
                    iCurrentTimeMillis = 255;
                    f();
                }
                if (iCurrentTimeMillis < 0) {
                    iCurrentTimeMillis = 0;
                    f();
                }
                class_210.b(Client.ak, i2, i, 0, Client.aj, iCurrentTimeMillis);
            }
        }
    }

    @Override // rs.class_253
    public void c() {
        f();
    }

    public void a(int i, int i2) {
        this.r = i;
        this.q = i2;
        this.s = 0L;
    }

    public void f() {
        this.r = 0;
        this.s = 0L;
    }
}

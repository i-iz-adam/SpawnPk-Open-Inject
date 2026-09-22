package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_244.class */
public abstract class class_244 extends class_225 {
    private static final int r = 40;
    private static final int s = 40;
    private static final int t = 4;
    private static final int u = 200;
    private static final int v = 100;
    private boolean w;
    private int x;
    private int y;
    private boolean z = true;
    private boolean A = false;
    private int B = 200;
    protected class_333 p;
    protected class_333 q;

    public abstract void f();

    public abstract int g();

    public abstract int h();

    public abstract String i();

    @Override // rs.class_253
    public boolean a(Client client) {
        return this.w && Client.ed != 197;
    }

    @Override // rs.class_253
    public void b(Client client, class_254 class_254Var) {
        if (class_254Var != class_254.a) {
            return;
        }
        class_253.o++;
        this.x = 465;
        this.y = 8;
        if (Configuration.ai == class_151.b) {
            this.x = Client.aj - 280;
        }
        int iJ = this.x + j();
        if (!class_194.a()) {
            if (this.z) {
                this.B -= 4;
                if (this.B <= 100) {
                    this.z = false;
                }
            } else {
                this.B += 4;
                if (this.B >= 200) {
                    this.z = true;
                }
            }
        }
        class_210.b(40, this.y, iJ, g(), 40, this.B - 25);
        class_210.b(34, this.y + 3, iJ + 3, h(), 34, this.B - 100);
        (k() ? this.q : this.p).g(iJ + 2, this.y + 1, this.B + 50);
        for (int i = 0; i < 2; i++) {
            int i2 = this.B - 50;
            class_192.a.a(iJ - 4, (this.y - 1) + (i * 30), i2);
            class_192.a.a(iJ + 31, (this.y - 1) + (i * 30), i2);
        }
        Client.fE[106].g(iJ + 21, this.y + 21, this.B - 25);
        if (k()) {
            client.b((Client.hP - 40) - 20, (Client.hQ + 40) - 30, i());
        }
    }

    @Override // rs.class_253
    public void c() {
        this.w = false;
    }

    @Override // rs.class_225
    public boolean a(int i) {
        if (!k()) {
            this.A = false;
            return false;
        }
        if (Client.cH != -1) {
            this.A = false;
            return true;
        }
        if (i == 0) {
            this.A = true;
        }
        if (i != 1 || !this.A) {
            return true;
        }
        f();
        this.A = false;
        return true;
    }

    private boolean k() {
        return Client.cH == -1 && Client.hP >= this.x + j() && Client.hP <= (this.x + j()) + 40 && Client.hQ >= this.y && Client.hQ <= this.y + 40;
    }

    protected int j() {
        return -(Math.max(class_253.o - 1, 0) * 50);
    }

    public void a(boolean z) {
        this.w = z;
    }
}

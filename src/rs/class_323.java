package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_323.class */
public class class_323 {
    protected Client a;
    protected class_333 b;
    protected class_333 c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    protected boolean i;
    protected boolean j;

    public class_323(Client client, class_333 class_333Var, class_333 class_333Var2, int i, int i2, int i3) {
        this.a = client;
        this.b = class_333Var;
        this.c = class_333Var2;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public class_323(Client client, class_333 class_333Var, class_333 class_333Var2, int i, int i2) {
        this(client, class_333Var, class_333Var2, i, i2, 0);
    }

    public void a(int i, int i2) {
        a(i, i2, b(i, i2));
    }

    public boolean b(int i, int i2) {
        Client client = this.a;
        if (Client.hP < i) {
            return false;
        }
        Client client2 = this.a;
        if (Client.hP > i + this.b.n) {
            return false;
        }
        Client client3 = this.a;
        if (Client.hQ < i2) {
            return false;
        }
        Client client4 = this.a;
        return Client.hQ <= i2 + this.b.o;
    }

    public void a(int i, int i2, boolean z) {
        this.b.c(i, i2);
        this.i = z;
        this.j = this.i;
        if (this.g <= 0 || this.h >= this.g) {
            this.h = 0;
            if (!this.i) {
                if (this.d > 0) {
                    this.d -= this.f;
                }
                if (this.d < 0) {
                    this.d = 0;
                }
            } else if (!this.j) {
                if (this.d > 0) {
                    this.d -= this.f;
                }
                if (this.d < 0) {
                    this.d = 0;
                }
            } else if (this.d < this.e) {
                this.d += this.f;
            } else {
                this.j = false;
            }
        } else {
            this.h++;
        }
        this.c.g(i, i2, this.d);
    }

    public boolean a() {
        return this.j;
    }

    public boolean b() {
        return this.i;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }
}

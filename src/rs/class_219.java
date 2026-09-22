package rs;

/* JADX INFO: loaded from: client-final.jar:rs/class_219.class */
public class class_219 {
    private int a;
    private Client b;
    private String c;
    private String d;
    private class_333 e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;

    public class_219(Client client, class_333 class_333Var, String str, String str2, boolean z) {
        this.b = client;
        this.e = class_333Var;
        this.c = str;
        this.d = str2;
        this.k = z;
        this.a = z ? 1 : 255;
        this.f = 225;
        this.g = 50;
        this.i = true;
        this.j = true;
    }

    public void a() {
        this.a = this.k ? 1 : 255;
        this.i = true;
    }

    public void b() {
        if (this.a > 0) {
            if (this.k && this.i) {
                if (this.a < 175) {
                    this.a += 2;
                } else {
                    this.i = false;
                }
            }
            if (this.b.gm != null) {
                if (this.k) {
                    this.e.g(this.f, this.g, this.a);
                } else {
                    this.e.c(this.f, this.g);
                }
                if (this.j) {
                    this.b.gm.d(this.c, this.f + 175, this.g + 20, class_492.c, 0, this.a);
                    this.b.gm.d(this.d, this.f + 175, this.g + 36, class_492.c, 0, this.a);
                } else {
                    this.b.gm.c(this.c, this.f + 15, this.g + 20, class_492.c, 0, this.a);
                    this.b.gm.c(this.d, this.f + 15, this.g + 36, class_492.c, 0, this.a);
                }
            }
        }
    }

    public boolean c() {
        return this.a > 0;
    }

    public void a(boolean z) {
        this.k = z;
    }

    public void a(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public void a(int i) {
        this.f = i;
    }

    public void b(int i) {
        this.g = i;
    }

    public void b(boolean z) {
        this.j = z;
    }

    public boolean d() {
        return this.j;
    }
}

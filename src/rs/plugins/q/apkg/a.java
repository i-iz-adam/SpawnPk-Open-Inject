package rs.plugins.q.apkg;

/* JADX INFO: loaded from: client-final.jar:rs/s/q/a/a.class */
public class a {
    private b a = new b("N/A");
    private b b = new b("N/A");
    private int c;

    public void a(int i, b bVar) {
        this.c += i;
        bVar.a(i);
    }

    public boolean a() {
        return this.a.a() > this.b.a();
    }

    public boolean b() {
        return this.a.b() > this.b.b();
    }

    public boolean c() {
        return this.a.k().equalsIgnoreCase("N/A") || this.b.k().equalsIgnoreCase("N/A");
    }

    public b d() {
        return this.a;
    }

    public void a(b bVar) {
        this.a = bVar;
    }

    public b e() {
        return this.b;
    }

    public void b(b bVar) {
        this.b = bVar;
    }

    public int f() {
        return this.c;
    }

    public void a(int i) {
        this.c = i;
    }
}

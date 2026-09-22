package rs.plugins.o;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import rs.Npc;
import rs.runelite.a.p;

/* JADX INFO: loaded from: client-final.jar:rs/s/o/b.class */
class b {
    private int a;
    private String b;
    private int c;
    private int d;
    private int e;
    private List<p> f;

    b(Npc npc) {
        this.b = npc.aG.o;
        Objects.requireNonNull(npc);
        this.a = -1;
        this.f = new ArrayList(2);
        this.e = -1;
        this.d = -1;
        if (npc.aG != null) {
            this.c = npc.aG.r;
        }
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public void a(int i) {
        this.d = i;
    }

    public int e() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }

    public List<p> f() {
        return this.f;
    }

    public void a(List<p> list) {
        this.f = list;
    }
}

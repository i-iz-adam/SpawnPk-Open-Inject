package rs.gui.bpkg;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a.class */
public class a {
    public static final int a = 0;
    public static final int b = 1;
    private String c;
    private e e;
    private Spellbook f = Spellbook.a;
    private int i = 1;
    private final f[] j = new f[28];
    private final Map<rs.gui.bpkg.cpkg.c, f> k = new HashMap();
    private final int[] m = new int[7];
    private int g = 0;
    private int h = 0;
    private int l = 0;
    private Color d = Color.WHITE;

    /* JADX INFO: loaded from: client-final.jar:rs/gui/b/a$a.class */
    public enum Spellbook {
        a(0, "/assets/gui/lunar.png", "Lunar"),
        b(1, "/assets/gui/ancients.png", "Ancients"),
        c(2, "/assets/gui/modern.png", "Modern");

        private String d;
        private String e;
        private int f;

        Spellbook(int i, String str, String str2) {
            this.f = i;
            this.e = str;
            this.d = str2;
        }

        public String a() {
            return this.e;
        }

        public String b() {
            return this.d;
        }

        public int c() {
            return this.f;
        }

        public static Spellbook a(int i) {
            for (Spellbook aVar : values()) {
                if (aVar.c() == i) {
                    return aVar;
                }
            }
            return a;
        }
    }

    public a(String str) {
        this.c = str;
        for (int i = 0; i < this.m.length; i++) {
            this.m[i] = 99;
        }
    }

    public Map<rs.gui.bpkg.cpkg.c, f> a() {
        return this.k;
    }

    public int b() {
        return this.g;
    }

    public void a(int i) {
        this.g = i;
    }

    public int[] c() {
        return this.m;
    }

    public f[] d() {
        return this.j;
    }

    public void a(int i, f fVar) {
        this.j[i] = fVar;
    }

    public int e() {
        return this.i;
    }

    public void b(int i) {
        this.i = i;
    }

    public String f() {
        return this.c;
    }

    public void a(String str) {
        this.c = str;
    }

    public Spellbook g() {
        return this.f;
    }

    public void a(Spellbook aVar) {
        this.f = aVar;
    }

    public void a(rs.gui.bpkg.cpkg.c cVar, int i) {
        this.k.put(cVar, new f(i));
    }

    public void a(rs.gui.bpkg.cpkg.c cVar, f fVar) {
        this.k.put(cVar, fVar);
    }

    public int h() {
        return this.h;
    }

    public void c(int i) {
        this.h = i;
    }

    public void d(int i) {
        this.l = i;
    }

    public int i() {
        return this.l;
    }

    public Color j() {
        return this.d;
    }

    public void a(Color color) {
        this.d = color;
    }

    public e k() {
        return this.e;
    }

    public void a(e eVar) {
        this.e = eVar;
    }
}

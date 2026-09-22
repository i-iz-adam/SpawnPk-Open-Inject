package rs.ui;

import java.awt.image.BufferedImage;
import java.util.Map;

/* JADX INFO: loaded from: client-final.jar:rs/ui/l.class */
public class l {
    private final BufferedImage a;
    private boolean b;
    private final String c;
    private boolean d;
    private Runnable e;
    private Runnable f;
    private m g;
    private int h;
    private Map<String, Runnable> i;

    /* JADX INFO: loaded from: client-final.jar:rs/ui/l$a.class */
    public static class a {
        private BufferedImage a;
        private boolean b;
        private boolean c;
        private boolean d;
        private String e;
        private boolean f;
        private Runnable g;
        private Runnable h;
        private m i;
        private int j;
        private Map<String, Runnable> k;

        a() {
        }

        public a a(BufferedImage bufferedImage) {
            this.a = bufferedImage;
            return this;
        }

        public a a(boolean z) {
            this.c = z;
            this.b = true;
            return this;
        }

        public a a(String str) {
            this.e = str;
            this.d = true;
            return this;
        }

        public a b(boolean z) {
            this.f = z;
            return this;
        }

        public a a(Runnable runnable) {
            this.g = runnable;
            return this;
        }

        public a b(Runnable runnable) {
            this.h = runnable;
            return this;
        }

        public a a(m mVar) {
            this.i = mVar;
            return this;
        }

        public a a(int i) {
            this.j = i;
            return this;
        }

        public a a(Map<String, Runnable> map) {
            this.k = map;
            return this;
        }

        public l a() {
            boolean zM = this.c;
            if (!this.b) {
                zM = l.m();
            }
            String strN = this.e;
            if (!this.d) {
                strN = l.n();
            }
            return new l(this.a, zM, strN, this.f, this.g, this.h, this.i, this.j, this.k);
        }

        public String toString() {
            return "NavigationButton.NavigationButtonBuilder(icon=" + String.valueOf(this.a) + ", tab$value=" + this.c + ", tooltip$value=" + this.e + ", selected=" + this.f + ", onClick=" + String.valueOf(this.g) + ", onSelect=" + String.valueOf(this.h) + ", panel=" + String.valueOf(this.i) + ", priority=" + this.j + ", popup=" + String.valueOf(this.k) + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String n() {
        return "";
    }

    l(BufferedImage bufferedImage, boolean z, String str, boolean z2, Runnable runnable, Runnable runnable2, m mVar, int i, Map<String, Runnable> map) {
        this.a = bufferedImage;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.e = runnable;
        this.f = runnable2;
        this.g = mVar;
        this.h = i;
        this.i = map;
    }

    public static a a() {
        return new a();
    }

    public BufferedImage b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public boolean e() {
        return this.d;
    }

    public Runnable f() {
        return this.e;
    }

    public Runnable g() {
        return this.f;
    }

    public m h() {
        return this.g;
    }

    public int i() {
        return this.h;
    }

    public Map<String, Runnable> j() {
        return this.i;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public void b(boolean z) {
        this.d = z;
    }

    public void a(Runnable runnable) {
        this.e = runnable;
    }

    public void b(Runnable runnable) {
        this.f = runnable;
    }

    public void a(m mVar) {
        this.g = mVar;
    }

    public void a(int i) {
        this.h = i;
    }

    public void a(Map<String, Runnable> map) {
        this.i = map;
    }

    public String toString() {
        return "NavigationButton(icon=" + String.valueOf(b()) + ", tab=" + c() + ", tooltip=" + d() + ", selected=" + e() + ", onClick=" + String.valueOf(f()) + ", onSelect=" + String.valueOf(g()) + ", panel=" + String.valueOf(h()) + ", priority=" + i() + ", popup=" + String.valueOf(j()) + ")";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!lVar.a(this)) {
            return false;
        }
        String strD = d();
        String strD2 = lVar.d();
        if (strD == null) {
            return strD2 == null;
        }
        return strD.equals(strD2);
    }

    protected boolean a(Object obj) {
        return obj instanceof l;
    }

    public int hashCode() {
        String strD = d();
        return (1 * 59) + (strD == null ? 43 : strD.hashCode());
    }
}

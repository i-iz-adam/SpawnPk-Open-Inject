package rs.plugins.cpkg;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.inject.Inject;
import rs.Widget;
import rs.class_310;

/* JADX INFO: loaded from: client-final.jar:rs/s/c/e.class */
public class e extends class_310 {
    private final rs.plugins.cpkg.a h;
    private final Queue<a> i = new ArrayDeque();

    /* JADX INFO: loaded from: client-final.jar:rs/s/c/e$a.class */
    static final class a {
        private final String a;
        private final int b;
        private final int c;
        private final h d;

        public a(String str, int i, int i2, h hVar) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = hVar;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public h d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (b() != aVar.b() || c() != aVar.c()) {
                return false;
            }
            String strA = a();
            String strA2 = aVar.a();
            if (strA == null) {
                if (strA2 != null) {
                    return false;
                }
            } else if (!strA.equals(strA2)) {
                return false;
            }
            h hVarD = d();
            h hVarD2 = aVar.d();
            if (hVarD == null) {
                return hVarD2 == null;
            }
            return hVarD.equals(hVarD2);
        }

        public int hashCode() {
            int iB = (((1 * 59) + b()) * 59) + c();
            String strA = a();
            int iHashCode = (iB * 59) + (strA == null ? 43 : strA.hashCode());
            h hVarD = d();
            return (iHashCode * 59) + (hVarD == null ? 43 : hVarD.hashCode());
        }

        public String toString() {
            return "DevToolsWidgetOverlay.WidgetDisplay(text=" + a() + ", x=" + b() + ", y=" + c() + ", type=" + String.valueOf(d()) + ")";
        }
    }

    @Inject
    public e(rs.plugins.cpkg.a aVar) {
        this.h = aVar;
    }

    @Override // rs.class_306
    public void a() {
        if (this.h.f()) {
            Widget widget = Widget.H[this.g];
            h hVar = h.j.get(Integer.valueOf(widget.aG));
            if (widget.aF > 0) {
                hVar = h.a;
            }
            if (hVar != null && this.h.j().contains(hVar)) {
                String str = this.g + (this.h.g() ? "[" + hVar.name() + "]" : "");
                if (this.h.h() && widget.ak != null) {
                    this.i.add(new a(str, this.e, this.f, hVar));
                }
                if (this.h.i() && widget.ak == null) {
                    this.i.add(new a(str, this.e, this.f, hVar));
                }
            }
        }
    }

    public Queue<a> k() {
        return this.i;
    }
}

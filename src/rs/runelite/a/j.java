package rs.runelite.a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/a/j.class */
public class j {
    private static final Logger b;
    static final /* synthetic */ boolean a;

    /* JADX INFO: loaded from: client-final.jar:rs/runelite/a/j$a.class */
    private static class a {
        final l<m> a;
        int b;
        int c;
        d d;
        static final /* synthetic */ boolean e;

        void a(d dVar) {
            int i = dVar.f;
            dVar.f += this.c;
            if (!((i <= 0) ^ (dVar.f <= 0))) {
                b(dVar);
            } else if (this.d == null) {
                this.d = dVar;
            }
        }

        void b(d dVar) {
            b bVar;
            b bVar2;
            if (this.d == null) {
                return;
            }
            if (this.d.c != null && dVar.c != null) {
                c(this.d);
                c(dVar);
                if (this.d.c == dVar.c) {
                    b bVar3 = this.d.c;
                    this.d.c = null;
                    dVar.c = null;
                    bVar3.a = null;
                    bVar3.b = null;
                    this.a.a().add(bVar3);
                } else {
                    if (dVar.d) {
                        bVar = this.d.c;
                        bVar2 = dVar.c;
                    } else {
                        bVar = dVar.c;
                        bVar2 = this.d.c;
                    }
                    j.b.trace("Joining {} onto {}", Integer.valueOf(System.identityHashCode(bVar2)), Integer.valueOf(System.identityHashCode(bVar)));
                    if (this.d.d == dVar.d) {
                        j.b.trace("reverse");
                        if (this.d.d) {
                            bVar.a();
                        } else {
                            bVar2.a();
                        }
                    }
                    j.b.trace("{} {}", Integer.valueOf(this.d.e), Integer.valueOf(dVar.e));
                    bVar2.a(bVar);
                    this.d.c = null;
                    dVar.c = null;
                    bVar.b.c = null;
                    bVar2.a.c = null;
                    bVar.b = bVar2.b;
                    bVar.a.c = bVar;
                    bVar.b.c = bVar;
                }
            } else if (this.d.c == null && dVar.c == null) {
                this.d.c = new b();
                this.d.c.b = this.d;
                this.d.d = false;
                dVar.c = this.d.c;
                this.d.c.a = dVar;
                dVar.d = true;
                c(this.d);
                c(dVar);
            } else if (this.d.c == null) {
                c(dVar);
                a(this.d, dVar);
                c(this.d);
            } else {
                c(this.d);
                a(dVar, this.d);
                c(dVar);
            }
            this.d = null;
        }

        private void a(d dVar, d dVar2) {
            dVar.c = dVar2.c;
            dVar.d = dVar2.d;
            dVar2.c = null;
            if (dVar.d) {
                if (!e && dVar.c.a != dVar2) {
                    throw new AssertionError();
                }
                dVar.c.a = dVar;
                return;
            }
            if (!e && dVar.c.b != dVar2) {
                throw new AssertionError();
            }
            dVar.c.b = dVar;
        }

        private void c(d dVar) {
            if (dVar.d) {
                dVar.c.a(this.b, dVar.e);
                if (!e && dVar.c.a != dVar) {
                    throw new AssertionError();
                }
                return;
            }
            dVar.c.b(this.b, dVar.e);
            if (!e && dVar.c.b != dVar) {
                throw new AssertionError();
            }
        }

        public a(l<m> lVar) {
            this.a = lVar;
        }

        static {
            e = !j.class.desiredAssertionStatus();
        }
    }

    /* JADX INFO: loaded from: client-final.jar:rs/runelite/a/j$b.class */
    private static class b extends m {
        d a;
        d b;
        static final /* synthetic */ boolean c;

        private b() {
        }

        @Override // rs.runelite.a.m
        public void a() {
            super.a();
            if (!c && this.b.d) {
                throw new AssertionError();
            }
            if (!c && !this.a.d) {
                throw new AssertionError();
            }
            d dVar = this.a;
            this.a = this.b;
            this.b = dVar;
            this.b.d = false;
            this.a.d = true;
        }

        static {
            c = !j.class.desiredAssertionStatus();
        }
    }

    /* JADX INFO: loaded from: client-final.jar:rs/runelite/a/j$c.class */
    public static class c {
        private final int a;
        private final int b;
        private final int c;
        private final int d;

        public c(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public int d() {
            return this.d;
        }

        public String toString() {
            return "RectangleUnion.Rectangle(x1=" + a() + ", y1=" + b() + ", x2=" + c() + ", y2=" + d() + ")";
        }
    }

    /* JADX INFO: loaded from: client-final.jar:rs/runelite/a/j$d.class */
    private static class d {
        d a;
        d b;
        b c;
        boolean d;
        int e;
        int f;
    }

    /* JADX INFO: loaded from: client-final.jar:rs/runelite/a/j$e.class */
    private static class e {
        d a;

        d a(int i) {
            d dVar = this.a;
            if (dVar == null || dVar.e > i) {
                return null;
            }
            while (dVar.e != i) {
                d dVar2 = dVar.a;
                if (dVar2 == null || dVar2.e > i) {
                    return dVar;
                }
                dVar = dVar2;
            }
            return dVar;
        }

        d a(d dVar, int i) {
            d dVar2 = new d();
            dVar2.e = i;
            if (dVar != null) {
                if (dVar.a != null) {
                    dVar2.a = dVar.a;
                    dVar2.a.b = dVar2;
                }
                dVar2.f = dVar.f;
                dVar.a = dVar2;
                dVar2.b = dVar;
            } else {
                if (this.a != null) {
                    dVar2.a = this.a;
                    this.a.b = dVar2;
                }
                this.a = dVar2;
            }
            return dVar2;
        }

        boolean a() {
            d dVar = this.a;
            while (true) {
                d dVar2 = dVar;
                if (dVar2 == null) {
                    return true;
                }
                if (dVar2.f != 0 || dVar2.c != null) {
                    return false;
                }
                dVar = dVar2.a;
            }
        }
    }

    private j() {
    }

    @Nullable
    public static l<m> a(List<c> list) {
        c cVar;
        if (list.size() == 0) {
            return null;
        }
        boolean zIsTraceEnabled = b.isTraceEnabled();
        list.sort(Comparator.comparingInt((v0) -> {
            return v0.a();
        }));
        ArrayList arrayList = new ArrayList(list);
        arrayList.sort(Comparator.comparingInt((v0) -> {
            return v0.c();
        }));
        e eVar = new e();
        l<m> lVar = new l<>(new ArrayList());
        a aVar = new a(lVar);
        int i = 0;
        int i2 = 0;
        while (true) {
            c cVar2 = null;
            c cVar3 = null;
            if (i < list.size()) {
                cVar2 = list.get(i);
            }
            if (i2 < arrayList.size()) {
                cVar3 = (c) arrayList.get(i2);
            }
            if (cVar2 == null && cVar3 == null) {
                break;
            }
            boolean z = cVar2 == null || (cVar3 != null && cVar3.c < cVar2.a);
            if (z) {
                aVar.c = -1;
                aVar.b = cVar3.c;
                i2++;
                cVar = cVar3;
            } else {
                aVar.c = 1;
                aVar.b = cVar2.a;
                i++;
                cVar = cVar2;
            }
            if (zIsTraceEnabled) {
                b.trace("{}{}", z ? "-" : Marker.ANY_NON_NULL_MARKER, cVar);
            }
            int i3 = cVar.b;
            int i4 = cVar.d;
            d dVarA = eVar.a(i3);
            if (dVarA == null) {
                dVarA = eVar.a(null, i3);
            }
            if (dVarA.e != i3) {
                dVarA = eVar.a(dVarA, i3);
                dVarA.f = dVarA.b.f;
            }
            do {
                if (dVarA.a == null || dVarA.a.e > i4) {
                    eVar.a(dVarA, i4);
                }
                aVar.a(dVarA);
                dVarA = dVarA.a;
            } while (dVarA.e != i4);
            aVar.b(dVarA);
            if (zIsTraceEnabled) {
                d dVar = eVar.a;
                while (true) {
                    d dVar2 = dVar;
                    if (dVar2 == null) {
                        break;
                    }
                    String str = "";
                    if (dVar2.c != null) {
                        str = (dVar2.d ? ">" : "[") + System.identityHashCode(dVar2.c) + (dVar2.d ? "]" : "<");
                    }
                    b.trace("{} = {} {}", Integer.valueOf(dVar2.e), Integer.valueOf(dVar2.f), str);
                    dVar = dVar2.a;
                }
                b.trace("");
            }
        }
        if (a || eVar.a()) {
            return lVar;
        }
        throw new AssertionError();
    }

    static {
        a = !j.class.desiredAssertionStatus();
        b = LoggerFactory.getLogger((Class<?>) j.class);
    }
}

package rs;

import java.util.ArrayList;
import java.util.List;
import rs.gui.Launcher;
import rs.lpkg.e;

/* JADX INFO: loaded from: client-final.jar:rs/class_590.class */
public class class_590 {
    private static final class_42 a = new class_42(0, 0, 0);
    private final class_593 c;
    private final int[] b = Client.cy;
    private final List<class_591> d = new ArrayList(class_593.i());
    private final List<class_591> e = new ArrayList();

    public class_590(class_593 class_593Var) {
        this.c = class_593Var;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x02a8 A[PHI: r33
  0x02a8: PHI (r33v1 int) = (r33v0 int), (r33v4 int) binds: [B:70:0x028b, B:72:0x02a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02b3 A[LOOP:2: B:74:0x02ac->B:76:0x02b3, LOOP_END] */
    public void a() {
        int i;
        Client clientO = Launcher.n().o();
        this.e.clear();
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            class_591 class_591Var = this.d.get(i2);
            class_591Var.c();
            if (class_591Var.f()) {
                class_589.a(class_591Var);
                this.e.add(class_591Var);
            } else if (!e.a()) {
                int iK = class_591Var.k();
                int iL = class_591Var.l();
                int iM = class_591Var.m();
                int iMax = Math.max(Math.abs(iK - Client.eR.ac), Math.abs(iM - Client.eR.ad));
                boolean z = iMax >= 500;
                clientO.a(this.b, iK, iL, iM);
                float fJ = class_591Var.j();
                int iE = (int) (class_591Var.e() * 255.0f);
                int iJ = (int) (4.0f * class_591Var.j());
                if (!z) {
                    float f = Client.al >= 200 ? 40.0f : 200.0f;
                    if (iMax >= 300) {
                        f += 40.0f;
                    }
                    float f2 = ((float) (30.0d - ((double) (Client.al / f)))) / 10.0f;
                    if (iMax >= 200) {
                        f2 = 0.0f;
                    }
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    }
                    iJ = clientO.cR <= 200 ? (int) (iJ + f2) : (clientO.cR <= 150 || clientO.cR > 245) ? (int) (iJ + (f2 / 2.0f)) : (int) (((double) iJ) + (((double) f2) * 0.75d));
                } else if (iMax >= 1000) {
                    iJ = (int) (((double) iJ) * 0.9d);
                }
                int i3 = 256 - iE;
                int i4 = ((class_591Var.i() >> 16) & 255) * iE;
                int i5 = ((class_591Var.i() >> 8) & 255) * iE;
                int i6 = (class_591Var.i() & 255) * iE;
                int i7 = this.b[1] - iJ;
                if (i7 < 0) {
                    i7 = 0;
                }
                int i8 = this.b[1] + iJ;
                if (i8 >= class_210.i) {
                    i8 = class_210.i - 1;
                }
                for (int i9 = i7; i9 <= i8; i9++) {
                    int i10 = i9 - this.b[1];
                    int iSqrt = (int) Math.sqrt((iJ * iJ) - (i10 * i10));
                    int i11 = this.b[0] - iSqrt;
                    if (i11 < 0) {
                        i11 = 0;
                    }
                    int i12 = this.b[0] + iSqrt;
                    if (i12 >= class_210.h) {
                        i12 = class_210.h - 1;
                    }
                    int i13 = i11 + (i9 * class_210.h);
                    if (class_332.k != null && i13 < class_332.k.length && i13 + 1 < class_332.k.length && i13 + (i12 - i11) + 2 < clientO.gZ.c.length && class_332.k != null) {
                        if (class_332.k[i13] < (this.b[2] - fJ) - 15.0f) {
                            i13++;
                            if (class_332.k[i13] >= this.b[2] + fJ + 15.0f) {
                                for (i = i11; i <= i12; i++) {
                                    int i14 = (((i4 + (((clientO.gZ.c[i13] >> 16) & 255) * i3)) >> 8) << 16) + (((i5 + (((clientO.gZ.c[i13] >> 8) & 255) * i3)) >> 8) << 8) + ((i6 + ((clientO.gZ.c[i13] & 255) * i3)) >> 8);
                                    int i15 = i13;
                                    i13++;
                                    class_210.a(clientO.gZ.c, i15, i14, i14, 255);
                                }
                            }
                        } else {
                            while (i <= i12) {
                                int i16 = (((i4 + (((clientO.gZ.c[i13] >> 16) & 255) * i3)) >> 8) << 16) + (((i5 + (((clientO.gZ.c[i13] >> 8) & 255) * i3)) >> 8) << 8) + ((i6 + ((clientO.gZ.c[i13] & 255) * i3)) >> 8);
                                int i17 = i13;
                                i13++;
                                class_210.a(clientO.gZ.c, i17, i16, i16, 255);
                            }
                        }
                    }
                }
            }
        }
        for (int i18 = 0; i18 < this.e.size(); i18++) {
            this.d.remove(this.e.get(i18));
        }
    }

    public List<class_591> b() {
        return this.d;
    }
}

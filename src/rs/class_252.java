package rs;

import com.sun.jna.platform.win32.aU;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: client-final.jar:rs/class_252.class */
public class class_252 {
    private static final int b = 460;
    private static final int c = 30;
    private static final long d = 650;
    private static final double e = 1.05d;
    private static final double f = 1.25d;
    private long g;
    private Client h;
    public class_333[] a = new class_333[23];
    private List<class_251> i = new ArrayList();
    private List<class_251> j = new ArrayList();

    public class_252(Client client) {
        this.h = client;
        for (int i = 0; i < this.a.length; i++) {
            this.a[i] = new class_333(class_333.a(class_333.b("skills/" + i), 13, 13));
        }
    }

    public void a(int i, int i2) {
        if (i2 < 0) {
            return;
        }
        boolean z = false;
        for (int i3 : new int[]{0, 1, 2, 4, 6}) {
            if (i == i3) {
                z = true;
            }
        }
        if (i2 == 0) {
            return;
        }
        class_251 class_251Var = new class_251(i2, i);
        class_251Var.b = b;
        class_251Var.c = 0;
        if ((z || i == 3) && System.currentTimeMillis() - this.g <= d && !this.i.isEmpty()) {
            class_251 class_251Var2 = this.i.get(this.i.size() - 1);
            class_251Var2.d += i2;
            if (!class_251Var2.a.contains(Integer.valueOf(i))) {
                class_251Var2.a.add(Integer.valueOf(i));
            }
            this.g = System.currentTimeMillis();
            return;
        }
        this.g = System.currentTimeMillis();
        if (b()) {
            this.i.add(class_251Var);
        } else {
            this.j.add(class_251Var);
        }
    }

    public void a() {
        int i;
        ArrayList arrayList = new ArrayList();
        if (b() && !this.j.isEmpty()) {
            class_251 class_251Var = this.j.get(0);
            this.i.add(class_251Var);
            this.j.remove(class_251Var);
            this.g = System.currentTimeMillis();
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            class_251 class_251Var2 = this.i.get(i2);
            if (!class_194.a()) {
                if (class_251Var2.f) {
                    class_251Var2.e = (int) (((double) class_251Var2.e) + 15.75d);
                    if (class_251Var2.e >= 255) {
                        class_251Var2.e = 255;
                        class_251Var2.f = false;
                    }
                } else {
                    class_251Var2.e = (int) (255.0d - (((double) class_251Var2.c) * 1.05d));
                }
                if (class_251Var2.e < 0) {
                    class_251Var2.e = 0;
                }
                class_251Var2.c = (int) (((double) class_251Var2.c) + 1.25d);
            }
            int i3 = class_251Var2.d;
            String str = "+" + i3;
            if (i3 >= 10000) {
                str = "+" + Client.g(i3);
            }
            Client client = this.h;
            if (Client.ag()) {
                Client client2 = this.h;
                i = Client.ai - aU.ie;
            } else {
                i = 4;
            }
            int i4 = i;
            Client client3 = this.h;
            int i5 = Client.ag() ? 0 : 4;
            int i6 = 0;
            if (str.length() >= 6) {
                i4 -= 5;
                i6 = 0 - 3;
            }
            if (str.length() == 5) {
                i4 -= 3;
                i6--;
            }
            if (this.h.v.g()) {
                for (int i7 = 0; i7 < class_251Var2.a.size(); i7++) {
                    this.a[class_251Var2.a.get(i7).intValue()].g((((i4 + class_251Var2.b) - (i7 * 15)) - ((int) (((double) str.length()) * 0.75d))) + 9 + i6, i5 + class_251Var2.c + 3, class_251Var2.e);
                }
            }
            int i8 = 35 + i4;
            int i9 = 15 + i5;
            if (this.h.v.g()) {
                Client client4 = this.h;
                Client.gl.d(str, class_251Var2.b + i8, class_251Var2.c + i9, class_492.c, 100, class_251Var2.e);
            }
            if (255.0d - (((double) class_251Var2.c) * 1.05d) <= -10.0d) {
                arrayList.add(class_251Var2);
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.i.remove(arrayList.get(i10));
        }
    }

    private boolean b() {
        for (int i = 0; i < this.i.size(); i++) {
            if (this.i.get(i).c <= 40) {
                return false;
            }
        }
        return true;
    }
}

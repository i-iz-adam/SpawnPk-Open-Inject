package rs;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.HashMap;
import java.util.Map;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_188.class */
@Singleton
public class class_188 {
    private static final String a = "Choose Sub-Option";
    private static final Map<Integer, class_167> b = new HashMap();
    private static final Map<Integer, class_184> c = new HashMap();
    private final Client d;
    private class_184 e;

    @Inject
    public class_188(Client client) {
        this.d = client;
    }

    public void a(int i) {
        if (b.get(Integer.valueOf(i)) != null) {
            b.get(Integer.valueOf(i)).invoke();
        }
        b.clear();
    }

    public class_184 a(String str, int i) {
        class_184 class_184Var = new class_184(str, i);
        if (this.d.fx[i] != null) {
            this.d.fx[i] = this.d.fx[i] + " <img=46>";
        }
        c.put(Integer.valueOf(i), class_184Var);
        return class_184Var;
    }

    public class_184 b(int i) {
        return a(a, i);
    }

    public void a() {
        this.e = null;
        c.clear();
        b.clear();
    }

    public boolean b() {
        return this.e != null;
    }

    public void c(int i) {
        if (this.e == null || !this.e.a()) {
            if (c.get(Integer.valueOf(i)) != null) {
                this.e = c.get(Integer.valueOf(i));
            } else {
                this.e = null;
            }
        }
    }

    public static void a(int i, int i2) {
        Client clientO = Launcher.n().o();
        String str = clientO.fx[i];
        int i3 = clientO.eJ[i];
        int i4 = clientO.eF[i];
        int i5 = clientO.eG[i];
        int i6 = clientO.eH[i];
        int i7 = clientO.localPlayer[i];
        class_167 class_167VarRemove = b.remove(Integer.valueOf(i));
        String str2 = clientO.fx[i2];
        int i8 = clientO.eJ[i2];
        int i9 = clientO.eF[i2];
        int i10 = clientO.eG[i2];
        int i11 = clientO.eH[i2];
        int i12 = clientO.localPlayer[i2];
        class_167 class_167VarRemove2 = b.remove(Integer.valueOf(i2));
        clientO.fx[i] = str2;
        clientO.eJ[i] = i8;
        clientO.eF[i] = i9;
        clientO.eG[i] = i10;
        clientO.eH[i] = i11;
        clientO.localPlayer[i] = i12;
        b.put(Integer.valueOf(i), class_167VarRemove2);
        clientO.fx[i2] = str;
        clientO.eJ[i2] = i3;
        clientO.eF[i2] = i4;
        clientO.eG[i2] = i5;
        clientO.eH[i2] = i6;
        clientO.localPlayer[i2] = i7;
        b.put(Integer.valueOf(i2), class_167VarRemove);
    }

    public int a(String str, class_167 class_167Var) {
        return a(this.d.eV, str, class_167Var);
    }

    public int b(String str, class_167 class_167Var) {
        return a(this.d.eV - 1, str, class_167Var);
    }

    public int c(String str, class_167 class_167Var) {
        return a(1, str, class_167Var);
    }

    private int a(int i, String str, class_167 class_167Var) {
        if (i < 0) {
            i = 0;
        }
        if (i > this.d.eV - 1) {
            i = this.d.eV - 1;
        }
        if (this.d.eV > i) {
            for (int i2 = this.d.eV; i2 >= i; i2--) {
                this.d.fx[i2 + 1] = this.d.fx[i2];
                this.d.localPlayer[i2 + 1] = this.d.localPlayer[i2];
                this.d.eJ[i2 + 1] = this.d.eJ[i2];
                this.d.eF[i2 + 1] = this.d.eF[i2];
                this.d.eG[i2 + 1] = this.d.eG[i2];
                this.d.eH[i2 + 1] = this.d.eH[i2];
                if (b.get(Integer.valueOf(i2)) != null) {
                    b.put(Integer.valueOf(i2 + 1), b.remove(Integer.valueOf(i2)));
                    this.d.eJ[i2 + 1] = i2 + 1;
                }
                if (c.get(Integer.valueOf(i2)) != null) {
                    c.put(Integer.valueOf(i2 + 1), c.remove(Integer.valueOf(i2)));
                    c.get(Integer.valueOf(i2 + 1)).a(i2 + 1);
                    this.d.eJ[i2 + 1] = i2 + 1;
                }
            }
        }
        this.d.fx[i] = str;
        this.d.localPlayer[i] = 1924;
        this.d.eJ[i] = i;
        b.put(Integer.valueOf(i), class_167Var);
        this.d.eV++;
        this.d.dJ += 15;
        if (this.d.dI < this.d.gm.a(str, false) + 8) {
            this.d.dI = this.d.gm.a(str, false) + 8;
        }
        return i;
    }

    public class_184 c() {
        return this.e;
    }
}

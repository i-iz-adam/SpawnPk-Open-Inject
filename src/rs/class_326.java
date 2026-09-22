package rs;

import com.sun.jna.platform.win32.COM.tlb.a.e;
import com.sun.jna.platform.win32.aU;
import com.sun.jna.platform.win32.bk;
import gnu.trove.f.b.cc;
import gnu.trove.i.a.i;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.lwjgl.system.windows.User32;

/* JADX INFO: loaded from: client-final.jar:rs/class_326.class */
public class class_326 {
    public static final int a = 385;
    public static final cc<class_191> b = new cc<>();
    public static int[] c;
    public static final i d;
    public static final int[] e;
    public static final Map<String, Integer> f;
    private static final String[] g;

    public static boolean a(int i) {
        if (b(i)) {
            return true;
        }
        for (int i2 = 0; i2 < e.length; i2++) {
            if (e[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(int i) {
        return i == 2 || i == 204 || i == 26 || i == 205;
    }

    public static boolean c(int i) {
        return i == 205 || i == 333 || i == 344 || i == 340 || i == 348;
    }

    public static int a(String str, int i) {
        if (b(i) || i == 38 || i == 94) {
            return class_492.e;
        }
        if (!a(i)) {
            return 65535;
        }
        if (str.equals("Kellatha")) {
            return 16712447;
        }
        if (str.equals("Scooby Doo")) {
            return 16719135;
        }
        if (str.equals("Goobymunch") || str.equals("Raiden")) {
            return 16715792;
        }
        if (str.equals("Ascend")) {
            return 11862016;
        }
        return str.equals("Bsouth") ? bk.ao : class_492.e;
    }

    public static void a() {
        Client.fE = new class_333[a];
        for (int i = 0; i < Client.fE.length; i++) {
            if (i >= 10 && i <= 17) {
                Client.fE[i] = new class_333("clan/icons/" + (i - 10), true);
            } else if (i < 74 || i > 77) {
                Client.fE[i] = new class_333("icons/" + i, true);
            } else {
                Client.fE[i] = new class_333("popups/bh skull" + (i - 70), true);
            }
        }
    }

    public static int a(char c2, char c3, char c4) {
        for (int i = 0; i < g.length; i++) {
            String str = g[i];
            if (c2 == str.charAt(0) && c3 == str.charAt(1) && c4 == str.charAt(2)) {
                return f.get(str).intValue();
            }
        }
        return -1;
    }

    public static int a(String str) {
        return str.length() < 6 ? Color.decode(str).getRGB() : Integer.parseInt(str, 16);
    }

    public static void b() {
        a();
    }

    public static String b(String str) {
        return Pattern.compile("<[^>]*>|@[^@]*@").matcher(str).replaceAll("").trim();
    }

    static {
        c = new int[0];
        b.a(21, new class_191(27, 30).a(-3).c(1));
        b.a(32, new class_191(33, 36).a(-3).c(1));
        b.a(45, new class_191(41, 44).a(-3).c(1));
        b.a(User32.WM_MENUDRAG, new class_191(User32.WM_MENUGETOBJECT, User32.WM_QUERYUISTATE).a(-1).c(3));
        b.a(333, new class_191(333, 336).a(-1).c(2).d(-1).f(2));
        b.a(class_332.l, new class_191(class_332.l, 343).a(-1).c(2).b(1).d(-1));
        b.a(348, new class_191(348, aU.ij_).a(-1).c(2).b(1).d(-1));
        b.a(344, new class_191(344, 347).a(-1).c(2).b(1).d(-1));
        b.a(aU.ik_, new class_191(aU.ik_, 355).a(-1).c(2).b(1).d(-1));
        b.a(356, new class_191(356, 359).a(-1).c(2).b(1).d(-1));
        c = b.b();
        d = new i();
        d.b(333);
        d.b(class_332.l);
        d.b(348);
        d.b(344);
        d.b(aU.ik_);
        e = new int[]{1, 18, 26, 6, 38, 333, class_332.l, 348, 344, aU.ik_, 356, 2, 204, 26, aU.ho_};
        f = new HashMap();
        f.put("red", Integer.valueOf(a("ff0000")));
        f.put("gre", Integer.valueOf(a("65280")));
        f.put("blu", Integer.valueOf(a("255")));
        f.put("yel", Integer.valueOf(a("ffff00")));
        f.put("dgr", Integer.valueOf(a("115b0d")));
        f.put("cya", Integer.valueOf(a("65535")));
        f.put("mag", Integer.valueOf(a("ff00ff")));
        f.put("lpu", Integer.valueOf(a("8842ad")));
        f.put("dpu", Integer.valueOf(a("83008F")));
        f.put("whi", Integer.valueOf(a("ffffff")));
        f.put("lre", Integer.valueOf(a("ff9040")));
        f.put("dre", Integer.valueOf(a("800000")));
        f.put("bla", Integer.valueOf(a(e.e)));
        f.put("or0", Integer.valueOf(a("FF981F")));
        f.put("or1", Integer.valueOf(a("ffb000")));
        f.put("or2", Integer.valueOf(a("ff7000")));
        f.put("or3", Integer.valueOf(a("ff3000")));
        f.put("gr1", Integer.valueOf(a("c0ff00")));
        f.put("gr2", Integer.valueOf(a("80ff00")));
        f.put("gr3", Integer.valueOf(a("40ff00")));
        f.put("gra", Integer.valueOf(a("B9B855")));
        g = (String[]) f.keySet().toArray(new String[f.keySet().size()]);
    }
}

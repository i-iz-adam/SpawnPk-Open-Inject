package rs;

import com.sun.jna.platform.win32.aU;
import com.sun.jna.platform.win32.bk;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: client-final.jar:rs/class_233.class */
public class class_233 extends class_253 {
    public static final int p = 2;
    private static class_333 E;
    private static class_333 F;
    public static boolean q;
    public static int r;
    public static int s;
    public static int w;
    private static final String H = "@yel@?";
    private static final String I = "None";
    public static int t = 0;
    public static int u = 1;
    public static int v = 2;
    public static int x = 285;
    public static int y = 0;
    public static int z = 13;
    public static String A = "";
    public static String B = "";
    private static int G = 0;
    public static final Map<Integer, Boolean> C = new HashMap();
    public static final class_553 D = new class_234();

    @Override // rs.class_253
    public void b() {
        E = new class_333("fountain/event 3");
        F = new class_333("fountain/event 4");
        a(60612, new class_235(this));
    }

    @Override // rs.class_253
    public boolean a(Client client) {
        return Client.cH == 60600;
    }

    @Override // rs.class_253
    public void b(Client client, class_254 class_254Var) {
        if (class_254Var == class_254.b) {
            if (G == 0) {
                G = Widget.H[60600].al[5];
            } else {
                Widget.H[60600].al[5] = G;
            }
            int i = Configuration.ai == class_151.a ? 0 : (Client.ai / 2) - 356;
            int i2 = Configuration.ai == class_151.a ? 0 : (Client.ah / 2) - 230;
            if (!Client.ag()) {
                i += 4;
                i2 += 4;
            }
            int i3 = 0;
            if (!Client.ag() && client.v.h() && !client.f()) {
                i2 += 50;
                i3 = 50;
            }
            if (Widget.H[60612].ax[0] <= 0) {
                client.gn.c(H, 408, aU.hS_ + i3, class_492.e, 1);
                client.gm.c("None", 458, aU.hS_ + i3, class_492.e, 1);
            } else if (Widget.H[60612].ax[1] <= 0) {
                client.gn.c(H, 458 + (Configuration.ai == class_151.a ? 0 : (Client.ai / 2) - 356), aU.hS_ + (Configuration.ai == class_151.a ? 0 : (Client.ah / 2) - 230) + i3, class_492.e, 1);
            }
            if (r == t) {
                int i4 = i + 20;
                int i5 = i2 + 48;
                class_210.a(i4, i5, class_442.h, 185, bk.aS, 50);
                Client.gl.c("<img=81> You must roll all the items from the previous tier! <img=81>", i4 + (class_442.h / 2), i5 + (185 / 2) + 85, class_492.e, 1);
                int i6 = i + Widget.H[60600].al[2];
                int i7 = i2 + Widget.H[60600].ba[2];
                class_210.a(i6, i7, 70, 41, bk.aS, 50);
                if (Client.hP >= i6 && Client.hP <= i6 + 70 && Client.hQ >= i7 && Client.hQ <= i7 + 41) {
                    client.b(Client.hP - 10, Client.hQ - 10, " <img=81> Locked!");
                }
            } else if (r == v) {
                int i8 = i + 20;
                int i9 = i2 + 48;
                class_210.a(i8, i9, class_442.h, 185, bk.ao, 20);
                if (s == 2) {
                    Widget.H[60600].al[5] = G + 4;
                    Client.gl.c("@gre@Congratulations! You've completed the entire event!", i8 + (class_442.h / 2), i9 + (185 / 2) + 85, class_492.e, 1);
                } else {
                    Client.gl.c("<img=46> @gre@You've completed this tier of the event! <img=46>", i8 + (class_442.h / 2), i9 + (185 / 2) + 85, class_492.e, 1);
                }
            } else {
                int i10 = i + Widget.H[60600].al[2];
                int i11 = i2 + Widget.H[60600].ba[2];
                if (Client.hP >= i10 && Client.hP <= i10 + 70 && Client.hQ >= i11 && Client.hQ <= i11 + 41) {
                    client.b(Client.hP - 10, Client.hQ - 10, B);
                }
            }
            if (w > y) {
                y += 5;
            }
            if (w < y) {
                y = w;
            }
            class_210.a(i + 192, i2 + 288, y, z, y == x ? bk.ao : 16760832, y == x ? 150 : 200);
            Client.gl.c(A, i + 335, i2 + aU.ib_, 0, -1);
            int i12 = i + Widget.H[60600].al[17];
            int i13 = i2 + Widget.H[60600].ba[17];
            if (r == v) {
                class_210.a(i12, i13, 34, 32, bk.ao, 25);
                return;
            }
            class_192.a.a(i12 - 5, i13, 125);
            class_192.a.a(i12 - 5, i13 + 2 + 15, 125);
            class_192.a.a(i12 + 25, i13, 125);
            class_192.a.a(i12 + 25, i13 + 2 + 15, 125);
        }
    }

    @Override // rs.class_253
    public void c() {
        C.clear();
        q = false;
    }
}

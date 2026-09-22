package rs;

import com.sun.jna.platform.win32.COM.tlb.a.e;
import com.sun.jna.platform.win32.aU;
import com.sun.jna.platform.win32.bk;
import org.lwjgl.system.windows.User32;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_207.class */
public class class_207 {
    public static class_333 a;
    public static class_333 b;

    public static void a(Client client) {
        String str;
        int i;
        int i2;
        client.B();
        if (client.dv == 1) {
            client.fa[client.du / 100].f((client.ds - 8) - 0, (client.dt - 8) - 0);
            Client.eX++;
            if (Client.eX > 67) {
                Client.eX = 0;
            }
        }
        if (client.dv == 2) {
            client.fa[4 + (client.du / 100)].f((client.ds - 8) - 0, (client.dt - 8) - 0);
        }
        if (Client.ed != -1) {
            client.j(client.dE, Client.ed);
            if (Client.ed == 197 && Configuration.ai != class_151.a) {
                String strReplace = Widget.H[199].as.replace(class_220.g, "");
                client.gi.a(strReplace);
                client.eK[0].f((Client.ai - 200) + 40 + 15, 168 + 7 + 10);
                client.gm.c(strReplace, (Client.ai - 174) + (strReplace.length() == 8 ? 2 : 0) + 40, aU.hq_ + 7 + 10, class_492.g, 0);
            } else if (Client.ed != 201 || Configuration.ai == class_151.a) {
                int i3 = 4;
                if (!Client.ag() && Configuration.aD) {
                    i3 = 4 - 25;
                }
                if (client.v.h() && !client.f()) {
                    i3 += 125;
                }
                client.a(0, Configuration.ai == class_151.a ? 4 : (Client.ai / 2) - 356, Widget.H[Client.ed], Configuration.ai == class_151.a ? i3 : (Client.ah / 2) - 230);
            } else {
                client.a(0, Client.ai - 560, Widget.H[Client.ed], -109);
            }
        }
        if (client.es >= 1 && client.es <= 3) {
            if (Client.ag()) {
                i = -65;
                i2 = 30;
            } else {
                i = 4;
                i2 = 4;
                if (client.v.h() && !client.f()) {
                    i2 = 4 + 131;
                }
            }
            if (!Client.ag() && Configuration.aD) {
                i2 -= 25;
            }
            class_333 class_333Var = client.es == 1 ? client.bs : class_337.a;
            if (client.es == 3) {
                class_333Var = class_337.b;
            }
            class_333Var.f(Configuration.ai == class_151.a ? 472 + i : (Client.ai - 80) + i, Configuration.ai == class_151.a ? User32.WM_UPDATEUISTATE + i2 : 200 + i2);
        }
        if (Client.cH != -1) {
            class_265.a(client.u);
        }
        class_253.o = 0;
        for (int i4 = 0; i4 < class_253.k.size(); i4++) {
            class_253.k.get(i4).a(client, class_254.a);
        }
        class_313.d().a(class_268.p);
        class_313.d().a(class_268.q);
        if (Client.cH != -1) {
            Widget widget = Widget.H[Client.cH];
            client.j(client.dE, Client.cH);
            if (Client.cH == 15944 && Configuration.ai == class_151.b) {
                class_210.b(Client.ah, 0, 0, 110, Client.ai, 130);
                class_210.d(0, Client.ai, Client.ah, 0, 0);
            }
            int i5 = 4;
            int i6 = 4;
            if (Client.ag()) {
                i5 = (Client.ai / 2) - 356;
                i6 = (Client.ah / 2) - 230;
            } else if (client.v.h() && !client.f()) {
                i6 = 4 + 50;
            }
            if (widget.C != Integer.MAX_VALUE) {
                i5 = Widget.H[Client.cH].C;
            }
            if (widget.D != Integer.MAX_VALUE) {
                i6 = Widget.H[Client.cH].D;
            }
            Client.cq = i5;
            Client.npcs = i6;
            if (Client.ah()) {
                Client.cq -= 4;
                Client.npcs -= 4;
            }
            client.a(0, i5, Widget.H[Client.cH], i6);
        }
        if (client.ae && (Client.cH == -1 || Client.cH == 18551)) {
            int i7 = 15;
            if (Client.ah() && client.v.h() && !client.f()) {
                i7 = 15 + 138;
            }
            int i8 = Client.ah() ? User32.WM_CHANGEUISTATE + i7 : (Client.ah - aU.ho_) + i7;
            client.a(0, 14, Widget.H[55008], i8);
            String str2 = "Tracking: @yel@" + client.af;
            if (Widget.H[55011].as.contains("100%")) {
                str2 = str2 + " @gre@(COMPLETE)";
            }
            Client.gl.c(str2, 14 + 246, i8 + 3, class_492.c, 0);
            if (Client.hP < 14 + 96 || Client.hP > 14 + 386 || Client.hQ < i8 || Client.hQ <= i8 + 20) {
            }
        }
        client.w();
        class_253.o = 0;
        for (int i9 = 0; i9 < class_253.k.size(); i9++) {
            class_253.k.get(i9).a(client, class_254.b);
        }
        class_313.d().a(class_268.v);
        class_313.d().a(class_268.y);
        if (!Client.dj) {
            client.F();
            client.V();
        } else if (client.dH == 0) {
        }
        class_253.o = 0;
        for (int i10 = 0; i10 < class_253.l.size(); i10++) {
            class_253.l.get(i10).a(client, class_254.b);
        }
        class_313.d().a(class_268.w);
        if (Client.ba) {
            client.gi.b(class_492.g, "Debug Item: " + Client.bb, 201, 5);
            client.gi.b(class_492.g, "Debug RotX: " + Client.bc, 215, 5);
            client.gi.b(class_492.g, "Debug RotY: " + Client.bd, 229, 5);
            client.gi.b(class_492.g, "Debug Zoom: " + Client.be, User32.VK_OEM_AUTO, 5);
            client.gi.b(class_492.g, "Debug Offset1: " + Client.bf, 257, 5);
            client.gi.b(class_492.g, "Debug Offset2: " + Client.bg, 271, 5);
        } else if (Client.aW != -1) {
            client.gi.b(class_492.g, "Debug Interface: " + Client.aW, 201, 5);
            client.gi.b(class_492.g, "Debug Interface Position X: " + Client.aX, 215, 5);
            client.gi.b(class_492.g, "Debug Interface Position tY: " + Client.aY, 229, 5);
        }
        if (Configuration.am) {
            int i11 = Client.eh + ((Client.eR.ac - 6) >> 7);
            int i12 = Client.ei + ((Client.eR.ad - 6) >> 7);
            client.gi.a("RUNTIME INFORMATION", 507, 16729156, 20);
            int i13 = 20 + 15;
            client.gi.a("Fps: " + Client.gR, 507, class_492.g, i13);
            int i14 = i13 + 15;
            Runtime runtime = Runtime.getRuntime();
            client.gi.a("Mem: " + ((int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024)) + "k", 507, class_492.g, i14);
            int i15 = i14 + 30;
            client.gi.a("COORDINATE INFORMATION", 507, 16729156, i15);
            int i16 = i15 + 15;
            client.gi.a("Mouse X: " + Client.hP + " , Mouse Y: " + Client.hQ, 507, class_492.g, i16);
            int i17 = i16 + 15;
            client.gi.a("FW: " + Client.ai + " , FH: " + Client.ah, 507, class_492.g, i17);
            int i18 = i17 + 15;
            client.gi.a("Coords: " + i11 + ", " + i12, 507, class_492.g, i18);
            client.gi.a("Region ID: " + (((i11 >> 6) * 256) + (i12 >> 6)), 507, class_492.g, i18 + 15);
        } else if (Configuration.bl) {
            int i19 = Configuration.ai == class_151.b ? Client.ai - 700 : 0;
            client.gm.b("FPS: " + Client.gR, 460 + i19, 20, class_492.g, 0);
            if (Configuration.bm) {
                String str3 = "Ping: " + Client.bh + "ms";
                client.gm.b(str3, ((460 + i19) + 41) - client.gm.c(str3), 38, class_492.g, 0);
            }
        } else if (Configuration.bm) {
            int i20 = Configuration.ai == class_151.b ? Client.ai - 700 : 0;
            String str4 = "Ping: " + Client.bh + "ms";
            client.gm.b(str4, ((460 + i20) + 41) - client.gm.c(str4), 20, class_492.g, 0);
        }
        if (client.eN != 0) {
            long jC = client.c() / 1000;
            long j = jC / 60;
            int i21 = Client.ah() ? 4 : 0;
            int i22 = Configuration.ai == class_151.a ? 4 : Client.ah - 499;
            if (client.v.h() && !client.f()) {
                i22 += 136;
            }
            String str5 = jC % 60 < 10 ? j + ":0" + j : j + ":" + j;
            if (str5.equalsIgnoreCase("0:00")) {
                String str6 = "Soon";
                if (Client.ff % 200 < 50) {
                    str6 = str6 + ".";
                } else if (Client.ff % 200 >= 50 && Client.ff % 200 < 100) {
                    str6 = str6 + "..";
                } else if (Client.ff % 200 >= 100 && Client.ff % 200 < 150) {
                    str6 = str6 + "...";
                }
                str = ": @gre@" + str6;
                if (Client.eR != null && Client.eR.aZ != null && Client.eR.aZ.equalsIgnoreCase("Ryan") && client.eO == 2 && !client.eP) {
                    Launcher.n().a("SpawnPK", "System update warning timer is complete!", true);
                    client.eP = true;
                }
            } else {
                str = " in: @gre@" + str5;
            }
            if (client.eO == 1) {
                client.gm.b("@or2@[Warning] <img=37> @yel@System update" + str, 4 + i21, 329 + i22, 0, 0);
            } else {
                client.gm.b("@or2@[Warning] <img=37> @yel@System update @or1@(5 min timer)@yel@ starts" + str, 4 + i21, 329 + i22, 0, 0);
            }
            Client.cF++;
            if (Client.cF > 75) {
                Client.cF = 0;
                Client.fv.a(148);
            }
        }
        if (client.k != null) {
            class_210.b(26, 22, 144, 0, 200, 125);
            client.gm.c(client.k, 144 + 97, 22 + 17, class_492.c, 0);
        }
        if (client.aC) {
            int i23 = (!Configuration.aB || client.z.r == null || client.z.s <= 0 || System.currentTimeMillis() - client.z.w >= 20000) ? 23 : 60;
            class_210.b(35, i23, 4, 0, 140, 125);
            Client.gl.b("@or2@Your points: @whi@" + client.aM, 4 + 5, i23 + 14, class_492.g, 0);
            Client.gl.b("@or2@Total: @whi@" + client.aN, 4 + 5, i23 + 14 + 15, class_492.g, 0);
        }
        if (Client.cH == 6575 && client.cG > 0) {
            String str7 = "<img=40> @whi@WHIP + DDS ONLY <img=40>";
            int i24 = 195;
            if (client.cG == 2) {
                str7 = "<img=40> @whi@WHIP ONLY <img=40>";
                i24 = 195 + 19;
            }
            client.gn.a(str7, i24, 130);
            client.gn.a(str7, i24, 130 + 25);
            client.gn.a(str7, i24, 130 + 50);
            client.gn.a(str7, i24, 130 + 75);
        }
        if (client.aF && Widget.H[199].as.contains("LMS") && Client.ed == 197) {
            client.aA.c(0, 0);
            if (Client.aj > 800) {
                client.aA.c(User32.WM_DWMCOLORIZATIONCOLORCHANGED, 0);
            }
            if (Client.aj > 1600) {
                client.aA.c(1600, 0);
            }
        }
        if (Widget.H[199].as.contains("LMS") && Client.ed == 197 && Client.eR.ay == 6095 && Client.eR.aT != null) {
            client.fu = 3209;
        } else if (client.fu == 3209) {
            client.fu = -1;
            Client.fb = true;
            Client.menuIndex = true;
        }
        if (client.aE) {
            class_210.b(55, 12, 12, 12884294, 180, 50);
            class_210.b(49, 12 + 3, 12 + 3, 4863488, 174, 100);
            Client.gl.b(client.aG, 12 + 8, 12 + 18, class_492.c, 0);
            Client.gl.b(client.aH, 12 + 8, 12 + 18 + 14, class_492.c, 0);
            Client.gl.b(client.aI, 12 + 8, 12 + 18 + 14 + 14, class_492.c, 0);
        }
        if (Widget.H[199].as.contains("LMS") && Client.ed == 197) {
            class_210.b(56, 2, 397, 12884294, 113, 50);
            class_210.b(50, 2 + 3, 397 + 3, 4863488, 107, 100);
            Client.gl.b(client.aG, 397 + 8, 2 + 18, class_492.c, 0);
            Client.gl.b(client.aH, 397 + 8, 2 + 18 + 14, class_492.c, 0);
            Client.gl.b(client.aI, 397 + 8, 2 + 18 + 14 + 14, class_492.c, 0);
        }
        if (!client.aC || client.aL <= 0.0d) {
            client.aL = 0.0d;
        } else {
            int i25 = 4;
            int i26 = 3;
            if (Configuration.ai == class_151.b) {
                i25 = 150;
                i26 = 23;
            }
            int i27 = client.aK ? 4095 : 13960709;
            int i28 = client.aK ? 50431 : 30976;
            int iCeil = (int) Math.ceil(((double) 500) * (client.aL / 100.0d));
            class_210.b(18, i26, i25, 0, 500 + 4, 125);
            class_210.b(14, i26 + 2, i25 + 2, i27, 500, 255);
            class_210.b(14, i26 + 2, i25 + 2, i28, iCeil, 255);
            Client.gl.c(client.aL + "%", i25 + ((500 + 4) / 2), i26 + 14, class_492.c, 0);
        }
        if (Client.ed == 197 && Widget.H[199].as.contains("Tourney")) {
            if (client.R == -1) {
                String str8 = "Waiting for more players";
                if (Client.ff % 200 < 50) {
                    str8 = str8 + ".";
                } else if (Client.ff % 200 >= 50 && Client.ff % 200 < 100) {
                    str8 = str8 + "..";
                } else if (Client.ff % 200 >= 100 && Client.ff % 200 < 150) {
                    str8 = str8 + "...";
                }
                class_484.d.c(195, 5);
                Client.gl.c(str8, 268, 24, class_492.e, 1);
            } else {
                class_484.d.c(195, 5);
                long jCurrentTimeMillis = (client.R - System.currentTimeMillis()) / 1000;
                long j2 = jCurrentTimeMillis - ((jCurrentTimeMillis / 60) * 60);
                long j3 = jCurrentTimeMillis / 60;
                if (client.Q == 1) {
                    Client.gl.c("Round starts in:", User32.WM_IME_ENDCOMPOSITION, 18, class_492.e, 1);
                } else if (client.Q == 2) {
                    Client.gl.c("Round ends in:", User32.WM_IME_ENDCOMPOSITION, 18, class_492.e, 1);
                } else {
                    Client.gl.c("Tournament starts in:", User32.WM_IME_ENDCOMPOSITION, 18, class_492.e, 1);
                }
                class_324 class_324Var = client.gm;
                class_324Var.c("@yel@" + j3 + ":" + class_324Var + (j2 < 10 ? e.e : ""), User32.WM_IME_ENDCOMPOSITION, 31, class_492.e, 1);
            }
        }
        if (client.K) {
            if (client.O - System.currentTimeMillis() > 0) {
                class_484.c.c(230, 5);
                client.go.c("Begin in..", User32.WM_IME_ENDCOMPOSITION, 25, class_492.c, 1);
                long jCurrentTimeMillis2 = (client.O - System.currentTimeMillis()) / 1000;
                long j4 = jCurrentTimeMillis2 - ((jCurrentTimeMillis2 / 60) * 60);
                long j5 = jCurrentTimeMillis2 / 60;
                class_324 class_324Var2 = client.go;
                class_324Var2.c(j5 + ":" + class_324Var2 + (j4 < 10 ? e.e : ""), User32.WM_IME_ENDCOMPOSITION, 45, class_492.e, 1);
            }
            class_484.d.c(360, 5);
            Client.gl.c(client.L == 0 ? "Fighters:" : "Kills:", 386, 29, class_492.e, 1);
            Client.gl.c("Your clan", 417, 18, bk.aS, 1);
            Client.gl.c(client.M, 417, 29, bk.aS, 1);
            Client.gl.c("Opponents", 472, 18, 4550143, 1);
            Client.gl.c(client.N, 472, 29, 4550143, 1);
        }
        class_368.h();
        client.m.a();
        client.o.a();
        client.n.a();
        class_265.a(client.u);
        client.y.a();
        if (Client.w.b) {
            Client.w.b();
        }
        if (rs.lpkg.e.a()) {
            return;
        }
        class_208.b(client);
    }
}

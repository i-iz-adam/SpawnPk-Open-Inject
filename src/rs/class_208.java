package rs;

import java.awt.Graphics2D;
import rs.lpkg.cpkg.c;
import rs.lpkg.e;

/* JADX INFO: loaded from: client-final.jar:rs/class_208.class */
public class class_208 {
    public static void a(Client client) {
        Client.gf++;
        if (!class_194.a()) {
            Client.gg++;
        }
        client.e(true);
        client.d(true);
        client.e(false);
        client.d(false);
        client.r();
        client.P();
        if (!client.fe) {
            int i = client.fs;
            if (client.dQ / 256 > i) {
                i = client.dQ / 256;
            }
            if (client.dh[4] && client.fy[4] + 128 > i) {
                i = client.fy[4] + 128;
            }
            client.b(Client.al + (i * 3), i, client.eb, client.c(Client.dw, Client.eR.ad, Client.eR.ac) + (Client.al < 200 ? (-50) - ((200 - Client.al) / 5) : -50), (client.ft + client.dp) & Client.dn, client.ec);
        }
        int iS = !client.fe ? client.S() : client.T();
        int i2 = Client.cJ;
        int i3 = Client.cK;
        int i4 = Client.cL;
        int i5 = client.cR;
        int i6 = client.cS;
        for (int i7 = 0; i7 < 5; i7++) {
            if (client.dh[i7]) {
                int iRandom = (int) (((Math.random() * ((double) ((client.dg[i7] * 2) + 1))) - ((double) client.dg[i7])) + (Math.sin(((double) client.eg[i7]) * (((double) client.dy[i7]) / 100.0d)) * ((double) client.fy[i7])));
                if (i7 == 0) {
                    Client.cJ += iRandom;
                }
                if (i7 == 1) {
                    Client.cK += iRandom;
                }
                if (i7 == 2) {
                    Client.cL += iRandom;
                }
                if (i7 == 3) {
                    client.cS = (client.cS + iRandom) & Client.dn;
                }
                if (i7 == 4) {
                    client.cR += iRandom;
                    if (client.cR < 128) {
                        client.cR = 128;
                    }
                    if (client.cR > 383) {
                        client.cR = Client.gF;
                    }
                }
            }
        }
        int i8 = class_332.A;
        ColorUtility.bt = true;
        ColorUtility.bw = 0;
        ColorUtility.bu = Client.hP;
        ColorUtility.bv = Client.hQ;
        class_210.d();
        if (e.a()) {
            client.b.a();
        }
        boolean z = Configuration.H;
        if (Client.cH > 0 && Widget.l(Client.cH).bu) {
            z = false;
        }
        if (z) {
            class_332.x = client.bx;
            int i9 = Client.ah() ? 4 : 0;
            class_210.c(client.aq() + i9, i9, client.ar() + i9, i9);
            client.dF.a(Client.cJ, Client.cL, client.cS, Client.cK, iS, client.cR);
            client.gZ.a();
        }
        client.dF.d();
        if (Configuration.az && !Configuration.ah && !e.a()) {
            for (int i10 = 0; i10 < Client.by.length; i10++) {
                if (Client.by[i10].b().size() > 0) {
                    Client.by[i10].a();
                }
            }
        }
        if (e.a()) {
            c.b();
            b(client);
        }
        class_313.d().a(class_268.n);
        client.o();
        client.t();
        client.f(i8);
        class_313.d().a(class_268.o);
        class_207.a(client);
        client.W();
        client.g();
        client.O();
        Client.cJ = i2;
        Client.cK = i3;
        Client.cL = i4;
        client.cR = i5;
        client.cS = i6;
        if (Client.cM == -1 || !class_194.a()) {
            Client.cM = Client.cJ;
            Client.cN = Client.cK;
            Client.cO = Client.cL;
            Client.cP = client.cS;
            Client.cQ = client.cR;
        }
    }

    public static void b(Client client) {
        if (Client.cH != -1) {
            return;
        }
        try {
            boolean z = Client.ab.d.size() > 0 || Client.ab.c.size() > 0;
            if (Client.aa.c.size() > 0 || Client.aa.b.size() > 0) {
                z = true;
            }
            if (z) {
                Graphics2D graphics2DA = class_210.a(class_210.g, class_210.h, class_210.i);
                for (int i : Client.ab.c.b()) {
                    class_258 class_258VarB = Client.ab.c.b(i);
                    if (class_258VarB.a != null) {
                        class_27.a(graphics2DA, class_258VarB.a, class_258VarB.a(), class_258VarB.b());
                    }
                }
                for (class_262 class_262Var : Client.aa.c) {
                    if (class_262Var.a != null) {
                        class_27.a(graphics2DA, class_262Var.a, class_262Var.b(), class_262Var.c());
                    }
                }
                for (class_262 class_262Var2 : Client.aa.b.values()) {
                    if (class_262Var2.a != null) {
                        class_27.a(graphics2DA, class_262Var2.a, class_262Var2.b(), class_262Var2.c());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

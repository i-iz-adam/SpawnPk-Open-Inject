package rs;

import java.io.FileNotFoundException;
import rs.plugins.cpkg.c;

/* JADX INFO: loaded from: client-final.jar:rs/class_170.class */
public class class_170 {
    public static boolean a = false;
    public static boolean b = false;

    public static boolean a(Client client) {
        if (!a || !Configuration.d.booleanValue()) {
            return false;
        }
        a = false;
        try {
            class_112.a();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ItemComposition.b = new class_622();
        ItemComposition.b.d();
        ItemComposition.c.clear();
        Client.K();
        ItemComposition.k.a();
        ItemComposition.m.a();
        ItemComposition.l.a();
        client.b();
        if (Configuration.d.booleanValue() && c.b.f()) {
            c.b.a(Client.bb, true);
        }
        try {
            class_116.a();
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        }
        try {
            class_125.a();
            return true;
        } catch (FileNotFoundException e3) {
            e3.printStackTrace();
            return true;
        }
    }

    public static boolean b(Client client) {
        if (!b || !Configuration.d.booleanValue()) {
            return false;
        }
        b = false;
        class_102.M.a();
        class_102.N.a();
        class_102.c.d();
        class_102.M.a();
        class_102.N.a();
        class_102.z = new class_102[20];
        for (int i = 0; i < 20; i++) {
            class_102.z[i] = new class_102();
        }
        for (int i2 = 0; i2 < client.cB; i2++) {
            Npc npc = client.cA[client.cC[i2]];
            if (npc.aG != null) {
                npc.aG = class_102.c((int) npc.aG.x);
                npc.S = npc.aG.r;
                npc.o = npc.aG.y;
                npc.ag = npc.aG.q;
                npc.ah = npc.aG.l;
                npc.ai = npc.aG.B;
                npc.aj = npc.aG.j;
                npc.t = npc.aG.w;
            }
        }
        Widget.aM.a();
        class_313.d().j().a((Object) class_313.d().j().u(), true);
        if (!c.b.e()) {
            return true;
        }
        c.b.a(class_313.d().j().u(), true);
        return true;
    }
}

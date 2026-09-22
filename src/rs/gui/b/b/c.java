/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  rs.gui.b.b.e
 */
package rs.gui.b.b;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.nio.charset.StandardCharsets;
import rs.gui.b.Loadout;
import rs.gui.b.b.e;
import rs.gui.b.f;

public class c {
    public static void a(DataOutputStream dataOutputStream, Loadout a2) {
        dataOutputStream.writeInt(a2.f().getBytes().length);
        dataOutputStream.write(a2.f().getBytes(StandardCharsets.UTF_8));
        dataOutputStream.writeInt(a2.j().getRGB());
        if (a2.k() == null) {
            dataOutputStream.writeInt(0);
        } else {
            dataOutputStream.writeInt(a2.k().name().getBytes().length);
            dataOutputStream.write(a2.k().name().getBytes(StandardCharsets.UTF_8));
        }
        dataOutputStream.writeInt(a2.g().c());
        dataOutputStream.writeInt(a2.e());
        for (int i = 0; i < a2.c().length; ++i) {
            dataOutputStream.writeInt(a2.c()[i]);
        }
        for (rs.gui.b.c.c c2 : rs.gui.b.c.c.values()) {
            int n = a2.a().get((Object)c2) == null ? -1 : Integer.valueOf(a2.a().get((Object)c2).a());
            dataOutputStream.writeInt(n);
            if (n == -1) {
                dataOutputStream.writeInt(1);
                continue;
            }
            dataOutputStream.writeInt(a2.a().get((Object)c2).b());
        }
        for (int i = 0; i < a2.d().length; ++i) {
            int n = a2.d()[i] == null ? -1 : a2.d()[i].a();
            dataOutputStream.writeInt(n);
            if (n == -1) {
                dataOutputStream.writeInt(1);
                continue;
            }
            dataOutputStream.writeInt(a2.d()[i].b());
        }
        dataOutputStream.writeInt(a2.i());
        dataOutputStream.writeInt(a2.b());
        dataOutputStream.writeInt(a2.h());
    }

    public static void a(DataInputStream dataInputStream, rs.gui.b.LoadoutGroup c2) {
        e e2 = new e(c2.a());
        e2.a();
        String string = "Default";
        do {
            int n;
            int n2;
            int n3;
            int n4;
            int n5 = dataInputStream.readInt();
            byte[] byArray = new byte[n5];
            dataInputStream.read(byArray);
            string = new String(byArray);
            Loadout a2 = new Loadout(string);
            if (e2.a(3)) {
                n4 = dataInputStream.readInt();
                a2.a(new Color(n4));
                if (e2.a(4)) {
                    n5 = dataInputStream.readInt();
                    if (n5 > 0) {
                        byArray = new byte[n5];
                        dataInputStream.read(byArray);
                        String string2 = new String(byArray);
                        a2.a(rs.gui.b.e.valueOf(string2));
                    }
                } else {
                    dataInputStream.readInt();
                }
            }
            n4 = dataInputStream.readInt();
            a2.a(rs.gui.b.a$a.a(n4));
            int n6 = dataInputStream.readInt();
            a2.b(n6);
            for (n3 = 0; n3 < a2.c().length; ++n3) {
                a2.c()[n3] = n2 = dataInputStream.readInt();
            }
            rs.gui.b.c.c[] cArray = rs.gui.b.c.c.values();
            n2 = cArray.length;
            for (n = 0; n < n2; ++n) {
                rs.gui.b.c.c c3 = cArray[n];
                int n7 = dataInputStream.readInt();
                int n8 = dataInputStream.readInt();
                a2.a(c3, new f(n7, n8));
            }
            for (n3 = 0; n3 < a2.d().length; ++n3) {
                n2 = dataInputStream.readInt();
                n = dataInputStream.readInt();
                a2.a(n3, new f(n2, n));
            }
            if (e2.a(2)) {
                n3 = dataInputStream.readInt();
                a2.d(n3);
            }
            n3 = dataInputStream.readInt();
            a2.a(n3);
            if (e2.a(5)) {
                n2 = dataInputStream.readInt();
                a2.c(n2);
            }
            c2.add(a2);
        } while (string != null);
    }
}

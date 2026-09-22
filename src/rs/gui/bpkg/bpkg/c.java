package rs.gui.bpkg.bpkg;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import rs.gui.bpkg.f;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/b/c.class */
public class c {
    public static void a(DataOutputStream dataOutputStream, rs.gui.bpkg.a aVar) throws IOException {
        dataOutputStream.writeInt(aVar.f().getBytes().length);
        dataOutputStream.write(aVar.f().getBytes(StandardCharsets.UTF_8));
        dataOutputStream.writeInt(aVar.j().getRGB());
        if (aVar.k() == null) {
            dataOutputStream.writeInt(0);
        } else {
            dataOutputStream.writeInt(aVar.k().name().getBytes().length);
            dataOutputStream.write(aVar.k().name().getBytes(StandardCharsets.UTF_8));
        }
        dataOutputStream.writeInt(aVar.g().c());
        dataOutputStream.writeInt(aVar.e());
        for (int i = 0; i < aVar.c().length; i++) {
            dataOutputStream.writeInt(aVar.c()[i]);
        }
        for (rs.gui.bpkg.c.c cVar : rs.gui.bpkg.c.c.values()) {
            int iIntValue = aVar.a().get(cVar) == null ? -1 : Integer.valueOf(aVar.a().get(cVar).a()).intValue();
            dataOutputStream.writeInt(iIntValue);
            if (iIntValue == -1) {
                dataOutputStream.writeInt(1);
            } else {
                dataOutputStream.writeInt(aVar.a().get(cVar).b());
            }
        }
        for (int i2 = 0; i2 < aVar.d().length; i2++) {
            int iA = aVar.d()[i2] == null ? -1 : aVar.d()[i2].a();
            dataOutputStream.writeInt(iA);
            if (iA == -1) {
                dataOutputStream.writeInt(1);
            } else {
                dataOutputStream.writeInt(aVar.d()[i2].b());
            }
        }
        dataOutputStream.writeInt(aVar.i());
        dataOutputStream.writeInt(aVar.b());
        dataOutputStream.writeInt(aVar.h());
    }

    public static void a(DataInputStream dataInputStream, rs.gui.bpkg.c cVar) throws IOException {
        String str;
        e eVar = new e(cVar.a());
        eVar.a();
        do {
            byte[] bArr = new byte[dataInputStream.readInt()];
            dataInputStream.read(bArr);
            str = new String(bArr);
            rs.gui.bpkg.a aVar = new rs.gui.bpkg.a(str);
            if (eVar.a(3)) {
                aVar.a(new Color(dataInputStream.readInt()));
                if (eVar.a(4)) {
                    int i = dataInputStream.readInt();
                    if (i > 0) {
                        byte[] bArr2 = new byte[i];
                        dataInputStream.read(bArr2);
                        aVar.a(rs.gui.bpkg.e.valueOf(new String(bArr2)));
                    }
                } else {
                    dataInputStream.readInt();
                }
            }
            aVar.a(rs.gui.bpkg.a.Spellbook.a(dataInputStream.readInt()));
            aVar.b(dataInputStream.readInt());
            for (int i2 = 0; i2 < aVar.c().length; i2++) {
                aVar.c()[i2] = dataInputStream.readInt();
            }
            for (rs.gui.bpkg.c.c cVar2 : rs.gui.bpkg.c.c.values()) {
                aVar.a(cVar2, new f(dataInputStream.readInt(), dataInputStream.readInt()));
            }
            for (int i3 = 0; i3 < aVar.d().length; i3++) {
                aVar.a(i3, new f(dataInputStream.readInt(), dataInputStream.readInt()));
            }
            if (eVar.a(2)) {
                aVar.d(dataInputStream.readInt());
            }
            aVar.a(dataInputStream.readInt());
            if (eVar.a(5)) {
                aVar.c(dataInputStream.readInt());
            }
            cVar.add(aVar);
        } while (str != null);
    }
}

package rs;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.aT;
import com.sun.jna.platform.win32.aw;
import com.sun.jna.platform.win32.ba;
import java.awt.Component;
import java.awt.Frame;

/* JADX INFO: loaded from: client-final.jar:rs/class_25.class */
public class class_25 {
    public static void a(Frame frame) {
        frame.setState(0);
        aw awVar = aw.j;
        ba.k kVar = new ba.k();
        kVar.d = new aT.g(1L);
        kVar.l.b.l = new aT.Z(133L);
        awVar.a(new aT.g(1L), (ba.k[]) kVar.d(1), kVar.g());
        awVar.e(new aT.z(Native.b((Component) frame)));
    }
}

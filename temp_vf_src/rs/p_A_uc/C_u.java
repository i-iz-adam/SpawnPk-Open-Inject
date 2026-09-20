package rs.p_A_uc;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.aw;
import com.sun.jna.platform.win32.aT.Z;
import com.sun.jna.platform.win32.aT.g;
import com.sun.jna.platform.win32.aT.z;
import com.sun.jna.platform.win32.ba.k;
import java.awt.Frame;

public class C_u {
   public static void a(Frame var0) {
      var0.setState(0);
      aw var1 = aw.j;
      k var2 = new k();
      var2.d = new g(1L);
      var2.l.b.l = new Z(133L);
      var1.a(new g(1L), (k[])var2.d(1), var2.g());
      z var3 = new z(Native.b(var0));
      var1.e(var3);
   }
}

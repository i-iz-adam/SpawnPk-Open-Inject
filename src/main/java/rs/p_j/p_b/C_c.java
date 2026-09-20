package rs.p_j.p_b;

import java.util.HashMap;
import java.util.Map;
import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;

public class C_c {
   private static final Map<Integer, rs.p_h.C_b> a = new HashMap<>();
   private final int b;

   public C_c(int var1) {
      this.b = var1;
   }

   public static void a() {
      if (!a.isEmpty()) {
         a.clear();
      }
   }

   public C_c a(String var1) {
      this.d().fx[this.b] = var1;
      return this;
   }

   public C_c a(rs.p_h.C_b var1) {
      a.put(this.b, var1);
      return this;
   }

   private C_Client_mc d() {
      return C_Launcher_mc.n().o();
   }

   public static Map<Integer, rs.p_h.C_b> b() {
      return a;
   }

   public int c() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}

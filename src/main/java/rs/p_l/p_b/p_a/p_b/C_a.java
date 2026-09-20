package rs.p_l.p_b.p_a.p_b;

import rs.p_l.C_h;
import rs.p_l.p_b.p_a.C_d;

public class C_a {
   private static final long a = 5000L;
   private String b;
   private long c;

   public C_a(String var1) {
      this.b = var1;
      this.c = System.currentTimeMillis();
   }

   public void a(int var1, int var2) {
      int var3 = C_h.ap;
      C_h.ap = (int)(256.0 - 256.0 * (double)((float)this.b() / 5000.0F) * 1.5);
      if (C_h.ap < 0) {
         C_h.ap = 0;
      }

      C_d.b.f.gn.a("@yel@[!] @whi@" + this.b, var1, var2, 16750623, 0, false);
      C_h.ap = var3;
   }

   public boolean a() {
      return this.b() < 5000L;
   }

   private long b() {
      return System.currentTimeMillis() - this.c;
   }
}

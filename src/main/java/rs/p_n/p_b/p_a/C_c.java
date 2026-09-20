package rs.p_n.p_b.p_a;

import java.util.HashSet;
import rs.C_Client_mc;

public abstract class C_c extends rs.p_n.p_b.C_a {
   public static HashSet<C_c> g = new HashSet<>();
   private boolean h;

   public static void d() {
      if (g.size() != 0) {
         for (C_c var1 : g) {
            var1.e();
         }

         g.clear();
      }
   }

   public C_c(long var1) {
      this.e = var1;
   }

   @Override
   public void c() {
      g.add(this);
   }

   public abstract void e();

   public int f() {
      return C_Client_mc.hP + (rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? -526 : -10);
   }

   public int g() {
      return C_Client_mc.hQ + (rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? -178 : -10);
   }
}

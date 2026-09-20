package rs.p_q.p_a.p_a.p_a;

import java.util.Arrays;

public class C_f extends rs.p_q.p_a.p_a.C_a {
   private static final int d = 0;
   private static final int e = 1;
   private static final int f = 2;
   private static final int g = 3;
   private static final int h = 4;

   @Override
   public void a() {
      int var1 = this.e();
      int var2 = this.g();
      rs.p_n.C_e var3 = rs.p_n.C_e.H[var2];
      if (var1 == 0 && var3.ay != null) {
         Arrays.fill(var3.ay, null);
      }

      if (var1 == 1) {
         int var4 = this.c();
         String var5 = this.h();
         if (var3.ay != null && var4 < var3.ay.length) {
            var3.ay[var4] = var5;
         }
      }

      if (var1 == 2) {
         String var6 = this.h();
         if (var3.ay != null) {
            Arrays.fill(var3.ay, var6);
         }
      }

      if (var1 == 3) {
         boolean var7 = this.e() == 1;
         if (var7) {
            var3.ay = new String[var3.az.length];
            Arrays.fill(var3.ay, null);
         } else {
            var3.ay = null;
         }
      }

      if (var1 == 4) {
         int var8 = this.c();
         int var9 = this.c();
         var3.ac = var8;
         var3.ap = var9;
      }
   }
}

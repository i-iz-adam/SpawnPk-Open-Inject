package rs.p_l.p_b.p_a.p_a;

import rs.p_d.C_k;
import rs.p_l.C_F_uc;

public class C_b extends C_a {
   protected int t;

   public C_b(int var1) {
      this.t = var1;
   }

   @Override
   protected void b() {
   }

   @Override
   protected void c() {
      byte var1 = 15;
      int var2 = 15;
      byte var3 = 32;
      int var4 = var3 + 10;
      int var5 = var3 + 10;
      C_F_uc var6 = C_k.a(391, 1, 0, var3);
      C_F_uc var7 = C_k.a(this.t, 1, 0, 32);
      if (var6 != null && var7 != null) {
         var6.f(var1, var2);
         var6.f(var1 + var4, var2);
         var6.f(var1 + var4 + var4, var2);
         var6.f(var1, var2 + var5);
         var7.f(var1 + var4, var2 + var5);
         var6.f(var1 + var4 + var4, var2 + var5);
         var6.f(var1, var2 + var5 + var5);
         var6.f(var1 + var4, var2 + var5 + var5);
         var6.f(var1 + var4 + var4, var2 + var5 + var5);
         var1 = 10;
         var2 = rs.p_l.p_b.p_a.C_d.b.f.B().getHeight() - 65;
         String var8 = "[ ";
         int var9 = 0;

         for (int var11 : this.q.keySet()) {
            if (var9 == this.r) {
               var8 = var8 + "<u=0>";
            }

            if (this.k().contains(var11)) {
               var8 = var8 + "@gre@" + var11;
            } else if (this.p.containsKey(var11)) {
               var8 = var8 + "@whi@" + var11;
            } else {
               var8 = var8 + "@red@" + var11;
            }

            if (var9 == this.r) {
               var8 = var8 + "</u>";
            }

            var8 = var8 + " ";
            var9++;
         }

         var8 = var8 + "@whi@]";
         rs.p_l.p_b.p_a.C_d.b.f.gm.a(var8, var1, var2, 16777215, 0, false);
      }
   }

   public int n() {
      return this.t;
   }

   public void g(int var1) {
      this.t = var1;
   }
}

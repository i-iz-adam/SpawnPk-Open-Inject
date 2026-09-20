package rs.p_q.p_a.p_a.p_a;

import java.util.ArrayList;

public class C_b extends rs.p_q.p_a.p_a.C_a {
   @Override
   public void a() {
      int var1 = this.e();
      if (var1 == 0) {
         rs.p_n.p_a.p_a.C_c.b();
      }

      if (var1 == 1) {
         int var2 = this.g();
         int var3 = this.e();
         ArrayList var4 = new ArrayList(var3);

         for (int var5 = 0; var5 < var3; var5++) {
            String var6 = "Select";
            String var7 = this.h();
            boolean var8 = this.e() == 1;
            if (var8) {
               var6 = this.h();
            }

            var4.add(new rs.p_n.p_a.p_a.C_d(var7, var6));
         }

         rs.p_n.p_a.p_a.C_a var12 = (rs.p_n.p_a.p_a.C_a)rs.p_n.C_e.l(var2);
         var12.a(var4);
         var12.at = ((rs.p_n.p_a.p_a.C_d)var4.get(0)).a();
      }

      if (var1 == 2) {
         int var9 = this.g();
         int var10 = this.e();
         rs.p_n.p_a.p_a.C_a var11 = (rs.p_n.p_a.p_a.C_a)rs.p_n.C_e.l(var9);
         var11.at = var11.i().get(var10).a();
      }
   }
}

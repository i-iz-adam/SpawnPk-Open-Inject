package rs.p_l.p_e;

import java.awt.Color;
import rs.C_Client_mc;

class C_p extends rs.p_q.p_a.p_a.C_a {
   @Override
   public void a() {
      int var1 = this.e();
      if (var1 == 0) {
         int var2 = this.e();
         int var3 = this.e();
         int var4 = this.e();
         int var5 = this.e();
         Color var6 = new Color(var2, var3, var4, var5);
         var2 = this.e();
         var3 = this.e();
         var4 = this.e();
         var5 = this.e();
         Color var7 = new Color(var2, var3, var4, var5);
         int var8 = this.c();
         int var9 = this.c();
         C_n var10 = C_Client_mc.aa.a(var8 + "," + var9, var8, var9, var6, var7);
         if (this.e() == 1) {
            var10.d = this.h();
         }
      }

      if (var1 == 1) {
         int var12 = this.c();
         int var14 = this.c();
         C_Client_mc.aa.b(var12, var14);
      }
   }
}

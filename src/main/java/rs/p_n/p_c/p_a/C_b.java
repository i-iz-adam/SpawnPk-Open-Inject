package rs.p_n.p_c.p_a;

import rs.C_Client_mc;
import rs.p_n.C_e;

class C_b extends rs.p_q.p_a.p_a.C_a {
   @Override
   public void a() {
      int var1 = this.e();
      if (var1 == 0) {
         C_a.h();
      }

      if (var1 == 1) {
         int var2 = this.g();
         int var3 = this.g();
         boolean var4 = this.e() == 1;
         C_a.a(var2, var3, var4);
      }

      if (var1 == 2) {
         int var5 = this.e();
         C_e.l(6181).at = "";
         C_e.l(6182).at = "";
         C_e.l(6183).at = "";
         C_e.l(6184).at = "";
         if (var5 == 1) {
            C_e.l(6183).at = this.h();
            rs.p_n.p_d.C_b var8 = C_a.d.b(6183);
            var8.a(var8.f(), var8.g() - 5);
            C_a.d.a();
         } else if (var5 == 2) {
            C_e.l(6182).at = this.h();
            C_e.l(6183).at = this.h();

            for (int var9 = 6182; var9 <= 6183; var9++) {
               rs.p_n.p_d.C_b var12 = C_a.d.b(var9);
               var12.a(var12.f(), var12.g() + 3);
            }

            C_a.d.a();
         } else if (var5 == 3) {
            C_e.l(6181).at = this.h();
            C_e.l(6182).at = this.h();
            C_e.l(6183).at = this.h();

            for (int var10 = 6181; var10 <= 6183; var10++) {
               rs.p_n.p_d.C_b var13 = C_a.d.b(var10);
               var13.a(var13.f(), var13.g() + 10);
            }

            C_a.d.a();
         } else if (var5 == 4) {
            C_e.l(6181).at = this.h();
            C_e.l(6182).at = this.h();
            C_e.l(6183).at = this.h();
            C_e.l(6184).at = this.h();
         }
      }

      if (var1 == 3) {
         int var6 = this.g();
         int var11 = 0;
         int var14 = 0;
         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
            var11 = C_Client_mc.ai / 2 - 356;
            var14 = C_Client_mc.ah / 2 - 230;
         }

         switch (var6) {
            case -1:
               rs.p_l.p_f.C_e.d().g().a(5, 88 + var11, 419 + var14, 16733525, 200);
               rs.p_l.p_f.C_e.d().g().a(5, 88 + var11, 419 + var14, 2621184, 200);
               rs.p_l.p_f.C_e.d().g().a(5, 88 + var11, 419 + var14, 65535, 200);
               rs.p_l.p_f.C_e.d().g().a(10, 88 + var11, 419 + var14, 16770304, 200);
               break;
            default:
               rs.p_l.p_f.C_e.d().g().b(20, 88 + var11, 419 + var14, var6);
         }
      }

      if (var1 == 4) {
         int var7 = this.g();
         C_a.m(var7);
      }
   }
}

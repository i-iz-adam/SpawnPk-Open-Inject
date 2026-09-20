package rs.p_l.p_e.p_a;

import rs.C_Client_mc;

public class C_e extends rs.p_l.p_e.C_f {
   @Override
   public void b() {
   }

   @Override
   public void b(C_Client_mc var1, rs.p_l.p_e.C_f.a var2) {
      if (var2 == rs.p_l.p_e.C_f.a.b) {
         int var3 = 375;
         int var4 = 20;
         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
            var3 = 200 + (C_Client_mc.ai - 560);
            var4 = 25;
         }

         if (rs.p_l.p_e.C_f.a.e() || rs.p_l.p_e.C_f.e.e() || rs.p_l.p_e.C_f.f.e() || rs.p_l.p_e.C_f.g.e()) {
            var4 += 80 + (rs.p_f.C_a.ai == rs.p_f.C_a.c.b ? 20 : 0);
         }

         int var5 = C_Client_mc.eh + (C_Client_mc.eR.ac - 6 >> 7);
         int var6 = C_Client_mc.ei + (C_Client_mc.eR.ad - 6 >> 7);
         var1.gn.b("Coords: @gre@" + var5 + ", " + var6, var3, var4, 16776960, 0);
         var4 += 15;
         int var7 = var5 >> 6;
         int var8 = var6 >> 6;
         int var9 = var7 * 256 + var8;
         var1.gn.b("Region ID: @whi@" + var9, var3, var4, 16776960, 0);
      }
   }

   @Override
   public boolean a(C_Client_mc var1) {
      return rs.p_f.C_a.ao;
   }

   @Override
   public void c() {
   }
}

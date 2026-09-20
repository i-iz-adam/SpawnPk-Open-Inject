package rs.p_l.p_e.p_a;

import rs.C_Client_mc;

public class C_v extends rs.p_l.p_e.C_f {
   public boolean p = false;
   public int q;
   public String r = "";
   public int s;
   public String t = "";
   public int u;
   public String v;
   public static rs.p_q.p_a.p_a.C_a w = new C_w();

   @Override
   public void b() {
      this.r = "Killcount: @yel@" + this.q;
      this.t = "Drop rate: @gre@+" + this.s + "%";
      this.v = "Essence bonus: @gre@+" + this.u + "%";
   }

   @Override
   public boolean a(C_Client_mc var1) {
      return this.p;
   }

   @Override
   public void b(C_Client_mc var1, rs.p_l.p_e.C_f.a var2) {
      if (var2 != rs.p_l.p_e.C_f.a.a) {
         int var3 = 397;
         int var4 = 2;
         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
            var3 = 200 + (C_Client_mc.ai - 560);
            var4 = 25;
         }

         if (!var1.x.C) {
            var4 += rs.p_f.C_a.ai == rs.p_f.C_a.c.b ? 25 : 50;
         } else if (rs.p_f.C_a.ai != rs.p_f.C_a.c.b) {
            var4 += 8;
         }

         C_Client_mc.gl.a(this.r, var3 + 110, var4 + 17 + 1, 16777215, 0);
         C_Client_mc.gl.a(this.t, var3 + 110, var4 + 17 + 15 + 1, 16777215, 0);
         C_Client_mc.gl.a(this.v, var3 + 110, var4 + 17 + 15 + 15 + 1, 16777215, 0);
      }
   }

   @Override
   public void c() {
      this.p = false;
   }
}

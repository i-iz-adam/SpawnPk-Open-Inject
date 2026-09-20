package rs.p_n.p_c.p_d;

import rs.C_Client_mc;

public class C_d extends rs.p_q.p_a.p_a.C_a {
   private rs.p_l.p_f.p_a.p_g.C_a d = new rs.p_l.p_f.p_a.p_g.C_a();
   private rs.p_l.p_f.p_a.p_g.C_b e = new rs.p_l.p_f.p_a.p_g.C_b();
   private rs.p_l.p_f.C_b f = new rs.p_l.p_f.p_a.p_g.C_c();

   @Override
   public void a() {
      int var1 = this.e();
      if (var1 == 0) {
         int var2 = this.e();
         C_a.m(var2);
      }

      if (var1 == 1) {
         C_c.a();
      }

      if (var1 == 2) {
         C_c.a(this.e());
      }

      if (var1 == 3) {
         int var8 = this.e();
         String var3 = this.h();
         String var4 = this.h();
         C_c.a(var8, var3, var4);
      }

      if (var1 == 4) {
         C_b.a();
      }

      if (var1 == 5) {
         C_b.b();
      }

      if (var1 == 6) {
         int var9 = this.e();
         C_a.dD.a(var9);
      }

      if (var1 == 7) {
         boolean var10 = this.e() == 1;
         rs.p_n.C_e.l(19611).bf = var10;
         rs.p_n.C_e.l(32587).bf = var10;
      }

      if (var1 == 15) {
         int var11 = this.e();
         this.b();
         if (var11 == 0) {
            this.b();
         } else if (var11 != 1 && var11 == 2) {
            rs.p_l.p_f.C_e.d().a(this.e);
            rs.p_l.p_f.C_e.d().a(this.f);
         }
      }

      if (var1 == 16) {
      }

      if (var1 == 17) {
         this.e.c(this.g(), this.g());
         this.e.b(this.e() == 1);
      }

      if (var1 == 18) {
         int var12 = this.e();
         if (var12 == 0) {
            rs.p_l.p_f.C_e.d().b(this.d);
         } else {
            this.d.k(false);
            this.d.c("0:00");
            if (var12 == 1) {
               this.d.a(System.currentTimeMillis());
            } else if (var12 == 2) {
               this.d.a(System.currentTimeMillis() + (long)this.g() * 1000L);
            }

            rs.p_l.p_f.C_e.d().a(this.d);
         }
      }

      if (var1 == 19) {
         int var13 = this.g();
         this.d.b(C_Client_mc.a((double)var13));
      }

      if (var1 == 20) {
         int var14 = this.g();
         long var17 = (long)var14 * 1000L;
         int var5 = (int)(var17 / 1000L);
         int var6 = var5 % 3600 / 60;
         int var7 = var5 % 60;
         this.d.c("@gre@" + String.format("%d:%02d", var6, var7));
         this.d.k(true);
      }

      if (var1 == 21) {
         boolean var15 = C_a.dB;
         C_a.dB = this.e() == 1;
         if (var15 != C_a.dB) {
            C_a.m(C_a.dC);
         }
      }

      if (var1 == 22) {
         String var16 = "raids";
         boolean var18 = this.e() == 0;
         if (!var18) {
            var16 = this.h();
         }

         rs.p_n.p_a.p_a.C_a var19 = (rs.p_n.p_a.p_a.C_a)rs.p_n.C_e.l(32430);
         var19.i().get(1).a("Adept (Req. 10+ " + var16 + ")");
         var19.i().get(2).a("Expert (Req. 50+ " + var16 + ")");
         var19.i().get(3).a("Master (Req. 100+ " + var16 + ")");
      }
   }

   private void b() {
      if (this.e != null) {
         rs.p_l.p_f.C_e.d().b(this.e);
      }

      if (this.f != null) {
         rs.p_l.p_f.C_e.d().b(this.f);
      }
   }
}

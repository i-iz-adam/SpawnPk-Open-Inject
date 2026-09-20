package rs.p_q.p_a.p_a.p_a;

import rs.p_n.p_c.C_ac;

public class C_h extends rs.p_q.p_a.p_a.C_a {
   @Override
   public void a() {
      int var1 = this.e();
      switch (var1) {
         case 0:
            C_ac.h();
            break;
         case 1:
            int var2 = this.e();
            C_ac.o(var2);
            break;
         case 2:
            C_ac.e(this.e() == 1);
            break;
         case 3:
            C_ac.a(this.e() == 1);
            break;
         case 4:
            int var3 = this.e();
            if (var3 == 0) {
               C_ac.j();
            } else {
               int var13 = this.g();
               int var14 = this.g();
               C_ac.e(var13, var14, var3 == 2 ? this.h() : "");
            }
            break;
         case 5:
            String var4 = this.h();
            C_ac.c(var4);
            break;
         case 6:
            rs.p_n.C_e.l(36026).bg = this.e() == 1;
            break;
         case 7:
            C_ac.k();
            break;
         case 8:
            C_ac.f(this.e() == 1);
            break;
         case 9:
            rs.p_n.C_e.l(36002).at = this.h();
            break;
         case 10:
            rs.p_n.C_e.l(36003).at = this.h();
            break;
         case 11:
            rs.p_n.C_e.l(36019).at = this.h();
            rs.p_n.p_d.C_b var5 = C_ac.c.b(36019);
            short var6 = 293;
            if (rs.p_n.C_e.l(36019).at.contains("\\n")) {
               var6 = 288;
            }

            if (var5.g() != var6) {
               var5.a(var5.f(), var6);
               C_ac.c.a();
            }
            break;
         case 12:
            int var7 = this.e();

            for (int var15 = 0; var15 < 5; var15++) {
               if (var15 + 1 > var7) {
                  C_ac.bR[var15] = null;
               } else {
                  C_ac.bR[var15] = this.h();
               }
            }
            break;
         case 13:
            C_ac.b(this.h());
            break;
         case 14:
            C_ac.m(this.e());
            break;
         case 15:
            C_ac.d(this.e() == 1);
            break;
         case 16:
            C_ac.i();
            break;
         case 17:
            rs.p_n.C_e.l(36026).V = 0;
            break;
         case 18:
            C_ac.c(this.e() == 1);
            break;
         case 19:
            C_ac.g(this.e(), this.e());
            break;
         case 20:
            C_ac.bJ = this.e() == 1;
            break;
         case 21:
            C_ac.n(this.e());
            break;
         case 22:
            int var8 = this.c();
            int var9 = this.g();
            int var10 = this.g();
            C_ac.l(36025).az[var8] = var9 + 1;
            C_ac.l(36025).ax[var8] = var10;
            break;
         case 23:
            int var11 = this.e();

            for (int var12 = 0; var12 < 5; var12++) {
               if (var12 + 1 > var11) {
                  C_ac.bS[var12] = null;
               } else {
                  C_ac.bS[var12] = this.h();
               }
            }

            C_ac.b(true);
            break;
         case 24:
            C_ac.bK = this.c();
            break;
         case 25:
            C_ac.bL = this.c();
      }
   }
}

package rs.p_l.p_e.p_a;

import javax.swing.SwingUtilities;

class C_d extends rs.p_q.p_a.p_a.C_a {
   @Override
   public void a() {
      int var1 = this.e();
      switch (var1) {
         case 1:
            int var2 = this.e();
            int var3 = this.e();
            if (var2 == 1) {
               rs.p_f.C_a.bk = var3 == 1;
            } else if (var2 == 2) {
               C_c.b(var3 == 1);
            } else if (var2 == 3) {
               C_c.c(var3 == 1);
            } else if (var2 == 4) {
               C_c.d(var3 == 1);
            }
            break;
         case 2:
            String var4 = this.h();
            String var5 = this.h();
            SwingUtilities.invokeLater(() -> {
               if (!var4.contains("@red@") && !var5.contains("@red@")) {
                  rs.p_s.p_q.C_d.e.i().d().a(var4);
                  rs.p_s.p_q.C_d.e.i().e().a(var5);
               } else {
                  if (var4.contains("Died")) {
                     rs.p_s.p_q.C_d.e.i().d().c(true);
                  } else if (var5.contains("Died")) {
                     rs.p_s.p_q.C_d.e.i().e().c(true);
                  }

                  rs.p_s.p_q.C_d.e.f();
               }

               rs.p_s.p_q.C_d.e.k().c().a();
            });
            C_c.a(var4);
            C_c.b(var5);
            break;
         case 3:
            int var6 = this.e();
            if (var6 == 1) {
               C_c.a(this.c());
               C_c.b(this.c());
               C_c.c(C_c.h() + " / " + C_c.i());
            } else {
               C_c.c(this.c());
               C_c.d(this.c());
               C_c.d(C_c.j() + " / " + C_c.k());
            }

            boolean var7 = C_c.h() <= 0;
            boolean var8 = C_c.j() <= 0;
            if (var7 || var8) {
               SwingUtilities.invokeLater(() -> {
                  if (!rs.p_s.p_q.C_d.e.i().c()) {
                     rs.p_s.p_q.C_d.e.i().d().c(var7);
                     rs.p_s.p_q.C_d.e.i().e().c(var8);
                     rs.p_s.p_q.C_d.e.f();
                  }
               });
            }
            break;
         case 4:
            int var9 = this.e();
            if (var9 == 1) {
               C_c.e(this.c());
               C_c.f(this.c());
               float var17 = C_c.l() == 0 && C_c.m() == 0 ? 1.0F : (float)C_c.l() / (float)C_c.m();
               int var21 = (int)Math.ceil((double)(var17 * 100.0F));
               C_c.e(C_c.l() + "/" + C_c.m() + " (" + var21 + "%)");
            } else {
               C_c.g(this.c());
               C_c.h(this.c());
               float var16 = C_c.n() == 0 && C_c.o() == 0 ? 1.0F : (float)C_c.n() / (float)C_c.o();
               int var20 = (int)Math.ceil((double)(var16 * 100.0F));
               C_c.f(C_c.n() + "/" + C_c.o() + " (" + var20 + "%)");
            }

            SwingUtilities.invokeLater(() -> {
               rs.p_s.p_q.C_d.e.i().d().a(C_c.l(), C_c.m());
               rs.p_s.p_q.C_d.e.i().e().a(C_c.n(), C_c.o());
               rs.p_s.p_q.C_d.e.k().c().a();
            });
            break;
         case 5:
            int var10 = this.e();
            if (var10 == 1) {
               C_c.i(this.c());
               C_c.j(this.c());
               float var19 = C_c.p() == 0 && C_c.q() == 0 ? 1.0F : (float)C_c.p() / (float)C_c.q();
               int var23 = (int)Math.ceil((double)(var19 * 100.0F));
               C_c.g(C_c.p() + "/" + C_c.q() + " (" + var23 + "%)");
            } else {
               C_c.k(this.c());
               C_c.l(this.c());
               float var18 = C_c.r() == 0 && C_c.s() == 0 ? 1.0F : (float)C_c.r() / (float)C_c.s();
               int var22 = (int)Math.ceil((double)(var18 * 100.0F));
               C_c.h(C_c.r() + "/" + C_c.s() + " (" + var22 + "%)");
            }

            SwingUtilities.invokeLater(() -> {
               rs.p_s.p_q.C_d.e.i().d().b(C_c.p(), C_c.q());
               rs.p_s.p_q.C_d.e.i().e().b(C_c.r(), C_c.s());
               rs.p_s.p_q.C_d.e.k().c().a();
            });
            break;
         case 6:
            if (this.e() == 1) {
               C_c.m(this.c());
            } else {
               C_c.n(this.c());
            }

            int var11 = C_c.t() - C_c.u();
            if (var11 == 0) {
               C_c.i(C_c.t() + " (+" + var11 + ")");
               C_c.j(C_c.u() + " (+" + var11 + ")");
            } else if (var11 >= 0) {
               C_c.i(C_c.t() + " (+" + Math.abs(var11) + ")");
               C_c.j(C_c.u() + " (-" + Math.abs(var11) + ")");
            } else {
               C_c.i(C_c.t() + " (-" + Math.abs(var11) + ")");
               C_c.j(C_c.u() + " (+" + Math.abs(var11) + ")");
            }

            SwingUtilities.invokeLater(() -> {
               rs.p_s.p_q.C_d.e.i().a(C_c.t() + C_c.u());
               rs.p_s.p_q.C_d.e.i().d().e(C_c.t());
               rs.p_s.p_q.C_d.e.i().e().e(C_c.u());
               rs.p_s.p_q.C_d.e.k().c().a();
            });
            break;
         case 7:
            int var12 = this.e();
            int var13 = this.e();
            boolean var14 = this.e() == 1;
            String var15 = var14 ? "<col=4028718>" : "@red@";
            if (var12 == 1) {
               C_c.k(var15 + "[" + var13 + "%]");
            } else {
               C_c.l(var15 + "[" + var13 + "%]");
            }
            break;
         case 8:
            if (!C_c.v().equalsIgnoreCase("N/A") && C_c.v().contains("@red@")) {
            }
      }
   }
}

package rs.p_n.p_c.p_b;

import java.util.ArrayList;
import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;
import rs.p_l.C_F_uc;
import rs.p_n.C_e;

public class C_d extends rs.p_q.p_a.p_a.C_a {
   @Override
   public void a() {
      int var1 = this.e();
      switch (var1) {
         case 0:
            C_a.e.b();
            C_a.bJ = 0;
            C_b.c = 0;
            C_a.bI = null;
            C_e.l(57220).bv = false;
            break;
         case 1:
            String var2 = this.h();
            C_b.a(C_a.bJ, var2);
            C_a.bJ++;
            break;
         case 2:
            double var3 = (double)this.g() / 100.0;
            double var5 = 367.0 * var3;
            C_e.l(57222).E = new C_F_uc("event/task 2", (int)var5, 15);
            break;
         case 3:
            C_e.l(57223).bf = this.e() == 1;
            break;
         case 4:
            C_e.l(57220).bv = this.e() == 1;
            C_Launcher_mc.n().o();
            C_Client_mc.bP = 149;
            C_Launcher_mc.n().o();
            C_Client_mc.bQ = -1;
            break;
         case 5:
            String var7 = this.h();
            int var8 = this.g();
            C_b.a(var8, var7);
            break;
         case 6:
            C_a.bI = this.h();
            if (C_a.c.a(C_a.bI)) {
               int var16 = C_a.c.b(C_a.bI);
               C_e.l(56997).V = var16;
               C_e.l(57016).V = var16;
            }
            break;
         case 7:
            ArrayList var9 = new ArrayList();

            for (rs.p_n.p_d.C_b var19 : C_a.e.d()) {
               if (C_e.H[var19.c()] instanceof rs.p_n.p_a.p_a.C_a) {
                  var9.add(var19);
               }
            }

            for (rs.p_n.p_d.C_b var20 : var9) {
               rs.p_n.p_a.p_a.C_a var22 = (rs.p_n.p_a.p_a.C_a)C_e.l(var20.c());
               var22.o(C_a.e.d().size());
               C_a.e.a(rs.p_n.p_a.p_a.C_c.c).b(var20.c(), 0, var22.aR + 1);
            }

            try {
               C_a.e.a();
            } catch (Exception var15) {
               var15.printStackTrace();
            }

            int var18 = 57017 + C_a.bJ * 2;

            for (int var21 = var18; var21 <= 57217; var21 += 2) {
               C_e.l(var21).at = "";
               C_e.l(var21 + 1).bf = false;
               C_e.l(var21).br = 0;
               C_e.l(var21).bt = 0;
               C_e.l(var21).bs = 0;
            }

            C_e.l(57016).aH = C_b.c + 25;
            break;
         case 8:
            int var11 = this.c();
            C_e.l(56997).V = var11;
            C_e.l(57016).V = var11;
            break;
         case 9:
            C_e.l(56997).V = 0;
            C_e.l(57016).V = 0;
            C_a.c.c(C_a.bI);
            break;
         case 10:
            int var12 = this.e();
            String var13 = this.h();
            int var14 = C_b.b;
            C_e.l(var14).bx = true;
            if (var12 > 0) {
               C_e var10000 = C_e.l(var14);
               var10000.by = var10000.by + "\n" + var13;
            } else {
               C_e.l(var14).by = var13;
            }
      }
   }
}

package rs.p_s.p_r;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Polygon;
import javax.inject.Inject;
import rs.C_Client_mc;
import rs.C_V_uc;
import rs.p_runelite.p_a.C_f;
import rs.p_runelite.p_a.C_h;

public class C_b extends rs.p_l.p_f.C_b {
   private final C_a e;

   @Inject
   public C_b(C_a var1) {
      this.e = var1;
      this.a(rs.p_l.p_f.C_a.p);
   }

   @Override
   public void a() {
      if (this.e.e() && C_V_uc.t != -1 && C_V_uc.u != -1) {
         C_f var1 = C_f.a(C_V_uc.t, C_V_uc.u);
         this.a(var1, this.e.f(), this.e.d(), this.e.g());
      }

      if (this.e.a() && this.a.gd > 0 && this.a.ge > 0) {
         C_f var2 = C_f.a(this.a.gd, this.a.ge);
         this.a(var2, this.e.b(), this.e.d(), this.e.c());
      }

      if (this.e.i()) {
         C_f var3 = C_f.a(C_Client_mc.eR.g());
         if (var3 != null) {
            this.a(var3, this.e.j(), this.e.l(), this.e.k());
         }
      }
   }

   private void a(C_f var1, Color var2, double var3, Color var5) {
      if (var1 != null) {
         Polygon var6 = C_h.a(var1);
         if (var6 != null) {
            this.a(var6, var2, var5, new BasicStroke((float)var3));
         }
      }
   }
}

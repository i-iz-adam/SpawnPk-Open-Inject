package rs.p_s.p_p;

import javax.inject.Inject;

public class C_c extends rs.p_l.p_f.p_b.C_b {
   private final C_a i;

   @Inject
   public C_c(C_a var1) {
      this.i = var1;
      this.a(rs.p_l.p_f.C_a.e);
   }

   @Override
   public void a() {
      if ((this.e == null || this.e.aG != null) && this.e.aG.h) {
         if (this.e.k() || this.e.j()) {
            rs.p_ui.p_b.C_b.a().a(this.e, this.i.c(), this.i.a(), this.i.d());
         }
      }
   }
}

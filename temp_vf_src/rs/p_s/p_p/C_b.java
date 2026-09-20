package rs.p_s.p_p;

import javax.inject.Inject;
import rs.C_Client_mc;

public class C_b extends rs.p_l.p_f.p_b.C_c {
   private final C_a f;

   @Inject
   public C_b(C_a var1) {
      this.f = var1;
      this.a(rs.p_l.p_f.C_a.n);
   }

   @Override
   public void a() {
      if (C_Client_mc.eR != null) {
         boolean var1 = rs.p_f.C_a.N;
         rs.p_f.C_a.N = true;
         rs.p_ui.p_b.C_b.a().a(C_Client_mc.eR, this.f.c(), this.f.a(), this.f.d());
         rs.p_f.C_a.N = var1;
      }
   }
}

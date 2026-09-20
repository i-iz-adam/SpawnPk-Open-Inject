package rs.p_l.p_f.p_b;

import rs.C_Client_mc;
import rs.p_a.C_k;

public abstract class C_c extends rs.p_l.p_f.C_b {
   protected C_k e;

   @Override
   public void b() {
      this.e = null;
   }

   protected boolean k() {
      return this.e != null && this.a != null ? this.e == C_Client_mc.eR : false;
   }

   public C_k l() {
      return this.e;
   }

   public void a(C_k var1) {
      this.e = var1;
   }
}

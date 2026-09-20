package rs.p_s.p_b;

import rs.p_eventbus.C_EventBus_mc;

class C_r extends rs.p_ui.C_k {
   C_r(C_q var1, rs.p_ui.C_m var2, C_EventBus_mc var3) {
      super(var2);
      this.b = var1;
      this.a = var3;
   }

   @Override
   protected void a(rs.p_ui.C_m var1) {
      this.a.register(var1);
   }

   @Override
   protected void b(rs.p_ui.C_m var1) {
      this.a.unregister(var1);
   }
}

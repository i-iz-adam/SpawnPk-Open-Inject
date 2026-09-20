package rs.p_n.p_c;

import rs.p_gui.C_Launcher_mc;

class C_R_uc extends rs.p_n.p_b.p_a.C_c {
   C_R_uc(C_O_uc var1, long var2) {
      super(var2);
      this.h = var1;
   }

   @Override
   public void e() {
      C_Launcher_mc.n().o().b(this.f(), this.g(), " <img=25> Vote to skip\nIf enough players vote to skip, the\nhotspot will automatically change.");
   }
}

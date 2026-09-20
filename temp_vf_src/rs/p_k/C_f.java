package rs.p_k;

import rs.p_gui.C_Launcher_mc;

class C_f implements Runnable {
   C_f(C_e var1) {
      this.a = var1;
   }

   @Override
   public void run() {
      C_e.a(true);
      if (C_e.a(this.a) != C_e.a.a) {
         C_e.b(this.a);
         C_e.c(this.a);
      }

      C_Launcher_mc.n().o().F();
      C_Launcher_mc.n().o().d();
   }
}

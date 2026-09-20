package rs.p_l;

import java.awt.Dimension;
import java.awt.Toolkit;
import rs.p_gui.C_Launcher_mc;

class C_D_uc implements Runnable {
   private final C_C_uc a;
   C_D_uc(C_C_uc var1) {
      this.a = var1;
   }

   @Override
   public void run() {
      if (rs.p_l.p_b.p_a.C_d.c) {
         C_Launcher_mc.n().i().setVisible(true);
      }

      short var1 = 1134;
      short var2 = 537;
      if (rs.p_l.p_b.p_a.C_d.c) {
         var1 = 1312;
         var2 = 800;
      }

      C_Launcher_mc.n().i().setSize(var1, var2);
      Dimension var3 = Toolkit.getDefaultToolkit().getScreenSize();
      C_Launcher_mc.n()
         .i()
         .setLocation(var3.width / 2 - C_Launcher_mc.n().i().getSize().width / 2, var3.height / 2 - C_Launcher_mc.n().i().getSize().height / 2);
      if (rs.p_l.p_b.p_a.C_d.c && var3.getWidth() < (double)var1) {
         C_Launcher_mc.n().i().setExtendedState(6);
      }
   }
}

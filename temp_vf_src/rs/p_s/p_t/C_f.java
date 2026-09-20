package rs.p_s.p_t;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import rs.p_gui.C_Launcher_mc;

class C_f implements rs.p_h.C_e {
   int a;

   C_f(C_d var1, C_c var2) {
      this.c = var1;
      this.b = var2;
      this.a = 0;
   }

   @Override
   public boolean loop() {
      if (!C_Launcher_mc.n().o().fc) {
         return false;
      } else if (this.a++ >= 3) {
         return false;
      } else {
         Image var1 = C_d.c(this.c).a(this.b.f());
         if (var1 == null) {
            return true;
         } else {
            SwingUtilities.invokeLater(() -> C_d.d(this.c).setIcon(new ImageIcon(var1)));
            return false;
         }
      }
   }
}

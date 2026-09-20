package rs.p_l.p_d;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import rs.C_Client_mc;

class C_d extends MouseAdapter {
   private final C_c a;

   C_d(C_c var1) {
      this.a = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (C_c.a(this.a) != null) {
         if (!C_c.a(this.a).fc && var1.getY() >= 460 && var1.getY() <= 485 && var1.getX() >= 10 && var1.getX() <= 132) {
            C_Client_mc.f("https://spawnpk.net/forums/index.php?/forum/10-updates/");
         }
      }
   }
}

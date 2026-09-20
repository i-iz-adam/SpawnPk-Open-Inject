package rs.p_q.p_b;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class C_c implements KeyListener {
   C_c(C_a var1) {
      this.a = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      switch (var1.getKeyCode()) {
         case 10:
         case 40:
            C_a.a(this.a, false);
            break;
         case 33:
         case 34:
            String var2 = C_a.b(this.a).getText();
            String var3 = C_a.c(this.a).getText();
            int var4 = var1.getKeyCode() == 34 ? var3.lastIndexOf(var2, var3.length() - 1) : var3.indexOf(var2, 0);
            C_a.a(this.a, var4, var4 + 1);
            break;
         case 38:
            C_a.a(this.a, true);
      }
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }
}

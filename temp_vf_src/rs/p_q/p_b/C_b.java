package rs.p_q.p_b;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class C_b extends KeyAdapter {
   C_b(C_a var1) {
      this.a = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == 70 && (var1.getModifiersEx() & 128) != 0) {
         C_a.a(this.a).setVisible(true);
      }
   }
}

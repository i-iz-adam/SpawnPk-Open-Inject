package rs.p_s.p_b;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class C_k extends KeyAdapter {
   C_k(C_i var1, boolean var2) {
      this.b = var1;
      this.a = var2;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (this.a) {
         this.b.a(new C_l(var1));
      } else {
         this.b.a(new C_l(var1));
      }
   }
}

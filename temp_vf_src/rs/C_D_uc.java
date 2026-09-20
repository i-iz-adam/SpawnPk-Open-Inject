package rs;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class C_D_uc extends ComponentAdapter {
   C_D_uc(C_C_uc var1) {
      this.a = var1;
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
      if (System.currentTimeMillis() - C_Client_mc.j > 100L) {
         C_Client_mc.h = true;
         C_Client_mc.j = System.currentTimeMillis();
      }
   }
}

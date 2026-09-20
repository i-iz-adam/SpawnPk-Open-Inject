package rs.p_ui.p_components.p_a;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.function.Consumer;

class C_p extends MouseAdapter {
   C_p(Consumer var1, Color var2) {
      this.a = var1;
      this.b = var2;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      this.a.accept(this.b);
   }
}

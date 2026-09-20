package rs.p_ui.p_components.p_a;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Objects;

class C_u extends WindowAdapter {
   C_u(C_q var1, Color var2, C_o var3, C_d var4) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      C_q.c(this.d);
      if (C_q.d(this.d) != null) {
         C_q.d(this.d).accept(C_q.e(this.d));
      }

      if (!Objects.equals(this.a, C_q.e(this.d))) {
         this.b.a(C_q.e(this.d).getRGB() + "");
      }

      C_q var2 = this.c.a();
      if (Objects.equals(var2, this.d)) {
         this.c.a(null);
      }
   }
}

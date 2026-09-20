package rs.p_s.p_b;

import java.awt.event.KeyEvent;

public class C_m extends C_l {
   public C_m(int var1, int var2) {
      super(var1, var2, true);
   }

   public C_m(KeyEvent var1) {
      this(var1.getExtendedKeyCode(), var1.getModifiersEx());

      assert this.a(var1);
   }

   @Override
   public boolean a(KeyEvent var1) {
      return this.a(var1, true);
   }
}

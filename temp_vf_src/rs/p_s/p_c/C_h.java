package rs.p_s.p_c;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public enum C_h {
   a(-1, Color.RED.getRGB()),
   b(5, Color.GREEN.getRGB()),
   c(4, Color.WHITE.getRGB()),
   d(3, Color.ORANGE.getRGB()),
   e(5, Color.YELLOW.getRGB()),
   f(42, Color.CYAN.getRGB()),
   g(2, Color.BLUE.getRGB());

   int h;
   int i;
   public static final Map<Integer, C_h> j = new HashMap<>();

   private C_h(int var3, int var4) {
      this.h = var3;
      this.i = var4;
   }

   static {
      for (C_h var3 : values()) {
         j.put(var3.h, var3);
      }
   }
}

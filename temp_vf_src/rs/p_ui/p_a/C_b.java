package rs.p_ui.p_a;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class C_b extends C_c {
   private static final String b = "";
   private int c;

   public C_b(BufferedImage var1, String var2, String var3, int var4) {
      super(var1, var2, var3);
      this.c = var4;
   }

   @Override
   public String a() {
      return this.c() == -1 ? "" : Integer.toString(this.c());
   }

   @Override
   public Color b() {
      return Color.WHITE;
   }

   @Override
   public String toString() {
      return "CounterInfoBox(count=" + this.c() + ")";
   }

   public int c() {
      return this.c;
   }

   public void a(int var1) {
      this.c = var1;
   }
}

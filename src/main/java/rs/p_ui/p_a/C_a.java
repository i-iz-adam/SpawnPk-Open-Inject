package rs.p_ui.p_a;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class C_a extends C_c {
   private int b;
   private int c;

   public C_a(BufferedImage var1, String var2, String var3, int var4, int var5) {
      super(var1, var2, var3);
      this.b = var4;
      this.c = var5;
   }

   @Override
   public String a() {
      return this.c() > 0 ? "+" + this.c() : String.valueOf(this.c());
   }

   @Override
   public Color b() {
      return this.b < 0 ? Color.RED : Color.GREEN;
   }

   @Override
   public String toString() {
      return "BoostInfoBox(offset=" + this.c() + ", skillId=" + this.d() + ")";
   }

   public int c() {
      return this.b;
   }

   public void a(int var1) {
      this.b = var1;
   }

   public int d() {
      return this.c;
   }

   public void b(int var1) {
      this.c = var1;
   }
}

package rs.p_l;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

public final class C_e {
   public final int[] a;
   public final int b;
   public final int c;
   final BufferedImage d;

   public C_e(int var1, int var2) {
      this.b = var1;
      this.c = var2;
      this.d = new BufferedImage(var1, var2, 1);
      this.a = ((DataBufferInt)this.d.getRaster().getDataBuffer()).getData();
      this.a();
   }

   public C_e(int var1, int var2, Component var3) {
      this(var1, var2);
   }

   public void a(int var1, Graphics var2, int var3) {
      var2.drawImage(this.d, var3, var1, null);
   }

   public void a() {
      C_c.a(this.b, this.c, this.a);
   }
}

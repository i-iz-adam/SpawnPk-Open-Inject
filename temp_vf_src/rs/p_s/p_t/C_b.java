package rs.p_s.p_t;

import java.awt.image.BufferedImage;

public enum C_b {
   a("Gold", 1, rs.p_A_uc.C_j.b(C_b.class, "gold.png")),
   b("Bags", 100000000, rs.p_A_uc.C_j.b(C_b.class, "bags.png"));

   private final String c;
   private final int d;
   private final BufferedImage e;

   @Override
   public String toString() {
      return this.c;
   }

   public String a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public BufferedImage c() {
      return this.e;
   }

   private C_b(String var3, int var4, BufferedImage var5) {
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }
}

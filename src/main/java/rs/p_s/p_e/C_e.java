package rs.p_s.p_e;

public enum C_e {
   a("Nearest Neighbor", 0),
   b("Bilinear", 0),
   c("Bicubic (Mitchell)", 1),
   d("Bicubic (Catmull-Rom)", 2),
   e("xBR", 3);

   private final String f;
   private final int g;

   @Override
   public String toString() {
      return this.f;
   }

   public String a() {
      return this.f;
   }

   public int b() {
      return this.g;
   }

   private C_e(String var3, int var4) {
      this.f = var3;
      this.g = var4;
   }
}

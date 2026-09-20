package rs.p_k.p_a;

public enum C_a {
   a("Disabled", 0),
   b("MSAA x2", 2),
   c("MSAA x4", 4),
   d("MSAA x8", 8),
   e("MSAA x16", 16);

   private final String f;
   private final int g;

   private C_a(String var3, int var4) {
      this.f = var3;
      this.g = var4;
   }

   @Override
   public String toString() {
      return this.f;
   }

   public int a() {
      return this.g;
   }
}

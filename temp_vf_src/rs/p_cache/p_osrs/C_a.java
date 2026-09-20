package rs.p_cache.p_osrs;

public enum C_a {
   a(1, "Model"),
   b(2, "Animation"),
   c(3, "Sounds"),
   d(4, "Map");

   private int e;
   private String f;
   private String g;

   private C_a(int var3, String var4) {
      this.e = var3;
      this.f = var4;
      this.g = rs.p_v.C_a.f() + "osrs_idx" + var3;
   }

   public int a() {
      return this.e;
   }

   public String b() {
      return this.f;
   }

   public String c() {
      return this.g;
   }
}

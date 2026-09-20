package rs.p_k;

public enum C_j {
   a,
   b,
   c,
   d;

   private static final C_j e;

   public static C_j a() {
      return e;
   }

   static {
      String var0 = System.getProperty("os.name", "generic").toLowerCase();
      if (var0.contains("mac") || var0.contains("darwin")) {
         e = b;
      } else if (var0.contains("win")) {
         e = a;
      } else if (var0.contains("nux")) {
         e = c;
      } else {
         e = d;
      }
   }
}

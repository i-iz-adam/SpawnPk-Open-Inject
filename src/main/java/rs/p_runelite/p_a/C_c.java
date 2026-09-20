package rs.p_runelite.p_a;

public enum C_c {
   a(-1),
   b(0),
   c(10),
   d(11),
   e(20),
   f(25),
   g(30),
   h(40),
   i(45);

   private final int j;

   private C_c(int var3) {
      this.j = var3;
   }

   public static C_c a(int var0) {
      for (C_c var4 : values()) {
         if (var4.j == var0) {
            return var4;
         }
      }

      return a;
   }

   public int a() {
      return this.j;
   }
}

package rs.p_runelite.p_a;

import rs.C_C_uc;

public class C_o {
   private final int a;
   private final int b;
   private final int c;

   public C_o(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   public C_o a(int var1) {
      var1 = (var1 + 1024) % 2048;
      if (var1 == 0) {
         return this;
      } else {
         int var2 = C_C_uc.hA[var1];
         int var3 = C_C_uc.hB[var1];
         return new C_o(this.a * var3 + this.c * var2 >> 16, this.b, this.c * var3 - this.a * var2 >> 16);
      }
   }
}

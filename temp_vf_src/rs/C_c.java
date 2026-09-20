package rs;

final class C_c {
   public static int a(int var0, int var1, int var2) {
      var0 &= 3;
      if (var0 == 0) {
         return var2;
      } else if (var0 == 1) {
         return var1;
      } else {
         return var0 == 2 ? 7 - var2 : 7 - var1;
      }
   }

   public static int b(int var0, int var1, int var2) {
      var1 &= 3;
      if (var1 == 0) {
         return var0;
      } else if (var1 == 1) {
         return 7 - var2;
      } else {
         return var1 == 2 ? 7 - var0 : var2;
      }
   }

   public static int a(int var0, int var1, int var2, int var3, int var4) {
      var0 &= 3;
      if (var0 == 0) {
         return var2;
      } else if (var0 == 1) {
         return var3;
      } else {
         return var0 == 2 ? 7 - var2 - (var4 - 1) : 7 - var3 - (var1 - 1);
      }
   }

   public static int b(int var0, int var1, int var2, int var3, int var4) {
      var2 &= 3;
      if (var2 == 0) {
         return var0;
      } else if (var2 == 1) {
         return 7 - var4 - (var3 - 1);
      } else {
         return var2 == 2 ? 7 - var0 - (var1 - 1) : var4;
      }
   }
}

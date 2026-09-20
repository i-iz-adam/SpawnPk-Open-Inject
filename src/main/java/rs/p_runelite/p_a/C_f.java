package rs.p_runelite.p_a;

import rs.C_Client_mc;

public class C_f {
   private final int a;
   private final int b;

   public C_f(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public boolean a() {
      return this.a >= 0 && this.a < 13312 && this.b >= 0 && this.b < 13312;
   }

   public int a(C_f var1) {
      return (int)Math.hypot((double)(this.b() - var1.b()), (double)(this.c() - var1.c()));
   }

   public static C_f a(int var0, int var1) {
      return new C_f((var0 << 7) + 64, (var1 << 7) + 64);
   }

   public static C_f a(C_p var0) {
      return C_Client_mc.dw != var0.g() ? null : b(var0.e(), var0.f());
   }

   public static C_f b(int var0, int var1) {
      if (!C_p.a(var0, var1)) {
         return null;
      } else {
         int var2 = C_Client_mc.eh;
         int var3 = C_Client_mc.ei;
         return a(var0 - var2, var1 - var3);
      }
   }

   public int b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public int d() {
      return this.a >>> 7;
   }

   public int e() {
      return this.b >>> 7;
   }
}

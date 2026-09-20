package rs.p_runelite.p_a;

import java.util.Collection;
import java.util.Collections;
import rs.C_Client_mc;

public final class C_p {
   private static final int[] a = new int[]{12894, 8755, 12895, 8756, 13150, 9011, 13151, 9012};
   private final int b;
   private final int c;
   private final int d;

   public C_p a(int var1) {
      return new C_p(this.b + var1, this.c, this.d);
   }

   public C_p b(int var1) {
      return new C_p(this.b, this.c + var1, this.d);
   }

   public C_p c(int var1) {
      return new C_p(this.b, this.c, this.d + var1);
   }

   public static boolean a(int var0, int var1) {
      int var2 = C_Client_mc.eh;
      int var3 = C_Client_mc.ei;
      int var4 = var2 + 104;
      int var5 = var3 + 104;
      return var0 >= var2 && var0 < var4 && var1 >= var3 && var1 < var5;
   }

   public static boolean a(C_Client_mc var0, int var1, int var2) {
      int var3 = var0.aR();
      int var4 = var0.aS();
      int var5 = var3 + 104;
      int var6 = var4 + 104;
      return var1 >= var3 && var1 < var5 && var2 >= var4 && var2 < var6;
   }

   public boolean a() {
      return C_Client_mc.dw == this.d && a(this.b, this.c);
   }

   public static C_p a(C_f var0) {
      return a(var0.b(), var0.c(), C_Client_mc.dw);
   }

   public static C_p a(int var0, int var1, int var2) {
      return new C_p((var0 >>> 7) + C_Client_mc.eh, (var1 >>> 7) + C_Client_mc.ei, var2);
   }

   private static C_p a(C_p var0, int var1) {
      int var2 = var0.e() & -8;
      int var3 = var0.f() & -8;
      int var4 = var0.e() & 7;
      int var5 = var0.f() & 7;
      switch (var1) {
         case 1:
            return new C_p(var2 + var5, var3 + (7 - var4), var0.g());
         case 2:
            return new C_p(var2 + (7 - var4), var3 + (7 - var5), var0.g());
         case 3:
            return new C_p(var2 + (7 - var5), var3 + var4, var0.g());
         default:
            return var0;
      }
   }

   public int a(C_p var1) {
      return var1.d != this.d ? Integer.MAX_VALUE : this.b(var1);
   }

   public int b(C_p var1) {
      return Math.max(Math.abs(this.e() - var1.e()), Math.abs(this.f() - var1.f()));
   }

   public int b() {
      return this.b >> 6 << 8 | this.c >> 6;
   }

   public static C_p a(int var0, int var1, int var2, int var3) {
      return new C_p((var0 >>> 8 << 6) + var1, ((var0 & 0xFF) << 6) + var2, var3);
   }

   public int c() {
      return d(this.b);
   }

   public int d() {
      return d(this.c);
   }

   private static int d(int var0) {
      return var0 & 63;
   }

   public static C_p a(C_p var0, boolean var1) {
      int var2 = var0.b();

      for (byte var3 = 0; var3 < a.length; var3 += 2) {
         int var4 = a[var3];
         int var5 = a[var3 + 1];
         if (var2 == (var1 ? var4 : var5)) {
            return a(var1 ? var5 : var4, var0.c(), var0.d(), var0.g());
         }
      }

      return var0;
   }

   public static Collection<C_p> c(C_p var0) {
      return Collections.singleton(var0);
   }

   public C_p(int var1, int var2, int var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   public int e() {
      return this.b;
   }

   public int f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_p)) {
         return false;
      } else {
         C_p var2 = (C_p)var1;
         if (this.e() != var2.e()) {
            return false;
         } else {
            return this.f() != var2.f() ? false : this.g() == var2.g();
         }
      }
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + this.e();
      var2 = var2 * 59 + this.f();
      return var2 * 59 + this.g();
   }

   @Override
   public String toString() {
      return "WorldPoint(x=" + this.e() + ", y=" + this.f() + ", plane=" + this.g() + ")";
   }
}

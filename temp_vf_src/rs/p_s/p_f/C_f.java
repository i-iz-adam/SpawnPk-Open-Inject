package rs.p_s.p_f;

import java.awt.Color;
import javax.annotation.Nullable;

final class C_f {
   private final int a;
   private final int b;
   private final int c;
   private final int d;
   @Nullable
   private final Color e;
   @Nullable
   private final String f;

   public C_f(int var1, int var2, int var3, int var4, @Nullable Color var5, @Nullable String var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
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

   public int d() {
      return this.d;
   }

   @Nullable
   public Color e() {
      return this.e;
   }

   @Nullable
   public String f() {
      return this.f;
   }

   @Override
   public String toString() {
      return "GroundMarkerPoint(regionId="
         + this.a()
         + ", regionX="
         + this.b()
         + ", regionY="
         + this.c()
         + ", z="
         + this.d()
         + ", color="
         + this.e()
         + ", label="
         + this.f()
         + ")";
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_f)) {
         return false;
      } else {
         C_f var2 = (C_f)var1;
         if (this.a() != var2.a()) {
            return false;
         } else if (this.b() != var2.b()) {
            return false;
         } else {
            return this.c() != var2.c() ? false : this.d() == var2.d();
         }
      }
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + this.a();
      var2 = var2 * 59 + this.b();
      var2 = var2 * 59 + this.c();
      return var2 * 59 + this.d();
   }
}

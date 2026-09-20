package rs.p_s.p_f;

import java.awt.Color;
import javax.annotation.Nullable;
import rs.p_runelite.p_a.C_p;

public final class C_a {
   private final C_p a;
   @Nullable
   private final Color b;
   @Nullable
   private final String c;

   public C_a(C_p var1, @Nullable Color var2, @Nullable String var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public C_p a() {
      return this.a;
   }

   @Nullable
   public Color b() {
      return this.b;
   }

   @Nullable
   public String c() {
      return this.c;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_a)) {
         return false;
      } else {
         C_a var2 = (C_a)var1;
         C_p var3 = this.a();
         C_p var4 = var2.a();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            Color var5 = this.b();
            Color var6 = var2.b();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               String var7 = this.c();
               String var8 = var2.c();
               return var7 == null ? var8 == null : var7.equals(var8);
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      C_p var3 = this.a();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      Color var4 = this.b();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      String var5 = this.c();
      return var2 * 59 + (var5 == null ? 43 : var5.hashCode());
   }

   @Override
   public String toString() {
      return "ColorTileMarker(worldPoint=" + this.a() + ", color=" + this.b() + ", label=" + this.c() + ")";
   }
}

package rs.p_l.p_f;

import java.util.function.Consumer;
import javax.annotation.Nullable;

public class C_f {
   private final int b;
   private final String c;
   private final String d;
   @Nullable
   Consumer<rs.p_j.p_b.C_b> a;

   public C_f(int var1, String var2, String var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
   }

   @Override
   public String toString() {
      return "OverlayMenuEntry(menuAction=" + this.a() + ", option=" + this.b() + ", target=" + this.c() + ")";
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_f)) {
         return false;
      } else {
         C_f var2 = (C_f)var1;
         if (!var2.a(this)) {
            return false;
         } else if (this.a() != var2.a()) {
            return false;
         } else {
            String var3 = this.b();
            String var4 = var2.b();
            if (var3 == null ? var4 == null : var3.equals(var4)) {
               String var5 = this.c();
               String var6 = var2.c();
               return var5 == null ? var6 == null : var5.equals(var6);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean a(Object var1) {
      return var1 instanceof C_f;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + this.a();
      String var3 = this.b();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      String var4 = this.c();
      return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
   }

   public int a() {
      return this.b;
   }

   public String b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }
}

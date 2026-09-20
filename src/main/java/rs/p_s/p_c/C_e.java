package rs.p_s.p_c;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.inject.Inject;

public class C_e extends rs.p_l.p_f.p_b.C_d {
   private final C_a h;
   private final Queue<C_e.a> i = new ArrayDeque<>();

   @Inject
   public C_e(C_a var1) {
      this.h = var1;
   }

   @Override
   public void a() {
      if (this.h.f()) {
         rs.p_n.C_e var1 = rs.p_n.C_e.H[this.g];
         C_h var2 = C_h.j.get(var1.aI);
         if (var1.aH > 0) {
            var2 = C_h.a;
         }

         if (var2 != null) {
            if (this.h.j().contains(var2)) {
               String var3 = "[" + var2.name() + "]";
               String var4 = this.g + (this.h.g() ? var3 : "");
               if (this.h.h() && var1.al != null) {
                  this.i.add(new C_e.a(var4, this.e, this.f, var2));
               }

               if (this.h.i() && var1.al == null) {
                  this.i.add(new C_e.a(var4, this.e, this.f, var2));
               }
            }
         }
      }
   }

   public Queue<C_e.a> k() {
      return this.i;
   }

   static final class a {
      private final String a;
      private final int b;
      private final int c;
      private final C_h d;

      public a(String var1, int var2, int var3, C_h var4) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
      }

      public String a() {
         return this.a;
      }

      public int b() {
         return this.b;
      }

      public int c() {
         return this.c;
      }

      public C_h d() {
         return this.d;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof C_e.a)) {
            return false;
         } else {
            C_e.a var2 = (C_e.a)var1;
            if (this.b() != var2.b()) {
               return false;
            } else if (this.c() != var2.c()) {
               return false;
            } else {
               String var3 = this.a();
               String var4 = var2.a();
               if (var3 == null ? var4 == null : var3.equals(var4)) {
                  C_h var5 = this.d();
                  C_h var6 = var2.d();
                  return var5 == null ? var6 == null : var5.equals(var6);
               } else {
                  return false;
               }
            }
         }
      }

      @Override
      public int hashCode() {
         byte var1 = 59;
         int var2 = 1;
         var2 = var2 * 59 + this.b();
         var2 = var2 * 59 + this.c();
         String var3 = this.a();
         var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
         C_h var4 = this.d();
         return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      }

      @Override
      public String toString() {
         return "DevToolsWidgetOverlay.WidgetDisplay(text=" + this.a() + ", x=" + this.b() + ", y=" + this.c() + ", type=" + this.d() + ")";
      }
   }
}

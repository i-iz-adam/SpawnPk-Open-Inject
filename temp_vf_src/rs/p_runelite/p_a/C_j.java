package rs.p_runelite.p_a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class C_j {
   private static final Logger b = LoggerFactory.getLogger(C_j.class);

   private C_j() {
   }

   @Nullable
   public static C_l<C_m> a(List<C_j.c> var0) {
      if (var0.size() == 0) {
         return null;
      } else {
         boolean var1 = b.isTraceEnabled();
         var0.sort(Comparator.comparingInt(C_j.c::a));
         ArrayList var2 = new ArrayList(var0);
         var2.sort(Comparator.comparingInt(C_j.c::c));
         C_j.e var3 = new C_j.e();
         C_l var4 = new C_l(new ArrayList());
         C_j.a var5 = new C_j.a(var4);
         int var6 = 0;
         int var7 = 0;

         while (true) {
            C_j.c var8 = null;
            C_j.c var9 = null;
            if (var6 < var0.size()) {
               var8 = (C_j.c)var0.get(var6);
            }

            if (var7 < var2.size()) {
               var9 = (C_j.c)var2.get(var7);
            }

            if (var8 == null && var9 == null) {
               assert var3.a();

               return var4;
            }

            boolean var11 = var8 == null || var9 != null && var9.c < var8.a;
            C_j.c var10;
            if (var11) {
               var5.c = -1;
               var5.b = var9.c;
               var7++;
               var10 = var9;
            } else {
               var5.c = 1;
               var5.b = var8.a;
               var6++;
               var10 = var8;
            }

            if (var1) {
               b.trace("{}{}", var11 ? "-" : "+", var10);
            }

            int var12 = var10.b;
            int var13 = var10.d;
            C_j.d var14 = var3.a(var12);
            if (var14 == null) {
               var14 = var3.a(null, var12);
            }

            if (var14.e != var12) {
               var14 = var3.a(var14, var12);
               var14.f = var14.b.f;
            }

            do {
               if (var14.a == null || var14.a.e > var13) {
                  var3.a(var14, var13);
               }

               var5.a(var14);
               var14 = var14.a;
            } while (var14.e != var13);

            var5.b(var14);
            if (var1) {
               for (C_j.d var15 = var3.a; var15 != null; var15 = var15.a) {
                  String var16 = "";
                  if (var15.c != null) {
                     var16 = (var15.d ? ">" : "[") + System.identityHashCode(var15.c) + (var15.d ? "]" : "<");
                  }

                  b.trace("{} = {} {}", new Object[]{var15.e, var15.f, var16});
               }

               b.trace("");
            }
         }
      }
   }

   private static class a {
      final C_l<C_m> a;
      int b;
      int c;
      C_j.d d;

      void a(C_j.d var1) {
         int var2 = var1.f;
         var1.f = var1.f + this.c;
         if (var2 <= 0 ^ var1.f <= 0) {
            if (this.d == null) {
               this.d = var1;
            }
         } else {
            this.b(var1);
         }
      }

      void b(C_j.d var1) {
         if (this.d != null) {
            if (this.d.c != null && var1.c != null) {
               this.c(this.d);
               this.c(var1);
               if (this.d.c == var1.c) {
                  C_j.b var2 = this.d.c;
                  this.d.c = null;
                  var1.c = null;
                  var2.a = null;
                  var2.b = null;
                  this.a.a().add(var2);
               } else {
                  C_j.b var3;
                  C_j.b var4;
                  if (!var1.d) {
                     var4 = var1.c;
                     var3 = this.d.c;
                  } else {
                     var4 = this.d.c;
                     var3 = var1.c;
                  }

                  C_j.b.trace("Joining {} onto {}", System.identityHashCode(var3), System.identityHashCode(var4));
                  if (this.d.d == var1.d) {
                     C_j.b.trace("reverse");
                     if (this.d.d) {
                        var4.a();
                     } else {
                        var3.a();
                     }
                  }

                  C_j.b.trace("{} {}", this.d.e, var1.e);
                  var3.a(var4);
                  this.d.c = null;
                  var1.c = null;
                  var4.b.c = null;
                  var3.a.c = null;
                  var4.b = var3.b;
                  var4.a.c = var4;
                  var4.b.c = var4;
               }
            } else if (this.d.c == null && var1.c == null) {
               this.d.c = new C_j.b(null);
               this.d.c.b = this.d;
               this.d.d = false;
               var1.c = this.d.c;
               this.d.c.a = var1;
               var1.d = true;
               this.c(this.d);
               this.c(var1);
            } else if (this.d.c == null) {
               this.c(var1);
               this.a(this.d, var1);
               this.c(this.d);
            } else {
               this.c(this.d);
               this.a(var1, this.d);
               this.c(var1);
            }

            this.d = null;
         }
      }

      private void a(C_j.d var1, C_j.d var2) {
         var1.c = var2.c;
         var1.d = var2.d;
         var2.c = null;
         if (var1.d) {
            assert var1.c.a == var2;

            var1.c.a = var1;
         } else {
            assert var1.c.b == var2;

            var1.c.b = var1;
         }
      }

      private void c(C_j.d var1) {
         if (var1.d) {
            var1.c.a(this.b, var1.e);

            assert var1.c.a == var1;
         } else {
            var1.c.b(this.b, var1.e);

            assert var1.c.b == var1;
         }
      }

      public a(C_l<C_m> var1) {
         this.a = var1;
      }
   }

   private static class b extends C_m {
      C_j.d a;
      C_j.d b;

      private b() {
      }

      @Override
      public void a() {
         super.a();

         assert !this.b.d;

         assert this.a.d;

         C_j.d var1 = this.a;
         this.a = this.b;
         this.b = var1;
         this.b.d = false;
         this.a.d = true;
      }
   }

   public static class c {
      private final int a;
      private final int b;
      private final int c;
      private final int d;

      public c(int var1, int var2, int var3, int var4) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
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

      @Override
      public String toString() {
         return "RectangleUnion.Rectangle(x1=" + this.a() + ", y1=" + this.b() + ", x2=" + this.c() + ", y2=" + this.d() + ")";
      }
   }

   private static class d {
      C_j.d a;
      C_j.d b;
      C_j.b c;
      boolean d;
      int e;
      int f;

      public d() {
      }
   }

   private static class e {
      C_j.d a;

      C_j.d a(int var1) {
         C_j.d var2 = this.a;
         if (var2 != null && var2.e <= var1) {
            while (var2.e != var1) {
               C_j.d var3 = var2.a;
               if (var3 == null || var3.e > var1) {
                  return var2;
               }

               var2 = var3;
            }

            return var2;
         } else {
            return null;
         }
      }

      C_j.d a(C_j.d var1, int var2) {
         C_j.d var3 = new C_j.d();
         var3.e = var2;
         if (var1 != null) {
            if (var1.a != null) {
               var3.a = var1.a;
               var3.a.b = var3;
            }

            var3.f = var1.f;
            var1.a = var3;
            var3.b = var1;
         } else {
            if (this.a != null) {
               var3.a = this.a;
               this.a.b = var3;
            }

            this.a = var3;
         }

         return var3;
      }

      boolean a() {
         for (C_j.d var1 = this.a; var1 != null; var1 = var1.a) {
            if (var1.f != 0 || var1.c != null) {
               return false;
            }
         }

         return true;
      }

      public e() {
      }
   }
}

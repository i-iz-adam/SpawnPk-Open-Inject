package rs.p_l.p_f;

import java.awt.Rectangle;
import java.util.Arrays;
import java.util.Collection;

final class C_c {
   private final Rectangle a;
   private final Rectangle b;
   private final Rectangle c;
   private final Rectangle d;
   private final Rectangle e;
   private final Rectangle f;
   private final Rectangle g;

   C_c(C_c var1) {
      this.a = new Rectangle(var1.a);
      this.b = new Rectangle(var1.b);
      this.c = new Rectangle(var1.c);
      this.d = new Rectangle(var1.d);
      this.e = new Rectangle(var1.e);
      this.f = new Rectangle(var1.f);
      this.g = new Rectangle(var1.g);
   }

   C_c a(int var1, int var2) {
      C_c var3 = new C_c(this);
      var3.d().translate(var1, 0);
      var3.c().translate(var1 / 2, 0);
      var3.e().translate(0, var2);
      var3.f().translate(var1, var2);
      var3.g().translate(var1, var2);
      var3.h().translate(var1, 0);
      return var3;
   }

   Rectangle a(C_l var1) {
      switch (var1) {
         case c:
            return this.a;
         case d:
            return this.b;
         case e:
            return this.c;
         case f:
            return this.d;
         case g:
            return this.e;
         case h:
            return this.f;
         case i:
            return this.g;
         default:
            throw new IllegalArgumentException();
      }
   }

   C_l a(Rectangle var1) {
      if (var1 == this.a) {
         return C_l.c;
      } else if (var1 == this.b) {
         return C_l.d;
      } else if (var1 == this.c) {
         return C_l.e;
      } else if (var1 == this.d) {
         return C_l.f;
      } else if (var1 == this.e) {
         return C_l.g;
      } else if (var1 == this.f) {
         return C_l.h;
      } else if (var1 == this.g) {
         return C_l.i;
      } else {
         throw new IllegalArgumentException();
      }
   }

   Collection<Rectangle> a() {
      return Arrays.asList(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public Rectangle b() {
      return this.a;
   }

   public Rectangle c() {
      return this.b;
   }

   public Rectangle d() {
      return this.c;
   }

   public Rectangle e() {
      return this.d;
   }

   public Rectangle f() {
      return this.e;
   }

   public Rectangle g() {
      return this.f;
   }

   public Rectangle h() {
      return this.g;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_c)) {
         return false;
      } else {
         C_c var2 = (C_c)var1;
         Rectangle var3 = this.b();
         Rectangle var4 = var2.b();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            Rectangle var5 = this.c();
            Rectangle var6 = var2.c();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               Rectangle var7 = this.d();
               Rectangle var8 = var2.d();
               if (var7 == null ? var8 == null : var7.equals(var8)) {
                  Rectangle var9 = this.e();
                  Rectangle var10 = var2.e();
                  if (var9 == null ? var10 == null : var9.equals(var10)) {
                     Rectangle var11 = this.f();
                     Rectangle var12 = var2.f();
                     if (var11 == null ? var12 == null : var11.equals(var12)) {
                        Rectangle var13 = this.g();
                        Rectangle var14 = var2.g();
                        if (var13 == null ? var14 == null : var13.equals(var14)) {
                           Rectangle var15 = this.h();
                           Rectangle var16 = var2.h();
                           return var15 == null ? var16 == null : var15.equals(var16);
                        } else {
                           return false;
                        }
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
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
      Rectangle var3 = this.b();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      Rectangle var4 = this.c();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      Rectangle var5 = this.d();
      var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
      Rectangle var6 = this.e();
      var2 = var2 * 59 + (var6 == null ? 43 : var6.hashCode());
      Rectangle var7 = this.f();
      var2 = var2 * 59 + (var7 == null ? 43 : var7.hashCode());
      Rectangle var8 = this.g();
      var2 = var2 * 59 + (var8 == null ? 43 : var8.hashCode());
      Rectangle var9 = this.h();
      return var2 * 59 + (var9 == null ? 43 : var9.hashCode());
   }

   @Override
   public String toString() {
      return "OverlayBounds(topLeft="
         + this.b()
         + ", topCenter="
         + this.c()
         + ", topRight="
         + this.d()
         + ", bottomLeft="
         + this.e()
         + ", bottomRight="
         + this.f()
         + ", aboveChatboxRight="
         + this.g()
         + ", canvasTopRight="
         + this.h()
         + ")";
   }

   public C_c(Rectangle var1, Rectangle var2, Rectangle var3, Rectangle var4, Rectangle var5, Rectangle var6, Rectangle var7) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
   }
}

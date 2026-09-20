package rs.p_e;

import java.lang.reflect.Type;

public final class C_h implements C_j {
   private final C_g a;
   private final Type b;
   private final C_o c;
   private final C_a d;
   private final C_q e;

   @Override
   public String a() {
      return this.a.b();
   }

   @Override
   public String b() {
      return this.a.c();
   }

   @Override
   public int c() {
      return this.a.a();
   }

   public C_h(C_g var1, Type var2, C_o var3, C_a var4, C_q var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   public C_g d() {
      return this.a;
   }

   public Type e() {
      return this.b;
   }

   public C_o f() {
      return this.c;
   }

   public C_a g() {
      return this.d;
   }

   public C_q h() {
      return this.e;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_h)) {
         return false;
      } else {
         C_h var2 = (C_h)var1;
         C_g var3 = this.d();
         C_g var4 = var2.d();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            Type var5 = this.e();
            Type var6 = var2.e();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               C_o var7 = this.f();
               C_o var8 = var2.f();
               if (var7 == null ? var8 == null : var7.equals(var8)) {
                  C_a var9 = this.g();
                  C_a var10 = var2.g();
                  if (var9 == null ? var10 == null : var9.equals(var10)) {
                     C_q var11 = this.h();
                     C_q var12 = var2.h();
                     return var11 == null ? var12 == null : var11.equals(var12);
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
      C_g var3 = this.d();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      Type var4 = this.e();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      C_o var5 = this.f();
      var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
      C_a var6 = this.g();
      var2 = var2 * 59 + (var6 == null ? 43 : var6.hashCode());
      C_q var7 = this.h();
      return var2 * 59 + (var7 == null ? 43 : var7.hashCode());
   }

   @Override
   public String toString() {
      return "ConfigItemDescriptor(item=" + this.d() + ", type=" + this.e() + ", range=" + this.f() + ", alpha=" + this.g() + ", units=" + this.h() + ")";
   }
}

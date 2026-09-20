package rs.p_e;

public final class C_m implements C_j {
   private final String a;
   private final C_l b;

   @Override
   public String a() {
      return this.a;
   }

   @Override
   public String b() {
      return this.b.a();
   }

   @Override
   public int c() {
      return this.b.c();
   }

   public C_m(String var1, C_l var2) {
      this.a = var1;
      this.b = var2;
   }

   public String d() {
      return this.a;
   }

   public C_l e() {
      return this.b;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_m)) {
         return false;
      } else {
         C_m var2 = (C_m)var1;
         String var3 = this.d();
         String var4 = var2.d();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            C_l var5 = this.e();
            C_l var6 = var2.e();
            return var5 == null ? var6 == null : var5.equals(var6);
         } else {
            return false;
         }
      }
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      String var3 = this.d();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      C_l var4 = this.e();
      return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
   }

   @Override
   public String toString() {
      return "ConfigSectionDescriptor(key=" + this.d() + ", section=" + this.e() + ")";
   }
}

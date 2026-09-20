package rs.p_n.p_a.p_a;

public class C_d {
   String a;
   String b;

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_d)) {
         return false;
      } else {
         C_d var2 = (C_d)var1;
         if (!var2.a(this)) {
            return false;
         } else {
            String var3 = this.a();
            String var4 = var2.a();
            if (var3 == null ? var4 == null : var3.equals(var4)) {
               String var5 = this.b();
               String var6 = var2.b();
               return var5 == null ? var6 == null : var5.equals(var6);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean a(Object var1) {
      return var1 instanceof C_d;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      String var3 = this.a();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      String var4 = this.b();
      return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
   }

   @Override
   public String toString() {
      return "DropDownOption(text=" + this.a() + ", tooltip=" + this.b() + ")";
   }

   public String a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public void a(String var1) {
      this.a = var1;
   }

   public void b(String var1) {
      this.b = var1;
   }

   public C_d(String var1, String var2) {
      this.a = var1;
      this.b = var2;
   }
}

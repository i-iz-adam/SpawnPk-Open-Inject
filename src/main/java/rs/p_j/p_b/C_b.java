package rs.p_j.p_b;

public class C_b {
   private String a;
   private rs.p_h.C_b b;

   public String a() {
      return this.a;
   }

   public rs.p_h.C_b b() {
      return this.b;
   }

   public void a(String var1) {
      this.a = var1;
   }

   public void a(rs.p_h.C_b var1) {
      this.b = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_b)) {
         return false;
      } else {
         C_b var2 = (C_b)var1;
         if (!var2.a(this)) {
            return false;
         } else {
            String var3 = this.a();
            String var4 = var2.a();
            if (var3 == null ? var4 == null : var3.equals(var4)) {
               rs.p_h.C_b var5 = this.b();
               rs.p_h.C_b var6 = var2.b();
               return var5 == null ? var6 == null : var5.equals(var6);
            } else {
               return false;
            }
         }
      }
   }

   protected boolean a(Object var1) {
      return var1 instanceof C_b;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      String var3 = this.a();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      rs.p_h.C_b var4 = this.b();
      return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
   }

   @Override
   public String toString() {
      return "CustomMenuEntry(text=" + this.a() + ", event=" + this.b() + ")";
   }
}

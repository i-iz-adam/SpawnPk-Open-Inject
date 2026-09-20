package rs.p_l.p_f.p_a.p_e;

public class C_b extends rs.p_q.p_a.p_a.C_a {
   private static C_a d;

   @Override
   public void a() {
      int var1 = this.e();
      if (var1 == 0) {
         d.b();
      } else if (var1 == 1) {
         int var7 = this.c();
         int var3 = this.c();
         int var4 = this.c();
         int var5 = this.c();
         int var6 = this.c();
         d.a(var7, var3, var4, var5, var6);
      } else if (var1 == 2) {
         int var2 = this.c();
         d.a(var2);
      }
   }

   public static C_a b() {
      return d;
   }

   public static void a(C_a var0) {
      d = var0;
   }
}

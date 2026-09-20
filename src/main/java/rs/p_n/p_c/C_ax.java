package rs.p_n.p_c;

class C_ax extends rs.p_q.p_a.p_a.C_a {
   @Override
   public void a() {
      int var1 = this.e();
      if (var1 == 0) {
         C_ay.k = 0;
         C_ay.j = 0;
      }

      if (var1 == 1) {
         int var2 = this.e();
         int var3 = this.c();
         var3 = Math.min(var3, 457);
         var3 = Math.max(var3, 0);
         switch (var2) {
            case 0:
               C_ay.j = var3;
               break;
            case 1:
               C_ay.k = var3;
         }
      }

      if (var1 == 2) {
         int var5 = this.e();
         int var8 = this.e() - 1;
         if (var8 == -1) {
            C_ay.l[var5] = null;
         } else {
            C_ay.a var4 = C_ay.a.values()[var8];
            C_ay.l[var5] = var4;
         }
      }
   }
}

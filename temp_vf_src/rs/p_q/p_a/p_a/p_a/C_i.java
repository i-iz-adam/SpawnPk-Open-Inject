package rs.p_q.p_a.p_a.p_a;

import java.util.HashSet;

public class C_i extends rs.p_q.p_a.p_a.C_a {
   public static HashSet<Integer> d = new HashSet<>();

   @Override
   public void a() {
      int var1 = this.e();
      if (var1 == 0) {
         boolean var2 = this.e() == 0;
         int var3 = this.g();
         if (var2) {
            d.add(var3);
         } else {
            d.remove(var3);
         }
      }

      if (var1 == 1) {
         int var5 = this.g();
         byte var7 = (byte)this.e();
         if (var7 <= 0) {
            rs.p_d.C_d.c(var5).P = 0;
            rs.p_d.C_d.c(var5).Q = -1;
            rs.p_d.C_d.c(var5).R = -1;
         } else {
            rs.p_d.C_d.c(var5).P = var7;
         }
      }

      if (var1 == 2) {
         int var6 = this.g();
         int var8 = this.g();
         int var4 = this.g();
         rs.p_d.C_d.c(var6).P = -1;
         rs.p_d.C_d.c(var6).Q = var8;
         rs.p_d.C_d.c(var6).R = var4;
      }
   }
}

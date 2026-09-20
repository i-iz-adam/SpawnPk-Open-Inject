package rs.p_q.p_a.p_a.p_a;

import java.util.ArrayList;
import rs.p_d.C_s;

public class C_k extends rs.p_q.p_a.p_a.C_a {
   @Override
   public void a() {
      int var1 = this.e();
      if (var1 == 0) {
         int var2 = this.c();
         int var3 = this.c();
         int var4 = this.e();
         int var5 = this.e();
         String var6 = var2 + "," + var3 + "," + var4;
         C_s.a.remove(var6);
         this.c.a(var2, var3, -1, 0, 10, var4);
      }

      if (var1 == 1) {
         C_s.a var7 = new C_s.a();
         var7.a = this.g();
         var7.b = this.c();
         var7.c = this.c();
         var7.d = this.e();
         var7.f = this.e();
         var7.e = this.e();
         String var9 = var7.b + "," + var7.c + "," + var7.d;
         C_s.a.put(var9, var7);
         this.c.a(var7.b, var7.c, var7.a, var7.e, var7.f, var7.d);
      }

      if (var1 == 2) {
         int var8 = this.g();
         ArrayList var10 = new ArrayList();

         for (String var13 : C_s.a.keySet()) {
            if (C_s.a.get(var13).a == var8) {
               var10.add(var13);
               this.c.a(C_s.a.get(var13).b, C_s.a.get(var13).c, -1, 0, 10, C_s.a.get(var13).d);
            }
         }

         for (String var14 : var10) {
            C_s.a.remove(var14);
         }
      }
   }
}

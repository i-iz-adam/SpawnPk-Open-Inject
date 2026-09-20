package rs.p_n.p_c.p_c;

import rs.C_Client_mc;

public class C_e extends rs.p_q.p_a.p_a.C_a {
   private static final int d = 0;
   private static final int e = 1;
   private static final int f = 2;
   private static final int g = 3;
   private static final int h = 4;
   private static final int i = 5;
   private static final int j = 6;
   private static final int k = 7;

   @Override
   public void a() {
      C_b var1 = C_a.h();
      C_c var2 = C_a.i();
      int var3 = this.e();
      switch (var3) {
         case 0:
            var1.a();
            break;
         case 1:
            int var4 = this.e();
            String var5 = this.h();
            if (var4 >= 0 && var4 < C_b.a.values().length) {
               var1.a(C_b.a.values()[var4], var5);
            }
            break;
         case 2:
            int var6 = this.e();
            int var7 = this.e();
            if (var7 >= 0 && var7 < C_b.a.values().length) {
               var1.a(var6, C_b.a.values()[var7]);
            }
            break;
         case 3:
            if (this.e() == 1) {
               var2.c();
            } else {
               var2.b();
            }
            break;
         case 4:
            var2.a(C_c.a.values()[this.e()]);
            break;
         case 5:
            var1.b();
            break;
         case 6:
            int var8 = 0;
            int var9 = 0;
            if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
               var8 = C_Client_mc.ai / 2 - 356;
               var9 = C_Client_mc.ah / 2 - 230;
            }

            rs.p_l.p_f.C_e.d().g().b(20, 331 + var8 + 4, 291 + var9 + 10, 16764195);
            rs.p_l.p_f.C_e.d().g().b(10, 331 + var8 + 4, 291 + var9 + 10, 65315);
            break;
         case 7:
            var1.c();
            int var10 = this.e();
            if (var10 != -1) {
               var1.a(var10, true);
            }
      }
   }
}

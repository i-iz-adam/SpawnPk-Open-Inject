package rs.p_l.p_c;

import rs.C_Client_mc;
import rs.p_d.C_k;
import rs.p_l.C_F_uc;
import rs.p_n.p_c.C_j;

public class C_a extends C_d {
   private C_F_uc c;
   private C_c[] d = new C_c[3];
   private final int[][][] e = new int[][][]{{{172, 116}, {328, 116}}, {{114, 179}, {389, 179}}, {{172, 242}, {328, 242}}};

   public C_a(C_Client_mc var1) {
      super(var1);
   }

   @Override
   public void a() {
      if (C_Client_mc.cH == C_j.c) {
         if (this.c == null) {
            this.c = C_k.a(6643, 0, 0, 32);
         }

         for (int var1 = 0; var1 < this.d.length; var1++) {
            C_c var2 = this.d[var1];
            if (var2 != null) {
               if (var2.a() == null) {
                  var2.a(C_k.a(var2.b(), 0, 0, 32));
               }

               if (var2.a() != null) {
                  this.a(var2.a(), var2.d() == 1 ? 0 : var2.d(), this.e[var1][0][0], this.e[var1][0][1]);
               }

               this.a(this.c, var2.c(), this.e[var1][1][0], this.e[var1][1][1]);
            }
         }
      }
   }

   @Override
   public boolean b() {
      return false;
   }

   public void a(int var1, int var2, int var3, int var4) {
      this.d[var1] = new C_c(var2, var4, var3);
   }

   private void a(C_F_uc var1, int var2, int var3, int var4) {
      int var5 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 0 : C_Client_mc.ai / 2 - 356;
      int var6 = rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 0 : C_Client_mc.ah / 2 - 230;
      int var7 = 9;
      int var8 = 0;
      var7 += var6;
      var8 += var5;
      if (var1 != null) {
         var1.f(var3 + var5, var4 + var6);
         if (var2 >= 1) {
            C_Client_mc.gh.b(16776960, C_Client_mc.g(var2), var4 + var7, var3 + var8);
         } else if (var2 >= 100000) {
            C_Client_mc.gh.b(16777215, C_Client_mc.g(var2), var4 + var7, var3 + var8);
         } else if (var2 >= 10000000) {
            C_Client_mc.gh.b(65408, C_Client_mc.g(var2), var4 + var7, var3 + var8);
         }
      }
   }
}

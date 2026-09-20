package rs.p_n.p_c;

import rs.C_Client_mc;

public class C_ay extends rs.p_l.p_f.p_b.C_d {
   public static final int h = 457;
   public static final int i = 15;
   public static int j = 0;
   public static int k = 0;
   private long m = 0L;
   private boolean n = false;
   private int o = 0;
   private int p = 0;
   private int q = 0;
   private int r = 0;
   public static C_ay.a[] l = new C_ay.a[]{C_ay.a.a, null, null};

   @Override
   public void a() {
      if (System.currentTimeMillis() - this.m > 25L) {
         this.n = true;
         this.m = System.currentTimeMillis();
      } else {
         this.n = false;
      }

      if (j > 0) {
         this.b(this.e, 16774912, j);
      }

      if (k - j > 0) {
         this.b(this.e + j, 9109758, k - j);
      }

      rs.p_n.C_e var1 = rs.p_n.C_e.H['\ueb59'];
      if (C_Client_mc.br == 60249) {
         if (this.n) {
            this.b(var1.bB + 5, var1.bC + 5, var1.P - 5, var1.aR - 5, 1, 16774912, 16774912);
         }
      } else {
         this.o = 1;
      }

      rs.p_n.C_e var2 = rs.p_n.C_e.H['\ueb5b'];
      if (this.n) {
         for (int var3 = 0; var3 < l.length; var3++) {
            C_ay.a var4 = l[var3];
            if (var4 != null) {
               short var5 = 111;
               if (var3 == 1) {
                  var5 = 210;
               }

               if (var3 == 2) {
                  var5 = 300;
               }

               this.b(this.e + 335, var5 + (this.f - 375), var4.c, var4.d, var4.e, var4.f, var4.g);
            }
         }
      }
   }

   private void b(int var1, int var2, int var3) {
      rs.p_l.C_c.d(var1, this.f + 1, var3, 13, var2, 125);
      if (this.n) {
         this.b(var1, this.f, var3, 15, 3, var2, var2);
      }
   }

   private void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var5 > 1 || C_Client_mc.d(3) != 0) {
         int var8 = Math.min(var5 - 1, 4);
         var8 = Math.max(var8, 1);

         for (int var9 = 0; var9 < var8; var9++) {
            int var10 = C_Client_mc.c(var1, var1 + var3);
            int var11 = C_Client_mc.c(var2, var2 + var4);
            int var12 = var6;
            if (C_Client_mc.d(6) == 0) {
               var12 = var7;
            }

            rs.p_l.p_f.p_a.p_f.C_a var13 = this.c(var10, var11, var12);
            if (var5 < 3) {
               var13.b(-0.075);
            } else {
               var13.b(var9 % 2 == 0 ? -0.075 : 0.075);
            }

            rs.p_l.p_f.C_e.d().g().a(var13);
         }
      }
   }

   private rs.p_l.p_f.p_a.p_f.C_a c(int var1, int var2, int var3) {
      rs.p_l.p_f.p_a.p_f.C_a var4 = new rs.p_l.p_f.p_a.p_f.C_a(var1, var2, var3);
      var4.a(rs.p_l.p_f.p_a.p_f.C_b.a);
      var4.a((double)(1 + C_Client_mc.d(25)));
      var4.b(3, 3);
      var4.e(1);
      var4.b(250L + 100L * (long)C_Client_mc.d(3));
      return var4;
   }

   public static enum a {
      a(311, 44, 1, 16774912, 16774912),
      b(311, 44, 2, 16711935, 9765119);

      final int c;
      final int d;
      final int e;
      final int f;
      final int g;

      private a(int var3, int var4, int var5, int var6, int var7) {
         this.c = var3;
         this.d = var4;
         this.e = var5;
         this.f = var6;
         this.g = var7;
      }
   }
}

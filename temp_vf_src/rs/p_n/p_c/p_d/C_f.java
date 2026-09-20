package rs.p_n.p_c.p_d;

import rs.C_Client_mc;
import rs.p_l.C_F_uc;

public class C_f extends rs.p_l.p_f.p_b.C_d {
   private C_F_uc h;
   private int i = 0;
   private String j = "0/1";
   private int k = 0;
   private long l = 0L;

   @Override
   public void a() {
      if (this.h == null) {
         this.h = new C_F_uc("raids/affbar2");
      }

      if (this.i == 0) {
         C_Client_mc.gl.b(this.j, this.e - 42, this.f + this.h.o / 2 - 20, 16777215, 0);
      } else {
         if (this.i < 5) {
            this.k = 2;
         }

         this.h.r = (int)((double)this.h.n * ((double)this.i / 5.0));
         this.h.a(this.e, this.f, this.h.r, this.h.o);
         if (System.currentTimeMillis() - this.l > 25L) {
            if (this.k() && --this.k >= 0) {
               for (int var1 = 0; var1 <= 4; var1++) {
                  int var2 = var1 * 24;
                  rs.p_l.p_f.C_e.d().g().b(3, this.e + var2, this.f + this.h.o / 2, 16724735);
               }
            }

            this.l();
            this.l = System.currentTimeMillis();
         }

         C_Client_mc.gl.b(this.j, this.e - 42, this.f + this.h.o / 2 - 20, 16777215, 0);
      }
   }

   public boolean k() {
      return this.i >= 5;
   }

   public void a(int var1) {
      this.i = var1;
      switch (this.i) {
         case 0:
            this.j = "@whi@" + this.i + "/5";
            break;
         case 1:
            this.j = "@yel@" + this.i + "/5";
            break;
         case 2:
            this.j = "@or2@" + this.i + "/5";
            break;
         case 3:
            this.j = "@or3@" + this.i + "/5";
            break;
         case 4:
            this.j = "@red@" + this.i + "/5";
            break;
         case 5:
            this.j = "<col=FF00FF><shad=pu2>" + this.i + "/5";
      }
   }

   private void l() {
      if (this.i > 1 || C_Client_mc.d(3) != 0) {
         int var1 = Math.min(this.i - 1, 4);
         var1 = Math.max(var1, 1);

         for (int var2 = 0; var2 < var1; var2++) {
            int var3 = C_Client_mc.c(this.e, this.e + this.h.r);
            int var4 = C_Client_mc.c(this.f, this.f + this.h.o);
            int var5 = 16724509;
            int var6 = this.k() ? 3 : 7;
            if (this.i == 4) {
               var6 = 5;
            }

            if (this.i >= 3 && C_Client_mc.d(var6) == 0) {
               var5 = 16724735;
            }

            rs.p_l.p_f.p_a.p_f.C_a var7 = this.b(var3, var4, var5);
            if (this.i < 3) {
               var7.b(-0.075);
            } else {
               var7.b(var2 % 2 == 0 ? -0.075 : 0.075);
            }

            rs.p_l.p_f.C_e.d().g().a(var7);
         }
      }
   }

   private rs.p_l.p_f.p_a.p_f.C_a b(int var1, int var2, int var3) {
      rs.p_l.p_f.p_a.p_f.C_a var4 = new rs.p_l.p_f.p_a.p_f.C_a(var1, var2, var3);
      var4.a(rs.p_l.p_f.p_a.p_f.C_b.a);
      var4.a((double)(1 + C_Client_mc.d(25)));
      var4.b(3, 3);
      var4.e(1);
      var4.b(250L + 100L * (long)C_Client_mc.d(3));
      return var4;
   }
}

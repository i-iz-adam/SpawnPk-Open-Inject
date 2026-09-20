package rs.p_n.p_c;

import rs.C_Client_mc;

class C_d extends rs.p_q.p_a.p_a.C_a {
   @Override
   public void a() {
      int var1 = this.e();
      if (var1 == 0) {
         C_c.h();
      }

      if (var1 == 3) {
         int var2 = this.e();
         C_c.a var3 = null;
         switch (var2) {
            case 1:
               var3 = C_c.a.a;
               break;
            case 2:
               var3 = C_c.a.b;
               break;
            case 3:
               var3 = C_c.a.c;
         }

         int var4 = this.g();
         int var5 = this.e();
         String var6 = this.h();
         String var7 = null;
         if (var5 >= 2) {
            var7 = this.h();
         }

         int var8 = this.e();
         int[][] var9 = new int[var8][];

         for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = new int[2];
            var9[var10][0] = this.g();
            var9[var10][1] = this.g();
         }

         int var16 = this.c();
         int var11 = this.c();
         boolean var12 = this.e() == 1;
         C_c.a(var3, var4, var6, var7, var9, var16, var11, var12);
      }

      if (var1 == 2) {
         C_c.i();
      }

      int var13 = 0;
      int var14 = 0;
      if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
         var13 = C_Client_mc.ai / 2 - 356;
         var14 = C_Client_mc.ah / 2 - 230;
      }

      if (var1 == 5) {
         rs.p_l.p_f.C_e.d().g().b(20, 73 + var13 + 4, 115 + var14 + 10, 16764195);
         rs.p_l.p_f.C_e.d().g().b(10, 73 + var13 + 4, 115 + var14 + 10, 65315);
      }

      if (var1 == 6) {
         rs.p_l.p_f.C_e.d().g().b(15, 200 + var13, 107 + var14, 16764195);
         rs.p_l.p_f.C_e.d().g().b(15, 390 + var13, 107 + var14, 16764195);
         rs.p_l.p_f.C_e.d().g().b(15, 295 + var13, 200 + var14, 16764195);
         rs.p_l.p_f.C_e.d().g().b(15, 200 + var13, 225 + var14, 16764195);
         rs.p_l.p_f.C_e.d().g().b(15, 390 + var13, 225 + var14, 16764195);
      }

      if (var1 == 7) {
         int var15 = this.e();
         if (var15 == 0) {
            rs.p_n.C_e.H[30390].bf = false;
            rs.p_n.C_e.H[30391].bf = false;
            rs.p_n.C_e.H[30393].at = " Complete the chapter\\n to claim these items.";
            rs.p_n.C_e.H[30393].ao = rs.p_n.p_a.C_f.a[0];
         } else if (var15 == 1) {
            rs.p_n.C_e.H[30390].bf = true;
            rs.p_n.C_e.H[30391].bf = true;
            rs.p_n.C_e.H[30393].at = " @yel@CLAIM!";
            rs.p_n.C_e.H[30393].ao = rs.p_n.p_a.C_f.a[2];
            if (!rs.p_l.p_f.p_a.p_i.C_b.l()) {
               rs.p_l.p_f.p_a.p_i.C_b.a(30390, rs.p_l.p_f.p_a.p_i.C_e.d, 35, -30);
               rs.p_l.p_f.p_a.p_i.C_b.k().b(true);
            }
         } else {
            rs.p_n.C_e.H[30390].bf = false;
            rs.p_n.C_e.H[30391].bf = false;
            rs.p_n.C_e.H[30393].at = "@gre@You've claimed\\n@gre@these rewards!";
            rs.p_n.C_e.H[30393].ao = rs.p_n.p_a.C_f.a[0];
         }
      }

      if (var1 == 8) {
         C_c.bJ = this.c();
         C_c.bK = this.c();
      }
   }
}

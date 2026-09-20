package rs.p_n.p_c;

class C_ar extends rs.p_q.p_a.p_a.C_a {
   @Override
   public void a() {
      int var1 = this.e();
      if (var1 == 0) {
         int var2 = this.e();
         int var3 = this.g();
         char var4 = '\ud812';
         if (var2 == 1) {
            var4 = '\ud814';
         }

         if (var2 == 2) {
            var4 = '\ud816';
         }

         if (var2 == 3) {
            var4 = '\ud818';
         }

         if (rs.p_n.C_e.H[var4].aI != 20) {
            rs.p_n.C_e.H[var4].aJ = 0;
            rs.p_n.C_e.H[var4].aP = 0;
            rs.p_n.C_e.c(var4, 379, 64);
            rs.p_n.C_e.H[var4].bq = 100;
         }

         rs.p_n.C_e.H[var4].af = var3;
         var4 = '\ud81a';
         if (var2 == 1) {
            var4 = '\ud81c';
         }

         if (var2 == 2) {
            var4 = '\ud81e';
         }

         if (var2 == 3) {
            var4 = '\ud820';
         }

         if (var2 == 4) {
            var4 = '\ud822';
         }

         if (rs.p_n.C_e.H[var4].aI != 20) {
            rs.p_n.C_e.H[var4].aJ = 0;
            rs.p_n.C_e.H[var4].aP = 0;
            rs.p_n.C_e.c(var4, 379, 55);
            rs.p_n.C_e.H[var4].bq = 100;
         }

         rs.p_n.C_e.H[var4].af = var3;
      } else if (var1 == 1) {
         int var10 = this.e();
         char var18 = '\ud807';
         if (var10 == 1) {
            var18 = '\ud809';
         }

         if (var10 == 2) {
            var18 = '\ud80b';
         }

         if (var10 == 3) {
            var18 = '\ud80d';
         }

         if (var10 == 4) {
            var18 = '\ud80f';
         }

         rs.p_n.C_e.H['\ud807'].E = rs.p_n.C_e.H['\ud807'].aG = C_aq.e;
         rs.p_n.C_e.H['\ud808'].at = "1";
         rs.p_n.C_e.H['\ud809'].E = rs.p_n.C_e.H['\ud809'].aG = C_aq.e;
         rs.p_n.C_e.H['\ud80a'].at = "5";
         rs.p_n.C_e.H['\ud80b'].E = rs.p_n.C_e.H['\ud80b'].aG = C_aq.e;
         rs.p_n.C_e.H['\ud80c'].at = "10";
         rs.p_n.C_e.H['\ud80d'].E = rs.p_n.C_e.H['\ud80d'].aG = C_aq.e;
         rs.p_n.C_e.H['\ud80e'].at = "X";
         rs.p_n.C_e.H['\ud80f'].E = rs.p_n.C_e.H['\ud80f'].aG = C_aq.e;
         rs.p_n.C_e.H['\ud810'].at = "All";
         rs.p_n.C_e.H[var18].E = rs.p_n.C_e.H[var18].aG = C_aq.d;
         rs.p_n.C_e.H[var18 + 1].at = "@whi@" + rs.p_n.C_e.H[var18 + 1].at;
      } else if (var1 == 2) {
         if (this.e() == 0) {
            rs.p_n.C_e.H['\ud805'].at = "How many would you like to make?";
            rs.p_n.C_e.H['\ud806'].at = "Choose a quantity, then click an image to begin.";

            for (int var34 : C_aq.h()) {
               rs.p_n.C_e.H[var34].b(0, 55301, 150, 0);
            }

            for (int var35 : C_aq.i()) {
               rs.p_n.C_e.H[var35].bf = true;
            }

            for (int[] var36 : C_aq.j()) {
               for (int var9 : var36) {
                  rs.p_n.C_e.H[var9].bx = false;
                  rs.p_n.C_e.H[var9].by = null;
                  rs.p_n.C_e.H[var9].Q = "Select";
               }
            }

            return;
         }

         for (int var5 : C_aq.i()) {
            rs.p_n.C_e.H[var5].bf = false;
         }

         rs.p_n.C_e.H['\ud805'].at = this.h();
         boolean var12 = this.e() == 1;
         rs.p_n.C_e.H['\ud806'].at = var12 ? this.h() : "";

         for (int var6 : C_aq.h()) {
            if (!var12) {
               rs.p_n.C_e.H[var6].b(0, 55301, 241, 0);
            }
         }
      } else if (var1 == 3) {
         int var16 = this.e();
         String var24 = this.h();

         for (int var40 : C_aq.j()[var16]) {
            rs.p_n.C_e var41 = rs.p_n.C_e.H[var40];
            var41.bx = true;
            boolean var42 = var24.startsWith("<format>");
            if (var42) {
               var24 = var24.replaceAll("<format>", "");
            }

            var41.by = var24.replaceAll("<br>", "\n");
            var41.Q = var41.by;
            if (var41.Q.contains("\n")) {
               var41.Q = var41.Q.substring(0, var41.Q.indexOf("\n"));
            }

            if (var42) {
               var41.by = var41.by.replaceAll("@blu@", "@cya@");
            }

            if (!var42) {
               var41.Q = rs.p_l.C_j.b(var41.Q);
            }
         }
      } else if (var1 == 4) {
         int var17 = this.e();
         String var25 = this.h();
         C_aq.c[var17] = System.currentTimeMillis();
         C_aq.a(var25, var17);
      }
   }
}

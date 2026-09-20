package rs.p_q.p_a.p_a.p_a;

public class C_d extends rs.p_q.p_a.p_a.C_a {
   @Override
   public void a() {
      int var1 = this.e();
      if (var1 == 1) {
         for (int var2 = this.e(); var2 != 0; var2 = this.e()) {
            if (var2 == 1) {
               int var3 = this.c();
               rs.p_l.p_e.p_a.C_o.q = "<img=233> Players in lobby: @or1@" + var3;
               rs.p_l.p_e.p_a.C_o.r = rs.p_l.p_e.p_a.C_o.p + " @whi@" + rs.p_l.p_e.p_a.C_o.q;
            } else if (var2 == 2) {
               String var6 = this.h();
               rs.p_l.p_e.p_a.C_o.p = "<img=37> Starting in: @or1@" + var6;
               rs.p_l.p_e.p_a.C_o.r = rs.p_l.p_e.p_a.C_o.p + " @whi@" + rs.p_l.p_e.p_a.C_o.q;
            } else if (var2 == 3) {
               int var7 = this.e();
               rs.p_l.p_e.p_a.C_o.p = "<img=73> Waiting for @or1@" + var7 + "+@whi@ players..";
               rs.p_l.p_e.p_a.C_o.r = rs.p_l.p_e.p_a.C_o.p + " @whi@" + rs.p_l.p_e.p_a.C_o.q;
            } else if (var2 == 4) {
               rs.p_l.p_e.p_a.C_o.r = "<img=24> Starting a match, please wait..";
            } else if (var2 == 5) {
               String var8 = this.h();
               rs.p_l.p_e.p_a.C_o.s = var8.toString();
            }
         }
      }

      if (var1 == 2) {
         for (int var5 = this.e(); var5 != 0; var5 = this.e()) {
            if (var5 == 1) {
               int var9 = this.e();
               rs.p_l.p_e.p_a.C_o.t = "Survivors: @yel@" + var9;
            }

            if (var5 == 2) {
               int var10 = this.e();
               rs.p_l.p_e.p_a.C_o.u = "Kills: @yel@" + var10;
            }

            if (var5 >= 3 && var5 <= 5) {
               rs.p_l.p_e.p_a.C_o.A = true;
            }

            if (var5 == 3) {
               long var11 = (long)this.c();
               if (var11 > 0L) {
                  rs.p_l.p_e.p_a.C_o.x = System.currentTimeMillis() + var11 * 1000L;
               } else {
                  rs.p_l.p_e.p_a.C_o.x = 0L;
               }
            }

            if (var5 == 4) {
               long var12 = (long)this.c();
               if (var12 > 0L) {
                  rs.p_l.p_e.p_a.C_o.y = System.currentTimeMillis() + var12 * 1000L;
               } else {
                  rs.p_l.p_e.p_a.C_o.y = 0L;
               }
            }

            if (var5 == 5) {
               rs.p_l.p_e.p_a.C_o.C = this.e();
               long var13 = (long)this.c();
               if (var13 > 0L) {
                  rs.p_l.p_e.p_a.C_o.z = System.currentTimeMillis() + var13 * 1000L;
                  rs.p_l.p_e.p_a.C_o.F = rs.p_l.p_e.p_a.C_o.C;
               } else {
                  if (rs.p_l.p_e.p_a.C_o.C == 1) {
                     rs.p_l.p_e.p_a.C_o.C = 2;
                  }

                  rs.p_l.p_e.p_a.C_o.z = 0L;
               }
            }

            if (var5 == 6) {
               rs.p_l.p_e.p_a.C_o.A = false;
            }

            if (var5 == 7) {
               rs.p_l.p_e.p_a.C_o.J = "<img=128> Match style: @cya@" + this.h() + " <img=128>";
            }

            if (var5 == 8) {
               rs.p_l.p_e.p_a.C_o.B = this.e() == 1;
            }
         }
      }
   }
}

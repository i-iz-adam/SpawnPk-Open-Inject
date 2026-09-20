package rs.p_l.p_e.p_a;

import rs.C_Client_mc;

public class C_q extends rs.p_l.p_e.C_a {
   private boolean p;
   private int q;
   private int r;
   private int s;
   private int t;
   private int u;

   @Override
   public void b() {
   }

   @Override
   public boolean a(C_Client_mc var1) {
      return this.p;
   }

   @Override
   public void b(C_Client_mc var1, rs.p_l.p_e.C_f.Mode var2) {
      int var3 = (rs.p_l.p_b.C_a.b() ? 765 : C_Client_mc.aj) / 2;
      int var4 = (rs.p_l.p_b.C_a.b() ? 503 : C_Client_mc.ak) - 4;
      int var5 = this.u + (rs.p_l.p_b.C_a.b() ? 5 : 0);
      C_Client_mc.gl
         .c(
            "@gre@X: " + this.t + "   @cya@Y: " + var5 + "        @yel@Hovered: " + var1.ef + "     @mag@(ID: " + this.q + " - Parent: " + this.r + ")",
            var3,
            var4,
            16750623,
            0
         );
   }

   @Override
   public boolean a(int var1) {
      return true;
   }

   @Override
   public void c() {
   }

   public boolean f() {
      return this.p;
   }

   public void a(boolean var1) {
      this.p = var1;
   }

   public void b(int var1) {
      if (C_Client_mc.cH <= 0) {
         System.out.println("[ERROR] No opened interface to reference!");
         this.p = false;
      } else {
         this.r = 0;
         rs.p_n.C_e var2 = rs.p_n.C_e.H[C_Client_mc.cH];

         for (int var3 = 0; var3 < var2.al.length; var3++) {
            rs.p_n.C_e var4 = rs.p_n.C_e.H[var2.al[var3]];
            if (var4.al != null && var4.al.length > 0) {
               for (int var5 = 0; var5 < var4.al.length; var5++) {
                  if (var4.al[var5] == var1) {
                     this.t = var4.am[var5];
                     this.u = var4.bc[var5];
                     this.r = var4.aw;
                     this.s = var5;
                     break;
                  }
               }
            }

            if (this.r != 0) {
               break;
            }

            if (var2.al[var3] == var1) {
               this.r = var2.aw;
               this.s = var3;
               this.t = var2.am[var3];
               this.u = var2.bc[var3];
               break;
            }
         }

         if (this.r == 0) {
            this.p = false;
            System.out.println("[ERROR] Could not find child ID " + var1 + " in interface " + C_Client_mc.cH + "!");
         } else {
            this.q = var1;
         }
      }
   }

   public int g() {
      return this.r;
   }

   public int h() {
      return this.s;
   }

   public int i() {
      return this.t;
   }

   public int j() {
      return this.u;
   }

   public void c(int var1) {
      this.t += var1;
   }

   public void d(int var1) {
      this.u += var1;
   }
}

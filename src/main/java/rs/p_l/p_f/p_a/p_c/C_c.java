package rs.p_l.p_f.p_a.p_c;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import rs.C_Client_mc;
import rs.p_l.C_F_uc;
import rs.p_l.p_f.C_e;
import rs.p_l.p_f.C_g;
import rs.p_l.p_f.C_l;

public class C_c extends C_g {
   private static final int T = 1;
   private static final Dimension U = new Dimension();
   private static final Dimension V = new Dimension(142, 14);
   private static final Dimension W = new Dimension(190, 46);
   private static final Dimension X = new Dimension(190, 84);
   private static final Dimension Y = new Dimension(190, 31);
   private static final Dimension Z = new Dimension(190, 65);
   private static final String aa = "None";
   private static final String ab = "Searching";
   private static final String ac = "Searching.";
   private static final String ad = "Searching..";
   private static final String ae = "Searching...";
   public C_F_uc r;
   public C_F_uc s;
   public C_F_uc t;
   public C_F_uc u;
   public C_F_uc v;
   public C_F_uc w;
   public C_F_uc x;
   public C_F_uc y;
   public C_F_uc[] z;
   public C_F_uc[] A;
   private boolean af = true;
   public boolean B = false;
   public boolean C = false;
   public boolean D = true;
   public boolean E = false;
   public boolean F = false;
   public String G;
   public String H;
   public String I;
   public String J;
   public String K;
   public int L;
   public int M;
   public int N;
   public int O;
   public int P;
   public int Q;
   private int ag;
   private int ah;
   public long R;
   public long S;

   public C_c() {
      this.a("BountyOverlay");
      this.a(rs.p_l.p_f.C_a.q);
      this.j(true);
      this.c(rs.p_l.p_f.C_a.A);
      this.a(C_l.e);
      this.a(10.0F);
      this.e.a(new Rectangle(2, 2, 2, 2));
      this.e.b(new Point(0, 2));
      this.U();
      this.c(false);
   }

   @Override
   public Dimension a(Graphics2D var1) {
      if (!this.af) {
         return U;
      } else if (rs.p_f.C_a.bo && C_Client_mc.ed == 197) {
         this.ag = this.f.x;
         this.ah = this.f.y;
         if (this.C) {
            this.w.c(this.ag + V.width - 13, this.ah);
            this.a(V);
            return this.j;
         } else {
            boolean var2 = this.O();
            if (this.E) {
               (var2 ? this.u : this.v).c(this.ag, this.ah);
            } else {
               (var2 ? this.t : this.s).c(this.ag, this.ah);
            }

            String var3 = "Searching";
            if (C_Client_mc.ff % 200 < 50) {
               var3 = "Searching.";
            } else if (C_Client_mc.ff % 200 >= 50 && C_Client_mc.ff % 200 < 100) {
               var3 = "Searching..";
            } else if (C_Client_mc.ff % 200 >= 100 && C_Client_mc.ff % 200 < 150) {
               var3 = "Searching...";
            }

            boolean var4 = this.I != null;
            String var5 = this.G == null ? "None" : this.G;
            String var6 = this.H == null ? "None" : this.H;
            String var7 = this.I == null ? var3 : this.I;
            if (var2) {
               if (var4) {
                  this.a.gm.b(var5, this.ag + 17, this.ah + 15, 12171349, 0);
                  C_Client_mc.gl.a("<img=303> <yoff=1>" + var6, this.ag + 187, this.ah + 14 + 13, 16750623, 0);
                  C_Client_mc.gl.b(var7, this.ag + 20, this.ah + 14 + 16, 2096965, 0);
                  if (this.y != null) {
                     this.y.c(this.ag + 150, this.ah + 5);
                  }
               } else {
                  this.a.gm.b(var3, this.ag + 66, this.ah + 20, 12171349, 0);
               }

               if (this.L()) {
                  byte var11 = -15;
                  this.r.c(this.ag + 20, this.ah + 50 + var11);
                  C_Client_mc.gl.b("<u=16777215>@whi@" + this.J, this.ag + 25, this.ah + 63 + var11, 16776991, 0);
                  C_Client_mc.gl.b("Kills: @whi@" + this.K, this.ag + 25, this.ah + 63 + 12 + 3 + var11, 16776991, 0);
                  C_Client_mc.gl
                     .b("Time Left: @whi@" + C_Client_mc.d(this.R - System.currentTimeMillis()), this.ag + 25 + 60, this.ah + 63 + 12 + 3 + var11, 16776991, 0);
                  this.a(Z);
               } else {
                  this.a(Y);
               }

               return this.j;
            } else {
               C_Client_mc.gl.c("Risk: " + var6, this.ag + 45, this.ah + 42, 16776991, 0);
               C_Client_mc.gl.c("Target:", this.ag + 140, this.ah + 13, 16776991, 0);
               this.a.gm.c(var5, this.ag + 139, this.ah + 26, 16777215, 0);
               C_Client_mc.gl.c(var7, this.ag + 138, this.ah + 41, 2096965, 0);
               int var8 = this.G == null ? 0 : this.L;
               byte var9 = 32;
               if (var8 > 0) {
                  int var10 = 0;
                  if (var8 == 9) {
                     var10 += 2;
                  }

                  if (var8 == 8) {
                     var10++;
                  }

                  if (var8 == 3) {
                     var10 += 3;
                  }

                  if (var8 == 2) {
                     var10 += 2;
                  }

                  this.A[var8 - 1].c(this.ag + 14, this.ah + var10);
                  var9 += 14;
                  C_Client_mc.gl.c(var8 + "", this.ag + 30, this.ah + 30, 16776991, 0);
               }

               this.z[this.M].c(this.ag + var9, this.ah + 10);
               if (this.y != null) {
                  this.y.c(this.ag + var9 + 32, this.ah + 10);
               }

               if (this.L()) {
                  this.a(X);
                  this.r.c(this.ag + 20, this.ah + 50);
                  C_Client_mc.gl.b("<u=16777215>@whi@" + this.J, this.ag + 25, this.ah + 63, 16776991, 0);
                  C_Client_mc.gl.b("Kills: @whi@" + this.K, this.ag + 25, this.ah + 63 + 12 + 3, 16776991, 0);
                  C_Client_mc.gl
                     .b("Time Left: @whi@" + C_Client_mc.d(this.R - System.currentTimeMillis()), this.ag + 25 + 60, this.ah + 63 + 12 + 3, 16776991, 0);
               } else {
                  this.a(W);
               }

               return this.j;
            }
         }
      } else {
         return U;
      }
   }

   @Override
   public void m() {
      if (this.P()) {
         C_e.d().f().a(this.C ? "Maximize" : "Minimize", false);
      } else if (this.Q()) {
         C_e.d().f().a(this.J != null ? "Hide/show task" : "Receive task", false);
      } else if (this.T()) {
         C_e.d().f().a("Task info", false);
      } else if (this.R()) {
         C_e.d().f().a("Skip target", false);
      } else if (this.S()) {
         C_e.d().f().a("Skip bounty hunter task", false);
      }
   }

   @Override
   public boolean n() {
      this.ag = this.f.x;
      this.ah = this.f.y;
      if (this.P()) {
         rs.p_h.C_c.a(() -> this.C = !this.C);
      } else if (this.Q()) {
         rs.p_h.C_c.a(() -> {
            if (this.J != null) {
               this.D = !this.D;
            } else {
               rs.p_n.C_a.a("::bhtask");
            }
         });
      } else if (this.R()) {
         rs.p_h.C_c.a(() -> rs.p_n.C_a.a("::skipbh"));
      } else if (this.S()) {
         rs.p_h.C_c.a(() -> rs.p_n.C_a.a("::bhtaskskip"));
      } else {
         if (!this.T()) {
            return false;
         }

         rs.p_h.C_c.a(() -> rs.p_n.C_a.a("::bhtaskinfo"));
      }

      return true;
   }

   private boolean O() {
      return rs.p_f.C_a.as;
   }

   private boolean P() {
      return this.C
         ? C_Client_mc.hP >= this.ag + V.width - 14 && C_Client_mc.hP <= this.ag + V.width && C_Client_mc.hQ >= this.ah && C_Client_mc.hQ <= this.ah + 13
         : C_Client_mc.hP >= this.ag && C_Client_mc.hP <= this.ag + 14 && C_Client_mc.hQ >= this.ah && C_Client_mc.hQ <= this.ah + 13;
   }

   private boolean Q() {
      byte var1 = 0;
      boolean var2 = false;
      if (this.O()) {
         this.ah += 5;
      }

      return this.af
         && !this.C
         && C_Client_mc.hP >= this.ag
         && C_Client_mc.hP <= this.ag + 14
         && C_Client_mc.hQ >= this.ah + 12 + var1
         && C_Client_mc.hQ <= this.ah + 26 + var1;
   }

   private boolean R() {
      int var1 = this.ag + 166;
      int var2 = this.ah;
      return this.af && !this.C && C_Client_mc.hP >= var1 && C_Client_mc.hP <= var1 + 21 && C_Client_mc.hQ >= var2 && C_Client_mc.hQ <= var2 + 16;
   }

   private boolean S() {
      int var1 = this.ag + 166;
      int var2 = this.ah + 52;
      if (this.O()) {
         var2 -= 17;
      }

      return this.af && !this.C && this.L() && C_Client_mc.hP >= var1 && C_Client_mc.hP <= var1 + 21 && C_Client_mc.hQ >= var2 && C_Client_mc.hQ <= var2 + 16;
   }

   private boolean T() {
      int var1 = this.ag + 166;
      int var2 = this.ah + 52 + 17;
      if (this.O()) {
         var2 -= 15;
      }

      return this.af && !this.C && this.L() && C_Client_mc.hP >= var1 && C_Client_mc.hP <= var1 + 21 && C_Client_mc.hQ >= var2 && C_Client_mc.hQ <= var2 + 16;
   }

   public boolean L() {
      return this.D && this.J != null;
   }

   public boolean M() {
      return rs.p_n.C_e.H[199].at.equals("@or1@3-126")
         || rs.p_n.C_e.H[199].at.contains("Tourney")
         || rs.p_n.C_e.H[199].at.contains("@or1@PvP")
         || rs.p_n.C_e.H[199].at.contains("LMS")
         || rs.p_n.C_e.H[199].at.contains("War")
         || rs.p_n.C_e.H[199].at.contains("HG");
   }

   private void U() {
      this.r = new C_F_uc("popups/bh record bg");
      this.s = new C_F_uc("popups/bh target bg");
      this.t = new C_F_uc("popups/bhcompact1");
      this.u = new C_F_uc("popups/bhcompact2");
      this.v = new C_F_uc("popups/bh target bg cursed");
      this.w = new C_F_uc("popups/bh maximimize");
      this.x = new C_F_uc("popups/bh combat");
      this.z = new C_F_uc[8];
      this.A = new C_F_uc[10];
      this.y = null;
      this.R = 0L;
      this.E = false;

      for (int var1 = 0; var1 < this.z.length; var1++) {
         this.z[var1] = new C_F_uc("popups/bh skull" + var1);
      }

      for (int var2 = 0; var2 < 10; var2++) {
         this.A[var2] = new C_F_uc("popups/t" + (var2 + 1));
      }
   }

   public void k(boolean var1) {
      this.af = var1;
   }

   public boolean N() {
      return this.af;
   }
}

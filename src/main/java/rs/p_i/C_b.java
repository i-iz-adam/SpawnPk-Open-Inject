package rs.p_i;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D.Double;
import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;
import rs.p_l.C_F_uc;
import rs.p_l.C_h;
import rs.p_n.C_d;
import rs.p_n.C_e;

public class C_b {
   private C_Client_mc l;
   private C_F_uc[] m = new C_F_uc[5];
   public C_F_uc[] a = new C_F_uc[14];
   public C_F_uc[] b = new C_F_uc[29];
   private int n = 1;
   private final int o = 6;
   public C_F_uc c;
   public C_F_uc d;
   public C_F_uc e;
   public C_F_uc f;
   public C_F_uc g;
   public boolean h;
   private C_F_uc p;
   private C_F_uc q;
   private C_F_uc r;
   private C_F_uc s;
   public boolean i;
   private int t = -1;
   private int u = -1;
   private int v = -1;
   private int w = -1;
   private static final int x = 50;
   private static final int y = 100;
   private static final Color z = c(10159875);
   private static final Color A = c(2004400);
   private static final Color B = new Color(255, 255, 255, 60);
   private static final String[] C = new String[]{"All", "Game", "Yell", "Public", "Private", "Clan", "Trade", "News"};
   private static final String[] D = new String[]{"On", "Friends", "Off", "Hide", "Filtered"};
   private static final int[] E = new int[]{65280, 16776960, 16711680, 65535, 16776960};
   public long j;
   public long k;
   private static final double F = 26.0;
   private static final int G = 27;

   public C_b(C_Client_mc var1) {
      this.l = var1;

      for (int var2 = 0; var2 < this.m.length; var2++) {
         this.m[var2] = new C_F_uc("gameframe/redstone " + var2);
         this.m[var2].c(255, 255, 255);
      }

      for (int var3 = 0; var3 < this.a.length; var3++) {
         this.a[var3] = new C_F_uc("gameframe/icons/icon " + var3);
         this.a[var3].c(255, 255, 255);
      }

      this.p = new C_F_uc("orbs/orb_drain");
      this.q = new C_F_uc("orbs/orb_drain");
      this.r = new C_F_uc("orbs/orb_drain");
      this.s = new C_F_uc("orbs/orb_drain");
      this.f = new C_F_uc("orbs/adventure_orb");
      this.g = new C_F_uc("orbs/adventure_orb_hover");
      this.b[0] = new C_F_uc("orbs/orb_drain");
      this.b[1] = new C_F_uc("orbs/orb_bg");
      this.b[2] = new C_F_uc("orbs/hp_fill");
      this.b[3] = new C_F_uc("orbs/hp_icon");
      this.b[4] = new C_F_uc("orbs/pray_fill");
      this.b[5] = new C_F_uc("orbs/pray_icon");
      this.b[6] = new C_F_uc("orbs/run_fill");
      this.b[7] = new C_F_uc("orbs/run_icon");
      this.b[8] = new C_F_uc("orbs/run_fill_active");
      this.b[9] = new C_F_uc("orbs/run_icon_active");
      this.b[10] = new C_F_uc("orbs/orb_bg_hover");
      this.b[11] = new C_F_uc("orbs/hit_toggle");
      this.b[12] = new C_F_uc("orbs/hit_toggle_hover");
      this.b[13] = new C_F_uc("orbs/hit_toggle_active");
      this.b[14] = new C_F_uc("orbs/exp_toggle_active");
      this.b[15] = new C_F_uc("orbs/right_arrow");
      this.b[16] = new C_F_uc("orbs/left_arrow");
      this.b[17] = new C_F_uc("orbs/heal_toggle_active");
      this.b[18] = new C_F_uc("orbs/refill_toggle_active");
      this.b[19] = new C_F_uc("orbs/run_icon_stamina");
      this.b[20] = new C_F_uc("orbs/boss_toggle_active");
      this.b[21] = new C_F_uc("orbs/bank_inv_active");
      this.b[22] = new C_F_uc("orbs/bank_equip_active");
      this.b[23] = new C_F_uc("orbs/promo_orb");
      this.b[24] = new C_F_uc("orbs/promo_orb_hover");
      this.b[25] = new C_F_uc("orbs/event_orb");
      this.b[26] = new C_F_uc("orbs/event_orb_hover");
      this.b[27] = new C_F_uc("orbs/spec_fill");
      this.b[28] = new C_F_uc("orbs/spec_icon");
      this.c = new C_F_uc("gameframe/chatbutton");
      this.d = new C_F_uc("gameframe/hoverchat");
      this.e = new C_F_uc("gameframe/hoverchat2");
   }

   private static Color c(int var0) {
      float[] var1 = new float[3];
      Color.RGBtoHSB(var0 >>> 16, var0 >> 8 & 0xFF, var0 & 0xFF, var1);
      return Color.getHSBColor(var1[0], 1.0F, 1.0F);
   }

   public void a() {
      if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
         this.o();
      }

      this.i();
      this.l();
      this.m();
      this.n();
      this.p();
      this.j();
      this.k();
      this.q();
      this.t();
      this.s();
      this.u();
      this.r();
      if (rs.p_f.C_a.ai == rs.p_f.C_a.c.a) {
         this.o();
      }
   }

   private void i() {
      byte var1 = 34;
      byte var2 = 34;
      int var3 = 684;
      short var4 = 87;
      if (rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
         var3 = C_Client_mc.ai - 85;
         var4 = 155;
      }

      this.h = false;
      if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
         if (C_Client_mc.hP >= C_Client_mc.ai - 85 && C_Client_mc.hP <= C_Client_mc.ai - 85 + var1 && C_Client_mc.hQ >= 201 && C_Client_mc.hQ <= 201 + var2) {
            this.h = true;
         }

         (this.h ? this.g : this.f).f(-2 + var3, 44 + var4);
         if (this.h) {
            this.l.b(C_Client_mc.hP - 50, C_Client_mc.hQ - 15, " Adventure book   ");
         }
      } else {
         if (C_Client_mc.hP >= 680 && C_Client_mc.hP <= 712 && C_Client_mc.hQ >= 134 && C_Client_mc.hQ <= 162) {
            this.h = true;
         }

         (this.h ? this.g : this.f).f(-2 + var3, 44 + var4);
         if (this.h) {
            this.l.b(C_Client_mc.hP - C_Client_mc.aj - 20, C_Client_mc.hQ - 10, " Adventure Book   ");
         }
      }

      if (C_Client_mc.ff % 20 < 10 && this.l.cY == 6) {
         this.l.cX.f(var3 - 34, var4 + 45);
      }
   }

   private void j() {
      int var1 = 723;
      byte var2 = 10;
      if (rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
         var1 = C_Client_mc.ai - 118;
         var2 = 120;
      }

      boolean var3 = false;
      if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
         if (C_Client_mc.hP >= C_Client_mc.ai - 119 && C_Client_mc.hP <= C_Client_mc.ai - 96 && C_Client_mc.hQ >= 166 && C_Client_mc.hQ <= 188) {
            var3 = true;
         }

         this.b[var3 ? 26 : 25].f(-2 + var1, 44 + var2);
         if (var3) {
            this.l.b(C_Client_mc.hP - 50, C_Client_mc.hQ - 15, " Donate");
         }
      } else {
         if (C_Client_mc.hP >= 718 && C_Client_mc.hP <= 744 && C_Client_mc.hQ >= 57 && C_Client_mc.hQ <= 79) {
            var3 = true;
            this.l.b(C_Client_mc.hP - 50, C_Client_mc.hQ + 10, " Donate");
         }

         this.b[var3 ? 26 : 25].f(-2 + var1, 44 + var2);
      }
   }

   private void k() {
      int var1 = 714;
      byte var2 = -20;
      if (rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
         var1 = C_Client_mc.ai - 85;
         var2 = 125;
      }

      boolean var3 = false;
      if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
         if (C_Client_mc.hP >= C_Client_mc.ai - 86 && C_Client_mc.hP <= C_Client_mc.ai - 62 && C_Client_mc.hQ >= 172 && C_Client_mc.hQ <= 198) {
            var3 = true;
         }

         this.b[var3 ? 24 : 23].f(-2 + var1, 44 + var2);
         if (var3) {
            this.l.b(C_Client_mc.hP - 50, C_Client_mc.hQ - 15, " View item guides  ");
         }
      } else {
         if (C_Client_mc.hP >= 710 && C_Client_mc.hP <= 733 && C_Client_mc.hQ >= 22 && C_Client_mc.hQ <= 48) {
            var3 = true;
            this.l.b(C_Client_mc.hP - 50, C_Client_mc.hQ + 10, " View item guides  ");
         }

         this.b[var3 ? 24 : 23].f(-2 + var1, 44 + var2);
      }
   }

   public void a(int var1) {
      int var2 = this.l.fi;
      this.l.fi = var1;
      if (var2 == var1) {
         this.a(!rs.p_f.C_a.bc);
      } else if (rs.p_f.C_a.bc) {
         this.a(false);
      }

      C_Client_mc.fM = true;
   }

   public void b() {
      int var1 = !C_Client_mc.ai() ? 338 : C_Client_mc.ah - 165;
      int var2 = 141;
      if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
         var2 += var1;
      } else {
         var2 += 338;
      }

      if (this.l.fi == 0) {
         this.c.f(4, var2);
      } else if (this.l.fi == 12) {
         this.c.f(69, var2);
      } else if (this.l.fi == 5) {
         this.c.f(135, var2);
      } else if (this.l.fi == 1) {
         this.c.f(201, var2);
      } else if (this.l.fi == 2) {
         this.c.f(267, var2);
      } else if (this.l.fi == 11) {
         this.c.f(333, var2);
      } else if (this.l.fi == 3) {
         this.c.f(399, var2);
      } else if (this.l.fi == 20) {
         this.c.f(459, var2);
      }

      int var3 = C_Client_mc.ah - 503;
      if (C_Client_mc.hQ >= 481 + var3 && C_Client_mc.hQ <= 502 + var3) {
         if (C_Client_mc.hP >= 4 && C_Client_mc.hP <= 59) {
            if (this.l.fi == C_a.b) {
               this.e.f(4, var2);
            } else {
               this.d.f(4, var2);
            }
         } else if (C_Client_mc.hP >= 69 && C_Client_mc.hP <= 125) {
            if (this.l.fi == C_a.h) {
               this.e.f(69, var2);
            } else {
               this.d.f(69, var2);
            }
         } else if (C_Client_mc.hP >= 135 && C_Client_mc.hP <= 193) {
            if (this.l.fi == C_a.f) {
               this.e.f(135, var2);
            } else {
               this.d.f(135, var2);
            }
         } else if (C_Client_mc.hP >= 201 && C_Client_mc.hP <= 257) {
            if (this.l.fi == C_a.c) {
               this.e.f(201, var2);
            } else {
               this.d.f(201, var2);
            }
         } else if (C_Client_mc.hP >= 267 && C_Client_mc.hP <= 323) {
            if (this.l.fi == C_a.d) {
               this.e.f(267, var2);
            } else {
               this.d.f(267, var2);
            }
         } else if (C_Client_mc.hP >= 333 && C_Client_mc.hP <= 389) {
            if (this.l.fi == C_a.g) {
               this.e.f(335, var2);
            } else {
               this.d.f(335, var2);
            }
         } else if (C_Client_mc.hP >= 400 && C_Client_mc.hP <= 456) {
            if (this.l.fi == C_a.e) {
               this.e.f(401, var2);
            } else {
               this.d.f(401, var2);
            }
         } else if (C_Client_mc.hP >= 460 && C_Client_mc.hP <= 516) {
            if (this.l.fi == C_a.i) {
               this.e.f(461, var2);
            } else {
               this.d.f(461, var2);
            }
         }
      }

      byte var4 = 63;
      C_Client_mc.gh.a(true, 26, 16777215, C[0], 157 + var1);
      C_Client_mc.gh.a(true, 85, 16777215, C[1], 152 + var1);
      C_Client_mc.gh.a(true, 92 + var4, 16777215, C[2], 152 + var1);
      C_Client_mc.gh.a(true, 152 + var4, 16777215, C[3], 152 + var1);
      C_Client_mc.gh.a(true, 214 + var4, 16777215, C[4], 152 + var1);
      C_Client_mc.gh.a(true, 288 + var4, 16777215, C[5], 152 + var1);
      C_Client_mc.gh.a(true, 351 + var4, 16777215, C[6], 152 + var1);
      C_Client_mc.gh.a(true, 412 + var4, 16777215, C[7], 152 + var1);
      C_Client_mc.gh.a(E[this.l.gx], 97, D[this.l.gx], 162 + var1, true);
      C_Client_mc.gh.a(E[this.l.gw], var4 + 100, D[this.l.gw], 162 + var1, true);
      C_Client_mc.gh.a(E[this.l.gu], var4 + 166, D[this.l.gu], 162 + var1, true);
      C_Client_mc.gh.a(E[this.l.cE], var4 + 232, D[this.l.cE], 162 + var1, true);
      C_Client_mc.gh.a(E[this.l.gy], var4 + 298, D[this.l.gy], 162 + var1, true);
      C_Client_mc.gh.a(E[this.l.fZ], var4 + 364, D[this.l.fZ], 162 + var1, true);
      C_Client_mc.gh.a(E[this.l.gv], var4 + 364 + 61, D[this.l.gv], 162 + var1, true);
   }

   private void l() {
      int var1 = 524;
      int var2 = -3;
      if (rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
         var1 = 5 + C_Client_mc.ai - 210;
         var2 = -4;
      } else {
         var2 -= 2;
      }

      int var3 = this.l.a(C_e.H[4016], 0);
      int var4 = this.l.a(C_e.H[4017], 0);
      int var5 = (int)((double)var3 / (double)var4 * 100.0);
      double var6 = 1.0;
      if (var3 < 99) {
         var6 = (double)(System.currentTimeMillis() - this.k) / 60000.0;
      }

      int var8 = this.e(var5);
      if (var8 != this.t) {
         this.p = new C_F_uc("orbs/orb_drain", 27, var8);
         this.t = var8;
      }

      this.b[1].f(-2 + var1, 44 + var2);
      int var9 = this.b[2].n == 28 ? 0 : 2;
      this.b[2].f(25 + var1 + var9, 48 + var2 + var9);
      this.p.f(25 + var1, 48 + var2);
      this.b[3].f(31 + var1, 55 + var2);
      C_Client_mc.gh.a(this.d(var5), 15 + var1, var3 + "", 71 + var2, true);
      if (var3 < 99) {
         this.a((Graphics2D)this.l.gZ.e.getGraphics(), var1 - 1, 46 + var2, var6, z);
      }
   }

   public void c() {
      this.b[4] = new C_F_uc(this.l.cp ? "orbs/pray_fill_active" : "orbs/pray_fill");
   }

   private void m() {
      int var1 = 524;
      int var2 = 39;
      if (rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
         var1 = 5 + C_Client_mc.ai - 210;
         var2 = 28;
      } else {
         var2 -= 11;
      }

      int var3 = this.l.a(C_e.H[4012], 0);
      int var4 = this.l.a(C_e.H[4013], 0);
      int var5 = (int)((double)var3 / (double)var4 * 100.0);
      int var6 = this.e(var5);
      if (var6 != this.v) {
         this.q = new C_F_uc("orbs/orb_drain", 27, this.e(var5));
         this.v = var6;
      }

      boolean var7 = false;
      if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
         if (C_Client_mc.hQ >= 75 && C_Client_mc.hQ <= 107 && C_Client_mc.hP >= C_Client_mc.ai - 192 - 20 && C_Client_mc.hP <= C_Client_mc.ai - 133 - 20) {
            var7 = true;
         }
      } else if (C_Client_mc.hQ >= 75 && C_Client_mc.hQ <= 107 && C_Client_mc.hP >= 518 && C_Client_mc.hP <= 575) {
         var7 = true;
      }

      this.b[var7 ? 10 : 1].f(-2 + var1, 44 + var2);
      this.b[4].f(25 + var1, 48 + var2);
      this.q.f(25 + var1, 48 + var2);
      this.b[5].f(28 + var1, 51 + var2);
      C_Client_mc.gh.a(this.d(var5), 15 + var1, var3 + "", 71 + var2, true);
   }

   private void n() {
      int var1 = 542;
      int var2 = 76;
      if (rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
         var1 = 23 + C_Client_mc.ai - 210 - 5;
         var2 = 60;
      } else {
         var1 -= 10;
         var2 -= 15;
      }

      int var3 = 0;
      if (C_e.H[149].at.length() > 0) {
         for (int var4 = 0; var4 < C_e.H[149].at.length() - 1; var4++) {
            var3 = C_h.a(var3, C_e.H[149].at.charAt(var4));
         }
      }

      int var11 = (int)((double)var3 / 100.0 * 100.0);
      int var5 = this.e(var11);
      if (var5 != this.u) {
         this.r = new C_F_uc("orbs/orb_drain", 27, var5);
         this.u = var5;
      }

      boolean var6 = false;
      if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
         if (C_Client_mc.hQ >= 120 && C_Client_mc.hQ <= 153 && C_Client_mc.hP >= C_Client_mc.ai - 192 && C_Client_mc.hP <= C_Client_mc.ai - 133) {
            var6 = true;
         }
      } else if (C_Client_mc.hQ >= 109 && C_Client_mc.hQ <= 142 && C_Client_mc.hP >= 540 && C_Client_mc.hP <= 575) {
         var6 = true;
      }

      boolean var7 = this.l.dP[173] == 1 && var11 > 0;
      int var8 = !var7 ? 7 : 9;
      if (this.i) {
         var8 = 19;
      }

      this.b[var6 ? 10 : 1].f(-2 + var1, 44 + var2);
      this.b[!var7 ? 6 : 8].f(25 + var1, 48 + var2);
      this.r.f(25 + var1, 48 + var2);
      this.b[var8].f(31 + var1, 52 + var2);
      C_Client_mc.gh.a(this.d(var11), 15 + var1, var3 + "", 71 + var2, true);
   }

   public void d() {
      this.j = System.currentTimeMillis();
      this.k = System.currentTimeMillis();
   }

   private void o() {
      int var1 = 183;
      int var2 = -30;
      if (!C_Client_mc.ai()) {
         var1 += 516;
      }

      double var3 = C_Client_mc.F;
      double var5 = 10.0;
      double var7 = 1.0;
      int var9 = (int)(var3 / var5 * 100.0);
      if (var3 < 10.0) {
         var7 = (double)(System.currentTimeMillis() - this.j) / 30000.0;
      }

      String var10 = (int)(var3 * 10.0) + "";
      int var11 = this.e(var9);
      if (this.w != var11) {
         this.s = new C_F_uc("orbs/orb_drain", 27, var11);
         this.w = var11;
      }

      if (rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
         var1 += C_Client_mc.ai - 353;
         var2 += 118;
      } else {
         var1 -= 148;
         var2 += 119;
      }

      this.b[1].f(-2 + var1, 44 + var2);
      this.b[27].f(26 + var1, 48 + var2);
      this.s.f(25 + var1, 48 + var2);
      this.b[28].f(31 + var1, 53 + var2);
      C_Client_mc.gh.a(this.d(var9), 14 + var1, var10, 71 + var2, true);
      if (var9 < 100) {
         this.a((Graphics2D)this.l.gZ.e.getGraphics(), var1 - 1, 46 + var2, var7, A);
      }
   }

   private void p() {
      int var1 = 524;
      short var2 = 22;
      if (rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
         var1 = 5 + C_Client_mc.ai - 25 - 2;
         var2 = 152;
      }

      boolean var3 = false;
      if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
         if (C_Client_mc.hQ >= 154 && C_Client_mc.hQ <= 173 && C_Client_mc.hP >= C_Client_mc.ai - 23 && C_Client_mc.hP <= C_Client_mc.ai - 6) {
            var3 = true;
         }
      } else if (C_Client_mc.hQ >= 25 && C_Client_mc.hQ <= 43 && C_Client_mc.hP >= 515 && C_Client_mc.hP <= 545) {
         var3 = true;
      }

      this.b[var3 ? 12 : 11].f(var1, var2);
      if (this.n > 0) {
         this.b[this.f() ? 13 : 14].f(var1, var2);
      }
   }

   private void q() {
      if (rs.p_f.C_a.v) {
         int var1 = 742;
         short var2 = 8;
         if (C_Launcher_mc.n() == null) {
            return;
         }

         if (rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
            var1 = 223 + C_Client_mc.ai - 245;
            var2 = 183;
         }

         boolean var3 = false;
         if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
            if (C_Client_mc.hQ >= 186 && C_Client_mc.hQ <= 205 && C_Client_mc.hP >= C_Client_mc.ai - 23 && C_Client_mc.hP <= C_Client_mc.ai - 6) {
               var3 = true;
            }
         } else if (C_Client_mc.hQ >= 11 && C_Client_mc.hQ <= 30 && C_Client_mc.hP >= 736 && C_Client_mc.hP <= 757) {
            var3 = true;
            this.l.b(C_Client_mc.hP - 50, C_Client_mc.hQ + 15, " Side panel");
         }

         this.b[var3 ? 12 : 11].c(var1, var2);
         this.b[C_Launcher_mc.e() ? 16 : 15].c(var1, var2);
      }
   }

   private void r() {
      int var1 = 747;
      int var2 = 114;
      if (rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
         byte var5 = 87;
         short var4 = 228;
         if (C_Client_mc.ah <= 670) {
            var1 = var4 + (C_Client_mc.ai - 275);
            var2 = var5 + 77;
         } else {
            var1 = var4 + (C_Client_mc.ai - 250);
            var2 = var5 + 228;
         }
      }

      boolean var3 = false;
      if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
         if (C_Client_mc.ah <= 670) {
            if (C_Client_mc.hQ >= 166 && C_Client_mc.hQ <= 182 && C_Client_mc.hP >= C_Client_mc.ai - 23 - 23 && C_Client_mc.hP <= C_Client_mc.ai - 6 - 23) {
               var3 = true;
               this.l.b(C_Client_mc.hP - 25, C_Client_mc.hQ - 15, " Bank all items");
            }
         } else if (C_Client_mc.hQ >= 313 && C_Client_mc.hQ <= 333 && C_Client_mc.hP >= C_Client_mc.ai - 23 && C_Client_mc.hP <= C_Client_mc.ai - 6) {
            var3 = true;
            this.l.b(C_Client_mc.hP - 25, C_Client_mc.hQ - 15, " Bank all items");
         }
      } else if (C_Client_mc.hQ >= 116 && C_Client_mc.hQ <= 134 && C_Client_mc.hP >= 744 && C_Client_mc.hP <= 759) {
         var3 = true;
         this.l.b(180, C_Client_mc.hQ, " Bank all items");
      }

      this.b[var3 ? 12 : 11].f(var1, var2);
      this.b[21].c(var1, var2 + 4);
   }

   private void s() {
      int var1 = 747;
      int var2 = 87;
      if (rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
         short var4 = 205;
         short var5 = 140;
         var1 = var4 + (C_Client_mc.ai - 227);
         var2 = var5 + 76;
      }

      boolean var3 = false;
      if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
         if (C_Client_mc.hQ >= 219 && C_Client_mc.hQ <= 238 && C_Client_mc.hP >= C_Client_mc.ai - 23 && C_Client_mc.hP <= C_Client_mc.ai - 6) {
            var3 = true;
            this.l.b(C_Client_mc.hP - 25, C_Client_mc.hQ - 15, " Epic bosses");
         }
      } else if (C_Client_mc.hQ >= 89 && C_Client_mc.hQ <= 107 && C_Client_mc.hP >= 744 && C_Client_mc.hP <= 759) {
         var3 = true;
         this.l.b(180, C_Client_mc.hQ, " Epic bosses");
      }

      this.b[var3 ? 12 : 11].f(var1, var2);
      this.b[20].f(var1, var2);
   }

   private void t() {
      int var1 = 724;
      int var2 = 140;
      if (rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
         short var4 = 228;
         byte var5 = 114;
         if (C_Client_mc.ah <= 649) {
            var1 = var4 + (C_Client_mc.ai - 275);
            var2 = var5 + 76;
         } else {
            var1 = var4 + (C_Client_mc.ai - 250);
            var2 = var5 + 168;
         }
      }

      boolean var3 = false;
      if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
         if (C_Client_mc.ah <= 649) {
            if (C_Client_mc.hQ >= 192 && C_Client_mc.hQ <= 211 && C_Client_mc.hP >= C_Client_mc.ai - 23 - 23 && C_Client_mc.hP <= C_Client_mc.ai - 6 - 23) {
               var3 = true;
               this.l.b(C_Client_mc.hP - 25, C_Client_mc.hQ - 15, " Heal");
            }
         } else if (C_Client_mc.hQ >= 281 && C_Client_mc.hQ <= 301 && C_Client_mc.hP >= C_Client_mc.ai - 23 && C_Client_mc.hP <= C_Client_mc.ai - 6) {
            var3 = true;
            this.l.b(C_Client_mc.hP - 25, C_Client_mc.hQ - 15, " Heal");
         }
      } else if (C_Client_mc.hQ >= 141 && C_Client_mc.hQ <= 161 && C_Client_mc.hP >= 721 && C_Client_mc.hP <= 736) {
         var3 = true;
         this.l.b(180, C_Client_mc.hQ, " Heal");
      }

      this.b[var3 ? 12 : 11].f(var1, var2);
      this.b[17].f(var1 + 1, var2 + 5);
   }

   private void u() {
      int var1 = 747;
      int var2 = 140;
      if (rs.p_f.C_a.ai != rs.p_f.C_a.c.a) {
         short var4 = 228;
         short var5 = 140;
         if (C_Client_mc.ah <= 609) {
            var1 = var4 + (C_Client_mc.ai - 275);
            var2 = var5 + 76;
         } else {
            var1 = var4 + (C_Client_mc.ai - 250);
            var2 = var5 + 108;
         }
      }

      boolean var3 = false;
      if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
         if (C_Client_mc.ah <= 609) {
            if (C_Client_mc.hQ >= 219 && C_Client_mc.hQ <= 238 && C_Client_mc.hP >= C_Client_mc.ai - 23 - 23 && C_Client_mc.hP <= C_Client_mc.ai - 6 - 23) {
               var3 = true;
               this.l.b(C_Client_mc.hP - 15, C_Client_mc.hQ - 15, " Refill potions");
            }
         } else if (C_Client_mc.hQ >= 250 && C_Client_mc.hQ <= 269 && C_Client_mc.hP >= C_Client_mc.ai - 23 && C_Client_mc.hP <= C_Client_mc.ai - 6) {
            var3 = true;
            this.l.b(C_Client_mc.hP - 15, C_Client_mc.hQ - 15, " Refill potions");
         }
      } else if (C_Client_mc.hQ >= 141 && C_Client_mc.hQ <= 161 && C_Client_mc.hP >= 744 && C_Client_mc.hP <= 759) {
         var3 = true;
         this.l.b(180, C_Client_mc.hQ, " Refill potions");
      }

      this.b[var3 ? 12 : 11].f(var1, var2);
      this.b[18].f(var1, var2 + 4);
   }

   private int d(int var1) {
      if (var1 >= 75) {
         return 65280;
      } else if (var1 >= 50 && var1 <= 74) {
         return 16776960;
      } else {
         return var1 >= 25 && var1 <= 49 ? 16750623 : 16711680;
      }
   }

   private int e(int var1) {
      if (var1 <= 100 && var1 >= 97) {
         return 0;
      } else if (var1 <= 96 && var1 >= 93) {
         return 1;
      } else if (var1 <= 92 && var1 >= 89) {
         return 2;
      } else if (var1 <= 88 && var1 >= 85) {
         return 3;
      } else if (var1 <= 84 && var1 >= 81) {
         return 4;
      } else if (var1 <= 80 && var1 >= 77) {
         return 5;
      } else if (var1 <= 76 && var1 >= 73) {
         return 6;
      } else if (var1 <= 72 && var1 >= 69) {
         return 7;
      } else if (var1 <= 68 && var1 >= 65) {
         return 8;
      } else if (var1 <= 64 && var1 >= 61) {
         return 9;
      } else if (var1 <= 60 && var1 >= 57) {
         return 10;
      } else if (var1 <= 56 && var1 >= 53) {
         return 11;
      } else if (var1 <= 52 && var1 >= 49) {
         return 12;
      } else if (var1 <= 48 && var1 >= 45) {
         return 13;
      } else if (var1 <= 44 && var1 >= 41) {
         return 14;
      } else if (var1 <= 40 && var1 >= 37) {
         return 15;
      } else if (var1 <= 36 && var1 >= 33) {
         return 16;
      } else if (var1 <= 32 && var1 >= 29) {
         return 17;
      } else if (var1 <= 28 && var1 >= 25) {
         return 18;
      } else if (var1 <= 24 && var1 >= 21) {
         return 19;
      } else if (var1 <= 20 && var1 >= 17) {
         return 20;
      } else if (var1 <= 16 && var1 >= 13) {
         return 21;
      } else if (var1 <= 12 && var1 >= 9) {
         return 22;
      } else if (var1 <= 8 && var1 >= 7) {
         return 23;
      } else if (var1 <= 6 && var1 >= 5) {
         return 24;
      } else if (var1 <= 4 && var1 >= 3) {
         return 25;
      } else if (var1 <= 2 && var1 >= 1) {
         return 26;
      } else {
         return var1 <= 0 ? 27 : 0;
      }
   }

   private void a(Graphics2D var1, int var2, int var3, double var4, Color var6) {
      if (!(var4 < 0.01)) {
         var1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         var1.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
         Rectangle var7 = new Rectangle(var2, var3 - 7, 45, 45);
         Double var8 = new Double((double)(var7.x + 27), (double)var7.y + ((double)(var7.height / 2) - 13.0), 26.0, 26.0, 90.0, -360.0 * var4, 0);
         BasicStroke var9 = new BasicStroke(2.0F, 0, 0);
         var1.setStroke(var9);
         var1.setColor(var6);
         var1.draw(var8);
      }
   }

   public int e() {
      return this.n;
   }

   public boolean f() {
      return this.n == 1;
   }

   public boolean g() {
      return this.n == 2;
   }

   public void b(int var1) {
      this.n = var1;
   }

   public boolean h() {
      return rs.p_f.C_a.bc;
   }

   public void a(boolean var1) {
      boolean var2 = rs.p_f.C_a.bc;
      rs.p_f.C_a.bc = var1;
      if (var2 != var1) {
         if (C_Client_mc.aj()) {
            this.l.j();
         }

         C_d.a();
      }
   }

   private static enum a {
      a(true, 0, 10, 9),
      b(1, 6, 6),
      c(2, 7, 7),
      d(3, 4, 4),
      e(4, 4, 2),
      f(5, 5, 2),
      g(true, 6, 6, 6),
      h(true, 7, 8, 4),
      i(8, 4, 6),
      j(9, 5, 7),
      k(10, 6, 3),
      l(11, 4, 6),
      m(12, 7, 4),
      n(true, 13, 6, 5);

      private final boolean o;
      private final int p;
      private final int q;
      private final int r;

      private a(int var3, int var4, int var5) {
         this.o = false;
         this.p = var3;
         this.q = var4;
         this.r = var5;
      }

      private a(boolean var3, int var4, int var5, int var6) {
         this.o = var3;
         this.p = var4;
         this.q = var5;
         this.r = var6;
      }

      public static C_b.a a(int var0) {
         for (C_b.a var4 : values()) {
            if (var4.p == var0) {
               return var4;
            }
         }

         return null;
      }
   }

   public static enum b {
      a,
      b;
   }
}

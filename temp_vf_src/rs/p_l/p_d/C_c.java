package rs.p_l.p_d;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import rs.C_Client_mc;
import rs.C_O_uc;
import rs.p_gui.C_Launcher_mc;
import rs.p_l.C_F_uc;
import rs.p_l.C_g;

public class C_c implements Runnable {
   private static final String k = "/assets/";
   public static boolean a = true;
   public static boolean b = true;
   private static final int l = 25;
   private static final int m = 125;
   private static final int n = 405;
   private static final int o = 280;
   private static final int p = 130;
   private static final int q = 50;
   private static final int r = 82;
   private static final int s = 10;
   public static int c = 225;
   public static int d = 75;
   public static final int e = 0;
   public static final String f = "@or1@";
   public static final String g = "@yel@";
   public static final Color h = new Color(34, 255, 0);
   public static final Color[] i = new Color[]{Color.WHITE, Color.YELLOW};
   private List<C_a> t = new ArrayList<>();
   private C_c.a u;
   private C_Client_mc v;
   private C_b w;
   private C_b x;
   private C_b y;
   private C_b z;
   private int A;
   private boolean B;
   private String C;
   private C_F_uc D;
   private C_F_uc E;
   private C_F_uc F;
   private C_F_uc G;
   private C_F_uc H;
   private C_F_uc I;
   private rs.p_l.C_b J;
   private C_g K;
   private C_g L;
   private C_g M;
   private C_g N;
   private C_g O;
   private C_g P;
   private C_g Q;
   private C_g R;
   private C_g S;
   private String T;
   private String U;
   private int V;
   private int W;
   private int X;
   private int Y;
   private boolean Z;
   private boolean aa;
   private boolean ab;
   private boolean ac;
   private boolean ad;
   private int ae;
   private int af;
   private int ag = 0;
   private int ah;
   private int ai;
   private int aj;
   private int ak;
   public boolean j = false;
   private boolean al;
   private String am = null;
   private String an = null;
   private String ao = null;
   private boolean ap = true;
   private long aq = System.currentTimeMillis();
   private int ar = 3;
   private int as = 410;
   private int at = 0;
   private boolean au = false;
   private int av;

   public C_c(C_Client_mc var1) {
      String var2 = !h.equals(new Color(34, 255, 0)) ? "custom/" : "";
      this.u = C_c.a.a;
      this.U = "@or1@Login";
      this.T = "@or1@Exit";
      this.v = var1;
      this.aa = true;
      this.ab = true;
      this.J = new rs.p_l.C_b(new C_F_uc("/assets/", "bg"), new C_F_uc("/assets/", "bg 2"), 6);
      this.I = new C_F_uc("/assets/", "glow");
      new C_F_uc("/assets/" + var2, "textbox 2", new Color(34, 255, 0), h);
      new C_F_uc("/assets/", "textbox");
      this.O = new C_g(var1, new C_F_uc("/assets/", "textbox"), new C_F_uc("/assets/" + var2, "textbox 2", new Color(34, 255, 0), h), 50, 2);
      this.P = new C_g(var1, new C_F_uc("/assets/", "textbox"), new C_F_uc("/assets/" + var2, "textbox 2", new Color(34, 255, 0), h), 50, 2);
      this.R = new C_g(var1, new C_F_uc("/assets/", "textbox"), new C_F_uc("/assets/" + var2, "textbox 2", new Color(34, 255, 0), h), 50, 2);
      this.Q = new C_g(var1, new C_F_uc("/assets/", "textbox"), new C_F_uc("/assets/" + var2, "textbox 2", new Color(34, 255, 0), h), 50, 2);
      new C_F_uc("/assets/" + var2, "button", new Color(34, 255, 0), h);
      C_F_uc var4 = new C_F_uc("/assets/" + var2, "button", new Color(34, 255, 0), h);
      var4.c(255, 255, 255);
      new C_F_uc("/assets/" + var2, "button 2", new Color(34, 255, 0), h);
      this.L = new C_g(var1, var4, new C_F_uc("/assets/" + var2, "button 2", new Color(34, 255, 0), h), 85, 4);
      this.M = new C_g(var1, var4, new C_F_uc("/assets/" + var2, "button 2", new Color(34, 255, 0), h), 85, 4);
      this.K = new C_g(var1, new C_F_uc("/assets/", "box"), new C_F_uc("/assets/", "box 2"), 85, 4);
      new C_F_uc("/assets/" + var2, "box 3", new Color(34, 255, 0), h);
      this.N = new C_g(var1, new C_F_uc("/assets/", "box 2"), new C_F_uc("/assets/" + var2, "box 3", new Color(34, 255, 0), h), 85, 4);
      this.S = new C_g(var1, new C_F_uc("/assets/", "updatebar"), new C_F_uc("/assets/", "updatebar2"), 45, 1);
      Color var5 = new Color(71, 213, 71);
      Color var6 = new Color(34, 255, 0).equals(h) ? var5 : h;
      new C_F_uc("/assets/" + var2, "loadbar", var5, var6);
      this.E = new C_F_uc("/assets/" + var2, "loadbar", var5, var6);
      this.G = new C_F_uc("/assets/", "newsbar");
      this.H = new C_F_uc("/assets/", "updatebaricon");
      this.D = new C_F_uc("/assets/", "messagebox");
      this.F = new C_F_uc("/assets/", "loadframe");
      this.z = new C_b(var1, this.D, "It will be your account's PIN before October 2024", "If you do not remember it, request help on our forums!", false);
   }

   @Override
   public void run() {
      if (!rs.p_l.p_b.p_a.C_d.c) {
         C_Launcher_mc.n().i().addMouseListener(new C_d(this));
      }

      while (true) {
         while (this.v == null || !a) {
            try {
               Thread.sleep(1000L);
            } catch (InterruptedException var2) {
               var2.printStackTrace();
            }
         }

         this.a();
      }
   }

   public void a() {
      try {
         if (a) {
            if (!C_Client_mc.bR && C_Client_mc.i) {
            }

            if (!this.v.fc && !this.v.bZ) {
               this.al = true;
               if (!this.v.bt) {
                  this.b();
               }
            } else if (this.al) {
               this.w = null;
               this.al = false;
            }

            try {
               Thread.sleep(25L);
            } catch (InterruptedException var2) {
               var2.printStackTrace();
            }
         } else {
            this.b();
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   private void d() {
      this.J.a(0, 0);
      this.I.g(0, 0, this.at);
      boolean var1 = C_Client_mc.ff % 3 == 0;
      if (this.au) {
         if (var1) {
            this.at -= 2;
         }

         if (this.at <= 0) {
            this.at = 0;
            this.au = false;
         }
      } else {
         if (var1) {
            this.at++;
         }

         if (this.at >= 100) {
            this.au = true;
         }
      }

      if (this.t.size() == 0) {
         int var2 = 0;
         int var3 = 0;
         byte var4 = 75;

         for (int var5 = 0; var5 < var4; var5++) {
            C_F_uc var6 = new C_F_uc("/assets/", "orb 1");
            var2 += 200;
            if (var2 >= this.v.hE) {
               var3 += C_Client_mc.c(0, var6.o * 2);
               var2 = C_Client_mc.c(0, var6.n * 2);
            }

            this.t.add(new C_a(this.v, var2, var3, var5 * 2048 / var4));
         }
      }

      for (C_a var9 : this.t) {
         if (var9.c() == 1) {
            this.a(var9);
         }
      }

      this.g();
      if (this.A == 0 && this.C != null) {
         this.A = (int)((double)this.C.length() * 3.75);
      }

      this.W = 480;
      if (this.V < -1 * this.A) {
         this.V = 800;
      }

      this.V--;
      this.G.c(0, this.W - 18);
      if (C_Client_mc.gl != null) {
         C_Client_mc.gl.b(this.C, this.V, this.W, 16777215, 0);
      }

      for (C_a var10 : this.t) {
         if (var10.c() == 2) {
            this.a(var10);
         }
      }

      if (this.v.gn != null && this.v.gm != null) {
         if (this.am != null) {
            if (rs.p_f.C_a.bg.equals(this.ao)) {
               this.ap = false;
            } else {
               if (System.currentTimeMillis() - this.aq >= 5000L || this.S.c() == 0 && !this.ap || this.S.c() >= this.S.d() - 1 && this.ap) {
                  this.ap = !this.ap;
                  this.aq = System.currentTimeMillis();
               }

               if (this.S.b(this.ar, this.as)) {
                  this.aq = System.currentTimeMillis() - 10000L;
                  this.ap = true;
               }
            }

            this.S.a(this.ar, this.as, this.ap || this.S.b(this.ar, this.as));
            this.H.f(this.ar + 2, this.as + 2);
            this.v.gn.b("@or2@<u=16742912>Latest Update</u> <img=329>", this.ar + 50, this.as + 15 + 2, 16777215, 0);
            this.v.gm.b(this.am, this.ar + 50, this.as + 34 + 2, 16777215, 0);
         } else {
            this.S.a(this.ar, this.as, false);
            this.H.f(this.ar + 2, this.as + 2);
            this.v.gn.b("@or2@<u=16742912>Latest Update", this.ar + 50, this.as + 15 + 2, 16777215, 0);
            this.v.gm.b("<img=291> Loading..", this.ar + 50, this.as + 34 + 2, 16777215, 0);
         }
      }
   }

   public void b() {
      this.h();
      this.e();
      if (this.aa || this.Y == 62 || this.Y == 125) {
         if (rs.p_l.p_b.p_a.C_d.c) {
            if (this.u == C_c.a.a) {
               this.v.w();
               this.v.gZ.a();
               short var12 = 145;
               short var17 = 200;
               if (this.x != null) {
                  this.x.a(var12 + 80);
                  this.x.b(var17 - 65);
                  this.x.b();
               }

               this.F.c(var12, var17);
               int var19 = (int)((double)this.E.n * ((double)this.X / 100.0));
               this.E.a(var12, var17, var19, this.E.o);
               this.v.gZ.a(0, this.v.hG, 0);
               this.aa = true;
            } else {
               if (rs.p_l.p_b.p_a.C_d.b == null) {
                  rs.p_l.p_b.p_a.C_d.b = new rs.p_l.p_b.p_a.C_d(this.v);
               }

               rs.p_l.p_b.p_a.C_d.b.d();
            }
         } else {
            this.v.w();
            this.v.gZ.a();
            this.d();
            if (this.u == C_c.a.a) {
               short var1 = 145;
               short var2 = 200;
               if (this.x != null) {
                  this.x.a(var1 + 80);
                  this.x.b(var2 - 65);
                  this.x.b();
               }

               this.F.c(var1, var2);
               int var3 = (int)((double)this.E.n * ((double)this.X / 100.0));
               this.E.a(var1, var2, var3, this.E.o - 5);
            } else {
               int var9 = 280;
               int var13 = 130;
               String var18 = this.v.fk;
               String var4 = C_O_uc.e(this.v.fl);
               String var5 = C_Client_mc.fn;
               String var6 = this.v.fm;
               if (this.w != null && this.w.c()) {
                  if (b) {
                     this.w.b(d);
                     this.w.a(c);
                  } else {
                     this.w.b(200);
                     this.w.a(225);
                  }

                  this.w.b();
               }

               if (b) {
                  if (this.Y <= 62 && this.ab) {
                     if (this.v.fD == 0) {
                        var18 = var18 + "@yel@|";
                     } else if (this.v.fD == 1) {
                        var4 = var4 + "@yel@|";
                     } else if (this.v.fD == 2) {
                        var5 = var5 + "<col=@or1@>|";
                     } else if (this.v.fD == 3) {
                        var6 = var6 + "@yel@|";
                     }
                  }

                  var13 += 0;
                  int var7 = rs.p_f.C_a.h ? 70 : 80;
                  if (this.j) {
                     byte var8 = 75;
                     this.Q.a(var9, var13 + var8, this.v.fD == 3);
                     this.v.gm.b("@or1@<img=144> 5-digit PIN:", var9 + 10, var13 + 16 + var8, 16777215, 0);
                     this.v.gm.b("@whi@" + var6, var9 + 10, var13 + 44 + var8, 16777215, 0);
                     this.z.b(135);
                     this.z.b();
                  } else {
                     this.O.a(var9, var13, this.v.fD == 0);
                     this.P.a(var9, var13 + var7, this.v.fD == 1);
                     if (rs.p_f.C_a.h) {
                        this.R.a(var9, var13 + var7 + var7, this.v.fD == 2);
                     }

                     this.v.gm.b("@or1@<img=179> Username:", var9 + 10, var13 + 16, 16777215, 0);
                     this.v.gm.b("@whi@" + var18, var9 + 10, var13 + 44, 16777215, 0);
                     this.v.gm.b("@or1@<img=144> Password", var9 + 10, var13 + 16 + var7, 16777215, 0);
                     this.v.gm.b("@whi@" + var4, var9 + 10, var13 + 44 + var7, 16777215, 0);
                     if (rs.p_f.C_a.h) {
                        this.v.gm.b("<col=@or1@>Invitation code:", var9 + 10, var13 + 16 + var7 + var7, 1048320, 0);
                        this.v.gm.b("@whi@" + var5, var9 + 10, var13 + 44 + var7 + var7, 1048320, 0);
                     }
                  }

                  var9 += 125;
                  var13 += 150;
                  this.L.a(var9, var13 + (rs.p_f.C_a.h ? 60 : 0));
                  this.v.gm.b("@or1@Log in", var9 + 30, var13 + 30 + (rs.p_f.C_a.h ? 60 : 0), 16777215, 0);
               }
            }

            for (C_a var16 : this.t) {
               if (var16.c() >= 3) {
                  this.a(var16);
               }
            }

            this.v.gZ.a(0, this.v.hG, 0);
            this.aa = true;
         }
      }
   }

   private void e() {
      int var1 = 280 + (rs.p_f.C_a.h ? 60 : 0);
      this.ai = var1 + 25;
      this.ac = this.u == C_c.a.b && b && this.L.b(405, var1);
      if (this.ac) {
         this.ae = this.ae + 10 & 2047;
      }

      this.aj = C_Client_mc.hP;
      this.ak = C_Client_mc.hQ;
      this.ad = this.u == C_c.a.b && b && this.v.bj() && this.aj >= 0 && this.ak >= 0;
      if (this.ad) {
         this.af = this.af + 10 & 2047;
      }

      int var2 = this.v.bk();
      if (this.ad && var2 != this.ah && this.f()) {
         this.ag = (this.ag + 1) % 5;
      }

      this.ah = var2;
   }

   private boolean f() {
      for (C_a var2 : this.t) {
         if (var2.a()) {
            return true;
         }
      }

      return false;
   }

   private void a(C_a var1) {
      var1.a(this.ac, this.ae, 470, this.ai, 82, this.ad, this.af, this.aj, this.ak, 82, this.ag);
   }

   public void a(int var1, int var2, int var3, int var4, int var5) {
      String var6 = "@whi@";
      this.T = "@or1@Exit";
      if (var3 >= 281 && var3 <= 330 && var2 >= 273 && var2 <= 400) {
         this.T = var6 + "Exit";
      }

      if (var1 == 1) {
         if (var3 >= 281 + (rs.p_f.C_a.h ? 80 : 0) + 0 && var3 <= 330 + (rs.p_f.C_a.h ? 80 : 0) + 0 && var2 >= 408 && var2 <= 535) {
            this.a(false);
         }

         if (this.am != null && this.an != null && this.S.b(this.ar, this.as)) {
            C_Client_mc.f(this.an);
            if (this.ao != null) {
               rs.p_f.C_a.bg = this.ao;
               rs.p_f.C_a.d();
            }
         }

         if (this.T.startsWith(var6)) {
         }

         if (!this.j) {
            if (var4 >= 278 && var4 <= 539 && var5 >= 133 && var5 <= 192) {
               this.v.fD = 0;
            }

            if (var4 >= 278 && var4 <= 539 && var5 >= 210 && var5 <= 266) {
               this.v.fD = 1;
            }

            if (rs.p_f.C_a.h && var4 >= 278 && var4 <= 539 && var5 >= 290 && var5 <= 346) {
               this.v.fD = 2;
            }
         }
      }
   }

   public void a(boolean var1) {
      if (!this.v.fc) {
         if (C_Launcher_mc.n().f().a("LOGIN_COOLDOWN", 500L)) {
            this.a("<img=291> Attempting to login to game server", "Please wait..", false);
            this.b();
            this.ab = false;
            this.w = null;
            this.v.el = 0;
            this.v.a(this.v.fk, this.v.fl, var1);
            this.ab = true;
         }
      }
   }

   public void a(int var1) {
      this.z.a("It will be your account's PIN before October 2024", "If you do not remember it, request help on our forums!");
      if (var1 == 0) {
         this.a("This username registered before SPK's Fresh Start!", "@yel@Please enter your Recovery PIN to verify ownership", false);
         this.z.a(false);
         this.z.a();
      } else if (var1 == 1) {
         this.a("@yel@Invalid Recovery PIN!", "Please try again..", true);
         this.z.a(true);
         this.z.a();
      } else if (var1 == 2) {
         this.a("@yel@Invalid Recovery PIN!", "You have exceeded the maximum attempts", true);
         this.z.a(true);
         this.z.a();
         this.z.a("Please try again in a few minutes..", "If you do not remember it, request help on our forums!");
      }

      this.v.fD = 3;
      this.ab = true;
      this.j = true;
   }

   public void a(int var1, String var2, String var3) {
      this.X = var1;
      this.x = new C_b(this.v, this.D, var2, var3, false);
   }

   public void a(String var1, String var2) {
      if (var1.contains("new players")) {
         var1 = "<img=286> " + var1;
         c = 3;
         d = 354;
      } else {
         d = 75;
         c = 225;
      }

      this.w = new C_b(this.v, this.D, var1, var2, true);
   }

   public void a(String var1, String var2, boolean var3) {
      if (var1.contains("new players")) {
         var1 = "<img=286> " + var1;
         c = 0;
         d = 350;
      } else {
         d = 75;
         c = 225;
      }

      this.w = new C_b(this.v, this.D, var1, var2, var3);
   }

   private void g() {
      if (this.C == null && !this.B) {
         C_e var1 = new C_e(this);
         var1.start();
         this.B = true;
      }
   }

   private void h() {
      if (this.Y > 0) {
         this.Y--;
      } else {
         this.Y = 125;
      }
   }

   public void a(C_c.a var1) {
      this.u = var1;
   }

   public boolean c() {
      return this.al;
   }

   public static enum a {
      a,
      b;
   }
}

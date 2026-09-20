package rs.p_l.p_b.p_a;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import rs.C_Client_mc;
import rs.C_V_uc;
import rs.p_a.C_h;
import rs.p_d.C_k;
import rs.p_gui.C_Launcher_mc;
import rs.p_l.C_C_uc;
import rs.p_l.C_E_uc;
import rs.p_l.p_e.C_f;
import rs.p_n.p_c.C_Y_uc;
import rs.p_n.p_c.C_ap;

public class C_d {
   public static int a = 10275839;
   public static C_d b;
   public static boolean c = false;
   public static boolean d = false;
   public static boolean e = true;
   public C_Client_mc f;
   public int g = 0;
   public int h = 0;
   public int i = 0;
   private int n = 0;
   private int o = 0;
   private int p = 6208;
   private int q = 6208;
   private int r = 0;
   private boolean s = false;
   public boolean j = true;
   public int k = 0;
   private List<rs.p_l.p_b.p_a.p_a.C_a> t = new ArrayList<>();
   private List<rs.p_l.p_b.p_a.p_b.C_a> u = new ArrayList<>();
   public Graphics2D l;
   private boolean v;
   public static int m = 81;
   private static final int[] w = new int[]{163, 206, 221, 63, 56, 71};
   private int x = 0;
   private long y = 0L;
   private boolean z = false;

   public C_d(C_Client_mc var1) {
      this.f = var1;
   }

   public void a() {
      C_Client_mc.al = 600;
      this.f.gq = 0;
      this.f.eU = 0;
      this.f.ft = 0;
      this.f.dp = 0;
      this.p = 6208;
      this.q = 6208;
      this.r = 0;
      this.g = 0;
      this.h = 0;
      this.i = 0;
      this.a("bg gray");
   }

   public void b() {
      if (this.z) {
         if (System.currentTimeMillis() - this.y >= 2500L) {
            if (this.x >= w.length) {
               this.z = false;
               return;
            }

            m = w[this.x];
            this.f();
            this.c("@whi@Sample texture ID: @gre@" + m);
            this.x++;
            this.y = System.currentTimeMillis();
         }
      }
   }

   public void c() {
      this.z = true;
      this.x = 0;
   }

   public void d() {
      d = true;
      int var1 = this.f.B().getWidth();
      int var2 = this.f.B().getHeight();
      if (this.n != var1 || this.o != var2 || this.f.gZ == null) {
         if (!this.s) {
            this.a();
            this.f.I();
            this.f.d();
            this.f.a(rs.p_f.C_a.ai);
            C_Y_uc.m(32001);
            C_ap.j();
            C_ap.i();
            this.f.fc = false;
            this.s = true;
         }

         this.a(var1, var2);
      }

      this.f.gZ.a();
      if (this.f.ck != 0) {
         this.f.ha = null;
         this.f.ck = 0;
      }

      if (this.f.fX == 3) {
         C_Client_mc.fM = true;
      }

      if (this.f.eA == 3) {
         C_Client_mc.fM = true;
      }

      if (this.f.cD != null) {
         C_Client_mc.fM = true;
      }

      if (C_Client_mc.fM) {
         C_Client_mc.fM = false;
      }

      C_Client_mc.gf++;
      this.f.dE++;
      this.f.g(this.p, this.q);
      C_Client_mc.dZ = 0;
      if (!this.f.fe) {
         int var3 = this.f.fs;
         if (this.f.dQ / 256 > var3) {
            var3 = this.f.dQ / 256;
         }

         if (this.f.dh[4] && this.f.fy[4] + 128 > var3) {
            var3 = this.f.fy[4] + 128;
         }

         int var4 = this.f.ft + this.f.dp & 2047;
         byte var5 = -50;
         this.f.b(C_Client_mc.al + var3 * 3, var3, this.f.eb + this.g, this.f.c(C_Client_mc.dw, this.q, this.p) + var5 + this.i, var4, this.f.ec + this.h);
      }

      byte var20 = 0;
      int var21 = C_Client_mc.cJ;
      int var22 = C_Client_mc.cK;
      int var6 = C_Client_mc.cL;
      int var7 = this.f.cR;
      int var8 = this.f.cS;

      for (int var9 = 0; var9 < 5; var9++) {
         if (this.f.dh[var9]) {
            int var10 = (int)(
               Math.random() * (double)(this.f.dg[var9] * 2 + 1)
                  - (double)this.f.dg[var9]
                  + Math.sin((double)this.f.eg[var9] * ((double)this.f.dy[var9] / 100.0)) * (double)this.f.fy[var9]
            );
            if (var9 == 0) {
               C_Client_mc.cJ += var10;
            }

            if (var9 == 1) {
               C_Client_mc.cK += var10;
            }

            if (var9 == 2) {
               C_Client_mc.cL += var10;
            }

            if (var9 == 3) {
               this.f.cS = this.f.cS + var10 & 2047;
            }

            if (var9 == 4) {
               this.f.cR += var10;
               if (this.f.cR < 128) {
                  this.f.cR = 128;
               }

               if (this.f.cR > 383) {
                  this.f.cR = 383;
               }
            }
         }
      }

      int var23 = C_E_uc.A;
      C_h.bt = true;
      C_h.bw = 0;
      C_h.bu = C_Client_mc.hP - (rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 4 : 0);
      C_h.bv = C_Client_mc.hQ - (rs.p_f.C_a.ai == rs.p_f.C_a.c.a ? 4 : 0);
      rs.p_l.C_c.d();
      rs.p_l.C_c.a(0, 0, var1, var2, a, 255);
      this.f.dF.a(C_Client_mc.cJ, C_Client_mc.cL, this.f.cS, C_Client_mc.cK, var20, this.f.cR);
      this.l = rs.p_l.C_c.a(rs.p_l.C_c.g, rs.p_l.C_c.h, rs.p_l.C_c.i);
      int var24 = 0;
      ArrayList var11 = new ArrayList();

      for (int var12 = 0; var12 < this.t.size(); var12++) {
         this.t.get(var12).e(var12);
         if (this.t.get(var12).h()) {
            var24++;
         }
      }

      ArrayList var25 = new ArrayList<>(this.t);
      var25.sort(new C_e(this));

      for (rs.p_l.p_b.p_a.p_a.C_a var14 : (java.util.List<rs.p_l.p_b.p_a.p_a.C_a>)(java.util.List<?>)var25) {
         var14.a();
         if (!var14.l()) {
            var11.add(var14);
         }
      }

      for (rs.p_l.p_b.p_a.p_a.C_a var28 : (java.util.List<rs.p_l.p_b.p_a.p_a.C_a>)(java.util.List<?>)var11) {
         this.t.remove(var28);
      }

      this.f.dF.d();
      Iterator var27 = this.u.iterator();
      byte var29 = 5;
      int var15 = var2 - 7;
      byte var16 = -17;

      while (var27.hasNext()) {
         rs.p_l.p_b.p_a.p_b.C_a var17 = (rs.p_l.p_b.p_a.p_b.C_a)var27.next();
         if (var17.a()) {
            var17.a(var29, var15);
            var15 += var16;
         } else {
            var27.remove();
         }
      }

      if (rs.p_f.C_a.az && !rs.p_f.C_a.ah) {
         for (int var30 = 0; var30 < C_Client_mc.by.length; var30++) {
            if (C_Client_mc.by[var30].b().size() > 0) {
               C_Client_mc.by[var30].a();
            }
         }
      }

      int var31 = 20;
      if (e) {
         C_Client_mc.gl.a("@whi@Camera pos: @yel@" + C_Client_mc.cJ + ", " + C_Client_mc.cL, var1 - 5, var31, 0, 0);
         String var10001 = "@whi@Camera curve: @yel@" + this.f.cS + ", " + this.f.cR;
         int var10002 = var1 - 5;
         var31 += 15;
         C_Client_mc.gl.a(var10001, var10002, var31, 0, 0);
         var10001 = "@whi@Camera zoom: @yel@" + C_Client_mc.al;
         var10002 = var1 - 5;
         var31 += 15;
         C_Client_mc.gl.a(var10001, var10002, var31, 0, 0);
         rs.p_l.C_h var39 = C_Client_mc.gl;
         var10001 = "@whi@Total entities: @yel@" + this.t.size();
         var10002 = var1 - 5;
         var31 += 15;
         var39.a(var10001, var10002, var31, 0, 0);
         var10001 = "@whi@Selected entities: @yel@" + var24;
         var10002 = var1 - 5;
         var31 += 15;
         C_Client_mc.gl.a(var10001, var10002, var31, 0, 0);
      }

      this.f.f(var23);
      this.b();

      for (C_f var19 : C_f.k) {
         var19.a(this.f, C_f.Mode.b);
      }

      for (C_f var37 : C_f.l) {
         var37.a(this.f, C_f.Mode.b);
      }

      if (C_Client_mc.w.b) {
         C_Client_mc.w.b();
      }

      if (C_f.j.a(this.f)) {
         C_f.j.a(this.f, C_f.Mode.b);
      }

      this.f.gZ.a(0, this.f.hG, 0);
      C_Client_mc.cJ = var21;
      C_Client_mc.cK = var22;
      C_Client_mc.cL = var6;
      this.f.cR = var7;
      this.f.cS = var8;
      this.f.dE = 0;
      this.j = false;
      C_Client_mc.ab.c.clear();
      if (this.v) {
         this.f.a(1, "Loading - please wait.", null);
         this.f.gZ.a();
         this.f.gZ.a(0, this.f.hG, 0);
         rs.p_d.C_d.M.a();
         rs.p_d.C_d.N.a();
         C_Client_mc.M();
         C_k.b = new rs.p_t.p_a.C_d();
         C_k.b.a();
         C_k.k.a();
         C_k.l.a();
         this.f.b();
         this.v = false;
      }
   }

   public void a(String var1, String[] var2) {
      if (var1.equalsIgnoreCase("script")) {
         this.c();
      }

      for (int var3 = 0; var3 < this.t.size(); var3++) {
         if (var1.startsWith("e" + (var3 + 1) + ".") || var1.startsWith("player.") || var1.startsWith("p.") || var1.startsWith("npc.")) {
            rs.p_l.p_b.p_a.p_a.C_a var4 = this.t.get(var3);
            String var5 = var1.replace("e" + (var3 + 1), "").substring(1);
            if (var1.startsWith("player.") || var1.startsWith("p.")) {
               if (!(var4 instanceof rs.p_l.p_b.p_a.p_a.C_d)) {
                  continue;
               }

               var5 = var1.startsWith("player.") ? var1.replace("player", "").substring(1) : var1.substring(2);
            }

            if (var1.startsWith("npc.") || var1.startsWith("n.")) {
               if (!(var4 instanceof rs.p_l.p_b.p_a.p_a.C_c)) {
                  continue;
               }

               var5 = var1.startsWith("npc.") ? var1.replace("npc", "").substring(1) : var1.substring(2);
            }

            if (var4 instanceof rs.p_l.p_b.p_a.p_a.C_d) {
               C_c.a(var5, var2, (rs.p_l.p_b.p_a.p_a.C_d)var4);
            }

            if (var4 instanceof rs.p_l.p_b.p_a.p_a.C_c) {
               C_b.a(var5, var2, (rs.p_l.p_b.p_a.p_a.C_c)var4);
            }

            String var6 = var5.toLowerCase();
            switch (var6) {
               case "x":
                  var4.a(var4.d() + Integer.parseInt(var2[0]));
                  break;
               case "y":
                  var4.b(var4.e() + Integer.parseInt(var2[0]));
                  break;
               case "left":
               case "l":
                  var4.a(var4.d() - 100);
                  break;
               case "right":
               case "r":
                  var4.a(var4.d() + 100);
                  break;
               case "up":
               case "u":
                  var4.b(var4.e() - 100);
                  break;
               case "down":
               case "d":
                  var4.b(var4.e() + 100);
                  break;
               case "set_anim":
               case "anim":
               case "setanim":
                  int var8 = Integer.parseInt(var2[0]);
                  var4.d(var8);
                  b("@whi@<img=24> @gre@Entity #" + (var3 + 1) + "@whi@ animation set to @gre@" + var8 + "!");
            }
         }
      }

      String var12 = var1.toLowerCase();
      switch (var12) {
         case "delete":
         case "del":
            this.t.remove(Integer.parseInt(var2[0]) - 1);
            this.c("Deleted @red@Entity #" + Integer.parseInt(var2[0]));
            break;
         case "npc":
            int var14 = Integer.parseInt(var2[0]);
            rs.p_l.p_b.p_a.p_a.C_c var15 = new rs.p_l.p_b.p_a.p_a.C_c(var14);
            var15.e(this.t.size());
            var15.a(this.p);
            var15.b(this.q);
            this.t.add(var15);
            this.c("Added @gre@NPC @cya@(index " + (this.t.size() - 1) + ")");
            break;
         case "player":
            rs.p_l.p_b.p_a.p_a.C_d var16 = new rs.p_l.p_b.p_a.p_a.C_d();
            var16.e(this.t.size());
            var16.a(this.p);
            var16.b(this.q);
            this.t.add(var16);
            this.c("Added @gre@Player @cya@(index " + (this.t.size() - 1) + ")");
            break;
         case "item":
            int var17 = Integer.parseInt(var2[0]);
            this.c("Set the active item to: @gre@" + C_k.f(var17).w);
            this.t.removeIf(var0 -> var0 instanceof rs.p_l.p_b.p_a.p_a.C_b);
            this.t.add(new rs.p_l.p_b.p_a.p_a.C_b(var17));
            break;
         case "reset":
         case "wipe":
            this.a();
            this.t.clear();
            this.c("Entities cleared!");
            this.c("Camera reset!");
            break;
         case "reverse":
            Collections.reverse(this.t);
            this.c("Entity indices reversed!");
            break;
         case "hud":
            e = !e;
            this.c("HUD has been " + (e ? "@gre@Enabled" : "@red@Disabled"));
            break;
         case "background":
         case "bg":
            int var9 = -1;
            String var10 = var2[0].toLowerCase();
            switch (var10) {
               case "blue":
                  var9 = 10275839;
                  break;
               case "black":
                  var9 = 0;
                  break;
               case "white":
                  var9 = 16777215;
                  break;
               case "green":
                  var9 = 34560;
                  break;
               case "orange":
                  var9 = 16746240;
                  break;
               case "red":
                  var9 = 16719132;
                  break;
               case "gray":
               case "grey":
                  var9 = 9803411;
            }

            if (var9 == -1) {
               this.c("@red@Could not find BG color '" + var2[0] + "'");
            } else {
               this.c("@whi@Background color set to: " + var2[0]);
               a = var9;
            }
      }
   }

   public void e() {
      while (true) {
         int var1 = this.f.w(-796);
         if (var1 == -1) {
            return;
         }

         if (this.f.ac() && var1 == 96) {
            C_Client_mc.w.a();
            return;
         }

         if (C_Client_mc.w.b) {
            C_Client_mc.w.a(var1);
            C_Client_mc.fM = true;
            return;
         }

         if (var1 == 32 || var1 == 1002 || var1 == 1003) {
            rs.p_l.p_b.p_a.p_a.C_a var2 = null;

            for (rs.p_l.p_b.p_a.p_a.C_a var4 : this.t) {
               if (var4.h() || var4 instanceof rs.p_l.p_b.p_a.p_a.C_b) {
                  var2 = var4;
               }
            }

            if (var2 == null) {
               return;
            }

            if (var1 == 32) {
               int[] var5 = var2.j().keySet().stream().mapToInt(var0 -> var0).toArray();
               if (var2.m() >= var5.length) {
                  var2.f(var5.length - 1);
               }

               Integer var6 = var5[var2.m()];
               if (var2.k().contains(var6)) {
                  var2.k().remove(var6);
               } else {
                  var2.k().add(var6);
               }

               var2.f();
            }

            if (var1 == 1002) {
               var2.f(var2.m() + 1);
            }

            if (var1 == 1003) {
               var2.f(var2.m() - 1);
            }

            if (var2.m() > var2.j().keySet().size()) {
               var2.f(var2.j().keySet().size() - 1);
            }

            if (var2.m() < 0) {
               var2.f(0);
            }
         }
      }
   }

   public void a(int var1) {
      if (!C_Client_mc.w.b) {
         if (var1 == 23) {
            this.i -= 25;
         }

         if (var1 == 19) {
            this.i += 25;
         }

         byte var2 = 97;
         byte var3 = 100;
         byte var4 = 119;
         byte var5 = 115;
         if (var1 == var2) {
            this.p = this.p - 35 * (this.f.cS >= 500 && this.f.cS <= 1500 ? -1 : 1);
         }

         if (var1 == var3) {
            this.p = this.p + 35 * (this.f.cS >= 500 && this.f.cS <= 1500 ? -1 : 1);
         }

         if (var1 == var4) {
            this.q = this.q + 50 * (this.f.cS >= 500 && this.f.cS <= 1500 ? -1 : 1);
         }

         if (var1 == var5) {
            this.q = this.q - 50 * (this.f.cS >= 500 && this.f.cS <= 1500 ? -1 : 1);
         }
      }
   }

   public void b(int var1) {
      if (!C_Client_mc.w.b) {
         if (var1 == 99) {
            this.a();
            this.c("Camera position reset");
         }

         if (var1 == 116) {
            if (C_f.j.r) {
               C_f.j.r = false;
            } else {
               C_f.j.r = true;
               C_f.j.s = 0;
            }
         }

         if (var1 == 49) {
            rs.p_f.C_a.a(!rs.p_f.C_a.ah);
            this.c("Lite mode toggled: " + (rs.p_f.C_a.ah ? "@gre@ON" : "@red@OFF"));
         }

         if (var1 == 50) {
            rs.p_f.C_a.aj = !rs.p_f.C_a.aj;
            this.c("Oldschool graphics toggled: " + (rs.p_f.C_a.aj ? "@gre@ON" : "@red@OFF"));
         }

         if (var1 == 9 || var1 == 49 || var1 == 50) {
            this.f();
            if (var1 == 9) {
               this.c("Graphics and definitions have been reset!");
            }
         }
      }
   }

   public void c(int var1) {
      if (var1 == 1) {
         for (rs.p_l.p_b.p_a.p_a.C_a var3 : this.t) {
            var3.a(false);
         }
      }

      this.j = true;
      this.k = var1;
   }

   public void a(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         var1 = var1.replace("::", "");
         if (!var1.contains(" ")) {
            C_a.a(var1, var1, new String[0]);
            this.a(var1, new String[0]);
         } else {
            String[] var2 = var1.split(" ");
            String[] var3 = new String[0];
            if (var2.length > 1) {
               var3 = new String[var2.length - 1];

               for (int var4 = 1; var4 < var2.length; var4++) {
                  var3[var4 - 1] = var2[var4];
               }
            }

            this.a(var2[0], var3);
            C_a.a(var1, var2[0], var3);
         }
      }
   }

   public void a(int var1, int var2) {
      this.f.hG = null;
      this.n = var1;
      this.o = var2;
      C_Client_mc var10000 = this.f;
      C_Client_mc.ai = var1;
      var10000.hE = var1;
      var10000 = this.f;
      C_Client_mc.ah = var2;
      var10000.hF = var2;
      C_E_uc.a(var1, var2);
      this.f.bx = C_E_uc.x;
      C_E_uc.a(var1, var2);
      this.f.fo = C_E_uc.x;
      C_E_uc.a(var1, var2);
      this.f.fp = C_E_uc.x;
      C_E_uc.a(var1, var2);
      this.f.fq = C_E_uc.x;
      C_V_uc.d(500, 800, var1, var2);
      this.f.gZ = new C_C_uc(var1, var2, this.f.B());
      this.f.repaint();
      if (C_Launcher_mc.e()) {
         C_Launcher_mc.n().a(100);
      }
   }

   public void f() {
      this.v = true;
   }

   public static void b(String var0) {
      C_Client_mc.w.b("@yel@-> " + var0);
   }

   public void c(String var1) {
      this.u.add(0, new rs.p_l.p_b.p_a.p_b.C_a(var1));
   }

   public static boolean g() {
      return d;
   }

   public List<rs.p_l.p_b.p_a.p_a.C_a> h() {
      return this.t;
   }
}

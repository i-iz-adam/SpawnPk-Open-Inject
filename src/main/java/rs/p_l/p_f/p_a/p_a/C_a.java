package rs.p_l.p_f.p_a.p_a;

import rs.C_Client_mc;
import rs.p_gui.C_Launcher_mc;

public class C_a {
   private static final int a = 200;
   private String b;
   private String c;
   private String d;
   private long e;
   private C_e f;
   private int g = 175;
   private int h = 0;
   private int i = 5;
   private int j = 200;
   private int k = 256;

   public C_a(String var1, String var2, String var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = System.currentTimeMillis();
      this.f = C_e.a;
      this.g();
   }

   public void a() {
      switch (this.f) {
         case a:
            this.h();
            break;
         case b:
            this.i();
      }

      if (rs.p_f.C_a.bl) {
         this.j();
      }
   }

   private void g() {
      int var1 = C_Launcher_mc.n().o().gn.c(this.b) + 12;
      C_Launcher_mc.n().o();
      int var2 = C_Client_mc.gl.c(this.c) + 6;
      C_Launcher_mc.n().o();
      int var3 = C_Client_mc.gl.c(this.d) + 6;
      int var4 = Math.max(var1, Math.max(var2, var3));
      if (var4 > this.g) {
         this.g = Math.min(var4, 200);
      }
   }

   private void h() {
      int var1 = this.k() - this.g;
      if (!rs.p_l.p_b.C_a.a()) {
         this.h += 4;
      }

      int var2 = this.k() - this.g / 2 - this.h / 2;
      if (this.h >= this.g) {
         this.h = this.g;
         this.f = C_e.b;
      }
   }

   private void i() {
      byte var1 = 60;
      int var2 = this.k() - var1;
      if (!rs.p_l.p_b.C_a.a()) {
         this.i += 3;
      }

      if (this.i >= var1) {
         this.i = var1;
         this.f = C_e.c;
      }
   }

   private void j() {
      int var1 = this.k() - this.h / 2;
      int var2 = this.l() - this.i / 2;
      this.a(var1, var2, this.h, this.i);
      if (this.i >= 20) {
         int var10002 = var1 + this.h / 2;
         C_Launcher_mc.n().o().gn.d(this.b, var10002, var2 + 15, 16750623, 0, this.k);
         rs.p_l.C_c.d(var1, var2 + 20, this.h, 2, 2367511, this.j);
      }

      if (this.i >= 30) {
         C_Launcher_mc.n().o();
         C_Client_mc.gl.d(this.c, var1 + this.h / 2, var2 + 37, 16750623, 0, this.k);
      }

      if (this.i >= 60) {
         C_Launcher_mc.n().o();
         C_Client_mc.gl.d(this.d, var1 + this.h / 2, var2 + 54, 16777215, 0, this.k);
      }

      if (this.m() >= 3 && !rs.p_l.p_b.C_a.a()) {
         this.j -= 3;
         this.k -= 3;
         if (this.j <= 1) {
            this.j = 1;
         }

         if (this.k <= 1) {
            this.k = 1;
         }
      }
   }

   private int k() {
      return C_Client_mc.aj / 2;
   }

   private int l() {
      return 40;
   }

   private void a(int var1, int var2, int var3, int var4) {
      int var5 = 3681824;
      int var6 = 5918522;
      int var7 = 2367511;
      rs.p_l.C_c.b(var4, var2, var1, var5, var3, this.j);
      rs.p_l.C_c.e(var1, var3, var4, var7, var2, this.j);
      byte var8 = 1;
      rs.p_l.C_c.e(var1 - var8, var3 + var8 * 2, var4 + var8 * 2, var6, var2 - var8, this.j);
   }

   private int m() {
      return (int)((System.currentTimeMillis() - this.e) / 1000L);
   }

   public String b() {
      return this.b;
   }

   public String c() {
      return this.c;
   }

   public String d() {
      return this.d;
   }

   public long e() {
      return this.e;
   }

   public void a(long var1) {
      this.e = var1;
   }

   public C_e f() {
      return this.f;
   }
}

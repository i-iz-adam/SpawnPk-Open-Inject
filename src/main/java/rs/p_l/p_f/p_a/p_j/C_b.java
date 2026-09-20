package rs.p_l.p_f.p_a.p_j;

import rs.C_Client_mc;
import rs.p_d.C_k;
import rs.p_l.C_F_uc;

public class C_b extends rs.p_l.p_f.C_b {
   private C_a f;
   private String[] g;
   private int h;
   private int i;
   private int j;
   private int k;
   public C_F_uc[] e = null;
   private int[] l = null;
   private long m;
   private int n = 1;
   private String o = "";
   private final long p = 200L;

   public C_b() {
      this.a(rs.p_l.p_f.C_a.A);
   }

   @Override
   public void a() {
      if (this.f == null) {
         rs.p_s.p_s.C_b.f();
      }

      if (this.f != null) {
         this.b(this.f);
      }

      this.n();
   }

   public void a(C_a var1) {
      this.f = var1;
   }

   public void a(String var1, boolean var2) {
      this.f = new C_a(var1, var2);
   }

   private void b(C_a var1) {
      if (var1.a() != null) {
         this.h = C_Client_mc.hP;
         this.i = C_Client_mc.hQ + 20;
         String var2 = var1.a();
         if (!var2.endsWith("\n")) {
            var2 = var2 + "\n";
         }

         this.g = var2.split("\n");
         this.k();
         int var3 = C_Client_mc.ai() ? C_Client_mc.aj - 250 : C_Client_mc.aj;
         int var4 = C_Client_mc.ai() ? C_Client_mc.ak - 176 : 363;
         if (this.h >= var3) {
            this.h = C_Client_mc.ai - this.j;
            this.h = this.h - (this.h + this.j - C_Client_mc.hP);
         }

         if (this.i >= var4) {
            this.i = C_Client_mc.ah - this.k;
            this.i = this.i - (this.i + this.k - C_Client_mc.hQ + 20);
         }

         this.a(this.h, this.i, this.j, this.k);
         if (var1.e()) {
            this.a.aU.c(this.h + this.j - 14, this.i + 3);
         }

         this.i += 14;

         for (int var5 = 0; var5 < this.g.length; var5++) {
            if (var5 == 0 && this.g[var5].startsWith(" 1 ")) {
               this.g[var5] = this.g[var5].substring(2);
            }

            if (var5 == 0 && var1.b()) {
               C_Client_mc.gl.b(this.g[var5], this.h, this.i, 16760156, 0);
            } else {
               C_Client_mc.gl.b(" " + this.g[var5], this.h, this.i, 16777215, 0);
            }

            this.i += 16;
         }

         if (var1.d() != null) {
            this.l();
         }

         if (var1.c() != null) {
            this.m();
         }
      }
   }

   private void k() {
      this.k = this.g.length * 16 + 3;
      this.j = 0;

      for (int var1 = 0; var1 < this.g.length; var1++) {
         this.j = Math.max(this.j, (int)Math.floor((double)C_Client_mc.gl.a(this.g[var1], true)) + 10);
      }

      if (this.f.c() != null && this.j < 150) {
         this.j = 150;
      }

      if (this.f.d() != null) {
         if (this.j < 141) {
            this.j = 141;
         }

         if (this.k < 179) {
            this.k = 179;
         }
      }
   }

   private void l() {
      byte var1 = 15;
      boolean var2 = false;
      this.i = this.i - (this.k - 3);
      C_Client_mc.gl.c(this.f.d()[1].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 55 + var1, this.i + 32, 16777215, 0);
      C_Client_mc.gl.c(this.f.d()[6].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 108 + var1, this.i + 32, 16777215, 0);
      C_Client_mc.gl.c(this.f.d()[2].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 55 + var1, this.i + 48, 16777215, 0);
      C_Client_mc.gl.c(this.f.d()[7].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 108 + var1, this.i + 48, 16777215, 0);
      C_Client_mc.gl.c(this.f.d()[3].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 55 + var1, this.i + 65, 16777215, 0);
      C_Client_mc.gl.c(this.f.d()[8].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 108 + var1, this.i + 65, 16777215, 0);
      C_Client_mc.gl.c(this.f.d()[4].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 55 + var1, this.i + 81, 16777215, 0);
      C_Client_mc.gl.c(this.f.d()[9].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 108 + var1, this.i + 81, 16777215, 0);
      C_Client_mc.gl.c(this.f.d()[5].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 55 + var1, this.i + 97, 16777215, 0);
      C_Client_mc.gl.c(this.f.d()[10].replace("@gre@", " @gre@").replace("@red@", " @red@"), this.h + 108 + var1, this.i + 97, 16777215, 0);
   }

   private void m() {
      int[] var1 = this.f.c();
      int var2 = 3;
      var2 = this.j / 40;
      if (var2 < 3) {
         var2 = 3;
      }

      if (this.e == null || !this.o.equals(this.f.a()) || System.currentTimeMillis() - this.m >= 200L) {
         this.e = new C_F_uc[var2];
         this.l = new int[var2];
         if (this.n >= var1.length) {
            this.n = 1;
         }

         int var3 = this.n;

         for (int var4 = 0; var4 < var2; var4++) {
            if (var3 >= var1.length) {
               var3 = 0;
            }

            this.e[var4] = C_k.a(var1[var3], 0, 0, 32);
            this.l[var4] = var1[var3];
            var3++;
         }

         this.o = this.f.a();
         this.n++;
         this.m = System.currentTimeMillis();
      }

      this.i -= 10;
      this.a(this.h, this.i - 1, this.j, 32, rs.p_s.p_s.C_b.p, rs.p_s.p_s.C_b.r, rs.p_s.p_s.C_b.q);
      if (this.e != null) {
         for (int var6 = 0; var6 < this.e.length; var6++) {
            if (this.e[var6] == null) {
               this.e[var6] = C_k.a(this.l[var6], 0, 0, 32);
            }

            if (this.e[var6] != null) {
               this.e[var6].f(20 + this.h + var6 * 35, this.i);
            }
         }
      }
   }

   private void n() {
      this.f = null;
   }
}

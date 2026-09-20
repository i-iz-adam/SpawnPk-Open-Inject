package rs.p_l.p_f.p_a.p_h;

import rs.C_Client_mc;

public class C_a extends rs.p_l.p_f.C_b {
   private String e = null;
   private String f = null;
   private String g = null;
   private String h = null;
   private String i = null;
   private String j = null;
   private String k = null;
   private String l = null;
   private String m = null;
   private String n = null;
   private String o = null;
   private String p = null;

   public C_a() {
      this.a(rs.p_l.p_f.C_a.p);
   }

   @Override
   public void a() {
      int var1 = C_Client_mc.ai() ? C_Client_mc.aj - 780 : 0;
      int var2 = C_Client_mc.ai() ? C_Client_mc.ak - 503 : 0;
      boolean var3 = false;
      boolean var4 = System.currentTimeMillis() - this.a.z.w < 20000L;
      int var5 = 13;
      if (C_Client_mc.cH == -1) {
         if (var4) {
            var5 = 50 + (C_Client_mc.ai() ? 0 : 4);
         } else if (this.a.eV >= 2 || this.a.gr > 0 || this.a.eW > 0) {
            var5 = 13;
         }
      }

      if (C_Client_mc.aj() && this.a.v.h() && !this.a.f()) {
         var2 += 135;
      }

      if (this.e != null) {
         this.a.gm.a(this.e, 512 + var1, var3 ? 75 : 20, 16776960, 0);
      }

      if (this.f != null) {
         this.a.gm.a(this.f, 512 + var1, (var3 ? 75 : 20) + 17, 16776960, 0);
      }

      if (this.g != null) {
         this.a.gm.a(this.g, 512 + var1, (var3 ? 75 : 20) + 17 + 17, 16776960, 0);
      }

      if (this.n != null) {
         this.a.gm.a(this.n, 512, 330 + var2, 16776960, 0);
      }

      if (this.o != null) {
         this.a.gm.a(this.o, 512, 313 + var2, 16776960, 0);
      }

      if (this.p != null) {
         this.a.gm.a(this.p, 512, 296 + var2, 16776960, 0);
      }

      if (this.k != null) {
         this.a.gm.b(this.k, 10, 330 + var2, 16776960, 0);
      }

      if (this.l != null) {
         this.a.gm.b(this.l, 10, 313 + var2, 16776960, 0);
      }

      if (this.m != null) {
         this.a.gm.b(this.m, 10, 296 + var2, 16776960, 0);
      }

      if (this.h != null) {
         this.a.gm.b(this.h, 10, 20 + var5, 16776960, 0);
      }

      if (this.i != null) {
         this.a.gm.b(this.i, 10, 37 + var5, 16776960, 0);
      }

      if (this.j != null) {
         this.a.gm.b(this.j, 10, 54 + var5, 16776960, 0);
      }
   }

   public void k() {
      this.e = null;
      this.f = null;
      this.g = null;
      this.h = null;
      this.i = null;
      this.j = null;
      this.k = null;
      this.l = null;
      this.m = null;
      this.n = null;
      this.o = null;
      this.p = null;
   }

   @Override
   public void c() {
      super.c();
      this.k();
   }

   public String l() {
      return this.e;
   }

   public void a(String var1) {
      this.e = var1;
   }

   public String m() {
      return this.f;
   }

   public void b(String var1) {
      this.f = var1;
   }

   public String n() {
      return this.g;
   }

   public void c(String var1) {
      this.g = var1;
   }

   public String o() {
      return this.h;
   }

   public void d(String var1) {
      this.h = var1;
   }

   public String p() {
      return this.i;
   }

   public void e(String var1) {
      this.i = var1;
   }

   public String q() {
      return this.j;
   }

   public void f(String var1) {
      this.j = var1;
   }

   public String r() {
      return this.k;
   }

   public void g(String var1) {
      this.k = var1;
   }

   public String s() {
      return this.l;
   }

   public void h(String var1) {
      this.l = var1;
   }

   public String t() {
      return this.m;
   }

   public void i(String var1) {
      this.m = var1;
   }

   public String u() {
      return this.n;
   }

   public void j(String var1) {
      this.n = var1;
   }

   public String v() {
      return this.o;
   }

   public void k(String var1) {
      this.o = var1;
   }

   public String w() {
      return this.p;
   }

   public void l(String var1) {
      this.p = var1;
   }
}

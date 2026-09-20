package rs.p_j.p_b;

import rs.C_C_uc;
import rs.C_Client_mc;

public class C_a {
   private String a;
   private int b;
   private int c;
   private C_b[] d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;

   public C_a(String var1, int var2) {
      this.a = var1;
      this.b = var2;
      this.d = new C_b[10];
      this.i = -1;
   }

   public C_a a(String var1, rs.p_h.C_b var2) {
      if (this.c == this.d.length) {
         return this;
      } else {
         C_b var3 = new C_b();
         var3.a(var1);
         var3.a(var2);
         this.d[this.c++] = var3;
         this.a(var1);
         return this;
      }
   }

   public void a(String var1) {
      int var2 = C_Client_mc.gj.a(this.a);
      int var3 = C_Client_mc.gj.a(var1);
      if (this.e < var2) {
         this.e = var2 + 10;
      }

      if (this.e < var3) {
         this.e = var3 + 10;
      }

      this.f = 15 * this.c + 22;
   }

   public boolean a() {
      int var1 = this.g;
      int var2 = this.h;
      int var3 = C_C_uc.hP;
      int var4 = C_C_uc.hQ;
      byte var5 = 25;
      return var3 >= var1 - var5 && var3 <= var1 + this.e + var5 && var4 >= var2 - var5 && var4 <= var2 + this.f + var5;
   }

   public C_b b() {
      return this.i >= 0 ? this.d[this.i] : null;
   }

   public String c() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public void a(int var1) {
      this.b = var1;
   }

   public int e() {
      return this.c;
   }

   public C_b[] f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public int h() {
      return this.f;
   }

   public int i() {
      return this.g;
   }

   public void b(int var1) {
      this.g = var1;
   }

   public int j() {
      return this.h;
   }

   public void c(int var1) {
      this.h = var1;
   }

   public int k() {
      return this.i;
   }

   public void d(int var1) {
      this.i = var1;
   }
}

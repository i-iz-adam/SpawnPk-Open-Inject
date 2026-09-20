package rs.p_l.p_f.p_a.p_f;

import rs.C_Client_mc;

public class C_a {
   private static long a = 0L;
   private static long b = 3000L;
   private long c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h = 1;
   private C_b i = C_b.a;
   private int j = 16711680;
   private int k = 10;
   private int l = 10;
   private long m;
   private long n;
   private double o;
   private double p;
   private int q = 255;
   private int r;

   public C_a(int var1, int var2, int var3) {
      this.j = var3;
      this.c = a++;
      this.p = 1.0;
      this.n = (long)(250 + 250 * C_Client_mc.d(3));
      this.a(var1, var2);
   }

   public void a() {
      int var1 = (int)((double)this.q * this.f());
      int var2 = this.q - var1;
      if (var2 > 255) {
         var2 = 255;
      }

      if (var2 < 0) {
         var2 = 0;
      }

      rs.p_l.C_c.a(this.d, this.e, this.k, this.l, this.j, var2);
   }

   public void b() {
      this.r++;
      if (this.i == C_b.a) {
         this.d = this.d + this.h;
      } else {
         this.d = this.d - this.h;
      }

      double var1 = 5.0;
      int var3 = (int)((double)this.r / var1 * Math.log((double)this.r / var1 * this.o) + this.o) / 2;
      this.e = (int)((double)this.e + this.p * (double)var3);
   }

   public void a(int var1, int var2) {
      this.r = 0;
      this.f = this.d = var1;
      this.g = this.e = var2;
      this.m = System.currentTimeMillis();
      this.o = (double)(1 + C_Client_mc.d(25));
   }

   public void b(int var1, int var2) {
      this.k = var1;
      this.l = var2;
   }

   public boolean c() {
      return this.d() < this.n;
   }

   public long d() {
      return System.currentTimeMillis() - this.m;
   }

   public long e() {
      return System.currentTimeMillis() - (this.m + this.n);
   }

   public double f() {
      return (double)this.d() / (double)this.n;
   }

   public long g() {
      return this.c;
   }

   public int h() {
      return this.d;
   }

   public int i() {
      return this.e;
   }

   public void a(int var1) {
      this.d = var1;
   }

   public void b(int var1) {
      this.e = var1;
   }

   public int j() {
      return this.f;
   }

   public int k() {
      return this.g;
   }

   public void c(int var1) {
      this.f = var1;
   }

   public void d(int var1) {
      this.g = var1;
   }

   public int l() {
      return this.h;
   }

   public void e(int var1) {
      this.h = var1;
   }

   public C_b m() {
      return this.i;
   }

   public void a(C_b var1) {
      this.i = var1;
   }

   public int n() {
      return this.j;
   }

   public void f(int var1) {
      this.j = var1;
   }

   public int o() {
      return this.k;
   }

   public int p() {
      return this.l;
   }

   public void g(int var1) {
      this.k = var1;
   }

   public void h(int var1) {
      this.l = var1;
   }

   public long q() {
      return this.m;
   }

   public void a(long var1) {
      this.m = var1;
   }

   public long r() {
      return this.n;
   }

   public void b(long var1) {
      this.n = var1;
   }

   public double s() {
      return this.o;
   }

   public void a(double var1) {
      this.o = var1;
   }

   public double t() {
      return this.p;
   }

   public void b(double var1) {
      this.p = var1;
   }

   public void i(int var1) {
      this.q = var1;
   }
}

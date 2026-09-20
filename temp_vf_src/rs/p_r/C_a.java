package rs.p_r;

public class C_a {
   private static long a = 0L;
   private C_c b = null;
   private int c = 0;
   private int d;
   private float e;
   private float f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;
   private int m;
   private boolean n = false;
   private long o = a++;

   public C_a(C_c var1, int var2, int var3, int var4, int var5) {
      this.b = var1;
      this.g = var2;
      this.h = var3;
      this.i = var4;
      this.j = var5;
      this.a();
   }

   public void a() {
      this.d = this.b.l();
      this.e = this.b.j();
      this.f = this.b.c();
      this.k = this.b.n().a() + this.b.a(-1, 1);
      this.l = this.b.n().b() + this.b.a(0, 1);
      this.m = this.b.n().c() + this.b.a(-1, 1);
   }

   public void b() {
      this.c = 0;
      this.n = false;
   }

   public void c() {
      if (this.b == null) {
         this.n = true;
      } else {
         this.c++;
         if (this.c >= this.b.q()) {
            this.n = true;
         } else {
            this.d = this.d + this.b.t();
            this.e = this.e + this.b.r();
            this.f = this.f + this.b.e();
            this.h = this.h + this.k;
            this.i = this.i + this.l;
            this.j = this.j + this.m;
            this.k = this.k + this.b.s().a();
            this.l = this.l + this.b.s().b();
            this.m = this.m + this.b.s().c();
            if (this.b.a() != null) {
               this.h = this.h + this.b.a().a();
               this.i = this.i + this.b.a().b();
               this.j = this.j + this.b.a().c();
            }
         }
      }
   }

   public C_c d() {
      return this.b;
   }

   public void a(C_c var1) {
      this.b = var1;
   }

   public float e() {
      return this.f;
   }

   public void a(float var1) {
      this.f = var1;
   }

   public boolean f() {
      return this.n;
   }

   public int g() {
      return this.c;
   }

   public int h() {
      return this.g;
   }

   public void a(int var1) {
      this.g = var1;
   }

   public void b(int var1) {
      this.c = var1;
   }

   public int i() {
      return this.d;
   }

   public void c(int var1) {
      this.d = var1;
   }

   public float j() {
      return this.e;
   }

   public void b(float var1) {
      this.e = var1;
   }

   public int k() {
      return this.h;
   }

   public int l() {
      return this.i;
   }

   public int m() {
      return this.j;
   }

   public void d(int var1) {
      this.h = var1;
   }

   public void e(int var1) {
      this.i = var1;
   }

   public void f(int var1) {
      this.j = var1;
   }

   public long n() {
      return this.o;
   }

   public void a(boolean var1) {
      this.n = var1;
   }
}

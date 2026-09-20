package rs.p_k.p_c;

public class C_a {
   private static long d = 0L;
   public static final byte a = 0;
   public static final byte b = 1;
   public static final byte c = 2;
   private final long e;
   private rs.p_r.C_c f = null;
   private int g;
   private float h;
   private float i;
   private byte j;
   private boolean k;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q = 0;
   private int r;
   private int s;
   private int t;

   public C_a(rs.p_r.C_c var1, int var2, int var3, int var4, int var5) {
      this.e = d++;
      this.f = var1;
      this.l = var2;
      this.m = var3;
      this.n = var4;
      this.p = var5;
   }

   public void a() {
      this.g = this.f.l();
      this.h = this.f.j();
      this.i = this.f.c();
      this.r = this.f.n().a() + this.f.a(-1, 1);
      this.s = this.f.n().b() + this.f.a(0, 1);
      this.t = this.f.n().c() + this.f.a(-1, 1);
   }

   public void b() {
      this.q = 0;
      this.k = false;
      this.o = -1;
      this.p = -1;
   }

   public void c() {
      if (this.f == null) {
         this.k = true;
      } else {
         this.q++;
         if (this.q >= this.f.q()) {
            this.k = true;
         } else {
            this.g = this.g + this.f.t();
            this.h = this.h + this.f.r();
            this.i = this.i + this.f.e();
            this.l = this.l + this.r;
            this.m = this.m + this.s;
            this.n = this.n + this.t;
            this.r = this.r + this.f.s().a();
            this.s = this.s + this.f.s().b();
            this.t = this.t + this.f.s().c();
            if (this.f.a() != null) {
               this.l = this.l + this.f.a().a();
               this.m = this.m + this.f.a().b();
               this.n = this.n + this.f.a().c();
            }
         }
      }
   }

   public long d() {
      return this.e;
   }

   public void a(rs.p_r.C_c var1) {
      this.f = var1;
   }

   public int e() {
      return this.g;
   }

   public void a(int var1) {
      this.g = var1;
   }

   public float f() {
      return this.h;
   }

   public void a(float var1) {
      this.h = var1;
   }

   public float g() {
      return this.i;
   }

   public void b(float var1) {
      this.i = var1;
   }

   public byte h() {
      return this.j;
   }

   public void a(byte var1) {
      this.j = var1;
   }

   public boolean i() {
      return this.k;
   }

   public void a(boolean var1) {
      this.k = var1;
   }

   public int j() {
      return this.l;
   }

   public int k() {
      return this.m;
   }

   public int l() {
      return this.n;
   }

   public void b(int var1) {
      this.l = var1;
   }

   public void c(int var1) {
      this.m = var1;
   }

   public void d(int var1) {
      this.n = var1;
   }

   public int m() {
      return this.o;
   }

   public void e(int var1) {
      this.o = var1;
   }

   public int n() {
      return this.p;
   }

   public void f(int var1) {
      this.p = var1;
   }
}

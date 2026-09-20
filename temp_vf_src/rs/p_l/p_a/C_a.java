package rs.p_l.p_a;

public class C_a {
   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;

   public C_a(int var1, int var2) {
      this.b = var1;
      this.c = var2;
      this.a = var1;
   }

   public void a() {
      this.a++;
      if (this.a > this.c) {
         this.a = this.b;
      }
   }

   public C_a a(int var1) {
      this.d = var1;
      return this;
   }

   public C_a b(int var1) {
      this.e = var1;
      return this;
   }

   public C_a c(int var1) {
      this.f = var1;
      return this;
   }

   public C_a d(int var1) {
      this.h = var1;
      return this;
   }

   public C_a e(int var1) {
      this.g = var1;
      return this;
   }

   public C_a f(int var1) {
      this.i = var1;
      return this;
   }

   public int b() {
      return this.a;
   }

   public void g(int var1) {
      this.a = var1;
   }

   public int c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public int e() {
      return this.d;
   }

   public int f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }

   public int h() {
      return this.g;
   }

   public int i() {
      return this.h;
   }

   public int j() {
      return this.i;
   }
}

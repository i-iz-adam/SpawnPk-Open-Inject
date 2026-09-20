package rs.p_n.p_d;

import rs.p_n.C_e;

public class C_b {
   private final int a;
   private final C_c b;
   private C_a c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;

   public C_b(C_c var1, int var2) {
      this.b = var1;
      this.a = var2;
   }

   public C_b a(int var1, int var2) {
      this.d = var1;
      this.e = var2;
      this.b.e().a(this.a, this);
      return this;
   }

   public C_a a(int var1, boolean var2, boolean var3, int var4, int var5) {
      this.c = new C_a(var1, var4, var5, var2, var3);
      this.b.e().a(this.a, this);
      return this.c;
   }

   public C_b a(int var1, int var2, int var3) {
      this.f = var1;
      this.g = var2;
      this.h = var3;
      return this;
   }

   public C_b b(int var1, int var2, int var3) {
      this.i = var1;
      this.j = var2;
      this.k = var3;
      return this;
   }

   public int a() {
      return C_e.H[this.a].P;
   }

   public int b() {
      return C_e.H[this.a].aR;
   }

   public int c() {
      return this.a;
   }

   public C_c d() {
      return this.b;
   }

   public C_a e() {
      return this.c;
   }

   public int f() {
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

   public int j() {
      return this.h;
   }

   public int k() {
      return this.i;
   }

   public int l() {
      return this.j;
   }

   public void a(int var1) {
      this.j = var1;
   }

   public int m() {
      return this.k;
   }

   public void b(int var1) {
      this.k = var1;
   }
}

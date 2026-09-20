package rs.p_k.p_b;

import p_gnu.p_trove.p_f.p_b.C_cc;

public class C_g {
   private static int a;
   private static final int b = 6048;
   private static final C_cc<C_g> c = new C_cc(6048);
   private static final C_g[] d = new C_g[6048];
   private int e;
   private int f;
   private int g;

   public static void a() {
      a = 0;
      c.clear();
   }

   public static C_g a(int var0) {
      return (C_g)c.b(var0);
   }

   public static void a(int var0, C_g var1) {
      c.a(var0, var1);
   }

   public static C_g b() {
      return d[a++];
   }

   public int c() {
      return this.e;
   }

   public C_g b(int var1) {
      this.e = var1;
      return this;
   }

   public int d() {
      return this.f;
   }

   public C_g c(int var1) {
      this.f = var1;
      return this;
   }

   public int e() {
      return this.g;
   }

   public C_g d(int var1) {
      this.g = var1;
      return this;
   }

   static {
      for (int var0 = 0; var0 < 6048; var0++) {
         d[var0] = new C_g();
      }
   }
}

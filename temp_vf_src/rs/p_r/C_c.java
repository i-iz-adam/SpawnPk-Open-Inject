package rs.p_r;

import java.util.Random;
import rs.C_M_uc;
import rs.C_R_uc;

public class C_c {
   public static int a = 0;
   public static final Random b = new Random(System.currentTimeMillis());
   public static C_c[] c = new C_c[]{
      new C_d(),
      new C_o(),
      new C_z(),
      new C_D_uc(),
      new C_E_uc(),
      new C_F_uc(),
      new C_G_uc(),
      new C_H_uc(),
      new C_I_uc(),
      new C_e(),
      new C_f(),
      new C_g(),
      new C_h(),
      new C_i(),
      new C_j(),
      new C_k(),
      new C_l(),
      new C_m(),
      new C_n(),
      new C_p(),
      new C_q(),
      new C_r(),
      new C_s(),
      new C_t(),
      new C_u(),
      new C_v(),
      new C_w(),
      new C_x(),
      new C_y(),
      new C_A_uc(),
      new C_B_uc(),
      new C_C_uc()
   };
   private float d = 1.0F;
   private float e = 1.0F;
   private int f = -1;
   private int g = -1;
   private C_R_uc h = C_R_uc.a;
   private C_R_uc i = C_R_uc.a;
   private int j = 1;
   private static int k = 10000;
   private int l = 1;
   private int m;
   private rs.p_l.C_F_uc n;
   private boolean o = false;
   private float p = 1.0F;
   private float q = 0.05F;
   private C_R_uc r;
   private C_M_uc s = new rs.C_A_uc(C_R_uc.a);
   private int t;
   private C_R_uc u;
   private int v;
   private float w;
   private float x;

   public C_R_uc a() {
      return this.t == 31 && this.a(1, 3) == 1 ? new C_R_uc(0, 0, 0) : this.r;
   }

   public void a(C_R_uc var1) {
      this.r = var1;
   }

   public int b() {
      return this.m;
   }

   public void a(int var1) {
      this.m = var1;
   }

   public float c() {
      return this.p;
   }

   public void a(float var1) {
      this.p = var1;
   }

   public float d() {
      return this.q;
   }

   public void b(float var1) {
      this.q = var1;
   }

   public float e() {
      return this.x;
   }

   public void c(float var1) {
      this.x = var1;
   }

   public rs.p_l.C_F_uc f() {
      return this.n;
   }

   public void a(rs.p_l.C_F_uc var1) {
      this.n = var1;
   }

   public C_M_uc g() {
      return this.s;
   }

   public void a(C_M_uc var1) {
      this.s = var1;
   }

   public int a(int var1, int var2) {
      int var3 = var2 - var1 + 1;
      return (int)(Math.random() * (double)var3) + var1;
   }

   public int h() {
      return this.l;
   }

   public void b(int var1) {
      this.l = var1;
   }

   public static int i() {
      return k;
   }

   public void c(int var1) {
      k = var1;
   }

   public float j() {
      return this.d;
   }

   public void d(float var1) {
      this.d = var1;
   }

   public float k() {
      return this.e;
   }

   public void e(float var1) {
      this.e = var1;
   }

   public int l() {
      return this.f;
   }

   public void d(int var1) {
      this.f = var1;
   }

   public int m() {
      return this.g;
   }

   public void e(int var1) {
      this.g = var1;
   }

   public C_R_uc n() {
      return this.h;
   }

   public C_R_uc f(int var1) {
      switch (var1) {
         default:
            return new C_R_uc(this.h.a() + this.a(-1, 1), this.h.b() + this.a(0, 1), this.h.c() + this.a(-1, 1));
      }
   }

   public void g(int var1) {
      this.t = var1;
   }

   public void b(C_R_uc var1) {
      this.h = var1;
   }

   public C_R_uc o() {
      return this.i;
   }

   public void a(boolean var1) {
      this.o = var1;
   }

   public boolean p() {
      return this.o;
   }

   public void c(C_R_uc var1) {
      this.i = var1;
   }

   public int q() {
      return this.j;
   }

   public void h(int var1) {
      this.j = var1;
   }

   public void d(C_R_uc var1) {
      this.u = var1;
   }

   public void i(int var1) {
      this.v = var1;
   }

   public void f(float var1) {
      this.w = var1;
   }

   public float r() {
      return this.w;
   }

   public C_R_uc s() {
      return this.u;
   }

   public int t() {
      return this.v;
   }

   public void u() {
      this.w = (this.e - this.d) / ((float)this.j * 1.0F);
      this.v = (this.g - this.f) / this.j;
      if (this.h.a() == 0 && this.h.b() == 0 && this.h.c() == 0) {
         this.u = new C_R_uc(0, 0, 0);
      } else {
         this.u = this.i.a(this.h).a((float)this.j);
      }

      this.x = (this.q - this.p) / (float)this.j;
   }

   public void v() {
      this.w = (this.e - this.d) / ((float)this.j * 1.0F);
      this.v = (this.g - this.f) / this.j;
      this.u = this.i.a(this.h).a((float)this.j);
   }

   public int w() {
      return this.t;
   }
}

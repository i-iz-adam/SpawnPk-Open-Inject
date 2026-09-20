package rs.p_n.p_a.p_a;

import java.util.ArrayList;
import java.util.List;
import rs.C_Client_mc;
import rs.p_n.p_a.C_f;

public class C_a extends rs.p_n.C_e {
   public static final int a = 42;
   private rs.p_n.p_d.C_c b;
   private List<C_d> c;
   private int d;
   private int e = 0;
   private int f = 16750623;
   private boolean g = true;
   private int bI;
   private int bJ;
   private int bK;

   public static C_a a(int var0, String... var1) {
      C_a var2 = new C_a(var0);
      var2.c = new ArrayList<>();

      for (String var6 : var1) {
         var2.c.add(new C_d(var6, "Select"));
      }

      var2.at = var1[0];
      return var2;
   }

   private C_a(int var1) {
      this.Q = "Select";
      this.aI = 42;
      this.J = 0;
      this.M = 1;
      this.ab = -1;
      this.L = 16777215;
      this.aw = var1;
      this.P = 120;
      this.aR = 21;
      this.bI = this.aR + 90;
      this.ao = C_f.a[0];
      this.S = true;
      this.aS = true;
      this.a();
      H[var1] = this;
   }

   public void a(int var1) {
      int var2 = var1 - 32432;
      if (var2 >= 0 && var2 < this.h()) {
         this.d = var2;
         this.at = this.c.get(var2).a();
         if (C_Client_mc.cI > 0) {
            C_c.b();
         }
      }
   }

   public C_a g(int var1, int var2) {
      this.ad = var1;
      this.f = var2;
      return this;
   }

   public C_a h(int var1, int var2) {
      this.P = var1;
      this.bJ = var2;
      if (var2 > 0) {
         this.bI = var2;
      }

      return this;
   }

   public C_a a() {
      this.e = 0;
      this.ao = C_f.a[this.e];
      return this;
   }

   public C_a b() {
      this.e = 1;
      this.ao = C_f.a[this.e];
      return this;
   }

   public C_a c() {
      this.e = 2;
      this.ao = C_f.a[this.e];
      return this;
   }

   public C_a m(int var1) {
      this.P = var1;
      return this;
   }

   public int h() {
      return this.c.size();
   }

   public List<C_d> i() {
      return this.c;
   }

   public void a(List<C_d> var1) {
      this.c = var1;
   }

   public int j() {
      return this.d;
   }

   public int k() {
      return this.e;
   }

   public int l() {
      return this.f;
   }

   public boolean m() {
      return this.g;
   }

   public int n() {
      return this.bI;
   }

   public void n(int var1) {
      this.bI = var1;
   }

   public int o() {
      return this.bJ;
   }

   public int p() {
      return this.bK;
   }

   public void o(int var1) {
      this.bK = var1;
   }
}

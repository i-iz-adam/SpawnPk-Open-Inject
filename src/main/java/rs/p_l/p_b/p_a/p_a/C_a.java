package rs.p_l.p_b.p_a.p_a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class C_a {
   private static int t = 10;
   protected boolean a;
   protected int b = 6208;
   protected int c = 6208;
   protected int d = 0;
   protected int e = 0;
   protected int f = 0;
   protected rs.p_d.C_a g;
   protected int h;
   protected int i;
   protected int j;
   protected int k;
   protected int l;
   protected int m;
   protected boolean n;
   protected boolean o;
   protected Map<Integer, Boolean> p = new HashMap<>();
   protected Map<Integer, Boolean> q = new HashMap<>();
   protected int r;
   protected List<Integer> s = new ArrayList<>();

   public C_a() {
      this.f = ++t;
      this.o = true;
   }

   public void a() {
      if (!this.a) {
         this.b();
         this.a = true;
      }

      try {
         this.c();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      if (this.g != null) {
         this.j++;
         if (this.i < this.g.d && this.j > this.g.a(this.i)) {
            this.j = 1;
            this.i++;
         }

         if (this.i >= this.g.d) {
            this.j = 1;
            this.i = 0;
         }
      }
   }

   protected abstract void b();

   protected abstract void c();

   public void a(int var1) {
      this.b = var1;
   }

   public void b(int var1) {
      this.c = var1;
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public void c(int var1) {
      rs.p_l.p_b.p_a.C_d.b.f.g(this.b, var1, this.c);
      this.k = rs.p_l.p_b.p_a.C_d.b.f.dN;
      this.l = rs.p_l.p_b.p_a.C_d.b.f.dO;
   }

   public void d(int var1) {
      if (var1 == -1) {
         var1 = 0;
      }

      this.h = var1;
      this.g = rs.p_d.C_a.a[this.h];
      this.i = 0;
      this.j = 0;
   }

   public void f() {
      if (this.q.size() > 0) {
         System.out.println();
         System.out.print("Default color map: \t");

         for (Integer var2 : this.q.keySet()) {
            System.out.print(var2 + ",");
         }

         System.out.println();
      }

      if (this.p.size() > 0) {
         System.out.print("Final color map: \t");

         for (Integer var4 : this.p.keySet()) {
            System.out.print(var4 + ",");
         }

         System.out.println();
         System.out.println("Selected colors: \t" + Arrays.toString(this.s.stream().mapToInt(var0 -> var0).toArray()).replaceAll(" ", ""));
      }
   }

   public int g() {
      return this.m;
   }

   public void e(int var1) {
      this.m = var1;
   }

   public boolean h() {
      return this.n;
   }

   public void a(boolean var1) {
      this.n = var1;
      this.s.clear();
   }

   public Map<Integer, Boolean> i() {
      return this.p;
   }

   public Map<Integer, Boolean> j() {
      return this.q;
   }

   public List<Integer> k() {
      return this.s;
   }

   public boolean l() {
      return this.o;
   }

   public int m() {
      return this.r;
   }

   public void f(int var1) {
      this.r = var1;
   }
}

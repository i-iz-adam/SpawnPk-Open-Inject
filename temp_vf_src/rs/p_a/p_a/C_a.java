package rs.p_a.p_a;

import java.util.HashMap;
import rs.C_F_uc;
import rs.C_S_uc;
import rs.p_a.C_d;

public class C_a extends rs.C_a {
   public HashMap<C_a.b, Object> f;
   public int g;
   public int h;
   public C_S_uc i;
   public C_S_uc j;
   public C_d k;
   public int[][] l;
   public int[][] m;
   public transient float[] n;
   public boolean o = true;
   public boolean p = false;
   private long q = System.currentTimeMillis();
   private boolean r;

   public static C_a a(C_F_uc var0, int var1) {
      return var0.a((long)var1) == null ? new C_a(true) : (C_a)var0.a((long)var1);
   }

   public C_a(boolean var1) {
      if (var1) {
         this.f = new HashMap<>();
      }
   }

   public C_d a(int var1) {
      if (!this.f() || this.k == null || this.k.a() != var1) {
         this.k = new C_d(var1);
      } else if (this.p) {
         for (int var2 = 0; var2 < var1; var2++) {
            this.k.a(var2, 0);
            this.k.b(var2, 0);
            this.k.c(var2, 0);
         }
      }

      return this.k;
   }

   public C_S_uc b(int var1) {
      if (!this.f() || this.i == null || this.i.a() != var1) {
         this.i = new C_S_uc(var1);
      } else if (this.p) {
         for (int var2 = 0; var2 < var1; var2++) {
            this.i.a(var2, 0);
            this.i.b(var2, 0);
            this.i.c(var2, 0);
            this.i.d(var2, 0);
         }
      }

      return this.i;
   }

   public C_S_uc c(int var1) {
      if (!this.f() || this.j == null || this.j.a() != var1) {
         this.j = new C_S_uc(var1);
      } else if (this.p) {
         for (int var2 = 0; var2 < var1; var2++) {
            this.j.a(var2, 0);
            this.j.b(var2, 0);
            this.j.c(var2, 0);
            this.j.d(var2, 0);
         }
      }

      return this.j;
   }

   public void c() {
      this.n = new float[this.h * 6];
   }

   public int[] a(C_a.b var1) {
      return this.f != null && this.f.containsKey(var1) && var1.s == C_a.c.a ? (int[])this.f.get(var1) : new int[this.a(var1.r)];
   }

   public boolean[] b(C_a.b var1) {
      return this.f != null && this.f.containsKey(var1) && var1.s == C_a.c.b ? (boolean[])this.f.get(var1) : new boolean[this.a(var1.r)];
   }

   public byte[] c(C_a.b var1) {
      return this.f != null && this.f.containsKey(var1) && var1.s == C_a.c.c ? (byte[])this.f.get(var1) : new byte[this.a(var1.r)];
   }

   public void d() {
      if (this.f != null) {
         int var1 = this.a(C_a.a.a);
         int var2 = this.a(C_a.a.b);

         for (int var3 = 0; var3 < Math.max(var1, var2); var3++) {
            if (var3 < var1) {
               this.d(var3);
            }

            if (var3 < var2) {
               this.e(var3);
            }
         }
      }
   }

   public void d(int var1) {
      if (this.f != null) {
         this.a(C_a.b.j, var1);
         this.a(C_a.b.d, var1);
         this.a(C_a.b.e, var1);
         this.a(C_a.b.f, var1);
         this.a(C_a.b.a, var1);
         this.a(C_a.b.b, var1);
         this.a(C_a.b.c, var1);
         this.a(C_a.b.i, var1);
         this.a(C_a.b.h, var1);
         this.a(C_a.b.g, var1);
         this.a(C_a.b.k, var1);
      }
   }

   public void e(int var1) {
      this.a(C_a.b.l, var1);
      this.a(C_a.b.p, var1);
      this.a(C_a.b.q, var1);
      this.a(C_a.b.m, var1);
      this.a(C_a.b.n, var1);
      this.a(C_a.b.o, var1);
   }

   public void e() {
      this.a(C_a.a.a, C_a.b.j);
      this.a(C_a.a.a, C_a.b.d);
      this.a(C_a.a.a, C_a.b.e);
      this.a(C_a.a.a, C_a.b.f);
      this.a(C_a.a.a, C_a.b.a);
      this.a(C_a.a.a, C_a.b.b);
      this.a(C_a.a.a, C_a.b.c);
      this.a(C_a.a.a, C_a.b.i);
      this.a(C_a.a.a, C_a.b.h);
      this.a(C_a.a.a, C_a.b.g);
      this.a(C_a.a.a, C_a.b.k);
      this.a(C_a.a.b, C_a.b.l);
      this.a(C_a.a.b, C_a.b.p);
      this.a(C_a.a.b, C_a.b.q);
      this.a(C_a.a.b, C_a.b.m);
      this.a(C_a.a.b, C_a.b.n);
      this.a(C_a.a.b, C_a.b.o);
   }

   public void a(C_a.a var1, C_a.b var2) {
      if (this.f != null && this.f()) {
         if (!this.f.containsKey(var2)) {
            this.f.put(var2, new int[this.a(var1)]);
         }
      }
   }

   public void b(C_a.a var1, C_a.b var2) {
      if (this.f != null) {
         if (!this.f.containsKey(var2)) {
            int var3 = this.a(var1);
            switch (var2.s) {
               case a:
                  this.f.put(var2, new int[var3]);
                  break;
               case b:
                  this.f.put(var2, new boolean[var3]);
                  break;
               case c:
                  this.f.put(var2, new byte[var3]);
            }
         } else {
            for (int var4 = 0; var4 < this.a(var1); var4++) {
               switch (var2.s) {
                  case a:
                     ((int[])this.f.get(var2))[var4] = 0;
                     break;
                  case b:
                     ((boolean[])this.f.get(var2))[var4] = false;
                     break;
                  case c:
                     ((byte[])this.f.get(var2))[var4] = 0;
               }
            }
         }
      }
   }

   private void a(C_a.b var1, int var2) {
      if (this.f.containsKey(var1)) {
         switch (var1.s) {
            case a:
               ((int[])this.f.get(var1))[var2] = 0;
               break;
            case b:
               ((boolean[])this.f.get(var1))[var2] = false;
               break;
            case c:
               ((byte[])this.f.get(var1))[var2] = 0;
         }
      }
   }

   public void a(int var1, int var2) {
      if (this.g != var2 || this.h != var1) {
         this.g = var2;
         this.h = var1;
         if (this.f()) {
            this.h();
         }
      }
   }

   public void b(int var1, int var2) {
      this.g = var2;
      this.h = var1;
   }

   public boolean f() {
      return this.f != null;
   }

   public boolean g() {
      return System.currentTimeMillis() - this.q <= 1000L;
   }

   private void h() {
      if (this.f != null) {
         this.f.clear();
         this.n = null;
         this.i = null;
         this.j = null;
      }
   }

   private int a(C_a.a var1) {
      switch (var1) {
         case a:
            return this.h;
         case b:
            return this.g;
         default:
            return 0;
      }
   }

   public void a(boolean var1) {
      this.r = var1;
   }

   public static enum a {
      a,
      b;
   }

   public static enum b {
      a(C_a.a.a),
      b(C_a.a.a),
      c(C_a.a.a),
      d(C_a.a.a),
      e(C_a.a.a),
      f(C_a.a.a),
      g(C_a.a.a),
      h(C_a.a.a),
      i(C_a.a.a),
      j(C_a.a.a),
      k(C_a.a.a),
      l(C_a.a.b),
      m(C_a.a.b),
      n(C_a.a.b),
      o(C_a.a.b),
      p(C_a.a.b),
      q(C_a.a.b, C_a.c.c);

      C_a.a r;
      C_a.c s;

      private b(C_a.a var3) {
         this(var3, C_a.c.a);
      }

      private b(C_a.a var3, C_a.c var4) {
         this.r = var3;
         this.s = var4;
      }
   }

   public static enum c {
      a,
      b,
      c;
   }
}

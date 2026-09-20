package rs.p_l.p_e;

import java.util.ArrayList;
import java.util.List;
import p_gnu.p_trove.p_f.p_b.C_cc;
import rs.C_Client_mc;
import rs.p_l.p_e.p_a.C_r;
import rs.p_l.p_e.p_a.C_t;
import rs.p_l.p_e.p_a.C_u;
import rs.p_l.p_e.p_a.C_v;
import rs.p_n.p_c.C_V_uc;

public abstract class C_f {
   public static final C_f a = new rs.p_l.p_e.p_a.C_o();
   public static final C_f b = new rs.p_l.p_e.p_a.C_e();
   public static final C_f c = new C_t();
   public static final C_f d = new C_r();
   public static final rs.p_l.p_e.p_a.C_m e = new rs.p_l.p_e.p_a.C_m();
   public static final rs.p_l.p_e.p_a.C_a f = new rs.p_l.p_e.p_a.C_a();
   public static final C_v g = new C_v();
   public static final rs.p_l.p_e.p_a.C_k h = new rs.p_l.p_e.p_a.C_k();
   public static final rs.p_l.p_e.p_a.C_q i = new rs.p_l.p_e.p_a.C_q();
   public static final C_u j = new C_u();
   public static final List<C_f> k = new ArrayList<>();
   public static final List<C_f> l = new ArrayList<>();
   public static final List<C_f> m = new ArrayList<>();
   public static final List<C_a> n = new ArrayList<>();
   public static int o = 0;
   private C_cc<C_i> p = new C_cc();
   private boolean q = false;

   public static void a() {
      if (k.size() > 0) {
         k.clear();
      }

      if (l.size() > 0) {
         l.clear();
      }

      a(f);
      a(g);
      a(a);
      a(b);
      a(c);
      a(d);
      a(new rs.p_l.p_e.p_a.C_h());
      a(new rs.p_l.p_e.p_a.C_c());
      a(C_V_uc.bJ);
      a(new rs.p_l.p_e.p_a.C_f());
      b(e);
      a(j);
      b(i);
      b(h);
   }

   public static void a(C_f var0) {
      var0.d().clear();
      var0.b();
      if (var0.d().size() > 0) {
         m.add(var0);
      }

      if (var0 instanceof C_a) {
         n.add((C_a)var0);
      }

      k.add(var0);
   }

   public static void b(C_f var0) {
      var0.d().clear();
      var0.b();
      if (var0.d().size() > 0) {
         m.add(var0);
      }

      if (var0 instanceof C_a) {
         n.add((C_a)var0);
      }

      l.add(var0);
   }

   protected void a(int[] var1, C_i var2) {
      for (int var6 : var1) {
         this.p.a(var6, var2);
      }
   }

   protected void a(int var1, C_i var2) {
      this.a(new int[]{var1}, var2);
   }

   public void a(C_Client_mc var1, C_f.a var2) {
      if (this.a(var1)) {
         this.q = true;
         this.b(var1, var2);
      } else {
         this.q = false;
      }
   }

   public abstract void b();

   public abstract boolean a(C_Client_mc var1);

   public abstract void b(C_Client_mc var1, C_f.a var2);

   public abstract void c();

   public C_cc<C_i> d() {
      return this.p;
   }

   public boolean e() {
      return this.q;
   }

   public static enum a {
      a,
      b;
   }
}

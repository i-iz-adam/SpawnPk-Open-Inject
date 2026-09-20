package rs.p_n.p_d;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p_gnu.p_trove.p_f.p_b.C_cc;
import rs.p_n.C_e;
import rs.p_n.p_a.C_d;

public class C_c {
   private C_e a;
   private List<C_b> b;
   private C_cc<C_b> c;
   private HashMap<Integer, Point> d;

   public C_c(C_e var1) {
      this.a = var1;
      this.b = new ArrayList<>();
      this.c = new C_cc();
      this.d = new HashMap<>();
      if (rs.p_f.C_a.c()) {
         rs.p_s.p_c.C_c.c.put(var1.aw, this);
      }
   }

   public C_b a(int var1) {
      return this.a(var1, true);
   }

   public C_b a(int var1, boolean var2) {
      C_b var3 = new C_b(this, var1);
      this.b.add(var3);
      this.c.a(var1, var3);
      if (C_e.l(var1) instanceof rs.p_n.p_a.p_a.C_a) {
         rs.p_n.p_a.p_a.C_a var4 = (rs.p_n.p_a.p_a.C_a)C_e.l(var1);
         var4.o(this.b.size());
         this.a(rs.p_n.p_a.p_a.C_c.c).b(var1, 0, var4.aR + 1);
         return var3;
      } else {
         return var3;
      }
   }

   public C_b a(C_e var1) {
      if (var1 instanceof C_d) {
         ((C_d)var1).a();
      }

      if (var1 instanceof rs.p_n.p_a.C_a) {
         rs.p_n.p_a.C_a var2 = (rs.p_n.p_a.C_a)var1;
         if (var2.b()) {
            C_b var3 = this.a(var1.aw);
            C_b var4 = this.a(var1.aw + 1);
            var4.b(var1.aw, 0, 0);
            return var3;
         }
      }

      return this.a(var1.aw);
   }

   public void a() {
      this.a.k(this.b.size());

      for (int var1 = 0; var1 < this.b.size(); var1++) {
         C_b var2 = this.b.get(var1);
         int var3 = var2.f();
         int var4 = var2.g();
         if (var2.h() > 0) {
            C_b var5 = (C_b)this.c.b(var2.h());
            int var6 = var5.f();
            int var7 = var5.g();
            var3 = var6 + var2.i();
            var4 = var7 + var2.j();
         }

         if (var2.k() > 0) {
            Point var9 = this.d.get(var2.k());
            var3 = var9.x + var2.l();
            var4 = var9.y + var2.m();
         }

         if (var2.e() != null) {
            C_b var10 = (C_b)this.c.b(var2.e().a());
            int var11 = var10.a();
            int var12 = var10.b();
            if (var2.e().h() > 0 && var11 > var2.e().h()) {
               var11 = var2.e().h();
            }

            if (var2.e().i() > 0 && var12 > var2.e().i()) {
               var12 = var2.e().i();
            }

            var3 = var10.f() + (var2.e().d() ? (int)((float)var11 * var2.e().f()) : 0) + var2.e().b();
            var4 = var10.g() + (var2.e().e() ? (int)((float)var12 * var2.e().g()) : 0) + var2.e().c();
            if (var10.h() > 0) {
               C_b var8 = (C_b)this.c.b(var10.h());
               var3 += var8.f() + var10.i();
               var4 += var8.g() + var10.j();
            }
         }

         this.a.b(var1, var2.c(), var3, var4);
         this.d.put(var2.c(), new Point(var3, var4));
      }

      C_e.H[this.a.aw] = this.a;
   }

   public void b() {
      this.b.clear();
   }

   public C_b b(int var1) {
      return (C_b)this.c.b(var1);
   }

   public C_e c() {
      return this.a;
   }

   public List<C_b> d() {
      return this.b;
   }

   public C_cc<C_b> e() {
      return this.c;
   }

   public HashMap<Integer, Point> f() {
      return this.d;
   }
}

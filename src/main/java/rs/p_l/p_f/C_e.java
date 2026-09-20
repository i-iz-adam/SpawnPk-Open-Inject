package rs.p_l.p_f;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p_gnu.p_trove.p_f.p_b.C_cc;
import rs.C_Client_mc;
import rs.p_eventbus.C_EventBus_mc;
import rs.p_gui.C_Launcher_mc;

@Singleton
public class C_e {
   private static final Logger b = LoggerFactory.getLogger(C_e.class);
   private final ConcurrentHashMap<C_a, List<C_b>> c = new ConcurrentHashMap<>();
   final ConcurrentHashMap<C_a, CopyOnWriteArrayList<C_g>> a = new ConcurrentHashMap<>();
   private final C_cc<List<rs.p_l.p_f.p_b.C_d>> d = new C_cc();
   private final List<rs.p_l.p_f.p_b.C_d> e = new ArrayList<>();
   private final rs.p_l.p_f.p_a.p_j.C_b f = new rs.p_l.p_f.p_a.p_j.C_b();
   private final rs.p_l.p_f.p_a.p_f.C_c g = new rs.p_l.p_f.p_a.p_f.C_c();
   private final rs.p_l.p_f.p_a.p_a.C_c h = new rs.p_l.p_f.p_a.p_a.C_c();
   private final rs.p_l.p_f.p_a.p_h.C_a i = new rs.p_l.p_f.p_a.p_h.C_a();
   private final rs.p_l.p_f.p_a.p_d.C_c j = new rs.p_l.p_f.p_a.p_d.C_c();
   private final rs.p_l.p_f.p_a.p_d.C_a k = new rs.p_l.p_f.p_a.p_d.C_a();
   private final rs.p_l.p_f.p_a.p_d.C_d l = new rs.p_l.p_f.p_a.p_d.C_d();
   private Graphics2D m = null;
   private final C_i n;
   private final rs.p_s.C_h o;
   private final C_Client_mc p;
   private boolean q = false;
   private static C_e r;

   @Inject
   public C_e(C_Client_mc var1, rs.p_s.C_h var2, rs.p_ui.C_f var3, C_EventBus_mc var4, rs.p_g.p_a.C_b var5, rs.p_e.C_i var6) {
      r = this;
      this.n = new C_i(this, var3, var1, var2, var4, var5, var6);
      this.p = var1;
      this.o = var2;

      for (C_a var10 : C_a.values()) {
         this.c.put(var10, new CopyOnWriteArrayList<>());
         this.a.put(var10, new CopyOnWriteArrayList<>());
      }

      this.a(this.f);
      if (rs.p_f.C_a.c == 1) {
         this.a(this.j);
         this.a(this.k);
         this.a(this.l);
      }

      this.a(this.g);
      this.a(this.h);
      this.a(this.i);
   }

   public void a(C_b var1) {
      if (var1 instanceof C_g) {
         C_g var2 = (C_g)var1;
         this.n.b(var2);
         var2.a(this.o.s());
         List var3 = this.a.get(var1.i());
         if (var2.A() > 0.0F) {
            int var4 = var3.size();

            for (int var5 = 0; var5 < var3.size(); var5++) {
               if (((C_g)var3.get(var5)).A() < var2.A()) {
                  var4 = var5;
                  break;
               }
            }

            var3.add(var4, var2);
         } else {
            var3.add((C_g)var1);
         }
      } else {
         this.c.get(var1.i()).add(var1);
      }
   }

   public void b(C_b var1) {
      if (var1 instanceof C_g) {
         this.a.get(var1.i()).remove(var1);
      } else {
         this.c.get(var1.i()).remove(var1);
      }
   }

   public boolean c(C_b var1) {
      return var1 instanceof C_g ? this.a.get(var1.i()).contains(var1) : this.c.get(var1.i()).contains(var1);
   }

   public void a(rs.p_l.p_f.p_b.C_d var1, int var2) {
      if (this.d.b(var2) == null) {
         this.d.a(var2, new ArrayList());
      }

      if (((List)this.d.b(var2)).contains(var1)) {
         ((List)this.d.b(var2)).remove(var1);
      }

      var1.d(var2);
      ((List)this.d.b(var2)).add(var1);
   }

   public void a(rs.p_l.p_f.p_b.C_d var1) {
      if (this.d.b(var1.s()) != null) {
         ((List)this.d.b(var1.s())).remove(var1);
      }
   }

   public void a(int var1, int var2, int var3) {
      if (!this.e.isEmpty()) {
         for (rs.p_l.p_f.p_b.C_d var5 : this.e) {
            var5.a(C_Launcher_mc.n().o());
            var5.b(var2);
            var5.c(var3);
            var5.d(var1);
            var5.a();
         }
      }

      if (this.d.b(var1) != null) {
         for (int var6 = 0; var6 < ((List)this.d.b(var1)).size(); var6++) {
            rs.p_l.p_f.p_b.C_d var7 = (rs.p_l.p_f.p_b.C_d)((List)this.d.b(var1)).get(var6);
            var7.a(C_Launcher_mc.n().o());
            var7.b(var2);
            var7.c(var3);
            var7.a();
         }
      }
   }

   public void a(C_a var1) {
      if (this.m != null) {
         this.m.dispose();
      }

      this.m = (Graphics2D)C_Launcher_mc.n().o().gZ.e.getGraphics();
      this.m.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      this.n.a(var1, this.a.get(var1));
      if (!this.c.get(var1).isEmpty()) {
         List var2 = this.c.get(var1);

         for (int var3 = 0; var3 < var2.size(); var3++) {
            C_b var4 = (C_b)var2.get(var3);
            if (var4.g()) {
               this.d(var4);
               var4.b();
            }
         }
      }
   }

   public void a(C_a var1, Object var2, rs.p_a.C_h var3) {
      if (this.c.get(var1) != null) {
         if (var1 == C_a.e || var3 != null) {
            this.a(this.c.get(var1), var2, var3);
         }
      }
   }

   public void a(C_a var1, rs.p_a.C_a var2, rs.p_a.C_h var3) {
      if (this.c.get(var1) != null) {
         this.a(this.c.get(var1), var2, var3);
      }
   }

   public void a() {
      for (List var2 : this.c.values()) {
         for (C_b var4 : var2) {
            var4.c();
         }
      }

      for (List var7 : this.a.values()) {
         for (C_g var11 : var7) {
            var11.c();
         }
      }

      for (C_a var12 : C_a.values()) {
         this.a.put(var12, new CopyOnWriteArrayList<>());
      }
   }

   public void b() {
      this.q = false;
      if (this.p.fc) {
         if (this.n.a()) {
            this.n.a = this.n.b();
         }

         this.n.b = new C_c(this.n.a);
      }
   }

   public void c() {
      this.n.d = this.n.c;
      this.n.c = null;
   }

   public Graphics2D b(C_a var1) {
      return this.m;
   }

   Point a(Point var1) {
      return a((float)var1.x, (float)var1.y);
   }

   public static Point a(float var0, float var1) {
      C_Client_mc var2 = C_Launcher_mc.n().o();
      return !C_Client_mc.ai() && var2.ax() ? new Point(var2.b((int)var0, false), var2.c((int)var1, false)) : new Point((int)var0, (int)var1);
   }

   private void a(List<C_b> var1, Object var2, rs.p_a.C_h var3) {
      if (var2 != null) {
         if (!var1.isEmpty()) {
            for (int var4 = 0; var4 < var1.size(); var4++) {
               C_b var5 = (C_b)var1.get(var4);
               if (var5.g()) {
                  if (var5 instanceof rs.p_l.p_f.p_b.C_b && var2 instanceof rs.p_a.C_j) {
                     ((rs.p_l.p_f.p_b.C_b)var5).a((rs.p_a.C_j)var2);
                     ((rs.p_l.p_f.p_b.C_b)var5).a(var3);
                     this.d(var5);
                     var5.b();
                  } else if (var5 instanceof rs.p_l.p_f.p_b.C_c && var2 instanceof rs.p_a.C_k) {
                     ((rs.p_l.p_f.p_b.C_c)var5).a((rs.p_a.C_k)var2);
                     this.d(var5);
                     var5.b();
                  } else if (var5 instanceof rs.p_l.p_f.p_b.C_a) {
                     ((rs.p_l.p_f.p_b.C_a)var5).a(var2);
                     ((rs.p_l.p_f.p_b.C_a)var5).a(var3);
                     this.d(var5);
                     var5.b();
                  }
               }
            }
         }
      }
   }

   private void d(C_b var1) {
      if (var1.f() == null) {
         var1.a(C_Launcher_mc.n().o());
      }

      var1.a();
   }

   public static C_e d() {
      return r;
   }

   public List<rs.p_l.p_f.p_b.C_d> e() {
      return this.e;
   }

   public rs.p_l.p_f.p_a.p_j.C_b f() {
      return this.f;
   }

   public rs.p_l.p_f.p_a.p_f.C_c g() {
      return this.g;
   }

   public rs.p_l.p_f.p_a.p_a.C_c h() {
      return this.h;
   }

   public rs.p_l.p_f.p_a.p_h.C_a i() {
      return this.i;
   }

   public rs.p_l.p_f.p_a.p_d.C_c j() {
      return this.j;
   }

   public rs.p_l.p_f.p_a.p_d.C_a k() {
      return this.k;
   }

   public rs.p_l.p_f.p_a.p_d.C_d l() {
      return this.l;
   }

   public C_i m() {
      return this.n;
   }
}

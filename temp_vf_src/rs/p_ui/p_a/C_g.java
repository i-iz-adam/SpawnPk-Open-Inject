package rs.p_ui.p_a;

import com.google.a.b.as;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import lombok.NonNull;
import rs.C_Client_mc;
import rs.p_eventbus.C_EventBus_mc;
import rs.p_gui.C_w;
import rs.p_l.p_f.C_l;
import rs.p_ui.p_components.C_q;

public class C_g extends rs.p_l.p_f.C_g {
   private static final int r = 1;
   private static final int s = 6;
   private final C_f t;
   private final C_EventBus_mc u;
   private final rs.p_s.p_h.C_b v;
   private rs.p_ui.p_components.C_e w;
   private final List<C_c> x = new CopyOnWriteArrayList<>();

   C_g(C_f var1, C_Client_mc var2, C_EventBus_mc var3, String var4, rs.p_s.p_h.C_b var5, @NonNull rs.p_ui.p_components.C_e var6) {
      if (var6 == null) {
         throw new NullPointerException("orientation is marked non-null but is null");
      } else {
         this.t = var1;
         this.a = var2;
         this.u = var3;
         this.m = var4;
         this.w = var6;
         this.v = var5;
         if (var4.equalsIgnoreCase("Boosts")) {
            this.a(C_l.g);
         } else {
            this.a(C_l.c);
         }

         this.e(false);
         this.g(true);
         this.e.a(true);
         this.e.a(null);
         this.e.a(new Rectangle());
         this.e.b(new Point(1, 1));
         this.a(rs.p_l.p_f.C_a.q);
         this.c(rs.p_l.p_f.C_a.A);
      }
   }

   @Override
   public Dimension a(Graphics2D var1) {
      boolean var2 = C_Client_mc.dj;
      if (!rs.p_s.p_h.C_a.b) {
         return null;
      } else if (this.x.isEmpty()) {
         return null;
      } else {
         int var3 = this.v.q();
         this.e.a(new Dimension(6 * (var3 + 1), 6 * (var3 + 1)));
         this.e.a(this.w);
         Font var4 = C_w.b();
         boolean var5 = this.v.r();
         Color var6 = rs.p_ui.p_components.C_d.c;
         Dimension var7 = new Dimension(var3, var3);

         for (C_c var9 : this.x) {
            if (var9.e() && !rs.p_s.p_h.C_a.d.contains(var9.j()) && !rs.p_s.p_h.C_a.c.contains(var9.h())) {
               if (var9.g()) {
                  this.x.remove(var9);
               } else {
                  String var10 = var9.a();
                  Color var11 = var9.b();
                  C_d var12 = new C_d();
                  if (this.v.q() <= 25) {
                     var9.a(true);
                  } else {
                     var9.a(false);
                  }

                  var12.b(var10);
                  var12.a(var4);
                  if (var11 != null) {
                     var12.a(var11);
                  }

                  var12.a(var5);
                  var12.a(var9.l());
                  var12.a(var9.n());
                  var12.a(var7);
                  var12.b(var6);
                  var12.a(var9);
                  this.e.d().add(var12);
               }
            }
         }

         Dimension var15 = super.a(var1);
         Point var16 = new Point(C_Client_mc.hP, C_Client_mc.hQ);

         for (C_q var18 : this.e.d()) {
            C_d var19 = (C_d)var18;
            if (!this.k()) {
               Rectangle var13 = new Rectangle(var19.a());
               var13.translate(this.r().x, this.r().y);
               if (var13.contains(var16)) {
                  if (this.v.s()) {
                     String var14 = var19.b();
                     if (!as.c(var14) && !var2) {
                        rs.p_l.p_f.C_e.d().f().a(var14, false);
                     }
                  }

                  if (!var2) {
                     this.t.e(var19.c());
                  }
                  break;
               }
            }
         }

         this.e.d().clear();
         return var15;
      }
   }

   @Override
   public boolean a(rs.p_l.p_f.C_b var1) {
      if (!(var1 instanceof C_g)) {
         return false;
      } else {
         this.t.a((C_g)var1, this);
         return true;
      }
   }

   rs.p_ui.p_components.C_e L() {
      return this.w = this.w == rs.p_ui.p_components.C_e.a ? rs.p_ui.p_components.C_e.b : rs.p_ui.p_components.C_e.a;
   }

   public List<C_c> M() {
      return this.x;
   }
}

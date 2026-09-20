package rs.p_l.p_f;

import com.google.a.b.L;
import com.google.a.m.l;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.util.List;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.C_Client_mc;
import rs.p_eventbus.C_EventBus_mc;
import rs.p_eventbus.C_Subscribe_mc;
import rs.p_gui.C_Launcher_mc;
import rs.p_gui.C_w;
import rs.p_runelite.p_events.C_FocusChanged_mc;

public class C_i {
   private static final Logger g = LoggerFactory.getLogger(C_i.class);
   private Rectangle h;
   private Rectangle i;
   private boolean j = false;
   private boolean k;
   private int l = -1;
   C_c a;
   C_c b;
   private boolean m;
   private final Point n = new Point();
   private final Point o = new Point();
   private C_g p;
   private C_g q;
   private Rectangle r;
   private boolean s;
   private boolean t;
   private boolean u;
   private boolean v;
   C_g c;
   C_g d;
   private final C_e w;
   private final rs.p_s.C_h x;
   private final rs.p_g.p_a.C_b y;
   private final rs.p_ui.C_f z;
   private final C_Client_mc A;
   private final C_EventBus_mc B;
   private final rs.p_e.C_i C;
   public static final String e = "Configure";
   private static final String D = "_preferredLocation";
   private static final String E = "_preferredPosition";
   private static final String F = "_preferredSize";
   private static final String G = rs.p_s.C_h.class.getAnnotation(rs.p_e.C_e.class).a();
   private static final int H = 5;
   private static final int I = 20;
   private static final int J = 2;
   private static final int K = 5;
   private static final Dimension L = new Dimension(80, 80);
   private static final Color M = new Color(0, 255, 255, 50);
   private static final Color N = new Color(0, 255, 0, 100);
   private static final Color O = new Color(255, 255, 0, 100);
   private static final Color P = new Color(255, 255, 0, 200);
   private static final Color Q = Color.RED;
   private static final Color R = new Color(255, 0, 255, 200);

   public C_i(C_e var1, rs.p_ui.C_f var2, C_Client_mc var3, rs.p_s.C_h var4, C_EventBus_mc var5, rs.p_g.p_a.C_b var6, rs.p_e.C_i var7) {
      this.w = var1;
      this.C = var7;
      this.z = var2;
      this.A = var3;
      this.B = var5;
      this.x = var4;
      this.y = var6;
      C_j var8 = new C_j(this, var4::x);
      var6.a(var8);
      var5.register(this);
   }

   public void a(C_a var1, List<C_g> var2) {
      if (!var2.isEmpty()) {
         Graphics2D var3 = this.a(var1);
         if (var1 == C_a.A && this.u && this.p != null && this.p.I()) {
            C_c var4 = this.b.a(-L.width, -L.height);
            Color var5 = var3.getColor();

            for (Rectangle var7 : var4.a()) {
               var3.setColor(var7.contains(this.o) ? N : M);
               var3.fill(var7);
            }

            var3.setColor(var5);
         }

         AffineTransform var22 = var3.getTransform();
         Stroke var23 = var3.getStroke();
         Composite var24 = var3.getComposite();
         Paint var25 = var3.getPaint();
         RenderingHints var8 = var3.getRenderingHints();
         Color var9 = var3.getBackground();
         Rectangle var10 = this.b(var1);
         var3.setClip(var10);

         for (C_g var12 : var2) {
            C_l var13 = this.c(var12);
            Rectangle var14 = var12.r();
            Dimension var15 = var14.getSize();
            Point var16 = var12.u();
            Rectangle var18 = null;
            Point var26;
            if (var13 != C_l.b && var13 != C_l.j && var13 != C_l.a && var16 == null) {
               var18 = this.b.a(var13);
               Point var19 = C_m.a(var13, var15);
               int var20 = var18.x + var19.x;
               int var21 = var18.y + var19.y;
               var26 = this.a(var20, var21, var15.width, var15.height, var12);
               this.a(var12, false);
            } else {
               var26 = var16 != null ? var16 : var14.getLocation();
               var26 = this.a(var26.x, var26.y, var15.width, var15.height, var12);
               this.a(var12, true);
            }

            if (var12.w() != null) {
               var26.translate(var12.w().x, var12.w().y);
            }

            if (var12.v() != null) {
               var14.setSize(var12.v());
            }

            if (var12.f() == null) {
               var12.a(this.A);
            }

            this.a(var12, var3, var26);
            if (var18 != null && var14.width + var14.height > 0) {
               C_m.a(var13, var18, var14, 2);
            }

            var3.setTransform(var22);
            var3.setStroke(var23);
            var3.setComposite(var24);
            var3.setPaint(var25);
            var3.setRenderingHints(var8);
            var3.setBackground(var9);
            if (!var3.getClip().equals(var10)) {
               var3.setClip(var10);
            }

            if (!var14.isEmpty()) {
               if (this.s && var12.H()) {
                  Color var27;
                  if (this.t && this.p == var12) {
                     var27 = R;
                  } else if (this.u && this.p == var12) {
                     var27 = P;
                  } else if (this.u && var12.G() && this.p.G() && this.p.r().intersects(var14)) {
                     var27 = Q;

                     assert this.p != var12;

                     this.q = var12;
                  } else {
                     var27 = O;
                  }

                  var3.setColor(var27);
                  var3.draw(var14);
                  var3.setPaint(var25);
               }

               if (!C_Client_mc.dj && var14.contains(this.o)) {
                  this.c = var12;
                  if (var12.l() && !this.s) {
                     var12.m();
                  }
               }
            }
         }
      }
   }

   public MouseEvent a(MouseEvent var1) {
      Point var2 = this.w.a(var1.getPoint());
      this.o.setLocation(var2);
      this.p = this.d;
      if (this.p == null) {
         return var1;
      } else if (!this.s) {
         boolean var4 = this.p.l() || this.p.J();
         if (var4 && this.p.n()) {
            var1.consume();
         }

         return var1;
      } else if (!this.p.H()) {
         return var1;
      } else {
         if (SwingUtilities.isRightMouseButton(var1)) {
            if (this.p.y()) {
               this.p.b();
            }
         } else {
            if (!SwingUtilities.isLeftMouseButton(var1)) {
               return var1;
            }

            Point var3 = new Point(var2.x, var2.y);
            var3.translate(-this.p.r().x, -this.p.r().y);
            this.n.setLocation(var3);
            this.t = this.p != null && this.p.z() && this.z.i() != this.z.j();
            this.u = !this.t;
            this.v = true;
            this.r = new Rectangle(this.p.r());
         }

         var1.consume();
         return var1;
      }
   }

   public void b(MouseEvent var1) {
      Point var2 = this.w.a(var1.getPoint());
      this.o.setLocation(var2);
      if (this.s) {
         if (!this.t && !this.u) {
            this.p = this.d;
         }

         if (this.p != null && this.p.z()) {
            Rectangle var3 = new Rectangle(this.p.r());
            var3.grow(-5, -5);
            int var4 = var3.outcode(var2);
            switch (var4) {
               case 1:
                  this.z.a(Cursor.getPredefinedCursor(10));
                  break;
               case 2:
                  this.z.a(Cursor.getPredefinedCursor(8));
                  break;
               case 3:
                  this.z.a(Cursor.getPredefinedCursor(6));
                  break;
               case 4:
                  this.z.a(Cursor.getPredefinedCursor(11));
                  break;
               case 5:
               case 7:
               case 10:
               case 11:
               default:
                  this.z.a(this.z.j());
                  break;
               case 6:
                  this.z.a(Cursor.getPredefinedCursor(7));
                  break;
               case 8:
                  this.z.a(Cursor.getPredefinedCursor(9));
                  break;
               case 9:
                  this.z.a(Cursor.getPredefinedCursor(4));
                  break;
               case 12:
                  this.z.a(Cursor.getPredefinedCursor(5));
            }
         } else {
            this.z.a(this.z.j());
         }
      }
   }

   public void c(MouseEvent var1) {
      Point var2 = this.w.a(var1.getPoint());
      this.o.setLocation(var2);
      if (this.s) {
         if (this.p != null) {
            if (this.q != null && !this.p.r().intersects(this.q.r())) {
               this.q = null;
            }

            Rectangle var3 = new Rectangle(this.A.aE());
            if (var3.contains(var2)) {
               if (this.t) {
                  int var4 = var2.x - this.r.x;
                  int var5 = var2.y - this.r.y;
                  int var6 = this.r.x;
                  int var7 = this.r.y;
                  int var8 = var6;
                  int var9 = var7;
                  int var10 = this.r.width;
                  int var11 = this.r.height;
                  switch (this.z.i().getType()) {
                     case 4:
                        var8 = var6 + var4;
                        var10 -= var4;
                        var11 = var5;
                        break;
                     case 5:
                        var10 = var4;
                        var11 = var5;
                        break;
                     case 6:
                        var8 = var6 + var4;
                        var9 = var7 + var5;
                        var10 -= var4;
                        var11 -= var5;
                        break;
                     case 7:
                        var9 = var7 + var5;
                        var10 = var4;
                        var11 -= var5;
                        break;
                     case 8:
                        var9 = var7 + var5;
                        var11 -= var5;
                        break;
                     case 9:
                        var11 = var5;
                        break;
                     case 10:
                        var8 = var6 + var4;
                        var10 -= var4;
                        break;
                     case 11:
                        var10 = var4;
                  }

                  int var12 = this.p.x();
                  int var13 = Math.max(0, var12 - var10);
                  int var14 = Math.max(0, var12 - var11);
                  int var15 = var8 - var6;
                  int var16 = var9 - var7;
                  if (var13 > 0) {
                     var10 = var12;
                     if (var15 > 0) {
                        var8 -= var13;
                     }
                  }

                  if (var14 > 0) {
                     var11 = var12;
                     if (var16 > 0) {
                        var9 -= var14;
                     }
                  }

                  this.r.setRect((double)var8, (double)var9, (double)var10, (double)var11);
                  this.p.a(new Dimension(this.r.width, this.r.height));
                  if (this.p.u() != null) {
                     this.p.a(this.r.getLocation());
                  }
               } else {
                  if (!this.u) {
                     return;
                  }

                  Point var17 = new Point(var2);
                  var17.translate(-this.n.x, -this.n.y);
                  Rectangle var19 = this.p.r();
                  var17 = this.a(var17.x, var17.y, var19.width, var19.height, this.p);
                  this.p.b(null);
                  this.p.a(var17);
               }

               if (this.v) {
                  this.v = false;
               }
            }
         }
      }
   }

   public void d(MouseEvent var1) {
      Point var2 = this.w.a(var1.getPoint());
      this.o.setLocation(var2);
      if (this.s && this.p != null && (this.u || this.t)) {
         if (this.q != null && this.q.a(this.p)) {
            var1.consume();
            this.c();
         } else {
            if (this.p.I() && this.u) {
               C_c var3 = this.b.a(-L.width, -L.height);

               for (Rectangle var5 : var3.a()) {
                  if (var5.contains(var2)) {
                     C_l var6 = var3.a(var5);
                     if (var6 == this.c(this.p)) {
                        var6 = null;
                     }

                     this.p.b(var6);
                     this.p.a(null);
                     this.p.o();
                     if (this.p.B() != null && this.p.i() == this.p.B()) {
                        this.p.b(this.p.j());
                        this.w.a.get(this.p.B()).remove(this.p);
                        this.w.a.get(this.p.j()).add(this.p);
                     }
                     break;
                  }
               }
            }

            this.a(this.p);
            this.c();
            var1.consume();
         }
      }
   }

   @C_Subscribe_mc
   public void onFocusChanged(C_FocusChanged_mc var1) {
      if (!var1.isFocused()) {
         if (this.s) {
            this.s = false;
            this.c();
         }

         this.c = null;
      }
   }

   private void a(C_g var1, Graphics2D var2, Point var3) {
      C_l var4 = var1.s();
      if (var4 == C_l.b || var4 == C_l.a) {
         var2.setFont(C_w.b());
      } else if (var4 == C_l.j) {
         var2.setFont(C_w.b());
      } else {
         var2.setFont(C_w.b());
      }

      if (var3.x > C_Client_mc.ai - var1.r().getSize().width || var3.y > C_Client_mc.ah - var1.r().getSize().height || var3.x < 0 || var3.y < 0) {
         var3 = new Point(
            Math.max(0, Math.min(C_Client_mc.ai - var1.r().getSize().width, var3.x)), Math.max(0, Math.min(C_Client_mc.ah - var1.r().getSize().height, var3.y))
         );
      }

      if (rs.p_f.C_a.ai == rs.p_f.C_a.c.a && !var1.i().B && !var1.C() && var1.B() == null) {
         int var5 = var3.x;
         int var6 = var3.y;
         if (var3.x + var1.r().width >= C_Client_mc.aj) {
            var5 = C_Client_mc.aj - var1.r().getSize().width;
         }

         if (var3.y + var1.r().getSize().height >= C_Client_mc.ak) {
            var6 = C_Client_mc.ak - var1.r().getSize().height;
         }

         if (var5 != var3.x || var6 != var3.y) {
            var3 = new Point(var5, var6);
         }
      }

      var2.translate(var3.x, var3.y);
      var1.r().setLocation(var3);

      Dimension var8;
      try {
         var8 = var1.a(var2);
      } catch (Exception var7) {
         return;
      }

      Dimension var9 = (Dimension)com.google.a.b.L.a(var8, new Dimension());
      var1.r().setSize(var9);
   }

   private Rectangle b(C_a var1) {
      return !this.k && !var1.B ? new Rectangle(this.A.ag(), this.A.ah(), this.A.at(), this.A.as()) : new Rectangle(0, 0, this.A.av(), this.A.aw());
   }

   private void c() {
      this.t = false;
      this.u = false;
      this.p = null;
      this.q = null;
      this.r = null;
      C_Launcher_mc.n().p().a(C_Launcher_mc.n().p().j());
   }

   private C_l c(C_g var1) {
      C_l var2 = var1.s();
      if (var1.t() != null) {
         var2 = var1.t();
      }

      if (!this.k) {
         switch (var2) {
            case i:
               var2 = C_l.e;
               break;
            case h:
               var2 = C_l.g;
         }
      }

      return var2;
   }

   boolean a() {
      boolean var1 = this.k != C_Client_mc.ai();
      byte var2 = -1;
      boolean var3 = false;
      if (this.l != -1) {
         this.l = -1;
         var3 = true;
      }

      if (var1) {
         this.k = C_Client_mc.ai();
         var3 = true;
      }

      if (this.i == null || var3) {
         int var4 = !C_Client_mc.ai() ? 338 : C_Client_mc.ah - 165;
         this.i = new Rectangle(0, var4, 519, 165);
         var3 = true;
      }

      Rectangle var5 = new Rectangle(this.A.at(), this.A.as());
      if (!var5.equals(this.h)) {
         this.h = var5;
         var3 = true;
      }

      return var3;
   }

   C_c b() {
      Point var1 = new Point(this.h.x + 5, this.h.y + 20);
      Point var2 = new Point(this.h.x + this.h.width / 2, this.h.y + 5);
      Point var3 = new Point(this.h.x + this.h.width - 5, var2.y);
      Point var4 = new Point(var1.x, this.h.y + this.h.height - 5);
      Point var5 = new Point(var3.x, var4.y);
      if (this.k) {
         if (!this.j) {
            var4.y = var4.y - this.i.height;
         }

         var3.x -= 241;
         var5.x -= 241;
         var5.y -= 100;
      }

      if (!this.k) {
      }

      Point var6 = this.k ? new Point(this.h.x + this.i.width - 5, var4.y) : var5;
      Point var7 = this.k ? new Point((int)this.A.aE().getWidth(), 0) : var3;
      if (!this.k) {
         var1.x += 4;
         var1.y += 4;
         var2.x += 4;
         var2.y += 4;
         var3.x += 4;
         var4.x += 0;
         var4.y += 8;
         var5.x += 4;
         var5.y += 4;
         var6.x += 4;
         var6.y += 4;
         var7.x += 4;
         var7.y += 4;
      }

      return new C_c(
         new Rectangle(var1, L),
         new Rectangle(var2, L),
         new Rectangle(var3, L),
         new Rectangle(var4, L),
         new Rectangle(var5, L),
         new Rectangle(var6, L),
         new Rectangle(var7, L)
      );
   }

   private Point a(int var1, int var2, int var3, int var4, C_g var5) {
      Rectangle var6 = var5.p();
      if (var6 == null || var6.isEmpty()) {
         Dimension var7 = C_Launcher_mc.n().o().aE();
         var6 = new Rectangle(0, 0, var7.width, var7.height);
      }

      return new Point(
         com.google.a.m.l.a(var1, var6.x, Math.max(var6.x, var6.x + var6.width - var3)),
         com.google.a.m.l.a(var2, var6.y, Math.max(var6.y, var6.y + var6.height - var4))
      );
   }

   public synchronized void a(C_g var1) {
      this.f(var1);
      this.e(var1);
      this.d(var1);
   }

   void b(C_g var1) {
      Point var2 = this.g(var1);
      Dimension var3 = this.h(var1);
      C_l var4 = this.i(var1);
      if (var1.H()) {
         var1.a(var2);
      } else if (var2 != null) {
         var1.a(null);
         this.d(var1);
      }

      var1.a(var3);
      if (var1.I()) {
         var1.b(var4);
      } else if (var4 != null) {
         var1.b(null);
         this.f(var1);
      }
   }

   private void a(C_b var1) {
      if (var1 instanceof C_g) {
         ((C_g)var1).a(this.x.s());
      }
   }

   private void d(C_g var1) {
      String var2 = var1.K() + "_preferredLocation";
      if (var1.u() != null) {
         this.C.a(G, var2, var1.u());
      } else {
         this.C.b(G, var2);
      }
   }

   private void e(C_g var1) {
      String var2 = var1.K() + "_preferredSize";
      if (var1.v() != null) {
         this.C.a(G, var2, var1.v());
      } else {
         this.C.b(G, var2);
      }
   }

   private void f(C_g var1) {
      String var2 = var1.K() + "_preferredPosition";
      if (var1.t() != null) {
         this.C.a(G, var2, var1.t());
      } else {
         this.C.b(G, var2);
      }
   }

   private Point g(C_g var1) {
      String var2 = var1.K() + "_preferredLocation";
      return this.C.a(G, var2, Point.class);
   }

   private Dimension h(C_g var1) {
      String var2 = var1.K() + "_preferredSize";
      return this.C.a(G, var2, Dimension.class);
   }

   private C_l i(C_g var1) {
      String var2 = var1.K() + "_preferredPosition";
      return this.C.a(G, var2, C_l.class);
   }

   private void a(C_g var1, boolean var2) {
      if (var1.B() != null) {
         rs.p_h.C_c.a(() -> {
            if (this.w.a.get(var1.i()).contains(var1)) {
               if (!var2 && var1.i() == var1.B()) {
                  this.w.b(var1);
                  var1.b(var1.j());
                  this.w.a(var1);
               }

               if (var2 && var1.i() == var1.j()) {
                  this.w.b(var1);
                  var1.b(var1.B());
                  this.w.a(var1);
               }
            }
         });
      }
   }

   public Graphics2D a(C_a var1) {
      return this.w.b(var1);
   }
}

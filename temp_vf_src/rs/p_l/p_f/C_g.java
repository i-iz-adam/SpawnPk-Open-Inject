package rs.p_l.p_f;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import javax.annotation.Nullable;
import rs.C_Client_mc;
import rs.p_gui.C_w;
import rs.p_ui.p_components.C_s;

public class C_g extends C_b {
   protected final C_s e = new C_s();
   protected Rectangle f = new Rectangle();
   protected C_l g = C_l.c;
   protected C_l h;
   protected Point i;
   protected Dimension j;
   protected Point k;
   private int r = 32;
   private boolean s = true;
   private boolean t = true;
   protected boolean l = false;
   protected String m = "None";
   protected float n = 0.0F;
   protected C_a o = null;
   protected boolean p = false;
   protected Color q;
   private boolean u = true;
   private boolean v = false;
   private boolean w;
   private boolean x = true;
   private boolean y = true;

   @Override
   public void a() {
   }

   public Dimension a(Graphics2D var1) {
      Dimension var2 = this.e.b();
      if (this.v() != null) {
         this.e.a(this.v());
         if (this.v) {
            if ((double)this.v().width >= 167.70000000000002) {
               var1.setFont(C_w.c());
            } else if ((double)this.v().width <= 103.2) {
               var1.setFont(C_w.b());
            }
         }
      }

      Color var3 = this.e.c();
      if (this.D() != null && rs.p_ui.p_components.C_d.c.equals(var3)) {
         this.e.a(this.D());
      }

      Dimension var4;
      try {
         var4 = this.e.a(var1);
      } finally {
         if (this.u) {
            this.e.d().clear();
         }
      }

      this.e.a(var2);
      this.e.a(var3);
      return var4;
   }

   public boolean k() {
      if (this.i().B) {
         return false;
      } else {
         return this.i().ordinal() <= C_a.q.ordinal() ? C_Client_mc.cH > 0 : false;
      }
   }

   public boolean l() {
      return !this.k();
   }

   public void m() {
   }

   public boolean n() {
      return false;
   }

   public boolean a(C_b var1) {
      return false;
   }

   public void a(C_l var1) {
      this.g = var1;
      switch (var1) {
         case j:
         case b:
            this.x = false;
            this.y = false;
            break;
         case a:
            this.x = true;
            this.y = false;
            break;
         default:
            this.x = true;
            this.y = true;
      }
   }

   @Override
   public synchronized void b() {
      this.b(null);
      this.a(null);
      this.a(null);
      C_e.d().m().a(this);
      this.o();
   }

   public void o() {
   }

   @Nullable
   public Rectangle p() {
      return null;
   }

   public C_s q() {
      return this.e;
   }

   public Rectangle r() {
      return this.f;
   }

   public C_l s() {
      return this.g;
   }

   public C_l t() {
      return this.h;
   }

   public Point u() {
      return this.i;
   }

   public Dimension v() {
      return this.j;
   }

   public Point w() {
      return this.k;
   }

   public int x() {
      return this.r;
   }

   public boolean y() {
      return this.s;
   }

   public boolean z() {
      return this.t;
   }

   public float A() {
      return this.n;
   }

   public C_a B() {
      return this.o;
   }

   public boolean C() {
      return this.p;
   }

   public Color D() {
      return this.q;
   }

   public boolean E() {
      return this.u;
   }

   public boolean F() {
      return this.v;
   }

   public boolean G() {
      return this.w;
   }

   public boolean H() {
      return this.x;
   }

   public boolean I() {
      return this.y;
   }

   public void a(Rectangle var1) {
      this.f = var1;
   }

   public void b(C_l var1) {
      this.h = var1;
   }

   public void a(Point var1) {
      this.i = var1;
   }

   public void a(Dimension var1) {
      this.j = var1;
   }

   public void b(Point var1) {
      this.k = var1;
   }

   public void a(int var1) {
      this.r = var1;
   }

   public void b(boolean var1) {
      this.s = var1;
   }

   public void c(boolean var1) {
      this.t = var1;
   }

   public void a(float var1) {
      this.n = var1;
   }

   public void c(C_a var1) {
      this.o = var1;
   }

   public void d(boolean var1) {
      this.p = var1;
   }

   public void a(Color var1) {
      this.q = var1;
   }

   public void e(boolean var1) {
      this.u = var1;
   }

   public void f(boolean var1) {
      this.v = var1;
   }

   public void g(boolean var1) {
      this.w = var1;
   }

   public void h(boolean var1) {
      this.x = var1;
   }

   public void i(boolean var1) {
      this.y = var1;
   }

   public boolean J() {
      return this.l;
   }

   protected void j(boolean var1) {
      this.l = var1;
   }

   public String K() {
      return this.m;
   }

   protected void a(String var1) {
      this.m = var1;
   }
}

package rs.p_ui.p_components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class C_s implements C_q {
   private final Rectangle a = new Rectangle();
   private Point b = new Point();
   private Dimension c = new Dimension(129, 0);
   private Color d = C_d.c;
   private final List<C_q> e = new ArrayList<>();
   private C_e f = C_e.b;
   private boolean g = false;
   private Rectangle h = new Rectangle(4, 4, 4, 4);
   private Point i = new Point(0, 0);
   private final Dimension j = new Dimension();

   @Override
   public Dimension a(Graphics2D var1) {
      if (this.e.isEmpty()) {
         return null;
      } else {
         Dimension var2 = new Dimension(this.h.x + this.j.width + this.h.width, this.h.y + this.j.height + this.h.height);
         if (this.d != null) {
            C_a var3 = new C_a();
            var3.a(new Rectangle(this.b, var2));
            var3.a(this.d);
            var3.a(var1);
         }

         int var16 = this.b.x + this.h.x;
         int var4 = this.b.y + this.h.y;
         int var5 = 0;
         int var6 = 0;
         int var7 = var16;
         int var8 = var4;
         Dimension var9 = new Dimension(this.c.width - this.h.x - this.h.width, this.c.height - this.h.y - this.h.height);
         int var10 = 0;
         int var11 = 0;

         for (C_q var13 : this.e) {
            if (!this.g) {
               switch (this.f) {
                  case b:
                     var13.a(new Dimension(var9.width, 0));
                     break;
                  case a:
                     var13.a(new Dimension(0, var9.height));
               }
            }

            var13.a(new Point(var7, var8));
            Dimension var14 = var13.a(var1);
            switch (this.f) {
               case b:
                  var6 += var14.height + this.i.y;
                  var8 = var4 + var6;
                  var5 = Math.max(var5, var14.width);
                  break;
               case a:
                  var5 += var14.width + this.i.x;
                  var7 = var16 + var5;
                  var6 = Math.max(var6, var14.height);
            }

            var11 = Math.max(var11, var5);
            var10 = Math.max(var10, var6);
            if (this.g) {
               switch (this.f) {
                  case b:
                     if (var9.height > 0 && var6 >= var9.height) {
                        var6 = 0;
                        var8 = var4;
                        int var17 = var14.width + this.i.x;
                        var7 += var17;
                        var5 += var17;
                     }
                     break;
                  case a:
                     if (var9.width > 0 && var5 >= var9.width) {
                        var5 = 0;
                        var7 = var16;
                        int var15 = var14.height + this.i.y;
                        var8 += var15;
                        var6 += var15;
                     }
               }
            }
         }

         if (this.f == C_e.a) {
            var11 -= this.i.x;
         } else {
            var10 -= this.i.y;
         }

         this.j.setSize(var11, var10);
         this.a.setLocation(this.b);
         this.a.setSize(var2);
         return var2;
      }
   }

   @Override
   public Rectangle a() {
      return this.a;
   }

   @Override
   public void a(Point var1) {
      this.b = var1;
   }

   @Override
   public void a(Dimension var1) {
      this.c = var1;
   }

   public Dimension b() {
      return this.c;
   }

   public void a(Color var1) {
      this.d = var1;
   }

   public Color c() {
      return this.d;
   }

   public List<C_q> d() {
      return this.e;
   }

   public void a(C_e var1) {
      this.f = var1;
   }

   public void a(boolean var1) {
      this.g = var1;
   }

   public void a(Rectangle var1) {
      this.h = var1;
   }

   public void b(Point var1) {
      this.i = var1;
   }
}

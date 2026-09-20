package rs.p_runelite.p_a;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Float;
import java.util.ArrayList;
import java.util.List;

public class C_m implements Shape {
   private static final int a = 16;
   protected int[] d;
   protected int[] e;
   protected int f;
   protected int g;

   public C_m() {
      this(new int[32], new int[32], 16, 15);
   }

   public C_m(int[] var1, int[] var2, int var3) {
      this(var1, var2, 0, var3 - 1);
   }

   public void a(int var1, int var2) {
      this.f--;
      if (this.f < 0) {
         this.a(16);
      }

      this.d[this.f] = var1;
      this.e[this.f] = var2;
   }

   public void b() {
      this.f++;
   }

   protected void a(int var1) {
      int[] var2 = new int[this.d.length + var1];
      System.arraycopy(this.d, 0, var2, var1, this.d.length);
      this.d = var2;
      int[] var3 = new int[var2.length];
      System.arraycopy(this.e, 0, var3, var1, this.e.length);
      this.e = var3;
      this.f += var1;
      this.g += var1;
   }

   public void b(int var1, int var2) {
      this.g++;
      if (this.g >= this.d.length) {
         this.b(16);
      }

      this.d[this.g] = var1;
      this.e[this.g] = var2;
   }

   public void c() {
      this.g--;
   }

   protected void b(int var1) {
      int[] var2 = new int[this.d.length + var1];
      System.arraycopy(this.d, 0, var2, 0, this.d.length);
      this.d = var2;
      int[] var3 = new int[var2.length];
      System.arraycopy(this.e, 0, var3, 0, this.e.length);
      this.e = var3;
   }

   public int c(int var1) {
      return this.d[this.f + var1];
   }

   public int d(int var1) {
      return this.e[this.f + var1];
   }

   public int d() {
      return this.g - this.f + 1;
   }

   public List<C_i> e() {
      ArrayList var1 = new ArrayList(this.d());

      for (int var2 = this.f; var2 <= this.g; var2++) {
         var1.add(new C_i(this.d[var2], this.e[var2]));
      }

      return var1;
   }

   public void a(int[] var1, int[] var2, int var3) {
      System.arraycopy(this.d, this.f, var1, var3, this.d());
      System.arraycopy(this.e, this.f, var2, var3, this.d());
   }

   public void a(C_m var1) {
      int var2 = this.d();
      if (var2 > 0) {
         var1.b(var2);
         this.a(var1.d, var1.e, var1.g + 1);
         var1.g += var2;
      }
   }

   public void a() {
      int var1 = this.d() / 2;

      for (int var2 = 0; var2 < var1; var2++) {
         int var3 = this.f + var2;
         int var4 = this.g - var2;
         int var5 = this.d[var3];
         int var6 = this.e[var3];
         this.d[var3] = this.d[var4];
         this.e[var3] = this.e[var4];
         this.d[var4] = var5;
         this.e[var4] = var6;
      }
   }

   public void b(C_m var1) {
      int[] var2 = new int[this.d()];
      int[] var3 = new int[var2.length];
      int var4 = var1.d[var1.g];
      int var5 = var1.e[var1.g];

      for (int var6 = var1.f; var6 <= var1.g; var6++) {
         if (this.d() < 3) {
            return;
         }

         int var7 = this.g;
         int var8 = this.f;
         int[] var9 = this.d;
         int[] var10 = this.e;
         this.d = var2;
         this.e = var3;
         this.f = 0;
         this.g = -1;
         var2 = var9;
         var3 = var10;
         int var11 = var1.d[var6];
         int var12 = var1.e[var6];
         int var13 = var9[var7];
         int var14 = var10[var7];

         for (int var15 = var8; var15 <= var7; var15++) {
            int var16 = var2[var15];
            int var17 = var3[var15];
            int var18 = (var11 - var4) * (var14 - var5) - (var12 - var5) * (var13 - var4);
            int var19 = (var11 - var4) * (var17 - var5) - (var12 - var5) * (var16 - var4);
            if (var18 < 0 && var19 < 0) {
               this.b(var16, var17);
            } else if (var18 >= 0 != var19 >= 0) {
               long var20 = (long)(var4 * var12 - var5 * var11);
               long var22 = (long)(var13 * var17 - var14 * var16);
               long var24 = (long)((var4 - var11) * (var14 - var17) - (var5 - var12) * (var13 - var16));
               this.b(
                  (int)((var20 * (long)(var13 - var16) - (long)(var4 - var11) * var22) / var24),
                  (int)((var20 * (long)(var14 - var17) - (long)(var5 - var12) * var22) / var24)
               );
               if (var18 >= 0) {
                  this.b(var16, var17);
               }
            }

            var13 = var16;
            var14 = var17;
         }

         var4 = var11;
         var5 = var12;
      }
   }

   @Override
   public Rectangle getBounds() {
      int var1 = Integer.MAX_VALUE;
      int var2 = Integer.MAX_VALUE;
      int var3 = Integer.MIN_VALUE;
      int var4 = Integer.MIN_VALUE;

      for (int var5 = this.f; var5 <= this.g; var5++) {
         int var6 = this.d[var5];
         int var7 = this.e[var5];
         if (var6 < var1) {
            var1 = var6;
         }

         if (var6 > var3) {
            var3 = var6;
         }

         if (var7 < var2) {
            var2 = var7;
         }

         if (var7 > var4) {
            var4 = var7;
         }
      }

      return new Rectangle(var1, var2, var3 - var1, var4 - var2);
   }

   @Override
   public Rectangle2D getBounds2D() {
      Rectangle var1 = this.getBounds();
      return new Float((float)var1.x, (float)var1.y, (float)var1.width, (float)var1.height);
   }

   @Override
   public boolean contains(double var1, double var3) {
      return this.d() < 3 ? false : (this.a(var1, var3, false) & 1) != 0;
   }

   private int a(double var1, double var3, boolean var5) {
      int var6 = 0;
      int[] var7 = this.d;
      int[] var8 = this.e;
      if (var5) {
         var8 = this.d;
         var7 = this.e;
      }

      int var9 = var7[this.g];
      int var10 = var8[this.g];
      int var13 = this.f;

      while (var13 <= this.g) {
         int var11 = var7[var13];
         int var12 = var8[var13];
         if (var10 != var12) {
            double var14 = (double)var10;
            double var16 = (double)var12;
            if (var3 <= var14 != var3 <= var16) {
               double var18 = (double)var9;
               double var20 = (double)var11;
               boolean var22 = var1 < var18;
               if (var22 == var1 < var20) {
                  if (!var22) {
                     var6++;
                  }
               } else if ((var20 - var18) * (var3 - var14) - (var1 - var18) * (var16 - var14) > 0.0 == var14 > var16) {
                  var6++;
               }
            }
         }

         var13++;
         var9 = var11;
         var10 = var12;
      }

      return var6;
   }

   @Override
   public boolean contains(Point2D var1) {
      return this.contains(var1.getX(), var1.getY());
   }

   @Override
   public boolean intersects(double var1, double var3, double var5, double var7) {
      double var9 = var1 + var5;
      double var11 = var3 + var7;
      return this.a(var1, var3, false) != this.a(var9, var3, false)
         || this.a(var1, var11, false) != this.a(var9, var11, false)
         || this.a(var1, var3, true) != this.a(var1, var11, true)
         || this.a(var9, var3, true) != this.a(var9, var11, true);
   }

   @Override
   public boolean intersects(Rectangle2D var1) {
      return this.intersects(var1.getX(), var1.getY(), var1.getWidth(), var1.getHeight());
   }

   @Override
   public boolean contains(double var1, double var3, double var5, double var7) {
      return !this.getBounds().contains(var1, var3, var5, var7) ? false : !this.intersects(var1, var3, var5, var7);
   }

   @Override
   public boolean contains(Rectangle2D var1) {
      return this.contains(var1.getX(), var1.getY(), var1.getWidth(), var1.getHeight());
   }

   @Override
   public PathIterator getPathIterator(AffineTransform var1) {
      return (PathIterator)(var1 == null ? new C_m.a(null) : new C_m.b(var1));
   }

   @Override
   public PathIterator getPathIterator(AffineTransform var1, double var2) {
      return this.getPathIterator(var1);
   }

   public C_m(int[] var1, int[] var2, int var3, int var4) {
      this.d = var1;
      this.e = var2;
      this.f = var3;
      this.g = var4;
   }

   public int[] f() {
      return this.d;
   }

   public int[] g() {
      return this.e;
   }

   public int h() {
      return this.f;
   }

   public int i() {
      return this.g;
   }

   public void a(int[] var1) {
      this.d = var1;
   }

   public void b(int[] var1) {
      this.e = var1;
   }

   public void e(int var1) {
      this.f = var1;
   }

   public void f(int var1) {
      this.g = var1;
   }

   private class a implements PathIterator {
      private int b = -1;

      private a() {
      }

      @Override
      public int getWindingRule() {
         return 0;
      }

      @Override
      public boolean isDone() {
         return C_m.this.d() == 0 || this.b > C_m.this.g;
      }

      @Override
      public void next() {
         if (this.b == -1) {
            this.b = C_m.this.f;
         } else {
            this.b++;
         }
      }

      @Override
      public int currentSegment(float[] var1) {
         if (this.b == -1) {
            var1[0] = (float)C_m.this.d[C_m.this.g];
            var1[1] = (float)C_m.this.e[C_m.this.g];
            return 0;
         } else {
            var1[0] = (float)C_m.this.d[this.b];
            var1[1] = (float)C_m.this.e[this.b];
            return 1;
         }
      }

      @Override
      public int currentSegment(double[] var1) {
         if (this.b == -1) {
            var1[0] = (double)C_m.this.d[C_m.this.g];
            var1[1] = (double)C_m.this.e[C_m.this.g];
            return 0;
         } else {
            var1[0] = (double)C_m.this.d[this.b];
            var1[1] = (double)C_m.this.e[this.b];
            return 1;
         }
      }
   }

   private class b extends C_m.a {
      private final AffineTransform c;

      b(AffineTransform var2) {
         this.c = var2;
      }

      @Override
      public int currentSegment(float[] var1) {
         int var2 = super.currentSegment(var1);
         this.c.transform(var1, 0, var1, 0, 2);
         return var2;
      }

      @Override
      public int currentSegment(double[] var1) {
         int var2 = super.currentSegment(var1);
         this.c.transform(var1, 0, var1, 0, 2);
         return var2;
      }
   }
}

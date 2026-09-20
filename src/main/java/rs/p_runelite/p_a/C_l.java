package rs.p_runelite.p_a;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C_l<T extends Shape> implements Shape {
   private final List<T> a;

   public C_l(T... var1) {
      this(Arrays.asList((T[])var1));
   }

   @Override
   public Rectangle getBounds() {
      int var1 = Integer.MAX_VALUE;
      int var2 = Integer.MAX_VALUE;
      int var3 = Integer.MIN_VALUE;
      int var4 = Integer.MIN_VALUE;

      for (Shape var6 : this.a) {
         Rectangle var7 = var6.getBounds();
         var1 = Math.min(var7.x, var1);
         var2 = Math.min(var7.y, var2);
         var3 = Math.max(var7.x + var7.width, var3);
         var4 = Math.max(var7.y + var7.height, var4);
      }

      return new Rectangle(var1, var2, var3 - var1, var4 - var2);
   }

   @Override
   public Rectangle2D getBounds2D() {
      double var1 = Double.MAX_VALUE;
      double var3 = Double.MAX_VALUE;
      double var5 = Double.MIN_VALUE;
      double var7 = Double.MIN_VALUE;

      for (Shape var10 : this.a) {
         Rectangle2D var11 = var10.getBounds2D();
         var1 = Math.min(var11.getX(), var1);
         var3 = Math.min(var11.getY(), var3);
         var5 = Math.max(var11.getMaxX(), var5);
         var7 = Math.max(var11.getMaxY(), var7);
      }

      return new java.awt.geom.Rectangle2D.Double(var1, var3, var5 - var1, var7 - var3);
   }

   @Override
   public boolean contains(double var1, double var3) {
      return this.a.stream().anyMatch(var4 -> var4.contains(var1, var3));
   }

   @Override
   public boolean contains(Point2D var1) {
      return this.a.stream().anyMatch(var1x -> var1x.contains(var1));
   }

   @Override
   public boolean intersects(double var1, double var3, double var5, double var7) {
      return this.a.stream().anyMatch(var8 -> var8.intersects(var1, var3, var5, var7));
   }

   @Override
   public boolean intersects(Rectangle2D var1) {
      return this.a.stream().anyMatch(var1x -> var1x.intersects(var1));
   }

   @Override
   public boolean contains(double var1, double var3, double var5, double var7) {
      return this.a.stream().anyMatch(var8 -> var8.contains(var1, var3, var5, var7));
   }

   @Override
   public boolean contains(Rectangle2D var1) {
      return this.a.stream().anyMatch(var1x -> var1x.contains(var1));
   }

   @Override
   public PathIterator getPathIterator(AffineTransform var1) {
      return new C_l.a(this.a.stream().map(var1x -> var1x.getPathIterator(var1)).iterator());
   }

   @Override
   public PathIterator getPathIterator(AffineTransform var1, double var2) {
      return new C_l.a(this.a.stream().map(var3 -> var3.getPathIterator(var1, var2)).iterator());
   }

   public C_l(List<T> var1) {
      this.a = var1;
   }

   public List<T> a() {
      return this.a;
   }

   private static class a implements PathIterator {
      private final Iterator<PathIterator> b;
      private PathIterator c = null;
      private final int d;

      a(Iterator<PathIterator> var1) {
         this.b = var1;
         if (var1.hasNext()) {
            this.c = (PathIterator)var1.next();
            this.d = this.c.getWindingRule();
            this.a();
         } else {
            this.d = 0;
         }
      }

      @Override
      public int getWindingRule() {
         return this.d;
      }

      @Override
      public boolean isDone() {
         return this.c == null;
      }

      @Override
      public void next() {
         this.c.next();
         this.a();
      }

      private void a() {
         while (this.c != null && this.c.isDone()) {
            if (this.b.hasNext()) {
               this.c = this.b.next();

               assert this.d == this.c.getWindingRule();
            } else {
               this.c = null;
            }
         }
      }

      @Override
      public int currentSegment(float[] var1) {
         return this.c.currentSegment(var1);
      }

      @Override
      public int currentSegment(double[] var1) {
         return this.c.currentSegment(var1);
      }
   }
}

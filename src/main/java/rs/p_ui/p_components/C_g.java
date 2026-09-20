package rs.p_ui.p_components;

import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.dnd.DragSource;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JLayeredPane;
import javax.swing.SwingUtilities;

public class C_g extends JLayeredPane {
   private Point b;
   private Component c;
   private int d = 0;
   private int e = -1;
   private final List<C_g.c> f = new ArrayList<>(0);

   public C_g() {
      this.setLayout(new C_g.a(null));
      C_g.b var1 = new C_g.b(null);
      this.addMouseListener(var1);
      this.addMouseMotionListener(var1);
   }

   @Override
   public void setLayout(LayoutManager var1) {
      if (var1 != null && !(var1 instanceof C_g.a)) {
         throw new IllegalArgumentException("DragAndDropReorderPane only supports DragAndDropReorderLayoutManager");
      } else {
         super.setLayout(var1);
      }
   }

   public void a(C_g.c var1) {
      this.f.add(var1);
   }

   public void b(C_g.c var1) {
      this.f.remove(var1);
   }

   private void a(Point var1) {
      this.c = this.d(this.b);
      if (this.c == null) {
         this.b = null;
      } else {
         this.d = SwingUtilities.convertPoint(this, this.b, this.c).y;
         this.e = this.getPosition(this.c);
         this.setLayer(this.c, DRAG_LAYER);
         this.c(var1);
      }
   }

   private void b(Point var1) {
      this.c(var1);
      Component var2 = this.a(this.c.getBounds());
      if (var2 != null) {
         assert var2 != this.c;

         int var3 = var2.getY() + var2.getHeight() / 2;
         int var4 = this.getPosition(var2);
         boolean var5 = var4 < this.e;
         int var6;
         if (var5 && this.c.getY() < var3) {
            var6 = var4;
         } else {
            if (var5 || this.c.getY() + this.c.getHeight() <= var3) {
               return;
            }

            var6 = var4 + 1;
         }

         assert var6 != this.e;

         this.e = var6;
         this.revalidate();
      }
   }

   private void a() {
      if (this.c != null) {
         Component var1 = this.c;
         this.setLayer(this.c, DEFAULT_LAYER, this.e);
         this.c = null;
         this.d = 0;
         this.e = -1;
         this.revalidate();
         this.f.forEach(var1x -> var1x.a(var1));
      }

      this.b = null;
   }

   private void c(Point var1) {
      int var2 = var1.y - this.d;
      var2 = Math.max(var2, 0);
      var2 = Math.min(var2, this.getHeight() - this.c.getHeight());
      this.c.setLocation(new Point(0, var2));
   }

   private Component d(Point var1) {
      for (Component var5 : this.getComponentsInLayer(DEFAULT_LAYER)) {
         if (var5.contains(var1.x - var5.getX(), var1.y - var5.getY())) {
            return var5;
         }
      }

      return null;
   }

   private Component a(Rectangle var1) {
      for (Component var5 : this.getComponentsInLayer(DEFAULT_LAYER)) {
         if (var1.intersects(var5.getBounds())) {
            return var5;
         }
      }

      return null;
   }

   private class a extends BoxLayout {
      private a() {
         super(C_g.this, 1);
      }

      @Override
      public void layoutContainer(Container var1) {
         if (C_g.this.c != null) {
            Point var2 = C_g.this.c.getLocation();
            C_g.this.setLayer(C_g.this.c, JLayeredPane.DEFAULT_LAYER, C_g.this.e);
            C_g.this.revalidate();
            super.layoutContainer(var1);
            C_g.this.setLayer(C_g.this.c, JLayeredPane.DRAG_LAYER);
            C_g.this.c.setLocation(var2);
         } else {
            super.layoutContainer(var1);
         }
      }
   }

   private class b extends MouseAdapter {
      private b() {
      }

      @Override
      public void mousePressed(MouseEvent var1) {
         if (SwingUtilities.isLeftMouseButton(var1) && C_g.this.getComponentCount() > 1) {
            C_g.this.b = var1.getPoint();
         }
      }

      @Override
      public void mouseDragged(MouseEvent var1) {
         if (SwingUtilities.isLeftMouseButton(var1) && C_g.this.b != null) {
            Point var2 = var1.getPoint();
            if (C_g.this.c != null) {
               C_g.this.b(var2);
            } else if (var2.distance(C_g.this.b) > (double)DragSource.getDragThreshold()) {
               C_g.this.a(var2);
            }
         }
      }

      @Override
      public void mouseReleased(MouseEvent var1) {
         if (SwingUtilities.isLeftMouseButton(var1)) {
            C_g.this.a();
         }
      }
   }

   @FunctionalInterface
   public interface c {
      void a(Component var1);
   }
}

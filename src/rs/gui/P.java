package rs.gui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;

class P implements LayoutManager2 {
   P(O var1) {
      this.a = var1;
   }

   @Override
   public void addLayoutComponent(String var1, Component var2) {
   }

   @Override
   public void addLayoutComponent(Component var1, Object var2) {
   }

   @Override
   public void removeLayoutComponent(Component var1) {
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      int var2 = var1.getComponentCount() * 27;
      return new Dimension(var2, 23);
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      return this.preferredLayoutSize(var1);
   }

   @Override
   public Dimension maximumLayoutSize(Container var1) {
      return this.preferredLayoutSize(var1);
   }

   @Override
   public float getLayoutAlignmentX(Container var1) {
      return 0.0F;
   }

   @Override
   public float getLayoutAlignmentY(Container var1) {
      return 0.0F;
   }

   @Override
   public void invalidateLayout(Container var1) {
   }

   @Override
   public void layoutContainer(Container var1) {
      int var2 = 0;

      for (Component var6 : var1.getComponents()) {
         var2 += 4;
         int var7 = var6.getPreferredSize().height;
         if (var7 > 23) {
            var7 = 23;
         }

         var6.setBounds(var2, (23 - var7) / 2, 23, var7);
         var2 += 23;
      }
   }
}

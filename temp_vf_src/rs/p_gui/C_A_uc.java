package rs.p_gui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JComponent;

class C_A_uc implements LayoutManager {
   C_A_uc(C_Launcher_mc var1, LayoutManager var2, JComponent var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   @Override
   public void addLayoutComponent(String var1, Component var2) {
      this.a.addLayoutComponent(var1, var2);
   }

   @Override
   public void removeLayoutComponent(Component var1) {
      this.a.removeLayoutComponent(var1);
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      return this.a.preferredLayoutSize(var1);
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      return this.a.minimumLayoutSize(var1);
   }

   @Override
   public void layoutContainer(Container var1) {
      this.a.layoutContainer(var1);
      int var2 = C_Launcher_mc.b(this.c).getPreferredSize().width;
      C_Launcher_mc.b(this.c).setBounds(this.b.getWidth() - 75 - var2, 0, var2, this.b.getHeight());
   }
}

package rs;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.FocusListener;
import rs.p_gui.C_Launcher_mc;

public final class C_b extends Canvas {
   Component a;
   private static boolean b;

   public C_b(Component var1) {
      this.a = var1;
   }

   @Override
   public void update(Graphics var1) {
      this.a.update(var1);
   }

   @Override
   public void paint(Graphics var1) {
      this.a.paint(var1);
   }

   @Override
   public void removeFocusListener(FocusListener var1) {
      super.removeFocusListener(var1);
      b = !this.hasFocus();
   }

   @Override
   public void requestFocus() {
      if (!b) {
         this.requestFocusInWindow();
      }
   }

   @Override
   public void setSize(int var1, int var2) {
      if (C_Launcher_mc.n().o().ay()) {
         super.setSize(C_Launcher_mc.n().o().aF().width, C_Launcher_mc.n().o().aF().height);
      } else {
         super.setSize(var1, var2);
      }
   }

   @Override
   public void setLocation(int var1, int var2) {
      super.setLocation(var1, var2);
   }
}

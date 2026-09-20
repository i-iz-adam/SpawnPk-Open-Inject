package rs;

import java.awt.Cursor;
import java.awt.Graphics;
import javax.swing.JFrame;

public final class C_E_uc extends JFrame {
   private final C_C_uc a;

   public C_E_uc(C_C_uc var1) {
      this.a = var1;
   }

   public C_E_uc(C_C_uc var1, int var2, int var3) {
      this.a = var1;
      this.setTitle("Jagex");
      this.setResizable(true);
      this.setFocusTraversalKeysEnabled(false);
      this.setVisible(true);
      this.toFront();
      this.setSize(var2 + 8, var3 + 28);
   }

   @Override
   public Graphics getGraphics() {
      return super.getGraphics();
   }

   @Override
   public void update(Graphics var1) {
      super.update(var1);
      this.a.update(var1);
   }

   @Override
   public void paint(Graphics var1) {
      super.paint(var1);
      this.a.paint(var1);
   }

   @Override
   public void setCursor(Cursor var1) {
      if (rs.p_f.C_a.ai == rs.p_f.C_a.c.b) {
         super.setCursor(var1);
      } else {
         super.setCursor(Cursor.getDefaultCursor());
      }
   }
}

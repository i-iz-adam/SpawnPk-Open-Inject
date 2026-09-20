package rs.p_ui.p_components;

import java.awt.Color;
import javax.swing.JPanel;

public class C_f extends JPanel {
   private boolean a = false;
   private Color b = null;
   private Color c = null;
   private Color d = null;
   private Color e = null;

   @Override
   public void setForeground(Color var1) {
      this.d = var1;
      this.b = var1.darker();
      super.setForeground(var1);
   }

   @Override
   public void setBackground(Color var1) {
      this.e = var1;
      this.c = var1.darker();
      super.setBackground(var1);
   }

   @Override
   public Color getForeground() {
      return this.a ? this.b : this.d;
   }

   @Override
   public Color getBackground() {
      return this.a ? this.c : this.e;
   }

   public void a(boolean var1) {
      this.a = var1;
      if (var1) {
         super.setBackground(this.c);
         super.setForeground(this.b);
      } else {
         super.setBackground(this.e);
         super.setForeground(this.d);
      }
   }

   public boolean a() {
      return this.a;
   }
}

package rs.p_ui.p_components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class C_CustomScrollBarUI_mc extends BasicScrollBarUI {
   private Color a = rs.p_gui.C_d.e;
   private Color b = rs.p_gui.C_d.o;

   @Override
   protected void paintTrack(Graphics var1, JComponent var2, Rectangle var3) {
      var1.setColor(this.b);
      var1.fillRect(var3.x, var3.y, var3.width, var3.height);
   }

   @Override
   protected void paintThumb(Graphics var1, JComponent var2, Rectangle var3) {
      var1.setColor(this.a);
      var1.fillRect(var3.x, var3.y, var3.width, var3.height);
   }

   protected JButton a() {
      JButton var1 = new JButton();
      Dimension var2 = new Dimension(0, 0);
      var1.setPreferredSize(var2);
      var1.setMinimumSize(var2);
      var1.setMaximumSize(var2);
      return var1;
   }

   public static ComponentUI createUI(JComponent var0) {
      JScrollBar var1 = (JScrollBar)var0;
      var1.setUnitIncrement(16);
      var1.setPreferredSize(new Dimension(7, 7));
      return new C_CustomScrollBarUI_mc();
   }

   @Override
   protected JButton createDecreaseButton(int var1) {
      return this.a();
   }

   @Override
   protected JButton createIncreaseButton(int var1) {
      return this.a();
   }

   public void a(Color var1) {
      this.a = var1;
   }

   public void b(Color var1) {
      this.b = var1;
   }
}

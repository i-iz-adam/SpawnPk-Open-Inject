package rs.p_ui.p_components.p_shadowlabel;

import java.awt.Color;
import java.awt.Point;
import javax.swing.JLabel;

public class C_a extends JLabel {
   private Color a = Color.BLACK;
   private Point b = new Point(1, 1);

   public C_a() {
      this.setUI(new C_JShadowedLabelUI_mc());
   }

   public C_a(String var1) {
      super(var1);
      this.setUI(new C_JShadowedLabelUI_mc());
   }

   public void a(Color var1) {
      this.a = var1;
      this.repaint();
   }

   public void a(Point var1) {
      this.b = var1;
      this.revalidate();
      this.repaint();
   }

   public Color a() {
      return this.a;
   }

   public Point b() {
      return this.b;
   }
}

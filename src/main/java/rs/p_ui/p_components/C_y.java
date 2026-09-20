package rs.p_ui.p_components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class C_y extends JPanel {
   private int a = 1;
   private int b;

   public C_y() {
      this.setForeground(Color.GREEN);
      this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 4));
      this.setMinimumSize(new Dimension(0, 4));
      this.setPreferredSize(new Dimension(0, 4));
      this.setSize(new Dimension(0, 4));
      this.setOpaque(true);
   }

   public double a() {
      return (double)(this.b * 100 / this.a);
   }

   @Override
   public void setForeground(Color var1) {
      super.setForeground(var1);
      this.setBackground(var1.darker().darker());
   }

   public void a(int var1) {
      if (var1 < 1) {
         var1 = 1;
      }

      this.a = var1;
      this.repaint();
   }

   public void b(int var1) {
      this.b = var1;
      this.repaint();
   }

   @Override
   public void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      int var2 = this.getWidth();
      int var3 = this.getHeight();
      int var4 = this.b * var2 / this.a;
      var1.setColor(this.getBackground());
      var1.fillRect(var4, 0, var2, var3);
      var1.setColor(this.getForeground());
      var1.fillRect(0, 0, var4, var3);
   }

   public int b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }
}

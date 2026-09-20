package rs.p_ui.p_components.p_a;

import com.google.a.m.l;
import java.awt.Color;
import java.awt.Graphics;
import java.util.function.Consumer;
import javax.swing.JPanel;

public class C_h extends JPanel {
   static final int a = 4;
   private static final int b = 14;
   private static final Color c = new Color(20, 20, 20);
   private static final Color d = new Color(150, 150, 150);
   private int e = 259;
   private Consumer<Integer> f;

   C_h() {
      this.addMouseMotionListener(new C_i(this));
      this.addMouseListener(new C_j(this));
   }

   public void a(int var1) {
      this.a(var1 + 4, false);
   }

   private void a(int var1, boolean var2) {
      this.e = l.a(var1, 4, 259);
      this.paintImmediately(0, 0, this.getWidth(), this.getHeight());
      if (var2 && this.f != null) {
         this.f.accept(this.a());
      }
   }

   @Override
   public void paint(Graphics var1) {
      super.paint(var1);
      var1.setColor(c);
      var1.fillRect(0, this.getHeight() / 2 - 2, 263, 5);
      var1.setColor(d);
      var1.fillRect(this.e - 2, this.getHeight() / 2 - 7, 4, 14);
   }

   int a() {
      return this.e - 4;
   }

   public void a(Consumer<Integer> var1) {
      this.f = var1;
   }
}

package rs.p_A_uc;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class C_d extends BufferedImage {
   private final List<Runnable> a = new ArrayList<>();
   private boolean b;

   public C_d(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public synchronized void a() {
      this.b = true;

      for (Runnable var2 : this.a) {
         var2.run();
      }

      this.a.clear();
   }

   public synchronized void a(Runnable var1) {
      if (this.b) {
         rs.p_h.C_a.a(var1::run);
      } else {
         this.a.add(var1);
      }
   }

   public void a(JButton var1) {
      var1.setIcon(this.a((JComponent)var1));
   }

   public void a(JLabel var1) {
      var1.setIcon(this.a((JComponent)var1));
   }

   private ImageIcon a(JComponent var1) {
      synchronized (this) {
         if (!this.b) {
            this.a.add(() -> SwingUtilities.invokeLater(var1::repaint));
         }
      }

      return new ImageIcon(this);
   }
}

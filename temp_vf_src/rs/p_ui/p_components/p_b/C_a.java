package rs.p_ui.p_components.p_b;

import com.google.a.b.as;
import java.awt.Color;
import java.util.function.BooleanSupplier;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

public class C_a extends JLabel {
   private static final Border a = new CompoundBorder(
      BorderFactory.createMatteBorder(0, 0, 1, 0, rs.p_gui.C_d.a), BorderFactory.createEmptyBorder(5, 10, 4, 10)
   );
   private static final Border b = BorderFactory.createEmptyBorder(5, 10, 5, 10);
   private final JComponent c;
   private BooleanSupplier d;
   private boolean e;

   public C_a(String var1, C_e var2, JComponent var3) {
      super(var1);
      this.c = var3;
      if (this.e) {
         this.a();
      } else {
         this.b();
      }

      this.addMouseListener(new C_b(this, var2));
      if (!as.c(var1)) {
         this.addMouseListener(new C_c(this));
      }
   }

   public C_a(ImageIcon var1, C_e var2, JComponent var3) {
      this("", var2, var3);
      this.setIcon(var1);
      this.setOpaque(true);
      this.setVerticalAlignment(0);
      this.setHorizontalAlignment(0);
      this.setBackground(rs.p_gui.C_d.c);
      this.addMouseListener(new C_d(this));
   }

   public boolean a() {
      if (this.d != null && !this.d.getAsBoolean()) {
         return false;
      } else {
         this.setBorder(a);
         this.setForeground(Color.WHITE);
         return this.e = true;
      }
   }

   public void b() {
      this.setBorder(b);
      this.setForeground(Color.GRAY);
      this.e = false;
   }

   public JComponent c() {
      return this.c;
   }

   public void a(BooleanSupplier var1) {
      this.d = var1;
   }

   public boolean d() {
      return this.e;
   }
}

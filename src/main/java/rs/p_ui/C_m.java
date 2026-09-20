package rs.p_ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class C_m extends JPanel {
   public static final int h = 350;
   public static final int i = 17;
   public static final int j = 6;
   private static final EmptyBorder a = new EmptyBorder(6, 6, 6, 6);
   private static final Dimension b = new Dimension(367, 0);
   private final JScrollPane c;
   private final JPanel d;

   protected C_m() {
      this(true);
   }

   protected C_m(boolean var1) {
      if (var1) {
         this.setBorder(a);
         this.setLayout(new C_j(0, 1, 0, 3));
         this.setBackground(rs.p_gui.C_d.d);
         JPanel var2 = new JPanel();
         var2.setLayout(new BorderLayout());
         var2.add(this, "North");
         var2.setBackground(rs.p_gui.C_d.d);
         this.c = new JScrollPane(var2);
         this.c.setHorizontalScrollBarPolicy(31);
         this.d = new JPanel();
         this.d.setPreferredSize(b);
         this.d.setLayout(new BorderLayout());
         this.d.add(this.c, "Center");
      } else {
         this.c = null;
         this.d = this;
      }
   }

   @Override
   public Dimension getPreferredSize() {
      int var1 = this == this.d ? 367 : 350;
      return new Dimension(var1, super.getPreferredSize().height);
   }

   public void J_() {
   }

   public void K_() {
   }

   protected JScrollPane k() {
      return this.c;
   }

   public JPanel l() {
      return this.d;
   }
}

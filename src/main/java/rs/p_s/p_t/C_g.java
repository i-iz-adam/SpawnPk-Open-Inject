package rs.p_s.p_t;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Inject;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import rs.p_ui.p_components.C_u;

public class C_g extends JPanel {
   private static final String a = "ERROR_PANEL";
   private static final String b = "OFFERS_PANEL";
   private GridBagConstraints c = new GridBagConstraints();
   private final CardLayout d = new CardLayout();
   private final JPanel e = new JPanel();
   private final JPanel f = new JPanel(this.d);
   private final C_i g;
   private final ScheduledExecutorService h;
   private final ArrayList<C_d> i = new ArrayList<>();

   @Inject
   public C_g(ScheduledExecutorService var1, C_i var2) {
      this.g = var2;
      this.h = var1;
      this.setLayout(new BorderLayout());
      this.setBackground(rs.p_gui.C_d.d);
      this.c.fill = 2;
      this.c.weightx = 1.0;
      this.c.gridx = 0;
      this.c.gridy = 0;
      JPanel var3 = new JPanel(new BorderLayout());
      var3.setBackground(rs.p_gui.C_d.d);
      var3.add(this.e, "North");
      this.e.setLayout(new GridBagLayout());
      this.e.setBorder(new EmptyBorder(10, 10, 10, 10));
      this.e.setBackground(rs.p_gui.C_d.d);
      JScrollPane var4 = new JScrollPane(var3);
      var4.setBackground(rs.p_gui.C_d.d);
      var4.getVerticalScrollBar().setUnitIncrement(8);
      var4.getVerticalScrollBar().setPreferredSize(new Dimension(12, 0));
      var4.getVerticalScrollBar().setBorder(new EmptyBorder(0, 5, 0, 0));
      var4.setVisible(false);
      JPanel var5 = new JPanel(new BorderLayout());
      var5.setBackground(rs.p_gui.C_d.d);
      C_u var6 = new C_u();
      var5.add(var6, "North");
      var6.setBorder(new EmptyBorder(50, 20, 20, 20));
      var6.a("No listings detected", "No trading post listings were found on your account.");
      this.f.add(var4, "OFFERS_PANEL");
      this.f.add(var5, "ERROR_PANEL");
      this.add(this.f, "Center");
      this.a();
   }

   void a() {
      this.e.removeAll();
      this.i.clear();
      this.c();
   }

   C_d a(int var1) {
      for (int var2 = 0; var2 < this.i.size(); var2++) {
         C_d var3 = this.i.get(var2);
         if (var3 != null && var3.a() == var1) {
            return var3;
         }
      }

      return null;
   }

   void b(int var1) {
      SwingUtilities.invokeLater(() -> {
         C_d var2 = this.a(var1);
         if (var2 != null) {
            this.e.remove(var2);
            this.i.remove(var2);
            this.revalidate();
            this.repaint();
            this.c();
         }
      });
   }

   void a(C_c var1) {
      this.h.execute(() -> {
         for (int var2 = 0; var2 <= 5; var2++) {
            Image var3 = this.g.a(var1.f());
            if (var3 != null) {
               break;
            }

            try {
               Thread.sleep(100L);
            } catch (InterruptedException var5) {
            }
         }

         SwingUtilities.invokeLater(() -> {
            C_d var2x = this.a(var1.f());
            if (var2x == null) {
               var2x = new C_d(this.g);
               this.i.add(var2x);
               this.e.add(var2x, this.c);
               this.c.gridy++;
            }

            var2x.a(var1);
            this.b();
            this.revalidate();
            this.repaint();
            this.c();
         });
      });
   }

   private void b() {
      if (this.e.getComponentCount() > 0) {
         JPanel var1 = (JPanel)this.e.getComponent(0);
         var1.setBorder(null);
      }
   }

   private void c() {
      if (this.i.isEmpty()) {
         this.e.removeAll();
         SwingUtilities.invokeLater(() -> this.d.show(this.f, "ERROR_PANEL"));
      } else {
         SwingUtilities.invokeLater(() -> this.d.show(this.f, "OFFERS_PANEL"));
      }
   }
}

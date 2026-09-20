package rs.p_s.p_q;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.inject.Inject;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import rs.p_ui.C_m;

public class C_b extends C_m {
   private final JPanel a = new JPanel();
   private final rs.p_s.p_q.p_b.C_a b = new rs.p_s.p_q.p_b.C_a(C_d.e.i());
   private final C_a c;
   private final C_d d;

   @Inject
   private C_b(C_d var1, C_a var2) {
      super(false);
      this.d = var1;
      this.c = var2;
      this.setLayout(new BoxLayout(this, 1));
      this.setBackground(rs.p_gui.C_d.d);
      this.setBorder(new EmptyBorder(8, 8, 8, 8));
      JPanel var3 = new JPanel(new BorderLayout());
      this.add(new rs.p_s.p_q.p_b.C_b("Current Fight", false));
      JPanel var4 = new JPanel(new BorderLayout());
      var4.setMaximumSize(new Dimension(350, (int)var4.getPreferredSize().getHeight()));
      var4.add(this.b, "Center");
      this.add(var4);
      this.a.setLayout(new BoxLayout(this.a, 1));
      JPanel var5 = new JPanel(new BorderLayout());
      rs.p_s.p_q.p_b.C_b var6 = new rs.p_s.p_q.p_b.C_b("Fight History (Filter by Usernames):", true);
      this.add(var6);
      JLabel var7 = new JLabel("Filter Usernames:");
      var7.setHorizontalAlignment(0);
      JTextField var8 = new JTextField("");
      var5.setMaximumSize(new Dimension(350, (int)var5.getPreferredSize().getHeight()));
      var8.getDocument().addDocumentListener(new C_c(this, var1, var8));
      var5.add(var8, "Center");
      this.add(Box.createRigidArea(new Dimension(0, 4)));
      var6.add(var5);
      this.add(var6);
      this.add(Box.createRigidArea(new Dimension(0, 4)));
      JScrollPane var9 = new JScrollPane(var3);
      var9.setBackground(rs.p_gui.C_d.d);
      var9.getVerticalScrollBar().setPreferredSize(new Dimension(6, 0));
      var3.add(this.a, "North");
      this.add(Box.createRigidArea(new Dimension(0, 4)));
      this.add(var9);
   }

   public void a(rs.p_s.p_q.p_a.C_a var1) {
      if (this.c.c().isEmpty() || (this.c.b() ? var1.e().k().toLowerCase().equals(this.c.c()) : var1.e().k().toLowerCase().startsWith(this.c.c()))) {
         SwingUtilities.invokeLater(() -> {
            this.a.add(new rs.p_s.p_q.p_b.C_a(var1), 0);
            if (this.a.getComponentCount() > this.c.a()) {
               int var2 = this.a.getComponentCount() - this.c.a();

               for (int var3 = 0; var3 < var2 && this.a.getComponentCount() > 0; var3++) {
                  this.a.remove(this.a.getComponentCount() - 1);
               }
            }

            this.updateUI();
         });
      }
   }

   public void a(ArrayList<rs.p_s.p_q.p_a.C_a> var1) {
      if (!this.c.c().isEmpty()) {
         var1.removeIf(var1x -> this.c.b() ? !var1x.e().k().toLowerCase().equals(this.c.c()) : !var1x.e().k().toLowerCase().startsWith(this.c.c()));
      }

      SwingUtilities.invokeLater(() -> {
         if (var1.size() > this.c.a()) {
            int var2 = var1.size() - this.c.a();
            var1.removeIf(var2x -> var1.indexOf(var2x) < var2);
            this.a.removeAll();
         } else {
            int var5 = var1.size();
            int var3 = this.a.getComponentCount() - this.c.a() + var5;
            if (var3 > 0) {
               for (int var4 = 0; var4 < var3 && this.a.getComponentCount() > 0; var4++) {
                  this.a.remove(this.a.getComponentCount() - 1);
               }
            }
         }

         var1.forEach(var1xx -> this.a.add(new rs.p_s.p_q.p_b.C_a(var1xx), 0));
         this.updateUI();
      });
   }

   public void b() {
      this.a.removeAll();
      if (!this.d.j().isEmpty()) {
         ArrayList var1 = new ArrayList<>(this.d.j());
         this.a(var1);
      }

      SwingUtilities.invokeLater(this::updateUI);
   }

   public rs.p_s.p_q.p_b.C_a c() {
      return this.b;
   }
}

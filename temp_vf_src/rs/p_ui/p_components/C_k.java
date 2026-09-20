package rs.p_ui.p_components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.text.Document;
import org.apache.commons.a.F;
import rs.p_gui.C_M_uc;

public class C_k extends JPanel {
   private final JLabel b;
   private final C_i c;
   private final JButton d;
   private final JButton e;
   private final DefaultListModel<String> f;
   private final List<Runnable> g = new ArrayList<>();

   public C_k() {
      this.setLayout(new BorderLayout());
      this.b = new JLabel();
      this.b.setPreferredSize(new Dimension(30, 0));
      this.b.setVerticalAlignment(0);
      this.b.setHorizontalAlignment(0);
      this.c = new C_i();
      this.c.setBorder(null);
      JTextField var1 = this.c.c();
      var1.removeMouseListener(var1.getMouseListeners()[var1.getMouseListeners().length - 1]);
      C_l var2 = new C_l(this);
      this.c.addMouseListener(var2);
      var1.addMouseListener(var2);
      this.d = this.a(rs.p_gui.C_d.j, Color.PINK, rs.p_gui.C_w.c());
      this.d.setText("×");
      this.d.addActionListener(var1x -> {
         this.a(null);

         for (Runnable var3x : this.g) {
            var3x.run();
         }
      });
      this.f = new DefaultListModel<>();
      this.f.addListDataListener(new C_m(this));
      JList var3 = new JList();
      var3.setSelectionMode(0);
      var3.setModel(this.f);
      var3.addListSelectionListener(var2x -> {
         String var3x = (String)var3.getSelectedValue();
         if (var3x != null) {
            this.c.a(var3x);
            this.c.c().selectAll();
            this.c.c().requestFocusInWindow();
         }
      });
      JPopupMenu var4 = new JPopupMenu();
      var4.setLightWeightPopupEnabled(true);
      var4.setLayout(new BorderLayout());
      var4.add(var3, "Center");
      var4.addFocusListener(new C_n(this, var4, var3));
      this.e = this.a(rs.p_gui.C_d.f, rs.p_gui.C_d.e, rs.p_gui.C_w.e());
      this.e.setText("▾");
      this.e.addActionListener(var3x -> {
         var4.setPopupSize(this.getWidth(), var3.getPreferredSize().height);
         var4.show(this, 0, this.e.getHeight());
         var4.revalidate();
         var4.requestFocusInWindow();
      });
      this.c.c().getDocument().addDocumentListener(new C_o(this));
      JPanel var5 = new JPanel();
      var5.setBackground(new Color(0, 0, 0, 0));
      var5.setOpaque(false);
      var5.setLayout(new BorderLayout());
      var5.add(this.d, "East");
      var5.add(this.e, "West");
      this.d();
      this.add(this.b, "West");
      this.add(this.c, "Center");
      this.add(var5, "East");
   }

   private JButton a(Color var1, Color var2, Font var3) {
      JButton var4 = new JButton();
      var4.setPreferredSize(new Dimension(30, 0));
      var4.setFont(var3);
      var4.setBorder(null);
      var4.setRolloverEnabled(true);
      C_M_uc.a(var4);
      var4.setForeground(var1);
      var4.addMouseListener(new C_p(this, var4, var2, var1));
      return var4;
   }

   private void d() {
      boolean var1 = F.c(this.c.a());
      this.d.setVisible(!var1);
      this.e.setVisible(!this.f.isEmpty() && var1);
   }

   public void a(ActionListener var1) {
      this.c.a(var1);
   }

   public void a(C_k.a var1) {
      ImageIcon var2 = new ImageIcon(this.getClass().getResource(var1.a()));
      this.b.setIcon(var2);
   }

   public void a(ImageIcon var1) {
      this.b.setIcon(var1);
   }

   public String a() {
      return this.c.a();
   }

   public void a(String var1) {
      assert SwingUtilities.isEventDispatchThread();

      this.c.a(var1);
   }

   @Override
   public void setBackground(Color var1) {
      if (var1 != null) {
         super.setBackground(var1);
         if (this.c != null) {
            this.c.setBackground(var1);
         }
      }
   }

   public void a(Color var1) {
      if (var1 != null) {
         this.c.a(var1);
      }
   }

   @Override
   public void addKeyListener(KeyListener var1) {
      this.c.addKeyListener(var1);
   }

   public void a(Runnable var1) {
      this.g.add(var1);
   }

   @Override
   public void removeKeyListener(KeyListener var1) {
      this.c.removeKeyListener(var1);
   }

   public void a(boolean var1) {
      this.c.a(var1);
      if (!var1) {
         super.setBackground(this.c.d());
      }
   }

   @Override
   public boolean requestFocusInWindow() {
      super.requestFocusInWindow();
      return this.c.requestFocusInWindow();
   }

   public Document b() {
      return this.c.b();
   }

   public DefaultListModel<String> c() {
      return this.f;
   }

   public static enum a {
      a("search.png"),
      b("loading_spinner.gif"),
      c("loading_spinner_darker.gif"),
      d("error.png");

      private final String e;

      public String a() {
         return this.e;
      }

      private a(String var3) {
         this.e = var3;
      }
   }
}

package rs.p_s.p_t;

import com.google.a.b.as;
import com.google.c.B;
import com.google.c.t;
import com.google.c.w;
import com.google.c.z;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Inject;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import rs.p_gui.C_Launcher_mc;
import rs.p_ui.p_components.C_u;

public class C_l extends JPanel {
   private static final String a = "ERROR_PANEL";
   private static final String b = "RESULTS_PANEL";
   private static final String c = "PAGE_PANEL";
   private static final int d = 15;
   private static final ImageIcon e;
   private static final ImageIcon f;
   private static final ImageIcon g;
   private static final ImageIcon h;
   private final GridBagConstraints i = new GridBagConstraints();
   private final CardLayout j = new CardLayout();
   private final rs.p_ui.p_components.C_k k = new rs.p_ui.p_components.C_k();
   private final JPanel l = new JPanel();
   private final JPanel m = new JPanel(this.j);
   private final ScheduledExecutorService n;
   private final C_i o;
   private final JLabel p = new JLabel();
   private final JButton q = new JButton();
   private final JButton r = new JButton();
   private final C_u s = new C_u();
   private String t = "";
   private int u = 1;
   private int v = 0;
   private int w = 0;

   @Inject
   private C_l(ScheduledExecutorService var1, C_i var2) {
      this.o = var2;
      this.n = var1;
      this.setLayout(new BorderLayout());
      this.setBackground(rs.p_gui.C_d.d);
      JPanel var3 = new JPanel();
      var3.setLayout(new BorderLayout(5, 5));
      var3.setBorder(new EmptyBorder(10, 10, 10, 10));
      var3.setBackground(rs.p_gui.C_d.d);
      this.k.a(rs.p_ui.p_components.C_k.a.a);
      this.k.setPreferredSize(new Dimension(100, 30));
      this.k.setBackground(rs.p_gui.C_d.c);
      this.k.a(rs.p_gui.C_d.h);
      this.k.a(var1x -> {
         this.t = this.k.a();
         this.a(1, false);
         this.a(false);
      });
      this.k.a(() -> {
         this.t = "";
         this.a();
      });
      this.l.setLayout(new GridBagLayout());
      this.l.setBackground(rs.p_gui.C_d.d);
      this.i.fill = 2;
      this.i.weightx = 1.0;
      this.i.gridx = 0;
      this.i.gridy = 0;
      JPanel var4 = new JPanel(new BorderLayout());
      var4.setBackground(rs.p_gui.C_d.d);
      var4.add(this.l, "North");
      JScrollPane var5 = new JScrollPane(var4);
      var5.setBackground(rs.p_gui.C_d.d);
      var5.getVerticalScrollBar().setUnitIncrement(8);
      var5.getVerticalScrollBar().setPreferredSize(new Dimension(12, 0));
      var5.getVerticalScrollBar().setBorder(new EmptyBorder(0, 5, 0, 0));
      var5.setVisible(false);
      this.q.setIcon(e);
      this.q.setRolloverIcon(f);
      this.q.addActionListener(var1x -> this.a(this.u - 1, true));
      this.r.setIcon(g);
      this.r.setRolloverIcon(h);
      this.r.addActionListener(var1x -> this.a(this.u + 1, true));
      this.p.setBorder(new EmptyBorder(0, 111, 0, 0));
      this.p.setText("Page 1");
      JPanel var6 = new JPanel(new BorderLayout());
      var6.add(this.q, "West");
      var6.add(this.p, "Center");
      var6.add(this.r, "East");
      JPanel var7 = new JPanel(new BorderLayout());
      var7.setBackground(rs.p_gui.C_d.d);
      var7.add(this.s, "North");
      this.s.a("Trading Post Search", "Here you can search for an item by its name to find its sale history.");
      this.m.add(var5, "RESULTS_PANEL");
      this.m.add(var7, "ERROR_PANEL");
      var3.add(this.k, "North");
      var3.add(this.m, "Center");
      var3.add(var6, "South");
      this.add(var3, "Center");
   }

   void a(String var1) {
      this.t = var1;
      this.k.a(this.t);
      this.n.execute(() -> this.a(true));
   }

   private boolean a() {
      String var1 = this.t;
      if (as.c(var1)) {
         this.l.removeAll();
         SwingUtilities.invokeLater(this.l::updateUI);
         return false;
      } else {
         this.l.removeAll();
         this.k.setBackground(rs.p_gui.C_d.c);
         this.k.a(false);
         this.r.setEnabled(false);
         this.q.setEnabled(false);
         this.k.a(rs.p_ui.p_components.C_k.a.b);
         return true;
      }
   }

   private void a(boolean var1) {
      if (!C_Launcher_mc.n().o().fc) {
         this.k.a(rs.p_ui.p_components.C_k.a.d);
         this.s.a("Please login!", "You must be logged into the server to use this feature.");
         this.j.show(this.m, "ERROR_PANEL");
         this.k.a(true);
      } else if (this.a()) {
         String var2 = this.t;
         int var3 = this.u;
         this.n.execute(() -> {
            try {
               this.a(var2, var3);
            } catch (IOException var4) {
               this.k.a(rs.p_ui.p_components.C_k.a.d);
               this.s.a("Error", "There has been an issue with your search!");
               this.j.show(this.m, "ERROR_PANEL");
               this.k.a(true);
               var4.printStackTrace();
            }
         });
      }
   }

   private void a(String var1, int var2) {
      String var3 = "https://hqxg0u8s64.execute-api.ca-central-1.amazonaws.com/Production/tradingpost?search_text="
         + URLEncoder.encode(var1, StandardCharsets.UTF_8.toString())
         + "&page="
         + var2;
      URL var4 = new URL(var3);
      URLConnection var5 = var4.openConnection();
      var5.connect();
      B var6 = new B();
      w var7 = var6.a(new InputStreamReader((InputStream)var5.getContent()));
      t var8 = var7.u();
      ArrayList var9 = new ArrayList();

      for (w var11 : var8) {
         C_c var12 = this.a(var11);
         var9.add(var12);
         this.w = var12.e();

         for (int var13 = 0; var13 <= 5; var13++) {
            Image var14 = this.o.a(var12.f());
            if (var14 != null) {
               break;
            }

            try {
               Thread.sleep(100L);
            } catch (InterruptedException var16) {
            }
         }
      }

      rs.p_h.C_c.a(() -> this.a(var9));
   }

   private C_c a(w var1) {
      z var2 = var1.t();
      int var3 = var2.c("id").j();
      int var4 = var2.c("item_id").j();
      String var5 = var2.c("time").d();
      String var6 = var2.c("item_name").d();
      String var7 = var2.c("seller").d();
      String var8 = var2.c("buyer").d();
      int var9 = var2.c("currency").j();
      int var10 = var2.c("price").j();
      int var11 = var2.c("amount").j();
      C_c var12 = new C_c();
      var12.a(var3);
      var12.b(var4);
      var12.c(var6);
      var12.b(var7.replaceAll("_", " "));
      var12.a(var8.replaceAll("_", " "));
      var12.a(C_b.values()[var9]);
      var12.e(var10);
      var12.c(var11);
      var12.d(var5);
      return var12;
   }

   private void a(List<C_c> var1) {
      this.v = 0;
      this.j.show(this.m, "RESULTS_PANEL");
      SwingUtilities.invokeLater(() -> {
         if (var1.isEmpty()) {
            this.k.a(rs.p_ui.p_components.C_k.a.d);
            this.s.a("No results found.", "No items were found with that name, please try again.");
            this.j.show(this.m, "ERROR_PANEL");
            this.k.a(true);
         } else {
            int var2 = 0;

            for (C_c var4 : var1) {
               Image var5 = this.o.a(var4.f());
               C_m var6 = new C_m(this.o, var5, var4.a(), var4.f(), var4.i(), var4.g(), var4.k(), var4.j(), var4.d(), var4.c());
               if (var2++ > 0) {
                  JPanel var7 = new JPanel(new BorderLayout());
                  var7.setBackground(rs.p_gui.C_d.d);
                  var7.setBorder(new EmptyBorder(5, 0, 0, 0));
                  var7.add(var6, "North");
                  this.l.add(var7, this.i);
               } else {
                  this.l.add(var6, this.i);
               }

               this.v++;
               this.i.gridy++;
            }

            this.k.a(true);
            this.r.setEnabled(true);
            this.q.setEnabled(true);
            if (!var1.isEmpty()) {
               this.k.a(rs.p_ui.p_components.C_k.a.a);
            }
         }
      });
   }

   private void a(int var1, boolean var2) {
      if (var1 < 1) {
         var1 = 1;
      }

      if (this.v >= 15 || var1 <= this.u) {
         boolean var3 = this.u != var1;
         this.u = var1;
         if (var3) {
            this.p.setText("Page " + this.u);
            if (var2 && this.a()) {
               this.a(false);
            }
         }
      }
   }

   static {
      BufferedImage var0 = rs.p_A_uc.C_j.b(C_l.class, "back_icon.png");
      BufferedImage var1 = rs.p_A_uc.C_j.b(C_l.class, "fwd_icon.png");
      e = new ImageIcon(var0);
      f = new ImageIcon(rs.p_A_uc.C_j.a(var0, -180));
      g = new ImageIcon(var1);
      h = new ImageIcon(rs.p_A_uc.C_j.a(var1, -180));
   }
}

package rs.p_s.p_c;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.stream.Collectors;
import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import rs.C_Client_mc;
import rs.p_a.C_j;
import rs.p_gui.C_Launcher_mc;
import rs.p_ui.C_m;

public class C_d extends C_m {
   private static final String a = "Recoloring N/A";
   private static final String b = "Recoloring NPC";
   private static final String c = "Recoloring Item";
   private static final String d = "Recoloring Object";
   private static final Dimension e = new Dimension(150, 27);
   private JList<String> f;
   private JLabel g;
   private rs.p_l.p_f.p_a.p_d.C_b k;
   private rs.p_l.p_f.p_a.p_d.C_c l = rs.p_l.p_f.C_e.d().j();
   private rs.p_l.p_f.p_a.p_d.C_a m = rs.p_l.p_f.C_e.d().k();

   public C_d() {
      this.k = this.l;
      this.j();
   }

   public static boolean b() {
      return rs.p_f.C_a.c();
   }

   public void a(C_j var1, boolean var2) {
      if (this.l.u() != null && this.l.u() == var1 && !var2) {
         this.i();
      } else {
         this.i();
         this.a("Recoloring NPC");
         this.a(this.l, var1, var2);
         this.a(var1);
      }
   }

   public void a(C_j var1) {
      if (var1 != null && var1.aG != null && var1.aG.L != null) {
         System.out.println("Models for NPC id " + var1.n() + " (" + var1.o() + "):");

         for (int var5 : var1.aG.L) {
            System.out.println(" - Model ID: " + var5);
         }
      } else {
         System.out.println("No models found for NPC " + (var1 != null ? var1.n() : "null"));
      }
   }

   public void a(int var1, boolean var2) {
      this.i();
      this.a("Recoloring Item");
      this.a(rs.p_l.p_f.C_e.d().k(), var1, var2);
   }

   public void b(int var1, boolean var2) {
      this.i();
      this.a("Recoloring Object");
      this.a(rs.p_l.p_f.C_e.d().l(), var1, var2);
   }

   public void c() {
      this.a("Recoloring N/A");
   }

   public boolean e() {
      return "Recoloring NPC".equals(this.g.getText());
   }

   public boolean f() {
      return "Recoloring Item".equals(this.g.getText());
   }

   private void i() {
      C_Client_mc.ba = false;
      this.l.m();
   }

   private void a(String var1) {
      this.g.setText(var1);
   }

   private void a(rs.p_l.p_f.p_a.p_d.C_b var1, Object var2, boolean var3) {
      this.k = var1;
      var1.a(var2, var3);
      C_Launcher_mc.n().d();
   }

   private void j() {
      this.a(5);
      this.a("Reset Item Defs", "::itemdef reset");
      this.a("Reset NPC Defs", "::resetnpcdefs");
      this.a("Repack cache", "::repack");
      this.a(5);
      this.g = new JLabel("Recoloring N/A");
      this.a(this.g);
      this.add(this.g);
      this.f = this.m();
      JScrollPane var1 = this.b(this.f);
      this.add(var1);
      this.a(5);
      this.a("Color inverse", var1x -> this.k.c(((JCheckBox)var1x.getSource()).isSelected()));
      this.a("Hide modified", var1x -> this.k.b(((JCheckBox)var1x.getSource()).isSelected()));
      this.a(5);
      JButton var2 = this.a("Copy selected", 100, 27);
      var2.addActionListener(this::a);
      this.add(var2);
   }

   private JButton a(String var1, int var2, int var3) {
      JButton var4 = new JButton(var1);
      Dimension var5 = new Dimension(var2, var3);
      var4.setPreferredSize(var5);
      var4.setMinimumSize(var5);
      var4.setMaximumSize(var5);
      var4.setFocusable(false);
      return var4;
   }

   private JButton a(String var1, String var2) {
      JButton var3 = this.a(var1, e.width, e.height);
      var3.addActionListener(var2x -> this.b(var2));
      this.add(var3);
      return var3;
   }

   private void a(int var1) {
      this.add(Box.createVerticalStrut(var1));
   }

   private JCheckBox a(String var1, ActionListener var2) {
      JCheckBox var3 = new JCheckBox(var1);
      var3.addActionListener(var2);
      this.add(var3);
      return var3;
   }

   private JList<String> m() {
      DefaultListModel var1 = new DefaultListModel();
      JList var2 = new JList(var1);
      var2.setSelectionMode(2);
      var2.addListSelectionListener(var2x -> this.a(var2));
      return var2;
   }

   private void a(JList<String> var1) {
      this.k.t().clear();

      for (String var3 : var1.getSelectedValuesList()) {
         this.k.t().add(Integer.parseInt(var3.replaceAll("[^\\d-]", "")));
      }
   }

   private JScrollPane b(JList<String> var1) {
      JScrollPane var2 = new JScrollPane(var1);
      var2.setFocusable(false);
      var2.setAlignmentX(0.5F);
      var2.getViewport().setBackground(Color.BLACK);
      var2.setPreferredSize(new Dimension(var2.getPreferredSize().width, 211));
      return var2;
   }

   private void a(ActionEvent var1) {
      String var2 = String.join(",", this.k.t().stream().map(String::valueOf).collect(Collectors.toCollection(HashSet::new)));
      Clipboard var3 = Toolkit.getDefaultToolkit().getSystemClipboard();
      var3.setContents(new StringSelection(var2), null);
      C_Launcher_mc.n().a("Development", "Color string added to keyboard!", true);
   }

   private void b(String var1) {
      if (var1.equals("::itemdef reset")) {
         C_Client_mc.ap = "::resetitems";
      } else {
         C_Client_mc.ap = var1;
      }

      rs.p_n.C_a.a(C_Launcher_mc.n().o(), var1, C_Client_mc.cT);
   }

   private void a(JComponent var1) {
      var1.setAlignmentX(0.0F);
   }

   public JList<String> g() {
      return this.f;
   }

   public JLabel h() {
      return this.g;
   }
}

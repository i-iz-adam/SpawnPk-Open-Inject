package rs.p_s.p_q.p_b;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import rs.p_gui.C_d;

public class C_b extends JPanel {
   public C_b(String var1, boolean var2) {
      this.setLayout(new GridLayout(var2 ? 2 : 1, 1));
      this.setBorder(new EmptyBorder(4, 6, 4, 6));
      this.setBackground(C_d.c);
      JPopupMenu var3 = new JPopupMenu();
      JMenuItem var4 = new JMenuItem("Copy Fight History Data");
      var4.addActionListener(var0 -> rs.p_s.p_q.C_d.e.g());
      JMenuItem var5 = new JMenuItem("Import Fight History Data");
      var5.addActionListener(var1x -> {
         String var2x = JOptionPane.showInputDialog(this, "Enter the fight history data you wish to import:", "Import Fight History", 1);
         if (var2x != null && var2x.length() >= 2) {
            rs.p_s.p_q.C_d.e.b(var2x);
         }
      });
      JMenuItem var6 = new JMenuItem("Remove All Fights");
      var6.addActionListener(var1x -> {
         int var2x = JOptionPane.showConfirmDialog(this, "Are you sure you want to reset all fight history data? This cannot be undone.", "Warning", 0);
         if (var2x == 0) {
            rs.p_s.p_q.C_d.e.h();
         }
      });
      var3.add(var6);
      if (var2) {
         this.setComponentPopupMenu(var3);
      }

      JLabel var7 = new JLabel();
      var7.setText(var1);
      var7.setHorizontalAlignment(0);
      var7.setForeground(Color.WHITE);
      this.add(var7);
      this.setMaximumSize(new Dimension(350, (int)this.getPreferredSize().getHeight()));
   }
}

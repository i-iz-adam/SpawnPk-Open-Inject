package rs.gui;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import rs.ItemComposition;

public class G extends JPanel {
   private static final long a = 3542151008013032998L;
   private JScrollPane b = new JScrollPane();
   private JTextField c = new JTextField();
   private JTextArea d = new JTextArea();

   public G() {
      this.setLayout(new BoxLayout(this, 1));
      this.d.setBackground(rs.gui.d.a);
      this.d.setEditable(false);
      this.d.setPreferredSize(new Dimension(this.d.getWidth(), 10000));
      this.b = new JScrollPane(this.d);
      JPanel var1 = new JPanel();
      this.b.getViewport().getView().setBackground(rs.gui.d.a);
      var1.setBackground(new Color(10, 10, 10));
      this.c.setPreferredSize(new Dimension(200, 25));
      this.c.addActionListener(new H(this));
      JButton var2 = new JButton("Search");
      var2.addActionListener(new I(this));
      var1.add(this.c);
      var1.add(var2);
      this.add(var1);
      this.add(this.b);
   }

   private void a() {
      if (ItemComposition.ad == 0) {
         JOptionPane.showMessageDialog(null, "Please wait until the client has loaded the item database!");
      } else if (this.c.getText().length() < 3) {
         JOptionPane.showMessageDialog(null, "Please have at least 3 letters in your search term!");
      } else {
         this.c.setCaretPosition(0);
         this.b.getVerticalScrollBar().setValue(0);
         this.d.setText("");
         String var1 = "";

         for (int var2 = 0; var2 < ItemComposition.a; var2++) {
            ItemComposition var3 = (ItemComposition)ItemComposition.c.b(var2);
            if (var3 != null && var3.itemName != null && var3.itemId != 11283 && var3.itemName.toLowerCase().contains(this.c.getText().toLowerCase())) {
               String var4 = var3.itemName;
               var4 = var4.replace("@gre@", "");
               var4 = var4.replace("@red@", "");
               var4 = var4.replace("@blu@", "");
               var4 = var4.replace("@whi@", "");
               var1 = (var1.equals("") ? "" : var1 + "\n") + var3.itemId + " - " + var4 + " " + (var3.b() ? "(noted)" : "");
            }
         }

         if (var1.equals("")) {
            var1 = "No results found for \"" + this.c.getText() + "!\"";
         }

         this.d.setText(var1);
      }
   }
}

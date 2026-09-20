package rs.p_gui.p_b.p_a;

import java.awt.Color;
import java.awt.Toolkit;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import rs.C_Client_mc;

public class C_n {
   private static Icon a = null;
   private static Icon b = null;
   private static Icon c = null;
   private static Icon d = null;
   private static Icon e = null;
   private static Icon f = null;

   public static JPopupMenu a(rs.p_gui.p_b.C_h var0) {
      a();
      JPopupMenu var1 = new JPopupMenu("Loadout folders");
      boolean var2 = false;

      for (String var4 : var0.f().keySet()) {
         JMenuItem var5 = new JMenuItem(var4, a);
         var5.addActionListener(new C_o(var1, var5, var0, var4));
         if (var5.getText().equalsIgnoreCase(var0.f().e())) {
            var5.setBackground(Color.ORANGE);
         }

         var1.add(var5);
      }

      JMenuItem var8 = new JMenuItem("Create new folder", b);
      var8.addActionListener(new C_p(var0));
      var1.add(var8);
      JMenuItem var9 = new JMenuItem("Rename", d);
      var9.addActionListener(new C_r(var0));
      var1.add(var9);
      JMenuItem var10 = new JMenuItem("Move up", e);
      var10.addActionListener(new C_t(var0));
      if (var0.f().size() > 1) {
         var1.add(var10);
      }

      JMenuItem var6 = new JMenuItem("Move down", f);
      var6.addActionListener(new C_u(var0));
      if (var0.f().size() > 1) {
         var1.add(var6);
      }

      JMenuItem var7 = new JMenuItem("Delete", c);
      var7.addActionListener(new C_v(var0));
      var1.add(var7);
      return var1;
   }

   public static void a() {
      if (a == null || b == null || c == null || d == null || e == null || f == null) {
         if (C_Client_mc.class.getResource("Client.class").toString().startsWith("file")) {
            a = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/folder.png"));
            b = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/create.png"));
            c = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/delete.png"));
            d = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/edit.png"));
            e = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/up.png"));
            f = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/down.png"));
         } else {
            try {
               a = new ImageIcon(ImageIO.read(C_Client_mc.class.getResource("/assets/gui/folder.png")));
               b = new ImageIcon(ImageIO.read(C_Client_mc.class.getResource("/assets/gui/create.png")));
               c = new ImageIcon(ImageIO.read(C_Client_mc.class.getResource("/assets/gui/delete.png")));
               d = new ImageIcon(ImageIO.read(C_Client_mc.class.getResource("/assets/gui/edit.png")));
               e = new ImageIcon(ImageIO.read(C_Client_mc.class.getResource("/assets/gui/up.png")));
               f = new ImageIcon(ImageIO.read(C_Client_mc.class.getResource("/assets/gui/down.png")));
            } catch (IOException var1) {
               var1.printStackTrace();
            }
         }
      }
   }
}

package rs.gui.c;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import rs.Client;

public class a extends JPanel {
   private JLabel a;
   private JLabel b;
   private JLabel c;
   private JLabel d;
   private JLabel e;
   private JLabel f;
   private JLabel g;
   private JLabel h;
   private JLabel i;
   private JLabel j;
   private JLabel k;
   private JLabel l;
   private JLabel m;
   private JLabel n;
   private JLabel o;
   private JLabel p;
   private JLabel q;
   private JLabel r;
   private JLabel s;
   private JLabel t;
   private JLabel u;
   private JLabel v;
   private ImageIcon w;
   private ImageIcon x;
   private ImageIcon y;
   private ImageIcon z;
   private ImageIcon A;

   public a() {
      this.b();
      this.a();
   }

   public void a() {
      this.removeAll();
      this.setLayout(new BoxLayout(this, 1));
      JPanel var1 = new JPanel();
      var1.setMaximumSize(new Dimension(Integer.MAX_VALUE, 28));
      var1.add(
         new JLabel("<html><p style='font-size: 9px'><font style='bold' color='rgb(150,150,255)'>Type ::pvptracker to view overlay in-game</font></p></html>")
      );
      this.add(var1);
      this.add(Box.createRigidArea(new Dimension(0, 2)));
      JPanel var2 = new JPanel();
      var2.setBackground(new Color(15, 15, 15));
      var2.setMaximumSize(new Dimension(Integer.MAX_VALUE, 32));
      var2.add(new JLabel("<html><p style='font-size: 10px'><font style='bold' color='rgb(255,100,100)'><u>Most Recent 1v1 Fight</u></font></p></html>"));
      this.add(var2);
      this.add(Box.createRigidArea(new Dimension(0, 5)));
      this.a(this.w, this.c = new JLabel("<html><font style='bold'>N/A</font></html>"), 16);
      this.a(this.y, this.g = new JLabel("<html>Correct overheads: <font color='35FFA6'>0/0 (0%)</font></html>"), 20, new Dimension(10, 0));
      this.a(this.A, this.i = new JLabel("<html>Spell casts: <font color='5AA8FF'>0/0 (0%)</font></html>"), 20, new Dimension(10, 0));
      this.a(this.z, this.k = new JLabel("<html>Damage Dealt: <font color='FF6C3A'>0 (0)</font></html>"), 20, new Dimension(10, 0));
      this.add(Box.createRigidArea(new Dimension(0, 3)));
      this.add(Box.createRigidArea(new Dimension(0, 5)));
      this.a(this.w, this.m = new JLabel("<html><font style='bold'>N/A</font></html>"), 16);
      this.a(this.y, this.q = new JLabel("<html>Correct overheads: <font color='35FFA6'>0/0 (0%)</font></html>"), 20, new Dimension(10, 0));
      this.a(this.A, this.s = new JLabel("<html>Spell casts: <font color='5AA8FF'>0/0 (0%)</font></html>"), 20, new Dimension(10, 0));
      this.a(this.z, this.u = new JLabel("<html>Damage Dealt: <font color='FF6C3A'>0 (0)</font></html>"), 20, new Dimension(10, 0));
      this.add(Box.createRigidArea(new Dimension(0, 5)));
      JPanel var3 = new JPanel();
      var3.setBackground(new Color(15, 15, 15));
      var3.setMaximumSize(new Dimension(Integer.MAX_VALUE, 32));
      var3.add(new JLabel("<html><p style='font-size: 10px'><font style='bold' color='rgb(255,100,100)'><u>Previous 1v1 Fight</u></font></p></html>"));
      this.add(var3);
      this.add(Box.createRigidArea(new Dimension(0, 5)));
      this.a(this.w, this.d = new JLabel("<html><font style='bold'>N/A</font></html>"), 16);
      this.a(this.y, this.h = new JLabel("<html>Correct overheads: <font color='35FFA6'>0/0 (0%)</font></html>"), 20, new Dimension(10, 0));
      this.a(this.A, this.j = new JLabel("<html>Spell casts: <font color='5AA8FF'>0/0 (0%)</font></html>"), 20, new Dimension(10, 0));
      this.a(this.z, this.l = new JLabel("<html>Damage Dealt: <font color='FF6C3A'>0 (0)</font></html>"), 20, new Dimension(10, 0));
      this.add(Box.createRigidArea(new Dimension(0, 3)));
      this.add(Box.createRigidArea(new Dimension(0, 5)));
      this.a(this.w, this.n = new JLabel("<html><font style='bold'>N/A</font></html>"), 16);
      this.a(this.y, this.r = new JLabel("<html>Correct overheads: <font color='35FFA6'>0/0 (0%)</font></html>"), 20, new Dimension(10, 0));
      this.a(this.A, this.t = new JLabel("<html>Spell casts: <font color='5AA8FF'>0/0 (0%)</font></html>"), 20, new Dimension(10, 0));
      this.a(this.z, this.v = new JLabel("<html>Damage Dealt: <font color='FF6C3A'>0 (0)</font></html>"), 20, new Dimension(10, 0));
      this.add(Box.createRigidArea(new Dimension(0, 5)));
   }

   public void a(int var1, String var2, String var3, String var4, String var5) {
      EventQueue.invokeLater(new b(this, var1, var2, var3, var4, var5));
   }

   public void b(int var1, String var2, String var3, String var4, String var5) {
      EventQueue.invokeLater(new c(this, var1, var2, var3, var4, var5));
   }

   private void a(ImageIcon var1, JLabel var2, int var3, Dimension var4) {
      JPanel var5 = new JPanel();
      var5.setBackground(new Color(15, 15, 15));
      var5.setLayout(new BoxLayout(var5, 0));
      var5.add(Box.createRigidArea(var4));
      if (var1 != null) {
         var2.setIcon(var1);
      }

      var5.add(var2);
      var5.add(Box.createHorizontalGlue());
      this.add(var5);
   }

   private void a(ImageIcon var1, JLabel var2, int var3) {
      this.a(var1, var2, var3, new Dimension(3, 0));
   }

   private void b() {
      if (Client.class.getResource("Client.class").toString().startsWith("file")) {
         this.w = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/ico_user.png"));
         this.x = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/ico_skull.png"));
         this.y = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/ico_pray.png"));
         this.z = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/ico_damage.png"));
         this.A = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/ico_magic.png"));
      } else {
         try {
            this.w = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/ico_user.png")));
            this.x = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/ico_skull.png")));
            this.y = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/ico_pray.png")));
            this.z = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/ico_damage.png")));
            this.A = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/ico_magic.png")));
         } catch (IOException var2) {
            var2.printStackTrace();
         }
      }
   }
}

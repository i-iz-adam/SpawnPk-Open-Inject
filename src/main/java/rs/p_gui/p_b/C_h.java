package rs.p_gui.p_b;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import rs.C_Client_mc;
import rs.p_gui.C_F_uc;
import rs.p_gui.C_Launcher_mc;
import rs.p_gui.p_b.p_a.C_A_uc;
import rs.p_gui.p_b.p_a.C_B_uc;

public class C_h extends rs.p_ui.C_m {
   public static final String a = "Main folder";
   public static C_h b;
   public C_F_uc c;
   private C_d e;
   private rs.p_gui.p_b.p_b.C_d f;
   private rs.p_gui.p_b.p_c.C_b g;
   public JComboBox<String> d;
   private JPopupMenu k;
   private JButton l;
   private C_A_uc m;
   private Icon n;
   private Icon o;
   private Icon p;
   private Icon q;
   private Icon r;
   private Icon s;

   public C_h() {
      super(false);
      C_g.a();
      this.g = new rs.p_gui.p_b.p_c.C_b();
      this.f = new rs.p_gui.p_b.p_b.C_d(this);
      this.e = new C_d(this);
      boolean var1 = false;
      C_c var2 = this.f.a("Main folder", true);
      if (var2.isEmpty()) {
         if (this.f.a().isEmpty()) {
            C_c var3 = new C_c("Main folder");
            this.e.put("Main folder", var3);
            rs.p_gui.p_b.p_c.C_a.a("Main folder", var3, this.f);
            this.e.a("Main folder", var3.get(0));
         }
      } else {
         this.e.put("Main folder", var2);
         this.f.a("Main folder", this.e.get("Main folder"));
      }

      for (String var4 : this.f.a()) {
         this.e.put(var4, this.f.a(var4, false));
      }

      this.f.b();
      new File(rs.p_gui.p_b.p_b.C_d.e).delete();
      new File(rs.p_gui.p_b.p_b.C_d.e).delete();
      new File(rs.p_gui.p_b.p_b.C_d.e).delete();
      new File(rs.p_gui.p_b.p_b.C_d.b).delete();
      new File(rs.p_gui.p_b.p_b.C_d.c).delete();
      new File(rs.p_gui.p_b.p_b.C_d.d).delete();

      try {
         this.e.a((String)this.e.keySet().toArray()[0], 0);
      } catch (Exception var8) {
         System.out.println("Loadout Error 120");
         if (rs.p_f.C_a.h) {
            this.e.clear();
            C_c var11 = new C_c("Main folder");
            this.e.put("Main folder", var11);
            rs.p_gui.p_b.p_c.C_a.a("Main folder", var11, this.f);
            this.e.a("Main folder", var11.get(0));
            this.f.b();
         }
      }

      JPanel var10 = new JPanel();
      BoxLayout var12 = new BoxLayout(var10, 1);
      var10.setPreferredSize(new Dimension(350, 488));
      var10.setLayout(var12);
      JPanel var5 = new JPanel();
      var5.setLayout(new BoxLayout(var5, 1));
      var5.setPreferredSize(new Dimension(350, 55));

      for (JPanel var7 : this.m()) {
         var5.add(var7);
      }

      var10.add(var5);
      this.c = new C_F_uc();
      this.c.setPreferredSize(new Dimension(0, 400));
      this.c.setBackground(new Color(50, 50, 50));
      var10.add(this.c);
      this.add(var10, "North");
   }

   private List<JPanel> m() {
      ArrayList var1 = new ArrayList();
      JPanel var2 = new JPanel();
      if (C_Client_mc.class.getResource("Client.class").toString().startsWith("file")) {
         this.n = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/folder.png"));
         this.o = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/create.png"));
         this.p = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/delete.png"));
         this.q = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/edit.png"));
         this.r = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/up.png"));
         this.s = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/down.png"));
      } else {
         try {
            this.n = new ImageIcon(ImageIO.read(C_Client_mc.class.getResource("/assets/gui/folder.png")));
            this.o = new ImageIcon(ImageIO.read(C_Client_mc.class.getResource("/assets/gui/create.png")));
            this.p = new ImageIcon(ImageIO.read(C_Client_mc.class.getResource("/assets/gui/delete.png")));
            this.q = new ImageIcon(ImageIO.read(C_Client_mc.class.getResource("/assets/gui/edit.png")));
            this.r = new ImageIcon(ImageIO.read(C_Client_mc.class.getResource("/assets/gui/up.png")));
            this.s = new ImageIcon(ImageIO.read(C_Client_mc.class.getResource("/assets/gui/down.png")));
         } catch (IOException var11) {
            var11.printStackTrace();
         }
      }

      this.d();
      JButton var3 = C_B_uc.a(this);
      JButton var4 = rs.p_gui.p_b.p_a.C_a.a(this);
      this.l = new JButton("", this.n);
      this.l.setToolTipText("<html>Loadout folders</html>");
      this.l.setPreferredSize(new Dimension(38, 30));
      this.l.addMouseListener(new C_i(this));
      var2.add(var3);
      var2.add(var4);
      var2.add(this.l);
      JPanel var5 = new JPanel();
      rs.p_gui.p_b.p_a.C_g var6 = new rs.p_gui.p_b.p_a.C_g(this.o, this.e);
      var6.setToolTipText("Create a new loadout");
      var6.setPreferredSize(new Dimension(20, 25));
      JButton var7 = new JButton("", this.p);
      var7.setToolTipText("Delete this loadout");
      var7.setPreferredSize(new Dimension(20, 25));
      var7.addActionListener(var1x -> {
         C_a var2x = this.e.c();
         String var3x = this.e.e();
         if (var2x != null) {
            JFrame var4x = new JFrame("Delete " + var2x.f() + "?");
            JButton var5x = new JButton("Yes, delete \"" + var2x.f() + "\"");
            JButton var6x = new JButton("No, Nevermind.");
            JPanel var7x = new JPanel();
            var4x.setLayout(new FlowLayout());
            var4x.setSize(400, 90);
            var4x.setLocationRelativeTo(C_Launcher_mc.n().i().getContentPane());
            var7x.add(var5x);
            var7x.add(var6x);
            var4x.add(var7x);
            var5x.addActionListener(new C_j(this, var3x, var2x, var4x));
            var6x.addActionListener(new C_k(this, var4x));
            var4x.setVisible(true);
         }
      });
      JButton var8 = new JButton("", this.q);
      var8.setToolTipText("Rename the active loadout");
      var8.setPreferredSize(new Dimension(20, 25));
      var8.addActionListener(new C_l(this));
      JButton var9 = new JButton("", this.r);
      var9.setToolTipText("Move loadout up in the list");
      var9.setPreferredSize(new Dimension(20, 25));
      var9.addActionListener(new C_n(this));
      JButton var10 = new JButton("", this.s);
      var10.setToolTipText("Move loadout down in the list");
      var10.setPreferredSize(new Dimension(20, 25));
      var10.addActionListener(new C_o(this));
      this.addMouseListener(new C_p(this));
      this.a(0);
      var5.add(var6);
      var5.add(var7);
      var5.add(this.d);
      var5.add(var8);
      var5.add(var9);
      var5.add(var10);
      var1.add(var2);
      var1.add(var5);
      return var1;
   }

   public void a(Graphics var1) {
      this.g.a(var1);
   }

   @Override
   public void paint(Graphics var1) {
      super.paint(var1);
      this.g.a(var1);
   }

   public void a() {
      C_Launcher_mc.n().b(20, true);
   }

   public void a(int var1) {
      C_c var2 = this.e.d();
      if (var1 < 0 || var1 >= var2.size()) {
         var1 = 0;
      }

      String[] var3 = new String[var2.size()];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = var2.get(var4).f();
      }

      if (this.d == null) {
         this.d = new rs.p_gui.p_b.p_a.C_k(this.e, var3);
      } else {
         DefaultComboBoxModel var9 = (DefaultComboBoxModel)this.d.getModel();
         var9.removeAllElements();

         for (String var8 : var3) {
            var9.addElement(var8);
         }

         this.d.setModel(var9);
      }

      this.e.a(this.e.e(), var2.get(this.d.getSelectedIndex()));
      if (var1 != 0) {
         this.d.setSelectedIndex(var1);
      }
   }

   public void b() {
      this.a(0);
   }

   public void c() {
      if (this.m != null) {
         this.m.dispose();
         this.m = null;
      }
   }

   public void d() {
      this.k = rs.p_gui.p_b.p_a.C_n.a(this);
   }

   public rs.p_gui.p_b.p_b.C_d e() {
      return this.f;
   }

   public C_d f() {
      return this.e;
   }

   public rs.p_gui.p_b.p_c.C_b g() {
      return this.g;
   }

   public JComboBox<String> h() {
      return this.d;
   }

   public JButton i() {
      return this.l;
   }

   public JPopupMenu j() {
      return this.k;
   }

   static JPopupMenu a(C_h var0) {
      return var0.k;
   }

   static void a(C_h var0, C_A_uc var1) {
      var0.m = var1;
   }

   static C_d b(C_h var0) {
      return var0.e;
   }

   static C_A_uc c(C_h var0) {
      return var0.m;
   }
}

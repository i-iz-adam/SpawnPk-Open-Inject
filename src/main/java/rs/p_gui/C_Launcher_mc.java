package rs.p_gui;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Locale;
import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceTitlePaneUtilities.ExtraComponentKind;
import rs.C_Client_mc;

public class C_Launcher_mc extends Applet implements ActionListener {
   public static final boolean a = false;
   private static final long u = 3432444016124110957L;
   public static final int b = 1134;
   public static final int c = 537;
   public static final int d = 765;
   public static final int e = 537;
   public static final int f = 765;
   public static final int g = 503;
   public static final int h = 765;
   public static final int i = 503;
   public static final Dimension j = new Dimension(765, 503);
   private static C_Launcher_mc v;
   public static ImageIcon k;
   public C_J_uc l;
   private C_O_uc w;
   public JPanel m;
   public C_E_uc n;
   public C_u o;
   public JButton x;
   private rs.p_z.C_d y = new rs.p_z.C_d();
   public final Object p = new Object();
   public boolean q;
   public boolean r;
   public boolean s;
   private Icon z = null;
   private Icon A = null;
   private TrayIcon B;
   @Inject
   public C_Client_mc t;
   @Inject
   private rs.p_ui.C_f C;
   @Inject
   private rs.p_e.C_i D;

   @Inject
   public C_Launcher_mc(C_Client_mc var1, rs.p_ui.C_f var2, rs.p_e.C_i var3) {
      this.t = var1;
      this.C = var2;
      this.D = var3;
   }

   public static void a(C_Launcher_mc var0) {
      v = var0;
   }

   public static void main(String[] var0) {
      Locale.setDefault(Locale.ENGLISH);
      System.setProperty("jgoodies.popupDropShadowEnabled", "false");
      System.setProperty("sun.awt.noerasebackground", "true");
      System.setProperty("java.net.preferIPv4Stack", "true");
      C_M_uc.a();
      rs.p_p.C_a.a();
      if (rs.p_f.C_a.e) {
         Object var1 = null;
         File var2 = Paths.get(rs.p_v.C_a.b()).toFile();
         if (!var2.exists()) {
            var2.mkdir();
         }

         File var3 = Paths.get(rs.p_v.C_a.b(), "logs").toFile();
         String var4 = new SimpleDateFormat("dd-MM-yyyy HH mm ss").format(Calendar.getInstance().getTime());
         if (!var3.exists()) {
            var3.mkdir();
         }

         File[] var5 = var3.listFiles();
         if (var5 != null && var5.length > 15) {
            Arrays.sort(var5, Comparator.comparingLong(File::lastModified));

            for (int var6 = 0; var6 < var5.length - 15; var6++) {
               if (var5[var6].delete()) {
               }
            }
         }

         try {
            var1 = new PrintStream(Paths.get(var3.toString(), var4 + ".txt").toFile());
            PrintStream var9 = System.out;
            System.setOut((PrintStream)var1);
            System.setErr((PrintStream)var1);
         } catch (FileNotFoundException var7) {
            throw new RuntimeException(var7);
         }
      }
   }

   public C_Launcher_mc() {
   }

   public void a() {
      if (!SystemTray.isSupported()) {
         System.err.println("[Error] Tray icons not supported.");
      } else {
         k = null;

         try {
            InputStream var1 = v.getClass().getResourceAsStream("/assets/icon.png");
            k = new ImageIcon(ImageIO.read(var1));
         } catch (Exception var4) {
            try {
               k = new ImageIcon("./assets/icon.png");
            } catch (Exception var3) {
            }
         }

         if (k != null) {
            this.B = new TrayIcon(k.getImage(), "SpawnPK RSPS");
            this.B.setImageAutoSize(true);
            this.B.addMouseListener(new C_y(this));
         } else {
            System.out.println("No image!");
         }
      }
   }

   public void b() {
      if (System.getProperty("os.name").contains("Mac OS X")) {
         this.s = true;
      }

      this.l = new C_J_uc();
      this.o = new C_u();
      this.w = new C_O_uc();
      this.o.setFocusable(false);
      this.o.setUndecorated(true);
      if (rs.p_f.C_a.h) {
         this.o.setTitle("SpawnPK - [BETA TEST WORLD]");
      } else {
         this.o.setTitle("[V" + rs.p_f.C_a.c_ver + "] " + rs.p_f.C_a.a.a());
      }

      if (rs.p_l.p_b.p_a.C_d.c) {
         this.o.setTitle("SPK Editor Kit");
      }

      this.o.setResizable(true);
      this.o.setFocusable(true);
      this.o.setDefaultCloseOperation(3);
      this.o.setLocationRelativeTo(this.o.getOwner());
      this.o.setMinimumSize(new Dimension(rs.p_f.C_a.v ? 1134 : 769, 537));
      this.o.setCursor(Cursor.getDefaultCursor());
      this.o.setFocusTraversalKeysEnabled(false);
      JComponent var1 = SubstanceCoreUtilities.getTitlePaneComponent(this.o);
      this.w.putClientProperty("substancelaf.internal.titlePane.extraComponentKind", ExtraComponentKind.TRAILING);
      if (C_Client_mc.class.getResource("Client.class").toString().startsWith("file")) {
         this.z = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/panel.png"));
         this.A = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/panel2.png"));
      } else {
         try {
            this.z = new ImageIcon(ImageIO.read(C_Client_mc.class.getResource("/assets/gui/panel.png")));
            this.A = new ImageIcon(ImageIO.read(C_Client_mc.class.getResource("/assets/gui/panel2.png")));
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }

      this.w.setLayout(new GridBagLayout());
      this.x = new JButton(this.z);
      this.x.setPreferredSize(new Dimension(23, 22));
      this.x.setMinimumSize(new Dimension(23, 22));
      this.x.setFocusable(false);
      this.x.setToolTipText("Hide/show side panel");
      this.x.addActionListener(new C_z(this));
      if (!rs.p_l.p_b.p_a.C_d.c) {
         this.w.add(this.x);
      }

      var1.add(this.w);
      LayoutManager var2 = var1.getLayout();
      var1.setLayout(new C_A_uc(this, var2, var1));
      this.m = new JPanel();
      this.m.setLayout(new BoxLayout(this.m, 0));
      this.t = new C_Client_mc();
      this.t.setLayout(null);
      if (!rs.p_l.p_b.p_a.C_d.c) {
         this.t.setSize(new Dimension(765, 503));
      }

      this.t.setBackground(new Color(10, 10, 10));
      this.n = new C_E_uc();
      if (!rs.p_l.p_b.p_a.C_d.c) {
         this.n.setSize(new Dimension(765, 503));
         this.n.setMinimumSize(new Dimension(765, 503));
      }

      this.n.setPreferredSize(new Dimension(765, 503));
      this.n.setLayout(new BorderLayout());
      this.n.setBackground(Color.black);
      this.t.init();
      this.t.start();
      this.n.add(this.t, "Center");
      this.l.setBackground(new Color(10, 10, 10));
      this.n.setBackground(new Color(10, 10, 10));
      this.m.setBackground(new Color(10, 10, 10));
      this.m.add(this.n);
      if (!rs.p_l.p_b.p_a.C_d.c) {
         this.m.add(this.l);
      }

      this.o.getContentPane().add(this.m);
      this.o.pack();
      this.o.a();
      this.o.setLocationRelativeTo(this.o.getOwner());
      this.o.setVisible(true);
      this.o.toFront();
      this.requestFocus();
      this.t.requestFocus();
      if (!rs.p_f.C_a.v) {
         this.l.setVisible(false);
         this.o.setSize(772, 503);
      }
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
   }

   public void c() {
   }

   public void d() {
      this.a(20);
   }

   public void a(boolean var1) {
      this.C.a(var1);
   }

   public static boolean e() {
      return n().p().o();
   }

   @Override
   public Dimension getSize() {
      return this.o.getSize();
   }

   public void a(int var1) {
      this.a(var1, false);
   }

   public void a(int var1, boolean var2) {
      if (!rs.p_l.p_b.p_a.C_d.c) {
      }
   }

   public void b(boolean var1) {
      SwingUtilities.invokeLater(new C_C_uc(this, var1));
   }

   public void a(String var1, String var2) {
      this.a(var1, var2, false);
   }

   public void a(String var1, String var2, boolean var3) {
      if (this.B != null) {
         if (!var3) {
            if (!rs.p_f.C_a.aP) {
               return;
            }

            if (this.i().isActive()) {
               return;
            }

            if (!this.y.a(var1, 5000L)) {
               return;
            }
         }

         this.B.displayMessage(var1, var2, MessageType.NONE);
      }
   }

   public rs.p_z.C_d f() {
      return this.y;
   }

   public TrayIcon g() {
      return this.B;
   }

   public void a(int var1, int var2, int var3, int var4) {
      SwingUtilities.invokeLater(new C_D_uc(this, var1, var2, var3, var4));
   }

   public boolean h() {
      return this.s;
   }

   public void a(Graphics var1) {
   }

   public JFrame i() {
      return this.C.m();
   }

   public rs.p_ui.C_a j() {
      return this.C.n();
   }

   public rs.p_gui.p_b.C_h k() {
      return rs.p_gui.p_b.C_h.b;
   }

   public void b(int var1, boolean var2) {
      if (!rs.p_f.C_a.br || var2) {
         if (!this.r) {
            this.r = true;
            Timer var3 = new Timer(var1, var1x -> {
               n().k().repaint();
               ((Timer)var1x.getSource()).stop();
               this.r = false;
            });
            var3.setInitialDelay(var1);
            var3.start();
         }
      }
   }

   public JPanel l() {
      return this.m;
   }

   public C_J_uc m() {
      return this.l;
   }

   public static C_Launcher_mc n() {
      return v;
   }

   public C_Client_mc o() {
      return this.t;
   }

   public rs.p_ui.C_f p() {
      return this.C;
   }

   public rs.p_e.C_i q() {
      return this.D;
   }
}

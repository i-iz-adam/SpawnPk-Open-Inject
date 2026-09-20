package rs.p_ui;

import com.google.inject.Inject;
import java.awt.CardLayout;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Taskbar;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.desktop.QuitStrategy;
import java.awt.image.BufferedImage;
import java.time.Duration;
import javax.annotation.Nullable;
import javax.inject.Singleton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceTitlePaneUtilities.ExtraComponentKind;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.C_Client_mc;
import rs.p_A_uc.C_o;
import rs.p_eventbus.C_EventBus_mc;
import rs.p_eventbus.C_Subscribe_mc;
import rs.p_gui.C_Launcher_mc;
import rs.p_gui.C_M_uc;
import rs.p_gui.C_u;
import rs.p_gui.C_w;
import rs.p_runelite.p_events.C_ClientShutdown_mc;
import rs.p_runelite.p_events.C_NavigationButtonAdded_mc;
import rs.p_runelite.p_events.C_NavigationButtonRemoved_mc;

@Singleton
public class C_f {
   private static final Logger a = LoggerFactory.getLogger(C_f.class);
   private static final String b = "runelite";
   private static final String c = "clientBounds";
   private static final String d = "clientMaximized";
   private static final String e = "clientSidebarClosed";
   private final CardLayout f = new CardLayout();
   @Inject
   private final C_Client_mc g;
   @Inject
   private final rs.p_e.C_i h;
   @Inject
   private final C_EventBus_mc i;
   private TrayIcon j;
   private C_u k;
   private C_a l;
   private boolean m;
   private boolean n;
   private JPanel o;
   private JPanel p;
   private C_b q;
   private C_c r;
   private BufferedImage s;
   private BufferedImage t;
   private C_l u;
   private JButton v;
   private C_l w;
   private JButton x;
   private C_m y;
   private Cursor z;
   private final rs.p_g.p_a.C_b A;
   private final rs.p_s.C_h B;

   @Inject
   public C_f(C_Client_mc var1, rs.p_g.p_a.C_b var2, rs.p_e.C_i var3, rs.p_s.C_h var4, C_EventBus_mc var5) {
      this.A = var2;
      this.g = var1;
      this.h = var3;
      this.B = var4;
      this.i = var5;
   }

   public void a() {
      SwingUtilities.invokeAndWait(() -> {
         C_M_uc.a();
         C_M_uc.a(new rs.p_ui.p_c.C_c());
         C_M_uc.a(C_w.a());
         this.k = new C_u();
         C_o.a(this.k);
         C_Launcher_mc.n().a();
         if (C_Launcher_mc.k != null) {
            C_u var10000 = this.k;
            C_Launcher_mc.n();
            var10000.setIconImage(C_Launcher_mc.k.getImage());
            C_Launcher_mc.n();
            this.j = C_M_uc.a(C_Launcher_mc.k.getImage(), rs.p_f.C_a.A, this.k);
         }

         if (rs.p_f.C_a.h) {
            this.k.setTitle(rs.p_f.C_a.a.a() + " - [BETA TEST WORLD]");
         } else {
            this.k.setTitle("[V" + rs.p_f.C_a.c_ver + "] " + rs.p_f.C_a.a.a());
         }

         this.k.getLayeredPane().setCursor(Cursor.getDefaultCursor());
         this.k.setLocationRelativeTo(this.k.getOwner());
         this.k.setResizable(true);
         this.k.setDefaultCloseOperation(0);
         if (rs.p_k.C_j.a() == rs.p_k.C_j.b) {
            Desktop.getDesktop().setQuitStrategy(QuitStrategy.CLOSE_ALL_WINDOWS);
         }

         this.k.addWindowListener(new C_g(this));
         this.k.addWindowStateListener(var1x -> {
            if (var1x.getNewState() == 0) {
               SwingUtilities.invokeLater(this.k::a);
            }
         });
         this.p = new JPanel();
         this.p.setLayout(new BoxLayout(this.p, 0));
         this.l = new C_a(this.g);
         this.p.add(this.l);
         this.g.init();
         this.g.start();
         this.o = new JPanel();
         this.o.setLayout(this.f);
         this.o.setMinimumSize(new Dimension(0, 0));
         this.o.setMaximumSize(new Dimension(0, 0));
         this.o.setPreferredSize(new Dimension(0, 0));
         this.o.putClientProperty("substancelaf.internal.colorizationFactor", Double.valueOf(1.0));
         this.p.add(this.o);
         this.q = new C_b();
         this.r = new C_c();
         this.k.add(this.p);
         this.n = rs.p_k.C_j.a() == rs.p_k.C_j.a;
         this.k.setUndecorated(this.n);
         if (this.n) {
            this.k.getRootPane().setWindowDecorationStyle(1);
            JComponent var1 = SubstanceCoreUtilities.getTitlePaneComponent(this.k);
            this.r.putClientProperty("substancelaf.internal.titlePane.extraComponentKind", ExtraComponentKind.TRAILING);
            var1.add(this.r);
            LayoutManager var2 = var1.getLayout();
            var1.setLayout(new C_h(this, var2, var1));
         }

         this.k.a(C_u.a.c);
         this.s = rs.p_A_uc.C_j.b(C_f.class, this.n ? "open.png" : "open_rs.png");
         this.t = rs.p_A_uc.C_j.a(this.s, true, false);
         this.u = C_l.a().a(100).a(this.s).a("Open SideBar").a(this::g).a();
         this.v = C_M_uc.a(this.u, 0, null);
         this.r.a(this.u, this.v);
         this.a(true);
      });
   }

   @C_Subscribe_mc
   public void onNavigationButtonAdded(C_NavigationButtonAdded_mc var1) {
      SwingUtilities.invokeLater(() -> {
         C_l var2 = var1.getButton();
         C_m var3 = var2.h();
         boolean var4 = !var1.getButton().c() && this.n;
         byte var5 = 16;
         if (var3 != null) {
            this.o.add(var3.l(), var2.d());
         }

         JButton var6 = C_M_uc.a(var2, 16, (var1xx, var2x) -> {
            C_m var3x = var1xx.h();
            if (var3x != null) {
               boolean var4x = this.x != null && this.x == var2x && this.x.isSelected();
               if (var4x) {
                  this.t();
                  this.x.setSelected(false);
                  this.w.b(false);
                  this.x = null;
                  this.w = null;
               } else {
                  if (this.x != null) {
                     this.x.setSelected(false);
                  }

                  if (this.w != null) {
                     this.w.b(false);
                  }

                  this.x = var2x;
                  this.w = var1xx;
                  this.x.setSelected(true);
                  this.w.b(true);
                  this.a(var1xx);
               }
            }
         });
         if (var4) {
            this.r.a(var1.getButton(), var6);
            this.r.revalidate();
         } else {
            this.q.a(var1.getButton(), var6);
            this.q.revalidate();
         }
      });
   }

   @C_Subscribe_mc
   public void onNavigationButtonRemoved(C_NavigationButtonRemoved_mc var1) {
      SwingUtilities.invokeLater(() -> {
         this.q.a(var1.getButton());
         this.q.revalidate();
         this.r.a(var1.getButton());
         this.r.revalidate();
         C_m var2 = var1.getButton().h();
         if (var2 != null) {
            this.o.remove(var2.l());
         }
      });
   }

   public void b() {
      this.r();
      SwingUtilities.invokeLater(() -> {
         this.k.pack();
         this.k.a();
         this.k.setLocationRelativeTo(this.k.getOwner());
         this.k.setVisible(true);
         this.k.setResizable(true);
         this.k.toFront();
         this.e();
         a.debug("Showing frame {}", this.k);
         this.k.a();
      });
   }

   public void a(int var1, int var2, int var3, int var4) {
      int var5 = Math.max(Math.min(var1, 7680), var3);
      int var6 = Math.max(Math.min(var2, 2160), var4);
      Dimension var7 = new Dimension(var5, var6);
      Dimension var8 = new Dimension(var3, var4);
      SwingUtilities.invokeLater(() -> {
         this.g.setSize(var7);
         this.g.setPreferredSize(var7);
         this.g.setMinimumSize(var8);
         this.g.getParent().setPreferredSize(var7);
         this.g.getParent().setSize(var7);
         this.g.getParent().setMinimumSize(var8);
         if (this.k.isVisible()) {
            this.k.pack();
            this.k.a();
         }
      });
   }

   public void a(int var1, int var2) {
      this.a(var1, var2, 765, 503);
   }

   public void c() {
   }

   public boolean d() {
      return this.k.isFocused();
   }

   public void e() {
      switch (rs.p_k.C_j.a()) {
         case b:
            C_o.a();
            break;
         default:
            this.k.requestFocus();
      }

      this.w();
   }

   public void f() {
      switch (rs.p_k.C_j.a()) {
         case b:
            C_o.b();
            break;
         case a:
            rs.p_A_uc.C_u.a(this.k);
            break;
         default:
            this.k.requestFocus();
      }

      this.w();
   }

   private void r() {
      GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();

      for (GraphicsDevice var5 : var1.getScreenDevices()) {
         GraphicsConfiguration var6 = var5.getDefaultConfiguration();
         a.debug("Graphics device {}: bounds {} transform: {}", new Object[]{var5, var6.getBounds(), var6.getDefaultTransform()});
      }
   }

   private GraphicsConfiguration a(Rectangle var1) {
      GraphicsDevice[] var2 = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();

      for (GraphicsDevice var6 : var2) {
         GraphicsConfiguration var7 = var6.getDefaultConfiguration();
         Rectangle var8 = var7.getBounds();
         if (var8.contains(var1)) {
            return var7;
         }
      }

      return null;
   }

   public void g() {
      this.a(!this.m);
   }

   public void a(boolean var1) {
      boolean var2 = this.m;
      this.m = var1;
      if (this.x != null) {
         this.x.setSelected(this.m);
      }

      if (this.w != null) {
         this.w.b(this.m);
      }

      if (var2) {
         this.v.setIcon(new ImageIcon(this.s));
         this.v.setToolTipText("Open SideBar");
         this.h.a("runelite", "clientSidebarClosed", true);
         this.t();
         this.p.remove(this.q);
      } else {
         this.v.setIcon(new ImageIcon(this.t));
         this.v.setToolTipText("Close SideBar");
         this.h.b("runelite", "clientSidebarClosed");
         this.a(this.w);
         this.p.add(this.q);
      }

      this.p.revalidate();
      this.w();
      if (this.m) {
         this.k.a(this.q.getWidth());
      } else {
         this.k.b(this.q.getWidth());
      }
   }

   private void s() {
      boolean var1 = this.y != null;
      if (this.x != null) {
         this.x.setSelected(!var1);
      }

      if (var1) {
         this.t();
      } else {
         this.a(this.w);
      }
   }

   private void a(@Nullable C_l var1) {
      if (var1 != null) {
         C_m var2 = var1.h();
         if (var2 != null) {
            if (!this.m) {
               this.g();
            }

            int var3 = var2.l().getPreferredSize().width;
            int var4 = this.y != null ? this.y.l().getPreferredSize().width - var3 : var3;
            if (this.y != null) {
               this.y.K_();
            }

            this.y = var2;
            this.o.setMinimumSize(new Dimension(var3, 0));
            this.o.setMaximumSize(new Dimension(var3, Integer.MAX_VALUE));
            this.o.setPreferredSize(new Dimension(var3, 0));
            this.o.revalidate();
            this.f.show(this.o, var1.d());
            this.w();
            var2.J_();
            if (var4 > 0) {
               this.k.a(var4);
            } else if (var4 < 0) {
               this.k.b(var4);
            }
         }
      }
   }

   private void t() {
      if (this.y != null) {
         this.y.K_();
         this.o.setMinimumSize(new Dimension(0, 0));
         this.o.setMaximumSize(new Dimension(0, 0));
         this.o.setPreferredSize(new Dimension(0, 0));
         this.o.revalidate();
         this.w();
         this.k.b(this.y.l().getPreferredSize().width);
         this.y = null;
      }
   }

   private void u() {
      C_ClientShutdown_mc var1 = new C_ClientShutdown_mc();
      this.i.post(var1);
      new Thread(() -> {
         var1.waitForAllConsumers(Duration.ofSeconds(10L));
         if (this.g != null) {
            short var2;
            if (this.g instanceof C_Client_mc) {
               this.g.stop();
               var2 = 1000;
            } else {
               this.g.stop();
               this.k.setVisible(false);
               var2 = 6000;
            }

            try {
               Thread.sleep((long)var2);
            } catch (InterruptedException var4) {
            }
         }

         System.exit(0);
      }, "RuneLite Shutdown").start();
   }

   private boolean v() {
      return true;
   }

   private void w() {
      this.g.requestFocusInWindow();
   }

   public void h() {
      Taskbar.getTaskbar().requestWindowUserAttention(this.k);
   }

   public Cursor i() {
      return this.g.getCursor();
   }

   public Cursor j() {
      return this.z != null ? this.z : Cursor.getDefaultCursor();
   }

   public void a(BufferedImage var1, String var2) {
      if (this.g != null) {
         Point var3 = new Point(0, 0);
         Cursor var4 = Toolkit.getDefaultToolkit().createCustomCursor(var1, var3, var2);
         this.z = var4;
         this.a(var4);
      }
   }

   public void a(Cursor var1) {
      this.g.setCursor(var1);
   }

   public void k() {
      if (this.g != null) {
         this.z = null;
         this.g.setCursor(Cursor.getDefaultCursor());
      }
   }

   public TrayIcon l() {
      return this.j;
   }

   public C_u m() {
      return this.k;
   }

   public C_a n() {
      return this.l;
   }

   public boolean o() {
      return this.m;
   }

   public rs.p_g.p_a.C_b p() {
      return this.A;
   }
}

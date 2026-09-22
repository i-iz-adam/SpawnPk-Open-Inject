package rs.ui;

import com.google.inject.Inject;
import com.sun.jna.platform.win32.G;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Taskbar;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.desktop.QuitStrategy;
import java.awt.image.BufferedImage;
import java.time.Duration;
import java.util.Objects;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import javax.inject.Singleton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceTitlePaneUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.Client;
import rs.Configuration;
import rs.class_12;
import rs.class_139;
import rs.class_160;
import rs.class_17;
import rs.class_25;
import rs.eventbus.EventBus;
import rs.eventbus.Subscribe;
import rs.gui.Launcher;
import rs.gui.M;
import rs.gui.u;
import rs.gui.w;
import rs.runelite.events.ClientShutdown;
import rs.runelite.events.NavigationButtonAdded;
import rs.runelite.events.NavigationButtonRemoved;

/* JADX INFO: loaded from: client-final.jar:rs/ui/f.class */
@Singleton
public class f {
    private static final Logger a = LoggerFactory.getLogger((Class<?>) f.class);
    private static final String b = "runelite";
    private static final String c = "clientBounds";
    private static final String d = "clientMaximized";
    private static final String e = "clientSidebarClosed";
    private final CardLayout f = new CardLayout();

    @Inject
    private final Client g;

    @Inject
    private final class_139 h;

    @Inject
    private final EventBus i;
    private TrayIcon j;
    private u k;
    private a l;
    private boolean m;
    private boolean n;
    private JPanel o;
    private JPanel p;
    private b q;
    private c r;
    private BufferedImage s;
    private BufferedImage t;
    private l u;
    private JButton v;
    private l w;
    private JButton x;
    private m y;
    private Cursor z;
    private final class_160 A;
    private final rs.plugins.h B;

    @Inject
    public f(Client client, class_160 class_160Var, class_139 class_139Var, rs.plugins.h hVar, EventBus eventBus) {
        this.A = class_160Var;
        this.g = client;
        this.h = class_139Var;
        this.B = hVar;
        this.i = eventBus;
    }

    public void a() {
        SwingUtilities.invokeAndWait(() -> {
            M.a();
            M.a((LookAndFeel) new rs.ui.cpkg.c());
            M.a(w.a());
            this.k = new u();
            class_17.a(this.k);
            Launcher.n().a();
            if (Launcher.k != null) {
                u uVar = this.k;
                Launcher.n();
                uVar.setIconImage(Launcher.k.getImage());
                Launcher.n();
                this.j = M.a(Launcher.k.getImage(), Configuration.A, (Frame) this.k);
            }
            if (Configuration.h.booleanValue()) {
                this.k.setTitle(Configuration.a.a() + " - [BETA TEST WORLD]");
            } else {
                this.k.setTitle("[V" + Configuration.c + "] " + Configuration.a.a());
            }
            this.k.getLayeredPane().setCursor(Cursor.getDefaultCursor());
            this.k.setLocationRelativeTo(this.k.getOwner());
            this.k.setResizable(true);
            this.k.setDefaultCloseOperation(0);
            if (rs.lpkg.j.a() == rs.lpkg.j.b) {
                Desktop.getDesktop().setQuitStrategy(QuitStrategy.CLOSE_ALL_WINDOWS);
            }
            this.k.addWindowListener(new g(this));
            this.k.addWindowStateListener(windowEvent -> {
                if (windowEvent.getNewState() == 0) {
                    u uVar2 = this.k;
                    Objects.requireNonNull(uVar2);
                    SwingUtilities.invokeLater(uVar2::a);
                }
            });
            this.p = new JPanel();
            this.p.setLayout(new BoxLayout(this.p, 0));
            this.l = new a(this.g);
            this.p.add(this.l);
            this.g.init();
            this.g.start();
            this.o = new JPanel();
            this.o.setLayout(this.f);
            this.o.setMinimumSize(new Dimension(0, 0));
            this.o.setMaximumSize(new Dimension(0, 0));
            this.o.setPreferredSize(new Dimension(0, 0));
            this.o.putClientProperty(SubstanceSynapse.COLORIZATION_FACTOR, Double.valueOf(1.0d));
            this.p.add(this.o);
            this.q = new b();
            this.r = new c();
            this.k.add(this.p);
            this.n = rs.lpkg.j.a() == rs.lpkg.j.a;
            this.k.setUndecorated(this.n);
            if (this.n) {
                this.k.getRootPane().setWindowDecorationStyle(1);
                JComponent titlePaneComponent = SubstanceCoreUtilities.getTitlePaneComponent(this.k);
                this.r.putClientProperty(SubstanceTitlePaneUtilities.EXTRA_COMPONENT_KIND, SubstanceTitlePaneUtilities.ExtraComponentKind.TRAILING);
                titlePaneComponent.add(this.r);
                titlePaneComponent.setLayout(new h(this, titlePaneComponent.getLayout(), titlePaneComponent));
            }
            this.k.a(u.a.c);
            this.s = class_12.b((Class<?>) f.class, this.n ? "open.png" : "open_rs.png");
            this.t = class_12.a(this.s, true, false);
            this.u = l.a().a(100).a(this.s).a("Open SideBar").a(this::g).a();
            this.v = M.a(this.u, 0, (BiConsumer<l, JButton>) null);
            this.r.a(this.u, (Component) this.v);
            a(true);
        });
    }

    @Subscribe
    public void onNavigationButtonAdded(NavigationButtonAdded navigationButtonAdded) {
        SwingUtilities.invokeLater(() -> {
            l button = navigationButtonAdded.getButton();
            m mVarH = button.h();
            boolean z = !navigationButtonAdded.getButton().c() && this.n;
            if (mVarH != null) {
                this.o.add(mVarH.l(), button.d());
            }
            Component componentA = M.a(button, 16, (BiConsumer<l, JButton>) (lVar, jButton) -> {
                if (lVar.h() == null) {
                    return;
                }
                if (this.x != null && this.x == jButton && this.x.isSelected()) {
                    t();
                    this.x.setSelected(false);
                    this.w.b(false);
                    this.x = null;
                    this.w = null;
                    return;
                }
                if (this.x != null) {
                    this.x.setSelected(false);
                }
                if (this.w != null) {
                    this.w.b(false);
                }
                this.x = jButton;
                this.w = lVar;
                this.x.setSelected(true);
                this.w.b(true);
                a(lVar);
            });
            if (z) {
                this.r.a(navigationButtonAdded.getButton(), componentA);
                this.r.revalidate();
            } else {
                this.q.a(navigationButtonAdded.getButton(), componentA);
                this.q.revalidate();
            }
        });
    }

    @Subscribe
    public void onNavigationButtonRemoved(NavigationButtonRemoved navigationButtonRemoved) {
        SwingUtilities.invokeLater(() -> {
            this.q.a(navigationButtonRemoved.getButton());
            this.q.revalidate();
            this.r.a(navigationButtonRemoved.getButton());
            this.r.revalidate();
            m mVarH = navigationButtonRemoved.getButton().h();
            if (mVarH != null) {
                this.o.remove(mVarH.l());
            }
        });
    }

    public void b() {
        r();
        SwingUtilities.invokeLater(() -> {
            this.k.pack();
            this.k.a();
            this.k.setLocationRelativeTo(this.k.getOwner());
            this.k.setVisible(true);
            this.k.setResizable(true);
            this.k.toFront();
            e();
            a.debug("Showing frame {}", this.k);
            this.k.a();
        });
    }

    public void a(int i, int i2, int i3, int i4) {
        Dimension dimension = new Dimension(Math.max(Math.min(i, 7680), i3), Math.max(Math.min(i2, G.P), i4));
        Dimension dimension2 = new Dimension(i3, i4);
        SwingUtilities.invokeLater(() -> {
            this.g.setSize(dimension);
            this.g.setPreferredSize(dimension);
            this.g.setMinimumSize(dimension2);
            this.g.getParent().setPreferredSize(dimension);
            this.g.getParent().setSize(dimension);
            this.g.getParent().setMinimumSize(dimension2);
            if (this.k.isVisible()) {
                this.k.pack();
                this.k.a();
            }
        });
    }

    public void a(int i, int i2) {
        a(i, i2, 765, 503);
    }

    public void c() {
    }

    public boolean d() {
        return this.k.isFocused();
    }

    public void e() {
        switch (i.a[rs.lpkg.j.a().ordinal()]) {
            case 1:
                class_17.a();
                break;
            default:
                this.k.requestFocus();
                break;
        }
        w();
    }

    public void f() {
        switch (i.a[rs.lpkg.j.a().ordinal()]) {
            case 1:
                class_17.b();
                break;
            case 2:
                class_25.a(this.k);
                break;
            default:
                this.k.requestFocus();
                break;
        }
        w();
    }

    private void r() {
        for (GraphicsDevice graphicsDevice : GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()) {
            GraphicsConfiguration defaultConfiguration = graphicsDevice.getDefaultConfiguration();
            a.debug("Graphics device {}: bounds {} transform: {}", graphicsDevice, defaultConfiguration.getBounds(), defaultConfiguration.getDefaultTransform());
        }
    }

    private GraphicsConfiguration a(Rectangle rectangle) {
        for (GraphicsDevice graphicsDevice : GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()) {
            GraphicsConfiguration defaultConfiguration = graphicsDevice.getDefaultConfiguration();
            if (defaultConfiguration.getBounds().contains(rectangle)) {
                return defaultConfiguration;
            }
        }
        return null;
    }

    public void g() {
        a(!this.m);
    }

    public void a(boolean z) {
        boolean z2 = this.m;
        this.m = z;
        if (this.x != null) {
            this.x.setSelected(this.m);
        }
        if (this.w != null) {
            this.w.b(this.m);
        }
        if (z2) {
            this.v.setIcon(new ImageIcon(this.s));
            this.v.setToolTipText("Open SideBar");
            this.h.a("runelite", e, true);
            t();
            this.p.remove(this.q);
        } else {
            this.v.setIcon(new ImageIcon(this.t));
            this.v.setToolTipText("Close SideBar");
            this.h.b("runelite", e);
            a(this.w);
            this.p.add(this.q);
        }
        this.p.revalidate();
        w();
        if (this.m) {
            this.k.a(this.q.getWidth());
        } else {
            this.k.b(this.q.getWidth());
        }
    }

    private void s() {
        boolean z = this.y != null;
        if (this.x != null) {
            this.x.setSelected(!z);
        }
        if (z) {
            t();
        } else {
            a(this.w);
        }
    }

    private void a(@Nullable l lVar) {
        m mVarH;
        if (lVar == null || (mVarH = lVar.h()) == null) {
            return;
        }
        if (!this.m) {
            g();
        }
        int i = mVarH.l().getPreferredSize().width;
        int i2 = this.y != null ? this.y.l().getPreferredSize().width - i : i;
        if (this.y != null) {
            this.y.K_();
        }
        this.y = mVarH;
        this.o.setMinimumSize(new Dimension(i, 0));
        this.o.setMaximumSize(new Dimension(i, Integer.MAX_VALUE));
        this.o.setPreferredSize(new Dimension(i, 0));
        this.o.revalidate();
        this.f.show(this.o, lVar.d());
        w();
        mVarH.J_();
        if (i2 > 0) {
            this.k.a(i2);
        } else if (i2 < 0) {
            this.k.b(i2);
        }
    }

    private void t() {
        if (this.y == null) {
            return;
        }
        this.y.K_();
        this.o.setMinimumSize(new Dimension(0, 0));
        this.o.setMaximumSize(new Dimension(0, 0));
        this.o.setPreferredSize(new Dimension(0, 0));
        this.o.revalidate();
        w();
        this.k.b(this.y.l().getPreferredSize().width);
        this.y = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        ClientShutdown clientShutdown = new ClientShutdown();
        this.i.post(clientShutdown);
        new Thread(() -> {
            int i;
            clientShutdown.waitForAllConsumers(Duration.ofSeconds(10L));
            if (this.g != null) {
                if (this.g instanceof Client) {
                    this.g.stop();
                    i = 1000;
                } else {
                    this.g.stop();
                    this.k.setVisible(false);
                    i = 6000;
                }
                try {
                    Thread.sleep(i);
                } catch (InterruptedException e2) {
                }
            }
            System.exit(0);
        }, "RuneLite Shutdown").start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean v() {
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

    public void a(BufferedImage bufferedImage, String str) {
        if (this.g == null) {
            return;
        }
        Cursor cursorCreateCustomCursor = Toolkit.getDefaultToolkit().createCustomCursor(bufferedImage, new Point(0, 0), str);
        this.z = cursorCreateCustomCursor;
        a(cursorCreateCustomCursor);
    }

    public void a(Cursor cursor) {
        this.g.setCursor(cursor);
    }

    public void k() {
        if (this.g == null) {
            return;
        }
        this.z = null;
        this.g.setCursor(Cursor.getDefaultCursor());
    }

    public TrayIcon l() {
        return this.j;
    }

    public u m() {
        return this.k;
    }

    public a n() {
        return this.l;
    }

    public boolean o() {
        return this.m;
    }

    public class_160 p() {
        return this.A;
    }
}

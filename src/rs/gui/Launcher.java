package rs.gui;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
import org.pushingpixels.substance.internal.contrib.jgoodies.looks.Options;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceTitlePaneUtilities;
import rs.Client;
import rs.Configuration;
import rs.class_139;
import rs.class_205;
import rs.class_650;
import rs.class_672;

/* JADX INFO: loaded from: client-final.jar:rs/gui/Launcher.class */
public class Launcher extends Applet implements ActionListener {
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
    private static Launcher instance;
    public static ImageIcon k;
    public J l;
    private O w;
    public JPanel m;
    public E n;
    public u o;
    private JButton x;
    public boolean q;
    public boolean r;
    public boolean s;
    private TrayIcon trayIcon;

    @Inject
    public Client t;

    @Inject
    private rs.ui.f C;

    @Inject
    private class_139 D;
    private class_672 y = new class_672();
    public final Object p = new Object();
    private Icon z = null;
    private Icon A = null;

    @Inject
    public Launcher(Client client, rs.ui.f fVar, class_139 class_139Var) {
        this.t = client;
        this.C = fVar;
        this.D = class_139Var;
    }

    public static void a(Launcher launcher) {
        instance = launcher;
    }

    public static void main(String[] strArr) {
        Locale.setDefault(Locale.ENGLISH);
        System.setProperty(Options.POPUP_DROP_SHADOW_ENABLED_KEY, "false");
        System.setProperty("sun.awt.noerasebackground", "true");
        System.setProperty("java.net.preferIPv4Stack", "true");
        M.a();
        rs.ppkg.a.a();
        if (Configuration.e) {
            File file = Paths.get(class_650.b(), new String[0]).toFile();
            if (!file.exists()) {
                file.mkdir();
            }
            File file2 = Paths.get(class_650.b(), "logs").toFile();
            String str = new SimpleDateFormat("dd-MM-yyyy HH mm ss").format(Calendar.getInstance().getTime());
            if (!file2.exists()) {
                file2.mkdir();
            }
            File[] fileArrListFiles = file2.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 15) {
                Arrays.sort(fileArrListFiles, Comparator.comparingLong((v0) -> {
                    return v0.lastModified();
                }));
                for (int i2 = 0; i2 < fileArrListFiles.length - 15; i2++) {
                    if (fileArrListFiles[i2].delete()) {
                    }
                }
            }
            try {
                PrintStream printStream = new PrintStream(Paths.get(file2.toString(), str + ".txt").toFile());
                PrintStream printStream2 = System.out;
                System.setOut(printStream);
                System.setErr(printStream);
            } catch (FileNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public Launcher() {
    }

    public void a() {
        if (!SystemTray.isSupported()) {
            System.err.println("[Error] Tray icons not supported.");
            return;
        }
        k = null;
        try {
            k = new ImageIcon(ImageIO.read(instance.getClass().getResourceAsStream("/assets/icon.png")));
        } catch (Exception e2) {
            try {
                k = new ImageIcon("./assets/icon.png");
            } catch (Exception e3) {
            }
        }
        if (k == null) {
            System.out.println("No image!");
            return;
        }
        this.trayIcon = new TrayIcon(k.getImage(), "SpawnPK RSPS");
        this.trayIcon.setImageAutoSize(true);
        this.trayIcon.addMouseListener(new y(this));
    }

    public void b() {
        if (System.getProperty("os.name").contains("Mac OS X")) {
            this.s = true;
        }
        this.l = new J();
        this.o = new u();
        this.w = new O();
        this.o.setFocusable(false);
        this.o.setUndecorated(true);
        if (Configuration.h.booleanValue()) {
            this.o.setTitle("SpawnPK - [BETA TEST WORLD]");
        } else {
            this.o.setTitle("[V" + Configuration.c + "] " + Configuration.a.a());
        }
        if (class_205.c) {
            this.o.setTitle("SPK Editor Kit");
        }
        this.o.setResizable(true);
        this.o.setFocusable(true);
        this.o.setDefaultCloseOperation(3);
        this.o.setLocationRelativeTo(this.o.getOwner());
        this.o.setMinimumSize(new Dimension(Configuration.v ? b : 769, 537));
        this.o.setCursor(Cursor.getDefaultCursor());
        this.o.setFocusTraversalKeysEnabled(false);
        JComponent titlePaneComponent = SubstanceCoreUtilities.getTitlePaneComponent(this.o);
        this.w.putClientProperty(SubstanceTitlePaneUtilities.EXTRA_COMPONENT_KIND, SubstanceTitlePaneUtilities.ExtraComponentKind.TRAILING);
        if (Client.class.getResource("Client.class").toString().startsWith("file")) {
            this.z = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/panel.png"));
            this.A = new ImageIcon(Toolkit.getDefaultToolkit().getImage("./assets/gui/panel2.png"));
        } else {
            try {
                this.z = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/panel.png")));
                this.A = new ImageIcon(ImageIO.read(Client.class.getResource("/assets/gui/panel2.png")));
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        this.w.setLayout(new GridBagLayout());
        this.x = new JButton(this.z);
        this.x.setPreferredSize(new Dimension(23, 22));
        this.x.setMinimumSize(new Dimension(23, 22));
        this.x.setFocusable(false);
        this.x.setToolTipText("Hide/show side panel");
        this.x.addActionListener(new z(this));
        if (!class_205.c) {
            this.w.add(this.x);
        }
        titlePaneComponent.add(this.w);
        titlePaneComponent.setLayout(new A(this, titlePaneComponent.getLayout(), titlePaneComponent));
        this.m = new JPanel();
        this.m.setLayout(new BoxLayout(this.m, 0));
        this.t = new Client();
        this.t.setLayout(null);
        if (!class_205.c) {
            this.t.setSize(new Dimension(765, 503));
        }
        this.t.setBackground(new Color(10, 10, 10));
        this.n = new E();
        if (!class_205.c) {
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
        if (!class_205.c) {
            this.m.add(this.l);
        }
        this.o.getContentPane().add(this.m);
        this.o.pack();
        this.o.a();
        this.o.setLocationRelativeTo(this.o.getOwner());
        this.o.setVisible(true);
        this.o.toFront();
        requestFocus();
        this.t.requestFocus();
        if (Configuration.v) {
            return;
        }
        this.l.setVisible(false);
        this.o.setSize(772, 503);
    }

    public void actionPerformed(ActionEvent actionEvent) {
    }

    public void c() {
    }

    public void d() {
        a(20);
    }

    public void a(boolean z) {
        this.C.a(z);
    }

    public static boolean e() {
        return n().p().o();
    }

    public Dimension getSize() {
        return this.o.getSize();
    }

    public void a(int i2) {
        a(i2, false);
    }

    public void a(int i2, boolean z) {
        if (!class_205.c) {
        }
    }

    public void b(boolean z) {
        SwingUtilities.invokeLater(new C(this, z));
    }

    public void a(String str, String str2) {
        a(str, str2, false);
    }

    public void a(String str, String str2, boolean z) {
        if (this.trayIcon == null) {
            return;
        }
        if (z || (Configuration.aP && !i().isActive() && this.y.a(str, 5000L))) {
            this.trayIcon.displayMessage(str, str2, TrayIcon.MessageType.NONE);
        }
    }

    public class_672 f() {
        return this.y;
    }

    public TrayIcon g() {
        return this.trayIcon;
    }

    public void a(int i2, int i3, int i4, int i5) {
        SwingUtilities.invokeLater(new D(this, i2, i3, i4, i5));
    }

    public boolean h() {
        return this.s;
    }

    public void a(Graphics graphics) {
    }

    public JFrame i() {
        return this.C.m();
    }

    public rs.ui.a j() {
        return this.C.n();
    }

    public rs.gui.bpkg.h k() {
        return rs.gui.bpkg.h.b;
    }

    public void b(int i2, boolean z) {
        if ((!Configuration.bq || z) && !this.r) {
            this.r = true;
            Timer timer = new Timer(i2, actionEvent -> {
                n().k().repaint();
                ((Timer) actionEvent.getSource()).stop();
                this.r = false;
            });
            timer.setInitialDelay(i2);
            timer.start();
        }
    }

    public JPanel l() {
        return this.m;
    }

    public J m() {
        return this.l;
    }

    public static Launcher n() {
        return instance;
    }

    public Client o() {
        return this.t;
    }

    public rs.ui.f p() {
        return this.C;
    }

    public class_139 q() {
        return this.D;
    }
}

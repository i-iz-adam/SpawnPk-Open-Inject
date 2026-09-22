package rs.plugins.t;

import com.google.a.b.as;
import com.google.c.B;
import com.google.c.t;
import com.google.c.w;
import com.google.c.z;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Inject;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import org.apache.commons.a.F;
import rs.ClientThread;
import rs.class_12;
import rs.gui.Launcher;
import rs.ui.components.u;

/* JADX INFO: loaded from: client-final.jar:rs/s/t/l.class */
public class l extends JPanel {
    private static final String a = "ERROR_PANEL";
    private static final String b = "RESULTS_PANEL";
    private static final String c = "PAGE_PANEL";
    private static final int d = 15;
    private static final ImageIcon e;
    private static final ImageIcon f;
    private static final ImageIcon g;
    private static final ImageIcon h;
    private final ScheduledExecutorService n;
    private final i o;
    private final GridBagConstraints i = new GridBagConstraints();
    private final CardLayout j = new CardLayout();
    private final rs.ui.components.k k = new rs.ui.components.k();
    private final JPanel l = new JPanel();
    private final JPanel m = new JPanel(this.j);
    private final JLabel p = new JLabel();
    private final JButton q = new JButton();
    private final JButton r = new JButton();
    private final u s = new u();
    private String t = "";
    private int u = 1;
    private int v = 0;
    private int w = 0;

    @Inject
    private l(ScheduledExecutorService scheduledExecutorService, i iVar) {
        this.o = iVar;
        this.n = scheduledExecutorService;
        setLayout(new BorderLayout());
        setBackground(rs.gui.d.d);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout(5, 5));
        jPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        jPanel.setBackground(rs.gui.d.d);
        this.k.a(rs.ui.components.k.a.a);
        this.k.setPreferredSize(new Dimension(100, 30));
        this.k.setBackground(rs.gui.d.c);
        this.k.a(rs.gui.d.h);
        this.k.a(actionEvent -> {
            this.t = this.k.a();
            a(1, false);
            a(false);
        });
        this.k.a(() -> {
            this.t = "";
            a();
        });
        this.l.setLayout(new GridBagLayout());
        this.l.setBackground(rs.gui.d.d);
        this.i.fill = 2;
        this.i.weightx = 1.0d;
        this.i.gridx = 0;
        this.i.gridy = 0;
        JPanel jPanel2 = new JPanel(new BorderLayout());
        jPanel2.setBackground(rs.gui.d.d);
        jPanel2.add(this.l, "North");
        JScrollPane jScrollPane = new JScrollPane(jPanel2);
        jScrollPane.setBackground(rs.gui.d.d);
        jScrollPane.getVerticalScrollBar().setUnitIncrement(8);
        jScrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(12, 0));
        jScrollPane.getVerticalScrollBar().setBorder(new EmptyBorder(0, 5, 0, 0));
        jScrollPane.setVisible(false);
        this.q.setIcon(e);
        this.q.setRolloverIcon(f);
        this.q.addActionListener(actionEvent2 -> {
            a(this.u - 1, true);
        });
        this.r.setIcon(g);
        this.r.setRolloverIcon(h);
        this.r.addActionListener(actionEvent3 -> {
            a(this.u + 1, true);
        });
        this.p.setBorder(new EmptyBorder(0, 111, 0, 0));
        this.p.setText("Page 1");
        JPanel jPanel3 = new JPanel(new BorderLayout());
        jPanel3.add(this.q, "West");
        jPanel3.add(this.p, "Center");
        jPanel3.add(this.r, "East");
        JPanel jPanel4 = new JPanel(new BorderLayout());
        jPanel4.setBackground(rs.gui.d.d);
        jPanel4.add(this.s, "North");
        this.s.a("Trading Post Search", "Here you can search for an item by its name to find its sale history.");
        this.m.add(jScrollPane, b);
        this.m.add(jPanel4, a);
        jPanel.add(this.k, "North");
        jPanel.add(this.m, "Center");
        jPanel.add(jPanel3, "South");
        add(jPanel, "Center");
    }

    void a(String str) {
        this.t = str;
        this.k.a(this.t);
        this.n.execute(() -> {
            a(true);
        });
    }

    private boolean a() {
        if (as.c(this.t)) {
            this.l.removeAll();
            JPanel jPanel = this.l;
            Objects.requireNonNull(jPanel);
            SwingUtilities.invokeLater(jPanel::updateUI);
            return false;
        }
        this.l.removeAll();
        this.k.setBackground(rs.gui.d.c);
        this.k.a(false);
        this.r.setEnabled(false);
        this.q.setEnabled(false);
        this.k.a(rs.ui.components.k.a.b);
        return true;
    }

    private void a(boolean z) {
        if (!Launcher.n().o().fc) {
            this.k.a(rs.ui.components.k.a.d);
            this.s.a("Please login!", "You must be logged into the server to use this feature.");
            this.j.show(this.m, a);
            this.k.a(true);
            return;
        }
        if (a()) {
            String str = this.t;
            int i = this.u;
            this.n.execute(() -> {
                try {
                    a(str, i);
                } catch (IOException e2) {
                    this.k.a(rs.ui.components.k.a.d);
                    this.s.a("Error", "There has been an issue with your search!");
                    this.j.show(this.m, a);
                    this.k.a(true);
                    e2.printStackTrace();
                }
            });
        }
    }

    private void a(String str, int i) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL("https://hqxg0u8s64.execute-api.ca-central-1.amazonaws.com/Production/tradingpost?search_text=" + URLEncoder.encode(str, StandardCharsets.UTF_8.toString()) + "&page=" + i).openConnection();
        uRLConnectionOpenConnection.connect();
        t tVarU = new B().a(new InputStreamReader((InputStream) uRLConnectionOpenConnection.getContent())).u();
        ArrayList arrayList = new ArrayList();
        Iterator<w> it = tVarU.iterator();
        while (it.hasNext()) {
            c cVarA = a(it.next());
            arrayList.add(cVarA);
            this.w = cVarA.e();
            for (int i2 = 0; i2 <= 5 && this.o.a(cVarA.f()) == null; i2++) {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e2) {
                }
            }
        }
        ClientThread.queue(() -> {
            a((List<c>) arrayList);
        });
    }

    private c a(w wVar) {
        z zVarT = wVar.t();
        int iJ = zVarT.c("id").j();
        int iJ2 = zVarT.c("item_id").j();
        String strD = zVarT.c("time").d();
        String strD2 = zVarT.c("item_name").d();
        String strD3 = zVarT.c("seller").d();
        String strD4 = zVarT.c("buyer").d();
        int iJ3 = zVarT.c("currency").j();
        int iJ4 = zVarT.c("price").j();
        int iJ5 = zVarT.c("amount").j();
        c cVar = new c();
        cVar.a(iJ);
        cVar.b(iJ2);
        cVar.c(strD2);
        cVar.b(strD3.replaceAll("_", F.a));
        cVar.a(strD4.replaceAll("_", F.a));
        cVar.a(b.values()[iJ3]);
        cVar.e(iJ4);
        cVar.c(iJ5);
        cVar.d(strD);
        return cVar;
    }

    private void a(List<c> list) {
        this.v = 0;
        this.j.show(this.m, b);
        SwingUtilities.invokeLater(() -> {
            if (list.isEmpty()) {
                this.k.a(rs.ui.components.k.a.d);
                this.s.a("No results found.", "No items were found with that name, please try again.");
                this.j.show(this.m, a);
                this.k.a(true);
                return;
            }
            int i = 0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                m mVar = new m(this.o, this.o.a(cVar.f()), cVar.a(), cVar.f(), cVar.i(), cVar.g(), cVar.k(), cVar.j(), cVar.d(), cVar.c());
                int i2 = i;
                i++;
                if (i2 > 0) {
                    JPanel jPanel = new JPanel(new BorderLayout());
                    jPanel.setBackground(rs.gui.d.d);
                    jPanel.setBorder(new EmptyBorder(5, 0, 0, 0));
                    jPanel.add(mVar, "North");
                    this.l.add(jPanel, this.i);
                } else {
                    this.l.add(mVar, this.i);
                }
                this.v++;
                this.i.gridy++;
            }
            this.k.a(true);
            this.r.setEnabled(true);
            this.q.setEnabled(true);
            if (list.isEmpty()) {
                return;
            }
            this.k.a(rs.ui.components.k.a.a);
        });
    }

    private void a(int i, boolean z) {
        if (i < 1) {
            i = 1;
        }
        if (this.v >= 15 || i <= this.u) {
            boolean z2 = this.u != i;
            this.u = i;
            if (z2) {
                this.p.setText("Page " + this.u);
                if (z && a()) {
                    a(false);
                }
            }
        }
    }

    static {
        BufferedImage bufferedImageB = class_12.b((Class<?>) l.class, "back_icon.png");
        BufferedImage bufferedImageB2 = class_12.b((Class<?>) l.class, "fwd_icon.png");
        e = new ImageIcon(bufferedImageB);
        f = new ImageIcon(class_12.a((Image) bufferedImageB, -180));
        g = new ImageIcon(bufferedImageB2);
        h = new ImageIcon(class_12.a((Image) bufferedImageB2, -180));
    }
}

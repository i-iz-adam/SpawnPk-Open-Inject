package rs.plugins.t;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Inject;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import rs.ui.components.u;

/* JADX INFO: loaded from: client-final.jar:rs/s/t/g.class */
public class g extends JPanel {
    private static final String a = "ERROR_PANEL";
    private static final String b = "OFFERS_PANEL";
    private final i g;
    private final ScheduledExecutorService h;
    private GridBagConstraints c = new GridBagConstraints();
    private final CardLayout d = new CardLayout();
    private final JPanel e = new JPanel();
    private final JPanel f = new JPanel(this.d);
    private final ArrayList<d> i = new ArrayList<>();

    @Inject
    public g(ScheduledExecutorService scheduledExecutorService, i iVar) {
        this.g = iVar;
        this.h = scheduledExecutorService;
        setLayout(new BorderLayout());
        setBackground(rs.gui.d.d);
        this.c.fill = 2;
        this.c.weightx = 1.0d;
        this.c.gridx = 0;
        this.c.gridy = 0;
        JPanel jPanel = new JPanel(new BorderLayout());
        jPanel.setBackground(rs.gui.d.d);
        jPanel.add(this.e, "North");
        this.e.setLayout(new GridBagLayout());
        this.e.setBorder(new EmptyBorder(10, 10, 10, 10));
        this.e.setBackground(rs.gui.d.d);
        JScrollPane jScrollPane = new JScrollPane(jPanel);
        jScrollPane.setBackground(rs.gui.d.d);
        jScrollPane.getVerticalScrollBar().setUnitIncrement(8);
        jScrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(12, 0));
        jScrollPane.getVerticalScrollBar().setBorder(new EmptyBorder(0, 5, 0, 0));
        jScrollPane.setVisible(false);
        JPanel jPanel2 = new JPanel(new BorderLayout());
        jPanel2.setBackground(rs.gui.d.d);
        u uVar = new u();
        jPanel2.add(uVar, "North");
        uVar.setBorder(new EmptyBorder(50, 20, 20, 20));
        uVar.a("No listings detected", "No trading post listings were found on your account.");
        this.f.add(jScrollPane, b);
        this.f.add(jPanel2, a);
        add(this.f, "Center");
        a();
    }

    void a() {
        this.e.removeAll();
        this.i.clear();
        c();
    }

    d a(int i) {
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            d dVar = this.i.get(i2);
            if (dVar != null && dVar.a() == i) {
                return dVar;
            }
        }
        return null;
    }

    void b(int i) {
        SwingUtilities.invokeLater(() -> {
            d dVarA = a(i);
            if (dVarA != null) {
                this.e.remove(dVarA);
                this.i.remove(dVarA);
                revalidate();
                repaint();
                c();
            }
        });
    }

    void a(c cVar) {
        this.h.execute(() -> {
            for (int i = 0; i <= 5 && this.g.a(cVar.f()) == null; i++) {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e) {
                }
            }
            SwingUtilities.invokeLater(() -> {
                d dVarA = a(cVar.f());
                if (dVarA == null) {
                    dVarA = new d(this.g);
                    this.i.add(dVarA);
                    this.e.add(dVarA, this.c);
                    this.c.gridy++;
                }
                dVarA.a(cVar);
                b();
                revalidate();
                repaint();
                c();
            });
        });
    }

    private void b() {
        if (this.e.getComponentCount() <= 0) {
            return;
        }
        this.e.getComponent(0).setBorder((Border) null);
    }

    private void c() {
        if (!this.i.isEmpty()) {
            SwingUtilities.invokeLater(() -> {
                this.d.show(this.f, b);
            });
        } else {
            this.e.removeAll();
            SwingUtilities.invokeLater(() -> {
                this.d.show(this.f, a);
            });
        }
    }
}

package rs.plugins.q;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.inject.Inject;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import rs.ui.m;

/* JADX INFO: loaded from: client-final.jar:rs/s/q/b.class */
public class b extends m {
    private final JPanel a;
    private final rs.plugins.q.b.a b;
    private final a c;
    private final d d;

    @Inject
    private b(d dVar, a aVar) {
        super(false);
        this.a = new JPanel();
        this.b = new rs.plugins.q.bpkg.a(d.e.i());
        this.d = dVar;
        this.c = aVar;
        setLayout(new BoxLayout(this, 1));
        setBackground(rs.gui.d.d);
        setBorder(new EmptyBorder(8, 8, 8, 8));
        JPanel jPanel = new JPanel(new BorderLayout());
        add(new rs.plugins.q.bpkg.b("Current Fight", false));
        JPanel jPanel2 = new JPanel(new BorderLayout());
        jPanel2.setMaximumSize(new Dimension(350, (int) jPanel2.getPreferredSize().getHeight()));
        jPanel2.add(this.b, "Center");
        add(jPanel2);
        this.a.setLayout(new BoxLayout(this.a, 1));
        Component jPanel3 = new JPanel(new BorderLayout());
        rs.plugins.q.b.b bVar = new rs.plugins.q.bpkg.b("Fight History (Filter by Usernames):", true);
        add(bVar);
        new JLabel("Filter Usernames:").setHorizontalAlignment(0);
        JTextField jTextField = new JTextField("");
        jPanel3.setMaximumSize(new Dimension(350, (int) jPanel3.getPreferredSize().getHeight()));
        jTextField.getDocument().addDocumentListener(new c(this, dVar, jTextField));
        jPanel3.add(jTextField, "Center");
        add(Box.createRigidArea(new Dimension(0, 4)));
        bVar.add(jPanel3);
        add(bVar);
        add(Box.createRigidArea(new Dimension(0, 4)));
        JScrollPane jScrollPane = new JScrollPane(jPanel);
        jScrollPane.setBackground(rs.gui.d.d);
        jScrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(6, 0));
        jPanel.add(this.a, "North");
        add(Box.createRigidArea(new Dimension(0, 4)));
        add(jScrollPane);
    }

    public void a(rs.plugins.q.apkg.a aVar) {
        if (!this.c.c().isEmpty()) {
            if (this.c.b()) {
                if (!aVar.e().k().toLowerCase().equals(this.c.c())) {
                    return;
                }
            } else if (!aVar.e().k().toLowerCase().startsWith(this.c.c())) {
                return;
            }
        }
        SwingUtilities.invokeLater(() -> {
            this.a.add(new rs.plugins.q.bpkg.a(aVar), 0);
            if (this.a.getComponentCount() > this.c.a()) {
                int componentCount = this.a.getComponentCount() - this.c.a();
                for (int i = 0; i < componentCount && this.a.getComponentCount() > 0; i++) {
                    this.a.remove(this.a.getComponentCount() - 1);
                }
            }
            updateUI();
        });
    }

    public void a(ArrayList<rs.plugins.q.apkg.a> arrayList) {
        if (!this.c.c().isEmpty()) {
            arrayList.removeIf(aVar -> {
                if (this.c.b()) {
                    return !aVar.e().k().toLowerCase().equals(this.c.c());
                }
                return !aVar.e().k().toLowerCase().startsWith(this.c.c());
            });
        }
        SwingUtilities.invokeLater(() -> {
            if (arrayList.size() > this.c.a()) {
                int size = arrayList.size() - this.c.a();
                arrayList.removeIf(aVar2 -> {
                    return arrayList.indexOf(aVar2) < size;
                });
                this.a.removeAll();
            } else {
                int componentCount = (this.a.getComponentCount() - this.c.a()) + arrayList.size();
                if (componentCount > 0) {
                    for (int i = 0; i < componentCount && this.a.getComponentCount() > 0; i++) {
                        this.a.remove(this.a.getComponentCount() - 1);
                    }
                }
            }
            arrayList.forEach(aVar3 -> {
                this.a.add(new rs.plugins.q.bpkg.a(aVar3), 0);
            });
            updateUI();
        });
    }

    public void b() {
        this.a.removeAll();
        if (!this.d.j().isEmpty()) {
            a(new ArrayList<>(this.d.j()));
        }
        SwingUtilities.invokeLater(this::updateUI);
    }

    public rs.plugins.q.b.a c() {
        return this.b;
    }
}

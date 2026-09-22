package rs.ui.components.bpkg;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/b/e.class */
public class e extends JPanel {
    private final JPanel a;
    private final List<a> b;

    public e(JPanel jPanel) {
        this.b = new ArrayList();
        this.a = jPanel;
        if (jPanel != null) {
            this.a.setLayout(new BorderLayout());
        }
        setLayout(new FlowLayout(1, 8, 0));
        setOpaque(false);
    }

    public e() {
        this(null);
    }

    public a a(int i) {
        if (this.b == null || this.b.isEmpty()) {
            return null;
        }
        return this.b.get(i);
    }

    public void a(a aVar) {
        this.b.add(aVar);
        add(aVar, "North");
    }

    public boolean b(a aVar) {
        if (!this.b.contains(aVar) || aVar.d() || !aVar.a()) {
            return false;
        }
        if (this.a != null) {
            this.a.removeAll();
            this.a.add(aVar.c());
            this.a.revalidate();
            this.a.repaint();
        }
        for (a aVar2 : this.b) {
            if (!aVar2.equals(aVar)) {
                aVar2.b();
            }
        }
        return true;
    }
}

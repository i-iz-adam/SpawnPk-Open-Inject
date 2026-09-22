package rs.plugins.t;

import java.awt.BorderLayout;
import javax.inject.Inject;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/* JADX INFO: loaded from: client-final.jar:rs/s/t/h.class */
public class h extends rs.ui.m {
    private final JPanel a;
    private final rs.ui.components.bpkg.e b;
    private final rs.ui.components.b.a c;
    private final l d;
    private final g e;

    @Inject
    h(l lVar, g gVar) {
        super(false);
        this.a = new JPanel();
        this.b = new rs.ui.components.bpkg.e(this.a);
        this.d = lVar;
        this.e = gVar;
        setLayout(new BorderLayout());
        setBackground(rs.gui.d.d);
        rs.ui.components.b.a aVar = new rs.ui.components.bpkg.a("Your Listings", this.b, (JComponent) gVar);
        this.c = new rs.ui.components.bpkg.a("Search", this.b, (JComponent) lVar);
        this.b.setBorder(new EmptyBorder(5, 0, 0, 0));
        this.b.a(aVar);
        this.b.a(this.c);
        this.b.b(aVar);
        add(this.b, "North");
        add(this.a, "Center");
    }

    void b() {
        if (this.d.isShowing()) {
            return;
        }
        this.b.b(this.c);
        revalidate();
    }

    public l c() {
        return this.d;
    }

    public g e() {
        return this.e;
    }
}

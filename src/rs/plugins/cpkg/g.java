package rs.plugins.cpkg;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.inject.Inject;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import rs.class_12;
import rs.plugins.bpkg.q;
import rs.ui.m;

/* JADX INFO: loaded from: client-final.jar:rs/s/c/g.class */
public class g extends m {
    private final d a;
    private final c b;
    private final rs.ui.components.bpkg.e c;
    private final CardLayout d;
    private final JPanel e;
    private final rs.ui.components.bpkg.a f;
    private final rs.ui.components.bpkg.a g;
    private m k;
    private boolean l;
    private boolean m;
    private final q n;

    @Inject
    public g(q qVar, c cVar) {
        super(false);
        this.l = false;
        this.n = qVar;
        this.b = cVar;
        this.c = new rs.ui.components.bpkg.e();
        this.c.setLayout(new GridLayout(1, 0, 7, 7));
        this.c.setBorder(new EmptyBorder(10, 10, 0, 10));
        this.e = new JPanel();
        this.d = new CardLayout();
        this.e.setLayout(this.d);
        setLayout(new BorderLayout());
        add(this.c, "North");
        add(this.e, "Center");
        this.a = c.b;
        this.f = a(this.a, "palette.png", "Recolor models");
        this.g = a(qVar.b(cVar), "interface.png", "Interfaces");
        this.c.b(this.f);
    }

    private rs.ui.components.bpkg.a a(m mVar, String str, String str2) {
        rs.ui.components.bpkg.a aVar = new rs.ui.components.bpkg.a(new ImageIcon(class_12.b((Class<?>) g.class, str)), this.c, (JComponent) null);
        aVar.setToolTipText(str2);
        this.c.a(aVar);
        this.e.add(str, mVar.l());
        aVar.a(() -> {
            a(str, mVar, false);
            return true;
        });
        return aVar;
    }

    private void a(String str, m mVar, boolean z) {
        boolean z2 = this.m;
        m mVar2 = this.k;
        if (this.l) {
            mVar2.K_();
            mVar.J_();
        }
        this.k = mVar;
        this.m = z;
        this.d.show(this.e, str);
        if (z2) {
            this.e.remove(mVar2.l());
        }
        this.e.revalidate();
    }

    @Override // rs.ui.m
    public void J_() {
        this.l = true;
        this.k.J_();
    }

    @Override // rs.ui.m
    public void K_() {
        this.l = false;
        this.k.K_();
    }
}

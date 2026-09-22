package rs.plugins.bpkg;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import rs.class_12;
import rs.eventbus.EventBus;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/w.class */
@Singleton
class w extends rs.ui.m {
    private final rs.ui.components.bpkg.e a;
    private final CardLayout b;
    private final JPanel c;
    private final EventBus d;
    private final q e;
    private final rs.ui.components.b.a f;
    private boolean g;
    private rs.ui.m k;
    private boolean l;

    @Inject
    w(EventBus eventBus, q qVar) {
        super(false);
        this.g = false;
        this.d = eventBus;
        this.a = new rs.ui.components.bpkg.e();
        this.a.setLayout(new GridLayout(1, 0, 7, 7));
        this.a.setBorder(new EmptyBorder(10, 10, 0, 10));
        this.c = new JPanel();
        this.b = new CardLayout();
        this.c.setLayout(this.b);
        setLayout(new BorderLayout());
        add(this.c, "Center");
        this.e = qVar;
        this.c.add(qVar);
        this.f = a(qVar.e(), "config_icon_lg.png", "Configuration");
    }

    private rs.ui.components.b.a a(rs.ui.m mVar, String str, String str2) {
        rs.ui.components.b.a aVar = new rs.ui.components.bpkg.a(new ImageIcon(class_12.b((Class<?>) w.class, str)), this.a, (JComponent) null);
        aVar.setToolTipText(str2);
        this.a.a(aVar);
        this.c.add(str, mVar.l());
        this.d.register(mVar);
        aVar.a(() -> {
            a(str, mVar, false);
            return true;
        });
        return aVar;
    }

    private rs.ui.components.b.a a(Provider<? extends rs.ui.m> provider, String str, String str2) {
        rs.ui.components.b.a aVar = new rs.ui.components.bpkg.a(new ImageIcon(class_12.b((Class<?>) w.class, str)), this.a, (JComponent) null);
        aVar.setToolTipText(str2);
        this.a.a(aVar);
        aVar.a(() -> {
            rs.ui.m mVar = (rs.ui.m) provider.get();
            this.c.add(str, mVar.l());
            this.d.register(mVar);
            a(str, mVar, true);
            return true;
        });
        return aVar;
    }

    private void a(String str, rs.ui.m mVar, boolean z) {
        boolean z2 = this.l;
        rs.ui.m mVar2 = this.k;
        if (this.g) {
            mVar2.K_();
            mVar.J_();
        }
        this.k = mVar;
        this.l = z;
        this.b.show(this.c, str);
        if (z2) {
            this.c.remove(mVar2.l());
            this.d.unregister(mVar2);
        }
        this.c.revalidate();
    }

    @Override // rs.ui.m
    public void J_() {
        this.g = true;
        this.e.J_();
    }

    @Override // rs.ui.m
    public void K_() {
        this.g = false;
        this.e.K_();
    }

    public void a(String str) {
        this.a.b(this.f);
        this.e.b(str);
    }

    public void a(rs.s.a aVar) {
        this.a.b(this.f);
        this.e.a(aVar);
    }

    public void b(String str) {
        this.a.b(this.f);
        this.e.a(str);
    }
}

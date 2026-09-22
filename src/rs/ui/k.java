package rs.ui;

import java.awt.CardLayout;

/* JADX INFO: loaded from: client-final.jar:rs/ui/k.class */
public class k extends m {
    private final CardLayout a;
    private boolean b;
    private m d;
    static final /* synthetic */ boolean c;

    public k(m mVar) {
        super(false);
        this.b = false;
        this.a = new CardLayout();
        setLayout(this.a);
        c(mVar);
    }

    public void b() {
        for (int componentCount = getComponentCount() - 1; componentCount > 0; componentCount--) {
            b((m) getComponent(componentCount));
            remove(componentCount);
        }
    }

    public void c(m mVar) {
        int i = -1;
        for (int componentCount = getComponentCount() - 1; componentCount >= 0; componentCount--) {
            if (getComponent(componentCount) == mVar) {
                i = componentCount;
                break;
            }
        }
        if (this.b) {
            this.d.K_();
            mVar.J_();
        }
        this.d = mVar;
        String str = System.identityHashCode(mVar);
        if (i != -1) {
            for (int componentCount2 = getComponentCount() - 1; componentCount2 > i; componentCount2--) {
                c();
            }
        } else {
            add(mVar, str);
            a(mVar);
        }
        this.a.show(this, str);
        revalidate();
    }

    public void c() {
        int componentCount = getComponentCount();
        if (componentCount <= 1) {
            if (!c) {
                throw new AssertionError("Cannot pop last component");
            }
            return;
        }
        m component = getComponent(componentCount - 2);
        if (this.b) {
            this.d.K_();
            component.J_();
            this.d = component;
        }
        this.a.show(this, System.identityHashCode(component));
        b((m) getComponent(componentCount - 1));
        remove(componentCount - 1);
        revalidate();
    }

    protected void a(m mVar) {
    }

    protected void b(m mVar) {
    }

    @Override // rs.ui.m
    public void J_() {
        this.b = true;
        this.d.J_();
    }

    @Override // rs.ui.m
    public void K_() {
        this.b = false;
        this.d.K_();
    }

    static {
        c = !k.class.desiredAssertionStatus();
    }
}

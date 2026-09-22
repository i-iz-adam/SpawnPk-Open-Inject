package rs.ui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JComponent;

/* JADX INFO: loaded from: client-final.jar:rs/ui/h.class */
class h implements LayoutManager {
    final /* synthetic */ LayoutManager a;
    final /* synthetic */ JComponent b;
    final /* synthetic */ f c;

    h(f fVar, LayoutManager layoutManager, JComponent jComponent) {
        this.c = fVar;
        this.a = layoutManager;
        this.b = jComponent;
    }

    public void addLayoutComponent(String str, Component component) {
        this.a.addLayoutComponent(str, component);
    }

    public void removeLayoutComponent(Component component) {
        this.a.removeLayoutComponent(component);
    }

    public Dimension preferredLayoutSize(Container container) {
        return this.a.preferredLayoutSize(container);
    }

    public Dimension minimumLayoutSize(Container container) {
        return this.a.minimumLayoutSize(container);
    }

    public void layoutContainer(Container container) {
        this.a.layoutContainer(container);
        int i = this.c.r.getPreferredSize().width;
        this.c.r.setBounds((this.b.getWidth() - 75) - i, 0, i, this.b.getHeight());
    }
}

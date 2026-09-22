package rs.ui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;

/* JADX INFO: loaded from: client-final.jar:rs/ui/d.class */
class d implements LayoutManager2 {
    final /* synthetic */ c a;

    d(c cVar) {
        this.a = cVar;
    }

    public void addLayoutComponent(String str, Component component) {
    }

    public void addLayoutComponent(Component component, Object obj) {
    }

    public void removeLayoutComponent(Component component) {
    }

    public Dimension preferredLayoutSize(Container container) {
        return new Dimension(container.getComponentCount() * 27, 23);
    }

    public Dimension minimumLayoutSize(Container container) {
        return preferredLayoutSize(container);
    }

    public Dimension maximumLayoutSize(Container container) {
        return preferredLayoutSize(container);
    }

    public float getLayoutAlignmentX(Container container) {
        return 0.0f;
    }

    public float getLayoutAlignmentY(Container container) {
        return 0.0f;
    }

    public void invalidateLayout(Container container) {
    }

    public void layoutContainer(Container container) {
        int i = 0;
        for (Component component : container.getComponents()) {
            int i2 = i + 4;
            int i3 = component.getPreferredSize().height;
            if (i3 > 23) {
                i3 = 23;
            }
            component.setBounds(i2, (23 - i3) / 2, 23, i3);
            i = i2 + 23;
        }
    }
}

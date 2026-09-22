package rs.ui.components;

import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.dnd.DragSource;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JLayeredPane;
import javax.swing.SwingUtilities;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/g.class */
public class g extends JLayeredPane {
    private Point b;
    private Component c;
    private int d = 0;
    private int e = -1;
    private final List<c> f = new ArrayList(0);
    static final /* synthetic */ boolean a;

    /* JADX INFO: loaded from: client-final.jar:rs/ui/components/g$a.class */
    private class a extends BoxLayout {
        private a() {
            super(g.this, 1);
        }

        public void layoutContainer(Container container) {
            if (g.this.c == null) {
                super.layoutContainer(container);
                return;
            }
            Point location = g.this.c.getLocation();
            g.this.setLayer(g.this.c, JLayeredPane.DEFAULT_LAYER.intValue(), g.this.e);
            g.this.revalidate();
            super.layoutContainer(container);
            g.this.setLayer(g.this.c, JLayeredPane.DRAG_LAYER.intValue());
            g.this.c.setLocation(location);
        }
    }

    /* JADX INFO: loaded from: client-final.jar:rs/ui/components/g$b.class */
    private class b extends MouseAdapter {
        private b() {
        }

        public void mousePressed(MouseEvent mouseEvent) {
            if (!SwingUtilities.isLeftMouseButton(mouseEvent) || g.this.getComponentCount() <= 1) {
                return;
            }
            g.this.b = mouseEvent.getPoint();
        }

        public void mouseDragged(MouseEvent mouseEvent) {
            if (!SwingUtilities.isLeftMouseButton(mouseEvent) || g.this.b == null) {
                return;
            }
            Point point = mouseEvent.getPoint();
            if (g.this.c != null) {
                g.this.b(point);
            } else if (point.distance(g.this.b) > DragSource.getDragThreshold()) {
                g.this.a(point);
            }
        }

        public void mouseReleased(MouseEvent mouseEvent) {
            if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
                g.this.a();
            }
        }
    }

    /* JADX INFO: loaded from: client-final.jar:rs/ui/components/g$c.class */
    @FunctionalInterface
    public interface c {
        void a(Component component);
    }

    public g() {
        setLayout(new a());
        b bVar = new b();
        addMouseListener(bVar);
        addMouseMotionListener(bVar);
    }

    public void setLayout(LayoutManager layoutManager) {
        if (layoutManager != null && !(layoutManager instanceof a)) {
            throw new IllegalArgumentException("DragAndDropReorderPane only supports DragAndDropReorderLayoutManager");
        }
        super.setLayout(layoutManager);
    }

    public void a(c cVar) {
        this.f.add(cVar);
    }

    public void b(c cVar) {
        this.f.remove(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Point point) {
        this.c = d(this.b);
        if (this.c == null) {
            this.b = null;
            return;
        }
        this.d = SwingUtilities.convertPoint(this, this.b, this.c).y;
        this.e = getPosition(this.c);
        setLayer(this.c, DRAG_LAYER.intValue());
        c(point);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Point point) {
        int i;
        c(point);
        Component componentA = a(this.c.getBounds());
        if (componentA != null) {
            if (!a && componentA == this.c) {
                throw new AssertionError();
            }
            int y = componentA.getY() + (componentA.getHeight() / 2);
            int position = getPosition(componentA);
            boolean z = position < this.e;
            if (z && this.c.getY() < y) {
                i = position;
            } else if (z || this.c.getY() + this.c.getHeight() <= y) {
                return;
            } else {
                i = position + 1;
            }
            if (!a && i == this.e) {
                throw new AssertionError();
            }
            this.e = i;
            revalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.c != null) {
            Component component = this.c;
            setLayer(this.c, DEFAULT_LAYER.intValue(), this.e);
            this.c = null;
            this.d = 0;
            this.e = -1;
            revalidate();
            this.f.forEach(cVar -> {
                cVar.a(component);
            });
        }
        this.b = null;
    }

    private void c(Point point) {
        this.c.setLocation(new Point(0, Math.min(Math.max(point.y - this.d, 0), getHeight() - this.c.getHeight())));
    }

    private Component d(Point point) {
        for (Component component : getComponentsInLayer(DEFAULT_LAYER.intValue())) {
            if (component.contains(point.x - component.getX(), point.y - component.getY())) {
                return component;
            }
        }
        return null;
    }

    private Component a(Rectangle rectangle) {
        for (Component component : getComponentsInLayer(DEFAULT_LAYER.intValue())) {
            if (rectangle.intersects(component.getBounds())) {
                return component;
            }
        }
        return null;
    }

    static {
        a = !g.class.desiredAssertionStatus();
    }
}

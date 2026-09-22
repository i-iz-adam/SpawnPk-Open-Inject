package rs.ui.components;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/r.class */
public class r extends MouseAdapter {
    private final Component a;

    public r(Component component) {
        this.a = component;
    }

    public void mousePressed(MouseEvent mouseEvent) {
        a(mouseEvent);
    }

    public void mouseDragged(MouseEvent mouseEvent) {
        a(mouseEvent);
    }

    public void mouseReleased(MouseEvent mouseEvent) {
        a(mouseEvent);
    }

    private void a(MouseEvent mouseEvent) {
        if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
            this.a.dispatchEvent(SwingUtilities.convertMouseEvent((Component) mouseEvent.getSource(), mouseEvent, this.a));
        }
    }
}

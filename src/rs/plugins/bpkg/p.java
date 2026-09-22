package rs.plugins.bpkg;

import java.awt.Color;
import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/p.class */
class p extends MouseAdapter {
    private Color c;
    final /* synthetic */ JPopupMenu a;
    final /* synthetic */ JLabel b;

    p(JPopupMenu jPopupMenu, JLabel jLabel) {
        this.a = jPopupMenu;
        this.b = jLabel;
    }

    public void mouseClicked(MouseEvent mouseEvent) {
        Component component = (Component) mouseEvent.getSource();
        Point location = MouseInfo.getPointerInfo().getLocation();
        SwingUtilities.convertPointFromScreen(location, component);
        this.a.show(component, location.x, location.y);
    }

    public void mouseEntered(MouseEvent mouseEvent) {
        this.c = this.b.getForeground();
        this.b.setForeground(rs.gui.d.a);
    }

    public void mouseExited(MouseEvent mouseEvent) {
        this.b.setForeground(this.c);
    }
}

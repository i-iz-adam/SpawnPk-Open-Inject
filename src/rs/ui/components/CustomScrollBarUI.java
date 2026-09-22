package rs.ui.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicScrollBarUI;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/CustomScrollBarUI.class */
public class CustomScrollBarUI extends BasicScrollBarUI {
    private Color a = rs.gui.d.e;
    private Color b = rs.gui.d.o;

    protected void paintTrack(Graphics graphics, JComponent jComponent, Rectangle rectangle) {
        graphics.setColor(this.b);
        graphics.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    protected void paintThumb(Graphics graphics, JComponent jComponent, Rectangle rectangle) {
        graphics.setColor(this.a);
        graphics.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    protected JButton a() {
        JButton jButton = new JButton();
        Dimension dimension = new Dimension(0, 0);
        jButton.setPreferredSize(dimension);
        jButton.setMinimumSize(dimension);
        jButton.setMaximumSize(dimension);
        return jButton;
    }

    public static ComponentUI createUI(JComponent jComponent) {
        JScrollBar jScrollBar = (JScrollBar) jComponent;
        jScrollBar.setUnitIncrement(16);
        jScrollBar.setPreferredSize(new Dimension(7, 7));
        return new CustomScrollBarUI();
    }

    protected JButton createDecreaseButton(int i) {
        return a();
    }

    protected JButton createIncreaseButton(int i) {
        return a();
    }

    public void a(Color color) {
        this.a = color;
    }

    public void b(Color color) {
        this.b = color;
    }
}

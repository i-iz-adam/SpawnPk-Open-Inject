package rs;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.FocusListener;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_70.class */
public final class class_70 extends Canvas {
    Component a;
    private static boolean b;

    public class_70(Component component) {
        this.a = component;
    }

    public void update(Graphics graphics) {
        this.a.update(graphics);
    }

    public void paint(Graphics graphics) {
        this.a.paint(graphics);
    }

    public void removeFocusListener(FocusListener focusListener) {
        super.removeFocusListener(focusListener);
        b = !hasFocus();
    }

    public void requestFocus() {
        if (b) {
            return;
        }
        requestFocusInWindow();
    }

    public void setSize(int i, int i2) {
        if (Launcher.n().o().aw()) {
            super.setSize(Launcher.n().o().aD().width, Launcher.n().o().aD().height);
        } else {
            super.setSize(i, i2);
        }
    }

    public void setLocation(int i, int i2) {
        super.setLocation(i, i2);
    }
}

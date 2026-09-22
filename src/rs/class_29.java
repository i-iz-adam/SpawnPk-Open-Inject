package rs;

import java.awt.Cursor;
import java.awt.Graphics;
import javax.swing.JFrame;

/* JADX INFO: loaded from: client-final.jar:rs/class_29.class */
public final class class_29 extends JFrame {
    private final class_27 a;

    public class_29(class_27 class_27Var) {
        this.a = class_27Var;
    }

    public class_29(class_27 class_27Var, int i, int i2) {
        this.a = class_27Var;
        setTitle("Jagex");
        setResizable(true);
        setFocusTraversalKeysEnabled(false);
        setVisible(true);
        toFront();
        setSize(i + 8, i2 + 28);
    }

    public Graphics getGraphics() {
        return super.getGraphics();
    }

    public void update(Graphics graphics) {
        super.update(graphics);
        this.a.update(graphics);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        this.a.paint(graphics);
    }

    public void setCursor(Cursor cursor) {
        if (Configuration.ai == class_151.b) {
            super.setCursor(cursor);
        } else {
            super.setCursor(Cursor.getDefaultCursor());
        }
    }
}

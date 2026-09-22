package rs.ui.components.apkg;

import java.awt.Color;
import java.awt.Graphics;
import java.util.function.Consumer;
import javax.swing.JPanel;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a/h.class */
public class h extends JPanel {
    static final int a = 4;
    private static final int b = 14;
    private static final Color c = new Color(20, 20, 20);
    private static final Color d = new Color(150, 150, 150);
    private int e = 259;
    private Consumer<Integer> f;

    h() {
        addMouseMotionListener(new i(this));
        addMouseListener(new j(this));
    }

    public void a(int i) {
        a(i + 4, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, boolean z) {
        this.e = com.google.a.m.l.a(i, 4, 259);
        paintImmediately(0, 0, getWidth(), getHeight());
        if (!z || this.f == null) {
            return;
        }
        this.f.accept(Integer.valueOf(a()));
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.setColor(c);
        graphics.fillRect(0, (getHeight() / 2) - 2, 263, 5);
        graphics.setColor(d);
        graphics.fillRect(this.e - 2, (getHeight() / 2) - 7, 4, 14);
    }

    int a() {
        return this.e - 4;
    }

    public void a(Consumer<Integer> consumer) {
        this.f = consumer;
    }
}

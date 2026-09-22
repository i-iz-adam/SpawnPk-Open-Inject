package rs;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/* JADX INFO: loaded from: client-final.jar:rs/class_6.class */
public class class_6 extends BufferedImage {
    private final List<Runnable> a;
    private boolean b;

    public class_6(int i, int i2, int i3) {
        super(i, i2, i3);
        this.a = new ArrayList();
    }

    public synchronized void a() {
        this.b = true;
        Iterator<Runnable> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.a.clear();
    }

    public synchronized void a(Runnable runnable) {
        if (!this.b) {
            this.a.add(runnable);
        } else {
            Objects.requireNonNull(runnable);
            class_166.a(runnable::run);
        }
    }

    public void a(JButton jButton) {
        jButton.setIcon(a((JComponent) jButton));
    }

    public void a(JLabel jLabel) {
        jLabel.setIcon(a((JComponent) jLabel));
    }

    private ImageIcon a(JComponent jComponent) {
        synchronized (this) {
            if (!this.b) {
                this.a.add(() -> {
                    Objects.requireNonNull(jComponent);
                    SwingUtilities.invokeLater(jComponent::repaint);
                });
            }
        }
        return new ImageIcon(this);
    }
}

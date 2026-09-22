package rs;

import java.awt.event.KeyEvent;
import java.util.function.Supplier;

/* JADX INFO: loaded from: client-final.jar:rs/class_11.class */
public abstract class class_11 implements class_159 {
    private final Supplier<rs.plugins.bpkg.l> a;
    private boolean b = false;
    private boolean c = false;
    private boolean d;

    @Override // rs.class_159
    public boolean L_() {
        return this.d;
    }

    public void keyTyped(KeyEvent keyEvent) {
        if (this.c) {
            keyEvent.consume();
        }
    }

    public void keyPressed(KeyEvent keyEvent) {
        if (this.a.get().a(keyEvent)) {
            boolean z = this.b;
            this.b = true;
            if (!z) {
                b();
            }
            if (rs.plugins.bpkg.l.a(keyEvent.getKeyCode()) == null) {
                this.c = true;
                keyEvent.consume();
            }
        }
    }

    public void keyReleased(KeyEvent keyEvent) {
        if (this.a.get().a(keyEvent) && this.b) {
            this.b = false;
            this.c = false;
            c();
        }
    }

    public void b() {
    }

    public void c() {
    }

    public class_11(Supplier<rs.plugins.bpkg.l> supplier) {
        this.a = supplier;
    }

    public void a(boolean z) {
        this.d = z;
    }
}

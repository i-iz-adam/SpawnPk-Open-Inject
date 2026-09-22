package rs.plugins.bpkg;

import java.awt.event.KeyEvent;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/m.class */
public class m extends l {
    static final /* synthetic */ boolean f;

    public m(int i, int i2) {
        super(i, i2, true);
    }

    public m(KeyEvent keyEvent) {
        this(keyEvent.getExtendedKeyCode(), keyEvent.getModifiersEx());
        if (!f && !a(keyEvent)) {
            throw new AssertionError();
        }
    }

    @Override // rs.plugins.bpkg.l
    public boolean a(KeyEvent keyEvent) {
        return a(keyEvent, true);
    }

    static {
        f = !m.class.desiredAssertionStatus();
    }
}

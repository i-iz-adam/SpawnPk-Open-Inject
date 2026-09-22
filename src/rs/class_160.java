package rs;

import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: client-final.jar:rs/class_160.class */
@Singleton
public class class_160 {
    private static final Logger a = LoggerFactory.getLogger((Class<?>) class_160.class);
    private final Client b;
    private final List<class_159> c = new CopyOnWriteArrayList();

    @Inject
    private class_160(@Nullable Client client) {
        this.b = client;
    }

    public void a(class_159 class_159Var) {
        if (this.c.contains(class_159Var)) {
            return;
        }
        a.debug("Registering key listener: {}", class_159Var);
        this.c.add(class_159Var);
    }

    public void b(class_159 class_159Var) {
        if (this.c.remove(class_159Var)) {
            a.debug("Unregistered key listener: {}", class_159Var);
        }
    }

    public void a(KeyEvent keyEvent) {
        if (keyEvent.isConsumed()) {
            return;
        }
        for (class_159 class_159Var : this.c) {
            if (c(class_159Var)) {
                a.trace("Processing key pressed {} for key listener {}", keyEvent.paramString(), class_159Var);
                class_159Var.keyPressed(keyEvent);
                if (keyEvent.isConsumed()) {
                    a.debug("Consuming key pressed {} for key listener {}", keyEvent.paramString(), class_159Var);
                    return;
                }
            }
        }
    }

    public void b(KeyEvent keyEvent) {
        if (keyEvent.isConsumed()) {
            return;
        }
        for (class_159 class_159Var : this.c) {
            if (c(class_159Var)) {
                a.trace("Processing key released {} for key listener {}", keyEvent.paramString(), class_159Var);
                class_159Var.keyReleased(keyEvent);
                if (keyEvent.isConsumed()) {
                    a.debug("Consuming key released {} for listener {}", keyEvent.paramString(), class_159Var);
                    return;
                }
            }
        }
    }

    public void c(KeyEvent keyEvent) {
        if (keyEvent.isConsumed()) {
            return;
        }
        for (class_159 class_159Var : this.c) {
            if (c(class_159Var)) {
                a.trace("Processing key typed {} for key listener {}", keyEvent.paramString(), class_159Var);
                class_159Var.keyTyped(keyEvent);
                if (keyEvent.isConsumed()) {
                    a.debug("Consuming key typed {} for key listener {}", keyEvent.paramString(), class_159Var);
                    return;
                }
            }
        }
    }

    private boolean c(class_159 class_159Var) {
        return this.b == null ? true : true;
    }
}

package rs.ui.components.apkg;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.awt.Color;
import java.awt.Window;
import java.awt.event.WindowEvent;
import rs.class_139;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a/d.class */
@Singleton
public class d {
    private final class_139 a;
    private q b;

    public q a(Window window, Color color, String str, boolean z) {
        if (this.b != null) {
            this.b.dispatchEvent(new WindowEvent(this.b, 201));
        }
        this.b = new q(window, color, str, z, this.a, this);
        if (this.b.isAlwaysOnTopSupported() && window != null) {
            this.b.setAlwaysOnTop(window.isAlwaysOnTop());
        }
        return this.b;
    }

    @Inject
    public d(class_139 class_139Var) {
        this.a = class_139Var;
    }

    void a(q qVar) {
        this.b = qVar;
    }

    q a() {
        return this.b;
    }
}

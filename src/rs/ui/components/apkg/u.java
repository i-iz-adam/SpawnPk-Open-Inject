package rs.ui.components.apkg;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Objects;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a/u.class */
class u extends WindowAdapter {
    final /* synthetic */ Color a;
    final /* synthetic */ o b;
    final /* synthetic */ d c;
    final /* synthetic */ q d;

    u(q qVar, Color color, o oVar, d dVar) {
        this.d = qVar;
        this.a = color;
        this.b = oVar;
        this.c = dVar;
    }

    public void windowClosing(WindowEvent windowEvent) {
        this.d.d();
        if (this.d.q != null) {
            this.d.q.accept(this.d.o);
        }
        if (!Objects.equals(this.a, this.d.o)) {
            this.b.a(this.d.o.getRGB());
        }
        if (Objects.equals(this.c.a(), this.d)) {
            this.c.a(null);
        }
    }
}

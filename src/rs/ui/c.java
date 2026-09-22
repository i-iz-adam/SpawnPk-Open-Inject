package rs.ui;

import com.google.a.d.ag;
import java.awt.Component;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JPanel;

/* JADX INFO: loaded from: client-final.jar:rs/ui/c.class */
class c extends JPanel {
    private static final int a = 23;
    private static final int b = 4;
    private final Map<l, Component> c = new TreeMap((lVar, lVar2) -> {
        return ag.a().a(lVar.i(), lVar2.i()).a(lVar.d(), lVar2.d()).b();
    });

    c() {
        setLayout(new d(this));
    }

    void a(l lVar, Component component) {
        if (this.c.put(lVar, component) == null) {
            a();
        }
    }

    void a(l lVar) {
        if (this.c.remove(lVar) != null) {
            a();
        }
    }

    private void a() {
        removeAll();
        this.c.values().forEach(this::add);
        repaint();
    }
}

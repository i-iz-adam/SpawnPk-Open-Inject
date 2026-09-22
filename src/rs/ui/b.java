package rs.ui;

import com.google.a.d.ag;
import java.awt.Component;
import java.awt.Dimension;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.Box;
import javax.swing.JToolBar;

/* JADX INFO: loaded from: client-final.jar:rs/ui/b.class */
public class b extends JToolBar {
    private static final int a = 36;
    private static final int b = 503;
    private final Map<l, Component> c;

    b() {
        super(1);
        this.c = new TreeMap((lVar, lVar2) -> {
            return ag.a().a(lVar.c(), lVar2.c()).a(lVar.i(), lVar2.i()).a(lVar.d(), lVar2.d()).b();
        });
        setFloatable(false);
        setSize(new Dimension(36, 503));
        setMinimumSize(new Dimension(36, 503));
        setPreferredSize(new Dimension(36, 503));
        setMaximumSize(new Dimension(36, Integer.MAX_VALUE));
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
        boolean z = false;
        for (Map.Entry<l, Component> entry : this.c.entrySet()) {
            if (!entry.getKey().c() && !z) {
                z = true;
                add(Box.createVerticalGlue());
                addSeparator();
            }
            add(entry.getValue());
        }
        repaint();
    }
}

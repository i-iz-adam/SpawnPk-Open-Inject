package rs.plugins.t;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import rs.class_169;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/s/t/f.class */
class f implements class_169 {
    int a = 0;
    final /* synthetic */ c b;
    final /* synthetic */ d c;

    f(d dVar, c cVar) {
        this.c = dVar;
        this.b = cVar;
    }

    @Override // rs.class_169
    public boolean loop() {
        if (!Launcher.n().o().fc) {
            return false;
        }
        int i = this.a;
        this.a = i + 1;
        if (i >= 3) {
            return false;
        }
        Image imageA = this.c.f.a(this.b.f());
        if (imageA == null) {
            return true;
        }
        SwingUtilities.invokeLater(() -> {
            this.c.i.setIcon(new ImageIcon(imageA));
        });
        return false;
    }
}

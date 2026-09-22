package rs.plugins.bpkg;

import javax.swing.JButton;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/i.class */
public class i extends JButton {
    private l a;

    public i(l lVar, boolean z) {
        setFont(rs.gui.w.d().deriveFont(12.0f));
        a(lVar);
        addMouseListener(new j(this));
        addKeyListener(new k(this, z));
    }

    public void a(l lVar) {
        if (lVar == null) {
            lVar = l.a;
        }
        this.a = lVar;
        setText(lVar.toString());
    }

    public l a() {
        return this.a;
    }
}

package rs.gui.bpkg.apkg;

import javax.swing.Icon;
import javax.swing.JButton;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/g.class */
public class g extends JButton {
    private final rs.gui.bpkg.d a;

    public g(Icon icon, rs.gui.bpkg.d dVar) {
        super("", icon);
        this.a = dVar;
        addActionListener(new h(this));
    }

    public void a() {
        y yVar = new y(this.a, "Name Your Loadout", "Create");
        yVar.a(new i(this, yVar));
        yVar.setVisible(true);
    }
}

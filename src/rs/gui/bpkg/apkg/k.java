package rs.gui.bpkg.apkg;

import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.ListCellRenderer;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/k.class */
public class k extends JComboBox<String> {
    private final ListCellRenderer<Enum<?>> a;
    private final rs.gui.bpkg.d b;

    public k(rs.gui.bpkg.d dVar, String[] strArr) {
        super(strArr);
        this.a = new rs.ui.components.c();
        this.b = dVar;
        setRenderer(new f(dVar, this));
        setInheritsPopupMenu(true);
        setPreferredSize(new Dimension(150, 25));
        a();
    }

    private void a() {
        addPopupMenuListener(new l(this));
        addActionListener(new m(this));
    }
}

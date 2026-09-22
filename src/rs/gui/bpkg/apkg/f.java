package rs.gui.bpkg.apkg;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/f.class */
class f extends DefaultListCellRenderer {
    private final rs.gui.bpkg.d a;
    private final k b;

    public f(rs.gui.bpkg.d dVar, k kVar) {
        setOpaque(true);
        this.b = kVar;
        this.a = dVar;
    }

    public Component getListCellRendererComponent(JList jList, Object obj, int i, boolean z, boolean z2) {
        jList.setSelectionBackground(rs.gui.d.d);
        JLabel listCellRendererComponent = super.getListCellRendererComponent(jList, obj, i, z, z2);
        rs.gui.bpkg.a aVar = null;
        if (i >= 0) {
            if (this.a.d() != null && i < this.a.d().size() && this.a.d().get(i) != null) {
                aVar = this.a.d().get(i);
            }
        } else if (this.b.getSelectedIndex() >= 0 && this.a.d() != null && this.b.getSelectedIndex() < this.a.d().size() && this.a.d().get(this.b.getSelectedIndex()) != null) {
            aVar = this.a.d().get(this.b.getSelectedIndex());
        }
        if (aVar != null) {
            listCellRendererComponent.setForeground(aVar.j());
            if (aVar.k() != null) {
                listCellRendererComponent.setIcon(aVar.k().a());
            }
        }
        return listCellRendererComponent;
    }
}

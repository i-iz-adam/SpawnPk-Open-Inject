package rs.gui.bpkg.apkg;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import org.pushingpixels.substance.internal.contrib.jgoodies.looks.Options;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/j.class */
class j extends DefaultListCellRenderer {
    private final JComboBox a;

    public j(JComboBox jComboBox) {
        setOpaque(true);
        this.a = jComboBox;
    }

    public Component getListCellRendererComponent(JList jList, Object obj, int i, boolean z, boolean z2) {
        JLabel listCellRendererComponent = super.getListCellRendererComponent(jList, obj, i, z, z2);
        int selectedIndex = i > 0 ? i : this.a.getSelectedIndex();
        if (listCellRendererComponent.getText().startsWith(Options.TREE_LINE_STYLE_NONE_VALUE)) {
            return listCellRendererComponent;
        }
        if (selectedIndex > 0) {
            listCellRendererComponent.setIcon(rs.gui.bpkg.e.values()[selectedIndex - 1].a());
        } else {
            listCellRendererComponent.setIcon((Icon) null);
        }
        return listCellRendererComponent;
    }
}

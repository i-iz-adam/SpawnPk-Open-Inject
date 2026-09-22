package rs.gui.bpkg.apkg;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;

/* JADX INFO: loaded from: client-final.jar:rs/gui/b/a/e.class */
class e extends DefaultListCellRenderer {
    private static final long b = -1;
    private Color[] c;
    private String[] d;
    JComboBox a;

    public e(JComboBox jComboBox) {
        this.a = jComboBox;
        setOpaque(true);
    }

    public void a(Color[] colorArr) {
        this.c = colorArr;
    }

    public void a(String[] strArr) {
        this.d = strArr;
    }

    public Color[] a() {
        return this.c;
    }

    public String[] b() {
        return this.d;
    }

    public Component getListCellRendererComponent(JList jList, Object obj, int i, boolean z, boolean z2) {
        if (this.c.length != this.d.length) {
            System.out.println("colors.length does not equal strings.length");
            return this;
        }
        if (this.c == null) {
            System.out.println("use setColors first.");
            return this;
        }
        if (this.d == null) {
            System.out.println("use setStrings first.");
            return this;
        }
        JLabel listCellRendererComponent = super.getListCellRendererComponent(jList, obj, i, z, z2);
        if (i == -1) {
            listCellRendererComponent.setForeground(this.c[this.a.getSelectedIndex()]);
        } else {
            listCellRendererComponent.setForeground(this.c[i]);
        }
        return listCellRendererComponent;
    }
}

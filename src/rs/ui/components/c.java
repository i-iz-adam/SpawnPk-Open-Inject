package rs.ui.components;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;
import rs.class_23;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/c.class */
public final class c<T> extends JLabel implements ListCellRenderer<T> {
    /* JADX WARN: Multi-variable type inference failed */
    public Component getListCellRendererComponent(JList<? extends T> jList, T t, int i, boolean z, boolean z2) {
        if (z) {
            setBackground(rs.gui.d.d);
            setForeground(Color.WHITE);
        } else {
            setBackground(jList.getBackground());
            setForeground(rs.gui.d.f);
        }
        setBorder(new EmptyBorder(5, 5, 5, 0));
        setText(t instanceof Enum ? class_23.a((Enum) t) : t.toString());
        return this;
    }
}

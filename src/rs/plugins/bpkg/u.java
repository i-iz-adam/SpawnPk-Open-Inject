package rs.plugins.bpkg;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import rs.class_12;
import rs.gui.M;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/u.class */
class u extends JToggleButton {
    private static final ImageIcon a;
    private static final ImageIcon b;
    private String c;

    public u() {
        super(b);
        this.c = "";
        setSelectedIcon(a);
        M.a((AbstractButton) this);
        setPreferredSize(new Dimension(25, 0));
        addItemListener(itemEvent -> {
            a();
        });
        a();
    }

    private void a() {
        setToolTipText(isSelected() ? "Disable plugin" : "<html>Enable plugin" + this.c);
    }

    public void a(List<String> list) {
        if (list == null || list.isEmpty()) {
            this.c = "";
        } else {
            StringBuilder sb = new StringBuilder("<br>Plugin conflicts: ");
            for (int i = 0; i < list.size() - 2; i++) {
                sb.append(list.get(i));
                sb.append(", ");
            }
            if (list.size() >= 2) {
                sb.append(list.get(list.size() - 2));
                sb.append(" and ");
            }
            sb.append(list.get(list.size() - 1));
            this.c = sb.toString();
        }
        a();
    }

    static {
        BufferedImage bufferedImageB = class_12.b((Class<?>) a.class, "switcher_on.png");
        a = new ImageIcon(bufferedImageB);
        b = new ImageIcon(class_12.a(class_12.b((Image) class_12.a(bufferedImageB), 0.61f), true, false));
    }
}

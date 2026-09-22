package rs.ui.components.apkg;

import com.google.a.d.aN;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.function.Consumer;
import javax.swing.JPanel;
import rs.class_139;
import rs.class_23;
import rs.class_9;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a/o.class */
final class o {
    private static final String a = "recentColors";
    private static final int b = 16;
    private static final int c = 16;
    private final aN<String> d = aN.a(16);
    private final class_139 e;

    o(class_139 class_139Var) {
        this.e = class_139Var;
    }

    private void a() {
        String strA = this.e.a("colorpicker", a);
        if (strA != null) {
            this.d.addAll(class_23.a(strA));
        }
    }

    void a(String str) {
        if (class_9.c(str) == null) {
            return;
        }
        this.d.remove(str);
        this.d.add(str);
        this.e.b("colorpicker", a, class_23.a(this.d));
    }

    JPanel a(Consumer<Color> consumer, boolean z) {
        a();
        JPanel jPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.insets = new Insets(0, 1, 4, 2);
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = 17;
        for (String str : this.d) {
            if (gridBagConstraints.gridx == 8) {
                gridBagConstraints.gridy++;
                gridBagConstraints.gridx = 0;
            }
            if (jPanel.getComponentCount() == this.d.size() - 1) {
                gridBagConstraints.weightx = 1.0d;
                gridBagConstraints.gridwidth = 8 - gridBagConstraints.gridx;
            }
            jPanel.add(a(class_9.c(str), consumer, z), gridBagConstraints);
            gridBagConstraints.gridx++;
        }
        return jPanel;
    }

    private static JPanel a(Color color, Consumer<Color> consumer, boolean z) {
        JPanel jPanel = new JPanel();
        String strC = z ? class_9.c(color) : class_9.d(color);
        jPanel.setBackground(color);
        jPanel.setOpaque(true);
        jPanel.setPreferredSize(new Dimension(16, 16));
        jPanel.setToolTipText("#" + strC.toUpperCase());
        jPanel.addMouseListener(new p(consumer, color));
        return jPanel;
    }
}

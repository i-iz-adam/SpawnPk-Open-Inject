package rs.ui.components;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/u.class */
public class u extends JPanel {
    private final JLabel a = new rs.ui.components.shadowlabel.a();
    private final JLabel b = new rs.ui.components.shadowlabel.a();

    public u() {
        setOpaque(false);
        setBorder(new EmptyBorder(50, 10, 0, 10));
        setLayout(new BorderLayout());
        this.a.setForeground(Color.WHITE);
        this.a.setHorizontalAlignment(0);
        this.b.setFont(rs.gui.w.b());
        this.b.setForeground(Color.GRAY);
        this.b.setHorizontalAlignment(0);
        add(this.a, "North");
        add(this.b, "Center");
        setVisible(false);
    }

    public void a(String str, String str2) {
        this.a.setText(str);
        this.b.setText("<html><body style = 'text-align:center'>" + str2 + "</body></html>");
        setVisible(true);
    }
}

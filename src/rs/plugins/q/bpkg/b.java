package rs.plugins.q.bpkg;

import com.google.a.l.c;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import rs.gui.d;

/* JADX INFO: loaded from: client-final.jar:rs/s/q/b/b.class */
public class b extends JPanel {
    public b(String str, boolean z) {
        setLayout(new GridLayout(z ? 2 : 1, 1));
        setBorder(new EmptyBorder(4, 6, 4, 6));
        setBackground(d.c);
        JPopupMenu jPopupMenu = new JPopupMenu();
        new JMenuItem("Copy Fight History Data").addActionListener(actionEvent -> {
            rs.plugins.q.d.e.g();
        });
        new JMenuItem("Import Fight History Data").addActionListener(actionEvent2 -> {
            String strShowInputDialog = JOptionPane.showInputDialog(this, "Enter the fight history data you wish to import:", "Import Fight History", 1);
            if (strShowInputDialog == null || strShowInputDialog.length() < 2) {
                return;
            }
            rs.plugins.q.d.e.b(strShowInputDialog);
        });
        JMenuItem jMenuItem = new JMenuItem("Remove All Fights");
        jMenuItem.addActionListener(actionEvent3 -> {
            if (JOptionPane.showConfirmDialog(this, "Are you sure you want to reset all fight history data? This cannot be undone.", c.g, 0) == 0) {
                rs.plugins.q.d.e.h();
            }
        });
        jPopupMenu.add(jMenuItem);
        if (z) {
            setComponentPopupMenu(jPopupMenu);
        }
        JLabel jLabel = new JLabel();
        jLabel.setText(str);
        jLabel.setHorizontalAlignment(0);
        jLabel.setForeground(Color.WHITE);
        add(jLabel);
        setMaximumSize(new Dimension(350, (int) getPreferredSize().getHeight()));
    }
}

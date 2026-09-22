package rs.plugins.gpkg;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import rs.ClientThread;
import rs.ItemComposition;
import rs.gui.Launcher;
import rs.gui.d;
import rs.ui.m;

/* JADX INFO: loaded from: client-final.jar:rs/s/g/a.class */
public class a extends m {
    private JScrollPane b;
    private AtomicBoolean a = new AtomicBoolean(false);
    private final JTextArea c = new JTextArea();
    private final JTextField d = new JTextField();

    public void b() {
        getParent().setLayout(new BorderLayout());
        getParent().add(this, "Center");
        setLayout(new BorderLayout());
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout(5, 5));
        jPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        jPanel.setBackground(d.d);
        this.c.setBackground(d.a);
        this.c.setEditable(false);
        this.b = new JScrollPane(this.c);
        this.b.getVerticalScrollBar().setPreferredSize(new Dimension(12, 0));
        this.b.getVerticalScrollBar().setBorder(new EmptyBorder(0, 5, 0, 0));
        JPanel jPanel2 = new JPanel();
        this.d.setPreferredSize(new Dimension(200, 25));
        this.d.addActionListener(actionEvent -> {
            c();
        });
        JButton jButton = new JButton("Search");
        jButton.addActionListener(actionEvent2 -> {
            c();
        });
        jPanel2.add(this.d);
        jPanel2.add(jButton);
        jPanel.add(jPanel2, "North");
        jPanel.add(this.b, "Center");
        add(jPanel);
    }

    private void c() {
        if (this.a.get()) {
            return;
        }
        if (ItemComposition.ad == 0) {
            JOptionPane.showMessageDialog((Component) null, "Please wait until the client has loaded the item database!");
            return;
        }
        if (this.d.getText().length() < 3) {
            JOptionPane.showMessageDialog((Component) null, "Please have at least 3 letters in your search term!");
        } else {
            if (!Launcher.n().o().fc) {
                JOptionPane.showMessageDialog((Component) null, "Please login before searching items!");
                return;
            }
            this.a.set(true);
            e();
            ClientThread.queue(() -> {
                String strF = f();
                SwingUtilities.invokeLater(() -> {
                    this.c.setText(strF);
                    this.a.set(false);
                });
            });
        }
    }

    private void e() {
        this.d.setCaretPosition(0);
        this.b.getVerticalScrollBar().setValue(0);
        this.c.setText("");
    }

    private String f() {
        String str = "";
        for (int i = 0; i < ItemComposition.a; i++) {
            ItemComposition itemCompositionB = ItemComposition.c.b(i);
            if (itemCompositionB != null && itemCompositionB.itemName != null && itemCompositionB.itemId != 11283 && itemCompositionB.itemName.toLowerCase().contains(this.d.getText().toLowerCase()) && !itemCompositionB.itemName.contains("@red@")) {
                str = (str.equals("") ? "" : str + "\n") + itemCompositionB.itemId + "\t" + itemCompositionB.itemName.replace("@gre@", "").replace("@red@", "").replace("@blu@", "").replace("@whi@", "") + " " + (itemCompositionB.b() ? "(noted)" : "");
            }
        }
        if (str.equals("")) {
            str = "No results found for \"" + this.d.getText() + "!\"";
        }
        return str;
    }
}

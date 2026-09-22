package rs.ui.components.apkg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.function.Consumer;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import rs.class_9;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a/e.class */
public class e extends JPanel {
    private static final int a = 255;
    private final h b = new h();
    private final JTextField c = new JTextField();
    private Consumer<Integer> d;

    void a(Consumer<Integer> consumer) {
        this.d = consumer;
        this.b.a(consumer);
    }

    e(String str) {
        setLayout(new BorderLayout(10, 0));
        setBackground(rs.gui.d.d);
        this.c.setBackground(rs.gui.d.c);
        this.c.setPreferredSize(new Dimension(35, 30));
        this.c.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.c.getDocument().setDocumentFilter(new f(this));
        this.c.addFocusListener(new g(this));
        this.c.addActionListener(actionEvent -> {
            b();
        });
        JLabel jLabel = new JLabel(str);
        jLabel.setPreferredSize(new Dimension(45, 0));
        jLabel.setForeground(Color.WHITE);
        this.b.setBackground(rs.gui.d.d);
        this.b.setBorder(new EmptyBorder(0, 0, 5, 0));
        this.b.setPreferredSize(new Dimension(259, 30));
        a(255);
        add(jLabel, "West");
        add(this.b, "Center");
        add(this.c, "East");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        a(Integer.parseInt(this.c.getText()));
        if (this.d != null) {
            this.d.accept(Integer.valueOf(a()));
        }
    }

    public void a(int i) {
        int iA = class_9.a(i);
        this.b.a(iA);
        this.c.setText(iA);
    }

    public int a() {
        return this.b.a();
    }
}

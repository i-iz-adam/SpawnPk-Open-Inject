package rs;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import org.lwjgl.system.windows.User32;
import rs.gui.Launcher;
import rs.gui.d;
import rs.lpkg.j;

/* JADX INFO: loaded from: client-final.jar:rs/class_572.class */
public class class_572 extends JFrame {
    private JTextArea a;
    private JLabel b;
    private JTextField c;
    private JDialog d;

    public class_572() {
        b();
    }

    private void b() {
        setDefaultCloseOperation(2);
        setTitle("Report Request Results");
        setSize(User32.WM_DWMCOLORIZATIONCOLORCHANGED, 600);
        setLocationRelativeTo(Launcher.n().i());
        if (j.a() == j.a) {
            setUndecorated(true);
            getRootPane().setWindowDecorationStyle(1);
        }
        this.a = new JTextArea();
        this.a.setText("Waiting for results..\n");
        this.a.addKeyListener(new class_573(this));
        JScrollPane jScrollPane = new JScrollPane(this.a);
        jScrollPane.setBackground(d.c);
        getContentPane().add(jScrollPane, "Center");
        this.d = c();
        setVisible(true);
    }

    private JDialog c() {
        JDialog jDialog = new JDialog(this, "Find Text", false);
        jDialog.setSize(300, 100);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(this);
        jDialog.getRootPane().registerKeyboardAction(actionEvent -> {
            jDialog.setVisible(false);
        }, KeyStroke.getKeyStroke(27, 0), 2);
        Container contentPane = jDialog.getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(new JLabel("Find:"));
        this.b = new JLabel("Match results: N/A");
        this.c = new JTextField(20);
        this.c.addKeyListener(new class_574(this));
        contentPane.add(this.c);
        contentPane.add(this.b);
        return jDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        String text = this.c.getText();
        String text2 = this.a.getText();
        if (text.isEmpty() || text2.isEmpty()) {
            return;
        }
        int caretPosition = z ? this.a.getCaretPosition() - text.length() : this.a.getCaretPosition();
        if (caretPosition < 0) {
            caretPosition = 0;
        }
        int iLastIndexOf = z ? text2.lastIndexOf(text, caretPosition) : text2.indexOf(text, caretPosition);
        if (iLastIndexOf == -1) {
            iLastIndexOf = z ? text2.lastIndexOf(text) : text2.indexOf(text);
        }
        a(iLastIndexOf, z ? iLastIndexOf + 1 : iLastIndexOf + text.length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        Highlighter highlighter = this.a.getHighlighter();
        highlighter.removeAllHighlights();
        String text = this.c.getText();
        this.a.getText();
        if (i == -1) {
            this.b.setText("Match results: N/A");
            return;
        }
        a(text, i);
        try {
            highlighter.addHighlight(i, i + text.length(), DefaultHighlighter.DefaultPainter);
            this.a.setCaretPosition(i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(String str, int i) {
        String text = this.a.getText();
        if (str.isEmpty() || text.isEmpty()) {
            return;
        }
        int length = 0;
        int i2 = 0;
        int i3 = -1;
        while (true) {
            int iIndexOf = text.indexOf(str, length);
            if (iIndexOf == -1) {
                this.b.setText("Match results: " + i3 + "/" + i2);
                return;
            }
            i2++;
            if (iIndexOf == i) {
                i3 = i2;
            }
            length = iIndexOf + str.length();
        }
    }

    public JTextArea a() {
        return this.a;
    }
}

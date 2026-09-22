package rs.tools;

import com.sun.jna.platform.win32.aU;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import rs.class_631;
import rs.class_632;
import rs.class_633;
import rs.class_634;
import rs.class_635;
import rs.class_636;
import rs.class_637;

/* JADX INFO: loaded from: client-final.jar:rs/tools/TextPopupWindow.class */
public class TextPopupWindow extends JFrame {
    public static final class_631 a = new class_632();
    public static List<String> b = new ArrayList();
    public static class_631 c = a;
    private SimpleAttributeSet d = new SimpleAttributeSet();
    private b e = new b();
    private class_631 f;
    private a g;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: loaded from: client-final.jar:rs/tools/TextPopupWindow$a.class */
    public final class a extends JFrame {
        private TextPopupWindow b;
        private JTextField c;
        private JButton d;
        private int e;

        public a(TextPopupWindow textPopupWindow) {
            this.b = textPopupWindow;
        }

        public void a() {
            setLocationRelativeTo(this.b);
            requestFocus();
        }

        public void b() {
            if (isVisible()) {
                return;
            }
            this.d = new JButton("Search");
            this.c = new JTextField("", 15);
            setTitle("Search for text");
            setLayout(new FlowLayout());
            setSize(300, 75);
            setLocationRelativeTo(this.b);
            getRootPane().setDefaultButton(this.d);
            getContentPane().add(this.c, 0);
            getContentPane().add(this.d, 1);
            setVisible(true);
            this.e = this.b.a().getCaretPosition();
            getRootPane().getInputMap(2).put(KeyStroke.getKeyStroke(27, 0), "Cancel");
            getRootPane().getActionMap().put("Cancel", new class_636(this));
            this.d.addActionListener(new class_637(this));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ int d(a aVar) {
            int i = aVar.e;
            aVar.e = i + 1;
            return i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ int b(a aVar, int i) {
            int i2 = aVar.e + i;
            aVar.e = i2;
            return i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: loaded from: client-final.jar:rs/tools/TextPopupWindow$b.class */
    public class b extends JTextPane {
        protected b() {
        }

        public boolean getScrollableTracksViewportWidth() {
            return getUI().getPreferredSize(this).width <= getParent().getSize().width;
        }

        public Dimension getPreferredSize() {
            return getUI().getPreferredSize(this);
        }
    }

    public static void main(String[] strArr) {
        new class_633();
    }

    public TextPopupWindow(String str, class_631 class_631Var) {
        this.f = class_631Var;
        setTitle(str);
        setDefaultCloseOperation(3);
        AttributeSet simpleAttributeSet = new SimpleAttributeSet();
        StyleConstants.setBold(simpleAttributeSet, true);
        this.e.getInputMap().put(KeyStroke.getKeyStroke(70, 2), new class_634(this, this));
        this.e.setCharacterAttributes(simpleAttributeSet, true);
        this.e.setEditable(false);
        this.e.getCaret().setVisible(true);
        this.e.getCaret().setSelectionVisible(true);
        this.e.addFocusListener(new class_635(this));
        getContentPane().add(new JScrollPane(this.e), "Center");
        setSize(989, aU.jc_);
        setVisible(true);
    }

    public void a(String str) {
        try {
            this.f.a(this.e.getStyledDocument(), this.d, str);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }

    public JTextPane a() {
        return this.e;
    }
}

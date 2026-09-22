package rs.plugins.m;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.undo.UndoManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.ui.m;

/* JADX INFO: loaded from: client-final.jar:rs/s/m/b.class */
class b extends m {
    private static final Logger a = LoggerFactory.getLogger((Class<?>) b.class);
    private final JTextArea b = new JTextArea();
    private final UndoManager c = new UndoManager();

    b() {
    }

    void a(a aVar) {
        getParent().setLayout(new BorderLayout());
        getParent().add(this, "Center");
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setBackground(rs.gui.d.d);
        this.b.setTabSize(2);
        this.b.setLineWrap(true);
        this.b.setWrapStyleWord(true);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.setBackground(rs.gui.d.c);
        this.b.setOpaque(false);
        this.b.setText(aVar.a());
        this.c.setLimit(500);
        this.b.getDocument().addUndoableEditListener(undoableEditEvent -> {
            this.c.addEdit(undoableEditEvent.getEdit());
        });
        this.b.getInputMap().put(KeyStroke.getKeyStroke("control Z"), "Undo");
        this.b.getInputMap().put(KeyStroke.getKeyStroke("control Y"), "Redo");
        this.b.getActionMap().put("Undo", new c(this, "Undo"));
        this.b.getActionMap().put("Redo", new d(this, "Redo"));
        this.b.addFocusListener(new e(this, aVar));
        jPanel.add(this.b, "Center");
        jPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        add(jPanel, "Center");
    }

    void a(String str) {
        this.b.setText(str);
    }
}

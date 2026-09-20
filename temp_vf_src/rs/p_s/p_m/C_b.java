package rs.p_s.p_m;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.undo.UndoManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.p_ui.C_m;

class C_b extends C_m {
   private static final Logger a = LoggerFactory.getLogger(C_b.class);
   private final JTextArea b = new JTextArea();
   private final UndoManager c = new UndoManager();

   void a(C_a var1) {
      this.getParent().setLayout(new BorderLayout());
      this.getParent().add(this, "Center");
      this.setLayout(new BorderLayout());
      this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
      this.setBackground(rs.p_gui.C_d.d);
      this.b.setTabSize(2);
      this.b.setLineWrap(true);
      this.b.setWrapStyleWord(true);
      JPanel var2 = new JPanel();
      var2.setLayout(new BorderLayout());
      var2.setBackground(rs.p_gui.C_d.c);
      this.b.setOpaque(false);
      String var3 = var1.a();
      this.b.setText(var3);
      this.c.setLimit(500);
      this.b.getDocument().addUndoableEditListener(var1x -> this.c.addEdit(var1x.getEdit()));
      this.b.getInputMap().put(KeyStroke.getKeyStroke("control Z"), "Undo");
      this.b.getInputMap().put(KeyStroke.getKeyStroke("control Y"), "Redo");
      this.b.getActionMap().put("Undo", new C_c(this, "Undo"));
      this.b.getActionMap().put("Redo", new C_d(this, "Redo"));
      this.b.addFocusListener(new C_e(this, var1));
      var2.add(this.b, "Center");
      var2.setBorder(new EmptyBorder(10, 10, 10, 10));
      this.add(var2, "Center");
   }

   void a(String var1) {
      this.b.setText(var1);
   }
}

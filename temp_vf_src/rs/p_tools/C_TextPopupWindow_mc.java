package rs.p_tools;

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
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class C_TextPopupWindow_mc extends JFrame {
   public static final C_a a = new C_b();
   public static List<String> b = new ArrayList<>();
   public static C_a c = a;
   private SimpleAttributeSet d = new SimpleAttributeSet();
   private C_TextPopupWindow_mc.b e = new C_TextPopupWindow_mc.b();
   private C_a f;
   private C_TextPopupWindow_mc.a g;

   public static void main(String[] var0) {
      new C_c();
   }

   public C_TextPopupWindow_mc(String var1, C_a var2) {
      this.f = var2;
      this.setTitle(var1);
      this.setDefaultCloseOperation(3);
      SimpleAttributeSet var3 = new SimpleAttributeSet();
      StyleConstants.setBold(var3, true);
      this.e.getInputMap().put(KeyStroke.getKeyStroke(70, 2), new C_d(this, this));
      this.e.setCharacterAttributes(var3, true);
      this.e.setEditable(false);
      this.e.getCaret().setVisible(true);
      this.e.getCaret().setSelectionVisible(true);
      this.e.addFocusListener(new C_e(this));
      JScrollPane var5 = new JScrollPane(this.e);
      this.getContentPane().add(var5, "Center");
      this.setSize(989, 571);
      this.setVisible(true);
   }

   public void a(String var1) {
      try {
         this.f.a(this.e.getStyledDocument(), this.d, var1);
      } catch (BadLocationException var3) {
         var3.printStackTrace();
      }
   }

   public JTextPane a() {
      return this.e;
   }

   protected final class a extends JFrame {
      private C_TextPopupWindow_mc b;
      private JTextField c;
      private JButton d;
      private int e;

      public a(C_TextPopupWindow_mc var2) {
         this.b = var2;
      }

      public void a() {
         this.setLocationRelativeTo(this.b);
         this.requestFocus();
      }

      public void b() {
         if (!this.isVisible()) {
            this.d = new JButton("Search");
            this.c = new JTextField("", 15);
            this.setTitle("Search for text");
            this.setLayout(new FlowLayout());
            this.setSize(300, 75);
            this.setLocationRelativeTo(this.b);
            this.getRootPane().setDefaultButton(this.d);
            this.getContentPane().add(this.c, 0);
            this.getContentPane().add(this.d, 1);
            this.setVisible(true);
            this.e = this.b.a().getCaretPosition();
            this.getRootPane().getInputMap(2).put(KeyStroke.getKeyStroke(27, 0), "Cancel");
            this.getRootPane().getActionMap().put("Cancel", new C_f(this));
            this.d.addActionListener(new C_g(this));
         }
      }
   }

   protected class b extends JTextPane {
      @Override
      public boolean getScrollableTracksViewportWidth() {
         return this.getUI().getPreferredSize(this).width <= this.getParent().getSize().width;
      }

      @Override
      public Dimension getPreferredSize() {
         return this.getUI().getPreferredSize(this);
      }
   }
}

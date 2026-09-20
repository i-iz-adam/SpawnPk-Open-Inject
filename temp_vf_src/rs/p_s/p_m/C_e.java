package rs.p_s.p_m;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

class C_e implements FocusListener {
   C_e(C_b var1, C_a var2) {
      this.b = var1;
      this.a = var2;
   }

   @Override
   public void focusGained(FocusEvent var1) {
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.a(C_b.b(this.b).getDocument());
   }

   private void a(Document var1) {
      try {
         String var2 = var1.getText(0, var1.getLength());
         this.a.a(var2);
      } catch (BadLocationException var3) {
         C_b.b().warn("Notes Document Bad Location: " + var3);
      }
   }
}

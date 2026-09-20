package rs.p_s.p_b;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class C_s implements DocumentListener {
   C_s(C_q var1) {
      this.a = var1;
   }

   @Override
   public void insertUpdate(DocumentEvent var1) {
      C_q.a(this.a);
   }

   @Override
   public void removeUpdate(DocumentEvent var1) {
      C_q.a(this.a);
   }

   @Override
   public void changedUpdate(DocumentEvent var1) {
      C_q.a(this.a);
   }
}

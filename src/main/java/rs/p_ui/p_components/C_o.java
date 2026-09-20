package rs.p_ui.p_components;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class C_o implements DocumentListener {
   C_o(C_k var1) {
      this.a = var1;
   }

   @Override
   public void insertUpdate(DocumentEvent var1) {
      C_k.b(this.a);
   }

   @Override
   public void removeUpdate(DocumentEvent var1) {
      C_k.b(this.a);
   }

   @Override
   public void changedUpdate(DocumentEvent var1) {
      C_k.b(this.a);
   }
}

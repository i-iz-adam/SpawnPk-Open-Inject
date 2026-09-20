package rs.p_s.p_q;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class C_c implements DocumentListener {
   C_c(C_b var1, C_d var2, JTextField var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   private void a() {
      this.a.a(this.b.getText());
      if (!this.b.getText().startsWith(" ")) {
         this.c.b();
      }
   }

   @Override
   public void changedUpdate(DocumentEvent var1) {
      this.a();
   }

   @Override
   public void removeUpdate(DocumentEvent var1) {
      this.a();
   }

   @Override
   public void insertUpdate(DocumentEvent var1) {
      this.a();
   }
}

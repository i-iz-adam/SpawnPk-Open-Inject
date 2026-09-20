package rs.p_tools;

import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;

class C_b implements C_a {
   @Override
   public void a(Document var1, SimpleAttributeSet var2, String var3) {
      var1.insertString(var1.getLength(), var3, var2);
   }
}

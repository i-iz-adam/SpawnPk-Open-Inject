package rs.p_s.p_b;

import java.text.ParseException;
import javax.swing.JFormattedTextField.AbstractFormatter;

final class C_x extends AbstractFormatter {
   private final String a;

   C_x(rs.p_e.C_q var1) {
      this.a = var1.a();
   }

   @Override
   public Object stringToValue(String var1) {
      String var2;
      if (var1.endsWith(this.a)) {
         var2 = var1.substring(0, var1.length() - this.a.length());
      } else {
         var2 = var1;
      }

      try {
         return Integer.valueOf(var2);
      } catch (NumberFormatException var4) {
         throw new ParseException(var2 + " is not an integer.", 0);
      }
   }

   @Override
   public String valueToString(Object var1) {
      return var1 + this.a;
   }
}

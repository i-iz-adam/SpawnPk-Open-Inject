package rs.p_s.p_b;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFormattedTextField.AbstractFormatterFactory;

final class C_y extends AbstractFormatterFactory {
   private final rs.p_e.C_q a;
   private final Map<JFormattedTextField, AbstractFormatter> b = new HashMap<>();

   @Override
   public AbstractFormatter getFormatter(JFormattedTextField var1) {
      return this.b.computeIfAbsent(var1, var1x -> new C_x(this.a));
   }

   public C_y(rs.p_e.C_q var1) {
      this.a = var1;
   }
}

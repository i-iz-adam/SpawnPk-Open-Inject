package rs.plugins.bpkg;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JFormattedTextField;
import rs.class_147;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/y.class */
final class y extends JFormattedTextField.AbstractFormatterFactory {
    private final class_147 a;
    private final Map<JFormattedTextField, JFormattedTextField.AbstractFormatter> b = new HashMap();

    public JFormattedTextField.AbstractFormatter getFormatter(JFormattedTextField jFormattedTextField) {
        return this.b.computeIfAbsent(jFormattedTextField, jFormattedTextField2 -> {
            return new x(this.a);
        });
    }

    public y(class_147 class_147Var) {
        this.a = class_147Var;
    }
}

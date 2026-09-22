package rs.plugins.bpkg;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import rs.class_147;

/* JADX INFO: loaded from: client-final.jar:rs/s/b/x.class */
final class x extends JFormattedTextField.AbstractFormatter {
    private final String a;

    x(class_147 class_147Var) {
        this.a = class_147Var.a();
    }

    public Object stringToValue(String str) throws ParseException {
        String strSubstring = str.endsWith(this.a) ? str.substring(0, str.length() - this.a.length()) : str;
        try {
            return Integer.valueOf(strSubstring);
        } catch (NumberFormatException e) {
            throw new ParseException(strSubstring + " is not an integer.", 0);
        }
    }

    public String valueToString(Object obj) {
        return String.valueOf(obj) + this.a;
    }
}

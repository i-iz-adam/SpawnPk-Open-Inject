package rs;

import java.awt.Color;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: client-final.jar:rs/class_633.class */
public class class_633 implements class_631 {
    private int a = 1;
    private boolean b = true;

    @Override // rs.class_631
    public void a(Document document, SimpleAttributeSet simpleAttributeSet, String str) {
        if (str.contains("Logged in")) {
            SimpleAttributeSet simpleAttributeSet2 = new SimpleAttributeSet();
            StyleConstants.setBold(simpleAttributeSet2, true);
            if (this.b) {
                StyleConstants.setBackground(simpleAttributeSet2, Color.cyan);
                int length = document.getLength();
                int i = this.a;
                this.a = i + 1;
                document.insertString(length, "Login #" + i + " ", simpleAttributeSet2);
            } else {
                StyleConstants.setBackground(simpleAttributeSet2, Color.orange);
                int length2 = document.getLength();
                int i2 = this.a;
                this.a = i2 + 1;
                document.insertString(length2, "Login #" + i2 + " (Potential DC?)", simpleAttributeSet2);
            }
            simpleAttributeSet = new SimpleAttributeSet();
            this.b = false;
        }
        if (str.contains("IP address")) {
            String[] strArrSplit = str.split("IP address");
            if (strArrSplit[0].contains("[")) {
                String[] strArrSplit2 = strArrSplit[0].split("\\[");
                StyleConstants.setBold(simpleAttributeSet, true);
                document.insertString(document.getLength(), " [" + strArrSplit2[2].split("\\(\\(")[0], simpleAttributeSet);
                StyleConstants.setBold(simpleAttributeSet, false);
                document.insertString(document.getLength(), "((" + strArrSplit2[2].split("\\(\\(")[1], simpleAttributeSet);
            } else {
                document.insertString(document.getLength(), " " + strArrSplit[0] + " IP address", simpleAttributeSet);
            }
            StyleConstants.setBold(simpleAttributeSet, true);
            document.insertString(document.getLength(), strArrSplit[1] + "\n", simpleAttributeSet);
        } else {
            if (str.contains("Unregistered")) {
                StyleConstants.setBackground(simpleAttributeSet, Color.pink);
                document.insertString(document.getLength(), "Logout", simpleAttributeSet);
                StyleConstants.setBackground(simpleAttributeSet, Color.white);
            }
            document.insertString(document.getLength(), " " + str + "\n", simpleAttributeSet);
        }
        if (str.contains("Unregistered")) {
            document.insertString(document.getLength(), "\n", simpleAttributeSet);
            this.b = true;
        }
    }
}

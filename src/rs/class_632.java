package rs;

import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: client-final.jar:rs/class_632.class */
public class class_632 implements class_631 {
    @Override // rs.class_631
    public void a(Document document, SimpleAttributeSet simpleAttributeSet, String str) {
        document.insertString(document.getLength(), str, simpleAttributeSet);
    }
}

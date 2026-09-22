package rs.plugins.m;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

/* JADX INFO: loaded from: client-final.jar:rs/s/m/e.class */
class e implements FocusListener {
    final /* synthetic */ a a;
    final /* synthetic */ b b;

    e(b bVar, a aVar) {
        this.b = bVar;
        this.a = aVar;
    }

    public void focusGained(FocusEvent focusEvent) {
    }

    public void focusLost(FocusEvent focusEvent) {
        a(this.b.b.getDocument());
    }

    private void a(Document document) {
        try {
            this.a.a(document.getText(0, document.getLength()));
        } catch (BadLocationException e) {
            b.a.warn("Notes Document Bad Location: " + String.valueOf(e));
        }
    }
}

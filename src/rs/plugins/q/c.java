package rs.plugins.q;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.apache.commons.a.F;

/* JADX INFO: loaded from: client-final.jar:rs/s/q/c.class */
class c implements DocumentListener {
    final /* synthetic */ d a;
    final /* synthetic */ JTextField b;
    final /* synthetic */ b c;

    c(b bVar, d dVar, JTextField jTextField) {
        this.c = bVar;
        this.a = dVar;
        this.b = jTextField;
    }

    private void a() {
        this.a.a(this.b.getText());
        if (this.b.getText().startsWith(F.a)) {
            return;
        }
        this.c.b();
    }

    public void changedUpdate(DocumentEvent documentEvent) {
        a();
    }

    public void removeUpdate(DocumentEvent documentEvent) {
        a();
    }

    public void insertUpdate(DocumentEvent documentEvent) {
        a();
    }
}

package rs.ui.components.apkg;

import java.awt.Toolkit;
import javax.swing.text.AttributeSet;
import javax.swing.text.DocumentFilter;
import rs.class_9;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a/s.class */
class s extends DocumentFilter {
    final /* synthetic */ q a;

    s(q qVar) {
        this.a = qVar;
    }

    public void replace(DocumentFilter.FilterBypass filterBypass, int i, int i2, String str, AttributeSet attributeSet) {
        String strReplaceAll = str.replaceAll("#|0x", "");
        if (class_9.b(q.a(filterBypass, i, i2, strReplaceAll))) {
            super.replace(filterBypass, i, i2, strReplaceAll, attributeSet);
        } else {
            Toolkit.getDefaultToolkit().beep();
        }
    }
}

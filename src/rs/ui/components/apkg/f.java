package rs.ui.components.apkg;

import java.awt.Toolkit;
import javax.swing.text.AttributeSet;
import javax.swing.text.DocumentFilter;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/a/f.class */
class f extends DocumentFilter {
    final /* synthetic */ e a;

    f(e eVar) {
        this.a = eVar;
    }

    public void replace(DocumentFilter.FilterBypass filterBypass, int i, int i2, String str, AttributeSet attributeSet) {
        try {
            int i3 = Integer.parseInt(q.a(filterBypass, i, i2, str));
            if (i3 < 0 || i3 > 255) {
                Toolkit.getDefaultToolkit().beep();
            } else {
                super.replace(filterBypass, i, i2, str, attributeSet);
            }
        } catch (NumberFormatException e) {
            Toolkit.getDefaultToolkit().beep();
        }
    }
}

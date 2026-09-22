package rs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextPane;
import javax.swing.text.Document;
import rs.tools.TextPopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: client-final.jar:rs/class_637.class */
public class class_637 implements ActionListener {
    final /* synthetic */ TextPopupWindow.a a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public class_637(TextPopupWindow.a aVar) {
        this.a = aVar;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        String lowerCase = this.a.c.getText().toLowerCase();
        JTextPane jTextPaneA = this.a.b.a();
        if (lowerCase == null || lowerCase.length() <= 0) {
            return;
        }
        Document document = jTextPaneA.getDocument();
        int length = lowerCase.length();
        try {
            boolean z = false;
            if (this.a.e + length > document.getLength()) {
                this.a.e = 0;
            }
            while (this.a.e + length <= document.getLength()) {
                if (document.getText(this.a.e, length).toLowerCase().equals(lowerCase)) {
                    z = true;
                    break;
                }
                TextPopupWindow.a.d(this.a);
            }
            if (z) {
                jTextPaneA.scrollRectToVisible(jTextPaneA.modelToView(this.a.e));
                jTextPaneA.setCaretPosition(this.a.e + length);
                jTextPaneA.moveCaretPosition(this.a.e);
                TextPopupWindow.a.b(this.a, length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

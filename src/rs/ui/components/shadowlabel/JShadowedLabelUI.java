package rs.ui.components.shadowlabel;

import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicLabelUI;

/* JADX INFO: loaded from: client-final.jar:rs/ui/components/shadowlabel/JShadowedLabelUI.class */
class JShadowedLabelUI extends BasicLabelUI {
    JShadowedLabelUI() {
    }

    protected void paintEnabledText(JLabel jLabel, Graphics graphics, String str, int i, int i2) {
        if (jLabel instanceof a) {
            a aVar = (a) jLabel;
            graphics.setColor(aVar.a());
            graphics.drawString(str, i + aVar.b().x, i2 + aVar.b().y);
        }
        graphics.setColor(jLabel.getForeground());
        graphics.drawString(str, i, i2);
    }
}

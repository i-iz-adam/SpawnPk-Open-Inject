package rs;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

/* JADX INFO: loaded from: client-final.jar:rs/class_94.class */
class class_94 implements HyperlinkListener {
    final /* synthetic */ class_93 a;

    class_94(class_93 class_93Var) {
        this.a = class_93Var;
    }

    public void hyperlinkUpdate(HyperlinkEvent hyperlinkEvent) {
        if (hyperlinkEvent.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
            try {
                Desktop.getDesktop().browse(URI.create(hyperlinkEvent.getURL().toString()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

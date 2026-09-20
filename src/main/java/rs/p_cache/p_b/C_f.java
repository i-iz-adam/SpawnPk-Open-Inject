package rs.p_cache.p_b;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.event.HyperlinkEvent.EventType;

class C_f implements HyperlinkListener {
   final C_e a;

   C_f(C_e var1) {
      this.a = var1;
   }

   @Override
   public void hyperlinkUpdate(HyperlinkEvent var1) {
      if (var1.getEventType() == EventType.ACTIVATED) {
         try {
            Desktop.getDesktop().browse(URI.create(var1.getURL().toString()));
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }
   }
}

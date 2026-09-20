package rs.p_A_uc;

import com.apple.eawt.FullScreenAdapter;
import com.apple.eawt.FullScreenUtilities;
import com.apple.eawt.event.FullScreenEvent;
import java.awt.Frame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class C_n extends FullScreenAdapter {
   private static final Logger a = LoggerFactory.getLogger(C_n.class);
   private final Frame b;

   public void a(FullScreenEvent var1) {
      a.debug("Window entered fullscreen mode--setting extended state to {}", 6);
      this.b.setExtendedState(6);
   }

   public void b(FullScreenEvent var1) {
      a.debug("Window exited fullscreen mode--setting extended state to {}", 0);
      this.b.setExtendedState(0);
   }

   public static void a(Frame var0) {
      FullScreenUtilities.addFullScreenListenerTo(var0, new C_n(var0));
   }

   public C_n(Frame var1) {
      this.b = var1;
   }
}

package rs.p_A_uc;

import com.apple.eawt.Application;
import com.apple.eawt.FullScreenUtilities;
import javax.swing.JFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class C_o {
   private static final Logger a = LoggerFactory.getLogger(C_o.class);

   public static void a(JFrame var0) {
      if (rs.p_k.C_j.a() == rs.p_k.C_j.b) {
         C_n.a(var0);
         FullScreenUtilities.setWindowCanFullScreen(var0, true);
         a.debug("Enabled fullscreen on macOS");
      }
   }

   public static void a() {
      Application var0 = Application.getApplication();
      var0.requestUserAttention(true);
      a.debug("Requested user attention on macOS");
   }

   public static void b() {
      Application var0 = Application.getApplication();
      var0.requestForeground(true);
      a.debug("Forced focus on macOS");
   }
}

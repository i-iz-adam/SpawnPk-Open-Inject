package rs.p_A_uc;

import com.google.a.b.as;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.Desktop.Action;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.inject.Singleton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class C_l {
   private static final Logger a = LoggerFactory.getLogger(C_l.class);
   private static boolean b = rs.p_k.C_j.a() == rs.p_k.C_j.c;

   public static void a(String var0) {
      new Thread(() -> {
         if (as.c(var0)) {
            a.warn("LinkBrowser.browse() called with invalid input");
         } else if (b && c(var0)) {
            a.debug("Opened url through xdg-open to {}", var0);
         } else if (d(var0)) {
            a.debug("Opened url through Desktop#browse to {}", var0);
         } else {
            a.warn("LinkBrowser.browse() could not open {}", var0);
            a("Unable to open link. Press 'OK' and the link will be copied to your clipboard.", var0);
         }
      }).start();
   }

   public static void b(String var0) {
      new Thread(() -> {
         if (as.c(var0)) {
            a.warn("LinkBrowser.open() called with invalid input");
         } else if (b && c(var0)) {
            a.debug("Opened directory through xdg-open to {}", var0);
         } else if (e(var0)) {
            a.debug("Opened directory through Desktop#open to {}", var0);
         } else {
            a.warn("LinkBrowser.open() could not open {}", var0);
            a("Unable to open folder. Press 'OK' and the folder directory will be copied to your clipboard.", var0);
         }
      }).start();
   }

   private static boolean c(String var0) {
      try {
         Process var1 = Runtime.getRuntime().exec(new String[]{"xdg-open", var0});
         var1.waitFor();
         int var2 = var1.exitValue();
         if (var2 == 0) {
            return true;
         } else {
            a.warn("xdg-open {} returned with error code {}", var0, var2);
            return false;
         }
      } catch (IOException var3) {
         b = false;
         return false;
      } catch (InterruptedException var4) {
         a.warn("Interrupted while waiting for xdg-open {} to execute", var0);
         return false;
      }
   }

   private static boolean d(String var0) {
      if (!Desktop.isDesktopSupported()) {
         return false;
      } else {
         Desktop var1 = Desktop.getDesktop();
         if (!var1.isSupported(Action.BROWSE)) {
            return false;
         } else {
            try {
               var1.browse(new URI(var0));
               return true;
            } catch (URISyntaxException | IOException var3) {
               a.warn("Failed to open Desktop#browse {}", var0, var3);
               return false;
            }
         }
      }
   }

   private static boolean e(String var0) {
      if (!Desktop.isDesktopSupported()) {
         return false;
      } else {
         Desktop var1 = Desktop.getDesktop();
         if (!var1.isSupported(Action.OPEN)) {
            return false;
         } else {
            try {
               var1.open(new File(var0));
               return true;
            } catch (IOException var3) {
               a.warn("Failed to open Desktop#open {}", var0, var3);
               return false;
            }
         }
      }
   }

   private static void a(String var0, String var1) {
      SwingUtilities.invokeLater(() -> {
         int var2 = JOptionPane.showConfirmDialog(null, var0, "Message", 2);
         if (var2 == 0) {
            StringSelection var3 = new StringSelection(var1);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(var3, null);
         }
      });
   }
}

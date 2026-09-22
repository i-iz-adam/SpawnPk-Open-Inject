package rs;

import com.google.a.b.as;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
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
import rs.lpkg.j;

/* JADX INFO: loaded from: client-final.jar:rs/class_14.class */
@Singleton
public class class_14 {
    private static final Logger a = LoggerFactory.getLogger((Class<?>) class_14.class);
    private static boolean b;

    public static void a(String str) {
        new Thread(() -> {
            if (as.c(str)) {
                a.warn("LinkBrowser.browse() called with invalid input");
                return;
            }
            if (b && c(str)) {
                a.debug("Opened url through xdg-open to {}", str);
            } else if (d(str)) {
                a.debug("Opened url through Desktop#browse to {}", str);
            } else {
                a.warn("LinkBrowser.browse() could not open {}", str);
                a("Unable to open link. Press 'OK' and the link will be copied to your clipboard.", str);
            }
        }).start();
    }

    public static void b(String str) {
        new Thread(() -> {
            if (as.c(str)) {
                a.warn("LinkBrowser.open() called with invalid input");
                return;
            }
            if (b && c(str)) {
                a.debug("Opened directory through xdg-open to {}", str);
            } else if (e(str)) {
                a.debug("Opened directory through Desktop#open to {}", str);
            } else {
                a.warn("LinkBrowser.open() could not open {}", str);
                a("Unable to open folder. Press 'OK' and the folder directory will be copied to your clipboard.", str);
            }
        }).start();
    }

    private static boolean c(String str) {
        try {
            Process processExec = Runtime.getRuntime().exec(new String[]{"xdg-open", str});
            processExec.waitFor();
            int iExitValue = processExec.exitValue();
            if (iExitValue == 0) {
                return true;
            }
            a.warn("xdg-open {} returned with error code {}", str, Integer.valueOf(iExitValue));
            return false;
        } catch (IOException e) {
            b = false;
            return false;
        } catch (InterruptedException e2) {
            a.warn("Interrupted while waiting for xdg-open {} to execute", str);
            return false;
        }
    }

    private static boolean d(String str) {
        if (!Desktop.isDesktopSupported()) {
            return false;
        }
        Desktop desktop = Desktop.getDesktop();
        if (!desktop.isSupported(Desktop.Action.BROWSE)) {
            return false;
        }
        try {
            desktop.browse(new URI(str));
            return true;
        } catch (IOException | URISyntaxException e) {
            a.warn("Failed to open Desktop#browse {}", str, e);
            return false;
        }
    }

    private static boolean e(String str) {
        if (!Desktop.isDesktopSupported()) {
            return false;
        }
        Desktop desktop = Desktop.getDesktop();
        if (!desktop.isSupported(Desktop.Action.OPEN)) {
            return false;
        }
        try {
            desktop.open(new File(str));
            return true;
        } catch (IOException e) {
            a.warn("Failed to open Desktop#open {}", str, e);
            return false;
        }
    }

    private static void a(String str, String str2) {
        SwingUtilities.invokeLater(() -> {
            if (JOptionPane.showConfirmDialog((Component) null, str, "Message", 2) == 0) {
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(str2), (ClipboardOwner) null);
            }
        });
    }

    static {
        b = j.a() == j.c;
    }
}

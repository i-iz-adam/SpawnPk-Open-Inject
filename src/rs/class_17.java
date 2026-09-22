package rs;

import com.apple.eawt.Application;
import com.apple.eawt.FullScreenUtilities;
import java.awt.Frame;
import javax.swing.JFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.lpkg.j;

/* JADX INFO: loaded from: client-final.jar:rs/class_17.class */
public class class_17 {
    private static final Logger a = LoggerFactory.getLogger((Class<?>) class_17.class);

    public static void a(JFrame jFrame) {
        if (j.a() == j.b) {
            class_16.a((Frame) jFrame);
            FullScreenUtilities.setWindowCanFullScreen(jFrame, true);
            a.debug("Enabled fullscreen on macOS");
        }
    }

    public static void a() {
        Application.getApplication().requestUserAttention(true);
        a.debug("Requested user attention on macOS");
    }

    public static void b() {
        Application.getApplication().requestForeground(true);
        a.debug("Forced focus on macOS");
    }
}

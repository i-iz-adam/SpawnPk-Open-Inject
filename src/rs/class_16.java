package rs;

import com.apple.eawt.FullScreenAdapter;
import com.apple.eawt.FullScreenUtilities;
import com.apple.eawt.event.FullScreenEvent;
import java.awt.Frame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: client-final.jar:rs/class_16.class */
class class_16 extends FullScreenAdapter {
    private static final Logger a = LoggerFactory.getLogger((Class<?>) class_16.class);
    private final Frame b;

    public void a(FullScreenEvent fullScreenEvent) {
        a.debug("Window entered fullscreen mode--setting extended state to {}", (Object) 6);
        this.b.setExtendedState(6);
    }

    public void b(FullScreenEvent fullScreenEvent) {
        a.debug("Window exited fullscreen mode--setting extended state to {}", (Object) 0);
        this.b.setExtendedState(0);
    }

    public static void a(Frame frame) {
        FullScreenUtilities.addFullScreenListenerTo(frame, new class_16(frame));
    }

    public class_16(Frame frame) {
        this.b = frame;
    }
}

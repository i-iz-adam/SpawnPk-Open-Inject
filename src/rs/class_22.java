package rs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: client-final.jar:rs/class_22.class */
public class class_22 implements Runnable {
    private static final Logger a = LoggerFactory.getLogger((Class<?>) class_22.class);
    private final Runnable b;

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            a.error("Uncaught exception in runnable {}", this.b, th);
            throw th;
        }
    }

    public static class_22 a(Runnable runnable) {
        return new class_22(runnable);
    }

    public class_22(Runnable runnable) {
        this.b = runnable;
    }
}

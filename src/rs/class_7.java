package rs;

import java.util.concurrent.Callable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: client-final.jar:rs/class_7.class */
public class class_7<V> implements Callable<V> {
    private static final Logger a = LoggerFactory.getLogger((Class<?>) class_7.class);
    private final Callable<V> b;

    @Override // java.util.concurrent.Callable
    public V call() {
        try {
            return this.b.call();
        } catch (Throwable th) {
            a.error("Uncaught exception in callable {}", this.b, th);
            throw th;
        }
    }

    public static <V> class_7<V> a(Callable<V> callable) {
        return new class_7<>(callable);
    }

    public class_7(Callable<V> callable) {
        this.b = callable;
    }
}

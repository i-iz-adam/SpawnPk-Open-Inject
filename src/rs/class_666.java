package rs;

import java.lang.reflect.Method;
import java.time.Instant;

/* JADX INFO: loaded from: client-final.jar:rs/class_666.class */
public class class_666 {
    private final class_665 a;
    private final Method b;
    private final Object c;
    private final Runnable d;
    private Instant e = Instant.now();

    public class_666(class_665 class_665Var, Method method, Object obj, Runnable runnable) {
        this.a = class_665Var;
        this.b = method;
        this.c = obj;
        this.d = runnable;
    }

    public String toString() {
        return "ScheduledMethod(schedule=" + String.valueOf(a()) + ", method=" + String.valueOf(b()) + ", object=" + String.valueOf(c()) + ", lambda=" + String.valueOf(d()) + ", last=" + String.valueOf(e()) + ")";
    }

    public class_665 a() {
        return this.a;
    }

    public Method b() {
        return this.b;
    }

    public Object c() {
        return this.c;
    }

    public Runnable d() {
        return this.d;
    }

    public Instant e() {
        return this.e;
    }

    public void a(Instant instant) {
        this.e = instant;
    }
}

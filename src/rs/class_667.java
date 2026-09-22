package rs;

import java.lang.reflect.InvocationTargetException;
import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: client-final.jar:rs/class_667.class */
@Singleton
public class class_667 {
    private static final Logger b = LoggerFactory.getLogger((Class<?>) class_667.class);
    private final List<class_666> c = new CopyOnWriteArrayList();

    @Inject
    ScheduledExecutorService a;

    public void a(class_666 class_666Var) {
        this.c.add(class_666Var);
    }

    public void b(class_666 class_666Var) {
        this.c.remove(class_666Var);
    }

    public List<class_666> a() {
        return Collections.unmodifiableList(this.c);
    }

    public void b() {
        Instant instantNow = Instant.now();
        for (class_666 class_666Var : this.c) {
            Duration durationBetween = Duration.between(class_666Var.e(), instantNow);
            class_665 class_665VarA = class_666Var.a();
            if (durationBetween.compareTo(Duration.of(class_665VarA.a(), class_665VarA.b())) > 0) {
                b.trace("Scheduled task triggered: {}", class_666Var);
                class_666Var.a(instantNow);
                if (class_665VarA.c()) {
                    this.a.submit(() -> {
                        c(class_666Var);
                    });
                } else {
                    c(class_666Var);
                }
            }
        }
    }

    private void c(class_666 class_666Var) {
        try {
            Runnable runnableD = class_666Var.d();
            if (runnableD != null) {
                runnableD.run();
            } else {
                class_666Var.b().invoke(class_666Var.c(), new Object[0]);
            }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            b.warn("error invoking scheduled task", e);
        } catch (Exception e2) {
            b.warn("error during scheduled task", (Throwable) e2);
        }
    }
}

package rs;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.temporal.ChronoUnit;

/* JADX INFO: loaded from: client-final.jar:rs/class_665.class */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface class_665 {
    long a();

    ChronoUnit b();

    boolean c() default false;
}

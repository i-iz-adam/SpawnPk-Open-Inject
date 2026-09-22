package rs;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: client-final.jar:rs/class_142.class */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface class_142 {
    String a();

    String b();

    int c();

    boolean d() default false;
}

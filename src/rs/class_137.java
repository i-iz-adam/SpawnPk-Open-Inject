package rs;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: client-final.jar:rs/class_137.class */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface class_137 {
    int a() default -1;

    String b();

    String c();

    String d();

    boolean e() default false;

    String f() default "";

    boolean g() default false;

    String h() default "";
}

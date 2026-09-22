package rs.plugins;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: client-final.jar:rs/s/e.class */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface e {
    String a();

    String b() default "";

    String c() default "";

    String[] d() default {};

    String[] e() default {};

    boolean f() default true;

    boolean g() default false;

    boolean h() default false;

    boolean i() default false;

    boolean j() default true;

    boolean k() default false;

    boolean l() default false;
}

package rs;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: client-final.jar:rs/class_147.class */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface class_147 {
    public static final String a = "ms";
    public static final String b = " mins";
    public static final String c = "%";
    public static final String d = "px";
    public static final String e = "s";
    public static final String f = " ticks";

    String a();
}

package rs.p_e;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface C_q {
   String a = "ms";
   String b = " mins";
   String c = "%";
   String d = "px";
   String e = "s";
   String f = " ticks";

   String a();
}

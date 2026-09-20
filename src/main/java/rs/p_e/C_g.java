package rs.p_e;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface C_g {
   int a() default -1;

   String b();

   String c();

   String d();

   boolean e() default false;

   String f() default "";

   boolean g() default false;

   String h() default "";
}

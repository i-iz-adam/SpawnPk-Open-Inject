/*
 * Decompiled with CFR 0.152.
 */
package rs.p_e;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.METHOD})
public @interface C_g {
    public int a() default -1;

    public String b();

    public String c();

    public String d();

    public boolean e() default false;

    public String f() default "";

    public boolean g() default false;

    public String h() default "";
}


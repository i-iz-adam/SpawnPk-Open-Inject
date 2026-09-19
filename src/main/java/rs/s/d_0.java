/*
 * Decompiled with CFR 0.152.
 */
package rs.s;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import rs.s_0.a_0;
import rs.s_0.c_0;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
@Documented
@Repeatable(value=c.class)
public @interface d_0 {
    public Class<? extends a> a();
}


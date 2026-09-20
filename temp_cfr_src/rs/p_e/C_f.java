/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.c.c
 *  com.google.a.c.d
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.p_e;

import com.google.a.c.c;
import com.google.a.c.d;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.p_A_uc.C_q;
import rs.p_e.C_e;
import rs.p_e.C_g;
import rs.p_e.C_i;

class C_f
implements InvocationHandler {
    private static final Logger a = LoggerFactory.getLogger(C_f.class);
    private static final Object b = new Object();
    private final C_i c;
    private final c<Method, Object> d = com.google.a.c.d.a().a(256L).u();

    C_f(C_i c_i) {
        this.c = c_i;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] objectArray) {
        Object object2;
        Class<?> clazz;
        if (objectArray == null && (clazz = this.d.d((Object)method)) != null) {
            return clazz == b ? null : clazz;
        }
        clazz = object.getClass().getInterfaces()[0];
        if ("toString".equals(method.getName()) && objectArray == null) {
            return clazz.getSimpleName();
        }
        if ("hashCode".equals(method.getName()) && objectArray == null) {
            return System.identityHashCode(object);
        }
        if ("equals".equals(method.getName()) && objectArray != null && objectArray.length == 1) {
            return object == objectArray[0];
        }
        C_e c_e = clazz.getAnnotation(C_e.class);
        C_g c_g = method.getAnnotation(C_g.class);
        if (c_e == null) {
            a.warn("Configuration proxy class {} has no @ConfigGroup!", object.getClass());
            return null;
        }
        if (c_g == null) {
            a.warn("Configuration method {} has no @ConfigItem!", (Object)method);
            return null;
        }
        if (objectArray == null) {
            a.trace("cache miss (size: {}, group: {}, key: {})", new Object[]{this.d.b(), c_e.a(), c_g.b()});
            String string = this.c.a(c_e.a(), c_g.b());
            if (string == null) {
                if (method.isDefault()) {
                    Object object3 = C_f.a(object, method, null);
                    this.d.a((Object)method, object3 == null ? b : object3);
                    return object3;
                }
                this.d.a((Object)method, b);
                return null;
            }
            try {
                Object object4 = this.c.a(string, method.getGenericReturnType());
                this.d.a((Object)method, object4 == null ? b : object4);
                return object4;
            }
            catch (Exception exception) {
                a.warn("Unable to unmarshal {}.{} ", new Object[]{c_e.a(), c_g.b(), exception});
                if (method.isDefault()) {
                    return C_f.a(object, method, null);
                }
                return null;
            }
        }
        if (objectArray.length != 1) {
            throw new RuntimeException("Invalid number of arguments to configuration method");
        }
        Object object5 = objectArray[0];
        Class<?> clazz2 = method.getParameterTypes()[0];
        Object t = this.c.a(c_e.a(), c_g.b(), clazz2);
        if (Objects.equals(t, object5)) {
            return null;
        }
        if (method.isDefault() && Objects.equals(object5, object2 = C_f.a(object, method, objectArray))) {
            this.c.b(c_e.a(), c_g.b());
            return null;
        }
        if (object5 == null) {
            this.c.b(c_e.a(), c_g.b());
        } else {
            object2 = this.c.a(object5);
            this.c.b(c_e.a(), c_g.b(), (String)object2);
        }
        return null;
    }

    static Object a(Object object, Method method, Object[] objectArray) {
        Class<?> clazz = method.getDeclaringClass();
        return C_q.a(clazz).unreflectSpecial(method, clazz).bindTo(object).invokeWithArguments(objectArray);
    }

    void a() {
        a.trace("cache invalidate");
        this.d.c();
    }
}


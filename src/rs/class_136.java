package rs;

import com.google.a.c.c;
import com.google.a.c.d;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: client-final.jar:rs/class_136.class */
class class_136 implements InvocationHandler {
    private static final Logger a = LoggerFactory.getLogger((Class<?>) class_136.class);
    private static final Object b = new Object();
    private final class_139 c;
    private final c<Method, Object> d = d.a().a(256L).u();

    class_136(class_139 class_139Var) {
        this.c = class_139Var;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object objD;
        if (objArr == null && (objD = this.d.d(method)) != null) {
            if (objD == b) {
                return null;
            }
            return objD;
        }
        Class<?> cls = obj.getClass().getInterfaces()[0];
        if ("toString".equals(method.getName()) && objArr == null) {
            return cls.getSimpleName();
        }
        if ("hashCode".equals(method.getName()) && objArr == null) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if ("equals".equals(method.getName()) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        class_135 class_135Var = (class_135) cls.getAnnotation(class_135.class);
        class_137 class_137Var = (class_137) method.getAnnotation(class_137.class);
        if (class_135Var == null) {
            a.warn("Configuration proxy class {} has no @ConfigGroup!", obj.getClass());
            return null;
        }
        if (class_137Var == null) {
            a.warn("Configuration method {} has no @ConfigItem!", method);
            return null;
        }
        if (objArr != null) {
            if (objArr.length != 1) {
                throw new RuntimeException("Invalid number of arguments to configuration method");
            }
            Object obj2 = objArr[0];
            if (Objects.equals(this.c.a(class_135Var.a(), class_137Var.b(), (Type) method.getParameterTypes()[0]), obj2)) {
                return null;
            }
            if (method.isDefault() && Objects.equals(obj2, a(obj, method, objArr))) {
                this.c.b(class_135Var.a(), class_137Var.b());
                return null;
            }
            if (obj2 == null) {
                this.c.b(class_135Var.a(), class_137Var.b());
                return null;
            }
            this.c.b(class_135Var.a(), class_137Var.b(), this.c.a(obj2));
            return null;
        }
        a.trace("cache miss (size: {}, group: {}, key: {})", Long.valueOf(this.d.b()), class_135Var.a(), class_137Var.b());
        String strA = this.c.a(class_135Var.a(), class_137Var.b());
        if (strA == null) {
            if (!method.isDefault()) {
                this.d.a(method, b);
                return null;
            }
            Object objA = a(obj, method, null);
            this.d.a(method, objA == null ? b : objA);
            return objA;
        }
        try {
            Object objA2 = this.c.a(strA, method.getGenericReturnType());
            this.d.a(method, objA2 == null ? b : objA2);
            return objA2;
        } catch (Exception e) {
            a.warn("Unable to unmarshal {}.{} ", class_135Var.a(), class_137Var.b(), e);
            if (method.isDefault()) {
                return a(obj, method, null);
            }
            return null;
        }
    }

    static Object a(Object obj, Method method, Object[] objArr) {
        Class<?> declaringClass = method.getDeclaringClass();
        return class_19.a(declaringClass).unreflectSpecial(method, declaringClass).bindTo(obj).invokeWithArguments(objArr);
    }

    void a() {
        a.trace("cache invalidate");
        this.d.c();
    }
}

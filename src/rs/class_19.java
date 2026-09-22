package rs;

import com.google.inject.Injector;
import com.google.inject.Key;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: client-final.jar:rs/class_19.class */
public class class_19 {
    private static final Logger a = LoggerFactory.getLogger((Class<?>) class_19.class);
    private static Set<Class<?>> b = Collections.newSetFromMap(new WeakHashMap());

    public static MethodHandles.Lookup a(Class<?> cls) {
        try {
            return MethodHandles.privateLookupIn(cls, cls.getClassLoader() instanceof class_21 ? ((class_21) cls.getClassLoader()).a() : MethodHandles.lookup());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void a(class_21 class_21Var) {
        String name = class_20.class.getName();
        try {
            InputStream resourceAsStream = class_19.class.getResourceAsStream("/" + name.replace('.', '/') + ".class");
            try {
                byte[] bArrA = com.google.a.j.p.a(resourceAsStream);
                class_21Var.a(name, bArrA, 0, bArrA.length).getConstructor(new Class[0]).newInstance(new Object[0]);
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
            } catch (Throwable th) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException | ReflectiveOperationException e) {
            throw new RuntimeException("unable to install lookup helper", e);
        }
    }

    public static synchronized void a(Injector injector) {
        if (b == null) {
            return;
        }
        Iterator<Key<?>> it = injector.getAllBindings().keySet().iterator();
        while (it.hasNext()) {
            Class<? super Object> rawType = it.next().getTypeLiteral().getRawType();
            while (true) {
                Class<? super Object> cls = rawType;
                if (cls != null) {
                    b.add(cls);
                    rawType = cls.getSuperclass();
                }
            }
        }
    }

    public static synchronized void a() {
        try {
            for (Class<?> cls : b) {
                for (Method method : cls.getDeclaredMethods()) {
                    a(method, Executable.class);
                }
                for (Field field : cls.getDeclaredFields()) {
                    a(field, Field.class);
                }
                for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
                    a(constructor, Executable.class);
                }
            }
        } catch (Exception e) {
            a.debug((String) null, (Throwable) e);
        } finally {
            b.clear();
            b = null;
        }
    }

    private static void a(Object obj, Class<?> cls) throws NoSuchFieldException {
        if (obj == null) {
            return;
        }
        Field declaredField = cls.getDeclaredField("declaredAnnotations");
        declaredField.setAccessible(true);
        synchronized (obj) {
            Map map = (Map) declaredField.get(obj);
            if (map != null && map != Collections.emptyMap()) {
                declaredField.set(obj, null);
            }
        }
        Field declaredField2 = obj.getClass().getDeclaredField("root");
        declaredField2.setAccessible(true);
        a(declaredField2.get(obj), cls);
    }

    private class_19() {
    }
}

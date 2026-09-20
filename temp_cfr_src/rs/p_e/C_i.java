/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.a.b.as
 *  com.google.a.d.ag
 *  com.google.c.l
 *  javax.annotation.Nullable
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  lombok.NonNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package rs.p_e;

import com.google.a.b.as;
import com.google.a.d.ag;
import com.google.c.l;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.p_e.C_a;
import rs.p_e.C_b;
import rs.p_e.C_c;
import rs.p_e.C_d;
import rs.p_e.C_e;
import rs.p_e.C_f;
import rs.p_e.C_g;
import rs.p_e.C_h;
import rs.p_e.C_l;
import rs.p_e.C_m;
import rs.p_e.C_o;
import rs.p_e.C_q;
import rs.p_eventbus.C_EventBus_mc;
import rs.p_eventbus.C_Subscribe_mc;
import rs.p_runelite.p_events.C_ClientShutdown_mc;
import rs.p_runelite.p_events.C_ConfigChanged_mc;

@Singleton
public class C_i {
    private static final Logger a = LoggerFactory.getLogger(C_i.class);
    private final l b;
    private final C_EventBus_mc c;
    private final C_c d = new C_c(new File(rs.p_v.C_a.b() + File.separator + "config.properties"));
    private final C_f e = new C_f(this);

    @Inject
    public C_i(C_EventBus_mc c_EventBus_mc, l l2) {
        this.c = c_EventBus_mc;
        this.b = l2;
    }

    public void a() {
    }

    public <T extends C_b> T a(Class<T> clazz) {
        if (!Modifier.isPublic(clazz.getModifiers())) {
            throw new RuntimeException("Non-public configuration classes can't have default methods invoked");
        }
        C_b c_b = (C_b)Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, (InvocationHandler)this.e);
        return (T)c_b;
    }

    public String a(String string, String string2) {
        return this.d.a(C_i.a(string, null, string2));
    }

    public static String a(String string, String string2, String string3) {
        if (string2 == null) {
            return string + "." + string3;
        }
        return string + "." + string2 + "." + string3;
    }

    public <T extends C_b> void a(T t, boolean bl) {
        Class<?> clazz = t.getClass().getInterfaces()[0];
        C_e c_e = clazz.getAnnotation(C_e.class);
        if (c_e == null) {
            return;
        }
        for (Method method : clazz.getDeclaredMethods()) {
            Object object;
            C_g c_g = method.getAnnotation(C_g.class);
            if (c_g == null || method.getParameterCount() != 0) continue;
            if (!method.isDefault()) {
                if (!bl || (object = this.a(c_e.a(), c_g.b())) == null) continue;
                this.b(c_e.a(), c_g.b());
                continue;
            }
            if (!bl && (object = this.a(c_e.a(), c_g.b(), method.getGenericReturnType())) != null) continue;
            try {
                object = C_f.a(t, method, null);
            }
            catch (Throwable throwable) {
                a.warn(null, throwable);
                continue;
            }
            String string = this.a(c_e.a(), c_g.b());
            String string2 = this.a(object);
            if (Objects.equals(string, string2) || as.c((String)string) && as.c((String)string2)) continue;
            a.debug("Setting default configuration value for {}.{} to {}", new Object[]{c_e.a(), c_g.b(), object});
            this.b(c_e.a(), c_g.b(), string2);
        }
    }

    public List<String> a(String string) {
        return this.d.a().stream().filter(string2 -> string2.startsWith(string)).collect(Collectors.toList());
    }

    public <T> void a(String string, String string2, String string3, T t) {
        this.a(string, string2, string3, this.a(t));
    }

    public <T> void a(String string, String string2, T t) {
        this.a(string, null, string2, t);
    }

    public void b(String string, String string2, String string3) {
        this.a(this.d, string, null, string2, string3);
    }

    public void a(String string, String string2, String string3, @NonNull String string4) {
        if (string4 == null) {
            throw new NullPointerException("value is marked non-null but is null");
        }
        this.a(this.d, string, null, string3, string4);
    }

    private void a(C_c c_c, String string, String string2, String string3, @NonNull String string4) {
        if (string4 == null) {
            throw new NullPointerException("value is marked non-null but is null");
        }
        if (as.c((String)string) || as.c((String)string3) || string3.indexOf(58) != -1 || string3.startsWith("$")) {
            throw new IllegalArgumentException();
        }
        String string5 = C_i.a(string, string2, string3);
        String string6 = c_c.a(string5, string4);
        if (Objects.equals(string6, string4)) {
            return;
        }
        this.e.a();
        C_ConfigChanged_mc c_ConfigChanged_mc = new C_ConfigChanged_mc();
        c_ConfigChanged_mc.setGroup(string);
        c_ConfigChanged_mc.setProfile(string2);
        c_ConfigChanged_mc.setKey(string3);
        c_ConfigChanged_mc.setOldValue(string6);
        c_ConfigChanged_mc.setNewValue(string4);
        this.c.post(c_ConfigChanged_mc);
    }

    private void a(C_c c_c, String string, String string2, String string3) {
        String string4 = C_i.a(string, string2, string3);
        String string5 = c_c.b(string4);
        if (string5 == null) {
            return;
        }
        this.e.a();
        C_ConfigChanged_mc c_ConfigChanged_mc = new C_ConfigChanged_mc();
        c_ConfigChanged_mc.setGroup(string);
        c_ConfigChanged_mc.setProfile(string2);
        c_ConfigChanged_mc.setKey(string3);
        c_ConfigChanged_mc.setOldValue(string5);
        this.c.post(c_ConfigChanged_mc);
    }

    private String b(C_c c_c, String string, String string2, String string3) {
        return c_c.a(C_i.a(string, string2, string3));
    }

    public <T> T a(String string, String string2, Type type) {
        return this.a(string, (String)null, string2, type);
    }

    public String c(String string, String string2, String string3) {
        return this.b(this.d, string, null, string3);
    }

    public <T> T a(String string, String string2, String string3, Type type) {
        String string4 = this.c(string, string2, string3);
        if (!as.c((String)string4)) {
            try {
                return (T)this.a(string4, type);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }

    public void d(String string, String string2, String string3) {
        this.a(this.d, string, null, string3);
    }

    public void b(String string, String string2) {
        this.a(this.d, string, null, string2);
    }

    @C_Subscribe_mc(priority=-100.0f)
    private void onClientShutdown(C_ClientShutdown_mc c_ClientShutdown_mc) {
        this.b();
    }

    public void b() {
        this.a(this.d);
    }

    private void a(C_c c_c) {
        Map<String, String> map = c_c.c();
        if (map.isEmpty()) {
            return;
        }
        a.debug("Saving profile (patch size: {})", (Object)map.size());
        c_c.b(map);
    }

    Object a(String string, Type type) {
        ParameterizedType parameterizedType;
        if (type == Boolean.TYPE || type == Boolean.class) {
            return Boolean.parseBoolean(string);
        }
        if (type == Integer.TYPE || type == Integer.class) {
            return Integer.parseInt(string);
        }
        if (type == Long.TYPE || type == Long.class) {
            return Long.parseLong(string);
        }
        if (type == Double.TYPE || type == Double.class) {
            return Double.parseDouble(string);
        }
        if (type == Color.class) {
            return rs.p_A_uc.C_g.c(string);
        }
        if (type == Dimension.class) {
            String[] stringArray = string.split("x");
            int n = Integer.parseInt(stringArray[0]);
            int n2 = Integer.parseInt(stringArray[1]);
            return new Dimension(n, n2);
        }
        if (type == Point.class) {
            String[] stringArray = string.split(":");
            int n = Integer.parseInt(stringArray[0]);
            int n3 = Integer.parseInt(stringArray[1]);
            return new Point(n, n3);
        }
        if (type == Rectangle.class) {
            String[] stringArray = string.split(":");
            int n = Integer.parseInt(stringArray[0]);
            int n4 = Integer.parseInt(stringArray[1]);
            int n5 = Integer.parseInt(stringArray[2]);
            int n6 = Integer.parseInt(stringArray[3]);
            return new Rectangle(n, n4, n5, n6);
        }
        if (type instanceof Class && ((Class)type).isEnum()) {
            return Enum.valueOf((Class)type, string);
        }
        if (type == Instant.class) {
            return Instant.parse(string);
        }
        if (type == rs.p_s.p_b.C_l.class || type == rs.p_s.p_b.C_m.class) {
            String[] stringArray = string.split(":");
            int n = Integer.parseInt(stringArray[0]);
            int n7 = Integer.parseInt(stringArray[1]);
            if (type == rs.p_s.p_b.C_m.class) {
                return new rs.p_s.p_b.C_m(n, n7);
            }
            return new rs.p_s.p_b.C_l(n, n7);
        }
        if (type == Duration.class) {
            return Duration.ofMillis(Long.parseLong(string));
        }
        if (type == byte[].class) {
            return Base64.getUrlDecoder().decode(string);
        }
        if (type instanceof ParameterizedType && (parameterizedType = (ParameterizedType)type).getRawType() == Set.class) {
            return this.b.a(string, (Type)parameterizedType);
        }
        return string;
    }

    public C_d a(C_b c_b) {
        Class<?> clazz = c_b.getClass().getInterfaces()[0];
        C_e c_e = clazz.getAnnotation(C_e.class);
        if (c_e == null) {
            throw new IllegalArgumentException("Not a config group");
        }
        List<C_m> list = Arrays.stream(clazz.getDeclaredFields()).filter(field -> field.isAnnotationPresent(C_l.class) && field.getType() == String.class).map(field -> {
            try {
                return new C_m(String.valueOf(field.get(clazz)), field.getDeclaredAnnotation(C_l.class));
            }
            catch (IllegalAccessException illegalAccessException) {
                a.warn("Unable to load section {}::{}", (Object)clazz.getSimpleName(), (Object)field.getName());
                return null;
            }
        }).filter(Objects::nonNull).sorted((c_m, c_m2) -> ag.a().a(c_m.e().c(), c_m2.e().c()).a((Comparable)((Object)c_m.e().a()), (Comparable)((Object)c_m2.e().a())).b()).collect(Collectors.toList());
        List<C_h> list2 = Arrays.stream(clazz.getMethods()).filter(method -> method.getParameterCount() == 0 && method.isAnnotationPresent(C_g.class)).map(method -> new C_h(method.getDeclaredAnnotation(C_g.class), method.getGenericReturnType(), method.getDeclaredAnnotation(C_o.class), method.getDeclaredAnnotation(C_a.class), method.getDeclaredAnnotation(C_q.class))).sorted((c_h, c_h2) -> ag.a().a(c_h.d().a(), c_h2.d().a()).a((Comparable)((Object)c_h.d().c()), (Comparable)((Object)c_h2.d().c())).b()).collect(Collectors.toList());
        return new C_d(c_e, list, list2);
    }

    @Nullable
    String a(Object object) {
        if (object instanceof Color) {
            return String.valueOf(((Color)object).getRGB());
        }
        if (object instanceof Enum) {
            return ((Enum)object).name();
        }
        if (object instanceof Dimension) {
            Dimension dimension = (Dimension)object;
            return dimension.width + "x" + dimension.height;
        }
        if (object instanceof Point) {
            Point point = (Point)object;
            return point.x + ":" + point.y;
        }
        if (object instanceof Rectangle) {
            Rectangle rectangle = (Rectangle)object;
            return rectangle.x + ":" + rectangle.y + ":" + rectangle.width + ":" + rectangle.height;
        }
        if (object instanceof Instant) {
            return ((Instant)object).toString();
        }
        if (object instanceof rs.p_s.p_b.C_l) {
            rs.p_s.p_b.C_l c_l = (rs.p_s.p_b.C_l)object;
            return c_l.a() + ":" + c_l.b();
        }
        if (object instanceof Duration) {
            return Long.toString(((Duration)object).toMillis());
        }
        if (object instanceof byte[]) {
            return Base64.getUrlEncoder().encodeToString((byte[])object);
        }
        if (object instanceof Set) {
            return this.b.b(object, Set.class);
        }
        return object == null ? null : object.toString();
    }
}


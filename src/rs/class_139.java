package rs;

import com.google.a.b.as;
import com.google.a.d.ag;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.File;
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
import rs.eventbus.EventBus;
import rs.eventbus.Subscribe;
import rs.runelite.events.ClientShutdown;
import rs.runelite.events.ConfigChanged;
import rs.plugins.bpkg.m;

/* JADX INFO: loaded from: client-final.jar:rs/class_139.class */
@Singleton
public class class_139 {
    private static final Logger a = LoggerFactory.getLogger((Class<?>) class_139.class);
    private final com.google.c.l b;
    private final EventBus c;
    private final class_133 d = new class_133(new File(class_650.b() + File.separator + "config.properties"));
    private final class_136 e = new class_136(this);

    @Inject
    public class_139(EventBus eventBus, com.google.c.l lVar) {
        this.c = eventBus;
        this.b = lVar;
    }

    public void a() {
    }

    public <T extends class_132> T a(Class<T> cls) {
        if (Modifier.isPublic(cls.getModifiers())) {
            return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, this.e);
        }
        throw new RuntimeException("Non-public configuration classes can't have default methods invoked");
    }

    public String a(String str, String str2) {
        return this.d.a(a(str, (String) null, str2));
    }

    public static String a(String str, String str2, String str3) {
        return str2 == null ? str + "." + str3 : str + "." + str2 + "." + str3;
    }

    public <T extends class_132> void a(T t, boolean z) {
        Class<?> cls = t.getClass().getInterfaces()[0];
        class_135 class_135Var = (class_135) cls.getAnnotation(class_135.class);
        if (class_135Var == null) {
            return;
        }
        for (Method method : cls.getDeclaredMethods()) {
            class_137 class_137Var = (class_137) method.getAnnotation(class_137.class);
            if (class_137Var != null && method.getParameterCount() == 0) {
                if (method.isDefault()) {
                    if (z || a(class_135Var.a(), class_137Var.b(), method.getGenericReturnType()) == null) {
                        try {
                            Object objA = class_136.a(t, method, null);
                            String strA = a(class_135Var.a(), class_137Var.b());
                            String strA2 = a(objA);
                            if (!Objects.equals(strA, strA2) && (!as.c(strA) || !as.c(strA2))) {
                                a.debug("Setting default configuration value for {}.{} to {}", class_135Var.a(), class_137Var.b(), objA);
                                b(class_135Var.a(), class_137Var.b(), strA2);
                            }
                        } catch (Throwable th) {
                            a.warn((String) null, th);
                        }
                    }
                } else if (z && a(class_135Var.a(), class_137Var.b()) != null) {
                    b(class_135Var.a(), class_137Var.b());
                }
            }
        }
    }

    public List<String> a(String str) {
        return (List) this.d.a().stream().filter(str2 -> {
            return str2.startsWith(str);
        }).collect(Collectors.toList());
    }

    public <T> void a(String str, String str2, String str3, T t) {
        a(str, str2, str3, a(t));
    }

    public <T> void a(String str, String str2, T t) {
        a(str, (String) null, str2, t);
    }

    public void b(String str, String str2, String str3) {
        a(this.d, str, null, str2, str3);
    }

    public void a(String str, String str2, String str3, @NonNull String str4) {
        if (str4 == null) {
            throw new NullPointerException("value is marked non-null but is null");
        }
        a(this.d, str, null, str3, str4);
    }

    private void a(class_133 class_133Var, String str, String str2, String str3, @NonNull String str4) {
        if (str4 == null) {
            throw new NullPointerException("value is marked non-null but is null");
        }
        if (as.c(str) || as.c(str3) || str3.indexOf(58) != -1 || str3.startsWith("$")) {
            throw new IllegalArgumentException();
        }
        String strA = class_133Var.a(a(str, str2, str3), str4);
        if (Objects.equals(strA, str4)) {
            return;
        }
        this.e.a();
        ConfigChanged configChanged = new ConfigChanged();
        configChanged.setGroup(str);
        configChanged.setProfile(str2);
        configChanged.setKey(str3);
        configChanged.setOldValue(strA);
        configChanged.setNewValue(str4);
        this.c.post(configChanged);
    }

    private void a(class_133 class_133Var, String str, String str2, String str3) {
        String strB = class_133Var.b(a(str, str2, str3));
        if (strB == null) {
            return;
        }
        this.e.a();
        ConfigChanged configChanged = new ConfigChanged();
        configChanged.setGroup(str);
        configChanged.setProfile(str2);
        configChanged.setKey(str3);
        configChanged.setOldValue(strB);
        this.c.post(configChanged);
    }

    private String b(class_133 class_133Var, String str, String str2, String str3) {
        return class_133Var.a(a(str, str2, str3));
    }

    public <T> T a(String str, String str2, Type type) {
        return (T) a(str, (String) null, str2, type);
    }

    public String c(String str, String str2, String str3) {
        return b(this.d, str, null, str3);
    }

    public <T> T a(String str, String str2, String str3, Type type) {
        String strC = c(str, str2, str3);
        if (as.c(strC)) {
            return null;
        }
        try {
            return (T) a(strC, type);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void d(String str, String str2, String str3) {
        a(this.d, str, (String) null, str3);
    }

    public void b(String str, String str2) {
        a(this.d, str, (String) null, str2);
    }

    @Subscribe(priority = -100.0f)
    private void onClientShutdown(ClientShutdown clientShutdown) {
        b();
    }

    public void b() {
        a(this.d);
    }

    private void a(class_133 class_133Var) {
        Map<String, String> mapC = class_133Var.c();
        if (mapC.isEmpty()) {
            return;
        }
        a.debug("Saving profile (patch size: {})", Integer.valueOf(mapC.size()));
        class_133Var.b(mapC);
    }

    Object a(String str, Type type) {
        if (type == Boolean.TYPE || type == Boolean.class) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
        if (type == Integer.TYPE || type == Integer.class) {
            return Integer.valueOf(Integer.parseInt(str));
        }
        if (type == Long.TYPE || type == Long.class) {
            return Long.valueOf(Long.parseLong(str));
        }
        if (type == Double.TYPE || type == Double.class) {
            return Double.valueOf(Double.parseDouble(str));
        }
        if (type == Color.class) {
            return class_9.c(str);
        }
        if (type == Dimension.class) {
            String[] strArrSplit = str.split("x");
            return new Dimension(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]));
        }
        if (type == Point.class) {
            String[] strArrSplit2 = str.split(class_39.a);
            return new Point(Integer.parseInt(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1]));
        }
        if (type == Rectangle.class) {
            String[] strArrSplit3 = str.split(class_39.a);
            return new Rectangle(Integer.parseInt(strArrSplit3[0]), Integer.parseInt(strArrSplit3[1]), Integer.parseInt(strArrSplit3[2]), Integer.parseInt(strArrSplit3[3]));
        }
        if ((type instanceof Class) && ((Class) type).isEnum()) {
            return Enum.valueOf((Class) type, str);
        }
        if (type == Instant.class) {
            return Instant.parse(str);
        }
        if (type == rs.plugins.bpkg.l.class || type == m.class) {
            String[] strArrSplit4 = str.split(class_39.a);
            int i = Integer.parseInt(strArrSplit4[0]);
            int i2 = Integer.parseInt(strArrSplit4[1]);
            return type == m.class ? new m(i, i2) : new rs.plugins.bpkg.l(i, i2);
        }
        if (type == Duration.class) {
            return Duration.ofMillis(Long.parseLong(str));
        }
        if (type == byte[].class) {
            return Base64.getUrlDecoder().decode(str);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType.getRawType() == Set.class) {
                return this.b.a(str, (Type) parameterizedType);
            }
        }
        return str;
    }

    public class_134 a(class_132 class_132Var) {
        Class<?> cls = class_132Var.getClass().getInterfaces()[0];
        class_135 class_135Var = (class_135) cls.getAnnotation(class_135.class);
        if (class_135Var == null) {
            throw new IllegalArgumentException("Not a config group");
        }
        return new class_134(class_135Var, (List) Arrays.stream(cls.getDeclaredFields()).filter(field -> {
            return field.isAnnotationPresent(class_142.class) && field.getType() == String.class;
        }).map(field2 -> {
            try {
                return new class_143(String.valueOf(field2.get(cls)), (class_142) field2.getDeclaredAnnotation(class_142.class));
            } catch (IllegalAccessException e) {
                a.warn("Unable to load section {}::{}", cls.getSimpleName(), field2.getName());
                return null;
            }
        }).filter((v0) -> {
            return Objects.nonNull(v0);
        }).sorted((class_143Var, class_143Var2) -> {
            return ag.a().a(class_143Var.e().c(), class_143Var2.e().c()).a(class_143Var.e().a(), class_143Var2.e().a()).b();
        }).collect(Collectors.toList()), (List) Arrays.stream(cls.getMethods()).filter(method -> {
            return method.getParameterCount() == 0 && method.isAnnotationPresent(class_137.class);
        }).map(method2 -> {
            return new class_138((class_137) method2.getDeclaredAnnotation(class_137.class), method2.getGenericReturnType(), (class_145) method2.getDeclaredAnnotation(class_145.class), (class_131) method2.getDeclaredAnnotation(class_131.class), (class_147) method2.getDeclaredAnnotation(class_147.class));
        }).sorted((class_138Var, class_138Var2) -> {
            return ag.a().a(class_138Var.d().a(), class_138Var2.d().a()).a(class_138Var.d().c(), class_138Var2.d().c()).b();
        }).collect(Collectors.toList()));
    }

    @Nullable
    String a(Object obj) {
        if (obj instanceof Color) {
            return String.valueOf(((Color) obj).getRGB());
        }
        if (obj instanceof Enum) {
            return ((Enum) obj).name();
        }
        if (obj instanceof Dimension) {
            Dimension dimension = (Dimension) obj;
            return dimension.width + "x" + dimension.height;
        }
        if (obj instanceof Point) {
            Point point = (Point) obj;
            return point.x + ":" + point.y;
        }
        if (obj instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) obj;
            return rectangle.x + ":" + rectangle.y + ":" + rectangle.width + ":" + rectangle.height;
        }
        if (obj instanceof Instant) {
            return ((Instant) obj).toString();
        }
        if (obj instanceof rs.plugins.bpkg.l) {
            rs.plugins.bpkg.l lVar = (rs.plugins.bpkg.l) obj;
            return lVar.a() + ":" + lVar.b();
        }
        if (obj instanceof Duration) {
            return Long.toString(((Duration) obj).toMillis());
        }
        if (obj instanceof byte[]) {
            return Base64.getUrlEncoder().encodeToString((byte[]) obj);
        }
        if (obj instanceof Set) {
            return this.b.b(obj, Set.class);
        }
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }
}

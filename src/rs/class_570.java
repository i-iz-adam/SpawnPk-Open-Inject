package rs;

import com.google.inject.CreationException;
import com.google.inject.Injector;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import rs.ppkg.a;
import rs.plugins.t.i;

/* JADX INFO: loaded from: client-final.jar:rs/class_570.class */
public class class_570 {
    public static final Map<Integer, class_553> a = new HashMap();

    public static void a() {
        a(1, class_557.class);
        a(2, class_564.class);
        a(3, class_565.class);
        a(4, class_233.D.getClass());
        a(5, class_567.class);
        a(6, class_371.c.getClass());
        a(7, class_278.class);
        a(8, class_228.v.getClass());
        a(9, class_424.e.getClass());
        a(10, class_450.class);
        a(11, class_226.w.getClass());
        a(12, class_263.a.getClass());
        a(13, class_377.c.getClass());
        a(14, class_561.class);
        a(15, class_384.bG.getClass());
        a(16, class_404.c.getClass());
        a(17, class_406.g.getClass());
        a(18, class_247.w.getClass());
        a(19, class_569.class);
        a(20, class_575.b.getClass());
        a(21, class_556.class);
        a(22, class_452.bJ.getClass());
        a(23, class_272.class);
        a(24, class_299.class);
        a(25, class_231.s.getClass());
        a(26, class_236.p.getClass());
        a(27, class_295.class);
        a(28, class_361.c.getClass());
        a(29, class_566.class);
        a(30, i.b.getClass());
        a(31, class_461.class);
        a(32, class_554.class);
        a(33, class_390.e.getClass());
        a(34, class_558.class);
        a(35, class_434.f.getClass());
        a(36, class_440.d.getClass());
        a(37, class_559.class);
        a(38, class_568.class);
        a(39, class_560.class);
        a(40, class_555.class);
        a(41, class_466.class);
        a(42, class_562.class);
        a(43, class_563.class);
    }

    private static void a(Integer num, Class<? extends class_553> cls) {
        if (a.get(num) != null) {
            throw new RuntimeException("ScriptPacket ID " + num + " already in use!");
        }
        try {
            Injector injectorC = a.c();
            try {
                Constructor<? extends class_553> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                class_553 class_553VarNewInstance = declaredConstructor.newInstance(new Object[0]);
                class_553VarNewInstance.a = injectorC.createChildInjector(binder -> {
                    binder.bind(cls).toInstance(class_553VarNewInstance);
                    binder.install(class_553VarNewInstance);
                });
                a.put(num, class_553VarNewInstance);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        } catch (CreationException e) {
            throw new RuntimeException(e);
        }
    }

    public static void a(Client client, Buffer buffer, int i) {
        class_553 class_553Var = a.get(Integer.valueOf(i));
        if (class_553Var == null) {
            System.out.println("Could not find ScriptPacket ID " + i + "!");
            return;
        }
        class_553Var.a(buffer);
        class_553Var.a(client);
        class_553Var.a();
    }
}

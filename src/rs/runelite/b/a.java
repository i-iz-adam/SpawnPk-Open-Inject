package rs.runelite.b;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.inject.Singleton;
import rs.class_48;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/b/a.class */
@Singleton
public class a {
    private static final List<DrawCallback> a = new CopyOnWriteArrayList<>();
    private static final List<DrawCallback> b = new CopyOnWriteArrayList<>();

    /* JADX INFO: loaded from: client-final.jar:rs/runelite/b/a$a.class */
    @FunctionalInterface
    public interface DrawCallback {
        boolean draw(class_48 class_48Var, boolean z);
    }

    public static List<DrawCallback> a() {
        return a;
    }

    public static List<DrawCallback> b() {
        return b;
    }
}

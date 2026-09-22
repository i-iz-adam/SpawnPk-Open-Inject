package rs;

import java.util.HashMap;
import java.util.Map;
import rs.gui.Launcher;

/* JADX INFO: loaded from: client-final.jar:rs/class_186.class */
public class class_186 {
    private static final Map<Integer, class_167> a = new HashMap();
    private final int b;

    public class_186(int i) {
        this.b = i;
    }

    public static void a() {
        if (a.isEmpty()) {
            return;
        }
        a.clear();
    }

    public class_186 a(String str) {
        d().fx[this.b] = str;
        return this;
    }

    public class_186 a(class_167 class_167Var) {
        a.put(Integer.valueOf(this.b), class_167Var);
        return this;
    }

    private Client d() {
        return Launcher.n().o();
    }

    public static Map<Integer, class_167> b() {
        return a;
    }

    public int c() {
        return this.b;
    }
}

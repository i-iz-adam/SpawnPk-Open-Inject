package rs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: client-final.jar:rs/ClientThread.class */
public class ClientThread {
    private static final CopyOnWriteArrayList<class_167> a = new CopyOnWriteArrayList<>();
    private static final ConcurrentHashMap<String, class_167> b = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, class_169> c = new ConcurrentHashMap<>();

    public static void queue(class_167 class_167Var) {
        a.add(class_167Var);
    }

    public static void a(String str, class_167 class_167Var) {
        b.put(str, class_167Var);
    }

    public static void a(String str, class_169 class_169Var) {
        c.put(str, class_169Var);
    }

    public static boolean a(String str) {
        return c.containsKey(str);
    }

    public static void a() {
        if (!a.isEmpty()) {
            Iterator<class_167> it = a.iterator();
            while (it.hasNext()) {
                it.next().invoke();
            }
            a.clear();
        }
        if (!c.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (String str : c.keySet()) {
                if (!c.get(str).loop()) {
                    arrayList.add(str);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c.remove((String) it2.next());
            }
        }
        if (b.isEmpty()) {
            return;
        }
        Iterator<class_167> it3 = b.values().iterator();
        while (it3.hasNext()) {
            it3.next().invoke();
        }
        b.clear();
    }
}

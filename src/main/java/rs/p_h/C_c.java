package rs.p_h;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class C_c {
   private static final CopyOnWriteArrayList<C_b> a = new CopyOnWriteArrayList<>();
   private static final ConcurrentHashMap<String, C_b> b = new ConcurrentHashMap<>();
   private static final ConcurrentHashMap<String, C_e> c = new ConcurrentHashMap<>();

   public static void a(C_b var0) {
      a.add(var0);
   }

   public static void a(String var0, C_b var1) {
      b.put(var0, var1);
   }

   public static void a(String var0, C_e var1) {
      c.put(var0, var1);
   }

   public static boolean a(String var0) {
      return c.containsKey(var0);
   }

   public static void a() {
      if (!a.isEmpty()) {
         for (C_b var1 : a) {
            var1.invoke();
         }

         a.clear();
      }

      if (!c.isEmpty()) {
         ArrayList var4 = new ArrayList();

         for (String var2 : c.keySet()) {
            C_e var3 = c.get(var2);
            if (!var3.loop()) {
               var4.add(var2);
            }
         }

         for (String var9 : var4) {
            c.remove(var9);
         }
      }

      if (!b.isEmpty()) {
         for (C_b var8 : b.values()) {
            var8.invoke();
         }

         b.clear();
      }
   }
}

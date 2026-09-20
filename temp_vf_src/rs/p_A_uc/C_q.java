package rs.p_A_uc;

import com.google.a.j.p;
import com.google.inject.Injector;
import com.google.inject.Key;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class C_q {
   private static final Logger a = LoggerFactory.getLogger(C_q.class);
   private static Set<Class<?>> b = Collections.newSetFromMap(new WeakHashMap<>());

   public static Lookup a(Class<?> var0) {
      try {
         Lookup var1;
         if (var0.getClassLoader() instanceof C_q.b) {
            var1 = ((C_q.b)var0.getClassLoader()).a();
         } else {
            var1 = MethodHandles.lookup();
         }

         return MethodHandles.privateLookupIn(var0, var1);
      } catch (IllegalAccessException var2) {
         throw new RuntimeException(var2);
      }
   }

   public static void a(C_q.b var0) {
      String var1 = C_q.a.class.getName();

      try {
         InputStream var2 = C_q.class.getResourceAsStream("/" + var1.replace('.', '/') + ".class");

         try {
            byte[] var3 = p.a(var2);
            Class var4 = var0.a(var1, var3, 0, var3.length);
            var4.getConstructor().newInstance();
         } catch (Throwable var6) {
            if (var2 != null) {
               try {
                  var2.close();
               } catch (Throwable var5) {
                  var6.addSuppressed(var5);
               }
            }

            throw var6;
         }

         if (var2 != null) {
            var2.close();
         }
      } catch (ReflectiveOperationException | IOException var7) {
         throw new RuntimeException("unable to install lookup helper", var7);
      }
   }

   public static synchronized void a(Injector var0) {
      if (b != null) {
         for (Key var2 : var0.getAllBindings().keySet()) {
            for (Class var3 = var2.getTypeLiteral().getRawType(); var3 != null; var3 = var3.getSuperclass()) {
               b.add(var3);
            }
         }
      }
   }

   public static synchronized void a() {
      try {
         for (Class var1 : b) {
            for (Method var5 : var1.getDeclaredMethods()) {
               a(var5, Executable.class);
            }

            for (Field var17 : var1.getDeclaredFields()) {
               a(var17, Field.class);
            }

            for (Constructor var18 : var1.getDeclaredConstructors()) {
               a(var18, Executable.class);
            }
         }
      } catch (Exception var9) {
         a.debug(null, var9);
      } finally {
         b.clear();
         b = null;
      }
   }

   private static void a(Object var0, Class<?> var1) {
      if (var0 != null) {
         Field var2 = var1.getDeclaredField("declaredAnnotations");
         var2.setAccessible(true);
         synchronized (var0) {
            Map var4 = (Map)var2.get(var0);
            if (var4 != null && var4 != Collections.emptyMap()) {
               var2.set(var0, null);
            }
         }

         Field var3 = var0.getClass().getDeclaredField("root");
         var3.setAccessible(true);
         Object var7 = var3.get(var0);
         a(var7, var1);
      }
   }

   private C_q() {
   }

   public static class a {
      static {
         C_q.b var0 = (C_q.b)C_q.a.class.getClassLoader();
         var0.a(MethodHandles.lookup());
      }
   }

   public interface b {
      Class<?> a(String var1, byte[] var2, int var3, int var4);

      Lookup a();

      void a(Lookup var1);
   }
}

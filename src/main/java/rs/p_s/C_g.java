package rs.p_s;

import com.google.a.a.d;
import com.google.a.b.as;
import com.google.a.g.O;
import com.google.a.g.P;
import com.google.a.g.S;
import com.google.a.g.ag;
import com.google.a.n.b;
import com.google.a.n.b.a;
import com.google.inject.CreationException;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Module;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.swing.SwingUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rs.p_A_uc.C_q;
import rs.p_e.C_i;
import rs.p_eventbus.C_EventBus_mc;
import rs.p_runelite.p_events.C_PluginChanged_mc;

@Singleton
public class C_g {
   private static final Logger c = LoggerFactory.getLogger(C_g.class);
   private static final String d = C_g.class.getPackageName();
   private final boolean e;
   private final boolean f;
   private final C_EventBus_mc g;
   private final rs.p_y.C_c h;
   private final C_i i;
   private final List<C_a> j = new CopyOnWriteArrayList<>();
   private final List<C_a> k = new CopyOnWriteArrayList<>();
   boolean a;

   @Inject
   @d
   public C_g(@Named("developerMode") boolean var1, @Named("safeMode") boolean var2, C_EventBus_mc var3, rs.p_y.C_c var4, C_i var5) {
      this.e = var1;
      this.f = var2;
      this.g = var3;
      this.h = var4;
      this.i = var5;
   }

   private void d() {
      this.b(null);
      SwingUtilities.invokeLater(() -> {
         for (C_a var2 : this.c()) {
            try {
               if (this.d(var2) != this.k.contains(var2)) {
                  if (this.k.contains(var2)) {
                     this.c(var2);
                  } else {
                     this.b(var2);
                  }
               }
            } catch (C_f var4) {
               c.warn("Error during starting/stopping plugin {}", var2.getClass().getSimpleName(), var4);
            }
         }
      });
   }

   public rs.p_e.C_b a(C_a var1) {
      try {
         Injector var2 = var1.d();

         for (Key var4 : var2.getBindings().keySet()) {
            Class var5 = var4.getTypeLiteral().getRawType();
            if (rs.p_e.C_b.class.isAssignableFrom(var5)) {
               return (rs.p_e.C_b)var2.getInstance(var4);
            }
         }
      } catch (Throwable var6) {
         c.warn("Unable to get plugin config", var6);
      }

      return null;
   }

   public List<rs.p_e.C_b> a(Collection<C_a> var1) {
      ArrayList var2 = new ArrayList();
      if (var1 == null) {
         var2.add(rs.p_p.C_a.c());
         var1 = this.c();
      }

      var1.forEach(var1x -> var2.add(var1x.d()));
      ArrayList var3 = new ArrayList();

      for (Injector var5 : var2) {
         for (Key var7 : var5.getBindings().keySet()) {
            Class var8 = var7.getTypeLiteral().getRawType();
            if (rs.p_e.C_b.class.isAssignableFrom(var8)) {
               rs.p_e.C_b var9 = (rs.p_e.C_b)var5.getInstance(var7);
               var3.add(var9);
            }
         }
      }

      return var3;
   }

   public void b(Collection<C_a> var1) {
      try {
         for (rs.p_e.C_b var3 : this.a(var1)) {
            this.i.a(var3, false);
         }
      } catch (Throwable var4) {
         c.warn("Unable to reset plugin configuration", var4);
      }
   }

   public void a() {
      ArrayList var1 = new ArrayList<>(this.j);
      int var2 = 0;

      for (C_a var4 : var1) {
         try {
            SwingUtilities.invokeAndWait(() -> {
               try {
                  this.b(var4);
               } catch (C_f var3) {
                  c.warn("Unable to start plugin {}", var4.getClass().getSimpleName(), var3);
                  this.j.remove(var4);
               }
            });
         } catch (InvocationTargetException | InterruptedException var6) {
            throw new RuntimeException(var6);
         }

         var2++;
      }

      for (C_a var8 : this.j) {
         C_q.a(var8.a);
      }
   }

   public void b() {
      b var1 = com.google.a.n.b.a(this.getClass().getClassLoader());
      List var2 = var1.b(d).stream().map(a::d).collect(Collectors.toList());
      this.a(var2, null);
   }

   public List<C_a> a(List<Class<?>> var1, BiConsumer<Integer, Integer> var2) {
      ag var3 = P.a().c();

      for (Class var5 : var1) {
         C_e var6 = var5.getAnnotation(C_e.class);
         if (var6 == null) {
            if (var5.getSuperclass() == C_a.class) {
               c.warn("Class {} is a plugin, but has no plugin descriptor", var5);
            }
         } else if (var5.getSuperclass() != C_a.class) {
            c.warn("Class {} has plugin descriptor, but is not a plugin", var5);
         } else if ((var6.i() || !this.a) && (!var6.h() || this.e)) {
            if (this.f && !var6.j()) {
               c.debug("Disabling {} due to safe mode", var5);
               this.i.b(rs.p_f.C_a.A, (as.c(var6.b()) ? var5.getSimpleName() : var6.b()).toLowerCase());
            } else {
               var3.i(var5);
            }
         }
      }

      for (Class var14 : var3.c()) {
         C_d[] var16 = var14.getAnnotationsByType(C_d.class);

         for (C_d var10 : var16) {
            if (var3.c().contains(var10.a())) {
               var3.b(var10.a(), var14);
            }
         }
      }

      if (S.a(var3)) {
         throw new C_f("Plugin dependency graph contains a cycle!");
      } else {
         List var13 = a(var3);
         int var15 = 0;
         ArrayList var17 = new ArrayList();

         for (Class var19 : var13) {
            try {
               C_a var20 = this.a(this.j, var19);
               var17.add(var20);
               this.j.add(var20);
            } catch (C_f var11) {
               c.warn("Error instantiating plugin!", var11);
            }

            var15++;
            if (var2 != null) {
               var2.accept(var15, var13.size());
            }
         }

         return var17;
      }
   }

   public boolean b(C_a var1) {
      assert SwingUtilities.isEventDispatchThread();

      if (!this.k.contains(var1) && this.d(var1)) {
         for (C_a var4 : this.g(var1)) {
            if (this.d(var4)) {
               this.a(var4, false);
            }

            if (this.k.contains(var4)) {
               this.c(var4);
            }
         }

         this.k.add(var1);

         try {
            var1.a();
            c.debug("Plugin {} is now running", var1.getClass().getSimpleName());
            this.g.register(var1);
            this.h(var1);
            this.g.post(new C_PluginChanged_mc(var1, true));
            return true;
         } catch (Throwable var5) {
            throw new C_f(var5);
         }
      } else {
         return false;
      }
   }

   public boolean c(C_a var1) {
      assert SwingUtilities.isEventDispatchThread();

      if (!this.k.remove(var1)) {
         return false;
      } else {
         this.i(var1);
         this.g.unregister(var1);

         try {
            var1.b();
            c.debug("Plugin {} is now stopped", var1.getClass().getSimpleName());
            this.g.post(new C_PluginChanged_mc(var1, false));
            return true;
         } catch (Exception var3) {
            throw new C_f(var3);
         }
      }
   }

   public void a(C_a var1, boolean var2) {
      C_e var3 = var1.getClass().getAnnotation(C_e.class);
      String var4 = as.c(var3.b()) ? var1.getClass().getSimpleName() : var3.b();
      this.i.b(rs.p_f.C_a.A, var4.toLowerCase(), String.valueOf(var2));
      if (var2) {
         for (C_a var7 : this.g(var1)) {
            if (this.d(var7)) {
               this.a(var7, false);
            }
         }
      }
   }

   public boolean d(C_a var1) {
      C_e var2 = var1.getClass().getAnnotation(C_e.class);
      String var3 = as.c(var2.b()) ? var1.getClass().getSimpleName() : var2.b();
      String var4 = this.i.a(rs.p_f.C_a.A, var3.toLowerCase());
      return var4 != null ? Boolean.parseBoolean(var4) : var2.f();
   }

   private C_a a(List<C_a> var1, Class<C_a> var2) {
      C_d[] var3 = var2.getAnnotationsByType(C_d.class);
      ArrayList var4 = new ArrayList();

      for (C_d var8 : var3) {
         Optional var9 = var1.stream().filter(var1x -> var1x.getClass() == var8.a()).findFirst();
         if (!var9.isPresent()) {
            throw new C_f("Unmet dependency for " + var2.getSimpleName() + ": " + var8.a().getSimpleName());
         }

         var4.add((C_a)var9.get());
      }

      C_a var13;
      try {
         var13 = (C_a)var2.getDeclaredConstructor().newInstance();
      } catch (Throwable var11) {
         throw new C_f(var11);
      }

      try {
         Injector var14 = rs.p_p.C_a.c();
         if (var4.size() <= 1) {
            if (!var4.isEmpty()) {
               var14 = ((C_a)var4.get(0)).a;
            }
         } else {
            ArrayList var15 = new ArrayList(var4.size());

            for (C_a var19 : var4) {
               Module var10 = var1x -> {
                  var1x.bind(var19.getClass()).toInstance(var19);
                  var1x.install(var19);
               };
               var15.add(var10);
            }

            var14 = var14.createChildInjector(var15);
         }

         Module var16 = var2x -> {
            var2x.bind(var2).toInstance(var13);
            var2x.install(var13);
         };
         Injector var18 = var14.createChildInjector(new Module[]{var16});
         var13.a = var18;
      } catch (CreationException var12) {
         throw new C_f(var12);
      }

      c.debug("Loaded plugin {}", var2.getSimpleName());
      return var13;
   }

   public void e(C_a var1) {
      this.j.add(var1);
   }

   public void f(C_a var1) {
      this.j.remove(var1);
   }

   public Collection<C_a> c() {
      return this.j;
   }

   private void h(C_a var1) {
      for (Method var5 : var1.getClass().getMethods()) {
         rs.p_y.C_a var6 = var5.getAnnotation(rs.p_y.C_a.class);
         if (var6 != null) {
            Runnable var7 = null;

            try {
               Class var8 = var5.getDeclaringClass();
               Lookup var9 = C_q.a(var8);
               MethodType var10 = MethodType.methodType(var5.getReturnType(), var5.getParameterTypes());
               MethodHandle var11 = var9.findVirtual(var8, var5.getName(), var10);
               CallSite var12 = LambdaMetafactory.metafactory(var9, "run", MethodType.methodType(Runnable.class, var8), var10, var11, var10);
               MethodHandle var13 = var12.getTarget();
               var7 = (Runnable)var13.bindTo(var1).invokeExact();
            } catch (Throwable var14) {
               c.warn("Unable to create lambda for method {}", var5, var14);
            }

            rs.p_y.C_b var15 = new rs.p_y.C_b(var6, var5, var1, var7);
            c.debug("Scheduled task {}", var15);
            this.h.a(var15);
         }
      }
   }

   private void i(C_a var1) {
      for (rs.p_y.C_b var4 : new ArrayList<>(this.h.a())) {
         if (var4.c() == var1) {
            c.debug("Removing scheduled task {}", var4);
            this.h.b(var4);
         }
      }
   }

   @d
   static <T> List<T> a(O<T> var0) {
      ag var1 = S.d(var0);
      ArrayList var2 = new ArrayList();
      Set var3 = var1.c().stream().filter(var1x -> var1.b(var1x) == 0).collect(Collectors.toSet());

      while (!var3.isEmpty()) {
         Iterator var4 = var3.iterator();
         Object var5 = var4.next();
         var4.remove();
         var2.add(var5);

         for (Object var7 : new HashSet(var1.f(var5))) {
            var1.c(var5, var7);
            if (var1.b(var7) == 0) {
               var3.add(var7);
            }
         }
      }

      if (!var1.b().isEmpty()) {
         throw new RuntimeException("Graph has at least one cycle");
      } else {
         return var2;
      }
   }

   public List<C_a> g(C_a var1) {
      C_e var3 = var1.getClass().getAnnotation(C_e.class);
      HashSet var2 = new HashSet<>(Arrays.asList(var3.e()));
      var2.add(var3.a());
      return this.j.stream().filter(var2x -> {
         if (var2x == var1) {
            return false;
         } else {
            C_e var3x = var2x.getClass().getAnnotation(C_e.class);
            if (var2.contains(var3x.a())) {
               return true;
            } else {
               for (String var7 : var3x.e()) {
                  if (var2.contains(var7)) {
                     return true;
                  }
               }

               return false;
            }
         }
      }).collect(Collectors.toList());
   }

   public void a(boolean var1) {
      this.a = var1;
   }
}

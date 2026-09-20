package rs.p_eventbus;

import com.google.a.b.V;
import com.google.a.d.cv;
import com.google.a.d.db;
import com.google.a.d.hW;
import com.google.a.d.cv.a;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.function.Consumer;
import javax.annotation.Nonnull;
import javax.annotation.concurrent.ThreadSafe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import rs.p_A_uc.C_q;

@ThreadSafe
public class C_EventBus_mc {
   private static final Logger log = LoggerFactory.getLogger(C_EventBus_mc.class);
   private static final Marker DEDUPLICATE = MarkerFactory.getMarker("DEDUPLICATE");
   private final Consumer<Throwable> exceptionHandler;
   @Nonnull
   private cv<Class<?>, C_EventBus_mc.Subscriber> subscribers = cv.f();

   public C_EventBus_mc() {
      this(var0 -> log.warn(DEDUPLICATE, "Uncaught exception in event subscriber", var0));
   }

   public synchronized void register(@Nonnull Object var1) {
      a var2 = cv.x();
      var2.b(this.subscribers);
      var2.c(Comparator.comparingDouble(C_EventBus_mc.Subscriber::getPriority).reversed().thenComparing(var0 -> var0.object.getClass().getName()));

      for (Class var3 = var1.getClass(); var3 != null; var3 = var3.getSuperclass()) {
         for (Method var7 : var3.getDeclaredMethods()) {
            C_Subscribe_mc var8 = var7.getAnnotation(C_Subscribe_mc.class);
            if (var8 != null) {
               V.a(var7.getReturnType() == void.class, "@Subscribed method \"" + var7 + "\" cannot return a value");
               V.a(var7.getParameterCount() == 1, "@Subscribed method \"" + var7 + "\" must take exactly 1 argument");
               V.a(!Modifier.isStatic(var7.getModifiers()), "@Subscribed method \"" + var7 + "\" cannot be static");
               Class var9 = var7.getParameterTypes()[0];
               V.a(!var9.isPrimitive(), "@Subscribed method \"" + var7 + "\" cannot subscribe to primitives");
               V.a((var9.getModifiers() & 1536) == 0, "@Subscribed method \"" + var7 + "\" cannot subscribe to polymorphic classes");

               for (Class var10 = var9.getSuperclass(); var10 != null; var10 = var10.getSuperclass()) {
                  if (this.subscribers.f(var10)) {
                     throw new IllegalArgumentException(
                        "@Subscribed method \"" + var7 + "\" cannot subscribe to class which inherits from subscribed class \"" + var10 + "\""
                     );
                  }
               }

               String var18 = "on" + var9.getSimpleName();
               V.a(var7.getName().equals(var18), "Subscribed method " + var7 + " should be named " + var18);
               var7.setAccessible(true);
               Consumer var11 = null;

               try {
                  Lookup var12 = C_q.a(var3);
                  MethodType var13 = MethodType.methodType(void.class, var9);
                  MethodHandle var14 = var12.findVirtual(var3, var7.getName(), var13);
                  CallSite var15 = LambdaMetafactory.metafactory(
                     var12, "accept", MethodType.methodType(Consumer.class, var3), var13.changeParameterType(0, Object.class), var14, var13
                  );
                  MethodHandle var16 = var15.getTarget();
                  var11 = (Consumer)var16.bindTo(var1).invokeExact();
               } catch (Throwable var17) {
                  log.warn("Unable to create lambda for method {}", var7, var17);
               }

               C_EventBus_mc.Subscriber var19 = new C_EventBus_mc.Subscriber(var1, var7, var8.priority(), var11);
               var2.b(var9, var19);
               log.debug("Registering {} - {}", var9, var19);
            }
         }
      }

      this.subscribers = var2.b();
   }

   public synchronized <T> C_EventBus_mc.Subscriber register(Class<T> var1, Consumer<T> var2, float var3) {
      a var4 = cv.x();
      var4.b(this.subscribers);
      var4.c(Comparator.comparingDouble(C_EventBus_mc.Subscriber::getPriority).reversed().thenComparing(var0 -> var0.object.getClass().getName()));
      C_EventBus_mc.Subscriber var5 = new C_EventBus_mc.Subscriber(var2, null, var3, (Consumer<Object>)(Object)var2);
      var4.b(var1, var5);
      this.subscribers = var4.b();
      return var5;
   }

   public synchronized void unregister(@Nonnull Object var1) {
      this.subscribers = cv.b(db.c(this.subscribers.B(), var1x -> ((C_EventBus_mc.Subscriber)var1x.getValue()).getObject() != var1));
   }

   public synchronized void unregister(C_EventBus_mc.Subscriber var1) {
      if (var1 != null) {
         this.subscribers = cv.b(db.c(this.subscribers.B(), var1x -> var1 != var1x.getValue()));
      }
   }

   public void post(@Nonnull Object var1) {
      hW var2 = this.subscribers.i(var1.getClass()).e_();

      while (var2.hasNext()) {
         C_EventBus_mc.Subscriber var3 = (C_EventBus_mc.Subscriber)var2.next();

         try {
            var3.invoke(var1);
         } catch (Exception var5) {
            this.exceptionHandler.accept(var5);
         }
      }
   }

   public C_EventBus_mc(Consumer<Throwable> var1) {
      this.exceptionHandler = var1;
   }

   public static final class Subscriber {
      private final Object object;
      private final Method method;
      private final float priority;
      private final Consumer<Object> lambda;

      void invoke(Object var1) {
         if (this.lambda != null) {
            this.lambda.accept(var1);
         } else {
            this.method.invoke(this.object, var1);
         }
      }

      public Subscriber(Object var1, Method var2, float var3, Consumer<Object> var4) {
         this.object = var1;
         this.method = var2;
         this.priority = var3;
         this.lambda = var4;
      }

      public Object getObject() {
         return this.object;
      }

      public Method getMethod() {
         return this.method;
      }

      public float getPriority() {
         return this.priority;
      }

      public Consumer<Object> getLambda() {
         return this.lambda;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof C_EventBus_mc.Subscriber)) {
            return false;
         } else {
            C_EventBus_mc.Subscriber var2 = (C_EventBus_mc.Subscriber)var1;
            if (Float.compare(this.getPriority(), var2.getPriority()) != 0) {
               return false;
            } else {
               Object var3 = this.getObject();
               Object var4 = var2.getObject();
               if (var3 == null ? var4 == null : var3.equals(var4)) {
                  Method var5 = this.getMethod();
                  Method var6 = var2.getMethod();
                  return var5 == null ? var6 == null : var5.equals(var6);
               } else {
                  return false;
               }
            }
         }
      }

      @Override
      public int hashCode() {
         byte var1 = 59;
         int var2 = 1;
         var2 = var2 * 59 + Float.floatToIntBits(this.getPriority());
         Object var3 = this.getObject();
         var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
         Method var4 = this.getMethod();
         return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      }

      @Override
      public String toString() {
         return "EventBus.Subscriber(object="
            + this.getObject()
            + ", method="
            + this.getMethod()
            + ", priority="
            + this.getPriority()
            + ", lambda="
            + this.getLambda()
            + ")";
      }
   }
}

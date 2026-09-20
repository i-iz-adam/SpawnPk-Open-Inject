package rs.p_y;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class C_c {
   private static final Logger b = LoggerFactory.getLogger(C_c.class);
   private final List<C_b> c = new CopyOnWriteArrayList<>();
   @Inject
   ScheduledExecutorService a;

   public void a(C_b var1) {
      this.c.add(var1);
   }

   public void b(C_b var1) {
      this.c.remove(var1);
   }

   public List<C_b> a() {
      return Collections.unmodifiableList(this.c);
   }

   public void b() {
      Instant var1 = Instant.now();

      for (C_b var3 : this.c) {
         Instant var4 = var3.e();
         Duration var5 = Duration.between(var4, var1);
         C_a var6 = var3.a();
         Duration var7 = Duration.of(var6.a(), var6.b());
         if (var5.compareTo(var7) > 0) {
            b.trace("Scheduled task triggered: {}", var3);
            var3.a(var1);
            if (var6.c()) {
               this.a.submit(() -> this.c(var3));
            } else {
               this.c(var3);
            }
         }
      }
   }

   private void c(C_b var1) {
      try {
         Runnable var2 = var1.d();
         if (var2 != null) {
            var2.run();
         } else {
            Method var3 = var1.b();
            var3.invoke(var1.c());
         }
      } catch (IllegalArgumentException | InvocationTargetException | IllegalAccessException var4) {
         b.warn("error invoking scheduled task", var4);
      } catch (Exception var5) {
         b.warn("error during scheduled task", var5);
      }
   }
}

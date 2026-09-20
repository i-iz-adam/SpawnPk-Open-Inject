package rs.p_A_uc;

import java.util.concurrent.Callable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class C_e<V> implements Callable<V> {
   private static final Logger a = LoggerFactory.getLogger(C_e.class);
   private final Callable<V> b;

   @Override
   public V call() {
      try {
         return this.b.call();
      } catch (Throwable var2) {
         a.error("Uncaught exception in callable {}", this.b, var2);
         throw var2;
      }
   }

   public static <V> C_e<V> a(Callable<V> var0) {
      return new C_e<>(var0);
   }

   public C_e(Callable<V> var1) {
      this.b = var1;
   }
}

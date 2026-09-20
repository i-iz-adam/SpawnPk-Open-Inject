package rs.p_A_uc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class C_r implements Runnable {
   private static final Logger a = LoggerFactory.getLogger(C_r.class);
   private final Runnable b;

   @Override
   public void run() {
      try {
         this.b.run();
      } catch (Throwable var2) {
         a.error("Uncaught exception in runnable {}", this.b, var2);
         throw var2;
      }
   }

   public static C_r a(Runnable var0) {
      return new C_r(var0);
   }

   public C_r(Runnable var1) {
      this.b = var1;
   }
}

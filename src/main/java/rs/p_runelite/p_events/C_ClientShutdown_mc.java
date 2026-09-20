package rs.p_runelite.p_events;

import java.time.Duration;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class C_ClientShutdown_mc {
   private static final Logger log = LoggerFactory.getLogger(C_ClientShutdown_mc.class);
   private final Queue<Future<?>> tasks = new ConcurrentLinkedQueue<>();

   public void waitFor(Future<?> var1) {
      this.tasks.add(var1);
   }

   public void waitForAllConsumers(Duration var1) {
      long var2 = System.nanoTime() + var1.toNanos();

      Future var4;
      while ((var4 = this.tasks.poll()) != null) {
         long var5 = var2 - System.nanoTime();
         if (var5 < 0L) {
            log.warn("Timed out waiting for task completion");
            return;
         }

         try {
            var4.get(var5, TimeUnit.NANOSECONDS);
         } catch (ThreadDeath var8) {
            throw var8;
         } catch (Throwable var9) {
            log.warn("Error during shutdown: ", var9);
         }
      }
   }

   public Queue<Future<?>> getTasks() {
      return this.tasks;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof C_ClientShutdown_mc)) {
         return false;
      } else {
         C_ClientShutdown_mc var2 = (C_ClientShutdown_mc)var1;
         Queue var3 = this.getTasks();
         Queue var4 = var2.getTasks();
         return var3 == null ? var4 == null : var3.equals(var4);
      }
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      byte var2 = 1;
      Queue var3 = this.getTasks();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   @Override
   public String toString() {
      return "ClientShutdown(tasks=" + this.getTasks() + ")";
   }
}

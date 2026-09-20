package rs.p_A_uc;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class C_h implements ScheduledExecutorService {
   private final ScheduledExecutorService a;

   private static Runnable a(Runnable var0) {
      return C_r.a(var0);
   }

   private static <V> Callable<V> a(Callable<V> var0) {
      return C_e.a(var0);
   }

   @Override
   public <T> Future<T> submit(Callable<T> var1) {
      return this.a.submit(a(var1));
   }

   @Override
   public <T> Future<T> submit(Runnable var1, T var2) {
      return this.a.submit(a(var1), (T)var2);
   }

   @Override
   public Future<?> submit(Runnable var1) {
      return this.a.submit(a(var1));
   }

   @Override
   public void execute(Runnable var1) {
      this.a.execute(a(var1));
   }

   @Override
   public void shutdown() {
      this.a.shutdown();
   }

   @Override
   public List<Runnable> shutdownNow() {
      return this.a.shutdownNow();
   }

   @Override
   public boolean isShutdown() {
      return this.a.isShutdown();
   }

   @Override
   public boolean isTerminated() {
      return this.a.isTerminated();
   }

   @Override
   public boolean awaitTermination(long var1, TimeUnit var3) {
      return this.a.awaitTermination(var1, var3);
   }

   @Override
   public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> var1) {
      return this.a.invokeAll(var1);
   }

   @Override
   public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> var1, long var2, TimeUnit var4) {
      return this.a.invokeAll(var1, var2, var4);
   }

   @Override
   public <T> T invokeAny(Collection<? extends Callable<T>> var1) {
      return this.a.invokeAny(var1);
   }

   @Override
   public <T> T invokeAny(Collection<? extends Callable<T>> var1, long var2, TimeUnit var4) {
      return this.a.invokeAny(var1, var2, var4);
   }

   @Override
   public ScheduledFuture<?> schedule(Runnable var1, long var2, TimeUnit var4) {
      return this.a.schedule(var1, var2, var4);
   }

   @Override
   public <V> ScheduledFuture<V> schedule(Callable<V> var1, long var2, TimeUnit var4) {
      return this.a.schedule(var1, var2, var4);
   }

   @Override
   public ScheduledFuture<?> scheduleAtFixedRate(Runnable var1, long var2, long var4, TimeUnit var6) {
      return this.a.scheduleAtFixedRate(var1, var2, var4, var6);
   }

   @Override
   public ScheduledFuture<?> scheduleWithFixedDelay(Runnable var1, long var2, long var4, TimeUnit var6) {
      return this.a.scheduleWithFixedDelay(var1, var2, var4, var6);
   }

   public C_h(ScheduledExecutorService var1) {
      this.a = var1;
   }
}

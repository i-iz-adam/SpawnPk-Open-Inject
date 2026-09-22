package rs;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: client-final.jar:rs/class_10.class */
public class class_10 implements ScheduledExecutorService {
    private final ScheduledExecutorService a;

    private static Runnable a(Runnable runnable) {
        return class_22.a(runnable);
    }

    private static <V> Callable<V> a(Callable<V> callable) {
        return class_7.a(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.a.submit(a(callable));
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.a.submit(a(runnable), t);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.a.submit(a(runnable));
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.a.execute(a(runnable));
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return (T) this.a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.a.schedule(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return this.a.schedule(callable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.a.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.a.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    public class_10(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }
}

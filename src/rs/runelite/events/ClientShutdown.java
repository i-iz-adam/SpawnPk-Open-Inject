package rs.runelite.events;

import java.time.Duration;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: client-final.jar:rs/runelite/events/ClientShutdown.class */
public final class ClientShutdown {
    private static final Logger log = LoggerFactory.getLogger((Class<?>) ClientShutdown.class);
    private final Queue<Future<?>> tasks = new ConcurrentLinkedQueue();

    public void waitFor(Future<?> future) {
        this.tasks.add(future);
    }

    public void waitForAllConsumers(Duration duration) {
        long jNanoTime = System.nanoTime() + duration.toNanos();
        while (true) {
            Future<?> futurePoll = this.tasks.poll();
            if (futurePoll == null) {
                return;
            }
            long jNanoTime2 = jNanoTime - System.nanoTime();
            if (jNanoTime2 < 0) {
                log.warn("Timed out waiting for task completion");
                return;
            }
            try {
                futurePoll.get(jNanoTime2, TimeUnit.NANOSECONDS);
            } catch (ThreadDeath e) {
                throw e;
            } catch (Throwable th) {
                log.warn("Error during shutdown: ", th);
            }
        }
    }

    public Queue<Future<?>> getTasks() {
        return this.tasks;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientShutdown)) {
            return false;
        }
        Queue<Future<?>> tasks = getTasks();
        Queue<Future<?>> tasks2 = ((ClientShutdown) obj).getTasks();
        if (tasks == null) {
            return tasks2 == null;
        }
        return tasks.equals(tasks2);
    }

    public int hashCode() {
        Queue<Future<?>> tasks = getTasks();
        return (1 * 59) + (tasks == null ? 43 : tasks.hashCode());
    }

    public String toString() {
        return "ClientShutdown(tasks=" + String.valueOf(getTasks()) + ")";
    }
}

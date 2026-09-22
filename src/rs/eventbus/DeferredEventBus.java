package rs.eventbus;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.inject.Inject;
import javax.inject.Singleton;

/* JADX INFO: loaded from: client-final.jar:rs/eventbus/DeferredEventBus.class */
@Singleton
public class DeferredEventBus extends EventBus {
    private final EventBus eventBus;
    private final Queue<Object> pendingEvents = new ConcurrentLinkedQueue();

    @Inject
    private DeferredEventBus(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Override // rs.eventbus.EventBus
    public void register(Object obj) {
        this.eventBus.register(obj);
    }

    @Override // rs.eventbus.EventBus
    public void unregister(Object obj) {
        this.eventBus.unregister(obj);
    }

    @Override // rs.eventbus.EventBus
    public void post(Object obj) {
        this.pendingEvents.add(obj);
    }

    public void replay() {
        int size = this.pendingEvents.size();
        while (true) {
            int i = size;
            size--;
            if (i <= 0) {
                return;
            }
            this.eventBus.post(this.pendingEvents.poll());
        }
    }
}

package rs.p_eventbus;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class C_DeferredEventBus_mc extends C_EventBus_mc {
   private final C_EventBus_mc eventBus;
   private final Queue<Object> pendingEvents = new ConcurrentLinkedQueue<>();

   @Inject
   private C_DeferredEventBus_mc(C_EventBus_mc var1) {
      this.eventBus = var1;
   }

   @Override
   public void register(Object var1) {
      this.eventBus.register(var1);
   }

   @Override
   public void unregister(Object var1) {
      this.eventBus.unregister(var1);
   }

   @Override
   public void post(Object var1) {
      this.pendingEvents.add(var1);
   }

   public void replay() {
      int var1 = this.pendingEvents.size();

      while (var1-- > 0) {
         Object var2 = this.pendingEvents.poll();
         this.eventBus.post(var2);
      }
   }
}

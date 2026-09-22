package rs.ui;

import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import rs.eventbus.EventBus;
import rs.runelite.events.NavigationButtonAdded;
import rs.runelite.events.NavigationButtonRemoved;

/* JADX INFO: loaded from: client-final.jar:rs/ui/e.class */
@Singleton
public class e {
    private final EventBus a;
    private final Set<l> b = new HashSet();

    @Inject
    private e(EventBus eventBus) {
        this.a = eventBus;
    }

    public void a(l lVar) {
        if (!this.b.contains(lVar) && this.b.add(lVar)) {
            this.a.post(new NavigationButtonAdded(lVar));
        }
    }

    public void b(l lVar) {
        if (this.b.remove(lVar)) {
            this.a.post(new NavigationButtonRemoved(lVar));
        }
    }
}

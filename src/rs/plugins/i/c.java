package rs.plugins.i;

import com.google.inject.Inject;
import com.google.inject.Provides;
import rs.class_139;
import rs.class_313;
import rs.eventbus.Subscribe;
import rs.runelite.events.EntityInteraction;
import rs.runelite.events.ObjectInteraction;
import rs.plugins.e;

/* JADX INFO: loaded from: client-final.jar:rs/s/i/c.class */
@e(a = "Interact Highlight", b = "interacthighlight", c = "Outlines npcs and objects you interact with or hover over", f = false)
public class c extends rs.plugins.a {

    @Inject
    private b b;

    @Provides
    a a(class_139 class_139Var) {
        return (a) class_139Var.a(a.class);
    }

    @Override // rs.s.a
    protected void a() {
        class_313.d().a(this.b);
    }

    @Override // rs.s.a
    protected void b() {
        this.b.l();
        class_313.d().b(this.b);
    }

    @Subscribe
    private void onEntityInteraction(EntityInteraction entityInteraction) {
        this.b.a(entityInteraction);
    }

    @Subscribe
    private void onObjectInteraction(ObjectInteraction objectInteraction) {
        this.b.a(objectInteraction);
    }
}
